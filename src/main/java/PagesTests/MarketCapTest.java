package PagesTests;

import AllPages.MarketCap;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MarketCapTest extends Driver {
    AllURLs allURLs;
    MarketCap marketCap;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        marketCap = new MarketCap(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test
    public void marketCapPage()
    {
        allURLs.navigateToMarketCapPage();

        // Market Cap

        marketCap.getMarketCap();
        marketCap.clickOnMarketCap24h();
        marketCap.clickOnMarketCap1m();
        marketCap.clickOnMarketCap1w();
        marketCap.clickOnMarketCap1m();
        marketCap.clickOnMarketCap3m();
        marketCap.clickOnMarketCap6m();
        marketCap.clickOnMarketCap1y();
        marketCap.clickOnMarketCapAll();

        // BTC Dominance

        marketCap.getBTCDominance();
        marketCap.clickOnBTCDominance24h();
        marketCap.clickOnBTCDominance1m();
        marketCap.clickOnBTCDominance1w();
        marketCap.clickOnBTCDominance1m();
        marketCap.clickOnBTCDominance3m();
        marketCap.clickOnBTCDominance6m();
        marketCap.clickOnBTCDominance1y();
        marketCap.clickOnBTCDominanceAll();
    }


}
