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
            captureScreenshotAndAttachToReport(scenario, driver);
        }
    }

    public void captureScreenshotAndAttachToReport(Scenario scenario, WebDriver driver) {
        try {
            // Get the screenshot as a byte array
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

            // Attach the screenshot to the Cucumber report
            scenario.attach(screenshotBytes, "image/png", scenario.getName());

            // Save the screenshot as a file
            saveScreenshotFile(screenshotBytes, scenario.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void saveScreenshotFile(byte[] screenshotBytes, String scenarioName) throws IOException {
        // Generate a unique name for the screenshot
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String screenshotName = scenarioName.replaceAll(" ", "_") + "_" + timestamp + ".png";

        // Define the path where screenshots will be saved
        Path screenshotPath = Paths.get(System.getProperty("user.dir"), "screenshots", screenshotName);

        // Ensure that the directory exists
        Files.createDirectories(screenshotPath.getParent());

        // Save the screenshot file
        Files.write(screenshotPath, screenshotBytes);
        System.out.println("Screenshot saved: " + screenshotPath.toString());
    }
}
