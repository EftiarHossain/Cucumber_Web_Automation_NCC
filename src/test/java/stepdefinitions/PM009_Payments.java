package stepdefinitions;

import io.cucumber.java.en.Then;
import objectRepository.PG011_Payments;
import utils.Base;
import utils.Operations;

public class PM009_Payments extends Base {

    @Then("I navigate to the Bill Payment")
    public void iNavigateToTheBillPayment() {
        Operations.waitUntilElementIsVisible(PG011_Payments.navBarBillPayment, driver);
        Operations.click(PG011_Payments.navBarBillPayment, driver);
        Operations.waitUntilElementIsVisible(PG011_Payments.billPaymentTitle, driver);
        Operations.verifyElementIsPresent(PG011_Payments.billPaymentTitle, driver);
    }

    @Then("I navigated to the Donation details screen and Input Payment Amount {string} and click on the Next to navigate review page")
    public void iNavigatedToTheTransferDetailsScreenMetlife(String paymentAmount) {
        Operations.verifyElementIsPresent(PG011_Payments.billPaymentTitle, driver);
        Operations.verifyElementIsPresent(PG011_Payments.donationPaymentSelection, driver);
        Operations.click(PG011_Payments.donationPaymentSelection, driver);
        Operations.waitUntilElementIsVisible(PG011_Payments.selectAsSunnah, driver);
        Operations.verifyElementIsPresent(PG011_Payments.selectAsSunnah, driver);
        Operations.click(PG011_Payments.selectAsSunnah, driver);
        Operations.waitUntilElementIsVisible(PG011_Payments.asSunnahDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG011_Payments.asSunnahDetailsScreenTitle, driver);

        Operations.verifyElementIsPresent(PG011_Payments.enterTransferAmount, driver);
        Operations.click(PG011_Payments.enterTransferAmount, driver);
        Operations.sendText(PG011_Payments.enterTransferAmount,paymentAmount, driver);

        Operations.waitUntilElementIsClickable(PG011_Payments.nextButton, driver);
        Operations.click(PG011_Payments.nextButton, driver);
    }

    @Then("I can see Bill Payment details on the review page with selected from account and available balance click on the confirm and select OTP channel, accept terms and condition and click on Send OTP for 2fa Verification by {string}")
    public void iFilledTransferDetailsScreen(String OTP) throws InterruptedException {
        Operations.verifyElementIsPresent(PG011_Payments.billDetailsPageTitle, driver);
        Operations.verifyElementIsPresent(PG011_Payments.billDetailsPageTitle, driver);
        Operations.verifyElementIsPresent(PG011_Payments.billDetailsNextBtn, driver);
        Operations.click(PG011_Payments.billDetailsNextBtn, driver);

        Operations.verifyElementIsPresent(PG011_Payments.paymentAuthenticationTypeSMS, driver);
        Operations.click(PG011_Payments.paymentAuthenticationTypeSMS, driver);
        //Operations.click(PG011_Payments.paymentTermsAndConditionCheckbox, driver);
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
