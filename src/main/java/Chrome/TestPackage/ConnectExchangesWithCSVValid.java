package Chrome.TestPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ConnectExchangesWithCSVValid {

    public static void main(String[] args) throws InterruptedException {

        // Enable ChromeDriverName and ChromeDriverPath
        String chromeDriverName = "webdriver.chrome.driver";
        String chromeDriverPath = "/Users/jenkins/Desktop/SeleniumTest/src/main/resources/chromedriver";
        System.setProperty(chromeDriverName, chromeDriverPath);

        // New driver object
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // Index for set all exchanges
        int index = 1;

        // Run main method
        addPortfolios(driver, index);

        // Sleep 5 sec
        Thread.sleep(5000);

        // Quit test
        driver.quit();

    }

    // Add all excahnges method
    public static void addPortfolios(WebDriver driver, int index) throws InterruptedException {

            // Get to CoinStats site
            String coinstatsURL = "https://coinstats.app/en/portfolio";
            driver.get(coinstatsURL);

            // Set Cookie (mail@mail.com | password account)
            driver.manage().addCookie(new Cookie("userData", "eyJzZXNzaW9uVG9rZW4iOiJyOjQzMDVhZjlmNzA5NzUwZWVmNzdlMTRmMjZkNzRkMWQ1In0="));
            driver.navigate().refresh();

            // Create By and Element for addPortfolio button
            By addPortfolioBy = By.xpath("//html//body//div[1]//main//div//div//div[1]//div//div[1]//button");
            WebElement addPortfolio = driver.findElement(addPortfolioBy);

            // Click on addPortfolio button
            addPortfolio.click();

            // Create By for CSVtab
            By CSVtabBy = By.cssSelector("div.tabs-section > div:nth-of-type(2)");

            // Create By for submitButton and click on it
            By submitButtonBy = By.cssSelector("div.submit-section > .jsx-1426819953");

            // Create By for yesButton
            By yesButtonBy = By.xpath("//button[.='Yes!']");

            // Create By for importButton and import file
            By importButton2By = By.cssSelector("input.jsx-2090407883");

        // Cycle for add all the exchanges
        do{

            if(index == 13)
            {
                index = 14;
            }

            // Create By and Element for connectExchange button
            By connectExchangeBy = By.cssSelector("div.buttons-with-info > button:nth-of-type(1)");
            WebElement connectExchange = driver.findElement(connectExchangeBy);

            // Click on connectExchange button
            connectExchange.click();

            // Create By and Element for selectExchange
            By selectExchangeBy = By.cssSelector("ul.jsx-2489091780 > li:nth-of-type(" + index + ")");
            WebElement selectExchange = driver.findElement(selectExchangeBy);

            // Click on exchanges buttons
            selectExchange.click();

            // If index == 5, it is Crypto.com App, if index == 12, it is Bittrex. Else run standardExchanges method
            if (index == 5)
            {
                // Run Crypto.com App method
                connectCryptoComApp(driver, submitButtonBy, yesButtonBy, importButton2By);
            }

            else if (index == 12)
            {
                // Run Bittrex method
                connectBittrex(driver, CSVtabBy, submitButtonBy, yesButtonBy, importButton2By);
            }

            else
            {
                // Run standardExchanges method
                connectStandardExchanges(driver, CSVtabBy, submitButtonBy, yesButtonBy, importButton2By);
            }

            // Index + 1
            index++;

        } while (index != 25);

    }

    public static void connectStandardExchanges (WebDriver driver, By CSVtabBy, By submitButtonBy, By yesButtonBy, By importButton2By) throws InterruptedException {

        // Create Element for CSVtab
        WebElement CSVtab = driver.findElement(CSVtabBy);

        // Click on CSVtab
        CSVtab.click();

        // Create Element for importButton2
        WebElement importButton2 = driver.findElement(importButton2By);

        // Import CSV file
        importButton2.sendKeys("/Users/jenkins/Documents/coinstats_template.csv");

        // Sleep 2 sec
        Thread.sleep(2000);

        // Create Element for submitButton
        WebElement submitButton = driver.findElement(submitButtonBy);

        // Click on submitButton
        submitButton.click();

        // Create Element for yesButton
        WebElement yesButton = driver.findElement(yesButtonBy);

        try {
            // Click on yesButton
            yesButton.click();
        }
        catch(NoSuchElementException e)
        {
            System.out.println("Window doesn't appear " + e);
        }

    }

    public static void connectCryptoComApp(WebDriver driver, By submitButtonBy, By yesButtonBy, By importButton2By) throws InterruptedException {

        // Create Element for importButton2
        WebElement importButton2 = driver.findElement(importButton2By);

        // Import CSV file
        importButton2.sendKeys("/Users/jenkins/Documents/crypto_transactions_record_20200623_132654 - crypto_transactions_record_20200623_132654.csv");

        // Sleep 2 sec
        Thread.sleep(2000);

        // Create Element for submitButton
        WebElement submitButton = driver.findElement(submitButtonBy);

        // Click on submitButton
        submitButton.click();

        // Create Element for yesButton
        WebElement yesButton = driver.findElement(yesButtonBy);

        try {
            // Click on yesButton
            yesButton.click();
        }
        catch(NoSuchElementException e)
        {
            System.out.println("Window doesn't appear " + e);
        }
    }

    public static void connectBittrex(WebDriver driver, By CSVtabBy, By submitButtonBy, By yesButtonBy, By importButton2By) throws InterruptedException {

        // Create Element for CSVtab
        WebElement CSVtab = driver.findElement(CSVtabBy);

        // Click on CSVtab
        CSVtab.click();

        // Create Element for importButton2
        WebElement importButton2 = driver.findElement(importButton2By);

        // Import CSV file
        importButton2.sendKeys("/Users/jenkins/Documents/BittrexOrderHistory_2019.csv");

        // Sleep 2 sec
        Thread.sleep(2000);

        // Create Element for submitButton
        WebElement submitButton = driver.findElement(submitButtonBy);

        // Click on submitButton
        submitButton.click();

        // Create Element for yesButton
        WebElement yesButton = driver.findElement(yesButtonBy);

        try {
            // Click on yesButton
            yesButton.click();
        }
        catch(NoSuchElementException e)
        {
            System.out.println("Window doesn't appear " + e);
        }
    }
}