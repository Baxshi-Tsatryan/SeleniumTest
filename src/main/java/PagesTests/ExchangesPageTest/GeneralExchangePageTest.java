package PagesTests.ExchangesPageTest;

import AllPages.ExchangesPage.GeneralExchangePage;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GeneralExchangePageTest extends Driver {

    GeneralExchangePage generalExchange;
    AllURLs allURLs;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        generalExchange = new GeneralExchangePage(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test
    public void generalExchangeTest()
    {
        allURLs.navigateToBinancePage();
        utils.enableCookie();

        generalExchange.getExchangeName();
        generalExchange.getExchangeIndex();
        generalExchange.getExchangeVolume();
        generalExchange.getExchangeVolumePercent();
        generalExchange.getExchangeVolumeBTC();
        generalExchange.getExchangeVolumeBTCPercent();
        generalExchange.getExchangeVolume24h();
        generalExchange.getExchangeVolume7d();
        generalExchange.getExchangeVolume30d();
        generalExchange.getExchangeNoMarkets();
        generalExchange.getExchangeFee();
        generalExchange.getExchangeLaunched();
        generalExchange.getExchangesType();
        generalExchange.getExchangeCountry();
        generalExchange.clickOnConnectExchangeButton();
        generalExchange.clickOnIconClose();
        generalExchange.clickOnMarketsTab();
        generalExchange.clickOnTeamUpdatesTab();
        generalExchange.clickOnOverviewTab();

    }

}
