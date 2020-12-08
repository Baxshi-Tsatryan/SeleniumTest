package AllPages.PortfolioPage;

import MainPackage.SeleniumUtils;
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

    public void clickOnOpenPositionsTab()
    {
        utils.clickOnElement(openPositionsTab);
    }

    public void clickOnChartsTab()
    {
        utils.clickOnElement(chartsTab);
    }

    public void clickOnOrdersTab()
    {
        utils.clickOnElement(ordersTab);
    }

    public Boolean openPositionsTabIsDisplayed()
    {
        return utils.isDisplayed(openPositionsTab);
    }

    public Boolean ordersTabIsDisplayed()
    {
        return utils.isDisplayed(ordersTab);
    }


    // Charts

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

    public Boolean chartUSDIsSelected()
    {
        return utils.isSelected(chartUSD);
    }

    public Boolean chartUSDIsEnabled()
    {
        return utils.isEnabled(chartUSD);
    }

    public void clickOnChartBTC()
    {
        utils.clickOnElement(chartBTC);
    }

    public Boolean chartBTCIsSelected()
    {
        return utils.isSelected(chartBTC);
    }

    public Boolean chartBTCIsEnabled()
    {
        return utils.isEnabled(chartBTC);
    }

    public void clickOnChartETH()
    {
        utils.clickOnElement(chartETH);
    }

    public Boolean chartETHIsSelected()
    {
        return utils.isSelected(chartETH);
    }

    public Boolean chartETHIsEnabled()
    {
        return utils.isEnabled(chartETH);
    }


    // Analytics

    public String getTotalTradeCountAnalytics()
    {
        return utils.getText(totalTradeCountAnalytics);
    }

    public Boolean totalTradeCountAnalyticsIsDisplayed()
    {
        return utils.isDisplayed(totalTradeCountAnalytics);
    }

    public String getTotalWithdrawAnalytics()
    {
        return utils.getText(totalWithdrawAnalytics);
    }

    public Boolean totalWithdrawAnalyticsIsDisplayed()
    {
        return utils.isDisplayed(totalWithdrawAnalytics);
    }

    public String getTotalFeePaidAnalytics()
    {
        return utils.getText(totalFeePaidAnalytics);
    }

    public Boolean totalFeePaidAnalyticsIsDisplayed()
    {
        return utils.isDisplayed(totalFeePaidAnalytics);
    }

    public String getTotalDepositsAnalytics()
    {
        return utils.getText(totalDepositsAnalytics);
    }

    public Boolean totalDepositsAnalyticsIsDisplayed()
    {
        return utils.isDisplayed(totalDepositsAnalytics);
    }

    public String getTopTradedPairAnalytics()
    {
        return utils.getText(topTradedPairAnalytics);
    }

    public Boolean topTradedPairAnalyticsIsDisplayed()
    {
        return utils.isDisplayed(topTradedPairAnalytics);
    }

    public String getTopTradeCountPairAnalytics()
    {
        return utils.getText(topTradeCountAnalytics);
    }

    public Boolean topTradeCountPairAnalyticsIsDisplayed()
    {
        return utils.isDisplayed(topTradeCountAnalytics);
    }


    // Orders Filters

    public void typeDateFromOrders(String date)
    {
        utils.sendKeysAction(dateFromFieldOrders, date);
    }

    public String getDateFromOrders()
    {
        return utils.getText(dateFromFieldOrders);
    }

    public void clearDateFromOrders()
    {
        utils.clear(dateFromFieldOrders);
    }

    public void typeDateToOrders(String date)
    {
        utils.sendKeysAction(dateToFieldOrders, date);
    }

    public String getDateToOrders()
    {
        return utils.getText(dateToFieldOrders);
    }

    public void clearDateToOrders()
    {
        utils.clear(dateToFieldOrders);
    }

    public void clickOnNextMonth()
    {
        utils.clickOnElement(nextMonth);
    }

    public void clickOnPreviousMonth()
    {
        utils.clickOnElement(previousMonth);
    }

    public String getCurrentMonthYear()
    {
        return utils.getText(currentMonthYear);
    }

    public void typeCoinNameOrders(String coinName)
    {
        utils.sendKeysAction(searchCoinFieldOrders, coinName);
    }

    public String getCoinNameOrders()
    {
        return utils.getText(searchCoinFieldOrders);
    }

    public void clearCoinNameOrders()
    {
        utils.clear(searchCoinFieldOrders);
    }

}
