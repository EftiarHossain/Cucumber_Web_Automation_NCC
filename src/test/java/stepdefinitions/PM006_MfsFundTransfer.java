package stepdefinitions;

import io.cucumber.java.en.Then;
import objectRepository.PG004_FundTransfer;
import utils.Base;
import utils.Operations;

public class PM006_MfsFundTransfer extends Base {

    @Then("I navigate to the MFS Fund Transfer")
    public void iNavigateToTheMFSAccountFundTransfer() {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.navBarMFSFundTransfer, driver);
        Operations.click(PG004_FundTransfer.navBarMFSFundTransfer, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.mfsTransferTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.continueWithFavourite, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.beneficiarySearchField, driver);
    }

    @Then("I click on Continue Without Beneficiary to Transfer Money via MFS")
    public void iClickOnContinueWithoutBeneficiary() throws InterruptedException {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.mfsTransferTitle, driver);
        Operations.waitForPageToLoad(driver);
        Operations.sleep(5000);
        Operations.click(PG004_FundTransfer.oneTimePayBtn, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.transferDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsScreenTitle, driver);
    }

    @Then("I navigated to the transfer details screen for MFS bKash FT with a selected from account and available balance populated")
    public void iNavigatedToTheTransferDetailsScreenMFSFT() {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.transferDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsScreenTitle, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.mfsBkashToAccountInputField, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.mfsBkashToAccountInputField, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.mfsTransferDetailsAvailableBalance, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.mfsTransferDetailsAvailableBalance, driver);
    }

    @Then("I input To Account Number {string} for bkash, transfer amount {string} below my available balance and remarks and confirm next to continue")
    public void iFilledTransferDetailsScreen(String accountNumber, String amount) throws InterruptedException {
        Operations.verifyElementIsPresent(PG004_FundTransfer.mfsBkashToAccountInputField, driver);
        Operations.click(PG004_FundTransfer.mfsBkashToAccountInputField, driver);
        Operations.sendText(PG004_FundTransfer.mfsBkashToAccountInputField, accountNumber, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsTransferAmount, driver);
        Operations.click(PG004_FundTransfer.transferDetailsTransferAmount, driver);
        Operations.sleep(3000);
        Operations.sendText(PG004_FundTransfer.transferDetailsTransferAmount, amount, driver);
        Operations.sendText(PG004_FundTransfer.transferDetailsRemarks,"AutomatedTest", driver);
        Operations.waitUntilElementIsClickable(PG004_FundTransfer.transferDetailsNextButton, driver);
        Operations.click(PG004_FundTransfer.transferDetailsNextButton, driver);
    }

    @Then("I can see transaction details screen for MFS, select OTP channel, accept the terms and click confirm to continue by OTP verification {string}")
    public void iCanSeeTransactionScreenVerifyOTPMFS(String OTP) throws InterruptedException {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.fundTransferReviewPageTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.fundTransferReviewPageTitle, driver);
        Operations.click(PG004_FundTransfer.fundTransferAuthenticationTypeSMS, driver);
        Operations.click(PG004_FundTransfer.fundTransferTermsAndConditionCheckbox, driver);
        Operations.click(PG004_FundTransfer.mFSTransferDetailsConfirmButton, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.fundTransferOTPInput, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.fundTransferOTPInput, driver);
        Operations.sendText(PG004_FundTransfer.fundTransferOTPInput,OTP, driver);
        Operations.sleep(3000);
        Operations.waitUntilElementIsClickable(PG004_FundTransfer.mFSFundTransferOTPInputNext, driver);
        Operations.click(PG004_FundTransfer.mFSFundTransferOTPInputNext, driver);
    }

}
