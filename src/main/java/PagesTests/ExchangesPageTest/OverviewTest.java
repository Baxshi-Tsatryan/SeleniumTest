package PagesTests.ExchangesPageTest;

import AllPages.ExchangesPage.MarketsAndTeamUpdates;
import AllPages.ExchangesPage.Overview;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OverviewTest extends Driver {
    Overview overview;
    AllURLs allURLs;
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
        allURLs.navigateToBinancePage();
        utils.enableCookie();

        overview.get24hChange();
        overview.clickOnChart24h();

        overview.clickOnChart24h();
        overview.clickOnChart1w();
        overview.clickOnChart1m();
        overview.clickOnChart3m();
        overview.clickOnChart6m();
        overview.clickOnChart1y();
        overview.clickOnChartAll();
        overview.clickOnChartBTC();
        overview.clickOnChartETH();
        overview.clickOnChartUSD();
        overview.clickOnMarketsShowMore();
        allURLs.navigateToBinancePage();
        overview.clickOnMarketsIndexRank();
        overview.clickOnMarketsNameRank();
        overview.clickOnMarketsPairRank();
        overview.clickOnMarketsVolume24hRank();
        overview.clickOnMarketsVolumePercentRank();
        overview.clickOnMarketsPriceRank();
        overview.clickOnMarketsLastUpdatedRank();
        overview.clickOnTeamUpdatesShowMore();




    }



}
