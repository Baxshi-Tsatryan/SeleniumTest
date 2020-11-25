package AllPages;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarketCap {
    WebDriver driver;
    SeleniumUtils utils;

    public MarketCap(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    // Market Cap

    By marketCap = By.cssSelector("div.market-cap-chart-wrapper span:nth-of-type(2)");

    By marketCap24h = By.cssSelector("div.market-cap-chart-wrapper div:nth-of-type(1) > .primary-nav");

    By marketCap1w = By.cssSelector("div.market-cap-chart-wrapper div:nth-of-type(2) > .primary-nav");

    By marketCap1m = By.cssSelector("div.market-cap-chart-wrapper div:nth-of-type(3) > .primary-nav");

    By marketCap3m = By.cssSelector("div.market-cap-chart-wrapper div:nth-of-type(4) > .primary-nav");

    By marketCap6m = By.cssSelector("div.market-cap-chart-wrapper div:nth-of-type(5) > .primary-nav");

    By marketCap1y = By.cssSelector("div.market-cap-chart-wrapper div:nth-of-type(6) > .primary-nav");

    By marketCapAll = By.cssSelector("div.market-cap-chart-wrapper div:nth-of-type(7) > .primary-nav");


    // BTC Dominance

    By BTCDominance = By.cssSelector("div.dominance-chart-wrapper span:nth-of-type(2)");

    By BTCDominance24h = By.cssSelector("div.dominance-chart-wrapper div:nth-of-type(1) > .primary-nav");

    By BTCDominance1w = By.cssSelector("div.dominance-chart-wrapper div:nth-of-type(2) > .primary-nav");

    By BTCDominance1m = By.cssSelector("div.dominance-chart-wrapper div:nth-of-type(3) > .primary-nav");

    By BTCDominance3m = By.cssSelector("div.dominance-chart-wrapper div:nth-of-type(4) > .primary-nav");

    By BTCDominance6m = By.cssSelector("div.dominance-chart-wrapper div:nth-of-type(5) > .primary-nav");

    By BTCDominance1y = By.cssSelector("div.dominance-chart-wrapper div:nth-of-type(6) > .primary-nav");

    By BTCDominanceAll = By.cssSelector("div.dominance-chart-wrapper div:nth-of-type(7) > .primary-nav");



    // -------------------------------------------- Methods ------------------------------------------------

    // Market Cap

    public String getMarketCap()
    {
        return utils.getText(marketCap);
    }

    public void clickOnMarketCap24h()
    {
        utils.clickOnElement(marketCap24h);
    }

    public void clickOnMarketCap1w()
    {
        utils.clickOnElement(marketCap1w);
    }

    public void clickOnMarketCap1m()
    {
        utils.clickOnElement(marketCap1m);
    }

    public void clickOnMarketCap3m()
    {
        utils.clickOnElement(marketCap3m);
    }

    public void clickOnMarketCap6m()
    {
        utils.clickOnElement(marketCap6m);
    }

    public void clickOnMarketCap1y()
    {
        utils.clickOnElement(marketCap1y);
    }

    public void clickOnMarketCapAll()
    {
        utils.clickOnElement(marketCapAll);
    }


    // BTC Dominance

    public String getBTCDominance()
    {
        return utils.getText(BTCDominance);
    }

    public void clickOnBTCDominance24h()
    {
        utils.clickOnElement(BTCDominance24h);
    }

    public void clickOnBTCDominance1w()
    {
        utils.clickOnElement(BTCDominance1w);
    }

    public void clickOnBTCDominance1m()
    {
        utils.clickOnElement(BTCDominance1m);
    }

    public void clickOnBTCDominance3m()
    {
        utils.clickOnElement(BTCDominance3m);
    }

    public void clickOnBTCDominance6m()
    {
        utils.clickOnElement(BTCDominance6m);
    }

    public void clickOnBTCDominance1y()
    {
        utils.clickOnElement(BTCDominance1y);
    }

    public void clickOnBTCDominanceAll()
    {
        utils.clickOnElement(BTCDominanceAll);
    }

}
