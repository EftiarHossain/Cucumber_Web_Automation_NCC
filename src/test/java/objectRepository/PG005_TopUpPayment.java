package objectRepository;

import org.openqa.selenium.By;

public class PG005_TopUpPayment {

    public static By navBarTopUp = By.xpath("//span[normalize-space()='Top Up']");

    public static By topUpTitle = By.xpath("//h1[normalize-space()='Top Up']");
    public static By selectOperatorTitle = By.xpath("//h1[normalize-space()='Select Operator']");
    public static By selectOperatorGP = By.xpath("//span[normalize-space()='Grameenphone']");
    public static By selectOperatorBL = By.xpath("//span[normalize-space()='Banglalink']");
    public static By selectOperatorRobi = By.xpath("//span[normalize-space()='Robi']");
    public static By selectOperatorTeletalk = By.xpath("//span[normalize-space()='Teletalk']");
    public static By selectOperatorAirtel = By.xpath("//span[normalize-space()='Airtel']");

    public static By continueWithFavourite = By.xpath("//h1[contains(text(),'Continue With Favourite')]");
    public static By searchField = By.xpath("//input[@placeholder='Search']");
    public static By beneficiarySearchField = By.xpath("//input[@placeholder='Search Beneficiary']");
    public static By continueWithoutBeneficiaryBtn = By.xpath("//h1[contains(text(),'Continue without Beneficiary')]");

    public static By topUpDetailsScreenTitle = By.xpath("//h1[normalize-space()='Top Up Details']");
    public static By topUpPaymentDetailsToAccountField = By.xpath("//input[@placeholder='Enter phone number']");

    public static By topUpPaymentDetailsAvailableBalance = By.xpath("//input[@aria-invalid='false']");

    public static By transferDetailsTransferAmount = By.xpath("//input[@placeholder='Enter Transfer Amount']");
    public static By transferDetailsTransferAmountSlab = By.xpath("//input[@placeholder='Enter Transfer Amount']");
    public static By transferDetailsRemarks = By.xpath("//input[@placeholder='Remarks']");
    public static By connectionTypeField = By.xpath("//span[contains(text(),'Prepaid')]");
    public static By connectionTypePrepaid = By.xpath("//mat-option[@role='option']//span[contains(text(),'Prepaid')]");
    public static By connectionTypePostpaid = By.xpath("//span[contains(text(),'Postpaid')]");
    public static By connectionTypeSkitto = By.xpath("//span[contains(text(),'Skitto')]");

    public static By transferDetailsNextButton = By.xpath("//button[contains(text(),'Next')]");

    public static By transferDetailsCancelButton = By.xpath("//button[contains(text(),'Cancel')]");
    public static By transferDetailsToastContainer = By.xpath("//div[@id='toast-container']");

    public static By topUpReviewPageTitle = By.xpath("//h1[normalize-space()='Top Up Review']");
    public static By topUpTransferType = By.xpath("//li[normalize-space()='Mobile Recharge']");
    public static By fundTransferAuthenticationTypeSMS = By.xpath("//label[contains(text(),'SMS')]");
    public static By fundTransferAuthenticationTypeEmail = By.xpath("//label[contains(text(),'Email')]");
    public static By fundTransferTermsAndConditionLink = By.xpath("//span[contains(text(),'Terms & Conditions')]");
    public static By fundTransferTermsAndConditionCheckbox = By.xpath("//input[@type='checkbox']");

    public static By fundTransferTermsAndConditionDialogue = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]");

    public static By fundTransferOTPInput = By.xpath("//span[1]//input[1]");
    public static By fundTransferResendOTP = By.xpath("//strong[contains(text(),'Resend OTP')]");
    public static By topUpOTPInputNext = By.xpath("//mat-dialog-container[@role='dialog']//div//div//app-otp-dialog-fund-transfer//div//div//button[contains(text(),'Next')]");

    public static By topUpSuccessScreenTransferType = By.xpath("//li[normalize-space()='Mobile Recharge']");

    public static By fundTransferGoToHome = By.xpath("//button[contains(text(),'Go to Home')]");

    public static By fundTransferAddToFavourite = By.xpath("//button[contains(text(),'Add to Favourite')]");

    public static By fundTransferDownloadReceipt = By.xpath("//button[contains(text(),'Download Receipt')]");

    public static By fundTransferAddFavouriteTitle = By.xpath("//h2[contains(text(),'Add Favourite')]");
    public static By fundTransferAddFavouriteSubTitle = By.xpath("//p[contains(text(),'Enter the name of your favourite:')]");
    public static By fundTransferAddFavouriteInputField = By.xpath("//*[@id=\"mat-mdc-dialog-1\"]/div/div/mat-dialog-content/input");
    public static By fundTransferAddFavouriteSaveButton = By.xpath("//button[contains(text(),'Save')]");

    public static By fundTransferAddFavouriteToast = By.xpath("//div[@id='toast-container']");

}
