package AllPages.CoinsPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeneralCoinsPage {
    WebDriver driver;
    SeleniumUtils utils;

    public GeneralCoinsPage(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    By iconClose = By.cssSelector(".icon-close");

    By coinName = By.cssSelector("h1");

    By coinIndex = By.cssSelector(".show-desktop.name-wrapper > .jsx-226630945");

    By coinPrice = By.cssSelector("div.big > .show-desktop > .main-price");

    By coinPercent = By.cssSelector("div.big .jsx-544775375");

    By coinPriceBTC = By.cssSelector("div.main-info-wrapper .show-desktop > .jsx-544775375");

    By coinPercentBTC = By.cssSelector("div.main-info-wrapper > div:nth-of-type(3) span:nth-of-type(2)");

    By marketCapPrice = By.cssSelector("div.item-previewer > div:nth-of-type(2) > div:nth-of-type(1) > .jsx-544775375");

    By volume24hPrice = By.cssSelector("div.item-previewer > div:nth-of-type(2) > div:nth-of-type(3) > .jsx-544775375");

    By availableSupply = By.cssSelector("div.item-previewer > div:nth-of-type(3) > div:nth-of-type(1) > .jsx-544775375");

    By totalSupply = By.cssSelector("div.item-previewer > div:nth-of-type(3) > div:nth-of-type(3) > .jsx-544775375");

    By coinWebsite = By.xpath("//div[@class='jsx-2689015710 item-previewer']/div[@class='jsx-3134332359 social-column show-desktop']//a[.='Website']");

    By coinTwitter = By.cssSelector("#__next > main > section > div > div.jsx-2689015710.item-previewer > div:nth-child(5) > div:nth-child(2) > a");

    By coinReddit = By.cssSelector("#__next > main > section > div > div.jsx-2689015710.item-previewer > div:nth-child(5) > div:nth-child(3) > a");

    By coinTelegram = By.cssSelector("#__next > main > section > div > div.jsx-2689015710.item-previewer > div:nth-child(5) > div:nth-child(4) > span.filter-value");

    By coinBitcointalk = By.cssSelector("div.item-previewer > .jsx-3134332359 > div:nth-of-type(1) > span:nth-of-type(2)");


    By addRemoveFavorites = By.cssSelector(".show-desktop.favorite-star > .jsx-2689015710");

    By addTransactionButton = By.cssSelector("div.coininfo-buttons-container > button:nth-of-type(1)");

    By tradeCoinButton = By.cssSelector("div.coininfo-buttons-container > button:nth-of-type(2)");

    By buyCoinButton = By.cssSelector("div.coininfo-buttons-container > button:nth-of-type(3)");


    // Tabs

    By overviewTab = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-tabs-wrapper > div > ul > li.active-tab > a");

    By newsTab = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-tabs-wrapper > div > ul > li:nth-child(2) > a");

    By marketsTab = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-tabs-wrapper > div > ul > li:nth-child(3) > a");

    By holdingsTab = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-tabs-wrapper > div > ul > li:nth-child(4) > a");

    By teamUpdatesTab = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-tabs-wrapper > div > ul > li:nth-child(5) > a");

    By onChainDataTab = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-tabs-wrapper > div > ul > li:nth-child(6) > a");



    // ----------------------------------------------------- Methods -------------------------------------------------

    public void clickOnCloseIcon()
    {
        utils.clickOnElement(iconClose);
    }

    public String getCoinName()
    {
        return utils.getText(coinName);
    }

    public String getCoinIndex()
    {
        return utils.getText(coinIndex);
    }

    public String getCoinPrice()
    {
        return utils.getText(coinPrice);
    }

    public String getCoinPercent()
    {
        return utils.getText(coinPercent);
    }

    public String getCoinPercentColor()
    {
        return utils.getCSSValue(coinPercent, "color");
    }

    public String getCoinPriceBTC()
    {
        return utils.getText(coinPriceBTC);
    }

    public String getCoinPercentBTC()
    {
        return utils.getText(coinPercentBTC);
    }

    public String getCoinPercentBTCColor()
    {
        return utils.getCSSValue(coinPercentBTC, "color");
    }

    public String getMarketCap()
    {
        return utils.getText(marketCapPrice);
    }

    public String getVolume24h()
    {
        return utils.getText(volume24hPrice);
    }

    public String getAvailableSupply()
    {
        return utils.getText(availableSupply);
    }

    public String getTotalSupply()
    {
        return utils.getText(totalSupply);
    }

    public void clickOnWebsite()
    {
        utils.clickOnElement(coinWebsite);
    }

    public String getWebsiteColor()
    {
        return utils.getCSSValue(coinWebsite, "color");
    }

    public void clickOnTwitter()
    {
        utils.clickOnElement(coinTwitter);
    }

    public String getTwitterColor()
    {
        return utils.getCSSValue(coinTwitter, "color");
    }

    public void clickOnReddit()
    {
        utils.clickOnElement(coinReddit);
    }

    public String getRedditColor()
    {
        return utils.getCSSValue(coinReddit, "color");
    }

    public void clickOnTelegram()
    {
        utils.clickOnElement(coinTelegram);
    }

    public String getTelegramColor()
    {
        return utils.getCSSValue(coinTelegram, "color");
    }

    public void clickOnBitcointalk()
    {
        utils.clickOnElement(coinBitcointalk);
    }

    public String getBitcointalkColor()
    {
        return utils.getCSSValue(coinBitcointalk, "color");
    }


    public void clickOnAddRemoveFavorites()
    {
        utils.clickOnElement(addRemoveFavorites);
    }

    public String getAddRemoveFavoritesColor()
    {
        return utils.getCSSValue(addRemoveFavorites, "color");
    }

    public Boolean addRemoveFavoritesIsEnabled()
    {
        return utils.isEnabled(addRemoveFavorites);
    }

    public Boolean addRemoveFavoritesIsSelected()
    {
        return utils.isSelected(addRemoveFavorites);
    }


    public void clickOnAddTransaction()
    {
        utils.clickOnElement(addTransactionButton);
    }

    public void clickOnTradeCoin()
    {
        utils.clickOnElement(tradeCoinButton);
    }

    public void clickOnBuyCoin()
    {
        utils.clickOnElement(buyCoinButton);
    }

    // Tabs

    public void clickOnOverviewTab()
    {
        utils.clickOnElement(overviewTab);
    }

    public void clickOnNewsTab()
    {
        utils.clickOnElement(newsTab);
    }

    public void clickOnMarketsTab()
    {
        utils.clickOnElement(marketsTab);
    }

    public void clickOnHoldingsTab()
    {
        utils.clickOnElement(holdingsTab);
    }

    public void clickOnTeamUpdatesTab()
    {
        utils.clickOnElement(teamUpdatesTab);
    }

    public void clickOnOnChainDataTab()
    {
        utils.clickOnElement(onChainDataTab);
    }

}
