package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.PG002_LoginPageOR;
import objectRepository.PG001_SplashPageOR;
import objectRepository.PG003_DashboardOR;
import utils.Base;
import utils.Operations;

public class PM001_SplashAndLogin extends Base {

    @Given("I open the browser")
    public void iOpenTheBrowser() {
        setUp();
    }

    @When("I navigate to {string}")
    public void iNavigateTo(String url) {
        driver.get(url);
    }

    @Then("I should see the page title {string}")
    public void iShouldSeeThePageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        assert actualTitle.equals(expectedTitle) : "Page title mismatch";
    }

    @When("I click on the Login Button")
    public void iClickOnTheLoginButton() {
        Operations.click(PG001_SplashPageOR.loginButton, driver);
    }

    @Then("I navigate to the Login Page and can see login title {string}")
    public void iNavigateToTheLoginPage(String expectedTitle) {
        Operations.matchText(PG002_LoginPageOR.loginTitle, expectedTitle, driver);
    }

    @When("I login with {string} and {string}")
    public void iLoginWith(String userName, String password) {
//        Operations.waitForPageToLoad(driver);
        Operations.click(PG002_LoginPageOR.inputFieldUserID, driver);
        Operations.sendText(PG002_LoginPageOR.inputFieldUserID, userName, driver);
        Operations.click(PG002_LoginPageOR.inputFieldPassword, driver);
        Operations.sendText(PG002_LoginPageOR.inputFieldPassword, password, driver);
        Operations.click(PG002_LoginPageOR.loginBtn, driver);
//        Operations.waitForPageToLoad(driver);
    }

    @Then ("I should see OTP Channel Selection Modal for Device Binding {string}")
    public void iShouldSeeOTPChannelSelectionForDeviceBinding(String expectedDeviceBindingTitle) {
        Operations.matchText(PG002_LoginPageOR.deviceBindingModalTitle, expectedDeviceBindingTitle, driver);
    }

    @When ("I verify 2fa Successfully With SMS {string}")
    public void iVerify2faSuccessfullyWithSMS(String OTP) {
        Operations.click(PG002_LoginPageOR.deviceBindingOTPTypeSMS, driver);
        Operations.click(PG002_LoginPageOR.deviceBindingOTPNextBtn, driver);
        Operations.verifyElementIsPresent(PG002_LoginPageOR.otpVerificationTitle, driver);
        Operations.click(PG002_LoginPageOR.otpInputField, driver);
        Operations.sendText(PG002_LoginPageOR.otpInputField, OTP, driver);
        Operations.waitUntilElementIsClickable(PG002_LoginPageOR.otpConfirmBtn, driver);
        Operations.click(PG002_LoginPageOR.otpConfirmBtn, driver);

    }

    @Then("I navigate to my dashboard")
    public void iNavigateToMyDashboard() {
        Operations.verifyElementIsPresent(PG003_DashboardOR.dashboardNavBar, driver);
        Operations.click(PG003_DashboardOR.dashboardNavBar, driver);
        Operations.matchText(PG003_DashboardOR.dashboardNavBar, "Dashboard" ,driver);

    }
}
