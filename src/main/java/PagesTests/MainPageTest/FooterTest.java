package PagesTests.MainPageTest;

import AllPages.MainPage.Footer;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class FooterTest extends Driver {

    Footer footer;
    AllURLs allURLs;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        footer = new Footer(driver);
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test
    public void footerTest() {

        allURLs.navigateToMainPage();

        // Stay In Touch

        footer.clickOnTelegramIcon();
        ArrayList<String> tabs0 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs0.get(1));
        driver.close();
        driver.switchTo().window(tabs0.get(0));

        footer.clickOnFacebookIcon();
        ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        driver.close();
        driver.switchTo().window(tabs1.get(0));

        footer.clickOnTwitterIcon();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));

        footer.clickOnSteemitIcon();
        ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(1));
        driver.close();
        driver.switchTo().window(tabs3.get(0));

        footer.clickOnMediumIcon();
        ArrayList<String> tabs4 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs4.get(1));
        driver.close();
        driver.switchTo().window(tabs4.get(0));

      //  footer.clickOnMailtoIcon();
      //  ArrayList<String> tabs5 = new ArrayList<String> (driver.getWindowHandles());
      //  driver.switchTo().window(tabs5.get(1));
      //  driver.close();
      //  driver.switchTo().window(tabs5.get(0));


        // Explore Our Products

        utils.goToBottom();
        utils.goToBottom();
        footer.clickOnMacAppStore();
        ArrayList<String> tabs6 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs6.get(1));
        driver.close();
        driver.switchTo().window(tabs6.get(0));

        footer.clickOnAppStore();
        ArrayList<String> tabs7 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs7.get(1));
        driver.close();
        driver.switchTo().window(tabs7.get(0));

        footer.clickOnGooglePlayMarket();
        ArrayList<String> tabs8 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs8.get(1));
        driver.close();
        driver.switchTo().window(tabs8.get(0));



        // Links

        // Platform

        footer.clickOnLivePrices();
        footer.clickOn24hMarketReport();
        footer.clickOnNews();
        allURLs.navigateToMainPage();
        footer.clickOnPortfolioTracker();

        // Learn

        footer.clickOnLearnConnectExchange();
        ArrayList<String> tabs9 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs9.get(1));
        driver.close();
        driver.switchTo().window(tabs9.get(0));

        footer.clickOnLearnConnectWallet();
        ArrayList<String> tabs10 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs10.get(1));
        driver.close();
        driver.switchTo().window(tabs10.get(0));

        footer.clickOnLearnTradeOnYourExchanges();
        ArrayList<String> tabs11 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs11.get(1));
        driver.close();
        driver.switchTo().window(tabs11.get(0));

        footer.clickOnLearnAddTransactions();
        ArrayList<String> tabs12 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs12.get(1));
        driver.close();
        driver.switchTo().window(tabs12.get(0));

        footer.clickOnLearnPLCalculation();
        ArrayList<String> tabs13 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs13.get(1));
        driver.close();
        driver.switchTo().window(tabs13.get(0));

        // Resources

        footer.clickOnPressKit();
        footer.clickOnAPIDocs();
        ArrayList<String> tabs14 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs14.get(1));
        driver.close();
        driver.switchTo().window(tabs14.get(0));

        footer.clickOnBlog();
        ArrayList<String> tabs15 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs15.get(1));
        driver.close();
        driver.switchTo().window(tabs15.get(0));


        // Other Products

        footer.clickOnMacOSWidget();
        ArrayList<String> tabs16 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs16.get(1));
        driver.close();
        driver.switchTo().window(tabs16.get(0));

        footer.clickOnMozillaExtension();
        ArrayList<String> tabs17 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs17.get(1));
        driver.close();
        driver.switchTo().window(tabs17.get(0));

        footer.clickOnChromeExtension();
        ArrayList<String> tabs18 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs18.get(1));
        driver.close();
        driver.switchTo().window(tabs18.get(0));

        footer.clickOnAppleTV();
        ArrayList<String> tabs19 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs19.get(1));
        driver.close();
        driver.switchTo().window(tabs19.get(0));

        // Company

        footer.clickOnPricing();
        footer.clickOnPrivacyPolicy();
        ArrayList<String> tabs20 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs20.get(1));
        driver.close();
        driver.switchTo().window(tabs20.get(0));

        footer.clickOnTermsOfUse();
        ArrayList<String> tabs21 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs21.get(1));
        driver.close();
        driver.switchTo().window(tabs21.get(0));

        // Contact Us

        footer.clickOnHelpCenter();
        ArrayList<String> tabs22 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs22.get(1));
        driver.close();
        driver.switchTo().window(tabs22.get(0));

        footer.clickOnFeatureRequest();
        ArrayList<String> tabs23 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs23.get(1));
        driver.close();
        driver.switchTo().window(tabs23.get(0));

        footer.clickOnAdvertiseAtCoinStats();
        ArrayList<String> tabs24 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs24.get(1));
        driver.close();
        driver.switchTo().window(tabs24.get(0));

    }

}
