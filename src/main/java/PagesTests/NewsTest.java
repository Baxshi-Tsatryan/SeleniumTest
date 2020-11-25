package PagesTests;

import AllPages.News;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.openqa.selenium.Cookie;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class NewsTest extends Driver {
    AllURLs allURLs;
    News news;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        news = new News(driver);
        utils = new SeleniumUtils(driver);
    }


    @Test (priority = 1)
    public void searchSourcesTypesStayInTouch()
    {
        allURLs.navigateToNewsPage();
        news.searchCoinNews("Bitc");
        allURLs.navigateToNewsPage();
        news.clickOnSourcesDropDown();
        news.clickOnUncheckAllReset();
        news.clickOnUncheckAllReset();
        news.clickOnApply();

        news.clickOnHandpicked();
        news.clickOnTrending();
        news.clickOnLatest();
        news.clickOnMostBullish();
        news.clickOnMostBearish();
        news.clickOnTeamUpdates();

        news.clickOnTelegramIcon();
        ArrayList<String> tabs0 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs0.get(1));
        driver.close();
        driver.switchTo().window(tabs0.get(0));

        news.clickOnFacebookIcon();
        ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        driver.close();
        driver.switchTo().window(tabs1.get(0));

        news.clickOnTwitterIcon();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));

        news.clickOnSteemitIcon();
        ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(1));
        driver.close();
        driver.switchTo().window(tabs3.get(0));

        news.clickOnMediumIcon();
        ArrayList<String> tabs4 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs4.get(1));
        driver.close();
        driver.switchTo().window(tabs4.get(0));

        news.clickOnInstagramIcon();
        ArrayList<String> tabs5 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs5.get(1));
        driver.close();
        driver.switchTo().window(tabs5.get(0));

    }

}
