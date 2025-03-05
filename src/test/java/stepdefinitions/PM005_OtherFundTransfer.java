package stepdefinitions;

import io.cucumber.java.en.Then;
import objectRepository.PG004_FundTransfer;
import utils.Base;
import utils.Operations;

public class PM005_OtherFundTransfer extends Base {

    @Then("I navigate to the Other Account Fund Transfer")
    public void iNavigateToTheWithinAccountFundTransfer() {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.navBarFundTransfer, driver);
        Operations.click(PG004_FundTransfer.navBarFundTransfer, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.navBarOtherFundTransfer, driver);
        Operations.click(PG004_FundTransfer.navBarOtherFundTransfer, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.fundTransferTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.continueWithFavourite, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.beneficiarySearchField, driver);
    }

    @Then("I navigated to the transfer details screen for Other FT with a selected from account and available balance populated")
    public void iNavigatedToTheTransferDetailsScreenWithinFT() {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.transferDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsScreenTitle, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.otherTransferDetailsToAccountField, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.otherTransferDetailsToAccountField, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.otherTransferDetailsAvailableBalance, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.otherTransferDetailsAvailableBalance, driver);
    }

    @Then("I input To Account Number {string}, To Account Name {string}, Select Account, Select Bank, Select District, Select Branch, Select NPSB, Input transfer amount {string} below my available balance and remarks and confirm next to continue")
    public void iFilledTransferDetailsScreenNPSBAccount(String accountNumber, String accountName, String amount) throws InterruptedException {
        Operations.verifyElementIsPresent(PG004_FundTransfer.otherTransferDetailsToAccountField, driver);

        Operations.click(PG004_FundTransfer.otherTransferDetailsToAccountField, driver);
        Operations.sendText(PG004_FundTransfer.otherTransferDetailsToAccountField, accountNumber, driver);

        Operations.sendText(PG004_FundTransfer.otherTransferDetailsAccountNameInputField, accountName, driver);

        Operations.click(PG004_FundTransfer.otherTransferDetailsAccountTypeSelection, driver);
        Operations.click(PG004_FundTransfer.otherTransferDetailsAccountTypeSelectionAccount, driver);

        Operations.click(PG004_FundTransfer.otherTransferDetailsBankSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.otherTransferDetailsSelectedBank, driver);
        Operations.click(PG004_FundTransfer.otherTransferDetailsSelectedBank, driver);
        Operations.sleep(3000);

        Operations.click(PG004_FundTransfer.otherTransferDetailsDistrictSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.otherTransferDetailsSelectedDistrict, driver);
        Operations.click(PG004_FundTransfer.otherTransferDetailsSelectedDistrict, driver);
        Operations.sleep(3000);

        Operations.click(PG004_FundTransfer.otherTransferDetailsBranchSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.otherTransferDetailsSelectedBranch, driver);
        Operations.click(PG004_FundTransfer.otherTransferDetailsSelectedBranch, driver);
        Operations.sleep(3000);

        Operations.click(PG004_FundTransfer.otherTransferDetailsNPSBToggle, driver);

        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsTransferAmount, driver);
        Operations.click(PG004_FundTransfer.transferDetailsTransferAmount, driver);

        Operations.sendText(PG004_FundTransfer.transferDetailsTransferAmount, amount, driver);
        Operations.sendText(PG004_FundTransfer.transferDetailsRemarks,"AutomatedTest", driver);
        Operations.sleep(3000);

        Operations.waitUntilElementIsClickable(PG004_FundTransfer.transferDetailsNextButton, driver);
        Operations.click(PG004_FundTransfer.transferDetailsNextButton, driver);
    }

    @Then("I input To Account Number {string}, To Account Name {string}, Select Card, Select Bank, Select District, Select Branch, Select NPSB, Input transfer amount {string} below my available balance and remarks and confirm next to continue")
    public void iFilledTransferDetailsScreenNPSBCard(String accountNumber, String accountName, String amount) throws InterruptedException {
        Operations.verifyElementIsPresent(PG004_FundTransfer.otherTransferDetailsToAccountField, driver);

        Operations.click(PG004_FundTransfer.otherTransferDetailsToAccountField, driver);
        Operations.sendText(PG004_FundTransfer.otherTransferDetailsToAccountField, accountNumber, driver);

        Operations.sendText(PG004_FundTransfer.otherTransferDetailsAccountNameInputField, accountName, driver);

        Operations.click(PG004_FundTransfer.otherTransferDetailsAccountTypeSelection, driver);
        Operations.click(PG004_FundTransfer.otherTransferDetailsAccountTypeSelectionCard, driver);

        Operations.click(PG004_FundTransfer.otherTransferDetailsBankSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.otherTransferDetailsSelectedBank, driver);
        Operations.click(PG004_FundTransfer.otherTransferDetailsSelectedBank, driver);
        Operations.sleep(3000);

        Operations.click(PG004_FundTransfer.otherTransferDetailsDistrictSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.otherTransferDetailsSelectedDistrict, driver);
        Operations.click(PG004_FundTransfer.otherTransferDetailsSelectedDistrict, driver);
        Operations.sleep(3000);

        Operations.click(PG004_FundTransfer.otherTransferDetailsBranchSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.otherTransferDetailsSelectedBranch, driver);
        Operations.click(PG004_FundTransfer.otherTransferDetailsSelectedBranch, driver);
        Operations.sleep(3000);

        Operations.click(PG004_FundTransfer.otherTransferDetailsNPSBToggle, driver);

        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsTransferAmount, driver);
        Operations.click(PG004_FundTransfer.transferDetailsTransferAmount, driver);

        Operations.sendText(PG004_FundTransfer.transferDetailsTransferAmount, amount, driver);
        Operations.sendText(PG004_FundTransfer.transferDetailsRemarks,"AutomatedTest", driver);
        Operations.sleep(3000);

        Operations.waitUntilElementIsClickable(PG004_FundTransfer.transferDetailsNextButton, driver);
        Operations.click(PG004_FundTransfer.transferDetailsNextButton, driver);
    }
    @Then("I input To Account Number {string}, To Account Name {string}, Select Account, Select Bank, Select District, Select Branch, Select BEFTN, Input transfer amount {string} below my available balance and remarks and confirm next to continue")
    public void iFilledTransferDetailsScreenBFTNAccount(String accountNumber, String accountName, String amount) throws InterruptedException {
        Operations.verifyElementIsPresent(PG004_FundTransfer.otherTransferDetailsToAccountField, driver);

        Operations.click(PG004_FundTransfer.otherTransferDetailsToAccountField, driver);
        Operations.sendText(PG004_FundTransfer.otherTransferDetailsToAccountField, accountNumber, driver);

        Operations.sendText(PG004_FundTransfer.otherTransferDetailsAccountNameInputField, accountName, driver);

        Operations.click(PG004_FundTransfer.otherTransferDetailsAccountTypeSelection, driver);
        Operations.click(PG004_FundTransfer.otherTransferDetailsAccountTypeSelectionAccount, driver);

        Operations.click(PG004_FundTransfer.otherTransferDetailsBankSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.otherTransferDetailsSelectedBank, driver);
        Operations.click(PG004_FundTransfer.otherTransferDetailsSelectedBank, driver);
        Operations.sleep(3000);

        Operations.click(PG004_FundTransfer.otherTransferDetailsDistrictSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.otherTransferDetailsSelectedDistrict, driver);
        Operations.click(PG004_FundTransfer.otherTransferDetailsSelectedDistrict, driver);
        Operations.sleep(3000);

        Operations.click(PG004_FundTransfer.otherTransferDetailsBranchSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.otherTransferDetailsSelectedBranch, driver);
        Operations.click(PG004_FundTransfer.otherTransferDetailsSelectedBranch, driver);
        Operations.sleep(3000);

        Operations.click(PG004_FundTransfer.otherTransferDetailsBFTNToggle, driver);

        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsTransferAmount, driver);
        Operations.click(PG004_FundTransfer.transferDetailsTransferAmount, driver);

        Operations.sendText(PG004_FundTransfer.transferDetailsTransferAmount, amount, driver);
        Operations.sendText(PG004_FundTransfer.transferDetailsRemarks,"AutomatedTest", driver);
        Operations.sleep(3000);

        Operations.waitUntilElementIsClickable(PG004_FundTransfer.transferDetailsNextButton, driver);
        Operations.click(PG004_FundTransfer.transferDetailsNextButton, driver);
    }

    @Then("I input To Account Number {string}, To Account Name {string}, Select Card, Select Bank, Select District, Select Branch, Select BEFTN, Input transfer amount {string} below my available balance and remarks and confirm next to continue")
    public void iFilledTransferDetailsScreenBFTNCard(String accountNumber, String accountName, String amount) throws InterruptedException {
        Operations.verifyElementIsPresent(PG004_FundTransfer.otherTransferDetailsToAccountField, driver);

        Operations.click(PG004_FundTransfer.otherTransferDetailsToAccountField, driver);
        Operations.sendText(PG004_FundTransfer.otherTransferDetailsToAccountField, accountNumber, driver);

        Operations.sendText(PG004_FundTransfer.otherTransferDetailsAccountNameInputField, accountName, driver);

        Operations.click(PG004_FundTransfer.otherTransferDetailsAccountTypeSelection, driver);
        Operations.click(PG004_FundTransfer.otherTransferDetailsAccountTypeSelectionCard, driver);

        Operations.click(PG004_FundTransfer.otherTransferDetailsBankSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.otherTransferDetailsSelectedBank, driver);
        Operations.click(PG004_FundTransfer.otherTransferDetailsSelectedBank, driver);
        Operations.sleep(3000);

        Operations.click(PG004_FundTransfer.otherTransferDetailsDistrictSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.otherTransferDetailsSelectedDistrict, driver);
        Operations.click(PG004_FundTransfer.otherTransferDetailsSelectedDistrict, driver);
        Operations.sleep(3000);

        Operations.click(PG004_FundTransfer.otherTransferDetailsBranchSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.otherTransferDetailsSelectedBranch, driver);
        Operations.click(PG004_FundTransfer.otherTransferDetailsSelectedBranch, driver);
        Operations.sleep(3000);

        Operations.click(PG004_FundTransfer.otherTransferDetailsBFTNToggle, driver);

        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsTransferAmount, driver);
        Operations.click(PG004_FundTransfer.transferDetailsTransferAmount, driver);

        Operations.sendText(PG004_FundTransfer.transferDetailsTransferAmount, amount, driver);
        Operations.sendText(PG004_FundTransfer.transferDetailsRemarks,"AutomatedTest", driver);
        Operations.sleep(3000);

        Operations.waitUntilElementIsClickable(PG004_FundTransfer.transferDetailsNextButton, driver);
        Operations.click(PG004_FundTransfer.transferDetailsNextButton, driver);
    }

}
