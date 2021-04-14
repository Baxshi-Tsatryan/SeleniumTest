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

    public String getMarketCap() {
        return utils.getText(marketCap);
    }

    public MarketCap clickOnMarketCap24h() {
        utils.click(marketCap24h);
        return this;
    }

    public MarketCap clickOnMarketCap1w() {
        utils.click(marketCap1w);
        return this;
    }

    public MarketCap clickOnMarketCap1m() {
        utils.click(marketCap1m);
        return this;
    }

    public MarketCap clickOnMarketCap3m() {
        utils.click(marketCap3m);
        return this;
    }

    public MarketCap clickOnMarketCap6m() {
        utils.click(marketCap6m);
        return this;
    }

    public MarketCap clickOnMarketCap1y() {
        utils.click(marketCap1y);
        return this;
    }

    public MarketCap clickOnMarketCapAll() {
        utils.click(marketCapAll);
        return this;
    }


    // BTC Dominance

    public String getBTCDominance() {
        return utils.getText(BTCDominance);
    }

    public MarketCap clickOnBTCDominance24h() {
        utils.click(BTCDominance24h);
        return this;
    }

    public MarketCap clickOnBTCDominance1w() {
        utils.click(BTCDominance1w);
        return this;
    }

    public MarketCap clickOnBTCDominance1m() {
        utils.click(BTCDominance1m);
        return this;
    }

    public MarketCap clickOnBTCDominance3m() {
        utils.click(BTCDominance3m);
        return this;
    }

    public MarketCap clickOnBTCDominance6m() {
        utils.click(BTCDominance6m);
        return this;
    }

    public MarketCap clickOnBTCDominance1y() {
        utils.click(BTCDominance1y);
        return this;
    }

    public MarketCap clickOnBTCDominanceAll() {
        utils.click(BTCDominanceAll);
        return this;
    }

}
