package AllPages.CoinsPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewsMarketsHoldingsTeamUpdates {
    WebDriver driver;
    SeleniumUtils utils;

    public NewsMarketsHoldingsTeamUpdates(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    // Tabs

    By newsTab = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-tabs-wrapper > div > ul > li:nth-child(2) > a");

    By marketsTab = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-tabs-wrapper > div > ul > li:nth-child(3) > a");

    By holdingsTab = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-tabs-wrapper > div > ul > li:nth-child(4) > a");

    By teamUpdatesTab = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-tabs-wrapper > div > ul > li:nth-child(5) > a");


    // Markets

    By marketsExchangeRank = By.cssSelector("thead th:nth-of-type(1) > .table-column-title");

    By marketsPairRank = By.cssSelector("thead th:nth-of-type(2) > .table-column-title");

    By marketsVolume24hRank = By.cssSelector("thead th:nth-of-type(3) > .table-column-title");

    By marketsVolumePercentRank = By.cssSelector("thead th:nth-of-type(4) > .table-column-title");

    By marketsPriceRank = By.cssSelector("thead th:nth-of-type(5) > .table-column-title");

    By marketsLastUpdatedRank = By.cssSelector("thead th:nth-of-type(6) > .table-column-title");


    // Holdings

    By holdingsTotalCoin = By.cssSelector(".regular-weight.info-item-value");

    By holdingsAVGBuy = By.cssSelector("div.pl-info div:nth-of-type(2) > .info-item-value");

    By holdingsAVGSell = By.cssSelector("div.pl-info div:nth-of-type(3) > .info-item-value");

    By holdingsTotalWorth = By.cssSelector("div.pl-info > div:nth-of-type(2) > .jsx-773237358 > .info-item-value");

    By holdingsPLPrice = By.cssSelector("div.info-item-value-container > .info-item-value");

    By holdingsPLPercent = By.cssSelector(".profit-percent.jsx-773237358 > .table-row");

    By holdingsPL3Dot = By.cssSelector(".icon-more_small");

    By holdingsPLAllTime = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(1) > .table-row");

    By holdingsPL24h = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(2) > .table-row");

    By holdingsPLLastTrade = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(3) > .table-row");

    By holdingsPLCurrentHoldings = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(4) > .table-row");

    By holdingsCurrentTime = By.cssSelector("span.profit-loss-opt .table-column-title");

    By holdingsPortfolioRank = By.cssSelector("th.left > .table-column-title");

    By holdingsTotalCoinRank = By.cssSelector("thead th:nth-of-type(2) > .table-column-title");

    By holdingsAVGBuyRank = By.cssSelector("thead th:nth-of-type(3) > .table-column-title");

    By holdingsAVGSellRank = By.cssSelector("thead th:nth-of-type(4) > .table-column-title");

    By holdingsTotalWorthRank = By.cssSelector("thead th:nth-of-type(5) > .table-column-title");

    By holdingsPLRank = By.cssSelector("thead th:nth-of-type(6) > .table-column-title");

    By startTrackingButton = By.cssSelector(".primary");


    // Team Updates

    By teamUpdatesTweetNow = By.cssSelector(".secondary");


    // ------------------------------------------------- Methods ---------------------------------------------------


    // Tabs

    public void clickOnNewsTab()
    {
        utils.clickOnElement(newsTab);
    }

    public void clickOnMarketsTab()
    {
        utils.clickOnElement(marketsTab);
    }

    public void clickOnHoldingsTab()
    {
        utils.clickOnElement(holdingsTab);
    }

    public void clickOnTeamUpdatesTab()
    {
        utils.clickOnElement(teamUpdatesTab);
    }


    // Markets

    public void clickOnMarketsExchangeRank()
    {
        utils.clickOnElement(marketsExchangeRank);
    }

    public void clickOnMarketsPairRank()
    {
        utils.clickOnElement(marketsPairRank);
    }

    public void clickOnMarketsVolume24hRank()
    {
        utils.clickOnElement(marketsVolume24hRank);
    }

    public void clickOnMarketsVolumePercentRank()
    {
        utils.clickOnElement(marketsVolumePercentRank);
    }

    public void clickOnMarketsPriceRank()
    {
        utils.clickOnElement(marketsPriceRank);
    }

    public void clickOnMarketsLastUpdatedRank()
    {
        utils.clickOnElement(marketsLastUpdatedRank);
    }


    // Holdings

    public String getHoldingsTotalCoin()
    {
        return utils.getText(holdingsTotalCoin);
    }

    public String getHoldingsAVGBuy()
    {
        return utils.getText(holdingsAVGBuy);
    }

    public String getHoldingsAVGSell()
    {
        return utils.getText(holdingsAVGSell);
    }

    public String getHoldingsTotalWorth()
    {
        return utils.getText(holdingsTotalWorth);
    }

    public String getHoldingsPLPrice()
    {
        return utils.getText(holdingsPLPrice);
    }

    public String getHoldingsPLPriceColor()
    {
        return utils.getCSSValue(holdingsPLPrice, "color");
    }

    public String getHoldingsPLPercent()
    {
        return utils.getText(holdingsPLPercent);
    }

    public String getHoldingsPLPercentColor()
    {
        return utils.getCSSValue(holdingsPLPercent, "color");
    }

    public void clickOnHoldingsPL3Dot()
    {
        utils.clickOnElement(holdingsPL3Dot);
    }

    public void clickOnHoldingsPLAllTime()
    {
        utils.clickOnElement(holdingsPLAllTime);
    }

    public void clickOnHoldingsPL24h()
    {
        utils.clickOnElement(holdingsPL24h);
    }

    public void clickOnHoldingsPLLastTrade()
    {
        utils.clickOnElement(holdingsPLLastTrade);
    }

    public void clickOnHoldingsPLCurrentHoldings()
    {
        utils.clickOnElement(holdingsPLCurrentHoldings);
    }

    public String getHoldingsCurrentPL()
    {
        return utils.getText(holdingsCurrentTime);
    }

    public void clickOnHoldingsPortfolioRank()
    {
        utils.clickOnElement(holdingsPortfolioRank);
    }

    public void clickOnHoldingsTotalCoinRank()
    {
        utils.clickOnElement(holdingsTotalCoinRank);
    }

    public void clickOnHoldingsAVGBuyRank()
    {
        utils.clickOnElement(holdingsAVGBuyRank);
    }

    public void clickOnHoldingsAVGSellRank()
    {
        utils.clickOnElement(holdingsAVGSellRank);
    }

    public void clickOnHoldingsTotalWorthRank()
    {
        utils.clickOnElement(holdingsTotalWorthRank);
    }

    public void clickOnHoldingsPLRank()
    {
        utils.clickOnElement(holdingsPLRank);
    }

    public void clickOnStartTracking()
    {
        utils.clickOnElement(startTrackingButton);
    }

    // Team Updates

    public void clickOnTeamUpdatesTweetNow()
    {
        utils.clickOnElement(teamUpdatesTweetNow);
    }

}

