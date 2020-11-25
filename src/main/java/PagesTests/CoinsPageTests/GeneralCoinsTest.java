package PagesTests.CoinsPageTests;

import AllPages.CoinsPage.GeneralCoinsPage;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GeneralCoinsTest extends Driver {
    AllURLs allURLs;
    GeneralCoinsPage generalCoins;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {

        allURLs = new AllURLs(driver);
        generalCoins = new GeneralCoinsPage(driver);
        utils = new SeleniumUtils(driver);
    }


    @Test
    public void generalPortfolioTest() throws InterruptedException {
        allURLs.navigateToBitcoinPage();
        utils.enableCookie();

        generalCoins.getCoinName();
        generalCoins.getCoinIndex();
        generalCoins.getCoinPrice();
        generalCoins.getCoinPercent();
        generalCoins.getCoinPercentColor();
        generalCoins.getCoinPriceBTC();
        generalCoins.getCoinPercentBTC();
        generalCoins.getCoinPercentBTCColor();
        generalCoins.getMarketCap();
        generalCoins.getVolume24h();
        generalCoins.getAvailableSupply();
        generalCoins.getTotalSupply();
      //  generalCoins.clickOnWebsite();
      //  ArrayList<String> tabs0 = new ArrayList<String> (driver.getWindowHandles());
      //  driver.switchTo().window(tabs0.get(1));
      //  driver.close();
      //  driver.switchTo().window(tabs0.get(0));

     //  generalCoins.clickOnTwitter();
     //  ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
     //  driver.switchTo().window(tabs1.get(1));
     //  driver.close();
     //  driver.switchTo().window(tabs1.get(0));

     //  generalCoins.clickOnReddit();
     //  ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
     //  driver.switchTo().window(tabs2.get(1));
     //  driver.close();
     //  driver.switchTo().window(tabs2.get(0));

     //  generalCoins.getTelegramColor();
     //  generalCoins.getBitcointalkColor();

        generalCoins.clickOnAddRemoveFavorites();

        generalCoins.clickOnAddTransaction();
        allURLs.navigateToBitcoinPage();
        generalCoins.clickOnTradeCoin();
        allURLs.navigateToBitcoinPage();
        generalCoins.clickOnBuyCoin();
        allURLs.navigateToBitcoinPage();

        generalCoins.clickOnNewsTab();
        generalCoins.clickOnMarketsTab();
        generalCoins.clickOnHoldingsTab();
        generalCoins.clickOnTeamUpdatesTab();
        generalCoins.clickOnOnChainDataTab();
        generalCoins.clickOnOverviewTab();

    }



}
