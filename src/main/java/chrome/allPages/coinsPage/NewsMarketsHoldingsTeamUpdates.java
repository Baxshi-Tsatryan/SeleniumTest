package chrome.allPages.coinsPage;

import chrome.mainPackage.SeleniumUtils;
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

    public NewsMarketsHoldingsTeamUpdates clickOnNewsTab() {
        utils.click(newsTab);
        return this;
    }

    public NewsMarketsHoldingsTeamUpdates clickOnMarketsTab() {
        utils.click(marketsTab);
        return this;
    }

    public NewsMarketsHoldingsTeamUpdates clickOnHoldingsTab() {
        utils.click(holdingsTab);
        return this;
    }

    public NewsMarketsHoldingsTeamUpdates clickOnTeamUpdatesTab() {
        utils.click(teamUpdatesTab);
        return this;
    }


    // Markets

    public NewsMarketsHoldingsTeamUpdates clickOnMarketsExchangeRank() {
        utils.click(marketsExchangeRank);
        return this;
    }

    public NewsMarketsHoldingsTeamUpdates clickOnMarketsPairRank() {
        utils.click(marketsPairRank);
        return this;
    }

    public NewsMarketsHoldingsTeamUpdates clickOnMarketsVolume24hRank() {
        utils.click(marketsVolume24hRank);
        return this;
    }

    public NewsMarketsHoldingsTeamUpdates clickOnMarketsVolumePercentRank() {
        utils.click(marketsVolumePercentRank);
        return this;
    }

    public NewsMarketsHoldingsTeamUpdates clickOnMarketsPriceRank() {
        utils.click(marketsPriceRank);
        return this;
    }

    public NewsMarketsHoldingsTeamUpdates clickOnMarketsLastUpdatedRank() {
        utils.click(marketsLastUpdatedRank);
        return this;
    }


    // Holdings

    public String getHoldingsTotalCoin() {
        return utils.getText(holdingsTotalCoin);
    }

    public String getHoldingsAVGBuy() {
        return utils.getText(holdingsAVGBuy);
    }

    public String getHoldingsAVGSell() {
        return utils.getText(holdingsAVGSell);
    }

    public String getHoldingsTotalWorth() {
        return utils.getText(holdingsTotalWorth);
    }

    public String getHoldingsPLPrice() {
        return utils.getText(holdingsPLPrice);
    }

    public String getHoldingsPLPriceColor() {
        return utils.getCSSValue(holdingsPLPrice, "color");
    }

    public String getHoldingsPLPercent() {
        return utils.getText(holdingsPLPercent);
    }

    public String getHoldingsPLPercentColor() {
        return utils.getCSSValue(holdingsPLPercent, "color");
    }

    public NewsMarketsHoldingsTeamUpdates clickOnHoldingsPL3Dot() {
        utils.click(holdingsPL3Dot);
        return this;
    }

    public NewsMarketsHoldingsTeamUpdates clickOnHoldingsPLAllTime() {
        utils.click(holdingsPLAllTime);
        return this;
    }

    public NewsMarketsHoldingsTeamUpdates clickOnHoldingsPL24h() {
        utils.click(holdingsPL24h);
        return this;
    }

    public NewsMarketsHoldingsTeamUpdates clickOnHoldingsPLLastTrade() {
        utils.click(holdingsPLLastTrade);
        return this;
    }

    public NewsMarketsHoldingsTeamUpdates clickOnHoldingsPLCurrentHoldings() {
        utils.click(holdingsPLCurrentHoldings);
        return this;
    }

    public String getHoldingsCurrentPL() {
        return utils.getText(holdingsCurrentTime);
    }

    public NewsMarketsHoldingsTeamUpdates clickOnHoldingsPortfolioRank() {
        utils.click(holdingsPortfolioRank);
        return this;
    }

    public NewsMarketsHoldingsTeamUpdates clickOnHoldingsTotalCoinRank() {
        utils.click(holdingsTotalCoinRank);
        return this;
    }

    public NewsMarketsHoldingsTeamUpdates clickOnHoldingsAVGBuyRank() {
        utils.click(holdingsAVGBuyRank);
        return this;
    }

    public NewsMarketsHoldingsTeamUpdates clickOnHoldingsAVGSellRank() {
        utils.click(holdingsAVGSellRank);
        return this;
    }

    public NewsMarketsHoldingsTeamUpdates clickOnHoldingsTotalWorthRank() {
        utils.click(holdingsTotalWorthRank);
        return this;
    }

    public NewsMarketsHoldingsTeamUpdates clickOnHoldingsPLRank() {
        utils.click(holdingsPLRank);
        return this;
    }

    public NewsMarketsHoldingsTeamUpdates clickOnStartTracking() {
        utils.click(startTrackingButton);
        return this;
    }

    // Team Updates

    public NewsMarketsHoldingsTeamUpdates clickOnTeamUpdatesTweetNow() {
        utils.click(teamUpdatesTweetNow);
        return this;
    }

}

