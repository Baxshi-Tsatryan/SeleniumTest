package AllPages;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class News {

    WebDriver driver;
    SeleniumUtils utils;

    public News(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    // News Sources and coins news

    By searchCoinNewsField = By.cssSelector("div.sidebar-container [name]");

    By sourcesDropDown = By.cssSelector("div[title='Select the sources you would like to read from'] > .jsx-2338568236");

    By uncheckAllResetNewsSources = By.cssSelector(".actions-container.jsx-2338568236 > button:nth-of-type(1)");

    By applyNewsSources = By.cssSelector(".actions-container.jsx-2338568236 > button:nth-of-type(2)");


    // Types

    By handpicked = By.cssSelector("ul.jsx-2395289923 > li:nth-of-type(1) .jsx-544775375");

    By trending = By.cssSelector("ul.jsx-2395289923 > li:nth-of-type(2) .jsx-544775375");

    By latest = By.cssSelector("ul.jsx-2395289923 > li:nth-of-type(3) .jsx-544775375");

    By mostBullish = By.cssSelector("ul.jsx-2395289923 > li:nth-of-type(4) .jsx-544775375");

    By mostBearish = By.cssSelector("ul.jsx-2395289923 > li:nth-of-type(5) .jsx-544775375");

    By teamUpdates = By.cssSelector("ul.jsx-2395289923 > li:nth-of-type(6) .jsx-544775375");


    // Stay In Touch

    By telegramIcon = By.cssSelector("div.social-sidebar-item .icon-telegram");

    By facebookIcon = By.cssSelector("div.social-sidebar-item .icon-facebook");

    By twitterIcon = By.cssSelector("div.social-sidebar-item .icon-twitter");

    By steemitIcon = By.cssSelector("div.social-sidebar-item .icon-steemit");

    By mediumIcon = By.cssSelector("div.social-sidebar-item .icon-medium");

    By instagramIcon = By.cssSelector(".icon-instagram");


    // ------------------------------------------------ Methods ----------------------------------------------

    // News Sources and coins news

    public void searchCoinNews(String coinName)
    {
        utils.sendKeys(searchCoinNewsField, coinName);
    }

    public void clickOnSourcesDropDown()
    {
        utils.clickOnElement(sourcesDropDown);
    }

    public String getUncheckAllResetButtonText()
    {
        return utils.getText(uncheckAllResetNewsSources);
    }

    public void clickOnUncheckAllReset()
    {
        utils.clickOnElement(uncheckAllResetNewsSources);
    }

    public void clickOnApply()
    {
        utils.clickOnElement(applyNewsSources);
    }


    // Types

    public void clickOnHandpicked()
    {
        utils.clickOnElement(handpicked);
    }

    public void clickOnTrending()
    {
        utils.clickOnElement(trending);
    }

    public void clickOnLatest()
    {
        utils.clickOnElement(latest);
    }

    public void clickOnMostBullish()
    {
        utils.clickOnElement(mostBullish);
    }

    public void clickOnMostBearish()
    {
        utils.clickOnElement(mostBearish);
    }

    public void clickOnTeamUpdates()
    {
        utils.clickOnElement(teamUpdates);
    }


    // Stay In Touch

    public void clickOnTelegramIcon()
    {
        utils.clickOnElement(telegramIcon);
    }

    public void clickOnFacebookIcon()
    {
        utils.clickOnElement(facebookIcon);
    }

    public void clickOnTwitterIcon()
    {
        utils.clickOnElement(twitterIcon);
    }

    public void clickOnSteemitIcon()
    {
        utils.clickOnElement(steemitIcon);
    }

    public void clickOnMediumIcon()
    {
        utils.clickOnElement(mediumIcon);
    }

    public void clickOnInstagramIcon()
    {
        utils.clickOnElement(instagramIcon);
    }



}
