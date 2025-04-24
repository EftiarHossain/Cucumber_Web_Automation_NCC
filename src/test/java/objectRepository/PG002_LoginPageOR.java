package objectRepository;

import org.openqa.selenium.By;

public class PG002_LoginPageOR {
    public static By inputFieldUserID = By.xpath("//input[@placeholder='Enter Your User ID']");
    public static By inputFieldPassword = By.xpath("//input[@placeholder='Enter Your Password']");
    public static By loginBtn = By.xpath("//span[contains(text(),'Login')]");

    public static By deviceBindingModalTitle = By.xpath("//p[contains(text(),'We have found a new device. Would you like to bind')]");
    public static By deviceBindingOTPTypeSMS = By.xpath("//label[normalize-space()='SMS']");
    public static By deviceBindingOTPTypeEmail = By.xpath("//label[normalize-space()='Email']");
    public static By deviceBindingOTPNextBtn = By.xpath("//button[normalize-space()='Continue']");
    public static By deviceBindingOTPCancelBtn = By.xpath("//button[contains(text(),'Cancel')]");
    public static By otpVerificationTitle = By.xpath("//h2[contains(text(),'OTP Verification')]");
    public static By otpInputField = By.xpath("(//input[@type='tel'])[1]");
    public static By otpConfirmBtn = By.xpath("//button[normalize-space()='Next']");
    public static By otpResend = By.xpath("//strong[contains(text(),'Resend')]");
    public static By otpCancelButton = By.xpath("//button[normalize-space()='Cancel']");


}
