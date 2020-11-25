package TestPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class TestClass {

    public static void main(String[] args) throws InterruptedException {

        // Enable ChromeDriverName and ChromeDriverPath
        String chromeDriverName = "webdriver.chrome.driver";
        String chromeDriverPath = "/Users/jenkins/Desktop/SeleniumTest/src/main/resources/chromedriver";
        System.setProperty(chromeDriverName, chromeDriverPath);

        // New driver object
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // Get to CoinStats site
        String coinstatsURL = "https://coinstats.app/en/portfolio";
        driver.get(coinstatsURL);

        // Set Cookie (mail@mail.com | password account)
        driver.manage().addCookie(new Cookie("userData", "eyJzZXNzaW9uVG9rZW4iOiJyOjQwY2EwNDJiMWE4NzYxMjE2Njk3ZDljMmNkYWUyMTU5In0="));
        driver.navigate().refresh();

        // Create By and Element for addPortfolio button
        By addPortfolioBy = By.cssSelector("#__next > main > div > div > div.jsx-2241105801.sidebar-container-wrapper.show > div > div.jsx-60857151.add-portfolio-container > button");
        WebElement addPortfolio = driver.findElement(addPortfolioBy);

        // Click on addPortfolio button
        addPortfolio.click();

        // Create By and Element for connectExchange button
        By connectExchangeBy = By.cssSelector("div.buttons-with-info > button:nth-of-type(1)");
        WebElement connectExchange = driver.findElement(connectExchangeBy);

        // Click on connectExchange button
        connectExchange.click();

        //List<WebElement> exchangesList;

   //  int index = 1;
   //  try {
   //      do {
   //          exchangesList = driver.findElements(By.cssSelector("ul.jsx-2489091780 > li:nth-of-type(" + index + ")"));

   //          int listIndex = 0;

   //          exchangesList.add(listIndex, exchangesList.get(listIndex));
   //          index++;
   //      }
   //      while (true);

   //  } catch (Exception e) {
   //      System.out.println("There are " + (index - 1) + " exchanges");
   //  }



          int index = 1;
          try {
              do {
                  List<WebElement> exchangesList = driver.findElements(By.cssSelector("ul.jsx-2489091780 > li:nth-of-type(" + index + ")"));

                  int listIndex = 0;

                  exchangesList.add(listIndex, exchangesList.get(listIndex));

                  index++;
              }
              while (true);

          } catch (Exception e) {
              System.out.println("There are " + (index - 1) + " exchanges");
          }




    }

}

