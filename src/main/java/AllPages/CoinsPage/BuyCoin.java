package AllPages.CoinsPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyCoin {

    WebDriver driver;
    SeleniumUtils utils;

    public BuyCoin(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    // General

    By buyCoinButton = By.cssSelector("div.coininfo-buttons-container > button:nth-of-type(3)");

    By mercuryo = By.cssSelector("div.jsx-4211493378 > div:nth-of-type(1) > .buy-option-header");

    By binance = By.cssSelector("div.jsx-4211493378 > div:nth-of-type(2) > .buy-option-header");

    By wyre = By.cssSelector("div.jsx-4211493378 > div:nth-of-type(3) > .buy-option-header");


    // Mercuryo / Wyre page

    By currentCurrency = By.cssSelector("div.input-dropdown .jsx-84060712 > .jsx-1751315535");

    By currencyDropDown = By.cssSelector("div.input-dropdown .jsx-84060712 > .jsx-1751315535");

    By firstAmountField = By.cssSelector("div.input-dropdown [name]");

    By secondAmountField = By.cssSelector("div.amount-container > .jsx-84060712 > .jsx-1485860805 > [name]");

    By errorMessage = By.cssSelector(".description");

    By continueButton = By.cssSelector(".primary");


    // Wallets / Exchanges page

    By walletAddressField = By.cssSelector("[placeholder='Your BTC wallet address']");

    By buyButton = By.cssSelector(".primary-bordered");


    // -------------------------------------------------- Methods -------------------------------------------------

    // General

    public void clickOnBuyCoin()
    {
        utils.clickOnElement(buyCoinButton);
    }

    public void clickOnMercuryo()
    {
        utils.clickOnElement(mercuryo);
    }

    public void clickOnBinance()
    {
        utils.clickOnElement(binance);
    }

    public void clickOnWyre()
    {
        utils.clickOnElement(wyre);
    }


    // Mercuryo / Wyre

    public String getCurrentCurrency()
    {
        return utils.getText(currentCurrency);
    }

    public void clickOnCurrenciesDropDown()
    {
        utils.clickOnElement(currencyDropDown);
    }

    public void typeFirstCurrencyAmount(String amount)
    {
        utils.sendKeysAction(firstAmountField, amount);
    }

    public String getFirstCurrencyAmount()
    {
        return utils.getText(firstAmountField);
    }

    public void clearFirstCurrencyAmount()
    {
        utils.clear(firstAmountField);
    }

    public void typeSecondCurrencyAmount(String amount)
    {
        utils.sendKeysAction(secondAmountField, amount);
    }

    public String getSecondCurrencyAmount()
    {
        return utils.getText(secondAmountField);
    }

    public void clearSecondCurrencyAmount()
    {
        utils.clear(secondAmountField);
    }

    public String getErrorMessage()
    {
        return utils.getText(errorMessage);
    }

    public void clickOnContinue()
    {
        utils.clickOnElement(continueButton);
    }


    // Wallets / Exchanges page

    public void typeWalletAddress(String walletAddress)
    {
        utils.sendKeysAction(walletAddressField, walletAddress);
    }

    public String getWalletAddress()
    {
        return utils.getText(walletAddressField);
    }

    public void clearWalletAddress()
    {
        utils.clear(walletAddressField);
    }

    public void clickOnBuy()
    {
        utils.clickOnElement(buyButton);
    }

}
