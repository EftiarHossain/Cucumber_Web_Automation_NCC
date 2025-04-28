package stepdefinitions;

import io.cucumber.java.en.Then;
import objectRepository.PG003_DashboardOR;
import objectRepository.PG004_FundTransfer;
import objectRepository.PG005_TopUpPayment;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.Base;
import utils.MailosaurOTP;
import utils.Operations;

public class PM007_TopUpPayment extends Base {

    @Then("I navigate to the TopUp Payment")
    public void iNavigateToTheTopupPayment() {
        Operations.waitUntilElementIsVisible(PG005_TopUpPayment.navBarTopUp, driver);
        Operations.click(PG005_TopUpPayment.navBarTopUp, driver);
        Operations.waitUntilElementIsVisible(PG005_TopUpPayment.topUpTitle, driver);
        Operations.verifyElementIsPresent(PG005_TopUpPayment.topUpTitle, driver);
        Operations.verifyElementIsPresent(PG005_TopUpPayment.continueWithFavourite, driver);
        Operations.verifyElementIsPresent(PG005_TopUpPayment.searchField, driver);
    }

    @Then("I click on One Time Pay and select operator to TopUp")
    public void iClickOnOneTimePay() throws InterruptedException {
        Operations.waitUntilElementIsVisible(PG005_TopUpPayment.topUpTitle, driver);
        Operations.click(PG005_TopUpPayment.oneTimePayBtn, driver);
        Operations.waitUntilElementIsVisible(PG005_TopUpPayment.selectOperatorTitle, driver);
        Operations.verifyElementIsPresent(PG005_TopUpPayment.selectOperatorGP, driver);
        Operations.click(PG005_TopUpPayment.selectOperatorGP, driver);
        Operations.waitUntilElementIsVisible(PG005_TopUpPayment.topUpDetailsScreenTitle, driver);
    }

    @Then("I navigated to the transfer details screen for Topup with a selected from account and available balance populated")
    public void iNavigatedToTheTransferDetailsScreenTopup() {
        Operations.waitUntilElementIsVisible(PG005_TopUpPayment.topUpDetailsScreenTitle, driver);
        Operations.waitUntilElementIsVisible(PG005_TopUpPayment.topUpDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG005_TopUpPayment.topUpPaymentDetailsAvailableBalance, driver);
    }

    @Then("I input To Account Number {string} for topup, transfer amount {string} below my available balance, select connection type and remarks and confirm next to continue")
    public void iFilledTransferDetailsScreen(String accountNumber, String amount) throws InterruptedException {
        Operations.verifyElementIsPresent(PG005_TopUpPayment.topUpPaymentDetailsToAccountField, driver);
        Operations.click(PG005_TopUpPayment.topUpPaymentDetailsToAccountField, driver);
        Operations.sendText(PG005_TopUpPayment.topUpPaymentDetailsToAccountField, accountNumber, driver);
        Operations.scrollIntoElement(PG005_TopUpPayment.connectionTypeField, driver);
        Operations.click(PG005_TopUpPayment.connectionTypeField, driver);
        Operations.waitUntilElementIsVisible(PG005_TopUpPayment.connectionTypePrepaid,driver);
        Operations.click(PG005_TopUpPayment.connectionTypePrepaid, driver);
        Operations.verifyElementIsPresent(PG005_TopUpPayment.transferDetailsTransferAmount, driver);
        Operations.click(PG005_TopUpPayment.transferDetailsTransferAmount, driver);
        Operations.sendText(PG005_TopUpPayment.transferDetailsTransferAmount, amount, driver);
        Operations.sendText(PG005_TopUpPayment.transferDetailsRemarks,"AutomatedTest", driver);
        Operations.waitUntilElementIsClickable(PG005_TopUpPayment.transferDetailsNextButton, driver);
        Operations.click(PG005_TopUpPayment.transferDetailsNextButton, driver);
    }

    @Then("I can see transaction details screen for Topup, select OTP channel and continue by OTP verification")
    public void iCanSeeTransactionScreenVerifyOTPTopup() throws Exception {
        Operations.waitUntilElementIsVisible(PG005_TopUpPayment.topUpReviewPageTitle, driver);
        Operations.verifyElementIsPresent(PG005_TopUpPayment.topUpReviewPageTitle, driver);
        Operations.click(PG005_TopUpPayment.fundTransferAuthenticationTypeEmail, driver);
        Operations.click(PG005_TopUpPayment.sendOtpButton, driver);
        Operations.waitUntilElementIsVisible(PG005_TopUpPayment.fundTransferOTPInput, driver);
        Operations.verifyElementIsPresent(PG005_TopUpPayment.fundTransferOTPInput, driver);
        Thread.sleep(20000);
        String OTP = MailosaurOTP.getOTP();
        System.out.println("OTP: " + OTP);
        Operations.sendText(PG005_TopUpPayment.fundTransferOTPInput,OTP, driver);
        Operations.sleep(3000);
        Operations.waitUntilElementIsClickable(PG005_TopUpPayment.rechargeButton, driver);
        Operations.click(PG005_TopUpPayment.rechargeButton, driver);
    }
    @Then("I can see transaction confirmation screen with success or fail status and the details of the transactions for topup")
    public void iCanSeeTransactionConfirmationScreen() {
        Operations.waitForPageToLoad(driver);
        Operations.waitUntilElementIsVisible(PG005_TopUpPayment.topupGoToHome, driver);
        Operations.verifyElementIsPresent(PG005_TopUpPayment.topupGoToHome, driver);
        Operations.verifyElementIsPresent(PG005_TopUpPayment.topupDownloadReceipt, driver);
        Operations.verifyElementIsPresent(PG005_TopUpPayment.topupAddToFavourite, driver);
    }

    @Then("I can download the transaction receipt for topup")
    public void iCanDownloadTransactionReceipt() throws InterruptedException {
        Operations.verifyElementIsPresent(PG005_TopUpPayment.topupDownloadReceipt, driver);
        Operations.sleep(8000);
        Operations.click(PG005_TopUpPayment.topupDownloadReceipt, driver);
    }

    @Then("I can add the transaction to favourite {string} for topup")
    public void iCanAddTransactionToFavourite(String favName) {
        Operations.verifyElementIsPresent(PG005_TopUpPayment.topupAddToFavourite, driver);
        Operations.click(PG005_TopUpPayment.topupAddToFavourite, driver);
        Operations.waitUntilElementIsVisible(PG005_TopUpPayment.topupAddFavouriteTitle, driver);
        Operations.verifyElementIsPresent(PG005_TopUpPayment.topupAddFavouriteSubTitle, driver);
        int ranNum = Operations.createRandomIntBetween(1,100);
        Operations.sendText(PG005_TopUpPayment.topupAddFavouriteInputField,favName+ranNum, driver);
        Operations.click(PG005_TopUpPayment.topupAddFavouriteSaveButton, driver);
        Operations.verifyElementIsPresent(PG005_TopUpPayment.topupAddFavouriteToast, driver);
//        Operations.matchTextContains(PG004_FundTransfer.fundTransferAddFavouriteToast,"Success!\n" +
//                "Added to favourite successfully.", driver);

    }

    @Then("I can navigate to home clicking Go To Home from topup succes page")
    public void iCanNavigateToHome() {
        Operations.verifyElementIsPresent(PG005_TopUpPayment.topupGoToHome, driver);
        Operations.click(PG005_TopUpPayment.topupGoToHome, driver);
        Operations.waitUntilElementIsVisible(PG003_DashboardOR.dashboardAccountTabConventional, driver);
        Operations.waitUntilElementIsVisible(PG003_DashboardOR.dashboardAccountTabConventional, driver);
    }

}
