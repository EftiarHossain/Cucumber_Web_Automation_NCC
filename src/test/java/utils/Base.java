package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Paths;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Base {
    public static WebDriver driver;

    public void setUp() {
        ChromeOptions options = new ChromeOptions();

        // Disable notifications
        options.addArguments("--disable-notifications");

        // Allow multiple file downloads
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_settings.popups", 0);
        prefs.put("profile.content_settings.exceptions.automatic_downloads.*.setting", 1);

        prefs.put("download.default_directory", System.getProperty("user.dir") + "/downloads");  // Relative to workspace
        prefs.put("download.prompt_for_download", false);
        prefs.put("download.directory_upgrade", true);
        prefs.put("safebrowsing.enabled", true);

        options.setExperimentalOption("prefs", prefs);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }

    public void quit() {
        driver.quit();
    }
}
