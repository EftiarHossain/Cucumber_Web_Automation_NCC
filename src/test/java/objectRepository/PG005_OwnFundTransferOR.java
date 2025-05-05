package objectRepository;

import org.openqa.selenium.By;

public class PG005_OwnFundTransferOR {
    public static By ownAccountSearchField = By.xpath("//input[@placeholder='Search']");

    //From Account Number Selection
    public static By ownAccountListFirstAccount = By.xpath("//body[1]/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/button[1]");
    public static By ownAccountListSecondAccount = By.xpath("//body[1]/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/button[1]");
    public static By ownTransferFromAccountDropdown = By.xpath("//mat-select[@role='combobox']//div//div//div//*[name()='svg']");

    //Transfer Details Page Title
    public static By ownTransferDetailsScreenTitle = By.xpath("//h1[normalize-space()='Own Account Transfer']");
    public static By ownTransferDetailsToAccount = By.xpath("//body/app-root/layout/classy-layout/div/div/app-bank-account-own-details/div/div/form/div/div[1]/div[1]/div[1]");

    //Available Balance
    public static By ownTransferDetailsAvailableBalance = By.xpath("//input[@aria-invalid='false']");

    public static By ownTransferDetailsServiceCharge = By.xpath("//body[1]/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own-details[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]");
    public static By ownTransferDetailsGrantTotal = By.xpath("//body[1]/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own-details[1]/div[1]/div[1]/form[1]/div[1]/div[7]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]");

    public static By ownFundTransferTransferType = By.xpath("//li[contains(text(),'Own Account')]");
    public static By ownFundTransferTermsAndConditionCheckbox = By.xpath("//body[1]/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own-details[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/mat-checkbox[1]/div[1]/div[1]/input[1]");

    public static By ownFundTransferSuccessScreenTransferType = By.xpath("//body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-otp-dialog-fund-transfer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[1]/li[2]");
    public static By ownFundTransferTransactionID = By.xpath("//body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-otp-dialog-fund-transfer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[2]/li[2]");
}
