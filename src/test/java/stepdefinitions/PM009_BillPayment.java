package stepdefinitions;

import io.cucumber.java.en.Then;
import objectRepository.PG011_Payments;
import utils.Base;
import utils.Operations;

public class PM009_BillPayment extends Base {

    @Then("I navigate to the Bill Payment")
    public void iNavigateToTheBillPayment() {
        Operations.waitUntilElementIsVisible(PG011_Payments.navBarBillPayment, driver);
        Operations.click(PG011_Payments.navBarBillPayment, driver);
        Operations.waitUntilElementIsVisible(PG011_Payments.billPaymentTitle, driver);
        Operations.verifyElementIsPresent(PG011_Payments.billPaymentTitle, driver);
    }

    @Then("I navigated to the Metlife bill payment details screen for bill payment and input Policy Name {string}, Policy Number {string}, Select purpose of payment, Input Payment Amount {string}, Input Remarks {string} and click on the Next to navigate review page")
    public void iNavigatedToTheTransferDetailsScreenMetlife(String policyName, String policyNumber, String paymentAmount, String remarks) {
        Operations.verifyElementIsPresent(PG011_Payments.billPaymentTitle, driver);
        Operations.verifyElementIsPresent(PG011_Payments.insuranceBillPaymentSelection, driver);
        Operations.click(PG011_Payments.insuranceBillPaymentSelection, driver);
        Operations.waitUntilElementIsVisible(PG011_Payments.selectMetlife, driver);
        Operations.verifyElementIsPresent(PG011_Payments.selectMetlife, driver);
        Operations.click(PG011_Payments.selectMetlife, driver);
        Operations.waitUntilElementIsVisible(PG011_Payments.metlifeDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG011_Payments.metlifeDetailsScreenTitle, driver);

        Operations.verifyElementIsPresent(PG011_Payments.enterPolicyHolderName, driver);
        Operations.click(PG011_Payments.enterPolicyHolderName, driver);
        Operations.sendText(PG011_Payments.enterPolicyHolderName,policyName, driver);

        Operations.verifyElementIsPresent(PG011_Payments.enterPolicyNumber, driver);
        Operations.click(PG011_Payments.enterPolicyNumber, driver);
        Operations.sendText(PG011_Payments.enterPolicyNumber,policyNumber, driver);

        Operations.verifyElementIsPresent(PG011_Payments.selectPurposeOfPayment, driver);
        Operations.click(PG011_Payments.selectPurposeOfPayment, driver);
        Operations.waitUntilElementIsVisible(PG011_Payments.selectedPremium, driver);
        Operations.click(PG011_Payments.selectedPremium, driver);

        Operations.verifyElementIsPresent(PG011_Payments.enterTransferAmount, driver);
        Operations.click(PG011_Payments.enterTransferAmount, driver);
        Operations.sendText(PG011_Payments.enterTransferAmount,paymentAmount, driver);

        Operations.verifyElementIsPresent(PG011_Payments.enterRemarks, driver);
        Operations.click(PG011_Payments.enterRemarks, driver);
        Operations.sendText(PG011_Payments.enterRemarks, remarks, driver);

        Operations.waitUntilElementIsClickable(PG011_Payments.verifyButton, driver);
        Operations.click(PG011_Payments.verifyButton, driver);
    }

    @Then("I can see Bill Payment details on the review page with selected from account and available balance click on the confirm and select OTP channel, accept terms and condition and click on Send OTP for 2fa Verification by {string}")
    public void iFilledTransferDetailsScreen(String OTP) throws InterruptedException {
        Operations.verifyElementIsPresent(PG011_Payments.transferDetailsPageTitle, driver);
        Operations.verifyElementIsPresent(PG011_Payments.billDetailsPageTitle, driver);
        Operations.verifyElementIsPresent(PG011_Payments.transferDetailsNextBtn, driver);
        Operations.click(PG011_Payments.transferDetailsNextBtn, driver);

        Operations.verifyElementIsPresent(PG011_Payments.paymentAuthenticationTypeSMS, driver);
        Operations.click(PG011_Payments.paymentAuthenticationTypeSMS, driver);
        Operations.click(PG011_Payments.paymentTermsAndConditionCheckbox, driver);
        Operations.waitUntilElementIsClickable(PG011_Payments.paymentConfirmSendOTPButton, driver);
        Operations.click(PG011_Payments.paymentConfirmSendOTPButton, driver);
        Operations.waitUntilElementIsVisible(PG011_Payments.paymentOTPInput, driver);
        Operations.verifyElementIsPresent(PG011_Payments.paymentOTPInput, driver);
        Operations.sendText(PG011_Payments.paymentOTPInput,OTP, driver);
        Operations.sleep(3000);
        Operations.waitUntilElementIsClickable(PG011_Payments.paymentOTPInputPay, driver);
        Operations.click(PG011_Payments.paymentOTPInputPay, driver);

    }

}
