package stepdefinitions;

import io.cucumber.java.en.Then;
import objectRepository.PG003_DashboardOR;
import objectRepository.PG004_FundTransfer;
import objectRepository.PG008_MfsFundTransferOR;
import org.openqa.selenium.WebElement;
import utils.MailosaurOTP;
import utils.Operations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Base;
import utils.MfsElementMapper;

//import static stepdefinitions.Hooks.driver;

public class PM006_MfsFundTransfer extends Base {

    @Then("I click on MFS fund transfer")
    public void iClickOnMFSFundTransfer() {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.navBarFundTransfer, driver);
        Operations.click(PG004_FundTransfer.navBarFundTransfer, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.navBarMFSFundTransfer, driver);
        Operations.click(PG004_FundTransfer.navBarMFSFundTransfer, driver);
        Operations.waitUntilElementIsVisible(PG008_MfsFundTransferOR.mfsTransferTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.continueWithFavourite, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.beneficiarySearchField, driver);
    }

    @Then("I click on One Time Pay to Transfer Money via MFS {string}")
    public void iClickOnOneTimePay(String mfsType) throws InterruptedException {
        Operations.waitUntilElementIsVisible(PG008_MfsFundTransferOR.mfsTransferTitle, driver);
        Operations.waitForPageToLoad(driver);
        Operations.sleep(2000);

        MfsElementMapper.MfsConfig config = MfsElementMapper.getConfig(mfsType);
        Operations.click(config.selectionButton, driver);

        Operations.click(PG004_FundTransfer.oneTimePayBtn, driver);

        Operations.waitUntilElementIsVisible(config.transferDetailsTitle, driver);
        Operations.verifyElementIsPresent(config.transferDetailsTitle, driver);
    }

    @Then("I select From Account Number {string}, input To Account Number {string} for {string}, transfer amount {string} below my available balance and remarks and confirm next to continue")
    public void iFilledTransferDetailsScreen(String fromAccount, String toAccount, String mfsType, String amount) throws InterruptedException {
        MfsElementMapper.MfsConfig config = MfsElementMapper.getConfig(mfsType);

        Operations.waitUntilElementIsClickable(PG008_MfsFundTransferOR.mfsTransferFromAccountDropdown, driver);
        Operations.click(PG008_MfsFundTransferOR.mfsTransferFromAccountDropdown, driver);
        By fromAccountXpath = By.xpath("//span[contains(text(),'" + fromAccount + "')]");
        Operations.click(fromAccountXpath, driver);
        Thread.sleep(2000);

        Operations.verifyElementIsPresent(config.toAccountInput, driver);
        Operations.click(config.toAccountInput, driver);
        Operations.sendText(config.toAccountInput, toAccount, driver);

        Operations.verifyElementIsPresent(PG008_MfsFundTransferOR.tapAccountNameInputField, driver);
        Operations.click(PG008_MfsFundTransferOR.tapAccountNameInputField, driver);
        Thread.sleep(5000);
        WebElement inputField = Operations.findElement(PG008_MfsFundTransferOR.tapAccountNameInputField, driver);
        String currentText = inputField.getAttribute("value");
        String isReadonly = inputField.getAttribute("readonly");

        if ((currentText == null || currentText.trim().isEmpty()) && (isReadonly == null || isReadonly.isEmpty())) {
            Operations.sendText(PG008_MfsFundTransferOR.tapAccountNameInputField, "Faisal", driver);
        } else {
            System.out.println("To Account Name field is already filled or read-only. Skipping input.");
        }

        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsTransferAmount, driver);
        Operations.click(PG004_FundTransfer.transferDetailsTransferAmount, driver);
        Thread.sleep(3000);
        Operations.sendText(PG004_FundTransfer.transferDetailsTransferAmount, amount, driver);

        Operations.sendText(PG004_FundTransfer.transferDetailsRemarks, "AutomatedTest", driver);
        Thread.sleep(2000);

        Operations.waitUntilElementIsClickable(PG004_FundTransfer.transferDetailsNextButton, driver);
        Operations.click(PG004_FundTransfer.transferDetailsNextButton, driver);
    }
    @Then("I can see transaction details screen for {string}, select OTP channel, accept the terms and confirm next to continue by OTP verification")
    public void iCanSeeTransactionScreenVerifyOTP(String mfsType) throws Exception {
        MfsElementMapper.MfsConfig config = MfsElementMapper.getConfig(mfsType);

        Operations.waitUntilElementIsVisible(config.transferReviewTitle, driver);
        Operations.verifyElementIsPresent(config.transferReviewTitle, driver);
        Operations.click(PG004_FundTransfer.fundTransferAuthenticationTypeEmail, driver);
        Operations.click(PG008_MfsFundTransferOR.mfsTransferSendOtpButton, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.fundTransferOTPInput, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.fundTransferOTPInput, driver);
        Thread.sleep(20000);
        String OTP = MailosaurOTP.getOTP();
        System.out.println("OTP: " + OTP);
        Operations.sendText(PG004_FundTransfer.fundTransferOTPInput,OTP, driver);
        Operations.waitUntilElementIsClickable(PG008_MfsFundTransferOR.mFSFundTransferOTPInputNext, driver);
        Operations.click(PG008_MfsFundTransferOR.mFSFundTransferOTPInputNext, driver);
        Thread.sleep(3000);
    }
}
