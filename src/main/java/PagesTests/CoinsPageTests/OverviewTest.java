package PagesTests.CoinsPageTests;

import AllPages.CoinsPage.Overview;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class OverviewTest extends Driver {
    AllURLs allURLs;
    Overview overview;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {

        allURLs = new AllURLs(driver);
        overview = new Overview(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test
    public void overviewTest()
    {
        allURLs.navigateToBitcoinPage();
        utils.enableCookie();

        // Chart

        overview.get24hChange();
        overview.clickOn24hChart();
        overview.clickOn1wChart();
        overview.clickOn1mChart();
        overview.clickOn3mChart();
        overview.clickOn6mChart();
        overview.clickOn1yChart();
        overview.clickOnAllChart();
        overview.clickOnCandle();
        overview.clickOnChartBTC();
        overview.clickOnChartETH();
        overview.clickOnChartUSD();

        // Description

        overview.getCoinNameDescription();
        overview.getCoinAvailableSupplyDescription();
        overview.getCoinTotalSupplyDescription();
        overview.getCoinMarketCapDescription();
        overview.getCoin24hTradingVolumeDescription();
        overview.getCoinMostActiveExchangeDescription();

        // Coin Calc

        overview.typeFirstValueCalc("12");
        overview.getCoinNameCalc();
        overview.getSecondValueCalc();
        overview.getResultCalc();
        overview.clickOnInvestInvested();
        overview.typeFirstValueCalc("12");
        overview.getCurrentDateCalc();

        // Poll

        //overview.clickOnBuyPoll();
        overview.getBuyPercentPoll();
        overview.getSellPercentPoll();
        overview.getHoldPercentPoll();

        // Insights

        overview.clickOnInsightsHelp();
        ArrayList<String> tabs0 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs0.get(1));
        driver.close();
        driver.switchTo().window(tabs0.get(0));

        overview.getFirstInsightPercent();
        overview.getSecondInsightPercent();
        overview.getThirdInsightPercent();
        overview.getThirdInsightWalletPercent();
        overview.getThirdInsightExchangePercent();
        overview.getForthInsightPercent();
        overview.getForthInsightBuyPercent();
        overview.getForthInsightSellPercent();
        overview.clickOnSecondInsightShowChart();
        overview.clickOnIconClose();
        overview.clickOnThirdInsightShowChart();
        overview.clickOnIconClose();
        overview.clickOnForthInsightShowChart();
        overview.clickOnIconClose();
        overview.clickOnFirstInsightShowChart();
        overview.clickOnSecondInsightPoint();
        overview.clickOnThirdInsightPoint();
        overview.clickOnForthInsightPoint();
        overview.clickOnFirstInsightPoint();
        overview.clickOnNextInsight();
        overview.clickOnPreviousInsight();

        // Markets

        allURLs.navigateToBitcoinPage();
        overview.clickOnShowMoreMarkets();
        overview.clickOnOverviewTab();
        overview.clickOnMarketExchangeRank();
        overview.clickOnMarketPairRank();
        overview.clickOnMarketVolume24hRank();
        overview.clickOnMarketVolumePercentRank();
        overview.clickOnMarketPriceRank();
        overview.clickOnMarketLastUpdatedRank();
        allURLs.navigateToBitcoinPage();
        overview.clickOnShowMoreNews();






    }

}
