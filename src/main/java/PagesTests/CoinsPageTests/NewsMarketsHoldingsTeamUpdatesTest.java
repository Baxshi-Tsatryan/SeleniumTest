package PagesTests.CoinsPageTests;

import AllPages.CoinsPage.NewsMarketsHoldingsTeamUpdates;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewsMarketsHoldingsTeamUpdatesTest extends Driver {
    AllURLs allURLs;
    NewsMarketsHoldingsTeamUpdates newsMarketsHoldingsTeamUpdates;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {

        allURLs = new AllURLs(driver);
        newsMarketsHoldingsTeamUpdates = new NewsMarketsHoldingsTeamUpdates(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test
    public void newsMarketsHoldingsTeamUpdatesTest() throws InterruptedException {
        allURLs.navigateToBitcoinPage();
        utils.enableCookie();

        newsMarketsHoldingsTeamUpdates.clickOnMarketsTab();
        newsMarketsHoldingsTeamUpdates.clickOnMarketsExchangeRank();
        newsMarketsHoldingsTeamUpdates.clickOnMarketsPairRank();
        newsMarketsHoldingsTeamUpdates.clickOnMarketsVolume24hRank();
        newsMarketsHoldingsTeamUpdates.clickOnMarketsVolumePercentRank();
        newsMarketsHoldingsTeamUpdates.clickOnMarketsPriceRank();
        newsMarketsHoldingsTeamUpdates.clickOnMarketsLastUpdatedRank();
        newsMarketsHoldingsTeamUpdates.clickOnHoldingsTab();
        newsMarketsHoldingsTeamUpdates.clickOnStartTracking();
        utils.goToBackPage();
        newsMarketsHoldingsTeamUpdates.clickOnTeamUpdatesTab();
        Thread.sleep(2000);
        newsMarketsHoldingsTeamUpdates.clickOnTeamUpdatesTweetNow();
    }

}
