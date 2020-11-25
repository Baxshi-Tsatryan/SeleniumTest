package PagesTests.CoinsPageTests;

import AllPages.CoinsPage.TradeCoin;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TradeCoinsTest extends Driver {
    AllURLs allURLs;
    TradeCoin tradeCoins;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {

        allURLs = new AllURLs(driver);
        tradeCoins = new TradeCoin(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test
    public void tradeCoinTest()
    {
        allURLs.navigateToBitcoinPage();
        utils.enableCookie();

        tradeCoins.clickOnTradeCoin();
        tradeCoins.clickOnBuyCoin();
        tradeCoins.clickOnIconBack();
        tradeCoins.clickOnSellCoin();


    }

}
