package objectRepository;

import org.openqa.selenium.By;

public class PG012_PaymentExecutionFromTransactionHistory {
    public static By transactionHistorySideMenu = By.xpath("//span[normalize-space()='Transaction History']");

    public static By pageTitleTransactionHistory = By.xpath("//h1[normalize-space()='Transaction History']");
    public static By clickTransactionType = By.xpath("//span[normalize-space()='--Select Transaction Type--']");
    public static By selectMobileRecharge = By.xpath("//*[@id=\"mat-option-4\"]");
    public static By filterButton = By.xpath("//button[normalize-space()='Filter']");

    public static By actionColumn = By.xpath("//th[normalize-space()='Action']");
    public static By topUpAgainButton = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-transaction-history/div/div/div[2]/div/table/tbody/tr[1]/td[16]/button");
    public static By topUpDetailsPage = By.xpath("//h1[normalize-space()='Top Up Details']");

    public static By amountFromTransactionHistory = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-transaction-history/div/div/div[2]/div/table/tbody/tr[1]/td[6]");
    public static By amountFromTopUpDetails = By.xpath("//input[@placeholder='Enter Amount']");

    public static By ToAccountFromTransactionHistory = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-transaction-history/div/div/div[2]/div/table/tbody/tr/td[5]");
    public static By ToAccountFromTopUpDetails = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-mobile-recharge-details/div/div/form/div/div[1]/div/div/div[1]/div[2]/h2");

    public static By fromAccountForTransactionHistory = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-transaction-history/div/div/div[2]/div/table/tbody/tr/td[4]");
    public static By fromAccountForTopUpDetails = By.xpath("//*[@id=\"mat-select-value-5\"]/span/span");

    public static By selectMFSTransfer = By.xpath("//span[normalize-space()='MFS Transfer']");
    public static By selectTransactionItem = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-transaction-history/div/div/div[2]/div/table/tbody/tr/td[11]");
    public static By MFSPageTitle = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-mfs-transfer-without-beneficiary/div/div/div/h1");
    public static By ToAccountForMFSDetailsPage = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-mfs-transfer-without-beneficiary/div/div/form/div/div[1]/div/div/div/div[2]/h2");
    public static By FromAccountForMFS = By.xpath("//*[@id=\"mat-select-value-11\"]/span/span");
    public static By amountFromMFSDetails = By.xpath("//input[@placeholder='Enter Transfer Amount']");

    public static By selectOwnAccount = By.xpath("//span[normalize-space()='Own Account']");
    public static By OwnAccountFTPageTitle = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-bank-account-own-details/div/div/div/h1");
    public static By ToAccountForOwnAccountFT = By.xpath("/html/body/app-root/layout/classy-layout/div/div[2]/app-bank-account-own-details/div/div/form/div/div[1]/div/div/div/div[2]/h2");
    public static By FromAccountForOwnAccountFT = By.xpath("//*[@id=\"mat-select-value-17\"]/span/span");

    public static By selectOtherBankBEFTN = By.xpath("//*[@id=\"mat-option-8\"]/span");


}
