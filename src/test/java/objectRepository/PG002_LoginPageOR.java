package objectRepository;

import org.openqa.selenium.By;

public class PG002_LoginPageOR {
    public static By loginTitle = By.xpath("//h2[contains(text(),'Log In to Your Account')]");
    public static By inputFieldUserID = By.xpath("//input[@id='username']");
    public static By inputFieldPassword = By.xpath("//input[@id='password']");
    public static By loginBtn = By.xpath("//button[contains(text(),'Log In')]");
    public static By deviceBindingModalTitle = By.xpath("//p[contains(text(),'We found a new device, would you like to bind it t')]");
    public static By deviceBindingOTPTypeSMS = By.xpath("//label[contains(text(),'SMS')]");
    public static By deviceBindingOTPTypeEmail = By.xpath("//label[contains(text(),'Email')]");
    public static By deviceBindingOTPNextBtn = By.xpath("//button[contains(text(),'Continue')]");
    public static By deviceBindingOTPCancelBtn = By.xpath("//button[contains(text(),'Cancel')]");
    public static By otpVerificationTitle = By.xpath("//h2[contains(text(),'OTP Verification')]");
    public static By otpInputField = By.xpath("//body/app-root[1]/layout[1]/empty-layout[1]/div[1]/div[1]/auth-sign-in[1]/section[1]/div[1]/div[2]/form[1]/code-input[1]/span[1]/input[1]");
    public static By otpConfirmBtn = By.xpath("//button[contains(text(),'Submit')]");
    public static By otpResend = By.xpath("//strong[contains(text(),'Resend')]");
    public static By backToSignIn = By.xpath("//a[contains(text(),'Sign In')]");


}
