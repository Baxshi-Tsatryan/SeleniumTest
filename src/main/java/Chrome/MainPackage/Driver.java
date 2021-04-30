package Chrome.MainPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Driver {

    public WebDriver driver;

    @BeforeSuite
    public void DriverBeforeSuit() {
        String chromeDriverName = "webdriver.chrome.driver";
        String chromeDriverPath = "//Users//baxshi//IdeaProjects//SeleniumTest//src//main//resources//chromedriver";
        System.setProperty(chromeDriverName, chromeDriverPath);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        options.setExperimentalOption("prefs", prefs);

        // ChromeDriver
        this.driver = new ChromeDriver();

        // TimeOut
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void QuitDriver() {
        driver.quit();
    }
}



