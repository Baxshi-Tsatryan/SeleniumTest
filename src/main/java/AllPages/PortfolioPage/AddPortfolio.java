package AllPages.PortfolioPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddPortfolio {

    WebDriver driver;
    SeleniumUtils utils;

    public AddPortfolio(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    By addPortfolio = By.cssSelector(".primary");


    // Exchanges API

    By connectExchange = By.cssSelector("div.buttons-with-info > button:nth-of-type(1)");

    By searchExchanges = By.cssSelector(".search-wrapper.jsx-2489091780 [name]");

    By exchangeNameField = By.xpath("//*[@id='__next']/main/div/div/div[1]/div[2]/div/div/div[1]/div[4]/div[3]/div/div[1]/div/div/input");

    By exchangeAPISyncTab = By.cssSelector("div.tabs-section > div:nth-of-type(1) > .tab-label");

    By firstAPIField = By.cssSelector("div.jsx-2422867904 > .inputs-section > div:nth-of-type(1) [placeholder='Enter here']");

    By exchangeFirstPaste = By.cssSelector("div.jsx-2795784314 > .inputs-section > div:nth-of-type(1) .jsx-1426819953");

    By secondAPIField = By.cssSelector("div.jsx-2422867904 div:nth-of-type(2) [name]");

    By secondAPIByBitField = By.cssSelector("div.jsx-2422867904 > .inputs-section > div:nth-of-type(2) [name]");

    By exchangeSecondPaste = By.cssSelector("div.jsx-2795784314 div:nth-of-type(2) .jsx-1426819953");

    By thirdAPIField = By.cssSelector("div.jsx-2422867904 div:nth-of-type(3) [name]");

    By exchangeThirdPaste = By.cssSelector("div.jsx-2795784314 div:nth-of-type(3) .jsx-1426819953");

    By errorMessages = By.cssSelector("div.error-text > span");

    By submitButton = By.cssSelector("div.submit-section > .jsx-1426819953");

    By submitButtonDisable = By.cssSelector("button[disabled]");


    // Binance

    By binanceSpotAccount = By.cssSelector("div.input-sections > div:nth-of-type(1) .jsx-3279326736 > .table-row");

    By binanceMarginAccount = By.cssSelector("div.input-sections > div:nth-of-type(2) .jsx-3279326736 > .table-row");

    By binanceFuturesAccount = By.cssSelector("div.input-sections > div:nth-of-type(3) .jsx-3279326736 > .table-row");

    By errorMessageWhenThereArentMarginAccount = By.cssSelector("div.input-sections > div:nth-of-type(2) > .jsx-3498412455 > .description");

    By errorMessageWhenThereArentFuturesAccount = By.cssSelector("div.input-sections > div:nth-of-type(3) > .error-container");

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

    By walletNameField = By.cssSelector("input[value='Ethereum Wallet']");

    By walletAddressField = By.cssSelector("[placeholder='Enter here']");

    By walletPasteButton = By.cssSelector("div.circle-borders .jsx-1426819953");

    By walletErrorMessage = By.cssSelector("div.error-text > span");


    // Multi-Coins Wallets

    By searchDropDownMultiCoinsWallets = By.cssSelector(".search-dropdown-enable-placeholder");

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


    public void clickOnAddPortfolio() {

        try {
            utils.clickOnElement(addPortfolio);
        }
        catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".primary")));
        }
    }

    public void clickOnAddPortfolioAction()
    {
        utils.actionClickOnElement(addPortfolio);
    }


    // Exchanges

    public void clickOnConnectExchange() {
        utils.clickOnElement(connectExchange);
    }

    public void searchExchange(String exchangeName) {
        utils.sendKeysAction(searchExchanges, exchangeName);
    }

    public void deleteExchangeName()
    {
        utils.clear(exchangeNameField);
    }

    public void typeExchangeName(String exchangeName) {
        utils.sendKeysAction(exchangeNameField, exchangeName);
    }

    public String getExchangeName()
    {
        return utils.getText(exchangeNameField);
    }

    public void clearExchangeName()
    {
        utils.clear(exchangeNameField);
    }

    public void clickOnAPISyncTab() {
        utils.clickOnElement(exchangeAPISyncTab);
    }

    public void typeFirstAPI(String firstAPI) {
        utils.sendKeysAction(firstAPIField, firstAPI);
    }

    public String getTypedFirstAPI()
    {
        return utils.getText(firstAPIField);
    }

    public void clearTypedFirstAPI()
    {
        utils.clear(firstAPIField);
    }

    public void typeSecondAPI(String secondAPI) {
        utils.sendKeysAction(secondAPIField, secondAPI);
    }

    public void typeSecondAPIByBit(String secondAPIByBit)
    {
        utils.sendKeysAction(secondAPIByBitField, secondAPIByBit);
    }

    public String getTypedSecondAPI()
    {
        return utils.getText(secondAPIField);
    }

    public void clearTypedSecondAPI()
    {
        utils.clear(secondAPIField);
    }

    public Boolean secondAPIFieldIsDisplayed()
    {
        return utils.isDisplayed(secondAPIField);
    }

    public void typeThirdAPI(String thirdAPI) {
        utils.sendKeysAction(thirdAPIField, thirdAPI);
    }

    public String getTypedThirdAPI()
    {
        return utils.getText(thirdAPIField);
    }

    public void clearTypedThirdAPI()
    {
        utils.clear(thirdAPIField);
    }

    public Boolean thirdAPIFieldIsDisplayed()
    {
        return utils.isDisplayed(thirdAPIField);
    }

    public void clickOnFirstPaste() {
        utils.clickOnElement(exchangeFirstPaste);
    }

    public void clickOnSecondPaste() {
        utils.clickOnElement(exchangeSecondPaste);
    }

    public Boolean secondPasteIsDisplayed()
    {
        return utils.isDisplayed(exchangeSecondPaste);
    }

    public void clickOnThirdPaste() {
        utils.clickOnElement(exchangeThirdPaste);
    }

    public Boolean thirdPasteIsDisplayed()
    {
        return utils.isDisplayed(exchangeThirdPaste);
    }

    public String getErrorMessage() {
        return utils.getText(errorMessages);
    }


    // Binance

    public void clickOnSpotAccount() {
        utils.clickOnElement(binanceSpotAccount);
    }

    public Boolean spotAccountIsSelected()
    {
        return utils.isSelected(binanceSpotAccount);
    }

    public Boolean spotAccountIsEnabled()
    {
        return utils.isEnabled(binanceSpotAccount);
    }

    public void clickOnMarginAccount() {
        utils.clickOnElement(binanceMarginAccount);
    }

    public Boolean marginAccountIsSelected()
    {
        return utils.isSelected(binanceMarginAccount);
    }

    public Boolean marginAccountIsEnabled()
    {
        return utils.isEnabled(binanceMarginAccount);
    }

    public void clickOnFuturesAccount() {
        utils.clickOnElement(binanceFuturesAccount);
    }

    public Boolean futuresAccountIsSelected()
    {
        return utils.isSelected(binanceFuturesAccount);
    }

    public Boolean futuresAccountIsEnabled()
    {
        return utils.isEnabled(binanceFuturesAccount);
    }

    public void clickOnBinanceAddAccounts() {
        utils.clickOnElement(binanceAddAccountsButton);
    }

    public String getFuturesErrorMessage() {
        return utils.getText(futuresErrorMessage);
    }

    public String getMarginAccountErrorMessage() {
        return utils.getText(errorMessageWhenThereArentMarginAccount);
    }

    public String getFuturesAccountErrorMessage() {
        return utils.getText(errorMessageWhenThereArentFuturesAccount);
    }


    // CSV

    public void clickOnCSVTab() {
        utils.clickOnElement(CSVTab);
    }

    public void importCSVFile(String pathToCSVFile) {
        utils.sendKeysAction(importCSVField, pathToCSVFile);
    }

    public void clickOnImportCSVFile()
    {
        utils.clickOnElement(importCSVField);
    }

    public void clickOnCSVTemplate() {
        utils.clickOnElement(downloadCSVTemplateButton);
    }

    public void importAnotherCSVFile(String pathToCSVFile) {
        utils.sendKeysAction(addAnotherCSVButton, pathToCSVFile);
    }

    public void clickOnDeleteCSVFileButton() {
        utils.clickOnElement(deleteCSVButton);
    }

    public String getInvalidCSVErrorMessage() {
        return utils.getText(invalidCSVFileErrorMessage);
    }

    public Boolean invalidCSVErrorMessageIsDisplayed()
    {
        return utils.isDisplayed(invalidCSVFileErrorMessage);
    }


    // Wallets

    public void clickOnConnectWallet() {
        utils.clickOnElement(connectWallet);
    }

    public void searchWallet(String walletName) {
        utils.sendKeysAction(searchWallets, walletName);
    }

    public void typeWalletName(String walletName) {
        utils.sendKeysAction(walletNameField, walletName);
    }

    public void typeWalletAddress(String walletAddress) {
        utils.sendKeysAction(walletAddressField, walletAddress);
    }

    public void clickOnPasteWallet() {
        utils.clickOnElement(walletPasteButton);
    }

    public String getWalletError() {
        return utils.getText(walletErrorMessage);
    }


    // Multi-Coins Wallets

    public void clickOnSearchDropDownMultiCoinsWallets() {
        utils.clickOnElement(searchDropDownMultiCoinsWallets);
    }

    public void typeMultiCoinsWallet(String multiCoinName) {
        utils.sendKeysAction(searchFieldInMultiCoinsWallet, multiCoinName);
    }

    public void clickOnDeleteSelectedCoinFromSearchDropDownButton()
    {
        utils.clickOnElement(deleteSelectedCoinFromSearchDropDown);
    }

    public void clickOnAddAnotherCoin()
    {
        utils.clickOnElement(addAnotherCoinInMultiCoinsWallet);
    }

    public String getMultiCoinsError()
    {
        return utils.getText(multiCoinsErrorMessage);
    }


    // ZIP

    public void clickOnZIPFileTab()
    {
        utils.clickOnElement(ZIPFileTab);
    }

    public void clickOnManualTab()
    {
        utils.clickOnElement(manualTab);
    }

    public void importZIPFile(String pathToZIPFile)
    {
        utils.sendKeysAction(importZIPFile, pathToZIPFile);
    }

    public String getZIPFileError()
    {
        return utils.getText(errorMessageCSVZIP);
    }


    // Manual Portfolios

    public void clickOnAddManualPortfolio() {
        utils.clickOnElement(addManualPortfolio);
    }

    public void typeManualPortfolioName(String manualPortfolioName)
    {
        utils.sendKeysAction(manualPortfolioNameField, manualPortfolioName);
    }

    public void typeManualPortfolioTotalCost(String manualPortfolioTotalCost)
    {
        utils.sendKeysAction(manualPortfolioTotalCostField, manualPortfolioTotalCost);
    }

    public void disableCalculateAmountInTotal()
    {
        utils.clickOnElement(manualPortfolioCalculateAmountOnTotal);
    }

    public void clickOnSaveButtonInManualPortfolio()
    {
        utils.clickOnElement(manualPortfolioSaveButton);
    }

    public void clickOnCancelButtonInManualPortfolio() {
        utils.clickOnElement(manualPortfolioCancelButton);
    }

    public void clickOnConnectAfterAddManualPortfolio()
    {
        utils.clickOnElement(connectButtonAfterManualAdded);
    }


    // General

    public void clickOnClose()
    {
        utils.clickOnElement(closeButton);
    }

    public void clickOnBack()
    {
        try
        {
            utils.clickOnElement(backButton);
        }
        catch (Exception ee) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".icon-back")));
        }
    }

    public void clickOnNoShowMeSynced()
    {
        utils.clickOnElement(noShowMeSyncedButton);
    }

    public void clickOnSuccessYes()
    {
        utils.clickOnElement(successYesButton);
    }

    public void clickOnSubmit() {
        utils.clickOnElement(submitButton);
    }


    // ------------------------------------------- Scripts -----------------------------------------------



    public void getExchangesResults() {
        int index = 1;

        do {
            WebElement exchangeResults = driver.findElement(By.cssSelector("div.result-items > a:nth-of-type(" + index + ") > .result-item"));

            System.out.println(exchangeResults.getText());

            index++;
        } while (index != 15);

    }

    public void clickOnAllExchanges() {
        int index = 1;

        do {
            driver.findElement(By.cssSelector("ul.jsx-2489091780 > li:nth-of-type(" + index + ")")).click();

            clickOnBack();

            index++;
        } while (index != 25);
    }

    public void getWalletsResults() {
        int index = 1;

        do {
            WebElement walletResults = driver.findElement(By.cssSelector("div.result-items > a:nth-of-type(" + index + ") > .result-item"));

            System.out.println(walletResults.getText());

            index++;
        } while (index != 15);

    }

    public void clickOnAllWallets() {
        int index = 1;

        do {
            driver.findElement(By.cssSelector("ul.jsx-842027962 > li:nth-of-type(" + index + ")")).click();

            clickOnBack();

            index++;
        } while (index != 27);
    }

    public void getMultiWalletsResults() {
        int index = 1;

        do {
            WebElement walletResults = driver.findElement(By.cssSelector("ul.jsx-931209423 > li:nth-of-type(" + index + ") > .result-item-primary"));

            System.out.println(walletResults.getText());

            index++;
        } while (index != 15);

    }

    public void clickOnMultiWalletsResults() {
        int index = 1;

        do {
            driver.findElement(By.cssSelector("ul.jsx-931209423 > li:nth-of-type(" + index + ") > .result-item-primary")).click();

            typeMultiCoinsWallet(" anyCoinName ");

            index++;
        } while (index != 15);

    }


}
