package objectRepository;

import org.openqa.selenium.By;

public class PG011_Payments {

    public static By navBarBillPayment = By.xpath("//span[normalize-space()='Bill Payment']");
    public static By billPaymentTitle = By.xpath("//h1[normalize-space()='Bill Payment']");
    public static By donationPaymentSelection = By.xpath("//span[normalize-space()='Donation']");
    public static By selectAsSunnah = By.xpath("//span[normalize-space()='As-Sunnah Foundation']");
    public static By asSunnahDetailsScreenTitle = By.xpath("//h1[normalize-space()='As-Sunnah Foundation']");
    public static By enterTransferAmount = By.xpath("//input[@id='mat-input-2']");
    public static By nextButton = By.xpath("//button[normalize-space()='Next']");
    public static By billDetailsPageTitle = By.xpath("//h1[normalize-space()='Bill Details']");
    public static By fromAccountDropdown = By.xpath("//div[@class='mat-mdc-select-arrow ng-tns-c1154042729-29']//*[name()='svg']");
    public static By billDetailsNextBtn = By.xpath("//button[normalize-space()='Next']");
    public static By paymentAuthenticationTypeSMS = By.xpath("//label[contains(text(),'SMS')]");
    public static By paymentAuthenticationTypeEmail = By.xpath("//label[contains(text(),'Email')]");
    public static By paymentTermsAndConditionLink = By.xpath("//span[contains(text(),'Terms & Conditions')]");
    public static By paymentConfirmSendOTPButton = By.xpath("//button[normalize-space()='Send OTP']");
    public static By paymentTermsAndConditionDialogue = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]");
    public static By paymentOTPInput = By.xpath("//span[1]//input[1]");
    public static By resendOTP = By.xpath("//strong[contains(text(),'Resend OTP')]");
    public static By paymentOTPInputPay = By.xpath("//button[normalize-space()='Pay']");
    public static By paymentGoToHome = By.xpath("//button[contains(text(),'Go to Home')]");
    public static By paymentAddToFavourite = By.xpath("//button[normalize-space()='Add to Favorite']");
    public static By paymentDownloadReceipt = By.xpath("//button[normalize-space()='Download Receipt']");
    public static By paymentAddFavouriteTitle = By.xpath("//h2[normalize-space()='Add Favorite']");
    public static By paymentAddFavouriteSubTitle = By.xpath("//p[contains(text(),'Enter the name of your favorite:')]");
    public static By paymentAddFavouriteInputField = By.xpath("//input[@placeholder='Favorite Name']");
    public static By paymentAddFavouriteSaveButton = By.xpath("//button[contains(text(),'Save')]");
    public static By paymentAddFavouriteToast = By.xpath("//div[@id='toast-container']");

}
