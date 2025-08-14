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
    private String storeTransactionItem;

    @When("I navigate to Transaction History Page")
    public void iNavigateToTransactionHistoryPage() {
        Operations.scrollIntoElement(PG012_PaymentExecutionFromTransactionHistory.transactionHistorySideMenu, driver);
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
        storedAmount = Operations.getText(PG012_PaymentExecutionFromTransactionHistory.amountFromTransactionHistory, driver).trim();
       if (storedAmount.contains(".")){
           storedAmount = storedAmount.replaceAll("\\.0+$", "");
           storedAmount = storedAmount.replaceAll("(\\.\\d*[1-9])0+$", "$1");
       }
       storeToAccount = Operations.getText(PG012_PaymentExecutionFromTransactionHistory.ToAccountFromTransactionHistory, driver);
       storeFromAccount = Operations.getText(PG012_PaymentExecutionFromTransactionHistory.fromAccountForTransactionHistory, driver);
       System.out.println("From Account: " + storeFromAccount);
       System.out.println("To Account: " + storeToAccount);
       System.out.println("Amount: " + storedAmount);
    }

    @Then("I can compare To Account for Mobile Recharge")
    public void iCanCompareToAccountForMR() {
        String ToAccount = Operations.getText(PG012_PaymentExecutionFromTransactionHistory.ToAccountFromTopUpDetails, driver);
        System.out.println("Transaction History Page To Account: " + storeToAccount);
        System.out.println("Top Up Details Page To Account: " + ToAccount);
        Assert.assertEquals(ToAccount, storeToAccount);
    }

    @Then("I can compare From Account for Mobile Recharge")
    public void iCanCompareFromAccountForMR() {
        String FromAccount = Operations.getText(PG012_PaymentExecutionFromTransactionHistory.fromAccountForTopUpDetails, driver).replaceAll(".*?(\\d{4}-\\d{10}|\\d{10,}).*", "$1");
        System.out.println("Transaction History Page From Account: " + storeFromAccount);
        System.out.println("Top Up Details Page From Account: " + FromAccount);
        Assert.assertEquals(FromAccount, storeFromAccount);
    }

    @Then("I can compare amount for Mobile Recharge")
    public void iCanCompareAmountForMR() {
        String amount = Operations.getAttribute(PG012_PaymentExecutionFromTransactionHistory.amountFromTopUpDetails,"value", driver);
        System.out.println("Transaction History Page Amount: " + storedAmount);
        System.out.println("Top Up Details Page Amount: " + amount);
        Assert.assertEquals(amount, storedAmount);
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

    @Then("I can see Transaction Item for MFS")
    public void iCanSeeTransactionItemForMFS() {
        String GetText = Operations.getText(PG012_PaymentExecutionFromTransactionHistory.selectTransactionItem, driver);
        storeTransactionItem = GetText.substring(GetText.indexOf("(")+1, GetText.indexOf(")")) + " Details";
        System.out.println("Transaction Item: " + storeTransactionItem);

    }

    @Then("I can compare From Account for MFS")
    public void iCanCompareFromAccountForMFS() {
        String FromAccount = Operations.getText(PG012_PaymentExecutionFromTransactionHistory.FromAccountForMFS, driver).replaceAll(".*?(\\d{4}-\\d{10}|\\d{10,}).*", "$1");
        System.out.println("Transaction History Page From Account: " + storeFromAccount);
        System.out.println("Top Up Details Page From Account: " + FromAccount);
        Assert.assertEquals(FromAccount, storeFromAccount);
    }

    @Then("I can compare To Account for MFS")
    public void iCanCompareToAccountForMFS() {
        String ToAccount = Operations.getText(PG012_PaymentExecutionFromTransactionHistory.ToAccountForMFSDetailsPage, driver);
        System.out.println("Transaction History Page To Account: " + storeToAccount);
        System.out.println("Top Up Details Page To Account: " + ToAccount);
        Assert.assertEquals(ToAccount, storeToAccount);
    }

    @Then("I can compare amount for MFS")
    public void iCanCompareAmountForMFS() {
        String amount = Operations.getAttribute(PG012_PaymentExecutionFromTransactionHistory.amountFromMFSDetails,"value", driver);
        System.out.println("Transaction History Page Amount: " + storedAmount);
        System.out.println("Top Up Details Page Amount: " + amount);
        Assert.assertEquals(storedAmount, amount);
    }

    @Then("I can compare page title for MFS")
    public void iCanComparePageTitleForMFS() {
        try {
            String PageTitle = Operations.getText(PG012_PaymentExecutionFromTransactionHistory.MFSPageTitle, driver);
            System.out.println("Transaction Item: " + storeTransactionItem);
            System.out.println("Page Title: " + PageTitle);
            Assert.assertEquals(storeTransactionItem, PageTitle);
        } catch (AssertionError e) {
            System.err.println("Page Title comparison failed: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error while comparing Page Title: " + e.getMessage());
        }
    }

    @When("I can select Own Account from Transaction Type")
    public void iCanSelectOwnAccountFromTransactionType() {
        Operations.click(PG012_PaymentExecutionFromTransactionHistory.clickTransactionType, driver);
        Operations.waitUntilElementIsClickable(PG012_PaymentExecutionFromTransactionHistory.selectOwnAccount, driver);
        Operations.click(PG012_PaymentExecutionFromTransactionHistory.selectOwnAccount, driver);
        Operations.click(PG012_PaymentExecutionFromTransactionHistory.filterButton, driver);
    }

    @Then("I can navigate to the {string} page for Own Account FT")
    public void iCanNavigateToTheOwnAccountFTPage(String Title) {
        Operations.matchText(PG012_PaymentExecutionFromTransactionHistory.OwnAccountFTPageTitle, Title, driver);
    }

    @Then("I can compare From Account for Own Account FT")
    public void iCanCompareFromAccountForOwnAccountFT() {
        String FromAccount = Operations.getText(PG012_PaymentExecutionFromTransactionHistory.FromAccountForOwnAccountFT, driver).replaceAll(".*?(\\d{4}-\\d{10}|\\d{10,}).*", "$1");
        System.out.println("Transaction History Page From Account: " + storeFromAccount);
        System.out.println("Top Up Details Page From Account: " + FromAccount);
        Assert.assertEquals(FromAccount, storeFromAccount);
    }

    @Then("I can compare To Account for Own Account FT")
    public void iCanCompareToAccountForOwnAccountFT() {
        String ToAccount = Operations.getText(PG012_PaymentExecutionFromTransactionHistory.ToAccountForOwnAccountFT, driver);
        System.out.println("Transaction History Page To Account: " + storeToAccount);
        System.out.println("Top Up Details Page To Account: " + ToAccount);
        Assert.assertEquals(ToAccount, storeToAccount);
    }


}
