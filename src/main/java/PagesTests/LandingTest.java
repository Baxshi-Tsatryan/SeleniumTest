package PagesTests;

import AllPages.Landing;
import AllPages.MainPage.CoinsFavoritesExchanges;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class LandingTest extends Driver {

    CoinsFavoritesExchanges coinsFavoritesExchanges;
    AllURLs allURLs;
    Landing landing;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        coinsFavoritesExchanges = new CoinsFavoritesExchanges(driver);
        allURLs = new AllURLs(driver);
        landing = new Landing(driver);
        utils = new SeleniumUtils(driver);

    }

    @Test
    public void ClickOnAllButtons() throws InterruptedException {
        allURLs.navigateToLandingPage();
        landing.clickOnGetStartedTop();
        allURLs.navigateToLandingPage();

        landing.clickOnKevinRoseTwitter();
        ArrayList<String> tabs0 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs0.get(1));
        driver.close();
        driver.switchTo().window(tabs0.get(0));

        landing.clickOnBinance();
        allURLs.navigateToLandingPage();
        landing.clickOnCoinbase();
        allURLs.navigateToLandingPage();
        landing.clickOnEthereum();
        allURLs.navigateToLandingPage();
        landing.clickOnLedger();
        allURLs.navigateToLandingPage();
        landing.clickOnMetamask();
        allURLs.navigateToLandingPage();
        landing.clickOnMoreButton();
        allURLs.navigateToLandingPage();

        landing.clickOnSebastianGronewoldTwitter();
        ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        driver.close();
        driver.switchTo().window(tabs1.get(0));

        landing.clickOnTyDanielSmithTwitter();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));

        landing.clickOnAdelDeMeyerTwitter();
        ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(1));
        driver.close();
        driver.switchTo().window(tabs3.get(0));


        utils.goToBottom();
        utils.goToBottom();
        landing.clickOnYahooFinance();
        ArrayList<String> tabs4 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs4.get(1));
        driver.close();
        driver.switchTo().window(tabs4.get(0));

        landing.clickOnCryptoslate();
        ArrayList<String> tabs5 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs5.get(1));
        driver.close();
        driver.switchTo().window(tabs5.get(0));

        landing.clickOnCryptoglobe();
        ArrayList<String> tabs6 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs6.get(1));
        driver.close();
        driver.switchTo().window(tabs6.get(0));

        landing.clickOnHackernoon();
        ArrayList<String> tabs7 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs7.get(1));
        driver.close();
        driver.switchTo().window(tabs7.get(0));

        landing.clickOnProductHunt();
        ArrayList<String> tabs8 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs8.get(1));
        driver.close();
        driver.switchTo().window(tabs8.get(0));


        landing.clickOnGetStartedBottom();
        allURLs.navigateToLandingPage();

    }
}
