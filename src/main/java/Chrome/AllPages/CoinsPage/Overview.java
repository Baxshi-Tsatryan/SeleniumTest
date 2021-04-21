package Chrome.AllPages.CoinsPage;

import Chrome.MainPackage.SeleniumUtils;
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

    public Overview clickOnIconClose() {
        utils.click(iconClose);
        return this;
    }

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

    public Overview clickOnCandle() {
        utils.click(candleChart);
        return this;
    }

    public Overview clickOn24hChart() {
        utils.click(chart24h);
        return this;
    }

    public Overview clickOn1wChart() {
        utils.click(chart1w);
        return this;
    }

    public Overview clickOn1mChart() {
        utils.click(chart1m);
        return this;
    }

    public Overview clickOn3mChart() {
        utils.click(chart3m);
        return this;
    }

    public Overview clickOn6mChart() {
        utils.click(chart6m);
        return this;
    }

    public Overview clickOn1yChart() {
        utils.click(chart1y);
        return this;
    }

    public Overview clickOnAllChart() {
        utils.click(chartAll);
        return this;
    }

    public Overview clickOnChartBTC() {
        utils.click(chartBTC);
        return this;
    }

    public Overview clickOnChartUSD() {
        utils.click(chartUSD);
        return this;
    }

    public Overview clickOnChartETH() {
        utils.click(chartETH);
        return this;
    }


    // Description

    public String getCoinNameDescription() {
        return utils.getText(coinNameDescription);
    }

    public String getCoinAvailableSupplyDescription() {
        return utils.getText(coinAvailableSupplyDescription);
    }

    public String getCoinTotalSupplyDescription() {
        return utils.getText(coinTotalSupplyDescription);
    }

    public String getCoinMarketCapDescription() {
        return utils.getText(coinMarketCapDescription);
    }

    public String getCoin24hTradingVolumeDescription() {
        return utils.getText(coin24hTradingVolumeDescription);
    }

    public String getCoinMostActiveExchangeDescription() {
        return utils.getText(coinMostActiveExchangeDescription);
    }


    // Coin Calc

    public Overview clickOnInvestInvested() {
        utils.click(investInvested);
        return this;
    }

    public Boolean coinCalcIsDisplayed() {
        return utils.isDisplayed(investInvested);
    }

    public String getInvestInvestedText() {
        return utils.getText(investInvested);
    }

    public Overview typeFirstValueCalc(String price) {
        utils.sendKeysAction(firstValueCalc, price);
        return this;
    }

    public Overview clearFirstValueCalc() {
        utils.clear(firstValueCalc);
        return this;
    }

    public String getFirstValueCalc() {
        return utils.getText(firstValueCalc);
    }

    public String getCoinNameCalc() {
        return utils.getText(coinNameCalc);
    }

    public Overview typeSecondValueCalc(String price) {
        utils.sendKeysAction(secondValueCalc, price);
        return this;
    }

    public Overview clearSecondValueCalc() {
        utils.clear(secondValueCalc);
        return this;
    }

    public String getSecondValueCalc() {
        return utils.getText(secondValueCalc);
    }

    public String getDateCalc() {
        return utils.getText(dateCalc);
    }

    public Overview typeDateCalc(String date) {
        utils.sendKeysAction(dateCalc, date);
        return this;
    }

    public Overview clickOnDateCalc() {
        utils.click(dateCalc);
        return this;
    }

    public String getCurrentDateCalc() {
        return utils.getText(dateCalc);
    }

    public Overview clickOnNextMonthCalc() {
        utils.click(calendarNextMonth);
        return this;
    }

    public Overview clickOnPreviousMonthCalc() {
        utils.click(calendarPreviousMonth);
        return this;
    }

    public String getResultCalc() {
        return utils.getText(calcResult);
    }


    // Poll

    public Overview clickOnBuyPoll() {
        utils.click(buyPoll);
        return this;
    }

    public Boolean pollIsDisplayed() {
        return utils.isDisplayed(buyPoll);
    }

    public Overview clickOnSellPoll() {
        utils.click(sellPoll);
        return this;
    }

    public Overview clickOnHoldPoll() {
        utils.click(holdPoll);
        return this;
    }

    public String getBuyPercentPoll() {
        return utils.getText(buyPercentPoll);
    }

    public String getSellPercentPoll() {
        return utils.getText(sellPercentPoll);
    }

    public String getHoldPercentPoll() {
        return utils.getText(holdPercentPoll);
    }


    // Insights

    public Overview clickOnInsightsHelp() {
        utils.click(helpInsights);
        return this;
    }

    public Boolean insightsIsDisplayed() {
        return utils.isDisplayed(firstInsightShowChart);
    }

    public String getFirstInsightPercent() {
        return utils.getText(firstInsightPercent);
    }

    public Overview clickOnFirstInsightShowChart() {
        utils.click(firstInsightShowChart);
        return this;
    }

    public String getSecondInsightPercent() {
        return utils.getText(secondInsightPercent);
    }

    public Overview clickOnSecondInsightShowChart() {
        utils.click(secondInsightShowChart);
        return this;
    }

    public Boolean secondInsightShowChartIsDisplayed() {
        return utils.isDisplayed(secondInsightShowChart);
    }

    public Overview clickOnSecondInsightGetPRO() {
        utils.click(secondInsightGetPRO);
        return this;
    }

    public Boolean secondInsightGetPROIsDisplayed() {
        return utils.isDisplayed(secondInsightGetPRO);
    }

    public String getThirdInsightPercent() {
        return utils.getText(thirdInsightPercent);
    }

    public String getThirdInsightWalletPercent() {
        return utils.getText(thirdInsightWalletPercent);
    }

    public String getThirdInsightExchangePercent() {
        return utils.getText(thirdInsightExchangePercent);
    }

    public Overview clickOnThirdInsightShowChart() {
        utils.click(thirdInsightShowChart);
        return this;
    }

    public String getForthInsightPercent() {
        return utils.getText(forthInsightPercent);
    }

    public String getForthInsightBuyPercent() {
        return utils.getText(forthInsightBuyPercent);
    }

    public String getForthInsightSellPercent() {
        return utils.getText(forthInsightSellPercent);
    }

    public Overview clickOnForthInsightShowChart() {
        utils.click(forthInsightShowChart);
        return this;
    }

    public Boolean forthInsightShowChartIsDisplayed() {
        return utils.isDisplayed(secondInsightShowChart);
    }

    public Overview clickOnForthInsightGetPRO() {
        utils.click(forthInsightGetPRO);
        return this;
    }

    public Boolean forthInsightGetPROIsDisplayed() {
        return utils.isDisplayed(forthInsightGetPRO);
    }


    // Insight window

    public String getCurrentInsightName() {
        return utils.getText(insightName);
    }

    public Overview clickOnNextInsight() {
        utils.click(nextInsight);
        return this;
    }

    public Overview clickOnPreviousInsight() {
        utils.click(previousInsight);
        return this;
    }

    public Overview clickOnFirstInsightPoint() {
        utils.click(firstInsightPoint);
        return this;
    }

    public Overview clickOnSecondInsightPoint() {
        utils.click(secondInsightPoint);
        return this;
    }

    public Overview clickOnThirdInsightPoint() {
        utils.click(thirdInsightPoint);
        return this;
    }

    public Overview clickOnForthInsightPoint() {
        utils.click(forthInsightPoint);
        return this;
    }

    public Boolean secondAndForthInsightsLearnMoreIsDisplayed() {
        return utils.isDisplayed(secondAndForthInsightsLearnMore);
    }

    public Overview clickOnSecondAndForthInsightsLearnMore() {
        utils.click(secondAndForthInsightsLearnMore);
        return this;
    }


    // Markets

    public Overview clickOnShowMoreMarkets() {
        utils.click(marketShowMore);
        return this;
    }

    public Overview clickOnMarketExchangeRank() {
        utils.click(marketExchangeRank);
        return this;
    }

    public Overview clickOnMarketPairRank() {
        utils.click(marketPairRank);
        return this;
    }

    public Overview clickOnMarketVolume24hRank() {
        utils.click(marketVolume24hRank);
        return this;
    }

    public Overview clickOnMarketVolumePercentRank() {
        utils.click(marketVolumePercentRank);
        return this;
    }

    public Overview clickOnMarketPriceRank() {
        utils.click(marketPriceRank);
        return this;
    }

    public Overview clickOnMarketLastUpdatedRank() {
        utils.click(marketLastUpdatedRank);
        return this;
    }


    // News

    public Overview clickOnShowMoreNews() {
        utils.click(newsShowMore);
        return this;
    }

}
