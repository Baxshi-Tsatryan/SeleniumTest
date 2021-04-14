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

    public Overview clickOnOverviewTab() {
        utils.click(overviewTab);
        return this;
    }


    // Chart

    public String get24hChange() {
        return utils.getText(change24h);
    }

    public String get24hChangeColor() {
        return utils.getCSSValue(change24h, "color");
    }

    public Overview clickOnChart24h() {
        utils.click(chart24h);
        return this;
    }

    public Overview clickOnChart1w() {
        utils.click(chart1w);
        return this;
    }

    public Overview clickOnChart1m() {
        utils.click(chart1m);
        return this;
    }

    public Overview clickOnChart3m() {
        utils.click(chart3m);
        return this;
    }

    public Overview clickOnChart6m() {
        utils.click(chart6m);
        return this;
    }

    public Overview clickOnChart1y() {
        utils.click(chart1y);
        return this;
    }

    public Overview clickOnChartAll() {
        utils.click(chartAll);
        return this;
    }

    public Overview clickOnChartUSD() {
        utils.click(chartUSD);
        return this;
    }

    public Boolean chartUSDIsEnabled() {
        return utils.isEnabled(chartUSD);
    }

    public Boolean chartUSDIsSelected() {
        return utils.isSelected(chartUSD);
    }

    public Overview clickOnChartBTC() {
        utils.click(chartBTC);
        return this;
    }

    public Boolean chartBTCIsEnabled() {
        return utils.isEnabled(chartBTC);
    }

    public Boolean chartBTCIsSelected() {
        return utils.isSelected(chartBTC);
    }

    public Overview clickOnChartETH() {
        utils.click(chartETH);
        return this;
    }

    public Boolean chartETHIsEnabled() {
        return utils.isEnabled(chartETH);
    }

    public Boolean chartETHIsSelected() {
        return utils.isSelected(chartETH);
    }


    // Markets

    public Overview clickOnMarketsShowMore() {
        utils.click(marketsShowMore);
        return this;
    }

    public Overview clickOnMarketsIndexRank() {
        utils.click(marketsIndexRank);
        return this;
    }

    public Overview clickOnMarketsNameRank() {
        utils.click(marketsNameRank);
        return this;
    }

    public Overview clickOnMarketsPairRank() {
        utils.click(marketPairRank);
        return this;
    }

    public Overview clickOnMarketsVolume24hRank() {
        utils.click(marketsVolume24hRank);
        return this;
    }

    public Overview clickOnMarketsVolumePercentRank() {
        utils.click(marketsVolumePercentRank);
        return this;
    }

    public Overview clickOnMarketsPriceRank() {
        utils.click(marketsPriceRank);
        return this;
    }

    public Overview clickOnMarketsLastUpdatedRank() {
        utils.click(marketsLastUpdatedRank);
        return this;
    }


    // Team Updates

    public Overview clickOnTeamUpdatesShowMore() {
        utils.click(teamUpdatesShowMore);
        return this;
    }

}
