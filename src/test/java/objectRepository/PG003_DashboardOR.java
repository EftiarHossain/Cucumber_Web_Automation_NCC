package objectRepository;

import org.openqa.selenium.By;

public class PG003_DashboardOR {
    public static By dashboardNavBar = By.xpath("//span[contains(text(),'Dashboard')]");

    public static By dashboardAccountTab = By.xpath("//mat-tab-header/div[1]/div[1]/div[1]/div[1]/span[2]/span[1]");
    public static By dashboardFixedDepositTab = By.xpath("//span[contains(text(),'Fixed Deposit')]");
    public static By dashboardDPSTab = By.xpath("//span[contains(text(),'DPS')]");
    public static By dashboardLoanTab = By.xpath("//span[contains(text(),'Loan')]");
    public static By dashboardCardsTab = By.xpath("//span[contains(text(),'Cards')]");

    public static By dashboardAccountsCardsFirstCard = By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[1]/fuse-card[1]/div[1]/div[1]/div[1]");
    public static By viewDetailsBtn = By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[1]/fuse-card[1]/div[1]/div[3]/div[2]/button[1]");


    public static By dashboardAccountDetailsHeader = By.xpath("//h1[contains(text(),'Account Details')]");
    public static By dashboardFixedDepositDetailsHeader = By.xpath("//h1[contains(text(),'Fixed Deposit Account Details')]");
    public static By dashboardDPSDetailsHeader = By.xpath("//h1[contains(text(),'DPS Account Details')]");
    public static By dashboardLoanDetailsHeader = By.xpath("//h1[contains(text(),'Loan Account Details')]");
    public static By dashboardCardsDetailsHeader = By.xpath("//h1[contains(text(),'Card Details')]");
    public static By dashboardAccountsViewStatement = By.xpath("//button[contains(text(),'View Statement')]");

    public static By dashboardCardsViewDetails = By.xpath("//mat-icon[contains(text(),'info')]");

    public static By dashboardAccountsStatementTitle = By.xpath("//h1[contains(text(),'Account Statement')]");
    public static By dashboardAccountsStatementPageAccNumberDropdown = By.xpath("//body/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-statement[1]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[2]/div[1]");
    public static By dashboardAccountsStatementSelectDateRange = By.xpath("//span[normalize-space()='Select Date Range']");
    public static By dashboardAccountsStatementSelectDateRangeCustom = By.xpath("//label[normalize-space()='Custom']");
    public static By dashboardAccountsStatementFromDate = By.xpath("//input[@placeholder='From Date']");
    public static By dashboardAccountsStatementToDate = By.xpath("//input[@placeholder='To Date']");
    public static By dashboardAccountsStatementSubmitBtn = By.xpath("//button[contains(text(),'Submit')]");
    public static By dashboardAccountsStatementDownloadBtn = By.xpath("//button[contains(text(),'Download Statement')]");
    public static By dashboardAccountsStatementShareBtn = By.xpath("//button[contains(text(),'Share To Email')]");
    public static By dashboardAccountsStatementDownloadCancelBtn = By.xpath("//button[contains(text(),'Cancel')]");
    public static By dashboardAccountsStatementDownloadPdfBtn = By.xpath("//body/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-statement[1]/div[1]/div[1]/div[2]/div[3]/button[2]");
    public static By dashboardAccountsStatementDownloadExcelBtn = By.xpath("//body/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-statement[1]/div[1]/div[1]/div[2]/div[3]/button[3]");

    public static By dashboardCardsDetailsTitle = By.xpath("//h1[contains(text(),'CARD Details')]");
    public static By dashboardCardsDetailsEndorsement = By.xpath("//button[contains(text(),'Endorsement Info')]");
    public static By dashboardCardEndorsementBack = By.xpath("//button[contains(text(),//button[normalize-space()='Back']");
    public static By dashboardCardsDetailsHistory = By.xpath("//button[contains(text(),'Transaction History')]");
    public static By dashboardCardsDetailsUnbilled = By.xpath("//button[contains(text(),'Unbilled Transaction')]");

    public static By dashboardCardsTransactionHistory = By.xpath("//h1[contains(text(),'CARD Transaction History')]");
    public static By dashboardCardsTransactionHistoryBack = By.xpath("//button[contains(text(),'Back')]");
    public static By dashboardCardsTransactionHistoryDownload = By.xpath("//button[contains(text(),'Download')]");
    public static By dashboardCardsTransactionHistoryDownloadPdf = By.xpath("//span[contains(text(),'PDF')]");
    public static By dashboardCardsTransactionHistoryDownloadExcel = By.xpath("//span[contains(text(),'Excel')]");
    public static By dashboardCardsTransactionHistoryDownloadCancel = By.xpath("//button[contains(text(),'Cancel')]");

    public static By dashboardCardsUnbilledTransaction = By.xpath("//h1[contains(text(),'CARD Unbilled Transactions')]");


    public static By dashboardCardDetailsToast = By.xpath("//div[@id='toast-container']");



}
