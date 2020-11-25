package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Cookie;

public class ConnectExchangesWithAPIValid {

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

            // Get to CoinStats site
            String coinstatsURL = "https://coinstats.app/en/portfolio";
            driver.get(coinstatsURL);

            // Set Cookie (mail@mail.com | password account)
            driver.manage().addCookie(new Cookie("userData", "eyJzZXNzaW9uVG9rZW4iOiJyOjRhZTNjNTRhNDNjNGFiNDMwMzk1YWM2YWJmMWJkZTFhIn0="));
            driver.navigate().refresh();

            // Create By and Element for addPortfolio button
            By addPortfolioBy = By.cssSelector("#__next > main > div > div > div.jsx-2241105801.sidebar-container-wrapper.show > div > div.jsx-60857151.add-portfolio-container > button");
            WebElement addPortfolio = driver.findElement(addPortfolioBy);

            // Click on addPortfolio button
            addPortfolio.click();

            // ------------------------------ Exchanges data ----------------------------------------

            // Binance
            String binance1 = "IgBwMBybuvvx0aRaUr38YOQhj1kX466vaIQ0kC83bJBiIos03UFhQnUeZ0Ysi7zS";
            String binance2 = "QgDWe984yFJLDPJjSfPK2ymteGyN1etA5MTxAGhrmLDvznEyjy005miPF1Zgf6dW";

            // Binance US
            String binanceUS1 = "RVYB1wsPXYm7GS8rhDgpUnbJETPJYjeZ0VSxYaT1hYN3RvhkGzKHbpPXU8uit5iD";
            String binanceUS2 = "hfPdIOun7s13eI7uP5VbRgM6JEng6gqHc42PqBDyiarOgjesUPKMcZUe6Wxs48XL";

            // BitMax
            String bitmax1 = "j66A8Bd1gaOhe4tG8CGL9q4zihSMyrA9";
            String bitmax2 = "6HtuXsdCNJGITePjrVrg8LT3mhykRrkSjXvPRvqhHBQXwZQg46NuT6Hxksm6kkhI";

            // BitMex
            String bitmex1 = "U8-yOWvzvSG-c4pRoTiMltnp";
            String bitmex2 = "Ws0L6OIqkMW6GnRec4n5V1GNo3U-AX5k-FeUs_9hkOmJ4yNu";

            // Bitfinex
            String bitfinex1 = "R2rXFRXG4BFWdVCPUUbzLMsfR1w9vZx7Pek0a3I7Gjx";
            String bitfinex2 = "rSwjoDIiOchiC6t9FJ9ysLlud5DvLkyEjBDcEFiqYO4";

            // Bitso
            String bitso1 = "SnutcNsIls";
            String bitso2 = "a0b6d34688235fdcbee10f55593951d2";

            // ByBit
            // String bybit1 = "q0Uu0ewFuIkTND0WpQ";
            // String bybit2 = "wFJfv090YYvo1pkkYrmTkIXjyxWRWCAfJFGs";

            // Cexio
            String cexio1 = "KRDhLP69jBzHoGU18WXTQ0MKnOg";
            String cexio2 = "IpqYSm0CwqkCxTS8rzYd9z0xCo";
            String cexio3 = "up130020592";

            // Deribit
            String deribit1 = "lvKWWZBb";
            String deribit2 = "SffSvcmOxU6M4cyUyvZEY_iN7Suu_HIGxziAd4cIkTw";

            // HitBTC
            String hitBTC1 = "p2VltjQ_pgd6Pb9N0UTA8zktrE093mMo";
            String hitBTC2 = "uK2u9Y1BHxDZVabBqfHewisIzVqemNWe";

            // Huobi
            String huobi1 = "989a1c43-h6n2d4f5gh-0b86e4e1-3e86f";
            String huobi2 = "3a2eb487-d28d059f-583566b2-41b65";

            // IDEX
            String idex1 = "0x452c60a0c61ed0323557fb92488f5c922438cf2c";

            // Kraken
            String kraken1 = "nM8tGHI9HAU6LZLgqhRTnm03MDbvf5nMOh9sQ6bmh/eEZKSsh/YnpHP2";
            String kraken2 = "1Pw4wX+wYCMLaMLakVR7uAVvj6K/5/QzCccGXJxCYKHgM2Z7bHdgjmH4lCiE/gbbO5Q0F+/ShpUeYO7LgF8cpQ==";

            // KuCoin
            String kucoin1 = "5f3cc5b6e35cfe0006df99e5";
            String kucoin2 = "8f342288-10fa-44d8-8d6e-9b4c8bee6674";
            String kucoin3 = "coinstats";

            // Liquid
            String liquid1 = "1595065";
            String liquid2 = "spsdD33HWsQLmZxBfXVFPwrfByYjLcbIuDZYlUlWDN1QHEANsjyalSUqzHIKTQKtUAZo651iVGzw1uMxdhIJsQ==";

            // OKEX
            String okex1 = "0c9892e8-3b1c-4f40-aa37-fc0d8a9bbd0e";
            String okex2 = "29088D8B8BABCFC860FCCE1272D04619";
            String okex3 = "coinstats";

            // Poloniex
            String poloniex1 = "C6OM7H3S-O4OMXJW6-NAEREN4X-F4LNVDKY";
            String poloniex2 = "bc37997363241fd58e48bb825994ed7acd7f9bf9df33a6f0ee090717df155e4a8903079742eb656f65b7ac3375905ec3e4449cd2a71b01e899106973cae7d9c0";

            // ------------------------------ /Exchanges data ----------------------------------------

        do {

            // Only for now
            if (index == 3)
            {
                index += 4;
            }
            else if (index == 11)
            {
                index += 3;
            }
            else if (index == 16)
            {
                index++;
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

            // Create By for firstTextBox
            By firstTextBoxBy = By.cssSelector("div.jsx-2795784314 > .inputs-section > div:nth-of-type(1) [placeholder='Enter here']");

            // Create By for secondTextBox
            By secondTextBoxBy = By.cssSelector("div.jsx-2795784314 div:nth-of-type(2) [name]");

            // Create By for thirdTextBox
            By thirdTextBoxBy = By.cssSelector("div.jsx-2795784314 div:nth-of-type(3) [name]");

            // Create By for submitButton
            By submitButtonBy = By.cssSelector("div.submit-section > .jsx-1426819953");

            // Create By for yesButton
            By yesButtonBy = By.cssSelector("div.buttons-section > .primary");

            // Run exchanges method with index
            switch (index)
            {
                case 1:
                {
                    // Binance
                    connectBinance(driver, firstTextBoxBy, secondTextBoxBy, submitButtonBy, yesButtonBy, binance1, binance2);
                    break;
                }

                case 2:
                {
                    // BinanceUS
                    connectExchangesWithTwoTextBoxes(driver, firstTextBoxBy, secondTextBoxBy, submitButtonBy, yesButtonBy, binanceUS1, binanceUS2);
                    break;
                }

                case 3:
                {
                    // Coinbase
                    break;
                }

                case 4:
                {
                    // Coinbase Pro
                    break;
                }

                case 5:
                {
                    // CryptoComApp
                    break;
                }

                case 6:
                {
                    // CryptoComExchange
                    break;
                }

                case 7:
                {
                    // BitMax
                    connectExchangesWithTwoTextBoxes(driver, firstTextBoxBy, secondTextBoxBy, submitButtonBy, yesButtonBy, bitmax1, bitmax2);
                    break;
                }

                case 8:
                {
                    // BitMex
                    connectExchangesWithTwoTextBoxes(driver, firstTextBoxBy, secondTextBoxBy, submitButtonBy, yesButtonBy, bitmex1, bitmex2);
                    break;
                }

                case 9:
                {
                    // Bitfinex
                    connectExchangesWithTwoTextBoxes(driver, firstTextBoxBy, secondTextBoxBy, submitButtonBy, yesButtonBy, bitfinex1, bitfinex2);
                    break;
                }

                case 10:
                {
                    // Bitso
                    connectExchangesWithTwoTextBoxes(driver, firstTextBoxBy, secondTextBoxBy, submitButtonBy, yesButtonBy, bitso1, bitso2);
                    break;
                }

                case 11:
                {
                    // Bitstamp
                    break;
                }

                case 12:
                {
                    // Bittrex
                    break;
                }

                case 13:
                {
                    // Bybit
                    // connectExchangesWithTwoTextBoxes(driver, firstTextBoxBy, secondTextBoxBy, submitButtonBy, yesButtonBy, bybit1, bybit2);
                    break;
                }

                case 14:
                {
                    // Cexio
                    connectExchangesWithThreeTextBoxes(driver, firstTextBoxBy, secondTextBoxBy, thirdTextBoxBy, submitButtonBy, yesButtonBy, cexio1, cexio2, cexio3);
                    break;
                }

                case 15:
                {
                    // Deribit
                    connectExchangesWithTwoTextBoxes(driver, firstTextBoxBy, secondTextBoxBy, submitButtonBy, yesButtonBy, deribit1, deribit2);
                    break;
                }

                case 16:
                {
                    // Gemini
                    break;
                }

                case 17:
                {
                    // HitBTC
                    connectExchangesWithTwoTextBoxes(driver, firstTextBoxBy, secondTextBoxBy, submitButtonBy, yesButtonBy, hitBTC1, hitBTC2);
                    break;
                }

                case 18:
                {
                    // Huobi
                    connectExchangesWithTwoTextBoxes(driver, firstTextBoxBy, secondTextBoxBy, submitButtonBy, yesButtonBy, huobi1, huobi2);
                    break;
                }

                case 19:
                {
                    // IDEX
                    connectExchangeWithOneTextBox(driver, firstTextBoxBy, submitButtonBy, yesButtonBy, idex1);
                    break;
                }

                case 20:
                {
                    // Kraken
                    connectExchangesWithTwoTextBoxes(driver, firstTextBoxBy, secondTextBoxBy, submitButtonBy, yesButtonBy, kraken1, kraken2);
                    break;
                }

                case 21:
                {
                    // KuCoin
                    connectExchangesWithThreeTextBoxes(driver, firstTextBoxBy, secondTextBoxBy, thirdTextBoxBy, submitButtonBy, yesButtonBy, kucoin1, kucoin2, kucoin3);
                    break;
                }

                case 22:
                {
                    // Liquid
                    connectExchangesWithTwoTextBoxes(driver, firstTextBoxBy, secondTextBoxBy, submitButtonBy, yesButtonBy, liquid1, liquid2);
                    break;
                }

                case 23:
                {
                    //OKEX
                    connectExchangesWithThreeTextBoxes(driver, firstTextBoxBy, secondTextBoxBy, thirdTextBoxBy, submitButtonBy, yesButtonBy, okex1, okex2, okex3);
                    break;
                }

                case 24:
                {
                    // Poloniex
                    connectExchangesWithTwoTextBoxes(driver, firstTextBoxBy, secondTextBoxBy, submitButtonBy, yesButtonBy, poloniex1, poloniex2);
                    break;
                }
            }

            // Index + 1
            index++;

        } while (index != 25);

    }

    // Connect Binance method
    public static void connectBinance (WebDriver driver, By firstTextBoxBy, By secondTextBoxBy, By submitButtonBy, By yesButtonBy, String exchange1, String exchange2)
    {
        // Create Element for firstTextBox
        WebElement firstTextBox = driver.findElement(firstTextBoxBy);

        // Create Element for secondTextBox
        WebElement secondTextBox = driver.findElement(secondTextBoxBy);

        // Type valid text in firstTextBox
        firstTextBox.sendKeys(exchange1);

        // Type valid text in secondTextBox
        secondTextBox.sendKeys(exchange2);

        // Create Element for submitButton
        WebElement submitButton = driver.findElement(submitButtonBy);

        // Click on submitButton
        submitButton.click();

        // Create By and Element for addAccounts
        By addAccountsBy = By.cssSelector("#__next > main > div > div > div.jsx-2241105801.sidebar-container-wrapper.show > div.jsx-4109874676.universal-modal > div > div > div.jsx-4109874676.changing-content-wrapper > div.jsx-4109874676.changing-content.showing > div.new-portfolio-modal > div > button");
        WebElement addAccounts = driver.findElement(addAccountsBy);

        // Click on addAccounts button
        addAccounts.click();

        // Create Element for yesButton
        WebElement yesButton = driver.findElement(yesButtonBy);

        // Click on yesButton
        yesButton.click();
    }

    // Method when exchange has got two textboxes
    public static void connectExchangesWithTwoTextBoxes(WebDriver driver, By firstTextBoxBy, By secondTextBoxBy, By submitButtonBy, By yesButtonBy, String exchange1, String exchange2)
    {
        // Create Element for firstTextBox
        WebElement firstTextBox = driver.findElement(firstTextBoxBy);

        // Create Element for secondTextBox
        WebElement secondTextBox = driver.findElement(secondTextBoxBy);

        // Type valid text in firstTextBox
        firstTextBox.sendKeys(exchange1);

        // Type valid text in secondTextBox
        secondTextBox.sendKeys(exchange2);

        // Create Element for submitButton
        WebElement submitButton = driver.findElement(submitButtonBy);

        // Click on submitButton
        submitButton.click();

        // Create Element for yesButton
        WebElement yesButton = driver.findElement(yesButtonBy);

        // Click on yesButton
        yesButton.click();
    }

    // Method when exchange has got three textboxes
    public static void connectExchangesWithThreeTextBoxes(WebDriver driver, By firstTextBoxBy, By secondTextBoxBy, By thirdTextBoxBy, By submitButtonBy, By yesButtonBy, String exchange1, String exchange2, String exchange3)
    {
        // Create Element for firstTextBox
        WebElement firstTextBox = driver.findElement(firstTextBoxBy);

        // Create Element for secondTextBox
        WebElement secondTextBox = driver.findElement(secondTextBoxBy);

        // Create Element for thirdTextBox
        WebElement thirdTextBox = driver.findElement(thirdTextBoxBy);

        // Type valid text in firstTextBox
        firstTextBox.sendKeys(exchange1);

        // Type valid text in secondTextBox
        secondTextBox.sendKeys(exchange2);

        // Type valid text in thirdTextBox
        thirdTextBox.sendKeys(exchange3);

        // Create Element for submitButton
        WebElement submitButton = driver.findElement(submitButtonBy);

        // Click on submitButton
        submitButton.click();

        // Create Element for yesButton
        WebElement yesButton = driver.findElement(yesButtonBy);

        // Click on yesButton
        yesButton.click();
    }

    // Method when exchange has got one textbox
    public static void connectExchangeWithOneTextBox(WebDriver driver, By firstTextBoxBy, By submitButtonBy, By yesButtonBy, String exchange1)
    {
        // Create Element for firstTextBox
        WebElement firstTextBox = driver.findElement(firstTextBoxBy);

        // Type valid text in firstTextBox
        firstTextBox.sendKeys(exchange1);

        // Create Element for submitButton
        WebElement submitButton = driver.findElement(submitButtonBy);

        // Click on submitButton
        submitButton.click();

        // Create Element for yesButton
        WebElement yesButton = driver.findElement(yesButtonBy);

        // Click on yesButton
        yesButton.click();
    }

}