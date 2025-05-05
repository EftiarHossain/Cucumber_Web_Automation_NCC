package objectRepository;

import org.openqa.selenium.By;

public class PG007_OtherFundTransferOR {
    //From Account Number Selection
    public static By otherTransferFromAccountDropdown = By.xpath("//body//app-root//div//div//div//div//div//div[1]//div[1]//mat-form-field[1]//div[1]//div[2]//div[1]//mat-select[1]//div[1]//div[2]//div[1]//*[name()='svg']");

    //Transfer Details Page Title
    public static By otherTransferDetailsScreenTitle = By.xpath("//h1[normalize-space()='Other Bank Transfer']");

    //To Account Number
    public static By otherTransferDetailsToAccountField = By.xpath("//input[@placeholder='Enter To Account/Card Number']");

    //TO Account Name
    public static By otherTransferDetailsAccountNameInputField = By.xpath("//input[@formcontrolname='toAccountName']");

    //Available Balance
    public static By otherTransferDetailsAvailableBalance = By.xpath("//input[@aria-invalid='false']");

    public static By otherTransferDetailsAccountTypeSelection = By.xpath("//span[normalize-space()='--Select Account Type--']");
    public static By otherTransferDetailsAccountTypeSelectionAccount = By.xpath("//span[normalize-space()='ACCOUNT']");
    public static By otherTransferDetailsAccountTypeSelectionCard = By.xpath("//span[normalize-space()='CARD']");
    public static By otherTransferDetailsBankSelectionField = By.xpath("//span[normalize-space()='--Select Bank--']");
    public static By otherTransferDetailsSelectedBank = By.xpath("//mat-option[@role='option']//span[contains(text(),'AB BANK LTD.')]");
    public static By otherTransferDetailsDistrictSelectionField = By.xpath("//span[normalize-space()='--Select District--']");
    public static By otherTransferDetailsSelectedDistrict = By.xpath("//mat-option[@role='option']//span[contains(text(),'TANGAIL')]");
    public static By otherTransferDetailsBranchSelectionField = By.xpath("//span[normalize-space()='--Select Branch--']");
    public static By otherTransferDetailsSelectedBranch = By.xpath("//mat-option[@role='option']//span[contains(text(),'TANGAIL')]");
    public static By otherTransferDetailsNPSBToggle = By.xpath("//input[@value='NPSB']");
    public static By otherTransferDetailsBFTNToggle = By.xpath("//input[@value='BEFTN']");
}
