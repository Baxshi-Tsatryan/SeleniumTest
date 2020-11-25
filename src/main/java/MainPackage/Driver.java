package MainPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.util.concurrent.TimeUnit;

public class Driver {

    public WebDriver driver;

    @BeforeSuite
    public void DriverBeforeSuit()
    {
        String chromeDriverName = "webdriver.chrome.driver";
        String chromeDriverPath = "//Users//jenkins//Desktop//SeleniumTest//src//main//resources//chromedriver";
        System.setProperty(chromeDriverName,chromeDriverPath);

        // ChromeDriver
        this.driver = new ChromeDriver();

        // TimeOut
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void QuitDriver()
    {
        driver.quit();
    }
}



