package PagesTests.ExchangesPageTest;

import AllPages.ExchangesPage.MarketsAndTeamUpdates;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MarketsAndTeamUpdatesTest extends Driver {
    MarketsAndTeamUpdates marketTeamUpdates;
    AllURLs allURLs;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        marketTeamUpdates = new MarketsAndTeamUpdates(driver);
        utils = new SeleniumUtils(driver);
    }


    @Test
    public void marketTeamUpdatesTest()
    {
        allURLs.navigateToBinancePage();
        utils.enableCookie();

        marketTeamUpdates.clickOnMarketsTab();
        marketTeamUpdates.clickOnMarketsIndexRank();
        marketTeamUpdates.clickOnMarketsNameRank();
        marketTeamUpdates.clickOnMarketsPairRank();
        marketTeamUpdates.clickOnMarketsVolume24hRank();
        marketTeamUpdates.clickOnMarketsVolumePercentRank();
        marketTeamUpdates.clickOnMarketsPriceRank();
        marketTeamUpdates.clickOnMarketsLastUpdatedRank();
        marketTeamUpdates.clickOnTeamUpdatesTab();

    }


}
