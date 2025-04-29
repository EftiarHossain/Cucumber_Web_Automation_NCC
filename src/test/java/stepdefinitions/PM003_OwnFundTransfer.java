package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PG003_DashboardOR;
import objectRepository.PG004_FundTransfer;
import utils.Base;
import utils.MailosaurOTP;
import utils.Operations;

public class PM003_OwnFundTransfer extends Base {

    @When("I navigate to the Own Account Fund Transfer")
    public void iNavigateToTheOwnAccountFundTransfer() {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.navBarFundTransfer, driver);
        Operations.click(PG004_FundTransfer.navBarFundTransfer, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.navBarOwnFundTransfer, driver);
        Operations.click(PG004_FundTransfer.navBarOwnFundTransfer, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.fundTransferTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.continueWithFavourite, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.ownAccountSearchField, driver);
    }

    @Then("I can see my Account list to transfer money")
    public void iCanSeeMyAccountListToTransferMoney() {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.ownAccountListFirstAccount, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.ownAccountListFirstAccount, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.ownAccountListSecondAccount, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.ownAccountListSecondAccount, driver);
    }

    @Then("I select an Account to transfer money")
    public void iSelectAnAccountToTransferMoney() {
        Operations.click(PG004_FundTransfer.ownAccountListSecondAccount, driver);
    }

    @Then("I navigated to the transfer details screen with a selected from account and available balance populated")
    public void iNavigatedToTheTransferDetailsScreen() {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.transferDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsScreenTitle, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.ownTransferDetailsToAccount, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.ownTransferDetailsToAccount, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.ownTransferDetailsAvailableBalance, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.ownTransferDetailsAvailableBalance, driver);
    }

    @Then("I input transfer amount {string} below my available balance and remarks and confirm next to continue")
    public void iInputTransferAmountAndRemarksToContinue(String transferAmount) {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.ownTransferDetailsAvailableBalance, driver);
        Operations.waitUntilElementIsClickable(PG004_FundTransfer.transferDetailsTransferAmount, driver);
        Operations.click(PG004_FundTransfer.transferDetailsTransferAmount, driver);
        Operations.sendText(PG004_FundTransfer.transferDetailsTransferAmount,transferAmount, driver);
        Operations.sendText(PG004_FundTransfer.transferDetailsRemarks,"AutomatedTest", driver);
        Operations.waitUntilElementIsClickable(PG004_FundTransfer.transferDetailsNextButton, driver);
        Operations.click(PG004_FundTransfer.transferDetailsNextButton, driver);
    }

    @Then("I can see transaction details screen, select OTP channel, accept the terms and confirm next to continue by OTP verification")
    public void iCanSeeTransactionScreenVerifyOTP() throws Exception {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.fundTransferReviewPageTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.fundTransferReviewPageTitle, driver);
        Operations.click(PG004_FundTransfer.fundTransferAuthenticationTypeEmail, driver);
        Operations.click(PG004_FundTransfer.fundTransferSendOtpButton, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.fundTransferOTPInput, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.fundTransferOTPInput, driver);
        Thread.sleep(20000);
        String OTP = MailosaurOTP.getOTP();
        System.out.println("OTP: " + OTP);
        Operations.sendText(PG004_FundTransfer.fundTransferOTPInput,OTP, driver);
        Operations.waitUntilElementIsClickable(PG004_FundTransfer.fundTransferTransferBtn, driver);
        Operations.click(PG004_FundTransfer.fundTransferTransferBtn, driver);
    }

    @Then("I can see transaction confirmation screen with success or fail status and the details of the transactions")
    public void iCanSeeTransactionConfirmationScreen() {
        Operations.waitForPageToLoad(driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.fundTransferGoToHome, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.fundTransferGoToHome, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.fundTransferDownloadReceipt, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.fundTransferAddToFavourite, driver);
    }

    @Then("I can download the transaction receipt")
    public void iCanDownloadTransactionReceipt() throws InterruptedException {
        Operations.verifyElementIsPresent(PG004_FundTransfer.fundTransferDownloadReceipt, driver);
        Operations.sleep(8000);
        Operations.click(PG004_FundTransfer.fundTransferDownloadReceipt, driver);
        Operations.sleep(5000);
    }

    @Then("I can add the transaction to favourite {string}")
    public void iCanAddTransactionToFavourite(String favName) {
        Operations.verifyElementIsPresent(PG004_FundTransfer.fundTransferAddToFavourite, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.fundTransferAddToFavourite, driver);
        Operations.click(PG004_FundTransfer.fundTransferAddToFavourite, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.fundTransferAddFavouriteTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.fundTransferAddFavouriteInputField, driver);
        int ranNum = Operations.createRandomIntBetween(1,100);
        Operations.sendText(PG004_FundTransfer.fundTransferAddFavouriteInputField,favName+ranNum, driver);
        Operations.click(PG004_FundTransfer.fundTransferAddFavouriteSaveButton, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.fundTransferAddFavouriteToast, driver);
//        Operations.matchTextContains(PG004_FundTransfer.fundTransferAddFavouriteToast,"Success!\n" +
//                "Added to favourite successfully.", driver);

    }

    @Then("I can navigate to home clicking Go To Home")
    public void iCanNavigateToHome() {
        Operations.verifyElementIsPresent(PG004_FundTransfer.fundTransferGoToHome, driver);
        Operations.click(PG004_FundTransfer.fundTransferGoToHome, driver);
        Operations.waitUntilElementIsVisible(PG003_DashboardOR.dashboardAccountTabConventional, driver);
        Operations.waitUntilElementIsVisible(PG003_DashboardOR.dashboardAccountTabConventional, driver);
    }


}
