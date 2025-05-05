package stepdefinitions;

import io.cucumber.java.en.Then;
import objectRepository.PG003_DashboardOR;
import objectRepository.PG004_FundTransfer;
import objectRepository.PG008_MfsFundTransferOR;
import org.openqa.selenium.By;
import utils.Base;
import utils.MailosaurOTP;
import utils.Operations;

public class FundTransferCommonMethods extends Base {
    public enum TransferType {
        OWN_ACCOUNT("BANK"),
        WITHIN_BANK("BANK"),
        OTHER_BANK("BANK"),
        BKASH("MFS"),
        NAGAD("MFS"),
        ROCKET("MFS"),
        TAP("MFS");

        private final String category;

        TransferType(String category) {
            this.category = category;
        }

        public boolean isBankTransfer() {
            return category.equals("BANK");
        }

        public boolean isMfsTransfer() {
            return category.equals("MFS");
        }
    }


        public static By getGoToHomeButton(TransferType type) {
            return type.isMfsTransfer() ? PG008_MfsFundTransferOR.mfsTransferGoToHome : PG004_FundTransfer.fundTransferGoToHome;
        }

        public static By getAddToFavouriteButton(TransferType type) {
            return type.isMfsTransfer() ? PG008_MfsFundTransferOR.mfsTransferAddToFavourite : PG004_FundTransfer.fundTransferAddToFavourite;
        }

        public static By getDownloadReceiptButton(TransferType type) {
            return type.isMfsTransfer() ? PG008_MfsFundTransferOR.mfsTransferDownloadReceipt : PG004_FundTransfer.fundTransferDownloadReceipt;
        }

        public static By getAddFavouriteTitle(TransferType type) {
            return type.isMfsTransfer() ? PG008_MfsFundTransferOR.mfsTransferAddFavouriteTitle : PG004_FundTransfer.fundTransferAddFavouriteTitle;
        }

        public static By getAddFavouriteInputField(TransferType type) {
            return type.isMfsTransfer() ? PG008_MfsFundTransferOR.mfsTransferAddFavouriteInputField : PG004_FundTransfer.fundTransferAddFavouriteInputField;
        }

        public static By getAddFavouriteSaveButton(TransferType type) {
            return type.isMfsTransfer() ? PG008_MfsFundTransferOR.mfsTransferAddFavouriteSaveButton : PG004_FundTransfer.fundTransferAddFavouriteSaveButton;
        }

        public static By getAddFavouriteToast(TransferType type) {
            return type.isMfsTransfer() ? PG008_MfsFundTransferOR.mfsTransferAddFavouriteToast : PG004_FundTransfer.fundTransferAddFavouriteToast;
        }


    @Then("I can see transaction details screen, select OTP channel, accept the terms and confirm next to continue by OTP verification")
    public void iCanSeeTransactionScreenVerifyOTP() throws Exception {
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.fundTransferReviewPageTitle, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.fundTransferReviewPageTitle, driver);
        Operations.click(PG004_FundTransfer.fundTransferAuthenticationTypeEmail, driver);
        Operations.click(PG004_FundTransfer.fundTransferSendOtpButton, driver);
        Operations.waitUntilElementIsVisible(PG004_FundTransfer.fundTransferOTPInput, driver);
        Operations.verifyElementIsPresent(PG004_FundTransfer.fundTransferOTPInput, driver);
        Thread.sleep(20000);
        String OTP = MailosaurOTP.getOTP();
        System.out.println("OTP: " + OTP);
        Operations.sendText(PG004_FundTransfer.fundTransferOTPInput,OTP, driver);
        Operations.waitUntilElementIsClickable(PG004_FundTransfer.fundTransferTransferBtn, driver);
        Operations.click(PG004_FundTransfer.fundTransferTransferBtn, driver);
        Thread.sleep(4000);
    }

    @Then("I can see transaction confirmation screen for {string} transfer with success or fail status and the details of the transactions")
    public void iCanSeeTransactionConfirmationScreen(String transferTypeStr) {
        TransferType type = TransferType.valueOf(transferTypeStr.toUpperCase());
        Operations.waitForPageToLoad(driver);
        Operations.waitUntilElementIsVisible(getGoToHomeButton(type), driver);
        Operations.verifyElementIsPresent(getGoToHomeButton(type), driver);
        Operations.verifyElementIsPresent(getAddToFavouriteButton(type), driver);
        Operations.verifyElementIsPresent(getDownloadReceiptButton(type), driver);
    }

    @Then("I can download the transaction receipt for {string} transfer")
    public void iCanDownloadTransactionReceipt(String transferTypeStr) throws InterruptedException {
        TransferType type = TransferType.valueOf(transferTypeStr.toUpperCase());
        Operations.verifyElementIsPresent(getDownloadReceiptButton(type), driver);
        Operations.sleep(8000);
        Operations.click(getDownloadReceiptButton(type), driver);
        Operations.sleep(5000);
    }

    @Then("I can add the {string} transfer transaction to favourite {string}")
    public void iCanAddTransactionToFavourite(String transferTypeStr, String favName) {
        TransferType type = TransferType.valueOf(transferTypeStr.toUpperCase());
        Operations.verifyElementIsPresent(getAddToFavouriteButton(type), driver);
        Operations.waitUntilElementIsVisible(getAddToFavouriteButton(type), driver);
        Operations.click(getAddToFavouriteButton(type), driver);
        Operations.waitUntilElementIsVisible(getAddFavouriteTitle(type), driver);
        Operations.verifyElementIsPresent(getAddFavouriteInputField(type), driver);
        int ranNum = Operations.createRandomIntBetween(1, 100);
        Operations.sendText(getAddFavouriteInputField(type), favName + ranNum, driver);
        Operations.click(getAddFavouriteSaveButton(type), driver);
        Operations.verifyElementIsPresent(getAddFavouriteToast(type), driver);
    }

    @Then("I can navigate to home clicking Go To Home for {string} transfer")
    public void iCanNavigateToHome(String transferTypeStr) throws InterruptedException {
        TransferType type = TransferType.valueOf(transferTypeStr.toUpperCase());
        Operations.verifyElementIsPresent(getGoToHomeButton(type), driver);
        Operations.click(getGoToHomeButton(type), driver);
        Thread.sleep(3000);
        Operations.waitUntilElementIsVisible(PG003_DashboardOR.dashboardAccountTabConventional, driver);
    }

}

