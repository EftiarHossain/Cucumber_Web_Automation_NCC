package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PG003_DashboardOR;
import utils.Base;
import utils.Operations;

import static org.junit.Assert.assertTrue;

public class PM002_Dashboard extends Base {

    @Then("I can see my Accounts")
    public void iCanSeeMyAccounts() {
        Operations.verifyElementIsPresent(PG003_DashboardOR.dashboardAccountTab, driver);
        Operations.click(PG003_DashboardOR.dashboardAccountTab, driver);
        Operations.waitUntilElementIsVisible(PG003_DashboardOR.dashboardAccountsCardsFirstCard, driver);
        Operations.verifyElementIsPresent(PG003_DashboardOR.dashboardAccountsCardsFirstCard, driver);
    }

    @When("I click on any Account")
    public void iClickOnAnyAccount() {
        Operations.verifyElementIsPresent(PG003_DashboardOR.dashboardAccountsCardsFirstCard, driver);
        Operations.click(PG003_DashboardOR.dashboardAccountsCardsFirstCard, driver);
        Operations.waitUntilElementIsVisible(PG003_DashboardOR.dashboardAccountDetailsHeader, driver);
    }

    @Then("I can see mini details of my Account")
    public void iCanSeeMiniDetailsOfMyAccount() {
        Operations.verifyElementIsPresent(PG003_DashboardOR.dashboardAccountDetailsHeader, driver);
        Operations.matchText(PG003_DashboardOR.dashboardAccountDetailsHeader, "Account Details" ,driver);
    }

    @When("I click on View Statement from the mini details")
    public void iClickOnViewStatementFromTheMiniDetails() {
        Operations.waitUntilElementIsVisible(PG003_DashboardOR.dashboardAccountsViewStatement, driver);
        Operations.verifyElementIsPresent(PG003_DashboardOR.dashboardAccountsViewStatement, driver);
        Operations.matchText(PG003_DashboardOR.dashboardAccountsViewStatement, "View Statement" ,driver);
        Operations.click(PG003_DashboardOR.dashboardAccountsViewStatement, driver);
        Operations.waitUntilElementIsVisible(PG003_DashboardOR.dashboardAccountsStatementTitle, driver);
        Operations.verifyElementIsPresent(PG003_DashboardOR.dashboardAccountsStatementTitle, driver);
        Operations.matchText(PG003_DashboardOR.dashboardAccountsStatementTitle,"Account Statement", driver);
    }

    @Then("I can see the Statement search by Account and able to download statements")
    public void iCanSeeStatementSearch() throws InterruptedException {
        Operations.waitUntilElementIsClickable(PG003_DashboardOR.dashboardAccountsStatementSelectDateRange, driver);
        Operations.click(PG003_DashboardOR.dashboardAccountsStatementSelectDateRange, driver);
        Operations.waitUntilElementIsClickable(PG003_DashboardOR.dashboardAccountsStatementSelectDateRangeCustom, driver);
        Operations.click(PG003_DashboardOR.dashboardAccountsStatementSelectDateRangeCustom, driver);
        Operations.waitUntilElementIsClickable(PG003_DashboardOR.dashboardAccountsStatementFromDate, driver);
        Operations.sleep(7000);
        Operations.click(PG003_DashboardOR.dashboardAccountsStatementFromDate, driver);
        Operations.clear(PG003_DashboardOR.dashboardAccountsStatementFromDate, driver);
        Operations.sendText(PG003_DashboardOR.dashboardAccountsStatementFromDate,"01/01/2023", driver);
        Operations.waitUntilElementIsClickable(PG003_DashboardOR.dashboardAccountsStatementToDate, driver);
        Operations.click(PG003_DashboardOR.dashboardAccountsStatementToDate, driver);
//        Operations.clear(PG003_DashboardOR.dashboardAccountsStatementToDate, driver);
        Operations.sendText(PG003_DashboardOR.dashboardAccountsStatementToDate,"01/06/2024", driver);
        Operations.waitUntilElementIsClickable(PG003_DashboardOR.dashboardAccountsStatementSubmitBtn, driver);
        Operations.click(PG003_DashboardOR.dashboardAccountsStatementSubmitBtn, driver);
        Operations.waitUntilElementIsClickable(PG003_DashboardOR.dashboardAccountsStatementDownloadBtn, driver);
        Operations.click(PG003_DashboardOR.dashboardAccountsStatementDownloadBtn, driver);
        Operations.waitUntilElementIsClickable(PG003_DashboardOR.dashboardAccountsStatementDownloadPdfBtn, driver);
        Operations.waitUntilElementIsClickable(PG003_DashboardOR.dashboardAccountsStatementDownloadExcelBtn, driver);
        Operations.click(PG003_DashboardOR.dashboardAccountsStatementDownloadPdfBtn, driver);
        Operations.click(PG003_DashboardOR.dashboardAccountsStatementDownloadExcelBtn, driver);

    }

    @Then("I can click on the Card Tab to see my Credit Cards")
    public void iCanClickOnTheCardTabToSeeMyCreditCards() {

    }

    @When("I click on any Card")
    public void iClickOnAnyCard() {

    }

    @Then("I can see mini details of the card")
    public void iCanSeeMiniDetailsOfTheCard() {

    }

    @When("I click on the Info button")
    public void iClickOnInfoButton() {

    }

    @Then("I can see Card details")
    public void iCanSeeCardDetails() {

    }

    @Then("I can see Endorsement Info")
    public void iCanSeeEndorsementInfo() {

    }

    @Then("I can see Transaction History")
    public void iCanSeeTransactionHistory() {

    }

    @Then("I can see Unbilled Transaction")
    public void iCanSeeUnbilledTransaction() {

    }


}
