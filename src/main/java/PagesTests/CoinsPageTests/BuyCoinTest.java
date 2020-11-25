package PagesTests.CoinsPageTests;

import AllPages.CoinsPage.BuyCoin;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class BuyCoinTest extends Driver {

    AllURLs allURLs;
    BuyCoin buyCoin;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {

        allURLs = new AllURLs(driver);
        buyCoin = new BuyCoin(driver);
        utils = new SeleniumUtils(driver);
    }


    @Test
    public void buyCoin() throws InterruptedException {
        allURLs.navigateToBitcoinPage();
        utils.enableCookie();

        buyCoin.clickOnBuyCoin();
        buyCoin.clickOnBinance();
        ArrayList<String> tabs0 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs0.get(1));
        driver.close();
        driver.switchTo().window(tabs0.get(0));

        buyCoin.clickOnMercuryo();
        buyCoin.getCurrentCurrency();
        buyCoin.typeFirstCurrencyAmount("12");
        buyCoin.getErrorMessage();
        buyCoin.clearSecondCurrencyAmount();
        buyCoin.typeSecondCurrencyAmount("0.12");
        buyCoin.clickOnContinue();
        buyCoin.typeWalletAddress("asdasd123e123");
        buyCoin.clickOnBuy();
        Thread.sleep(3000);
        ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        driver.close();
        driver.switchTo().window(tabs1.get(0));


        allURLs.navigateToBitcoinPage();
        buyCoin.clickOnBuyCoin();
        buyCoin.clickOnWyre();
        buyCoin.getCurrentCurrency();
        buyCoin.typeFirstCurrencyAmount("1");
        buyCoin.getErrorMessage();
        buyCoin.clearSecondCurrencyAmount();
        buyCoin.typeSecondCurrencyAmount("0.012");
        buyCoin.clickOnContinue();
        buyCoin.typeWalletAddress("asdasd123e123");
        buyCoin.clickOnBuy();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));

    }

}
