package chrome.allPages.exchangesPage;

import chrome.mainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeneralExchangePage {

    WebDriver driver;
    SeleniumUtils utils;

    public GeneralExchangePage(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    By iconClose = By.cssSelector(".icon-close");

    By exchangeName = By.cssSelector("h1");

    By exchangeIndex = By.cssSelector(".show-desktop.name-wrapper > .jsx-226630945");

    By exchangeVolume = By.cssSelector("div.big > .show-desktop > .main-price");

    By exchangeVolumePercent = By.cssSelector("div.big .jsx-544775375");

    By exchangeVolumeBTC = By.cssSelector("div.main-info-wrapper .show-desktop > .jsx-544775375");

    By exchangeVolumeBTCPercent = By.cssSelector("div.main-info-wrapper > div:nth-of-type(3) span:nth-of-type(2)");

    By exchangeVolume24h = By.cssSelector("div.item-previewer > div:nth-of-type(2) > div:nth-of-type(1) > .jsx-544775375");

    By exchangeVolume7d = By.cssSelector("div.item-previewer > div:nth-of-type(2) > div:nth-of-type(3) > .jsx-544775375");

    By exchangeVolume30d = By.cssSelector("div.item-previewer > div:nth-of-type(3) > div:nth-of-type(1) > .jsx-544775375");

    By exchangeNoMarkets = By.cssSelector("div.item-previewer > div:nth-of-type(3) > div:nth-of-type(3) > .jsx-544775375");

    By exchangeFee = By.cssSelector("div.item-previewer > div:nth-of-type(4) > div:nth-of-type(1) > .jsx-544775375");

    By exchangeLaunched = By.cssSelector("div.item-previewer > div:nth-of-type(4) > div:nth-of-type(3) > .jsx-544775375");

    By exchangeType = By.cssSelector("div.item-previewer > div:nth-of-type(5) > div:nth-of-type(1) > .jsx-544775375");

    By exchangeCountry = By.cssSelector("div.item-previewer > div:nth-of-type(5) > div:nth-of-type(3) > .jsx-544775375");

    By exchangeWebsite = By.cssSelector("div.item-previewer > div:nth-of-type(7) > div:nth-of-type(1) > .filter-value");

    By exchangeTwitter = By.cssSelector("div.item-previewer > .jsx-3134332359 > .jsx-3134332359 > [href='https://twitter.com/binance']");

    By exchangeReddit = By.cssSelector("div.item-previewer > .jsx-3134332359 > div:nth-of-type(3) > .filter-value");

    By exchangeTelegram = By.cssSelector("div.item-previewer > .jsx-3134332359 > div:nth-of-type(4) > .filter-value");

    By exchangeBitcointalk = By.cssSelector("div.item-previewer > div:nth-of-type(8) .filter-value");


    // Tabs

    By connectExchangeButton = By.cssSelector("div.connect-exchange-section > .jsx-1426819953");

    By overviewTab = By.cssSelector("#__next > main > section > div > div.exchange-info-inner-wrapper > div.exchange-info-tabs-wrapper > div > ul > li.active-tab > a");

    By marketsTab = By.cssSelector("#__next > main > section > div > div.exchange-info-inner-wrapper > div.exchange-info-tabs-wrapper > div > ul > li:nth-child(2) > a");

    By teamUpdatesTab = By.cssSelector("#__next > main > section > div > div.exchange-info-inner-wrapper > div.exchange-info-tabs-wrapper > div > ul > li:nth-child(3) > a");


    // ----------------------------------------------- Methods --------------------------------------------------

    public GeneralExchangePage clickOnIconClose() {
        utils.click(iconClose);
        return this;
    }

    public String getExchangeName() {
        return utils.getText(exchangeName);
    }

    public String getExchangeIndex() {
        return utils.getText(exchangeIndex);
    }

    public String getExchangeVolume() {
        return utils.getText(exchangeVolume);
    }

    public String getExchangeVolumePercent() {
        return utils.getText(exchangeVolumePercent);
    }

    public String getExchangeVolumePercentColor() {
        return utils.getCSSValue(exchangeVolumePercent, "color");
    }

    public String getExchangeVolumeBTC() {
        return utils.getText(exchangeVolumeBTC);
    }

    public String getExchangeVolumeBTCPercent() {
        return utils.getText(exchangeVolumeBTCPercent);
    }

    public String getExchangeVolumeBTCPercentColor() {
        return utils.getCSSValue(exchangeVolumeBTCPercent, "color");
    }

    public String getExchangeVolume24h() {
        return utils.getText(exchangeVolume24h);
    }

    public String getExchangeVolume7d() {
        return utils.getText(exchangeVolume7d);
    }

    public String getExchangeVolume30d() {
        return utils.getText(exchangeVolume30d);
    }

    public String getExchangeNoMarkets() {
        return utils.getText(exchangeNoMarkets);
    }

    public String getExchangeFee() {
        return utils.getText(exchangeFee);
    }

    public String getExchangeLaunched() {
        return utils.getText(exchangeLaunched);
    }

    public String getExchangesType() {
        return utils.getText(exchangeType);
    }

    public String getExchangeCountry() {
        return utils.getText(exchangeCountry);
    }

    public GeneralExchangePage clickOnExchangeWebsite() {
        utils.click(exchangeWebsite);
        return this;
    }

    public String getExchangeWebsiteColor() {
        return utils.getCSSValue(exchangeWebsite, "color");
    }

    public GeneralExchangePage clickOnExchangeTwitter() {
        utils.click(exchangeTwitter);
        return this;
    }

    public String getExchangeTwitterColor() {
        return utils.getCSSValue(exchangeTwitter, "color");
    }

    public GeneralExchangePage clickOnExchangeReddit() {
        utils.click(exchangeReddit);
        return this;
    }

    public String getExchangeRedditColor() {
        return utils.getCSSValue(exchangeReddit, "color");
    }

    public GeneralExchangePage clickOnExchangeTelegram() {
        utils.click(exchangeTelegram);
        return this;
    }

    public String getExchangeTelegramColor() {
        return utils.getCSSValue(exchangeTelegram, "color");
    }

    public GeneralExchangePage clickOnExchangeBitcointalk() {
        utils.click(exchangeBitcointalk);
        return this;
    }

    public String getExchangeBitcointalkColor() {
        return utils.getCSSValue(exchangeBitcointalk, "color");
    }


    // Tabs

    public GeneralExchangePage clickOnConnectExchangeButton() {
        utils.click(connectExchangeButton);
        return this;
    }

    public GeneralExchangePage clickOnOverviewTab() {
        utils.click(overviewTab);
        return this;
    }

    public GeneralExchangePage clickOnMarketsTab() {
        utils.click(marketsTab);
        return this;
    }

    public GeneralExchangePage clickOnTeamUpdatesTab() {
        utils.click(teamUpdatesTab);
        return this;
    }

}
