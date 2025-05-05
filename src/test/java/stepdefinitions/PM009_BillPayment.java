package stepdefinitions;

import io.cucumber.java.en.Then;
import objectRepository.PG011_BillPayment;
import utils.Base;
import utils.Operations;

public class PM009_BillPayment extends Base {

    @Then("I navigate to the Bill Payment")
    public void iNavigateToTheBillPayment() {
        Operations.waitUntilElementIsVisible(PG011_BillPayment.navBarBillPayment, driver);
        Operations.click(PG011_BillPayment.navBarBillPayment, driver);
        Operations.waitUntilElementIsVisible(PG011_BillPayment.billPaymentTitle, driver);
        Operations.verifyElementIsPresent(PG011_BillPayment.billPaymentTitle, driver);
    }

    @Then("I navigated to the Metlife bill payment details screen for bill payment and input Policy Name {string}, Policy Number {string}, Select purpose of payment, Input Payment Amount {string}, Input Remarks {string} and click on the Next to navigate review page")
    public void iNavigatedToTheTransferDetailsScreenMetlife(String policyName, String policyNumber, String paymentAmount, String remarks) {
        Operations.verifyElementIsPresent(PG011_BillPayment.billPaymentTitle, driver);
        Operations.verifyElementIsPresent(PG011_BillPayment.insuranceBillPaymentSelection, driver);
        Operations.click(PG011_BillPayment.insuranceBillPaymentSelection, driver);
        Operations.waitUntilElementIsVisible(PG011_BillPayment.selectMetlife, driver);
        Operations.verifyElementIsPresent(PG011_BillPayment.selectMetlife, driver);
        Operations.click(PG011_BillPayment.selectMetlife, driver);
        Operations.waitUntilElementIsVisible(PG011_BillPayment.metlifeDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG011_BillPayment.metlifeDetailsScreenTitle, driver);

        Operations.verifyElementIsPresent(PG011_BillPayment.enterPolicyHolderName, driver);
        Operations.click(PG011_BillPayment.enterPolicyHolderName, driver);
        Operations.sendText(PG011_BillPayment.enterPolicyHolderName,policyName, driver);

        Operations.verifyElementIsPresent(PG011_BillPayment.enterPolicyNumber, driver);
        Operations.click(PG011_BillPayment.enterPolicyNumber, driver);
        Operations.sendText(PG011_BillPayment.enterPolicyNumber,policyNumber, driver);

        Operations.verifyElementIsPresent(PG011_BillPayment.selectPurposeOfPayment, driver);
        Operations.click(PG011_BillPayment.selectPurposeOfPayment, driver);
        Operations.waitUntilElementIsVisible(PG011_BillPayment.selectedPremium, driver);
        Operations.click(PG011_BillPayment.selectedPremium, driver);

        Operations.verifyElementIsPresent(PG011_BillPayment.enterTransferAmount, driver);
        Operations.click(PG011_BillPayment.enterTransferAmount, driver);
        Operations.sendText(PG011_BillPayment.enterTransferAmount,paymentAmount, driver);

        Operations.verifyElementIsPresent(PG011_BillPayment.enterRemarks, driver);
        Operations.click(PG011_BillPayment.enterRemarks, driver);
        Operations.sendText(PG011_BillPayment.enterRemarks, remarks, driver);

        Operations.waitUntilElementIsClickable(PG011_BillPayment.verifyButton, driver);
        Operations.click(PG011_BillPayment.verifyButton, driver);
    }

    @Then("I can see Bill Payment details on the review page with selected from account and available balance click on the confirm and select OTP channel, accept terms and condition and click on Send OTP for 2fa Verification by {string}")
    public void iFilledTransferDetailsScreen(String OTP) throws InterruptedException {
        Operations.verifyElementIsPresent(PG011_BillPayment.transferDetailsPageTitle, driver);
        Operations.verifyElementIsPresent(PG011_BillPayment.billDetailsPageTitle, driver);
        Operations.verifyElementIsPresent(PG011_BillPayment.transferDetailsNextBtn, driver);
        Operations.click(PG011_BillPayment.transferDetailsNextBtn, driver);

        Operations.verifyElementIsPresent(PG011_BillPayment.paymentAuthenticationTypeSMS, driver);
        Operations.click(PG011_BillPayment.paymentAuthenticationTypeSMS, driver);
        Operations.click(PG011_BillPayment.paymentTermsAndConditionCheckbox, driver);
        Operations.waitUntilElementIsClickable(PG011_BillPayment.paymentConfirmSendOTPButton, driver);
        Operations.click(PG011_BillPayment.paymentConfirmSendOTPButton, driver);
        Operations.waitUntilElementIsVisible(PG011_BillPayment.paymentOTPInput, driver);
        Operations.verifyElementIsPresent(PG011_BillPayment.paymentOTPInput, driver);
        Operations.sendText(PG011_BillPayment.paymentOTPInput,OTP, driver);
        Operations.sleep(3000);
        Operations.waitUntilElementIsClickable(PG011_BillPayment.paymentOTPInputPay, driver);
        Operations.click(PG011_BillPayment.paymentOTPInputPay, driver);

    }

}
