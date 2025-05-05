package objectRepository;

import org.openqa.selenium.By;

public class PG008_MfsFundTransferOR {
    public static By mfsTransferTitle = By.xpath("//h1[normalize-space()='MFS Transfer']");
    public static By selectMfsTransferTitle = By.xpath("//mat-label[normalize-space()='Select MFS']");

    public static By selectBkash = By.xpath("(//button)[3]");
    public static By selectNagad = By.xpath("(//button)[4]");
    public static By selectRocket = By.xpath("(//button)[5]");
    public static By selectTap = By.xpath("(//button)[6]");

    //From Account Number Selection
    public static By mfsTransferFromAccountDropdown = By.xpath("//mat-select[@role='combobox']//div//div//div//*[name()='svg']");

    //Transfer Details Page Title
    public static By bKashTransferDetailsScreenTitle = By.xpath("//h1[normalize-space()='MFS - bKash - Transfer Details']");
    public static By nagadTransferDetailsScreenTitle = By.xpath("//h1[normalize-space()='MFS - Nagad - Transfer Details']");
    public static By rocketTransferDetailsScreenTitle = By.xpath("//h1[normalize-space()='MFS - Rocket - Transfer Details']");
    public static By tapTransferDetailsScreenTitle = By.xpath("//h1[normalize-space()='MFS - Tap - Transfer Details']");

    //To Account Number
    public static By mfsBkashToAccountInputField = By.xpath("//input[@placeholder='Enter bKash no.']");
    public static By nagadToAccountInputField = By.xpath("//input[@placeholder='Enter Nagad no.']");
    public static By rocketToAccountInputField = By.xpath("//input[@placeholder='Enter Rocket no.']");
    public static By tapToAccountInputField = By.xpath("//input[@placeholder='Enter Tap no.']");

    //TO Account Name
    public static By tapAccountNameInputField = By.xpath("//input[@formcontrolname='toAccountName']");

    //Available Balance
    public static By mfsTransferDetailsAvailableBalance = By.xpath("//input[@aria-invalid='false']");

    //Remarks
    public static By mFSTransferDetailsConfirmButton = By.xpath("//button[contains(text(),'Confirm')]");

    //Trasnfer Review page title
    public static By bKashReviewPageTitle = By.xpath("//h1[normalize-space()='MFS - bKash - Transfer Details Review']");
    public static By nagadReviewPageTitle = By.xpath("//h1[normalize-space()='MFS - Nagad - Transfer Details Review']");
    public static By rocketReviewPageTitle = By.xpath("//h1[normalize-space()='MFS - Rocket - Transfer Details Review']");
    public static By tapReviewPageTitle = By.xpath("//h1[normalize-space()='MFS - Tap - Transfer Details Review']");

    //send OTP button
    public static By mfsTransferSendOtpButton = By.xpath("//button[normalize-space()='Confirm']");

    //OTP screen element
    public static By mFSFundTransferOTPInputNext = By.xpath("//button[normalize-space()='Next']");

    //MFS Success Screen Element
    public static By mfsTransferGoToHome = By.xpath("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-otp-dialog-mfs-tranfer/div[2]/button[1]");
    public static By mfsTransferAddToFavourite = By.xpath("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-otp-dialog-mfs-tranfer/div[2]/button[2]");
    public static By mfsTransferDownloadReceipt = By.xpath("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-otp-dialog-mfs-tranfer/div[2]/button[3]");
    public static By mfsTransferAddFavouriteTitle = By.xpath("//*[@id=\"mat-mdc-dialog-1\"]/div/div/h2");
    public static By mfsTransferAddFavouriteSubTitle = By.xpath("//p[contains(text(),'Enter the name of your favourite:')]");
    public static By mfsTransferAddFavouriteInputField = By.xpath("//*[@id=\"mat-mdc-dialog-1\"]/div/div/mat-dialog-content/input");
    public static By mfsTransferAddFavouriteSaveButton = By.xpath("//button[contains(text(),'Save')]");
    public static By mfsTransferAddFavouriteToast = By.xpath("//div[@id='toast-container']");
}
