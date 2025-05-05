package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PG003_DashboardOR;
import objectRepository.PG004_FundTransfer;
import objectRepository.PG005_OwnFundTransferOR;
import org.openqa.selenium.By;
import utils.Base;
import utils.MailosaurOTP;
import utils.Operations;

public class PM003_OwnFundTransfer extends Base {

    @When("I navigate to the Own Account Fund Transfer")
    public void iNavigateToTheOwnAccountFundTransfer() {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.navBarFundTransfer, driver);
        Operations.click(PG004_FundTransfer.navBarFundTransfer, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.navBarOwnFundTransfer, driver);
        Operations.click(PG004_FundTransfer.navBarOwnFundTransfer, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.fundTransferTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.continueWithFavourite, driver);
        Operations.verifyElementIsPresent(PG005_OwnFundTransferOR.ownAccountSearchField, driver);
    }

    @Then("I can see my Account list to transfer money")
    public void iCanSeeMyAccountListToTransferMoney() {
        Operations.waitUntilElementIsVisible(PG005_OwnFundTransferOR.ownAccountListFirstAccount, driver);
        Operations.verifyElementIsPresent(PG005_OwnFundTransferOR.ownAccountListFirstAccount, driver);
        Operations.waitUntilElementIsVisible(PG005_OwnFundTransferOR.ownAccountListSecondAccount, driver);
        Operations.verifyElementIsPresent(PG005_OwnFundTransferOR.ownAccountListSecondAccount, driver);
    }

    @Then("I select an Account {string} to transfer money")
    public void iSelectAnAccountToTransferMoney(String toAccount) throws InterruptedException {
        By ownTransferToAccount = By.xpath("//h3[normalize-space()='" + toAccount + "']");
        Operations.click(ownTransferToAccount, driver);
        Thread.sleep(2000);
    }

    @Then("I select from account {string} and available balance populated")
    public void iNavigatedToTheTransferDetailsScreen(String fromAccount) throws InterruptedException {
        Operations.waitUntilElementIsVisible(PG005_OwnFundTransferOR.ownTransferDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG005_OwnFundTransferOR.ownTransferDetailsScreenTitle, driver);

        Operations.waitUntilElementIsClickable(PG005_OwnFundTransferOR.ownTransferFromAccountDropdown, driver);
        Operations.click(PG005_OwnFundTransferOR.ownTransferFromAccountDropdown, driver);
        By ownTransferFromAccount = By.xpath("//span[contains(text(),'" + fromAccount + "')]");
        Operations.click(ownTransferFromAccount, driver);
        Thread.sleep(2000);

        Operations.waitUntilElementIsVisible(PG005_OwnFundTransferOR.ownTransferDetailsAvailableBalance, driver);
        Operations.verifyElementIsPresent(PG005_OwnFundTransferOR.ownTransferDetailsAvailableBalance, driver);
    }

    @Then("I input transfer amount {string} below my available balance and remarks and confirm next to continue")
    public void iInputTransferAmountAndRemarksToContinue(String transferAmount) {
        Operations.waitUntilElementIsClickable(PG004_FundTransfer.transferDetailsTransferAmount, driver);
        Operations.click(PG004_FundTransfer.transferDetailsTransferAmount, driver);
        Operations.sendText(PG004_FundTransfer.transferDetailsTransferAmount,transferAmount, driver);
        Operations.sendText(PG004_FundTransfer.transferDetailsRemarks,"AutomatedTest", driver);
        Operations.waitUntilElementIsClickable(PG004_FundTransfer.transferDetailsNextButton, driver);
        Operations.click(PG004_FundTransfer.transferDetailsNextButton, driver);
    }

}
