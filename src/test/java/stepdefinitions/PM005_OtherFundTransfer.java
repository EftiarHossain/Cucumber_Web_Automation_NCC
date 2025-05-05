package stepdefinitions;

import io.cucumber.java.en.Then;
import objectRepository.PG004_FundTransfer;
import objectRepository.PG007_OtherFundTransferOR;
import org.openqa.selenium.By;
import utils.Base;
import utils.Operations;

public class PM005_OtherFundTransfer extends Base {

    @Then("I navigate to the Other Account Fund Transfer")
    public void iNavigateToTheOtherAccountFundTransfer() {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.navBarFundTransfer, driver);
        Operations.click(PG004_FundTransfer.navBarFundTransfer, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.navBarOtherFundTransfer, driver);
        Operations.click(PG004_FundTransfer.navBarOtherFundTransfer, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.fundTransferTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.continueWithFavourite, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.beneficiarySearchField, driver);
    }

    @Then("I click on One Time Pay to Transfer Money to Other Bank")
    public void iClickOnContinueWithoutBeneficiary() throws InterruptedException {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.fundTransferTitle, driver);
        Operations.click(PG004_FundTransfer.oneTimePayBtn, driver);
        Thread.sleep(4000);
        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG007_OtherFundTransferOR.otherTransferDetailsScreenTitle, driver);
    }

    @Then("I select From Account Number {string}, input To Account Number {string}, To Account Name {string}, Select Account, Select Bank, Select District, Select Branch, Select NPSB, Input transfer amount {string} below my available balance and remarks and confirm next to continue")
    public void iFilledTransferDetailsScreenNPSBAccount(String fromAccount, String accountNumber, String accountName, String amount) throws InterruptedException {
        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG007_OtherFundTransferOR.otherTransferDetailsScreenTitle, driver);

        Operations.waitUntilElementIsClickable(PG007_OtherFundTransferOR.otherTransferFromAccountDropdown, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferFromAccountDropdown, driver);
        By withinTransferFromAccount = By.xpath("//span[contains(text(),'" + fromAccount + "')]");
        Operations.click(withinTransferFromAccount, driver);
        Thread.sleep(2000);

        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsAvailableBalance, driver);
        Operations.verifyElementIsPresent(PG007_OtherFundTransferOR.otherTransferDetailsAvailableBalance, driver);

        Operations.verifyElementIsPresent(PG007_OtherFundTransferOR.otherTransferDetailsToAccountField, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsToAccountField, driver);
        Operations.sendText(PG007_OtherFundTransferOR.otherTransferDetailsToAccountField, accountNumber, driver);

        Operations.sendText(PG007_OtherFundTransferOR.otherTransferDetailsAccountNameInputField, accountName, driver);

        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsAccountTypeSelection, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsAccountTypeSelectionAccount, driver);

        Operations.sleep(3000);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsBankSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsSelectedBank, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsSelectedBank, driver);
        Operations.sleep(3000);

        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsDistrictSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsSelectedDistrict, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsSelectedDistrict, driver);
        Operations.sleep(3000);

        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsBranchSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsSelectedBranch, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsSelectedBranch, driver);
        Operations.sleep(3000);

        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsNPSBToggle, driver);

        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsTransferAmount, driver);
        Operations.click(PG004_FundTransfer.transferDetailsTransferAmount, driver);

        Operations.sendText(PG004_FundTransfer.transferDetailsTransferAmount, amount, driver);
        Operations.sendText(PG004_FundTransfer.transferDetailsRemarks,"AutomatedTest", driver);
        Operations.sleep(3000);

        Operations.waitUntilElementIsClickable(PG004_FundTransfer.transferDetailsNextButton, driver);
        Operations.click(PG004_FundTransfer.transferDetailsNextButton, driver);
    }

    @Then("I select From Account Number {string}, input To Account Number {string}, To Account Name {string}, Select Card, Select Bank, Select District, Select Branch, Select NPSB, Input transfer amount {string} below my available balance and remarks and confirm next to continue")
    public void iFilledTransferDetailsScreenNPSBCard(String fromAccount, String accountNumber, String accountName, String amount) throws InterruptedException {
        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG007_OtherFundTransferOR.otherTransferDetailsScreenTitle, driver);

        Operations.waitUntilElementIsClickable(PG007_OtherFundTransferOR.otherTransferFromAccountDropdown, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferFromAccountDropdown, driver);
        By withinTransferFromAccount = By.xpath("//span[contains(text(),'" + fromAccount + "')]");
        Operations.click(withinTransferFromAccount, driver);
        Thread.sleep(2000);

        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsAvailableBalance, driver);
        Operations.verifyElementIsPresent(PG007_OtherFundTransferOR.otherTransferDetailsAvailableBalance, driver);

        Operations.verifyElementIsPresent(PG007_OtherFundTransferOR.otherTransferDetailsToAccountField, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsToAccountField, driver);
        Operations.sendText(PG007_OtherFundTransferOR.otherTransferDetailsToAccountField, accountNumber, driver);

        Operations.sendText(PG007_OtherFundTransferOR.otherTransferDetailsAccountNameInputField, accountName, driver);

        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsAccountTypeSelection, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsAccountTypeSelectionCard, driver);
        Operations.verifyElementIsPresent(PG007_OtherFundTransferOR.otherTransferDetailsBankSelectionField, driver);

        Operations.sleep(3000);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsBankSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsSelectedBank, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsSelectedBank, driver);
        Operations.sleep(3000);

        Operations.scrollIntoElement(PG007_OtherFundTransferOR.otherTransferDetailsDistrictSelectionField, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsDistrictSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsSelectedDistrict, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsSelectedDistrict, driver);
        Operations.sleep(3000);

        Operations.scrollIntoElement(PG007_OtherFundTransferOR.otherTransferDetailsBranchSelectionField, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsBranchSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsSelectedBranch, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsSelectedBranch, driver);
        Operations.sleep(3000);

        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsNPSBToggle, driver);

        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsTransferAmount, driver);
        Operations.click(PG004_FundTransfer.transferDetailsTransferAmount, driver);

        Operations.sendText(PG004_FundTransfer.transferDetailsTransferAmount, amount, driver);
        Operations.sendText(PG004_FundTransfer.transferDetailsRemarks,"AutomatedTest", driver);
        Operations.sleep(3000);

        Operations.waitUntilElementIsClickable(PG004_FundTransfer.transferDetailsNextButton, driver);
        Operations.click(PG004_FundTransfer.transferDetailsNextButton, driver);
    }
    @Then("I select From Account Number {string}, input To Account Number {string}, To Account Name {string}, Select Account, Select Bank, Select District, Select Branch, Select BEFTN, Input transfer amount {string} below my available balance and remarks and confirm next to continue")
    public void iFilledTransferDetailsScreenBFTNAccount(String fromAccount, String accountNumber, String accountName, String amount) throws InterruptedException {
        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG007_OtherFundTransferOR.otherTransferDetailsScreenTitle, driver);

        Operations.waitUntilElementIsClickable(PG007_OtherFundTransferOR.otherTransferFromAccountDropdown, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferFromAccountDropdown, driver);
        By withinTransferFromAccount = By.xpath("//span[contains(text(),'" + fromAccount + "')]");
        Operations.click(withinTransferFromAccount, driver);
        Thread.sleep(2000);

        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsAvailableBalance, driver);
        Operations.verifyElementIsPresent(PG007_OtherFundTransferOR.otherTransferDetailsAvailableBalance, driver);

        Operations.verifyElementIsPresent(PG007_OtherFundTransferOR.otherTransferDetailsToAccountField, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsToAccountField, driver);
        Operations.sendText(PG007_OtherFundTransferOR.otherTransferDetailsToAccountField, accountNumber, driver);

        Operations.sendText(PG007_OtherFundTransferOR.otherTransferDetailsAccountNameInputField, accountName, driver);

        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsAccountTypeSelection, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsAccountTypeSelectionAccount, driver);

        Operations.sleep(3000);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsBankSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsSelectedBank, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsSelectedBank, driver);
        Operations.sleep(3000);

        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsDistrictSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsSelectedDistrict, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsSelectedDistrict, driver);
        Operations.sleep(3000);

        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsBranchSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsSelectedBranch, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsSelectedBranch, driver);
        Operations.sleep(3000);

        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsBFTNToggle, driver);

        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsTransferAmount, driver);
        Operations.click(PG004_FundTransfer.transferDetailsTransferAmount, driver);

        Operations.sendText(PG004_FundTransfer.transferDetailsTransferAmount, amount, driver);
        Operations.sendText(PG004_FundTransfer.transferDetailsRemarks,"AutomatedTest", driver);
        Operations.sleep(3000);

        Operations.waitUntilElementIsClickable(PG004_FundTransfer.transferDetailsNextButton, driver);
        Operations.click(PG004_FundTransfer.transferDetailsNextButton, driver);
    }

    @Then("I select From Account Number {string}, input To Account Number {string}, To Account Name {string}, Select Card, Select Bank, Select District, Select Branch, Select BEFTN, Input transfer amount {string} below my available balance and remarks and confirm next to continue")
    public void iFilledTransferDetailsScreenBFTNCard(String fromAccount, String accountNumber, String accountName, String amount) throws InterruptedException {
        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsScreenTitle, driver);
        Operations.verifyElementIsPresent(PG007_OtherFundTransferOR.otherTransferDetailsScreenTitle, driver);

        Operations.waitUntilElementIsClickable(PG007_OtherFundTransferOR.otherTransferFromAccountDropdown, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferFromAccountDropdown, driver);
        By withinTransferFromAccount = By.xpath("//span[contains(text(),'" + fromAccount + "')]");
        Operations.click(withinTransferFromAccount, driver);
        Thread.sleep(2000);

        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsAvailableBalance, driver);
        Operations.verifyElementIsPresent(PG007_OtherFundTransferOR.otherTransferDetailsAvailableBalance, driver);

        Operations.verifyElementIsPresent(PG007_OtherFundTransferOR.otherTransferDetailsToAccountField, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsToAccountField, driver);
        Operations.sendText(PG007_OtherFundTransferOR.otherTransferDetailsToAccountField, accountNumber, driver);

        Operations.sendText(PG007_OtherFundTransferOR.otherTransferDetailsAccountNameInputField, accountName, driver);

        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsAccountTypeSelection, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsAccountTypeSelectionCard, driver);

        Operations.sleep(3000);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsBankSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsSelectedBank, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsSelectedBank, driver);
        Operations.sleep(3000);

        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsDistrictSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsSelectedDistrict, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsSelectedDistrict, driver);
        Operations.sleep(3000);

        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsBranchSelectionField, driver);
        Operations.waitUntilElementIsVisible(PG007_OtherFundTransferOR.otherTransferDetailsSelectedBranch, driver);
        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsSelectedBranch, driver);
        Operations.sleep(3000);

        Operations.click(PG007_OtherFundTransferOR.otherTransferDetailsBFTNToggle, driver);

        Operations.verifyElementIsPresent(PG004_FundTransfer.transferDetailsTransferAmount, driver);
        Operations.click(PG004_FundTransfer.transferDetailsTransferAmount, driver);

        Operations.sendText(PG004_FundTransfer.transferDetailsTransferAmount, amount, driver);
        Operations.sendText(PG004_FundTransfer.transferDetailsRemarks,"AutomatedTest", driver);
        Operations.sleep(3000);

        Operations.waitUntilElementIsClickable(PG004_FundTransfer.transferDetailsNextButton, driver);
        Operations.click(PG004_FundTransfer.transferDetailsNextButton, driver);
    }

}
