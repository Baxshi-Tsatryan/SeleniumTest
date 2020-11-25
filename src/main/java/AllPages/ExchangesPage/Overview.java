package AllPages.ExchangesPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Overview {

    WebDriver driver;
    SeleniumUtils utils;

    public Overview(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    By overviewTab = By.cssSelector("#__next > main > section > div > div.exchange-info-inner-wrapper > div.exchange-info-tabs-wrapper > div > ul > li.active-tab > a");

    // Chart

    By change24h = By.cssSelector("div.percent-change-section span:nth-of-type(2)");

    By chart24h = By.cssSelector("div.chart-types > div:nth-of-type(1) > .primary-nav");

    By chart1w = By.cssSelector("div.chart-types > div:nth-of-type(2) > .primary-nav");

    By chart1m = By.cssSelector("div.chart-types > div:nth-of-type(3) > .primary-nav");

    By chart3m = By.cssSelector("div.chart-types > div:nth-of-type(4) > .primary-nav");

    By chart6m = By.cssSelector("div.chart-types > div:nth-of-type(5) > .primary-nav");

    By chart1y = By.cssSelector("div.chart-types > div:nth-of-type(6) > .primary-nav");

    By chartAll = By.cssSelector("div.chart-types > div:nth-of-type(7) > .primary-nav");

    By chartUSD = By.cssSelector("span.jsx-1710627871");

    By chartBTC = By.cssSelector("span.jsx-4079910431");

    By chartETH = By.cssSelector("span.jsx-1754482975");


    // Markets

    By marketsShowMore = By.cssSelector("div.jsx-2907004035 > .title-section > .jsx-1426819953");

    By marketsIndexRank = By.cssSelector("thead th:nth-of-type(1) > .table-column-title");

    By marketsNameRank = By.cssSelector("thead th:nth-of-type(2) > .table-column-title");

    By marketPairRank = By.cssSelector("thead th:nth-of-type(3) > .table-column-title");

    By marketsVolume24hRank = By.cssSelector("thead th:nth-of-type(4) > .table-column-title");

    By marketsVolumePercentRank = By.cssSelector("thead th:nth-of-type(5) > .table-column-title");

    By marketsPriceRank = By.cssSelector("thead th:nth-of-type(6) > .table-column-title");

    By marketsLastUpdatedRank = By.cssSelector("thead th:nth-of-type(7) > .table-column-title");


    // Team Updates

    By teamUpdatesShowMore = By.cssSelector("div.news-title > .jsx-1426819953");


    // ----------------------------------------------------- Methods ------------------------------------------------

    public void clickOnOverviewTab()
    {
        utils.clickOnElement(overviewTab);
    }


    // Chart

    public String get24hChange()
    {
        return utils.getText(change24h);
    }

    public String get24hChangeColor()
    {
        return utils.getCSSValue(change24h, "color");
    }

    public void clickOnChart24h()
    {
        utils.clickOnElement(chart24h);
    }

    public void clickOnChart1w()
    {
        utils.clickOnElement(chart1w);
    }

    public void clickOnChart1m()
    {
        utils.clickOnElement(chart1m);
    }

    public void clickOnChart3m()
    {
        utils.clickOnElement(chart3m);
    }

    public void clickOnChart6m()
    {
        utils.clickOnElement(chart6m);
    }

    public void clickOnChart1y()
    {
        utils.clickOnElement(chart1y);
    }

    public void clickOnChartAll()
    {
        utils.clickOnElement(chartAll);
    }

    public void clickOnChartUSD()
    {
        utils.clickOnElement(chartUSD);
    }

    public Boolean chartUSDIsEnabled()
    {
        return utils.isEnabled(chartUSD);
    }

    public Boolean chartUSDIsSelected()
    {
        return utils.isSelected(chartUSD);
    }

    public void clickOnChartBTC()
    {
        utils.clickOnElement(chartBTC);
    }

    public Boolean chartBTCIsEnabled()
    {
        return utils.isEnabled(chartBTC);
    }

    public Boolean chartBTCIsSelected()
    {
        return utils.isSelected(chartBTC);
    }

    public void clickOnChartETH()
    {
        utils.clickOnElement(chartETH);
    }

    public Boolean chartETHIsEnabled()
    {
        return utils.isEnabled(chartETH);
    }

    public Boolean chartETHIsSelected()
    {
        return utils.isSelected(chartETH);
    }


    // Markets

    public void clickOnMarketsShowMore()
    {
        utils.clickOnElement(marketsShowMore);
    }

    public void clickOnMarketsIndexRank()
    {
        utils.clickOnElement(marketsIndexRank);
    }

    public void clickOnMarketsNameRank()
    {
        utils.clickOnElement(marketsNameRank);
    }

    public void clickOnMarketsPairRank()
    {
        utils.clickOnElement(marketPairRank);
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


    // Team Updates

    public void clickOnTeamUpdatesShowMore()
    {
        utils.clickOnElement(teamUpdatesShowMore);
    }

}
