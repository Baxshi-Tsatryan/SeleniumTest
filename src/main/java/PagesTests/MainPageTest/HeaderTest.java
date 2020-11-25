package PagesTests.MainPageTest;

import AllPages.MainPage.Header;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class HeaderTest extends Driver {

    Header header;
    AllURLs allURLs;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        header = new Header(driver);
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test
    public void clickOnAllCurrenciesManual()
    {

        allURLs.navigateToMainPage();

        header.clickOnCurrenciesDropDown();
        header.clickOnBTC();
        header.getCurrentCurrencyName();
        header.clickOnCurrenciesDropDown();
        header.clickOnETH();
        header.clickOnCurrenciesDropDown();
        header.clickOnAMD();
        header.clickOnCurrenciesDropDown();
        header.clickOnAUD();
        header.clickOnCurrenciesDropDown();
        header.clickOnBGN();
        header.clickOnCurrenciesDropDown();
        header.clickOnBRL();
        header.clickOnCurrenciesDropDown();
        header.clickOnCAD();
        header.clickOnCurrenciesDropDown();
        header.clickOnCHF();
        header.clickOnCurrenciesDropDown();
        header.clickOnCNY();
        header.clickOnCurrenciesDropDown();
        header.clickOnCZK();
        header.clickOnCurrenciesDropDown();
        header.clickOnDKK();
        header.clickOnCurrenciesDropDown();
        header.clickOnEUR();
        header.clickOnCurrenciesDropDown();
        header.clickOnGBP();
        header.clickOnCurrenciesDropDown();
        header.clickOnHKD();
        header.clickOnCurrenciesDropDown();
        header.clickOnHRK();
        header.clickOnCurrenciesDropDown();
        header.clickOnHUF();
        header.clickOnCurrenciesDropDown();
        header.clickOnIDR();
        header.clickOnCurrenciesDropDown();
        header.clickOnILS();
        header.clickOnCurrenciesDropDown();
        header.clickOnINR();
        header.clickOnCurrenciesDropDown();
        header.clickOnISK();
        header.clickOnCurrenciesDropDown();
        header.clickOnJPY();
        header.clickOnCurrenciesDropDown();
        header.clickOnKRW();
        header.clickOnCurrenciesDropDown();
        header.clickOnMXN();
        header.clickOnCurrenciesDropDown();
        header.clickOnMYR();
        header.clickOnCurrenciesDropDown();
        header.clickOnNOK();
        header.clickOnCurrenciesDropDown();
        header.clickOnNZD();
        header.clickOnCurrenciesDropDown();
        header.clickOnPHP();
        header.clickOnCurrenciesDropDown();
        header.clickOnPLN();
        header.clickOnCurrenciesDropDown();
        header.clickOnRON();
        header.clickOnCurrenciesDropDown();
        header.clickOnRUB();
        header.clickOnCurrenciesDropDown();
        header.clickOnSEK();
        header.clickOnCurrenciesDropDown();
        header.clickOnSGD();
        header.clickOnCurrenciesDropDown();
        header.clickOnTHB();
        header.clickOnCurrenciesDropDown();
        header.clickOnTRY();
        header.clickOnCurrenciesDropDown();
        header.clickOnZAR();
        header.clickOnCurrenciesDropDown();
        header.clickOnUSD();

    }

    @Test
    public void clickOnAllLanguages()
    {

        allURLs.navigateToMainPage();

        header.clickOnLanguagesDropDown();
        header.clickOnGerman();
        header.getCurrentLanguageName();
        header.clickOnLanguagesDropDown();
        header.clickOnKorean();
        header.clickOnLanguagesDropDown();
        header.clickOnJapanese();
        header.clickOnLanguagesDropDown();
        header.clickOnChinese();
        header.clickOnLanguagesDropDown();
        header.clickOnSpanish();
        header.clickOnLanguagesDropDown();
        header.clickOnFrench();
        header.clickOnLanguagesDropDown();
        header.clickOnArmenian();
        header.clickOnLanguagesDropDown();
        header.clickOnDutch();
        header.clickOnLanguagesDropDown();
        header.clickOnRussian();
        header.clickOnLanguagesDropDown();
        header.clickOnItalian();
        header.clickOnLanguagesDropDown();
        header.clickOnPortuguese();
        header.clickOnLanguagesDropDown();
        header.clickOnTurkish();
        header.clickOnLanguagesDropDown();
        header.clickOnEnglish();
        header.clickOnLanguagesDropDown();

    }


    @Test
    public void allHeadersButtons()
    {
        allURLs.navigateToMainPage();

        try
        {
            header.clickOnNoThanks();
        }
        catch(NoSuchElementException e)
        {}

        header.clickOnIcon();
        header.clickOnLightMode();
        header.clickOnLightMode();
        header.clickOnPortfolioTracker();
        header.clickOnLivePrices();
        header.clickOnNews();
        header.clickOnPricing();
        header.clickOn3DotButton();
        header.clickOn24hReport();
        header.clickOn3DotButton();
        header.clickOnPressKit();
        header.clickOn3DotButton();
        header.clickOnAPIDocs();
        ArrayList<String> tabs0 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs0.get(1));
        driver.close();
        driver.switchTo().window(tabs0.get(0));

        header.clickOnBlog();
        ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        driver.close();
        driver.switchTo().window(tabs1.get(0));

        header.clickOnWidgets();
    //   header.clickOn3DotButton();
    //   header.clickOnAppStore();
    //   ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
    //   driver.switchTo().window(tabs3.get(1));
    //   driver.close();
    //   driver.switchTo().window(tabs3.get(0));

    //   header.clickOnGooglePlay();
    //   ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    //   driver.switchTo().window(tabs2.get(1));
    //   driver.close();
    //   driver.switchTo().window(tabs2.get(0));

    }

    @Test
    public void searchFieldAndGetStarted()
    {
        allURLs.navigateToMainPage();
        utils.makeScreenMax();



    }



}

