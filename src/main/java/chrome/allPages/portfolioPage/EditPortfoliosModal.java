package chrome.allPages.portfolioPage;

import chrome.mainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPortfoliosModal {

    WebDriver driver;
    SeleniumUtils utils;

    public EditPortfoliosModal(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    // Edit Exchange

    By connectionNameFieldExchangeWallet = By.cssSelector("div.edit-portfolio-modal-container > div:nth-of-type(1) [name]");

    By exchangeWalletNameField = By.cssSelector("input[disabled]");

    By withTransactionHistoryExchange = By.cssSelector("div.edit-portfolio-modal-container > div:nth-of-type(3) i");

    By APIKeyFieldExchange = By.cssSelector("#__next > main > div > div > div.jsx-2045198438.sidebar-container-wrapper.show > div:nth-child(2) > div > div > div > div.jsx-4109874676.changing-content-wrapper > div > div.edit-portfolio-modal-container > div:nth-child(4) > div > input");

    By APISecretFieldExchange = By.cssSelector("#__next > main > div > div > div.jsx-2045198438.sidebar-container-wrapper.show > div:nth-child(2) > div > div > div > div.jsx-4109874676.changing-content-wrapper > div > div.edit-portfolio-modal-container > div:nth-child(5) > div > input");

    By passphraseFieldExchange = By.cssSelector("#__next > main > div > div > div.jsx-2045198438.sidebar-container-wrapper.show > div:nth-child(2) > div > div > div > div.jsx-4109874676.changing-content-wrapper > div > div.edit-portfolio-modal-container > div:nth-child(6) > div > input");

    By calculateAmountOnTotalExchange = By.cssSelector("div.edit-portfolio-modal-container > div:nth-of-type(6) i");

    By totalCostFieldExchange = By.cssSelector("#__next > main > div > div > div.jsx-2045198438.sidebar-container-wrapper.show > div:nth-child(2) > div > div > div > div.jsx-4109874676.changing-content-wrapper > div > div.edit-portfolio-modal-container > div:nth-child(7) > div > input");

    By save = By.cssSelector("div.buttons-container > .primary");

    By cancel = By.cssSelector(".secondary");


    // Edit Coinbase

    By loginWithCoinbase = By.cssSelector(".jsx-3897312982");

    By totalCostFieldCoinbase = By.cssSelector("#__next > main > div > div > div.jsx-2045198438.sidebar-container-wrapper.show > div:nth-child(2) > div > div > div > div.jsx-4109874676.changing-content-wrapper > div > div.edit-portfolio-modal-container > div:nth-child(6) > div > input");


    // Edit CSV Exchange

    By portfolioNameFieldCSV = By.cssSelector("input[disabled]");

    By connectionNameFieldCSV = By.cssSelector("#__next > main > div > div > div.jsx-2045198438.sidebar-container-wrapper.show > div:nth-child(2) > div > div > div > div.jsx-4109874676.changing-content-wrapper > div > div.edit-portfolio-modal-container > div:nth-child(2) > div > input");

    By totalCostFieldCSV = By.cssSelector("#__next > main > div > div > div.jsx-2045198438.sidebar-container-wrapper.show > div:nth-child(2) > div > div > div > div.jsx-4109874676.changing-content-wrapper > div > div.edit-portfolio-modal-container > div:nth-child(3) > div > input");

    By addAnotherCSV = By.cssSelector(".add-another-file");

    By errorMessageCSV = By.cssSelector(".file-error");


    // Edit Wallet

    By walletAddressField = By.cssSelector("#__next > main > div > div > div.jsx-2045198438.sidebar-container-wrapper.show > div:nth-child(2) > div > div > div > div.jsx-4109874676.changing-content-wrapper > div > div.edit-portfolio-modal-container > div:nth-child(3) > div > input");

    By calculateAmountOnTotalWallet = By.cssSelector("div.switch i");

    By totalCostFieldWallet = By.cssSelector("#__next > main > div > div > div.jsx-2045198438.sidebar-container-wrapper.show > div:nth-child(2) > div > div > div > div.jsx-4109874676.changing-content-wrapper > div > div.edit-portfolio-modal-container > div:nth-child(5) > div > input");


    // Edit Multi-Coins Wallet

    By connectionNameFieldMultiWallet = By.cssSelector("#__next > main > div > div > div.jsx-2045198438.sidebar-container-wrapper.show > div:nth-child(2) > div > div > div > div.jsx-4109874676.changing-content-wrapper > div > div.edit-portfolio-modal-container > div:nth-child(1) > div > input");

    By calculateAmountOnTotalMultiWallet = By.cssSelector("div.switch i");

    By totalCostFieldMultiWallet = By.cssSelector("#__next > main > div > div > div.jsx-2045198438.sidebar-container-wrapper.show > div:nth-child(2) > div > div > div > div.jsx-4109874676.changing-content-wrapper > div > div.edit-portfolio-modal-container > div:nth-child(3) > div > input");

    By connectNewWalletMultiWallet = By.cssSelector("div.new-connections-container > .jsx-1426819953");


    // Sub Wallet

    By connectionNameFieldSubWallet = By.cssSelector("#__next > main > div > div > div.jsx-2045198438.sidebar-container-wrapper.show > div:nth-child(2) > div > div > div > div.jsx-4109874676.changing-content-wrapper > div > div.edit-portfolio-modal-container > div:nth-child(1) > div > input");

    By walletNameFieldSubWallet = By.cssSelector("input[disabled]");

    By walletAddressFieldSubWallet = By.cssSelector("#__next > main > div > div > div.jsx-2045198438.sidebar-container-wrapper.show > div:nth-child(2) > div > div > div > div.jsx-4109874676.changing-content-wrapper > div > div.edit-portfolio-modal-container > div:nth-child(3) > div > input");


    // ---------------------------------------------- Methods ---------------------------------------------------------

    // Exchange

    public EditPortfoliosModal typeConnectionNameExchangeWallet(String exchangeWalletName) {
        utils.sendKeysAction(connectionNameFieldExchangeWallet, exchangeWalletName);
        return this;
    }

    public String getConnectionNameExchangeWallet() {
        return utils.getText(connectionNameFieldExchangeWallet);
    }

    public EditPortfoliosModal clearConnectionNameExchangeWallet() {
        utils.clear(connectionNameFieldExchangeWallet);
        return this;
    }

    public String getExchangeWalletName() {
        return utils.getText(exchangeWalletNameField);
    }

    public EditPortfoliosModal clickOnWithTransactionHistoryExchange() {
        utils.click(withTransactionHistoryExchange);
        return this;
    }

    public Boolean withTransactionHistoryIsEnabled() {
        return utils.isEnabled(withTransactionHistoryExchange);
    }

    public Boolean withTransactionHistoryIsSelected() {
        return utils.isSelected(withTransactionHistoryExchange);
    }

    public EditPortfoliosModal typeAPIKeyExchange(String APIKey) {
        utils.sendKeysAction(APIKeyFieldExchange, APIKey);
        return this;
    }

    public String getAPIKeyExchange() {
        return utils.getText(APIKeyFieldExchange);
    }

    public EditPortfoliosModal clearAPIKeyExchange() {
        utils.clear(APIKeyFieldExchange);
        return this;
    }

    public Boolean APISecretFieldExchangeIsDisplayed() {
        return utils.isDisplayed(APISecretFieldExchange);
    }

    public EditPortfoliosModal typeAPISecretExchange(String APISecret) {
        utils.sendKeysAction(APISecretFieldExchange, APISecret);
        return this;
    }

    public String getAPISecretExchange() {
        return utils.getText(APISecretFieldExchange);
    }

    public EditPortfoliosModal clearAPISecretExchange() {
        utils.clear(APISecretFieldExchange);
        return this;
    }

    public Boolean passphraseExchangeIsDisplayed() {
        return utils.isDisplayed(passphraseFieldExchange);
    }

    public EditPortfoliosModal typePassphraseExchange(String passphrase) {
        utils.sendKeysAction(passphraseFieldExchange, passphrase);
        return this;
    }

    public String getPassphraseExchange() {
        return utils.getText(passphraseFieldExchange);
    }

    public EditPortfoliosModal clearPassphraseExchange() {
        utils.clear(passphraseFieldExchange);
        return this;
    }

    public EditPortfoliosModal clickOnCalculateAmountOnTotalExchange() {
        utils.click(calculateAmountOnTotalExchange);
        return this;
    }

    public Boolean calculateAmountOnTotalExchangeIsEnabled() {
        return utils.isEnabled(calculateAmountOnTotalExchange);
    }

    public Boolean calculateAmountOnTotalExchangeIsSelected() {
        return utils.isSelected(calculateAmountOnTotalExchange);
    }

    public EditPortfoliosModal typeTotalCostExchange(String totalCost) {
        utils.sendKeysAction(totalCostFieldExchange, totalCost);
        return this;
    }

    public String getTotalCostExchange() {
        return utils.getText(totalCostFieldExchange);
    }

    public EditPortfoliosModal clearTotalCostExchange() {
        utils.clear(totalCostFieldExchange);
        return this;
    }

    public EditPortfoliosModal clickOnSave() {
        utils.click(save);
        return this;
    }

    public EditPortfoliosModal clickOnCancel() {
        utils.click(cancel);
        return this;
    }


    // Coinbase

    public Boolean loginWithCoinbaseIsDisplayed() {
        return utils.isDisplayed(loginWithCoinbase);
    }

    public EditPortfoliosModal clickOnLoginWithCoinbase() {
        utils.click(loginWithCoinbase);
        return this;
    }

    public EditPortfoliosModal typeTotalCostCoinbase(String totalCost) {
        utils.sendKeysAction(totalCostFieldCoinbase, totalCost);
        return this;
    }

    public String getTotalCostCoinbase() {
        return utils.getText(totalCostFieldCoinbase);
    }

    public EditPortfoliosModal clearTotalCostCoinbase() {
        utils.clear(totalCostFieldCoinbase);
        return this;
    }


    // Exchange CSV

    public String getPortfolioNameCSV() {
        return utils.getText(portfolioNameFieldCSV);
    }

    public EditPortfoliosModal typeConnectionNameCSV(String connectionName) {
        utils.sendKeysAction(connectionNameFieldCSV, connectionName);
        return this;
    }

    public String getConnectionNameCSV() {
        return utils.getText(connectionNameFieldCSV);
    }

    public EditPortfoliosModal clearConnectionNameCSV() {
        utils.clear(connectionNameFieldCSV);
        return this;
    }

    public EditPortfoliosModal typeTotalCostCSV(String totalCost) {
        utils.sendKeysAction(totalCostFieldCSV, totalCost);
        return this;
    }

    public String getTotalCostCSV() {
        return utils.getText(totalCostFieldCSV);
    }

    public EditPortfoliosModal clearTotalCostCSV() {
        utils.clear(totalCostFieldCSV);
        return this;
    }

    public EditPortfoliosModal clickOnAddAnotherCSV() {
        utils.click(addAnotherCSV);
        return this;
    }

    public EditPortfoliosModal typePathToAnotherCSV(String path) {
        utils.sendKeysAction(addAnotherCSV, path);
        return this;
    }

    public String getErrorMessageCSV() {
        return utils.getText(errorMessageCSV);
    }


    // Wallet

    public EditPortfoliosModal typeWalletAddress(String walletAddress) {
        utils.sendKeysAction(walletAddressField, walletAddress);
        return this;
    }

    public String getWalletAddress() {
        return utils.getText(walletAddressField);
    }

    public EditPortfoliosModal clearWalletAddress() {
        utils.clear(walletAddressField);
        return this;
    }

    public EditPortfoliosModal clickOnCalculateAmountOnTotalWallet() {
        utils.click(calculateAmountOnTotalWallet);
        return this;
    }

    public Boolean calculateAmountOnTotalWalletIsEnabled() {
        return utils.isEnabled(calculateAmountOnTotalWallet);
    }

    public Boolean calculateAmountOnTotalWalletIsSelected() {
        return utils.isSelected(calculateAmountOnTotalWallet);
    }

    public EditPortfoliosModal typeTotalCostWallet(String totalCost) {
        utils.sendKeysAction(totalCostFieldWallet, totalCost);
        return this;
    }

    public String getTotalCostWallet() {
        return utils.getText(totalCostFieldWallet);
    }

    public EditPortfoliosModal clearTotalCostWallet() {
        utils.clear(totalCostFieldWallet);
        return this;
    }


    // Multi-Coins Wallet

    public EditPortfoliosModal typeConnectionNameMultiWallet(String multiWalletName) {
        utils.sendKeysAction(connectionNameFieldMultiWallet, multiWalletName);
        return this;
    }

    public String getConnectionNameMultiWallet() {
        return utils.getText(connectionNameFieldMultiWallet);
    }

    public EditPortfoliosModal clearConnectionNameMultiWallet() {
        utils.clear(connectionNameFieldMultiWallet);
        return this;
    }

    public EditPortfoliosModal clickOnCalculateAmountOnTotalMultiWallet() {
        utils.click(calculateAmountOnTotalMultiWallet);
        return this;
    }

    public Boolean calculateAmountOnTotalMultiWalletIsEnabled() {
        return utils.isEnabled(calculateAmountOnTotalMultiWallet);
    }

    public Boolean calculateAmountOnTotalMultiWalletIsSelected() {
        return utils.isSelected(calculateAmountOnTotalMultiWallet);
    }

    public EditPortfoliosModal typeTotalCostMultiWallet(String totalCost) {
        utils.sendKeysAction(totalCostFieldMultiWallet, totalCost);
        return this;
    }

    public String getTotalCostMultiWallet() {
        return utils.getText(totalCostFieldMultiWallet);
    }

    public EditPortfoliosModal clearTotalCostMultiWallet() {
        utils.clear(totalCostFieldMultiWallet);
        return this;
    }

    public EditPortfoliosModal clickOnConnectNewWalletMulti() {
        utils.click(connectNewWalletMultiWallet);
        return this;
    }


    // Sub wallet

    public EditPortfoliosModal typeConnectionNameSubWallet(String subWalletName) {
        utils.sendKeysAction(connectionNameFieldSubWallet, subWalletName);
        return this;
    }

    public String getConnectionNameSubWallet() {
        return utils.getText(connectionNameFieldSubWallet);
    }

    public EditPortfoliosModal clearConnectionNameSubWallet() {
        utils.clear(connectionNameFieldSubWallet);
        return this;
    }

    public String getSubWalletName() {
        return utils.getText(walletNameFieldSubWallet);
    }

    public EditPortfoliosModal typeSubWalletAddress(String subWalletAddress) {
        utils.sendKeysAction(walletAddressFieldSubWallet, subWalletAddress);
        return this;
    }

    public String getSubWalletAddress() {
        return utils.getText(walletAddressFieldSubWallet);
    }

    public EditPortfoliosModal clearSubWalletAddress() {
        utils.clear(walletAddressFieldSubWallet);
        return this;
    }

}
