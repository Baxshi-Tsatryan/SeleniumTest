package chrome.allPages.portfolioPage;

import chrome.mainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddPortfolioModal {

    WebDriver driver;
    SeleniumUtils utils;

    public AddPortfolioModal(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    By addPortfolio = By.cssSelector(".primary");


    // Exchanges API

    By connectExchange = By.cssSelector("div.buttons-with-info > button:nth-of-type(1)");

    By searchExchanges = By.cssSelector(".search-wrapper.jsx-2489091780 [name]");

    By firstExchangeResult = By.cssSelector(".result-items > a:nth-of-type(1) .table-row");

    By exchangeName = By.cssSelector(".showing .filter-value");

    By exchangeNameField = By.xpath("//*[@id='__next']/main/div/div/div[1]/div[2]/div/div/div[1]/div[4]/div[3]/div/div[1]/div/div/input");

    By exchangeAPISyncTab = By.cssSelector("div.tabs-section > div:nth-of-type(1) > .tab-label");

    By firstAPIField = By.cssSelector("div.jsx-636662421 > .inputs-section > div:nth-of-type(1) [placeholder='Enter here']");

    By exchangeFirstPaste = By.cssSelector("div.jsx-2795784314 > .inputs-section > div:nth-of-type(1) .jsx-1426819953");

    By secondAPIField = By.cssSelector("div.jsx-636662421 div:nth-of-type(2) [name]");

    By secondAPIByBitField = By.cssSelector("div.jsx-636662421 > .inputs-section > div:nth-of-type(2) [name]");

    By exchangeSecondPaste = By.cssSelector("div.jsx-2795784314 div:nth-of-type(2) .jsx-1426819953");

    By thirdAPIField = By.cssSelector("div.jsx-636662421 div:nth-of-type(3) [name]");

    By exchangeThirdPaste = By.cssSelector("div.jsx-2795784314 div:nth-of-type(3) .jsx-1426819953");

    By errorMessages = By.cssSelector("div.error-text > span");

    By errorMessage2 = By.cssSelector("div.text-down > span");

    By submitButton = By.cssSelector("div.submit-section > .jsx-1426819953");

    By submitButtonDisable = By.cssSelector("button[disabled]");


    // Binance

    By binanceSpotCheckBox = By.cssSelector(".input-sections > div:nth-of-type(1) .jsx-800540484 > .table-row");

    By binanceMarginCheckBox = By.cssSelector(".input-sections > div:nth-of-type(2) .jsx-800540484 > .table-row");

    By binanceIsolatedMarginCheckBox = By.cssSelector(".input-sections > div:nth-of-type(3) .jsx-800540484 > .table-row");

    By binanceFuturesCheckBox = By.cssSelector(".input-sections > div:nth-of-type(4) .jsx-800540484 > .table-row");

    By binanceSavingsCheckBox = By.cssSelector(".input-sections > div:nth-of-type(5) .jsx-800540484 > .table-row");

    By errorMessageWhenThereArentMargin = By.cssSelector(".input-sections > div:nth-of-type(2) > .jsx-3288458895 > .jsx-3288458895 > .description");

    By errorMessageWhenThereArentFutures = By.cssSelector(".input-sections > div:nth-of-type(4) > .jsx-3288458895 > .jsx-3288458895 > .description");

    By futuresErrorMessage = By.cssSelector("div.exchange-future > .jsx-3498412455 > .description");

    By binanceAddAccountsButton = By.cssSelector("div.exchange-future > .jsx-1426819953");


    // Exchanges CSV

    By CSVTab = By.cssSelector("div.tabs-section > div:nth-of-type(2) > .tab-label");

    By importCSVField = By.cssSelector("input.jsx-2090407883");

    By downloadCSVTemplateButton = By.cssSelector("span.download-csv-text > span");

    By deleteCSVButton = By.cssSelector("div.file-block > .icon-delete");

    By addAnotherCSVButton = By.cssSelector("input.jsx-2090407883");

    By invalidCSVFileErrorMessage = By.cssSelector(".file-error");

    By validCSVFile = By.cssSelector(".file-name-container");


    // Wallets

    By connectWallet = By.cssSelector("div.buttons-with-info > button:nth-of-type(2)");

    By searchWallets = By.cssSelector(".search-wrapper.jsx-842027962 [name]");

    By firstWalletResult = By.cssSelector(".result-items > a:nth-of-type(1) .table-row");

    By walletNameField = By.cssSelector("input[value='Ethereum Wallet']");

    By walletAddressField = By.cssSelector("[placeholder='Enter here']");

    By walletPasteButton = By.cssSelector("div.circle-borders .jsx-1426819953");

    By walletErrorMessage = By.cssSelector(".error-text > span");


    // Multi-Coins Wallets

    By searchDropDownMultiCoinsWallets = By.cssSelector(".search-dropdown-enable-placeholder");

    By multiCoinsFirstResult = By.cssSelector("ul.jsx-931209423 > li:nth-of-type(1) .table-row");

    By deleteSelectedCoinFromSearchDropDown = By.cssSelector(".icon-clear");

    By searchFieldInMultiCoinsWallet = By.cssSelector("input.jsx-931209423");

    By addAnotherCoinInMultiCoinsWallet = By.cssSelector(".add-another-coin");

    By walletAddressFieldDisabled = By.cssSelector("[disabled][name]");


    // ZIP

    By ZIPFileTab = By.cssSelector("div.tabs-section > div:nth-of-type(1) > .tab-label");

    By manualTab = By.cssSelector("div.tabs-section > div:nth-of-type(2) > .tab-label");

    By importZIPFile = By.cssSelector("input.jsx-2090407883");

    By errorMessageCSVZIP = By.cssSelector("div.error-text > span");

    By multiCoinsErrorMessage = By.cssSelector("div.error-text > span");


    // Add Manual Portfolios

    By addManualPortfolio = By.cssSelector("div.manual-buttons > .jsx-1426819953");

    By manualPortfolioNameField = By.cssSelector("[placeholder='Portfolio Name']");

    By manualPortfolioTotalCostField = By.cssSelector("[placeholder='Total cost']");

    By manualPortfolioCalculateAmountOnTotal = By.cssSelector("div.calculate-on-total i");

    By manualPortfolioSaveButton = By.cssSelector("div.action-buttons > .primary");

    By manualPortfolioCancelButton = By.cssSelector(".bordered");

    By connectButtonAfterManualAdded = By.cssSelector("div.buttons-section > .jsx-1426819953");


    By closeButton = By.cssSelector(".icon-close");

    By backButton = By.cssSelector(".icon-back");

    By noShowMeSyncedButton = By.cssSelector(".bordered");

    By successYesButton = By.cssSelector("div.buttons-section > .primary");


    // ------------------------------------------ Methods ------------------------------------------------

    public AddPortfolioModal clickOnAddPortfolio() {

        try {
            utils.click(addPortfolio);
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".primary")));
        }
        return this;
    }


    // Exchanges

    public AddPortfolioModal clickOnConnectExchange() {
        utils.click(connectExchange);
        return this;
    }

    public AddPortfolioModal searchExchange(String exchangeName) {
        utils.sendKeysAction(searchExchanges, exchangeName);
        return this;
    }

    public AddPortfolioModal exchangeFirstResultIsDisplayed(){
        utils.isDisplayed(firstExchangeResult);
        return this;
    }

    public AddPortfolioModal clickOnExchangeFirstResult(){
        utils.click(firstExchangeResult);
        return this;
    }

    public String getExchangeName(){
        return utils.getText(exchangeName);
    }

    public AddPortfolioModal deleteExchangeName() {
        utils.clear(exchangeNameField);
        return this;
    }

    public AddPortfolioModal typeExchangeName(String exchangeName) {
        utils.sendKeysAction(exchangeNameField, exchangeName);
        return this;
    }

    public String getExchangeNameField() {
        return utils.getText(exchangeNameField);
    }

    public AddPortfolioModal clearExchangeName() {
        utils.clear(exchangeNameField);
        return this;
    }

    public AddPortfolioModal clickOnAPISyncTab() {
        utils.click(exchangeAPISyncTab);
        return this;
    }

    public AddPortfolioModal APISyncTabIsDisplayed(){
        utils.isDisplayed(exchangeAPISyncTab);
        return this;
    }

    public AddPortfolioModal typeFirstAPI(String firstAPI) {
        utils.sendKeysAction(firstAPIField, firstAPI);
        return this;
    }

    public String getFirstAPI() {
        return utils.getText(firstAPIField);
    }

    public AddPortfolioModal clearFirstAPI() {
        utils.clear(firstAPIField);
        return this;
    }

    public AddPortfolioModal typeSecondAPI(String secondAPI) {
        utils.sendKeysAction(secondAPIField, secondAPI);
        return this;
    }

    public AddPortfolioModal typeSecondAPIByBit(String secondAPIByBit) {
        utils.sendKeysAction(secondAPIByBitField, secondAPIByBit);
        return this;
    }

    public String getSecondAPI() {
        return utils.getText(secondAPIField);
    }

    public AddPortfolioModal clearSecondAPI() {
        utils.clear(secondAPIField);
        return this;
    }

    public Boolean secondAPIFieldIsDisplayed() {
        return utils.isDisplayed(secondAPIField);
    }

    public AddPortfolioModal typeThirdAPI(String thirdAPI) {
        utils.sendKeysAction(thirdAPIField, thirdAPI);
        return this;
    }

    public String getThirdAPI() {
        return utils.getText(thirdAPIField);
    }

    public AddPortfolioModal clearThirdAPI() {
        utils.clear(thirdAPIField);
        return this;
    }

    public Boolean thirdAPIFieldIsDisplayed() {
        return utils.isDisplayed(thirdAPIField);
    }

    public AddPortfolioModal clickOnFirstPaste() {
        utils.click(exchangeFirstPaste);
        return this;
    }

    public AddPortfolioModal clickOnSecondPaste() {
        utils.click(exchangeSecondPaste);
        return this;
    }

    public Boolean secondPasteIsDisplayed() {
        return utils.isDisplayed(exchangeSecondPaste);
    }

    public AddPortfolioModal clickOnThirdPaste() {
        utils.click(exchangeThirdPaste);
        return this;
    }

    public Boolean thirdPasteIsDisplayed() {
        return utils.isDisplayed(exchangeThirdPaste);
    }

    public Boolean errorMessageIsDisplayed() {
        return utils.isDisplayed(errorMessages);
    }

    public Boolean errorMessage2IsDisplayed() {
        return utils.isDisplayed(errorMessage2);
    }

    public String getErrorMessage() {
        return utils.getText(errorMessages);
    }

    public String getErrorMessage2() {
        return utils.getText(errorMessage2);
    }

    public AddPortfolioModal disabledSubmitIsDisplayed(){
        utils.isDisplayed(submitButtonDisable);
        return this;
    }


    // Binance

    public AddPortfolioModal clickOnSpotCheckBox() {
        utils.click(binanceSpotCheckBox);
        return this;
    }

    public Boolean binanceSpotCheckBoxIsSelected() {
        return utils.isSelected(binanceSpotCheckBox);
    }

    public Boolean binanceSpotCheckBoxIsEnabled() {
        return utils.isEnabled(binanceSpotCheckBox);
    }

    public AddPortfolioModal clickOnMarginCheckBox() {
        utils.click(binanceMarginCheckBox);
        return this;
    }

    public AddPortfolioModal clickOnIsolatedMarginCheckBox(){
        utils.click(binanceIsolatedMarginCheckBox);
        return this;
    }

    public AddPortfolioModal isolatedMarginCheckBoxIsEnabled(){
        utils.click(binanceIsolatedMarginCheckBox);
        return this;
    }

    public AddPortfolioModal isolatedMarginCheckBoxIsSelected(){
        utils.click(binanceIsolatedMarginCheckBox);
        return this;
    }

    public Boolean binanceMarginCheckBoxIsSelected() {
        return utils.isSelected(binanceMarginCheckBox);
    }

    public Boolean binanceMarginCheckBoxIsEnabled() {
        return utils.isEnabled(binanceMarginCheckBox);
    }

    public AddPortfolioModal clickOnFuturesCheckBox() {
        utils.click(binanceFuturesCheckBox);
        return this;
    }

    public Boolean binanceFuturesCheckBoxIsSelected() {
        return utils.isSelected(binanceFuturesCheckBox);
    }

    public Boolean binanceFuturesAccountIsEnabled() {
        return utils.isEnabled(binanceFuturesCheckBox);
    }


    public AddPortfolioModal clickOnBinanceSavingsCheckBox(){
        utils.click(binanceSavingsCheckBox);
        return this;
    }

    public AddPortfolioModal binanceSavingsCheckBoxIsEnabled(){
        utils.click(binanceSavingsCheckBox);
        return this;
    }

    public AddPortfolioModal binanceSavingsCheckBoxIsSelected(){
        utils.click(binanceSavingsCheckBox);
        return this;
    }

    public AddPortfolioModal clickOnBinanceAddAccounts() {
        utils.click(binanceAddAccountsButton);
        return this;
    }

    public String getBinanceFuturesErrorMessage() {
        return utils.getText(futuresErrorMessage);
    }

    public String getBinanceMarginErrorMessage() {
        return utils.getText(errorMessageWhenThereArentMargin);
    }

    public String getBinanceFuturesErrorMessage2() {
        return utils.getText(errorMessageWhenThereArentFutures);
    }


    // CSV

    public AddPortfolioModal clickOnCSVTab() {
        utils.click(CSVTab);
        return this;
    }

    public AddPortfolioModal CSVTabIsDisplayed(){
        utils.isDisplayed(CSVTab);
        return this;
    }

    public AddPortfolioModal importCSVFile(String pathToCSVFile) {
        utils.sendKeysAction(importCSVField, pathToCSVFile);
        return this;
    }

    public AddPortfolioModal clickOnImportCSVFile() {
        utils.click(importCSVField);
        return this;
    }

    public AddPortfolioModal clickOnCSVTemplate() {
        utils.click(downloadCSVTemplateButton);
        return this;
    }

    public AddPortfolioModal importAnotherCSVFile(String pathToCSVFile) {
        utils.sendKeysAction(addAnotherCSVButton, pathToCSVFile);
        return this;
    }

    public AddPortfolioModal clickOnDeleteCSVFileButton() {
        utils.click(deleteCSVButton);
        return this;
    }

    public String getInvalidCSVErrorMessage() {
        return utils.getText(invalidCSVFileErrorMessage);
    }

    public Boolean invalidCSVErrorMessageIsDisplayed() {
        return utils.isDisplayed(invalidCSVFileErrorMessage);
    }

    // Wallets

    public AddPortfolioModal clickOnConnectWallet() {
        utils.click(connectWallet);
        return this;
    }

    public AddPortfolioModal searchWallet(String walletName) {
        utils.sendKeysAction(searchWallets, walletName);
        return this;
    }

    public AddPortfolioModal typeWalletName(String walletName) {
        utils.sendKeysAction(walletNameField, walletName);
        return this;
    }

    public AddPortfolioModal typeWalletAddress(String walletAddress) {
        utils.sendKeysAction(walletAddressField, walletAddress);
        return this;
    }

    public AddPortfolioModal clickOnPasteWallet() {
        utils.click(walletPasteButton);
        return this;
    }

    public String getWalletError() {
        return utils.getText(walletErrorMessage);
    }

    public Boolean walletErrorIsDisplayed(){
        return utils.isDisplayed(walletErrorMessage);
    }


    // Multi-Coins Wallets

    public AddPortfolioModal clickOnSearchDropDownMultiCoinsWallets() {
        utils.click(searchDropDownMultiCoinsWallets);
        return this;
    }

    public AddPortfolioModal clickOnFirstMultiCoinResult() {
        utils.click(multiCoinsFirstResult);
        return this;
    }

    public AddPortfolioModal typeMultiCoinsWallet(String multiCoinName) {
        utils.sendKeysAction(searchFieldInMultiCoinsWallet, multiCoinName);
        return this;
    }

    public AddPortfolioModal clickOnDeleteSelectedCoinFromSearchDropDownButton() {
        utils.click(deleteSelectedCoinFromSearchDropDown);
        return this;
    }

    public AddPortfolioModal clickOnAddAnotherCoin() {
        utils.click(addAnotherCoinInMultiCoinsWallet);
        return this;
    }

    public String getMultiCoinsError() {
        return utils.getText(multiCoinsErrorMessage);
    }


    // ZIP

    public AddPortfolioModal clickOnZIPFileTab() {
        utils.click(ZIPFileTab);
        return this;
    }

    public AddPortfolioModal clickOnManualTab() {
        utils.click(manualTab);
        return this;
    }

    public AddPortfolioModal importZIPFile(String pathToZIPFile) {
        utils.sendKeysAction(importZIPFile, pathToZIPFile);
        return this;
    }

    public String getZIPFileError() {
        return utils.getText(errorMessageCSVZIP);
    }


    // Manual Portfolios

    public AddPortfolioModal clickOnAddManualPortfolio() {
        utils.click(addManualPortfolio);
        return this;
    }

    public AddPortfolioModal typeManualPortfolioName(String manualPortfolioName) {
        utils.sendKeysAction(manualPortfolioNameField, manualPortfolioName);
        return this;
    }

    public AddPortfolioModal typeManualPortfolioTotalCost(String manualPortfolioTotalCost) {
        utils.sendKeysAction(manualPortfolioTotalCostField, manualPortfolioTotalCost);
        return this;
    }

    public AddPortfolioModal disableCalculateAmountInTotal() {
        utils.click(manualPortfolioCalculateAmountOnTotal);
        return this;
    }

    public AddPortfolioModal clickOnSaveButtonInManualPortfolio() {
        utils.click(manualPortfolioSaveButton);
        return this;
    }

    public AddPortfolioModal clickOnCancelButtonInManualPortfolio() {
        utils.click(manualPortfolioCancelButton);
        return this;
    }

    public AddPortfolioModal clickOnConnectAfterAddManualPortfolio() {
        utils.click(connectButtonAfterManualAdded);
        return this;
    }


    // General

    public AddPortfolioModal clickOnClose() {
        utils.click(closeButton);
        return this;
    }

    public AddPortfolioModal clickOnBack() {
        try {
            utils.click(backButton);
        } catch (Exception ee) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".icon-back")));
        }
        return this;
    }

    public AddPortfolioModal clickOnNoShowMeSynced() {
        utils.click(noShowMeSyncedButton);
        return this;
    }

    public Boolean noShowMeSyncedIsDisplayed() {
        return utils.isDisplayed(noShowMeSyncedButton);
    }

    public AddPortfolioModal clickOnSuccessYes() {
        utils.click(successYesButton);
        return this;
    }

    public AddPortfolioModal clickOnSubmit() {
        utils.click(submitButton);
        return this;
    }


    // ------------------------------------------- Scripts -----------------------------------------------


    public AddPortfolioModal getExchangesResults() {
        int index = 1;

        do {
            WebElement exchangeResults = driver.findElement(By.cssSelector("div.result-items > a:nth-of-type(" + index + ") > .result-item"));

            System.out.println(exchangeResults.getText());

            index++;
        } while (index != 15);

        return this;
    }

    public AddPortfolioModal clickOnAllExchanges() {
        int index = 1;

        do {
            driver.findElement(By.cssSelector("ul.jsx-2489091780 > li:nth-of-type(" + index + ")")).click();

            clickOnBack();

            index++;
        } while (index != 25);
        return this;
    }

    public AddPortfolioModal getWalletsResults() {
        int index = 1;

        do {
            WebElement walletResults = driver.findElement(By.cssSelector("div.result-items > a:nth-of-type(" + index + ") > .result-item"));

            System.out.println(walletResults.getText());

            index++;
        } while (index != 15);
        return this;

    }

    public AddPortfolioModal clickOnAllWallets() {
        int index = 1;

        do {
            driver.findElement(By.cssSelector("ul.jsx-842027962 > li:nth-of-type(" + index + ")")).click();

            clickOnBack();

            index++;
        } while (index != 27);
        return this;
    }

    public AddPortfolioModal getMultiWalletsResults() {
        int index = 1;

        do {
            WebElement walletResults = driver.findElement(By.cssSelector("ul.jsx-931209423 > li:nth-of-type(" + index + ") > .result-item-primary"));

            System.out.println(walletResults.getText());

            index++;
        } while (index != 15);
        return this;

    }

    public AddPortfolioModal clickOnMultiWalletsResults() {
        int index = 1;

        do {
            driver.findElement(By.cssSelector("ul.jsx-931209423 > li:nth-of-type(" + index + ") > .result-item-primary")).click();

            typeMultiCoinsWallet(" anyCoinName ");

            index++;
        } while (index != 15);
        return this;

    }


}
