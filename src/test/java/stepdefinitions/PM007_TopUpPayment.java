package stepdefinitions;

import io.cucumber.java.en.Then;
import objectRepository.PG004_FundTransfer;
import objectRepository.PG005_TopUpPayment;
import utils.Base;
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

    @Then("I click on Continue Without Beneficiary and select operator to Transfer Money via TopUp")
    public void iClickOnContinueWithoutBeneficiary() throws InterruptedException {
        Operations.waitUntilElementIsVisible(PG005_TopUpPayment.topUpTitle, driver);
        Operations.click(PG005_TopUpPayment.continueWithoutBeneficiaryBtn, driver);
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
    public void iFilledTransferDetailsScreen(String accountNumber, String amount){
        Operations.verifyElementIsPresent(PG005_TopUpPayment.topUpPaymentDetailsToAccountField, driver);
        Operations.click(PG005_TopUpPayment.topUpPaymentDetailsToAccountField, driver);
        Operations.sendText(PG005_TopUpPayment.topUpPaymentDetailsToAccountField, accountNumber, driver);
        Operations.verifyElementIsPresent(PG005_TopUpPayment.transferDetailsTransferAmount, driver);
        Operations.click(PG005_TopUpPayment.transferDetailsTransferAmount, driver);
        Operations.sendText(PG005_TopUpPayment.transferDetailsTransferAmount, amount, driver);
        Operations.verifyElementIsPresent(PG005_TopUpPayment.connectionTypeField, driver);
        Operations.click(PG005_TopUpPayment.connectionTypeField, driver);
        Operations.click(PG005_TopUpPayment.connectionTypePrepaid, driver);
        Operations.sendText(PG005_TopUpPayment.transferDetailsRemarks,"AutomatedTest", driver);
        Operations.waitUntilElementIsClickable(PG005_TopUpPayment.transferDetailsNextButton, driver);
        Operations.click(PG005_TopUpPayment.transferDetailsNextButton, driver);
    }

    @Then("I can see transaction details screen for Topup, select OTP channel, accept the terms and click confirm to continue by OTP verification {string}")
    public void iCanSeeTransactionScreenVerifyOTPTopup(String OTP) throws InterruptedException {
        Operations.waitUntilElementIsVisible(PG005_TopUpPayment.topUpReviewPageTitle, driver);
        Operations.verifyElementIsPresent(PG005_TopUpPayment.topUpReviewPageTitle, driver);
        Operations.click(PG005_TopUpPayment.fundTransferAuthenticationTypeSMS, driver);
        Operations.click(PG005_TopUpPayment.fundTransferTermsAndConditionCheckbox, driver);
        Operations.click(PG005_TopUpPayment.transferDetailsNextButton, driver);
        Operations.waitUntilElementIsVisible(PG005_TopUpPayment.fundTransferOTPInput, driver);
        Operations.verifyElementIsPresent(PG005_TopUpPayment.fundTransferOTPInput, driver);
        Operations.sendText(PG005_TopUpPayment.fundTransferOTPInput,OTP, driver);
        Operations.sleep(3000);
        Operations.waitUntilElementIsClickable(PG005_TopUpPayment.topUpOTPInputNext, driver);
        Operations.click(PG005_TopUpPayment.topUpOTPInputNext, driver);
    }

}
