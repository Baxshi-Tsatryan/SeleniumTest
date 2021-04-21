package Chrome.TestPackage;

import java.lang.String;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckMainPrices {

    public static void main(String[] args) throws InterruptedException {

        // Enable ChromeDriverName and ChromeDriverPath
        String chromeDriverName = "webdriver.chrome.driver";
        String chromeDriverPath = "/Users/jenkins/Desktop/SeleniumTest/src/main/resources/chromedriver";
        System.setProperty(chromeDriverName, chromeDriverPath);

        // New driver object
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // Run Method
        int index = 1;
        getPrices(driver, index);

        // Sleep 3 sec
        Thread.sleep(3000);

        // Exit browser
        driver.quit();
    }

    public static void getPrices(WebDriver driver, int index) throws InterruptedException {

        // -------------------CoinStats--------------------
        index = 1;

        do {

            // CS link, refresh and sleep
            String coinstatsURL = "https://coinstats.app/";
            driver.get(coinstatsURL);

            // Location and creating element. Index
            By coinIndexBy = By.cssSelector("a[aria-label='" + index + "']");
            WebElement coinIndex = driver.findElement(coinIndexBy);

            // Open Coin Details page
            coinIndex.click();

            // Sleep 3 sec
            Thread.sleep(3000);

            // Location and creating element for Coin's Main Price
            By coinMainPriceBy = By.className("main-price");
            WebElement coinMainPrice = driver.findElement(coinMainPriceBy);

            // Location and creating element for Coin's name
            By coinNameBy = By.xpath("//html//body//div[1]//main//section//div//div[1]//div[1]//div[3]//div[1]//h1");
            By coinName2By = By.xpath("//html//body//div[1]//main//section//div//div[3]//div[3]//div[2]//div[1]//div[3]//p//span[1]");
            WebElement coinName = driver.findElement(coinNameBy);
            WebElement coinName2 = driver.findElement(coinName2By);

            // Get price, delete '$' and ','
            String coinName2Str = coinName2.getText()
                    .replace(" ", "-")
                    .replace(".", "-")
                    .toLowerCase();

            // Get price, delete '$' and ','
            String coinMainPriceStr = coinMainPrice.getText()
                    .replace("$", "")
                    .replace(",", "");

            // Parse to float
            float coinMainPriceFloat = Float.parseFloat(coinMainPriceStr);

            // Get coin's name
            String coinNameStr = coinName.getText();

            // Coin name
            String coinOnlyNameStr = coinNameStr.substring(0, coinNameStr.length() - 6)
                    .replace("(", "")
                    .replace(" ", "-")
                    .replace(".", "-")
                    .toLowerCase();

            // Coin name 2
            String coinOnly3Letters = coinNameStr
                    .substring(coinNameStr.length() - 5)
                    .replace(")", "")
                    .replace("(", "")
                    .replace(" ", "")
                    .toLowerCase();


            // -------------------Coingecko--------------------

            // CG link, refresh and sleep
            String coingeckoURL = "https://www.coingecko.com/en/coins/" + coinName2Str;
            driver.get(coingeckoURL);

            // Location and creating element
            By coinPriceCGBy = By.cssSelector("span[data-coin-symbol='" + coinOnly3Letters + "']");
            WebElement coinPriceCGElement = driver.findElement(coinPriceCGBy);

            // Get coin's price
            String coinPriceCG = coinPriceCGElement.getText()
                    .replace("$", "")
                    .replace(",", "");

            // Parse to float
            float CoinPriceCGFloat = Float.parseFloat(coinPriceCG);

            // Get Percents
            float percent = getPercents(coinMainPriceFloat);
            float moreThan = getPercentMoreThan(percent, CoinPriceCGFloat);
            float lessThan = getPercentLessThan(percent, CoinPriceCGFloat);

            // Validation
            if (coinMainPriceFloat < moreThan && coinMainPriceFloat > lessThan)
            {
                System.out.println("CoinStats " + index + "th " + coinNameStr + " price is OK");
            }

            else
            {
                System.err.println("Oops, CoinStats " + coinNameStr + "price is incorrect. Please check");
                System.out.println("In CoinStats " + index + "th: " + coinNameStr + " price is: " + coinMainPriceFloat + "$");
                System.out.println("In CoinGecko " + index + "th: " + coinNameStr + " price is: " + CoinPriceCGFloat + "$");
                System.out.println();
            }

            // Index + 1
            index++;

        } while (index != 20);
    }

    // Get percent of number
    public static float getPercents(float coinPrice )
    {
        float percent = 2f;
        float hundred = 100f;
        float answerPercent = (percent / hundred) * coinPrice;
        return answerPercent;
    }

    // Get More than number
    public static float getPercentMoreThan (float percent, float coinPriceCG)
    {
        float moreThanAnswer = coinPriceCG + percent;

        return moreThanAnswer;
    }

    // Get Less than number
    public static float getPercentLessThan (float percent, float coinPriceCG)
    {
        float lessThanAnswer = coinPriceCG - percent;

        return lessThanAnswer;
    }
}