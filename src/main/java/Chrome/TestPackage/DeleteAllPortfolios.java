package Chrome.TestPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DeleteAllPortfolios {

    public static void main(String[] args) throws InterruptedException {

        // Enable ChromeDriverName and ChromeDriverPath
        String chromeDriverName = "webdriver.chrome.driver";
        String chromeDriverPath = "/Users/jenkins/Desktop/SeleniumTest/src/main/resources/chromedriver";
        System.setProperty(chromeDriverName, chromeDriverPath);

        // New driver object
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // New action
        Actions actions = new Actions(driver);

        // Get to CoinStats site
        String coinstatsURL = "https://coinstats.app/en/portfolio";
        driver.get(coinstatsURL);

        // Set Cookie (mail@mail.com | password account)
        driver.manage().addCookie(new Cookie("userData", "eyJzZXNzaW9uVG9rZW4iOiJyOjE0MjI0M2UxNDQxMzc4YzUwYTJhODZjNTMyZjE2MDkxIn0="));
        driver.navigate().refresh();

        while(true) {
            try {
                // Move mouse to element
                WebElement deleteButtonVisible = driver.findElement(By.cssSelector("ul#portfolio-list > li:nth-of-type(2) .icon-delete"));
                actions.moveToElement(deleteButtonVisible).build().perform();

                By deleteSecondPortfoliosButtonBy = By.xpath("ul#portfolio-list > li:nth-of-type(2) .icon-delete']");
                WebElement deleteSecondPortfoliosButton = driver.findElement(deleteSecondPortfoliosButtonBy);

                deleteSecondPortfoliosButton.click();

                By deleteButtonBy = By.cssSelector("div.buttons-container > .primary");
                WebElement deleteButton = driver.findElement(deleteButtonBy);

                deleteButton.click();
            }
            catch (NoSuchElementException e)
            {
                driver.quit();
            }

        }

    }
}
