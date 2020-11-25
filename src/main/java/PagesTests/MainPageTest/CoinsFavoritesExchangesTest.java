package PagesTests.MainPageTest;

import AllPages.MainPage.CoinsFavoritesExchanges;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class CoinsFavoritesExchangesTest extends Driver {

    CoinsFavoritesExchanges coinsFavoritesExchanges;
    AllURLs allURLs;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        coinsFavoritesExchanges = new CoinsFavoritesExchanges(driver);
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test
    public void coinsFavoritesExchangesTest() throws InterruptedException {

        allURLs.navigateToMainPage();
        utils.enableCookie();

        coinsFavoritesExchanges.clickOnTopBannerHere();
        ArrayList<String> tabs0 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs0.get(1));
        driver.close();
        driver.switchTo().window(tabs0.get(0));

        coinsFavoritesExchanges.getMarketCapPrice();
        coinsFavoritesExchanges.getMarketCapPercent();
        coinsFavoritesExchanges.getVolume24hPrice();
        coinsFavoritesExchanges.getVolume24hPercent();
        coinsFavoritesExchanges.getBTCDominanceFirstPercent();
        coinsFavoritesExchanges.getBTCDominanceSecondPercent();
        coinsFavoritesExchanges.clickOnMarketCap();
        utils.goToBackPage();
        coinsFavoritesExchanges.clickOnVolume24h();
        utils.goToBackPage();
        coinsFavoritesExchanges.clickOnBTCDominance();
        utils.goToBackPage();
        coinsFavoritesExchanges.clickOnCryptoPricesAndPortfolioTracker();
        utils.goToBackPage();

        // Tabs

        coinsFavoritesExchanges.clickOnFavoritesTab();
        coinsFavoritesExchanges.clickOnExchangesTab();
        coinsFavoritesExchanges.clickOnCoinsTab();

        // Rows

        coinsFavoritesExchanges.clickOnNextPage();
        coinsFavoritesExchanges.clickOnPreviousPage();
        coinsFavoritesExchanges.clickOnRowsPerPageDropDown();
        coinsFavoritesExchanges.clickOnRowsPerPage20();
        coinsFavoritesExchanges.clickOnRowsPerPageDropDown();
        coinsFavoritesExchanges.clickOnRowsPerPage100();
        coinsFavoritesExchanges.clickOnRowsPerPageDropDown();
        coinsFavoritesExchanges.clickOnRowsPerPage300();
        coinsFavoritesExchanges.clickOnRowsPerPageDropDown();
        coinsFavoritesExchanges.clickOnRowsPerPage20();

     //   coinsFavoritesExchanges.clickOnBottomNextPage();
     //   Thread.sleep(3000);
     //   coinsFavoritesExchanges.clickOnBottomPreviousPage();
     //   coinsFavoritesExchanges.clickOnBottomRowsPerPageDropDown();
     //   coinsFavoritesExchanges.clickOnBottomRowsPerPage100();
     //   coinsFavoritesExchanges.clickOnBottomRowsPerPageDropDown();
     //   coinsFavoritesExchanges.clickOnBottomRowsPerPage20();
     //   coinsFavoritesExchanges.clickOnBottomRowsPerPageDropDown();
     //   coinsFavoritesExchanges.clickOnBottomRowsPerPage300();
     //   coinsFavoritesExchanges.clickOnRowsPerPageDropDown();
     //   coinsFavoritesExchanges.clickOnRowsPerPage20();

        // Exchanges Ranks

        coinsFavoritesExchanges.clickOnExchangesTab();
        coinsFavoritesExchanges.clickOnIndexRankExchanges();
        coinsFavoritesExchanges.clickOnNameRankExchanges();
        coinsFavoritesExchanges.clickOnVolume24hRankExchanges();
        coinsFavoritesExchanges.clickOnVolume24hRankExchanges();
        coinsFavoritesExchanges.clickOnVolume7dRankExchanges();
        coinsFavoritesExchanges.clickOnVolume30dRankExchanges();
        coinsFavoritesExchanges.clickOnNoMarketsRankExchanges();
        coinsFavoritesExchanges.clickOnChange24hRankExchanges();

        coinsFavoritesExchanges.clickOnGoToPortfolio();

    }

}
