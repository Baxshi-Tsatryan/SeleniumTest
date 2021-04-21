package Chrome.TestPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ConnectBinanceAllCases {

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
    public static void addPortfolios(WebDriver driver, int index) {

        // Binance valid addresses
        String binanceValidAddress1 = "IgBwMBybuvvx0aRaUr38YOQhj1kX466vaIQ0kC83bJBiIos03UFhQnUeZ0Ysi7zS";
        String binanceValidAddress2 = "QgDWe984yFJLDPJjSfPK2ymteGyN1etA5MTxAGhrmLDvznEyjy005miPF1Zgf6dW";

        // Binance invalid addresses
        String binanceInvalidAddress1 = "IgBwMBybuvvx0aRaUr38YOQhj1kX466vaIQ0kC83bJBiIos03UFhQnUeZ0Ysi7z";
        String binanceInvalidAddress2 = "QgDWe984yFJLDPJjSfPK2ymteGyN1etA5MTxAGhrmLDvznEyjy005miPF1Zgf6d";

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

        // Create By and Element for selectExchange
        By selectBinanceBy = By.cssSelector("ul.jsx-2489091780 > li:nth-of-type(1)");
        WebElement selectBinance = driver.findElement(selectBinanceBy);

        // Click on exchanges buttons
        selectBinance.click();

        // Create By and Element for firstTextBox
        By firstTextBoxBy = By.cssSelector("div.jsx-2795784314 > .inputs-section > div:nth-of-type(1) [placeholder='Enter here']");
        WebElement firstTextBox = driver.findElement(firstTextBoxBy);

        // Type valid address in firstTextBox
        firstTextBox.sendKeys(binanceValidAddress1);

        // Create By and Element for secondTextBox
        By secondTextBoxBy = By.cssSelector("div.jsx-2795784314 div:nth-of-type(2) [name]");
        WebElement secondTextBox = driver.findElement(secondTextBoxBy);

        // Type valid address in secondTextBox
        secondTextBox.sendKeys(binanceValidAddress2);

        // Create By and Element for submitButton
        By submitButtonBy = By.xpath("//button[.='Submit']");
        WebElement submitButton = driver.findElement(submitButtonBy);

        // Click on submitButton
        submitButton.click();

        // Create By for spotAccount
        By spotAccountBy = By.cssSelector("div.input-sections > div:nth-of-type(1) .jsx-3279326736 > .table-row");

        // Create By for marginAccount
        By marginAccountBy = By.cssSelector("div.input-sections > div:nth-of-type(2) .jsx-3279326736 > .table-row");

        // Create By for futuresAccount
        By futuresAccountBy = By.cssSelector("div.input-sections > div:nth-of-type(3) .jsx-3279326736 > .table-row");

        // Create By for addAccounts button
        By addAccountsBy = By.xpath("//button[.='Add Accounts']");

        // Run method where remove all checkboxes
        removeAllCheckBoxes(driver, spotAccountBy, marginAccountBy, futuresAccountBy, addAccountsBy);

        // Run method where enabled only spot
        onlySpot(driver, marginAccountBy, futuresAccountBy, addAccountsBy);

        // Run method where enabled only margin
        onlyMargin(driver, spotAccountBy, futuresAccountBy, addAccountsBy);

        // Run method where enabled only futures
        onlyFutures(driver, spotAccountBy, marginAccountBy, addAccountsBy);

        // Run method where enabled spot and margin
        spotAndMargin(driver, futuresAccountBy, addAccountsBy);

        // Run method where enabled spot and futures
        spotAndFutures(driver, marginAccountBy, addAccountsBy);

        // Run method where enabled margin and futures
        marginAndFutures(driver, spotAccountBy, addAccountsBy);
    }


    public static void removeAllCheckBoxes(WebDriver driver, By spotAccountBy, By marginAccountBy, By futuresAccountBy, By addAccountsBy)
    {

        // Create Element for spotAccount
        WebElement spotAccount = driver.findElement(spotAccountBy);

        // Click on spotAccount
        spotAccount.click();

        // Create Element for marginAccount
        WebElement marginAccount = driver.findElement(marginAccountBy);

        // Click on marginAccount
        marginAccount.click();

        // Create Element for futuresAccount
        WebElement futuresAccount = driver.findElement(futuresAccountBy);

        // Click on futuresAccount
        futuresAccount.click();

        // Create Element for addAccounts button
        WebElement addAccounts = driver.findElement(addAccountsBy);

        // Click on addAccounts button
        addAccounts.click();

        // If errorMessageAccountsAreEmpty is found - Passed, else - Failed
        try
        {
            By errorMessageAccountsAreEmptyBy = By.cssSelector(".description");
            WebElement errorMessageAccountsAreEmpty = driver.findElement(errorMessageAccountsAreEmptyBy);
            System.out.println("RemoveAllCheckBoxes - Passed");
        }
        catch (NoSuchElementException e)
        {
            System.out.println("RemoveAllCheckBoxes - Failed. Error message doesn't get");
        }

    }

    public static void onlySpot(WebDriver driver, By marginAccountBy, By futuresAccountBy, By addAccountsBy )
    {
        // Create Element for marginAccount
        WebElement marginAccount = driver.findElement(marginAccountBy);

        // Click on marginAccount
        marginAccount.click();

        // Create Element for futuresAccount
        WebElement futuresAccount = driver.findElement(futuresAccountBy);

        // Click on futuresAccount
        futuresAccount.click();

        // Create Element for addAccounts button
        WebElement addAccounts = driver.findElement(addAccountsBy);

        // Click on addAccounts button
        addAccounts.click();

    }

    public static void onlyMargin(WebDriver driver, By spotAccountBy, By futuresAccountBy, By addAccountsBy )
    {
        // Create Element for spotAccount
        WebElement spotAccount = driver.findElement(spotAccountBy);

        // Click on spotAccount
        spotAccount.click();

        // Create Element for futuresAccount
        WebElement futuresAccount = driver.findElement(futuresAccountBy);

        // Click on futuresAccount
        futuresAccount.click();

        // Create Element for addAccounts button
        WebElement addAccounts = driver.findElement(addAccountsBy);

        // Click on addAccounts button
        addAccounts.click();

    }

    public static void onlyFutures(WebDriver driver, By spotAccountBy, By marginAccountBy, By addAccountsBy )
    {
        // Create Element for spotAccount
        WebElement spotAccount = driver.findElement(spotAccountBy);

        // Click on spotAccount
        spotAccount.click();

        // Create Element for marginAccount
        WebElement marginAccount = driver.findElement(marginAccountBy);

        // Click on futuresAccount
        marginAccount.click();

        // Create Element for addAccounts button
        WebElement addAccounts = driver.findElement(addAccountsBy);

        // Click on addAccounts button
        addAccounts.click();

    }

    public static void spotAndMargin(WebDriver driver,By futuresAccountBy, By addAccountsBy )
    {
        // Create Element for futuresAccount
        WebElement futuresAccount = driver.findElement(futuresAccountBy);

        // Click on futuresAccount
        futuresAccount.click();

        // Create Element for addAccounts button
        WebElement addAccounts = driver.findElement(addAccountsBy);

        // Click on addAccounts button
        addAccounts.click();

    }

    public static void spotAndFutures(WebDriver driver,By marginAccountBy, By addAccountsBy )
    {
        // Create Element for marginAccount
        WebElement marginAccount = driver.findElement(marginAccountBy);

        // Click on futuresAccount
        marginAccount.click();

        // Create Element for addAccounts button
        WebElement addAccounts = driver.findElement(addAccountsBy);

        // Click on addAccounts button
        addAccounts.click();

    }

    public static void marginAndFutures(WebDriver driver,By spotAccountBy, By addAccountsBy )
    {
        // Create Element for spotAccount
        WebElement spotAccount = driver.findElement(spotAccountBy);

        // Click on spotAccount
        spotAccount.click();

        // Create Element for addAccounts button
        WebElement addAccounts = driver.findElement(addAccountsBy);

        // Click on addAccounts button
        addAccounts.click();

    }

}
