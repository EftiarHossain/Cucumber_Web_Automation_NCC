package objectRepository;

import org.openqa.selenium.By;

public class PG005_TopUpPayment {

    public static By navBarTopUp = By.xpath("//span[normalize-space()='Top Up']");

    public static By topUpTitle = By.xpath("//h1[normalize-space()='Top Up']");
    public static By selectOperatorTitle = By.xpath("//h1[normalize-space()='Select Operator']");
    public static By selectOperatorGP = By.xpath("//body//div//div[@dir='ltr']//div//div//div//div//div//div[1]");
    public static By selectOperatorBL = By.xpath("//mat-dialog-container[@role='dialog']//div[2]");
    public static By selectOperatorRobi = By.xpath("//div[@dir='ltr']//div[3]");
    public static By selectOperatorTeletalk = By.xpath("//div[@dir='ltr']//div[5]");
    public static By selectOperatorAirtel = By.xpath("//div[@dir='ltr']//div[4]");

    public static By continueWithFavourite = By.xpath("//div[@class='flex flex-col']//button[@type='button']");
    public static By searchField = By.xpath("//input[@placeholder='Search']");
    public static By beneficiarySearchField = By.xpath("//input[@placeholder='Search Beneficiary']");
    public static By oneTimePayBtn = By.xpath("//h1[normalize-space()='One Time Pay']");

    public static By topUpDetailsScreenTitle = By.xpath("//h1[normalize-space()='Top Up Details']");
    public static By topUpPaymentDetailsToAccountField = By.xpath("//input[@placeholder='Enter phone number']");

    public static By topUpPaymentDetailsAvailableBalance = By.xpath("//*[@id=\"mat-input-1\"]");

    public static By transferDetailsTransferAmount = By.xpath("//input[@placeholder='Enter Amount']");
    public static By transferDetailsTransferAmountSlab = By.xpath("//input[@placeholder='Enter Transfer Amount']");
    public static By transferDetailsRemarks = By.xpath("//input[@placeholder='Remarks']");
    public static By connectionTypeField = By.xpath("//mat-select[@formcontrolname='connectionType']//div//div//div//*[name()='svg']");
    public static By connectionTypePrepaid = By.xpath("(//span[contains(text(),'Prepaid')])[2]");
    public static By connectionTypePostpaid = By.xpath("//span[normalize-space()='Postpaid']");
    public static By connectionTypeSkitto = By.xpath("//*[@id=\"mat-option-2\"]/span");

    public static By transferDetailsNextButton = By.xpath("//button[normalize-space()='Next']");

    public static By transferDetailsCancelButton = By.xpath("//button[contains(text(),'Cancel')]");
    public static By transferDetailsToastContainer = By.xpath("//div[@id='toast-container']");

    public static By topUpReviewPageTitle = By.xpath("//h1[normalize-space()='Top Up Summary']");
    public static By topUpTransferType = By.xpath("//li[normalize-space()='Mobile Recharge']");
    public static By fundTransferAuthenticationTypeSMS = By.xpath("//label[contains(text(),'SMS')]");
    public static By fundTransferAuthenticationTypeEmail = By.xpath("//label[normalize-space()='Email']");
    public static By fundTransferTermsAndConditionLink = By.xpath("//span[contains(text(),'Terms & Conditions')]");
    public static By fundTransferTermsAndConditionCheckbox = By.xpath("//input[@type='checkbox']");

    public static By fundTransferTermsAndConditionDialogue = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]");

    public static By sendOtpButton = By.xpath("//button[normalize-space()='Send OTP']");
    public static By fundTransferOTPInput = By.xpath("//span[1]//input[1]");
    public static By fundTransferResendOTP = By.xpath("//strong[contains(text(),'Resend OTP')]");
    public static By rechargeButton = By.xpath("//button[normalize-space()='Recharge']");

    public static By topUpSuccessScreenTransferType = By.xpath("//li[normalize-space()='Mobile Recharge']");

    public static By successIcon = By.xpath("//img[@alt='Success Icon']");

    public static By topupGoToHome = By.xpath("//button[normalize-space()='Go to Home']");

    public static By topupAddToFavourite = By.xpath("(//button[@type='button'])[3]");

    public static By topupDownloadReceipt = By.xpath("//button[normalize-space()='Download']");

    public static By topupAddFavouriteTitle = By.xpath("//h2[normalize-space()='Add To Favorite']");
    public static By topupAddFavouriteSubTitle = By.xpath("//p[contains(text(),'Enter the name of your favourite:')]");
    public static By topupAddFavouriteInputField = By.xpath("//input[@placeholder='Enter Name']");
    public static By topupAddFavouriteSaveButton = By.xpath("//button[normalize-space()='Submit']");

    public static By topupAddFavouriteToast = By.xpath("//div[@id='toast-container']");

}
