package AllPages.CoinsPage;

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

    By iconClose = By.cssSelector(".icon-close");

    By overviewTab = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-tabs-wrapper > div > ul > li.active-tab > a");


    // Chart

    By change24h = By.cssSelector("div.percent-change-section span:nth-of-type(2)");

    By candleChart = By.cssSelector(".icon-candle");

    By chart24h = By.cssSelector("div.chart-types > div:nth-of-type(2) > .primary-nav");

    By chart1w = By.cssSelector("div.chart-types > div:nth-of-type(3) > .primary-nav");

    By chart1m = By.cssSelector("div.chart-types > div:nth-of-type(4) > .primary-nav");

    By chart3m = By.cssSelector("div.chart-types > div:nth-of-type(5) > .primary-nav");

    By chart6m = By.cssSelector("div.chart-types > div:nth-of-type(6) > .primary-nav");

    By chart1y = By.cssSelector("div.chart-types > div:nth-of-type(7) > .primary-nav");

    By chartAll = By.cssSelector("div.chart-types > div:nth-of-type(8) > .primary-nav");

    By chartUSD = By.cssSelector("span.jsx-1710627871");

    By chartBTC = By.cssSelector("span.jsx-4079910431");

    By chartETH = By.cssSelector("span.jsx-1754482975");


    // Description

    By coinNameDescription = By.cssSelector("p.coin-description > span:nth-of-type(1)");

    By coinAvailableSupplyDescription = By.cssSelector("p.coin-description > span:nth-of-type(4)");

    By coinTotalSupplyDescription = By.cssSelector("p.coin-description > span:nth-of-type(5)");

    By coinMarketCapDescription = By.cssSelector("p.coin-description > span:nth-of-type(6)");

    By coin24hTradingVolumeDescription = By.cssSelector("p.coin-description > span:nth-of-type(7)");

    By coinMostActiveExchangeDescription = By.cssSelector("p.coin-description > span:nth-of-type(8)");


    // Coin Calc

    By investInvested = By.cssSelector(".simple-value");

    By firstValueCalc = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-sections > div > div.big-section.coin-desc-section > div.data-section.coin-calc-section > div.content-wrapper > div > div:nth-child(2) > div > input");

    By coinNameCalc = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-sections > div > div.big-section.coin-desc-section > div.data-section.coin-calc-section > div.content-wrapper > div > div:nth-child(3) > div > div > div > input");

    By secondValueCalc = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-sections > div > div.big-section.coin-desc-section > div.data-section.coin-calc-section > div.content-wrapper > div > div:nth-child(5) > div > input");

    By calcResult = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-sections > div > div.big-section.coin-desc-section > div.data-section.coin-calc-section > div.content-wrapper > div > div.jsx-341826057.line.result > div > input");

    By dateCalc = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-sections > div > div.big-section.coin-desc-section > div.data-section.coin-calc-section > div.content-wrapper > div > div:nth-child(4) > div > div > input[type=text]");

    By calendarNextMonth = By.cssSelector(".react-datepicker__navigation--next");

    By calendarPreviousMonth = By.cssSelector(".react-datepicker__navigation--previous");

    By calendarCurrentMonth = By.cssSelector(".react-datepicker__current-month");


    // Poll of the day

    By buyPoll = By.cssSelector("div.content-choices > button:nth-of-type(1)");

    By sellPoll = By.cssSelector("div.content-choices > button:nth-of-type(2)");

    By holdPoll = By.cssSelector("div.content-choices > button:nth-of-type(3)");

    By buyPercentPoll = By.cssSelector("div.poll-section > .content-wrapper > div:nth-of-type(1) span:nth-of-type(2)");

    By sellPercentPoll = By.cssSelector("div.poll-section div:nth-of-type(2) span:nth-of-type(2)");

    By holdPercentPoll = By.cssSelector("div.poll-section > .content-wrapper > div:nth-of-type(3) span:nth-of-type(1)");


    // Insights

    By helpInsights = By.cssSelector(".icon-info");

    // How many CoinStats users hold BTC?

    By firstInsightPercent = By.cssSelector("div[data-highcharts-chart='1'] .highcharts-title");

    By firstInsightShowChart = By.cssSelector("div.insights-section > .content-wrapper > div:nth-of-type(1) .table-row");

    // BTC dominance in CoinStats portfolios

    By secondInsightPercent = By.cssSelector("div[data-highcharts-chart='2'] .highcharts-title");

    By secondInsightShowChart = By.cssSelector("div.insights-section > .content-wrapper > div:nth-of-type(2) .table-row");

    By secondInsightGetPRO = By.cssSelector("div.insights-section .blurred > .show-chart > .table-row");

    // Where CoinStats users hold BTC?

    By thirdInsightPercent = By.cssSelector("div[data-highcharts-chart='3'] .highcharts-title");

    By thirdInsightWalletPercent = By.cssSelector("div.insights-section > .content-wrapper > div:nth-of-type(3) .percent-info > .table-row");

    By thirdInsightExchangePercent = By.cssSelector("div.insights-section > .content-wrapper > div:nth-of-type(3) .percent-info > div > .table-row");

    By thirdInsightShowChart = By.cssSelector("div.insights-section > .content-wrapper > div:nth-of-type(3) .show-chart > .table-row");

    // BTC trades today

    By forthInsightPercent = By.cssSelector("div[data-highcharts-chart='4'] .highcharts-title");

    By forthInsightBuyPercent = By.cssSelector("div.insights-section div:nth-of-type(4) .percent-info > .table-row");

    By forthInsightSellPercent = By.cssSelector("div.insights-section div:nth-of-type(4) .percent-info > div > .table-row");

    By forthInsightShowChart = By.cssSelector("div.insights-section div:nth-of-type(4) .show-chart > .table-row");

    By forthInsightGetPRO = By.cssSelector("div.insights-section .blurred > .insight-percents > .show-chart > .table-row");


    // Insights window

    By insightName = By.cssSelector("div.additional-title > .filter-value");

    By nextInsight = By.cssSelector("div.pagination-wrapper .icon-next");

    By previousInsight = By.cssSelector(".icon-prev");

    By firstInsightPoint = By.cssSelector("div.page-dots > div:nth-of-type(1)");

    By secondInsightPoint = By.cssSelector("div.page-dots > div:nth-of-type(2)");

    By thirdInsightPoint = By.cssSelector("div.page-dots > div:nth-of-type(3)");

    By forthInsightPoint = By.cssSelector("div.page-dots > div:nth-of-type(4)");

    By secondAndForthInsightsLearnMore = By.cssSelector("div.list-wrapper > .jsx-1426819953");


    // Markets

    By marketShowMore = By.cssSelector("div.jsx-1783652169 > div:nth-of-type(4) > .title-section > .jsx-1426819953");

    By marketExchangeRank = By.cssSelector("thead th:nth-of-type(1) > .table-column-title");

    By marketPairRank = By.cssSelector("thead th:nth-of-type(2) > .table-column-title");

    By marketVolume24hRank = By.cssSelector("thead th:nth-of-type(3) > .table-column-title");

    By marketVolumePercentRank = By.cssSelector("thead th:nth-of-type(4) > .table-column-title");

    By marketPriceRank = By.cssSelector("thead th:nth-of-type(5) > .table-column-title");

    By marketLastUpdatedRank = By.cssSelector("thead th:nth-of-type(6) > .table-column-title");


    // News

    By newsShowMore = By.cssSelector("div.news-title > .jsx-1426819953");


    // ----------------------------------------------- Methods -------------------------------------------------

    public void clickOnIconClose()
    {
        utils.clickOnElement(iconClose);
    }

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

    public void clickOnCandle()
    {
        utils.clickOnElement(candleChart);
    }

    public void clickOn24hChart()
    {
        utils.clickOnElement(chart24h);
    }

    public void clickOn1wChart()
    {
        utils.clickOnElement(chart1w);
    }

    public void clickOn1mChart()
    {
        utils.clickOnElement(chart1m);
    }

    public void clickOn3mChart()
    {
        utils.clickOnElement(chart3m);
    }

    public void clickOn6mChart()
    {
        utils.clickOnElement(chart6m);
    }

    public void clickOn1yChart()
    {
        utils.clickOnElement(chart1y);
    }

    public void clickOnAllChart()
    {
        utils.clickOnElement(chartAll);
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


    // Description

    public String getCoinNameDescription()
    {
        return utils.getText(coinNameDescription);
    }

    public String getCoinAvailableSupplyDescription()
    {
        return utils.getText(coinAvailableSupplyDescription);
    }

    public String getCoinTotalSupplyDescription()
    {
        return utils.getText(coinTotalSupplyDescription);
    }

    public String getCoinMarketCapDescription()
    {
        return utils.getText(coinMarketCapDescription);
    }

    public String getCoin24hTradingVolumeDescription()
    {
        return utils.getText(coin24hTradingVolumeDescription);
    }

    public String getCoinMostActiveExchangeDescription()
    {
        return utils.getText(coinMostActiveExchangeDescription);
    }


    // Coin Calc

    public void clickOnInvestInvested()
    {
        utils.clickOnElement(investInvested);
    }

    public Boolean coinCalcIsDisplayed()
    {
        return utils.isDisplayed(investInvested);
    }

    public String getInvestInvestedText()
    {
        return utils.getText(investInvested);
    }

    public void typeFirstValueCalc(String price)
    {
        utils.sendKeysAction(firstValueCalc, price);
    }

    public void clearFirstValueCalc()
    {
        utils.clear(firstValueCalc);
    }

    public String getFirstValueCalc()
    {
        return utils.getText(firstValueCalc);
    }

    public String getCoinNameCalc()
    {
        return utils.getText(coinNameCalc);
    }

    public void typeSecondValueCalc(String price)
    {
        utils.sendKeysAction(secondValueCalc, price);
    }

    public void clearSecondValueCalc()
    {
        utils.clear(secondValueCalc);
    }

    public String getSecondValueCalc()
    {
        return utils.getText(secondValueCalc);
    }

    public String getDateCalc()
    {
        return utils.getText(dateCalc);
    }

    public void typeDateCalc(String date)
    {
        utils.sendKeysAction(dateCalc, date);
    }

    public void clickOnDateCalc()
    {
        utils.clickOnElement(dateCalc);
    }

    public String getCurrentDateCalc()
    {
        return utils.getText(dateCalc);
    }

    public void clickOnNextMonthCalc() {
        utils.clickOnElement(calendarNextMonth);
    }

    public void clickOnPreviousMonthCalc()
    {
        utils.clickOnElement(calendarPreviousMonth);
    }

    public String getResultCalc()
    {
        return utils.getText(calcResult);
    }


    // Poll

    public void clickOnBuyPoll()
    {
        utils.clickOnElement(buyPoll);
    }

    public Boolean pollIsDisplayed()
    {
        return utils.isDisplayed(buyPoll);
    }

    public void clickOnSellPoll()
    {
        utils.clickOnElement(sellPoll);
    }

    public void clickOnHoldPoll()
    {
        utils.clickOnElement(holdPoll);
    }

    public String getBuyPercentPoll()
    {
        return utils.getText(buyPercentPoll);
    }

    public String getSellPercentPoll()
    {
        return utils.getText(sellPercentPoll);
    }

    public String getHoldPercentPoll()
    {
        return utils.getText(holdPercentPoll);
    }


    // Insights

    public void clickOnInsightsHelp()
    {
        utils.clickOnElement(helpInsights);
    }

    public Boolean insightsIsDisplayed()
    {
        return utils.isDisplayed(firstInsightShowChart);
    }

    public String getFirstInsightPercent()
    {
        return utils.getText(firstInsightPercent);
    }

    public void clickOnFirstInsightShowChart()
    {
        utils.clickOnElement(firstInsightShowChart);
    }

    public String getSecondInsightPercent()
    {
        return utils.getText(secondInsightPercent);
    }

    public void clickOnSecondInsightShowChart()
    {
        utils.clickOnElement(secondInsightShowChart);
    }

    public Boolean secondInsightShowChartIsDisplayed()
    {
        return utils.isDisplayed(secondInsightShowChart);
    }

    public void clickOnSecondInsightGetPRO()
    {
        utils.clickOnElement(secondInsightGetPRO);
    }

    public Boolean secondInsightGetPROIsDisplayed()
    {
        return utils.isDisplayed(secondInsightGetPRO);
    }

    public String getThirdInsightPercent()
    {
        return utils.getText(thirdInsightPercent);
    }

    public String getThirdInsightWalletPercent()
    {
        return utils.getText(thirdInsightWalletPercent);
    }

    public String getThirdInsightExchangePercent()
    {
        return utils.getText(thirdInsightExchangePercent);
    }

    public void clickOnThirdInsightShowChart()
    {
        utils.clickOnElement(thirdInsightShowChart);
    }

    public String getForthInsightPercent()
    {
        return utils.getText(forthInsightPercent);
    }

    public String getForthInsightBuyPercent()
    {
        return utils.getText(forthInsightBuyPercent);
    }

    public String getForthInsightSellPercent()
    {
        return utils.getText(forthInsightSellPercent);
    }

    public void clickOnForthInsightShowChart()
    {
        utils.clickOnElement(forthInsightShowChart);
    }

    public Boolean forthInsightShowChartIsDisplayed()
    {
        return utils.isDisplayed(secondInsightShowChart);
    }

    public void clickOnForthInsightGetPRO()
    {
        utils.clickOnElement(forthInsightGetPRO);
    }

    public Boolean forthInsightGetPROIsDisplayed()
    {
        return utils.isDisplayed(forthInsightGetPRO);
    }


    // Insight window

    public String getCurrentInsightName()
    {
        return utils.getText(insightName);
    }

    public void clickOnNextInsight()
    {
        utils.clickOnElement(nextInsight);
    }

    public void clickOnPreviousInsight()
    {
        utils.clickOnElement(previousInsight);
    }

    public void clickOnFirstInsightPoint()
    {
        utils.clickOnElement(firstInsightPoint);
    }

    public void clickOnSecondInsightPoint()
    {
        utils.clickOnElement(secondInsightPoint);
    }

    public void clickOnThirdInsightPoint()
    {
        utils.clickOnElement(thirdInsightPoint);
    }

    public void clickOnForthInsightPoint()
    {
        utils.clickOnElement(forthInsightPoint);
    }

    public Boolean secondAndForthInsightsLearnMoreIsDisplayed()
    {
        return utils.isDisplayed(secondAndForthInsightsLearnMore);
    }

    public void clickOnSecondAndForthInsightsLearnMore()
    {
        utils.clickOnElement(secondAndForthInsightsLearnMore);
    }


    // Markets

    public void clickOnShowMoreMarkets()
    {
        utils.clickOnElement(marketShowMore);
    }

    public void clickOnMarketExchangeRank()
    {
        utils.clickOnElement(marketExchangeRank);
    }

    public void clickOnMarketPairRank()
    {
        utils.clickOnElement(marketPairRank);
    }

    public void clickOnMarketVolume24hRank()
    {
        utils.clickOnElement(marketVolume24hRank);
    }

    public void clickOnMarketVolumePercentRank()
    {
        utils.clickOnElement(marketVolumePercentRank);
    }

    public void clickOnMarketPriceRank()
    {
        utils.clickOnElement(marketPriceRank);
    }

    public void clickOnMarketLastUpdatedRank()
    {
        utils.clickOnElement(marketLastUpdatedRank);
    }


    // News

    public void clickOnShowMoreNews()
    {
        utils.clickOnElement(newsShowMore);
    }

}
