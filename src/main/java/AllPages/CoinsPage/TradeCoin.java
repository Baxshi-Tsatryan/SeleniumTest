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

    public void clickOnTradeCoin()
    {
        utils.clickOnElement(tradeCoin);
    }

    public void clickOnBuyCoin()
    {
        utils.clickOnElement(buyCoin);
    }

    public void clickOnSellCoin()
    {
        utils.clickOnElement(sellCoin);
    }


    // Trading page

    public void clickOnIconBack()
    {
        utils.clickOnElement(iconBack);
    }

    public String getExchangeTotal()
    {
        return utils.getText(exchangeTotal);
    }

    public void typeWithCoinName(String coinName)
    {
        utils.sendKeysAction(withCoinField, coinName);
    }

    public void clickOnWithCoinField()
    {
        utils.clickOnElement(withCoinField);
    }

    public String getWithCoinNameAndAmount()
    {
        return utils.getText(currentWithCoinNameAndAmount);
    }

    public void clickOnClearWithCoinIcon()
    {
        utils.clickOnElement(clearWithCoinIcon);
    }

    public void typeBuyingCoinName(String coinName)
    {
        utils.sendKeysAction(buyingCoinField, coinName);
    }

    public void clickOnBuyingCoinField()
    {
        utils.clickOnElement(buyingCoinField);
    }

    public String getBuyingCoinNameAndAmount()
    {
        return utils.getText(currentBuyingCoinNameAndAmount);
    }

    public void clickOnClearBuyingCoinIcon()
    {
        utils.clickOnElement(clearBuyingCoinIcon);
    }

    public void typeWithCoinAmount(String amount)
    {
        utils.sendKeysAction(withCoinAmountField, amount);
    }

    public String getWithCoinSymbol()
    {
        return utils.getText(withCoinAmountSymbol);
    }

    public void clearWithCoinAmountField()
    {
        utils.clear(withCoinAmountField);
    }

    public String getWithCoinAmount()
    {
        return utils.getText(withCoinAmountField);
    }

    public void typeBuyingCoinAmount(String amount)
    {
        utils.sendKeysAction(buyingCoinAmountField, amount);
    }

    public String getBuyingCoinSymbol()
    {
        return utils.getText(buyingCoinAmountSymbol);
    }

    public void clearBuyingCoinAmountField()
    {
        utils.clear(buyingCoinAmountField);
    }

    public String getBuyingCoinAmount()
    {
        return utils.getText(buyingCoinAmountField);
    }

    public void clickOn100Percent()
    {
        utils.clickOnElement(button100);
    }

    public void clickOn50Percent()
    {
        utils.clickOnElement(button50);
    }

    public void clickOn25Percent()
    {
        utils.clickOnElement(button25);
    }

    public void clickOnSubmitTrade()
    {
        utils.clickOnElement(submitTrade);
    }


    // Success page

    public String getSuccessBought()
    {
        return utils.getText(successBought);
    }

    public String getSuccessSold()
    {
        return utils.getText(successSold);
    }

    public Boolean successPageIsDisplayed()
    {
        return utils.isDisplayed(successBought);
    }

    public void clickOnSuccessOK()
    {
        utils.clickOnElement(successOK);
    }

}
