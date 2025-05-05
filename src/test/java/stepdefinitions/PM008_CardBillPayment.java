package stepdefinitions;

import io.cucumber.java.en.Then;
import objectRepository.PG010_CardBillPayment;
import utils.Base;
import utils.Operations;

public class PM008_CardBillPayment extends Base {

    @Then("I navigate to the Card Bill Payment")
    public void iNavigateToTheCardBillPayment() {
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.navBarPayment, driver);
        Operations.click(PG010_CardBillPayment.navBarPayment, driver);
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.navBarCreditCardBillPayment, driver);
        Operations.click(PG010_CardBillPayment.navBarCreditCardBillPayment, driver);
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.cardBillPaymentTitle, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.cardBillPaymentTitle, driver);
    }

    @Then("I navigated to the within credit card details screen for within card bill payment and select a from account and available balance populated")
    public void iNavigatedToTheTransferDetailsScreenWithinCard() {
        Operations.verifyElementIsPresent(PG010_CardBillPayment.cardBillPaymentTitle, driver);
        Operations.click(PG010_CardBillPayment.selectWithinCardBillPayment, driver);
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.withinCardDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.withinCardDetailsScreenTitle, driver);
        Operations.click(PG010_CardBillPayment.selectFromAccount, driver);
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.selectFromAccountFirstOne, driver);
        Operations.click(PG010_CardBillPayment.selectFromAccountFirstOne, driver);
    }

    @Then("I select Card Type, Input Card Number {string}, Card Holder name {string}, Payment Amount {string}, Remarks {string} and confirm next to continue")
    public void iFilledTransferDetailsScreen(String cardNumber, String cardHolderName, String paymentAmount, String remarks) {
        Operations.verifyElementIsPresent(PG010_CardBillPayment.selectCardTypeWithin, driver);
        Operations.click(PG010_CardBillPayment.selectCardTypeWithin, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.selectedCardType, driver);
        Operations.click(PG010_CardBillPayment.selectedCardType, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.enterCardNumber, driver);
        Operations.sendText(PG010_CardBillPayment.enterCardNumber, cardNumber, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.enterCardHolderName, driver);
        Operations.click(PG010_CardBillPayment.enterCardHolderName, driver);
        Operations.sendText(PG010_CardBillPayment.enterCardHolderName, cardHolderName, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.transferDetailsPaymentAmount, driver);
        Operations.click(PG010_CardBillPayment.transferDetailsPaymentAmount, driver);
        Operations.sendText(PG010_CardBillPayment.transferDetailsPaymentAmount, paymentAmount, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.paymentRemarks, driver);
        Operations.click(PG010_CardBillPayment.paymentRemarks, driver);
        Operations.sendText(PG010_CardBillPayment.paymentRemarks,"AutomatedTest", driver);
        Operations.click(PG010_CardBillPayment.transferDetailsPaymentAmount, driver);
        Operations.click(PG010_CardBillPayment.paymentRemarks, driver);
        Operations.waitUntilElementIsClickable(PG010_CardBillPayment.paymentDetailsNextButton, driver);
        Operations.click(PG010_CardBillPayment.paymentDetailsNextButton, driver);
    }

    @Then("I can see transaction details screen for Within Card Payment, select OTP channel, accept the terms and click confirm to continue by OTP verification {string}")
    public void iCanSeeTransactionScreenVerifyOTPWithinFT(String OTP) throws InterruptedException {
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.withinCardPaymentReviewPageTitle, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.withinCardPaymentReviewPageTitle, driver);
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.withinTransferType, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.withinTransferType, driver);
        Operations.click(PG010_CardBillPayment.paymentAuthenticationTypeSMS, driver);
        Operations.click(PG010_CardBillPayment.paymentTermsAndConditionCheckbox, driver);
        Operations.click(PG010_CardBillPayment.paymentConfirmButton, driver);
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.paymentOTPInput, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.paymentOTPInput, driver);
        Operations.sendText(PG010_CardBillPayment.paymentOTPInput,OTP, driver);
        Operations.sleep(3000);
        Operations.waitUntilElementIsClickable(PG010_CardBillPayment.paymentOTPInputNext, driver);
        Operations.click(PG010_CardBillPayment.paymentOTPInputNext, driver);
    }


    @Then("I can download the payment receipt")
    public void iCanDownloadTransactionReceipt() throws InterruptedException {
        Operations.verifyElementIsPresent(PG010_CardBillPayment.paymentDownloadReceipt, driver);
        Operations.sleep(3000);
        Operations.click(PG010_CardBillPayment.paymentDownloadReceipt, driver);
    }


    @Then("I navigated to the Other credit card details screen for Other card bill payment and select a from account and available balance populated")
    public void iNavigatedToTheTransferDetailsScreenOtherCard() {
        Operations.verifyElementIsPresent(PG010_CardBillPayment.cardBillPaymentTitle, driver);
        Operations.click(PG010_CardBillPayment.selectOtherCardBillPayment, driver);
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.otherCardDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.otherCardDetailsScreenTitle, driver);
        Operations.click(PG010_CardBillPayment.selectFromAccount, driver);
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.selectFromAccountFirstOne, driver);
        Operations.click(PG010_CardBillPayment.selectFromAccountFirstOne, driver);
    }

    @Then("I select Bank Name, Input Card Number {string}, Card Holder name {string}, Payment Amount {string}, Remarks {string} and confirm next to continue")
    public void iFilledOtherTPaymentDetailsScreen(String cardNumber, String cardHolderName, String paymentAmount, String remarks) throws InterruptedException {
        Operations.verifyElementIsPresent(PG010_CardBillPayment.selectBankOther, driver);
        Operations.click(PG010_CardBillPayment.selectBankOther, driver);
        Operations.sleep(3000);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.selectedBankOther, driver);
        Operations.click(PG010_CardBillPayment.selectedBankOther, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.enterCardNumber, driver);
        Operations.click(PG010_CardBillPayment.enterCardNumber, driver);
        Operations.sendText(PG010_CardBillPayment.enterCardNumber, cardNumber, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.enterCardHolderName, driver);
        Operations.click(PG010_CardBillPayment.enterCardHolderName, driver);
        Operations.sendText(PG010_CardBillPayment.enterCardHolderName, cardHolderName, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.transferDetailsPaymentAmountOther, driver);
        Operations.click(PG010_CardBillPayment.transferDetailsPaymentAmountOther, driver);
        Operations.sendText(PG010_CardBillPayment.transferDetailsPaymentAmountOther, paymentAmount, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.paymentRemarks, driver);
        Operations.click(PG010_CardBillPayment.paymentRemarks, driver);
        Operations.sendText(PG010_CardBillPayment.paymentRemarks,"AutomatedTest", driver);
        Operations.waitUntilElementIsClickable(PG010_CardBillPayment.paymentDetailsNextButton, driver);
        Operations.click(PG010_CardBillPayment.paymentDetailsNextButton, driver);
    }
    @Then("I can see transaction details screen for Other Card Payment, select OTP channel, accept the terms and click confirm to continue by OTP verification {string}")
    public void iCanSeeTransactionScreenVerifyOTPOtherFT(String OTP) throws InterruptedException {
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.otherCardPaymentReviewPageTitle, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.otherCardPaymentReviewPageTitle, driver);
        Operations.click(PG010_CardBillPayment.paymentAuthenticationTypeSMS, driver);
        Operations.click(PG010_CardBillPayment.paymentTermsAndConditionCheckbox, driver);
        Operations.click(PG010_CardBillPayment.paymentConfirmButton, driver);
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.paymentOTPInput, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.paymentOTPInput, driver);
        Operations.sendText(PG010_CardBillPayment.paymentOTPInput,OTP, driver);
        Operations.sleep(3000);
        Operations.waitUntilElementIsClickable(PG010_CardBillPayment.paymentOTPInputNext, driver);
        Operations.click(PG010_CardBillPayment.paymentOTPInputNext, driver);
    }


    @Then("I navigated to the lanka credit card details screen for lanka card bill payment and select a from account and available balance populated")
    public void iNavigatedToTheTransferDetailsScreenlankaCard() {
        Operations.verifyElementIsPresent(PG010_CardBillPayment.cardBillPaymentTitle, driver);
        Operations.click(PG010_CardBillPayment.selectLankaCardBillPayment, driver);
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.lankaCardDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.lankaCardDetailsScreenTitle, driver);
        Operations.click(PG010_CardBillPayment.selectFromAccount, driver);
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.selectFromAccountFirstOne, driver);
        Operations.click(PG010_CardBillPayment.selectFromAccountFirstOne, driver);
    }

    @Then("I select Card Type for lanka, Input Card Number {string}, Card Holder name {string}, Payment Amount {string}, Remarks {string} and confirm next to continue")
    public void iFilledTransferDetailsScreenLanka(String cardNumber, String cardHolderName, String paymentAmount, String remarks) {
        Operations.verifyElementIsPresent(PG010_CardBillPayment.selectCardTypeWithin, driver);
        Operations.click(PG010_CardBillPayment.selectCardTypeWithin, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.selectedCardTypeLanka, driver);
        Operations.click(PG010_CardBillPayment.selectedCardTypeLanka, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.enterCardNumber, driver);
        Operations.sendText(PG010_CardBillPayment.enterCardNumber, cardNumber, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.enterCardHolderName, driver);
        Operations.click(PG010_CardBillPayment.enterCardHolderName, driver);
        Operations.sendText(PG010_CardBillPayment.enterCardHolderName, cardHolderName, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.transferDetailsPaymentAmount, driver);
        Operations.click(PG010_CardBillPayment.transferDetailsPaymentAmount, driver);
        Operations.sendText(PG010_CardBillPayment.transferDetailsPaymentAmount, paymentAmount, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.paymentRemarks, driver);
        Operations.click(PG010_CardBillPayment.paymentRemarks, driver);
        Operations.sendText(PG010_CardBillPayment.paymentRemarks,"AutomatedTest", driver);
        Operations.click(PG010_CardBillPayment.transferDetailsPaymentAmount, driver);
        Operations.click(PG010_CardBillPayment.paymentRemarks, driver);
        Operations.waitUntilElementIsClickable(PG010_CardBillPayment.paymentDetailsNextButton, driver);
        Operations.click(PG010_CardBillPayment.paymentDetailsNextButton, driver);
    }

    @Then("I can see transaction details screen for Lanka Card Payment, select OTP channel, accept the terms and click confirm to continue by OTP verification {string}")
    public void iCanSeeTransactionScreenVerifyOTPLankaFT(String OTP) throws InterruptedException {
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.lankaCardPaymentReviewPageTitle, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.lankaCardPaymentReviewPageTitle, driver);
        Operations.click(PG010_CardBillPayment.paymentAuthenticationTypeSMS, driver);
        Operations.click(PG010_CardBillPayment.paymentTermsAndConditionCheckbox, driver);
        Operations.click(PG010_CardBillPayment.paymentConfirmButton, driver);
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.paymentOTPInput, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.paymentOTPInput, driver);
        Operations.sendText(PG010_CardBillPayment.paymentOTPInput,OTP, driver);
        Operations.sleep(3000);
        Operations.waitUntilElementIsClickable(PG010_CardBillPayment.paymentOTPInputNext, driver);
        Operations.click(PG010_CardBillPayment.paymentOTPInputNext, driver);
    }

    @Then("I navigated to the own credit card details screen for own card bill payment and select a from account and available balance populated")
    public void iNavigatedToTheTransferDetailsScreenOwnCard() throws InterruptedException {
        Operations.verifyElementIsPresent(PG010_CardBillPayment.cardBillPaymentTitle, driver);
        Operations.click(PG010_CardBillPayment.selectOwnCardBillPayment, driver);
        Operations.click(PG010_CardBillPayment.cardOwnSelect, driver);
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.ownCardDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.ownCardDetailsScreenTitle, driver);
        Operations.sleep(3000);
        Operations.click(PG010_CardBillPayment.selectFromAccount, driver);
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.selectFromAccountFirstOne, driver);
        Operations.click(PG010_CardBillPayment.selectFromAccountFirstOne, driver);
        Operations.click(PG010_CardBillPayment.selectToAccountCurrency, driver);
        Operations.click(PG010_CardBillPayment.toAccountCurrencySelectionBDT, driver);

    }

    @Then("I select To Currency, Select payment amount, Input Payment Amount {string}, Remarks {string} and confirm next to continue")
    public void iFilledTransferDetailsScreenForOwn(String paymentAmount, String remarks) {
        Operations.verifyElementIsPresent(PG010_CardBillPayment.selectPaymentAmount, driver);
        Operations.click(PG010_CardBillPayment.selectPaymentAmount, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.selectPaymentAmountOther, driver);
        Operations.click(PG010_CardBillPayment.selectPaymentAmountOther, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.transferDetailsPaymentAmountOwn, driver);
        Operations.click(PG010_CardBillPayment.transferDetailsPaymentAmountOwn, driver);
        Operations.sendText(PG010_CardBillPayment.transferDetailsPaymentAmountOwn, paymentAmount, driver);
        Operations.tab(PG010_CardBillPayment.transferDetailsPaymentAmountOwn, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.paymentRemarks, driver);
        Operations.click(PG010_CardBillPayment.paymentRemarks, driver);
        Operations.sendText(PG010_CardBillPayment.paymentRemarks,remarks, driver);
        Operations.click(PG010_CardBillPayment.transferDetailsPaymentAmountOwn, driver);
        Operations.click(PG010_CardBillPayment.paymentRemarks, driver);
        Operations.sendText(PG010_CardBillPayment.paymentRemarks,remarks, driver);
        Operations.waitUntilElementIsClickable(PG010_CardBillPayment.paymentDetailsNextButton, driver);
        Operations.click(PG010_CardBillPayment.paymentDetailsNextButton, driver);
    }

    @Then("I can see transaction review screen for Own Card Payment, select currency, select OTP channel, accept the terms and click confirm to continue by OTP verification {string}")
    public void iCanSeeTransactionScreenVerifyOTPOwnFT(String OTP) throws InterruptedException {
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.ownCardPaymentReviewPageTitle, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.ownCardPaymentReviewPageTitle, driver);
        Operations.click(PG010_CardBillPayment.paymentAuthenticationTypeSMS, driver);
        Operations.click(PG010_CardBillPayment.paymentTermsAndConditionCheckbox, driver);
        Operations.click(PG010_CardBillPayment.OwnPaymentConfirmSendOTPButton, driver);
        Operations.waitUntilElementIsVisible(PG010_CardBillPayment.paymentOTPInput, driver);
        Operations.verifyElementIsPresent(PG010_CardBillPayment.paymentOTPInput, driver);
        Operations.sendText(PG010_CardBillPayment.paymentOTPInput,OTP, driver);
        Operations.sleep(3000);
        Operations.waitUntilElementIsClickable(PG010_CardBillPayment.paymentOTPInputNext, driver);
        Operations.click(PG010_CardBillPayment.paymentOTPInputNext, driver);
    }

}
