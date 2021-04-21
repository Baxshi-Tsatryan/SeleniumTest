package Chrome.AllPages.PortfolioPage;

import Chrome.MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenPositionsChartsOrders {

    WebDriver driver;
    SeleniumUtils utils;

    public OpenPositionsChartsOrders(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    By openPositionsTab = By.cssSelector("a[href='/en/portfolio/open-positions/']");

    By chartsTab = By.cssSelector("a[href='/en/portfolio/charts/']");

    By ordersTab = By.cssSelector("a[href='/en/portfolio/order-history/']");


    // Charts

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

    By heatmap = By.cssSelector("div.treemap-chart-container-wrapper > .title");


    // Analytics

    By totalTradeCountAnalytics = By.cssSelector("div.column2 > div:nth-of-type(1) .jsx-544775375");

    By totalWithdrawAnalytics = By.cssSelector("div.column3 > div:nth-of-type(1) .jsx-544775375");

    By totalFeePaidAnalytics = By.cssSelector("div.column4 > div:nth-of-type(1) .jsx-544775375");

    By totalDepositsAnalytics = By.cssSelector("div.column2 > div:nth-of-type(2) .jsx-544775375");

    By topTradedPairAnalytics = By.cssSelector("div.column3 > div:nth-of-type(2) .jsx-544775375");

    By topTradeCountAnalytics = By.cssSelector("div.column4 > div:nth-of-type(2) .jsx-544775375");


    // Filters

    By searchCoinFieldOrders = By.cssSelector("[placeholder='Search coin']");

    By dateFromFieldOrders = By.cssSelector("[placeholder='From']");

    By dateToFieldOrders = By.cssSelector("[placeholder='To']");


    // Calendar

    By nextMonth = By.cssSelector(".react-datepicker__navigation--next");

    By previousMonth = By.cssSelector(".react-datepicker__navigation--previous");

    By currentMonthYear = By.cssSelector(".react-datepicker__current-month");


    // --------------------------------------------------- Methods -------------------------------------------------

    public OpenPositionsChartsOrders clickOnOpenPositionsTab() {
        utils.click(openPositionsTab);
        return this;
    }

    public OpenPositionsChartsOrders clickOnChartsTab() {
        utils.click(chartsTab);
        return this;
    }

    public OpenPositionsChartsOrders clickOnOrdersTab() {
        utils.click(ordersTab);
        return this;
    }

    public Boolean openPositionsTabIsDisplayed() {
        return utils.isDisplayed(openPositionsTab);
    }

    public Boolean ordersTabIsDisplayed() {
        return utils.isDisplayed(ordersTab);
    }


    // Charts

    public OpenPositionsChartsOrders clickOnChart24h() {
        utils.click(chart24h);
        return this;
    }

    public OpenPositionsChartsOrders clickOnChart1w() {
        utils.click(chart1w);
        return this;
    }

    public OpenPositionsChartsOrders clickOnChart1m() {
        utils.click(chart1m);
        return this;
    }

    public OpenPositionsChartsOrders clickOnChart3m() {
        utils.click(chart3m);
        return this;
    }

    public OpenPositionsChartsOrders clickOnChart6m() {
        utils.click(chart6m);
        return this;
    }

    public OpenPositionsChartsOrders clickOnChart1y() {
        utils.click(chart1y);
        return this;
    }

    public OpenPositionsChartsOrders clickOnChartAll() {
        utils.click(chartAll);
        return this;
    }

    public OpenPositionsChartsOrders clickOnChartUSD() {
        utils.click(chartUSD);
        return this;
    }

    public Boolean chartUSDIsSelected() {
        return utils.isSelected(chartUSD);
    }

    public Boolean chartUSDIsEnabled() {
        return utils.isEnabled(chartUSD);
    }

    public OpenPositionsChartsOrders clickOnChartBTC() {
        utils.click(chartBTC);
        return this;
    }

    public Boolean chartBTCIsSelected() {
        return utils.isSelected(chartBTC);
    }

    public Boolean chartBTCIsEnabled() {
        return utils.isEnabled(chartBTC);
    }

    public OpenPositionsChartsOrders clickOnChartETH() {
        utils.click(chartETH);
        return this;
    }

    public Boolean chartETHIsSelected() {
        return utils.isSelected(chartETH);
    }

    public Boolean chartETHIsEnabled() {
        return utils.isEnabled(chartETH);
    }

    public Boolean heatmapIsDisplayed() {
        return utils.isDisplayed(heatmap);
    }


    // Analytics

    public String getTotalTradeCountAnalytics() {
        return utils.getText(totalTradeCountAnalytics);
    }

    public Boolean totalTradeCountAnalyticsIsDisplayed() {
        return utils.isDisplayed(totalTradeCountAnalytics);
    }

    public String getTotalWithdrawAnalytics() {
        return utils.getText(totalWithdrawAnalytics);
    }

    public Boolean totalWithdrawAnalyticsIsDisplayed() {
        return utils.isDisplayed(totalWithdrawAnalytics);
    }

    public String getTotalFeePaidAnalytics() {
        return utils.getText(totalFeePaidAnalytics);
    }

    public Boolean totalFeePaidAnalyticsIsDisplayed() {
        return utils.isDisplayed(totalFeePaidAnalytics);
    }

    public String getTotalDepositsAnalytics() {
        return utils.getText(totalDepositsAnalytics);
    }

    public Boolean totalDepositsAnalyticsIsDisplayed() {
        return utils.isDisplayed(totalDepositsAnalytics);
    }

    public String getTopTradedPairAnalytics() {
        return utils.getText(topTradedPairAnalytics);
    }

    public Boolean topTradedPairAnalyticsIsDisplayed() {
        return utils.isDisplayed(topTradedPairAnalytics);
    }

    public String getTopTradeCountPairAnalytics() {
        return utils.getText(topTradeCountAnalytics);
    }

    public Boolean topTradeCountPairAnalyticsIsDisplayed() {
        return utils.isDisplayed(topTradeCountAnalytics);
    }


    // Orders Filters

    public OpenPositionsChartsOrders typeDateFromOrders(String date) {
        utils.sendKeysAction(dateFromFieldOrders, date);
        return this;
    }

    public String getDateFromOrders() {
        return utils.getText(dateFromFieldOrders);
    }

    public OpenPositionsChartsOrders clearDateFromOrders() {
        utils.clear(dateFromFieldOrders);
        return this;
    }

    public OpenPositionsChartsOrders typeDateToOrders(String date) {
        utils.sendKeysAction(dateToFieldOrders, date);
        return this;
    }

    public String getDateToOrders() {
        return utils.getText(dateToFieldOrders);
    }

    public OpenPositionsChartsOrders clearDateToOrders() {
        utils.clear(dateToFieldOrders);
        return this;
    }

    public OpenPositionsChartsOrders clickOnNextMonth() {
        utils.click(nextMonth);
        return this;
    }

    public OpenPositionsChartsOrders clickOnPreviousMonth() {
        utils.click(previousMonth);
        return this;
    }

    public String getCurrentMonthYear() {
        return utils.getText(currentMonthYear);
    }

    public OpenPositionsChartsOrders typeCoinNameOrders(String coinName) {
        utils.sendKeysAction(searchCoinFieldOrders, coinName);
        return this;
    }

    public String getCoinNameOrders() {
        return utils.getText(searchCoinFieldOrders);
    }

    public OpenPositionsChartsOrders clearCoinNameOrders() {
        utils.clear(searchCoinFieldOrders);
        return this;
    }

}
