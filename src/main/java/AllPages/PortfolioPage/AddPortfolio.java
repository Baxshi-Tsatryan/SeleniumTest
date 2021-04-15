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

    public AddPortfolio clickOnAddPortfolio() {

        try {
            utils.click(addPortfolio);
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".primary")));
        }
        return this;
    }

    public AddPortfolio clickOnAddPortfolioAction() {
        utils.actionClick(addPortfolio);
        return this;
    }


    // Exchanges

    public AddPortfolio clickOnConnectExchange() {
        utils.click(connectExchange);
        return this;
    }

    public AddPortfolio searchExchange(String exchangeName) {
        utils.sendKeysAction(searchExchanges, exchangeName);
        return this;
    }

    public AddPortfolio deleteExchangeName() {
        utils.clear(exchangeNameField);
        return this;
    }

    public AddPortfolio typeExchangeName(String exchangeName) {
        utils.sendKeysAction(exchangeNameField, exchangeName);
        return this;
    }

    public String getExchangeName() {
        return utils.getText(exchangeNameField);
    }

    public AddPortfolio clearExchangeName() {
        utils.clear(exchangeNameField);
        return this;
    }

    public AddPortfolio clickOnAPISyncTab() {
        utils.click(exchangeAPISyncTab);
        return this;
    }

    public AddPortfolio typeFirstAPI(String firstAPI) {
        utils.sendKeysAction(firstAPIField, firstAPI);
        return this;
    }

    public String getTypedFirstAPI() {
        return utils.getText(firstAPIField);
    }

    public AddPortfolio clearTypedFirstAPI() {
        utils.clear(firstAPIField);
        return this;
    }

    public AddPortfolio typeSecondAPI(String secondAPI) {
        utils.sendKeysAction(secondAPIField, secondAPI);
        return this;
    }

    public AddPortfolio typeSecondAPIByBit(String secondAPIByBit) {
        utils.sendKeysAction(secondAPIByBitField, secondAPIByBit);
        return this;
    }

    public String getTypedSecondAPI() {
        return utils.getText(secondAPIField);
    }

    public AddPortfolio clearTypedSecondAPI() {
        utils.clear(secondAPIField);
        return this;
    }

    public Boolean secondAPIFieldIsDisplayed() {
        return utils.isDisplayed(secondAPIField);
    }

    public AddPortfolio typeThirdAPI(String thirdAPI) {
        utils.sendKeysAction(thirdAPIField, thirdAPI);
        return this;
    }

    public String getTypedThirdAPI() {
        return utils.getText(thirdAPIField);
    }

    public AddPortfolio clearTypedThirdAPI() {
        utils.clear(thirdAPIField);
        return this;
    }

    public Boolean thirdAPIFieldIsDisplayed() {
        return utils.isDisplayed(thirdAPIField);
    }

    public AddPortfolio clickOnFirstPaste() {
        utils.click(exchangeFirstPaste);
        return this;
    }

    public AddPortfolio clickOnSecondPaste() {
        utils.click(exchangeSecondPaste);
        return this;
    }

    public Boolean secondPasteIsDisplayed() {
        return utils.isDisplayed(exchangeSecondPaste);
    }

    public AddPortfolio clickOnThirdPaste() {
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


    // Binance

    public AddPortfolio clickOnSpotAccount() {
        utils.click(binanceSpotAccount);
        return this;
    }

    public Boolean spotAccountIsSelected() {
        return utils.isSelected(binanceSpotAccount);
    }

    public Boolean spotAccountIsEnabled() {
        return utils.isEnabled(binanceSpotAccount);
    }

    public AddPortfolio clickOnMarginAccount() {
        utils.click(binanceMarginAccount);
        return this;
    }

    public Boolean marginAccountIsSelected() {
        return utils.isSelected(binanceMarginAccount);
    }

    public Boolean marginAccountIsEnabled() {
        return utils.isEnabled(binanceMarginAccount);
    }

    public AddPortfolio clickOnFuturesAccount() {
        utils.click(binanceFuturesAccount);
        return this;
    }

    public Boolean futuresAccountIsSelected() {
        return utils.isSelected(binanceFuturesAccount);
    }

    public Boolean futuresAccountIsEnabled() {
        return utils.isEnabled(binanceFuturesAccount);
    }

    public AddPortfolio clickOnBinanceAddAccounts() {
        utils.click(binanceAddAccountsButton);
        return this;
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

    public AddPortfolio clickOnCSVTab() {
        utils.click(CSVTab);
        return this;
    }

    public AddPortfolio importCSVFile(String pathToCSVFile) {
        utils.sendKeysAction(importCSVField, pathToCSVFile);
        return this;
    }

    public AddPortfolio clickOnImportCSVFile() {
        utils.click(importCSVField);
        return this;
    }

    public AddPortfolio clickOnCSVTemplate() {
        utils.click(downloadCSVTemplateButton);
        return this;
    }

    public AddPortfolio importAnotherCSVFile(String pathToCSVFile) {
        utils.sendKeysAction(addAnotherCSVButton, pathToCSVFile);
        return this;
    }

    public AddPortfolio clickOnDeleteCSVFileButton() {
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

    public AddPortfolio clickOnConnectWallet() {
        utils.click(connectWallet);
        return this;
    }

    public AddPortfolio searchWallet(String walletName) {
        utils.sendKeysAction(searchWallets, walletName);
        return this;
    }

    public AddPortfolio typeWalletName(String walletName) {
        utils.sendKeysAction(walletNameField, walletName);
        return this;
    }

    public AddPortfolio typeWalletAddress(String walletAddress) {
        utils.sendKeysAction(walletAddressField, walletAddress);
        return this;
    }

    public AddPortfolio clickOnPasteWallet() {
        utils.click(walletPasteButton);
        return this;
    }

    public String getWalletError() {
        return utils.getText(walletErrorMessage);
    }


    // Multi-Coins Wallets

    public AddPortfolio clickOnSearchDropDownMultiCoinsWallets() {
        utils.click(searchDropDownMultiCoinsWallets);
        return this;
    }

    public AddPortfolio clickOnFirstMultiCoinResult() {
        utils.click(multiCoinsFirstResult);
        return this;
    }

    public AddPortfolio typeMultiCoinsWallet(String multiCoinName) {
        utils.sendKeysAction(searchFieldInMultiCoinsWallet, multiCoinName);
        return this;
    }

    public AddPortfolio clickOnDeleteSelectedCoinFromSearchDropDownButton() {
        utils.click(deleteSelectedCoinFromSearchDropDown);
        return this;
    }

    public AddPortfolio clickOnAddAnotherCoin() {
        utils.click(addAnotherCoinInMultiCoinsWallet);
        return this;
    }

    public String getMultiCoinsError() {
        return utils.getText(multiCoinsErrorMessage);
    }


    // ZIP

    public AddPortfolio clickOnZIPFileTab() {
        utils.click(ZIPFileTab);
        return this;
    }

    public AddPortfolio clickOnManualTab() {
        utils.click(manualTab);
        return this;
    }

    public AddPortfolio importZIPFile(String pathToZIPFile) {
        utils.sendKeysAction(importZIPFile, pathToZIPFile);
        return this;
    }

    public String getZIPFileError() {
        return utils.getText(errorMessageCSVZIP);
    }


    // Manual Portfolios

    public AddPortfolio clickOnAddManualPortfolio() {
        utils.click(addManualPortfolio);
        return this;
    }

    public AddPortfolio typeManualPortfolioName(String manualPortfolioName) {
        utils.sendKeysAction(manualPortfolioNameField, manualPortfolioName);
        return this;
    }

    public AddPortfolio typeManualPortfolioTotalCost(String manualPortfolioTotalCost) {
        utils.sendKeysAction(manualPortfolioTotalCostField, manualPortfolioTotalCost);
        return this;
    }

    public AddPortfolio disableCalculateAmountInTotal() {
        utils.click(manualPortfolioCalculateAmountOnTotal);
        return this;
    }

    public AddPortfolio clickOnSaveButtonInManualPortfolio() {
        utils.click(manualPortfolioSaveButton);
        return this;
    }

    public AddPortfolio clickOnCancelButtonInManualPortfolio() {
        utils.click(manualPortfolioCancelButton);
        return this;
    }

    public AddPortfolio clickOnConnectAfterAddManualPortfolio() {
        utils.click(connectButtonAfterManualAdded);
        return this;
    }


    // General

    public AddPortfolio clickOnClose() {
        utils.click(closeButton);
        return this;
    }

    public AddPortfolio clickOnBack() {
        try {
            utils.click(backButton);
        } catch (Exception ee) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".icon-back")));
        }
        return this;
    }

    public AddPortfolio clickOnNoShowMeSynced() {
        utils.click(noShowMeSyncedButton);
        return this;
    }

    public Boolean noShowMeSyncedIsDisplayed() {
        return utils.isDisplayed(noShowMeSyncedButton);
    }

    public AddPortfolio clickOnSuccessYes() {
        utils.click(successYesButton);
        return this;
    }

    public AddPortfolio clickOnSubmit() {
        utils.click(submitButton);
        return this;
    }


    // ------------------------------------------- Scripts -----------------------------------------------


    public AddPortfolio getExchangesResults() {
        int index = 1;

        do {
            WebElement exchangeResults = driver.findElement(By.cssSelector("div.result-items > a:nth-of-type(" + index + ") > .result-item"));

            System.out.println(exchangeResults.getText());

            index++;
        } while (index != 15);

        return this;
    }

    public AddPortfolio clickOnAllExchanges() {
        int index = 1;

        do {
            driver.findElement(By.cssSelector("ul.jsx-2489091780 > li:nth-of-type(" + index + ")")).click();

            clickOnBack();

            index++;
        } while (index != 25);
        return this;
    }

    public AddPortfolio getWalletsResults() {
        int index = 1;

        do {
            WebElement walletResults = driver.findElement(By.cssSelector("div.result-items > a:nth-of-type(" + index + ") > .result-item"));

            System.out.println(walletResults.getText());

            index++;
        } while (index != 15);
        return this;

    }

    public AddPortfolio clickOnAllWallets() {
        int index = 1;

        do {
            driver.findElement(By.cssSelector("ul.jsx-842027962 > li:nth-of-type(" + index + ")")).click();

            clickOnBack();

            index++;
        } while (index != 27);
        return this;
    }

    public AddPortfolio getMultiWalletsResults() {
        int index = 1;

        do {
            WebElement walletResults = driver.findElement(By.cssSelector("ul.jsx-931209423 > li:nth-of-type(" + index + ") > .result-item-primary"));

            System.out.println(walletResults.getText());

            index++;
        } while (index != 15);
        return this;

    }

    public AddPortfolio clickOnMultiWalletsResults() {
        int index = 1;

        do {
            driver.findElement(By.cssSelector("ul.jsx-931209423 > li:nth-of-type(" + index + ") > .result-item-primary")).click();

            typeMultiCoinsWallet(" anyCoinName ");

            index++;
        } while (index != 15);
        return this;

    }


}
