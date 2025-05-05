package objectRepository;

import org.openqa.selenium.By;

public class PG006_WithinFundTransferOR {
    public static By withinTransferFromAccountDropdown = By.xpath("//mat-select[@role='combobox']//div//div//div//*[name()='svg']");
    public static By withinTransferDetailsScreenTitle = By.xpath("//h1[normalize-space()='NCC Bank Account Transfer']");
    public static By withinTransferDetailsToAccountField = By.xpath("//input[@placeholder='Enter To Account']");
    public static By withinTransferDetailsAvailableBalance = By.xpath("//input[@aria-invalid='false']");
}
