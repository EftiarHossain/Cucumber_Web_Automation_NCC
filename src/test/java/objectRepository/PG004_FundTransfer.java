package objectRepository;

import org.openqa.selenium.By;

public class PG004_FundTransfer {

    public static By navBarFundTransfer = By.xpath("//span[text()=' Fund Transfer ']");
    public static By navBarOwnFundTransfer = By.xpath("//span[contains(text(),'Own Account')]");
    public static By navBarWithinFundTransfer = By.xpath("//span[contains(text(),'Within Bank Account')]");
    public static By navBarOtherFundTransfer = By.xpath("//span[contains(text(),'Other Bank Account')]");
    public static By navBarMFSFundTransfer = By.xpath("//span[normalize-space()='MFS Fund Transfer']");

    public static By fundTransferTitle = By.xpath("//h1[contains(text(),'Fund Transfer')]");
    public static By mfsTransferTitle = By.xpath("//h1[normalize-space()='MFS Transfer']");
    public static By selectMfsTransferTitle = By.xpath("//mat-label[normalize-space()='Select MFS']");

    public static By continueWithFavourite = By.xpath("//h1[contains(text(),'Continue With Favourite')]");
    public static By ownAccountSearchField = By.xpath("//body[1]/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/form[1]/mat-form-field[1]/div[1]/div[2]/div[2]/input[1]");
    public static By beneficiarySearchField = By.xpath("//input[@placeholder='Search Beneficiary']");
    public static By oneTimePayBtn = By.xpath("//h1[normalize-space()='One Time Pay']");

    public static By ownAccountListFirstAccount = By.xpath("//body/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/button[1]");
    public static By ownAccountListSecondAccount = By.xpath("//body/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/button[1]");
    public static By withinTransferFromAccountDropdown = By.xpath("//mat-select[@role='combobox']//div//div//div//*[name()='svg']");
    //public static By withinTransferFromAccount = By.xpath("//span[contains(text(),'" + accountName + "')]");

    public static By transferDetailsScreenTitle = By.xpath("//h1[normalize-space()='NCC Bank Account Transfer']");
    public static By ownTransferDetailsToAccount = By.xpath("//body/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own-details[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]");
    public static By withinTransferDetailsToAccountField = By.xpath("//input[@placeholder='Enter To Account']");
    public static By otherTransferDetailsToAccountField = By.xpath("//input[@placeholder='Enter To Account/Card Number']");
    public static By otherTransferDetailsAccountNameInputField = By.xpath("//input[@formcontrolname='toAccountName']");
    public static By mfsBkashToAccountInputField = By.xpath("//input[@placeholder='Enter bKash no.']");

    public static By ownTransferDetailsAvailableBalance = By.xpath("//input[@aria-invalid='false']");
    public static By withinTransferDetailsAvailableBalance = By.xpath("//input[@aria-invalid='false']");
    public static By otherTransferDetailsAvailableBalance = By.xpath("//input[@aria-invalid='false']");
    public static By mfsTransferDetailsAvailableBalance = By.xpath("//input[@aria-invalid='false']");

    public static By otherTransferDetailsAccountTypeSelection = By.xpath("//span[normalize-space()='--Select Account Type--']");
    public static By otherTransferDetailsAccountTypeSelectionAccount = By.xpath("//span[normalize-space()='ACCOUNT']");
    public static By otherTransferDetailsAccountTypeSelectionCard = By.xpath("//span[normalize-space()='CARD']");
    public static By otherTransferDetailsBankSelectionField = By.xpath("//span[normalize-space()='--Select Bank--']");
    public static By otherTransferDetailsSelectedBank = By.xpath("//mat-option[@role='option']//span[contains(text(),'Al-Arafah Islami Bank Limited')]");
    public static By otherTransferDetailsDistrictSelectionField = By.xpath("//span[normalize-space()='--Select District--']");
    public static By otherTransferDetailsSelectedDistrict = By.xpath("//mat-option[@role='option']//span[contains(text(),'BAGERHAT')]");
    public static By otherTransferDetailsBranchSelectionField = By.xpath("//span[normalize-space()='--Select Branch--']");
    public static By otherTransferDetailsSelectedBranch = By.xpath("//mat-option[@role='option']//span[contains(text(),'BAGERHAT')]");
    public static By otherTransferDetailsNPSBToggle = By.xpath("//input[@value='NPSB']");
    public static By otherTransferDetailsBFTNToggle = By.xpath("//input[@value='BEFTN']");

    public static By transferDetailsTransferAmount = By.xpath("//input[@placeholder='Enter Transfer Amount']");
    public static By transferDetailsTransferAmountSlab = By.xpath("//input[@placeholder='Enter Transfer Amount']");
    public static By transferDetailsRemarks = By.xpath("//input[@placeholder='Remarks']");
    public static By ownTransferDetailsServiceCharge = By.xpath("//body[1]/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own-details[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]");
    public static By ownTransferDetailsGrantTotal = By.xpath("//body[1]/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own-details[1]/div[1]/div[1]/form[1]/div[1]/div[7]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]");
    public static By transferDetailsNextButton = By.xpath("//button[contains(text(),'Next')]");
    public static By mFSTransferDetailsConfirmButton = By.xpath("//button[contains(text(),'Confirm')]");

    public static By transferDetailsCancelButton = By.xpath("//button[contains(text(),'Cancel')]");
    public static By transferDetailsToastContainer = By.xpath("//div[@id='toast-container']");

    public static By fundTransferReviewPageTitle = By.xpath("//h1[normalize-space()='Review']");
    public static By ownFundTransferTransferType = By.xpath("//li[contains(text(),'Own Account')]");
    public static By fundTransferAuthenticationTypeSMS = By.xpath("//label[contains(text(),'SMS')]");
    public static By fundTransferAuthenticationTypeEmail = By.xpath("//label[normalize-space()='Email']");
    public static By fundTransferTermsAndConditionLink = By.xpath("//span[contains(text(),'Terms & Conditions')]");
    public static By ownFundTransferTermsAndConditionCheckbox = By.xpath("//body[1]/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own-details[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/mat-checkbox[1]/div[1]/div[1]/input[1]");
    public static By fundTransferTermsAndConditionCheckbox = By.xpath("//input[@type='checkbox']");

    public static By fundTransferTermsAndConditionDialogue = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]");

    public static By fundTransferSendOtpButton = By.xpath("//button[normalize-space()='Send OTP']");
    public static By fundTransferOTPInput = By.xpath("//span[1]//input[1]");
    public static By fundTransferResendOTP = By.xpath("//strong[contains(text(),'Resend OTP')]");
    public static By fundTransferTransferBtn = By.xpath("//button[normalize-space()='Transfer']");
    public static By mFSFundTransferOTPInputNext = By.xpath("//button[normalize-space()='Next']");
    public static By fundTransferOTPInputCancel = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-otp-dialog-fund-transfer[1]/div[2]/div[1]/button[1]");

    public static By ownFundTransferSuccessScreenTransferType = By.xpath("//body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-otp-dialog-fund-transfer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[1]/li[2]");
    public static By ownFundTransferTransactionID = By.xpath("//body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-otp-dialog-fund-transfer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[2]/li[2]");

    public static By fundTransferGoToHome = By.xpath("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-otp-dialog-fund-transfer/div[2]/div[2]/button[1]");

    public static By fundTransferAddToFavourite = By.xpath("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-otp-dialog-fund-transfer/div[2]/button");

    public static By fundTransferDownloadReceipt = By.xpath("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-otp-dialog-fund-transfer/div[2]/div[2]/button[2]");

    public static By fundTransferAddFavouriteTitle = By.xpath("//*[@id=\"mat-mdc-dialog-1\"]/div/div/div/h2");
    public static By fundTransferAddFavouriteSubTitle = By.xpath("//p[contains(text(),'Enter the name of your favourite:')]");
    public static By fundTransferAddFavouriteInputField = By.xpath("//*[@id=\"mat-mdc-dialog-1\"]/div/div/div/mat-dialog-content/input");
    public static By fundTransferAddFavouriteSaveButton = By.xpath("//button[contains(text(),'Submit')]");

    public static By fundTransferAddFavouriteToast = By.xpath("//div[@id='toast-container']");

}
