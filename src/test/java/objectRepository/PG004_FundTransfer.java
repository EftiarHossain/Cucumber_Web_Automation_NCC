package objectRepository;

import org.openqa.selenium.By;

public class PG004_FundTransfer {
    public static By navBarFundTransfer = By.xpath("//span[text()=' Fund Transfer ']");
    public static By navBarOwnFundTransfer = By.xpath("//span[normalize-space()='Own Account']");
    public static By navBarWithinFundTransfer = By.xpath("//span[contains(text(),'Within Bank Account')]");
    public static By navBarOtherFundTransfer = By.xpath("//span[contains(text(),'Other Bank Account')]");
    public static By navBarMFSFundTransfer = By.xpath("//span[normalize-space()='MFS']");

    public static By fundTransferTitle = By.xpath("//h1[contains(text(),'Fund Transfer')]");

    public static By continueWithFavourite = By.xpath("//h1[contains(text(),'Continue With Favourite')]");
    public static By beneficiarySearchField = By.xpath("//input[@placeholder='Search Beneficiary']");
    public static By oneTimePayBtn = By.xpath("//h1[normalize-space()='One Time Pay']");

    //Transfer Amount
    public static By transferDetailsTransferAmount = By.xpath("//input[@placeholder='Enter Transfer Amount']");
    public static By transferDetailsTransferAmountSlab = By.xpath("//input[@placeholder='Enter Transfer Amount']");

    //Remarks
    public static By transferDetailsRemarks = By.xpath("//input[@placeholder='Remarks']");
    public static By transferDetailsNextButton = By.xpath("//button[contains(text(),'Next')]");

    public static By transferDetailsCancelButton = By.xpath("//button[contains(text(),'Cancel')]");
    public static By transferDetailsToastContainer = By.xpath("//div[@id='toast-container']");

    //Trasnfer Review page title
    public static By fundTransferReviewPageTitle = By.xpath("//h1[normalize-space()='Review']");

    //OTP type selection
    public static By fundTransferAuthenticationTypeSMS = By.xpath("//label[contains(text(),'SMS')]");
    public static By fundTransferAuthenticationTypeEmail = By.xpath("//label[normalize-space()='Email']");
    public static By fundTransferTermsAndConditionLink = By.xpath("//span[contains(text(),'Terms & Conditions')]");
    public static By fundTransferTermsAndConditionCheckbox = By.xpath("//input[@type='checkbox']");
    public static By fundTransferTermsAndConditionDialogue = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]");

    //send OTP button
    public static By fundTransferSendOtpButton = By.xpath("//button[normalize-space()='Send OTP']");

    //OTP screen element
    public static By fundTransferOTPInput = By.xpath("//span[1]//input[1]");
    public static By fundTransferResendOTP = By.xpath("//strong[contains(text(),'Resend OTP')]");
    public static By fundTransferTransferBtn = By.xpath("//button[normalize-space()='Transfer']");
    public static By fundTransferOTPInputCancel = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-otp-dialog-fund-transfer[1]/div[2]/div[1]/button[1]");

    //Fund Transfer Success Screen Element
    public static By fundTransferGoToHome = By.xpath("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-otp-dialog-fund-transfer/div[2]/div[2]/button[1]");
    public static By fundTransferAddToFavourite = By.xpath("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-otp-dialog-fund-transfer/div[2]/button");
    public static By fundTransferDownloadReceipt = By.xpath("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-otp-dialog-fund-transfer/div[2]/div[2]/button[2]");
    public static By fundTransferAddFavouriteTitle = By.xpath("//*[@id=\"mat-mdc-dialog-1\"]/div/div/div/h2");
    public static By fundTransferAddFavouriteSubTitle = By.xpath("//p[contains(text(),'Enter the name of your favourite:')]");
    public static By fundTransferAddFavouriteInputField = By.xpath("//*[@id=\"mat-mdc-dialog-1\"]/div/div/div/mat-dialog-content/input");
    public static By fundTransferAddFavouriteSaveButton = By.xpath("//button[contains(text(),'Submit')]");
    public static By fundTransferAddFavouriteToast = By.xpath("//div[@id='toast-container']");

}
