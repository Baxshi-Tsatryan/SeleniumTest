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

    public News searchCoinNews(String coinName) {
        utils.sendKeysAction(searchCoinNewsField, coinName);
        return this;
    }

    public News clickOnSourcesDropDown() {
        utils.click(sourcesDropDown);
        return this;
    }

    public String getUncheckAllResetButtonText() {
        return utils.getText(uncheckAllResetNewsSources);
    }

    public News clickOnUncheckAllReset() {
        utils.click(uncheckAllResetNewsSources);
        return this;
    }

    public News clickOnApply() {
        utils.click(applyNewsSources);
        return this;
    }


    // Types

    public News clickOnHandpicked() {
        utils.click(handpicked);
        return this;
    }

    public News clickOnTrending() {
        utils.click(trending);
        return this;
    }

    public News clickOnLatest() {
        utils.click(latest);
        return this;
    }

    public News clickOnMostBullish() {
        utils.click(mostBullish);
        return this;
    }

    public News clickOnMostBearish() {
        utils.click(mostBearish);
        return this;
    }

    public News clickOnTeamUpdates() {
        utils.click(teamUpdates);
        return this;
    }


    // Stay In Touch

    public News clickOnTelegramIcon() {
        utils.click(telegramIcon);
        return this;
    }

    public News clickOnFacebookIcon() {
        utils.click(facebookIcon);
        return this;
    }

    public News clickOnTwitterIcon() {
        utils.click(twitterIcon);
        return this;
    }

    public News clickOnSteemitIcon() {
        utils.click(steemitIcon);
        return this;
    }

    public News clickOnMediumIcon() {
        utils.click(mediumIcon);
        return this;
    }

    public News clickOnInstagramIcon() {
        utils.click(instagramIcon);
        return this;
    }


}
