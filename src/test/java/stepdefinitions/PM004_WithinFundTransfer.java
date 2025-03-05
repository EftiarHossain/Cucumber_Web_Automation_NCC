package stepdefinitions;

import io.cucumber.java.en.Then;
import objectRepository.PG004_FundTransfer;
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
        Operations.click(PG004_FundTransfer.continueWithoutBeneficiaryBtn, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.transferDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsScreenTitle, driver);
    }

    @Then("I navigated to the transfer details screen for Within FT with a selected from account and available balance populated")
    public void iNavigatedToTheTransferDetailsScreenWithinFT() {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.transferDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsScreenTitle, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.withinTransferDetailsToAccountField, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.withinTransferDetailsToAccountField, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.withinTransferDetailsAvailableBalance, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.withinTransferDetailsAvailableBalance, driver);
    }

    @Then("I input To Account Number {string}, transfer amount {string} below my available balance and remarks and confirm next to continue")
    public void iFilledTransferDetailsScreen(String accountNumber, String amount) throws InterruptedException {
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
