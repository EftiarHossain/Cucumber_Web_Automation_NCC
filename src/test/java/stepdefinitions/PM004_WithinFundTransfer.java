package stepdefinitions;

import io.cucumber.java.en.Then;
import objectRepository.PG004_FundTransfer;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.Base;
import utils.Operations;

public class PM004_WithinFundTransfer extends Base {

    @Then("I navigate to the Within Account Fund Transfer")
    public void iNavigateToTheWithinAccountFundTransfer() {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.navBarFundTransfer, driver);
        Operations.click(PG004_FundTransfer.navBarFundTransfer, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.navBarWithinFundTransfer, driver);
        Operations.click(PG004_FundTransfer.navBarWithinFundTransfer, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.fundTransferTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.continueWithFavourite, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.beneficiarySearchField, driver);
    }

    @Then("I click on Continue Without Beneficiary to Transfer Money")
    public void iClickOnContinueWithoutBeneficiary() {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.fundTransferTitle, driver);
        Operations.click(PG004_FundTransfer.oneTimePayBtn, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.transferDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsScreenTitle, driver);
    }

    @Then("I select From Account Number {string}, input To Account Number {string}, transfer amount {string} below my available balance and remarks and confirm next to continue")
    public void iFilledTransferDetailsScreen(String fromAccount, String accountNumber, String amount) throws InterruptedException {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.transferDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsScreenTitle, driver);
        Operations.waitUntilElementIsClickable(PG004_FundTransfer.withinTransferFromAccountDropdown, driver);
        Operations.click(PG004_FundTransfer.withinTransferFromAccountDropdown, driver);
        By withinTransferFromAccount = By.xpath("//span[contains(text(),'" + fromAccount + "')]");
        Operations.click(withinTransferFromAccount, driver);
        Thread.sleep(2000);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.withinTransferDetailsAvailableBalance, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.withinTransferDetailsAvailableBalance, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.withinTransferDetailsToAccountField, driver);
        Operations.click(PG004_FundTransfer.withinTransferDetailsToAccountField, driver);
        Operations.sendText(PG004_FundTransfer.withinTransferDetailsToAccountField, accountNumber, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsTransferAmount, driver);
        Operations.click(PG004_FundTransfer.transferDetailsTransferAmount, driver);
        Operations.sleep(3000);
        Operations.sendText(PG004_FundTransfer.transferDetailsTransferAmount, amount, driver);
        Operations.sendText(PG004_FundTransfer.transferDetailsRemarks,"AutomatedTest", driver);
        Operations.waitUntilElementIsClickable(PG004_FundTransfer.transferDetailsNextButton, driver);
        Operations.click(PG004_FundTransfer.transferDetailsNextButton, driver);
    }

}
