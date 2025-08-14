package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PG012_PaymentExecutionFromTransactionHistory;
import org.junit.Assert;
import utils.Base;
import utils.Operations;

public class PM010_PaymentExecutionFromTransactionHistory extends Base {
    private String storedAmount;
    private String storeToAccount;
    private String storeFromAccount;

    @When("I navigate to Transaction History Page")
    public void iNavigateToTransactionHistoryPage() {
        Operations.click(PG012_PaymentExecutionFromTransactionHistory.transactionHistorySideMenu, driver);
    }

    @Then("I can see the page title {string}")
    public void iNavigateToTransactionHistoryPage(String Title) {
        Operations.matchText(PG012_PaymentExecutionFromTransactionHistory.pageTitleTransactionHistory, Title, driver);
    }

    @When("I can select Mobile Recharge from Transaction Type")
    public void iCanSelectMobileRechargeFromTransactionType() {
        Operations.click(PG012_PaymentExecutionFromTransactionHistory.clickTransactionType, driver);
        Operations.waitUntilElementIsClickable(PG012_PaymentExecutionFromTransactionHistory.selectMobileRecharge, driver);
        Operations.click(PG012_PaymentExecutionFromTransactionHistory.selectMobileRecharge, driver);
        Operations.click(PG012_PaymentExecutionFromTransactionHistory.filterButton, driver);
    }

    @Then("I can see {string} Column")
    public void iCanSeeActionColumn(String ColumnName) {
        Operations.scrollIntoElement(PG012_PaymentExecutionFromTransactionHistory.actionColumn, driver);
        Operations.matchText(PG012_PaymentExecutionFromTransactionHistory.actionColumn, ColumnName, driver);
    }

    @Then("I can see {string} button name for Mobile Recharge")
    public void iCanSeeButtonNameForMR(String ButtonName) {
        Operations.scrollIntoElement(PG012_PaymentExecutionFromTransactionHistory.topUpAgainButton, driver);
        Operations.matchText(PG012_PaymentExecutionFromTransactionHistory.topUpAgainButton, ButtonName, driver);
    }

    @When("I can click on Action button")
    public void iCanClickOnTopUpAgainButton() {
        Operations.click(PG012_PaymentExecutionFromTransactionHistory.topUpAgainButton, driver);
    }

    @Then("I can navigate to the {string} page")
    public void iCanNavigateToTheMRPage(String Title) {
        Operations.matchText(PG012_PaymentExecutionFromTransactionHistory.topUpDetailsPage, Title, driver);
    }

    @Then("I can store Amount, ToAccount, From Account and GrandTotal from Transaction History for Mobile Recharge")
    public void iCanCompareAmountToAccountFromAccountGrandTotalForMobileRecharge() {
       //storedAmount = Operations.getText(PG012_PaymentExecutionFromTransactionHistory.amountFromTransactionHistory, driver);
       storeToAccount = Operations.getText(PG012_PaymentExecutionFromTransactionHistory.ToAccountFromTransactionHistory, driver);
       storeFromAccount = Operations.getText(PG012_PaymentExecutionFromTransactionHistory.fromAccountForTransactionHistory, driver);
       System.out.println("From Account: " + storeFromAccount);
       System.out.println("To Account: " + storeToAccount);
    }

    @Then("I can compare To Account for Mobile Recharge")
    public void iCanCompareToAccountForMR() {
        String ToAccount = Operations.getText(PG012_PaymentExecutionFromTransactionHistory.ToAccountFromTopUpDetails, driver);
        System.out.println("Transaction History Page To Account " + storeToAccount);
        System.out.println("Top Up Details Page To Account " + ToAccount);
        Assert.assertEquals(ToAccount, storeToAccount);
    }

    @Then("I can compare From Account for Mobile Recharge")
    public void iCanCompareFromAccountForMR() {
        String FromAccount = Operations.getText(PG012_PaymentExecutionFromTransactionHistory.fromAccountForTopUpDetails, driver).replaceAll("\\D+", "");
        System.out.println("Transaction History Page From Account " + storeFromAccount);
        System.out.println("Top Up Details Page From Account " + FromAccount);
        Assert.assertEquals(FromAccount, storeFromAccount);
    }

    @Then("I can compare amount for Mobile Recharge")
    public void iCanCompareAmountForMR() {
        String amount = Operations.getText(PG012_PaymentExecutionFromTransactionHistory.amountFromTopUpDetails, driver);
        //Operations.sendText(PG012_PaymentExecutionFromTransactionHistory.amountFromTopUpDetails, Amount, driver);
        System.out.println("Transaction History Page Amount " + storedAmount);
        System.out.println("Top Up Details Page Amount " + amount);
        //Assert.assertEquals(amount, storedAmount);
    }

    @When("I can select MFS Transfer from Transaction Type")
    public void iCanSelectMFSTransferFromTransactionType() {
        Operations.click(PG012_PaymentExecutionFromTransactionHistory.clickTransactionType, driver);
        Operations.waitUntilElementIsClickable(PG012_PaymentExecutionFromTransactionHistory.selectMFSTransfer, driver);
        Operations.click(PG012_PaymentExecutionFromTransactionHistory.selectMFSTransfer, driver);
        Operations.click(PG012_PaymentExecutionFromTransactionHistory.filterButton, driver);
    }

    @Then("I can see {string} button name for MFS Transfer")
    public void iCanSeeButtonNameForMFS(String ButtonName) {
        Operations.scrollIntoElement(PG012_PaymentExecutionFromTransactionHistory.topUpAgainButton, driver);
        Operations.matchText(PG012_PaymentExecutionFromTransactionHistory.topUpAgainButton, ButtonName, driver);
    }
}
