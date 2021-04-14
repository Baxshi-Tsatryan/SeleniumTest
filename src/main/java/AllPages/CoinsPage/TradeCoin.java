package AllPages.CoinsPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TradeCoin {

    WebDriver driver;
    SeleniumUtils utils;

    public TradeCoin(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    // General

    By tradeCoin = By.cssSelector("div.coininfo-buttons-container > button:nth-of-type(2)");

    By buyCoin = By.cssSelector(".buy-container");

    By sellCoin = By.cssSelector(".sell-container");


    // Trading page

    By iconBack = By.cssSelector(".icon-back");

    By exchangeTotal = By.cssSelector("p.total-container > span:nth-of-type(2)");

    By withCoinField = By.cssSelector("div.sell-container [placeholder='Search']");

    By clearWithCoinIcon = By.cssSelector("div.sell-container .icon-clear");

    By currentWithCoinNameAndAmount = By.cssSelector("div.sell-container .search-dropdown-enable-placeholder");

    By buyingCoinField = By.cssSelector("div.buy-container [placeholder='Search']");

    By clearBuyingCoinIcon = By.cssSelector("div.buy-container .icon-clear");

    By currentBuyingCoinNameAndAmount = By.cssSelector("div.buy-container .search-dropdown-enable-placeholder");

    By withCoinAmountField = By.cssSelector("div.amount-container > div:nth-of-type(2) [name]");

    By withCoinAmountSymbol = By.cssSelector("div.amount-container > div:nth-of-type(2) .table-row");

    By buyingCoinAmountField = By.cssSelector("div.amount-container > div:nth-of-type(1) [name]");

    By buyingCoinAmountSymbol = By.cssSelector("div.amount-container > div:nth-of-type(1) .table-row");

    By button100 = By.cssSelector("div.percent-buttons-container > button:nth-of-type(3)");

    By button50 = By.cssSelector("div.percent-buttons-container > button:nth-of-type(2)");

    By button25 = By.cssSelector("div.percent-buttons-container > button:nth-of-type(1)");

    By submitTrade = By.cssSelector(".primary");


    // Success page

    By successBought = By.cssSelector("div.bought-container > span:nth-of-type(2)");

    By successSold = By.cssSelector("div.sold-container > span:nth-of-type(2)");

    By successOK = By.cssSelector(".primary");


    // ----------------------------------------------- Methods ------------------------------------------------------

    // General

    public TradeCoin clickOnTradeCoin() {
        utils.click(tradeCoin);
        return this;
    }

    public TradeCoin clickOnBuyCoin() {
        utils.click(buyCoin);
        return this;
    }

    public TradeCoin clickOnSellCoin() {
        utils.click(sellCoin);
        return this;
    }


    // Trading page

    public TradeCoin clickOnIconBack() {
        utils.click(iconBack);
        return this;
    }

    public String getExchangeTotal() {
        return utils.getText(exchangeTotal);
    }

    public TradeCoin typeWithCoinName(String coinName) {
        utils.sendKeysAction(withCoinField, coinName);
        return this;
    }

    public TradeCoin clickOnWithCoinField() {
        utils.click(withCoinField);
        return this;
    }

    public String getWithCoinNameAndAmount() {
        return utils.getText(currentWithCoinNameAndAmount);
    }

    public TradeCoin clickOnClearWithCoinIcon() {
        utils.click(clearWithCoinIcon);
        return this;
    }

    public TradeCoin typeBuyingCoinName(String coinName) {
        utils.sendKeysAction(buyingCoinField, coinName);
        return this;
    }

    public TradeCoin clickOnBuyingCoinField() {
        utils.click(buyingCoinField);
        return this;
    }

    public String getBuyingCoinNameAndAmount() {
        return utils.getText(currentBuyingCoinNameAndAmount);
    }

    public TradeCoin clickOnClearBuyingCoinIcon() {
        utils.click(clearBuyingCoinIcon);
        return this;
    }

    public TradeCoin typeWithCoinAmount(String amount) {
        utils.sendKeysAction(withCoinAmountField, amount);
        return this;
    }

    public String getWithCoinSymbol() {
        return utils.getText(withCoinAmountSymbol);
    }

    public TradeCoin clearWithCoinAmountField() {
        utils.clear(withCoinAmountField);
        return this;
    }

    public String getWithCoinAmount() {
        return utils.getText(withCoinAmountField);
    }

    public TradeCoin typeBuyingCoinAmount(String amount) {
        utils.sendKeysAction(buyingCoinAmountField, amount);
        return this;
    }

    public String getBuyingCoinSymbol() {
        return utils.getText(buyingCoinAmountSymbol);
    }

    public TradeCoin clearBuyingCoinAmountField() {
        utils.clear(buyingCoinAmountField);
        return this;
    }

    public String getBuyingCoinAmount() {
        return utils.getText(buyingCoinAmountField);
    }

    public TradeCoin clickOn100Percent() {
        utils.click(button100);
        return this;
    }

    public TradeCoin clickOn50Percent() {
        utils.click(button50);
        return this;
    }

    public TradeCoin clickOn25Percent() {
        utils.click(button25);
        return this;
    }

    public TradeCoin clickOnSubmitTrade() {
        utils.click(submitTrade);
        return this;
    }


    // Success page

    public String getSuccessBought() {
        return utils.getText(successBought);
    }

    public String getSuccessSold() {
        return utils.getText(successSold);
    }

    public Boolean successPageIsDisplayed() {
        return utils.isDisplayed(successBought);
    }

    public TradeCoin clickOnSuccessOK() {
        utils.click(successOK);
        return this;
    }

}
