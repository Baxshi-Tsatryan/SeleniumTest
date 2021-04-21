package Chrome.AllPages.CoinsPage;

import Chrome.MainPackage.SeleniumUtils;
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

    public BuyCoin clickOnBuyCoin() {
        utils.click(buyCoinButton);
        return this;
    }

    public Boolean mercuryoIsDisplayed(){
        return utils.isDisplayed(mercuryo);
    }

    public BuyCoin clickOnMercuryo() {
        utils.click(mercuryo);
        return this;
    }

    public BuyCoin clickOnBinance() {
        utils.click(binance);
        return this;
    }

    public Boolean wyreIsDisplayed(){
        return utils.isDisplayed(wyre);
    }

    public BuyCoin clickOnWyre() {
        utils.click(wyre);
        return this;
    }


    // Mercuryo / Wyre

    public String getCurrentCurrency() {
        return utils.getText(currentCurrency);
    }

    public BuyCoin clickOnCurrenciesDropDown() {
        utils.click(currencyDropDown);
        return this;
    }

    public BuyCoin selectFirstCurrency(String currencyName){
        clickOnCurrenciesDropDown();
        int i = 1;
        do{
            String allCurrenciesName = driver.findElement(By.cssSelector("ul.jsx-2262109736 > li:nth-of-type(" + i + ") .table-row")).getText();
            if(allCurrenciesName.equals(currencyName)) {
                driver.findElement(By.cssSelector("ul.jsx-2262109736 > li:nth-of-type(" + i + ") .table-row")).click();
                break;
            }
            i++;
        }
        while (true);
        return this;
    }

    public BuyCoin typeFirstCurrencyAmount(String amount) {
        utils.sendKeysAction(firstAmountField, amount);
        return this;
    }

    public String getFirstCurrencyAmount() {
        return utils.getText(firstAmountField);
    }

    public BuyCoin clearFirstCurrencyAmount() {
        utils.clear(firstAmountField);
        return this;
    }

    public BuyCoin typeSecondCurrencyAmount(String amount) {
        utils.sendKeysAction(secondAmountField, amount);
        return this;
    }

    public String getSecondCurrencyAmount() {
        return utils.getText(secondAmountField);
    }

    public BuyCoin clearSecondCurrencyAmount() {
        utils.clear(secondAmountField);
        return this;
    }

    public String getErrorMessage() {
        return utils.getText(errorMessage);
    }

    public BuyCoin clickOnContinue() {
        utils.click(continueButton);
        return this;
    }


    // Wallets / Exchanges page

    public BuyCoin typeWalletAddress(String walletAddress) {
        utils.sendKeysAction(walletAddressField, walletAddress);
        return this;
    }

    public String getWalletAddress() {
        return utils.getText(walletAddressField);
    }

    public BuyCoin clearWalletAddress() {
        utils.clear(walletAddressField);
        return this;
    }

    public BuyCoin clickOnBuy() {
        utils.click(buyButton);
        return this;
    }

    public BuyCoin getAllConnectedExchangesNamesAndBalances(){
        int i = 1;
        do{
            try {
                System.out.println("Exchange name - " + driver.findElement(By.cssSelector(".table-container tr:nth-of-type(" + i + ") > td:nth-of-type(2) .table-row")).getText());
                System.out.println("Exchange balance - " + driver.findElement(By.cssSelector(".table-container tr:nth-of-type(" + i + ") > .right .table-row")).getText());
            }catch (Exception e){
                break;
            }
            i++;
        }while (true);
        return this;
    }

}
