package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.Base;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks {

    @After
    public void tearDown(Scenario scenario) {
        WebDriver driver = Base.driver;  // Access driver from Base class without inheritance

        if (scenario.isFailed() && driver != null) { // Capture screenshot only if scenario fails
            captureScreenshot(scenario.getName(), driver);
        }
    }

    public void captureScreenshot(String scenarioName, WebDriver driver) {
        try {
            // Get the screenshot
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Generate a unique name for the screenshot
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String screenshotName = scenarioName.replaceAll(" ", "_") + "_" + timestamp + ".png";

            // Define the path where screenshots will be saved
            Path screenshotPath = Paths.get(System.getProperty("user.dir"), "screenshots", screenshotName);

            // Ensure that the directory exists
            File screenshotDirectory = screenshotPath.getParent().toFile();
            if (!screenshotDirectory.exists()) {
                // Create the directory if it doesn't exist
                boolean created = screenshotDirectory.mkdirs();
                if (created) {
                    System.out.println("Directory created: " + screenshotDirectory);
                }
            }

            // Copy the screenshot file to the defined path
            Files.copy(screenshot.toPath(), screenshotPath);
            System.out.println("Screenshot saved: " + screenshotPath.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
