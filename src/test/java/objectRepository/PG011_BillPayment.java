package objectRepository;

import org.openqa.selenium.By;

public class PG011_BillPayment {

    public static By navBarBillPayment = By.xpath("//span[normalize-space()='Bill Payment']");

    public static By insuranceBillPaymentSelection = By.xpath("//img[@alt='Insurance']");
    public static By billPaymentTitle = By.xpath("//h1[normalize-space()='Bill Payment']");

    public static By selectMetlife = By.xpath("//span[normalize-space()='Metlife']");

    public static By metlifeDetailsScreenTitle = By.xpath("//h1[normalize-space()='Metlife']");
    public static By enterPolicyHolderName = By.xpath("//input[@placeholder='Enter Policy Holder Name']");
    public static By enterPolicyNumber = By.xpath("//input[@placeholder='Enter Policy Number']");
    public static By selectPurposeOfPayment = By.xpath("//span[normalize-space()='Select Purpose Of Payment']");
    public static By selectedPremium = By.xpath("//span[normalize-space()='Premium']");
    public static By enterTransferAmount = By.xpath("//input[@placeholder='Enter Transfer Amount']");

    public static By selectCardTypeWithin = By.xpath("//span[normalize-space()='--Select Card Type--']");
    public static By selectBankOther = By.xpath("//span[normalize-space()='--Select Bank-']");
    public static By selectedBankOther = By.xpath("//span[normalize-space()='Al-Arafah Islami Bank Limited']");
    public static By selectedCardType = By.xpath("//span[normalize-space()='World']");
    public static By selectedCardTypeLanka = By.xpath("//span[normalize-space()='VISA']");
    public static By enterRemarks = By.xpath("//input[@placeholder='Enter Remarks']");
    public static By verifyButton = By.xpath("//button[normalize-space()='Verify']");
    public static By cancelButton = By.xpath("//button[contains(text(),'Cancel')]");

    public static By transferDetailsToastContainer = By.xpath("//div[@id='toast-container']");

    public static By billDetailsPageTitle = By.xpath("//h1[normalize-space()='Bill Details']");
    public static By transferDetailsPageTitle = By.xpath("//h1[normalize-space()='Transfer Details']");
    public static By transferDetailsNextBtn = By.xpath("//button[normalize-space()='Next']");
    public static By paymentAuthenticationTypeSMS = By.xpath("//label[contains(text(),'SMS')]");
    public static By paymentAuthenticationTypeEmail = By.xpath("//label[contains(text(),'Email')]");
    public static By paymentTermsAndConditionLink = By.xpath("//span[contains(text(),'Terms & Conditions')]");
    public static By paymentTermsAndConditionCheckbox = By.xpath("//input[@type='checkbox']");
    public static By paymentConfirmSendOTPButton = By.xpath("//button[normalize-space()='Send OTP']");

    public static By paymentTermsAndConditionDialogue = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]");
    public static By paymentOTPInput = By.xpath("//span[1]//input[1]");
    public static By fundTransferResendOTP = By.xpath("//strong[contains(text(),'Resend OTP')]");
    public static By paymentOTPInputPay = By.xpath("//button[normalize-space()='Pay']");

    public static By fundTransferGoToHome = By.xpath("//button[contains(text(),'Go to Home')]");

    public static By fundTransferAddToFavourite = By.xpath("//button[contains(text(),'Add to Favourite')]");

    public static By fundTransferDownloadReceipt = By.xpath("//button[contains(text(),'Download Receipt')]");

    public static By fundTransferAddFavouriteTitle = By.xpath("//h2[contains(text(),'Add Favourite')]");
    public static By fundTransferAddFavouriteSubTitle = By.xpath("//p[contains(text(),'Enter the name of your favourite:')]");
    public static By fundTransferAddFavouriteInputField = By.xpath("//input[@placeholder='Favourite Name']");
    public static By fundTransferAddFavouriteSaveButton = By.xpath("//button[contains(text(),'Save')]");

    public static By fundTransferAddFavouriteToast = By.xpath("//div[@id='toast-container']");

}
