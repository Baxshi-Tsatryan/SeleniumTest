package AllPages.PortfolioPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPortfolios {

    WebDriver driver;
    SeleniumUtils utils;

    public EditPortfolios(WebDriver driver) {
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

    public void typeConnectionNameExchangeWallet(String exchangeWalletName)
    {
        utils.sendKeys(connectionNameFieldExchangeWallet, exchangeWalletName);
    }

    public String getConnectionNameExchangeWallet()
    {
        return utils.getText(connectionNameFieldExchangeWallet);
    }

    public void clearConnectionNameExchangeWallet()
    {
        utils.clear(connectionNameFieldExchangeWallet);
    }

    public String getExchangeWalletName()
    {
        return utils.getText(exchangeWalletNameField);
    }

    public void clickOnWithTransactionHistoryExchange()
    {
        utils.clickOnElement(withTransactionHistoryExchange);
    }

    public Boolean withTransactionHistoryIsEnabled()
    {
        return utils.isEnabled(withTransactionHistoryExchange);
    }

    public Boolean withTransactionHistoryIsSelected()
    {
        return utils.isSelected(withTransactionHistoryExchange);
    }

    public void typeAPIKeyExchange(String APIKey)
    {
        utils.sendKeys(APIKeyFieldExchange, APIKey);
    }

    public String getAPIKeyExchange()
    {
        return utils.getText(APIKeyFieldExchange);
    }

    public void clearAPIKeyExchange()
    {
        utils.clear(APIKeyFieldExchange);
    }

    public Boolean APISecretFieldExchangeIsDisplayed()
    {
        return utils.isDisplayed(APISecretFieldExchange);
    }

    public void typeAPISecretExchange(String APISecret)
    {
        utils.sendKeys(APISecretFieldExchange, APISecret);
    }

    public String getAPISecretExchange()
    {
        return utils.getText(APISecretFieldExchange);
    }

    public void clearAPISecretExchange()
    {
        utils.clear(APISecretFieldExchange);
    }

    public Boolean passphraseExchangeIsDisplayed()
    {
        return utils.isDisplayed(passphraseFieldExchange);
    }

    public void typePassphraseExchange(String passphrase)
    {
        utils.sendKeys(passphraseFieldExchange, passphrase);
    }

    public String getPassphraseExchange()
    {
        return utils.getText(passphraseFieldExchange);
    }

    public void clearPassphraseExchange()
    {
        utils.clear(passphraseFieldExchange);
    }

    public void clickOnCalculateAmountOnTotalExchange()
    {
        utils.clickOnElement(calculateAmountOnTotalExchange);
    }

    public Boolean calculateAmountOnTotalExchangeIsEnabled()
    {
        return utils.isEnabled(calculateAmountOnTotalExchange);
    }

    public Boolean calculateAmountOnTotalExchangeIsSelected()
    {
        return utils.isSelected(calculateAmountOnTotalExchange);
    }

    public void typeTotalCostExchange(String totalCost)
    {
        utils.sendKeys(totalCostFieldExchange, totalCost);
    }

    public String getTotalCostExchange()
    {
        return utils.getText(totalCostFieldExchange);
    }

    public void clearTotalCostExchange()
    {
        utils.clear(totalCostFieldExchange);
    }

    public void clickOnSave()
    {
        utils.clickOnElement(save);
    }

    public void clickOnCancel()
    {
        utils.clickOnElement(cancel);
    }


    // Coinbase

    public Boolean loginWithCoinbaseIsDisplayed()
    {
        return utils.isDisplayed(loginWithCoinbase);
    }

    public void clickOnLoginWithCoinbase()
    {
        utils.clickOnElement(loginWithCoinbase);
    }

    public void typeTotalCostCoinbase(String totalCost)
    {
        utils.sendKeys(totalCostFieldCoinbase, totalCost);
    }

    public String getTotalCostCoinbase()
    {
        return utils.getText(totalCostFieldCoinbase);
    }

    public void clearTotalCostCoinbase()
    {
        utils.clear(totalCostFieldCoinbase);
    }


    // Exchange CSV

    public String getPortfolioNameCSV()
    {
        return utils.getText(portfolioNameFieldCSV);
    }

    public void typeConnectionNameCSV(String connectionName)
    {
        utils.sendKeys(connectionNameFieldCSV, connectionName);
    }

    public String getConnectionNameCSV()
    {
        return utils.getText(connectionNameFieldCSV);
    }

    public void clearConnectionNameCSV()
    {
        utils.clear(connectionNameFieldCSV);
    }

    public void typeTotalCostCSV(String totalCost)
    {
        utils.sendKeys(totalCostFieldCSV, totalCost);
    }

    public String getTotalCostCSV()
    {
        return utils.getText(totalCostFieldCSV);
    }

    public void clearTotalCostCSV()
    {
        utils.clear(totalCostFieldCSV);
    }

    public void clickOnAddAnotherCSV()
    {
        utils.clickOnElement(addAnotherCSV);
    }

    public void typePathToAnotherCSV(String path)
    {
        utils.sendKeys(addAnotherCSV, path);
    }

    public String getErrorMessageCSV()
    {
        return utils.getText(errorMessageCSV);
    }


    // Wallet

    public void typeWalletAddress(String walletAddress)
    {
        utils.sendKeys(walletAddressField, walletAddress);
    }

    public String getWalletAddress()
    {
        return utils.getText(walletAddressField);
    }

    public void clearWalletAddress()
    {
        utils.clear(walletAddressField);
    }

    public void clickOnCalculateAmountOnTotalWallet()
    {
        utils.clickOnElement(calculateAmountOnTotalWallet);
    }

    public Boolean calculateAmountOnTotalWalletIsEnabled()
    {
        return utils.isEnabled(calculateAmountOnTotalWallet);
    }

    public Boolean calculateAmountOnTotalWalletIsSelected()
    {
        return utils.isSelected(calculateAmountOnTotalWallet);
    }

    public void typeTotalCostWallet(String totalCost)
    {
        utils.sendKeys(totalCostFieldWallet, totalCost);
    }

    public String getTotalCostWallet()
    {
        return utils.getText(totalCostFieldWallet);
    }

    public void clearTotalCostWallet()
    {
        utils.clear(totalCostFieldWallet);
    }


    // Multi-Coins Wallet

    public void typeConnectionNameMultiWallet(String multiWalletName)
    {
        utils.sendKeys(connectionNameFieldMultiWallet, multiWalletName);
    }

    public String getConnectionNameMultiWallet()
    {
        return utils.getText(connectionNameFieldMultiWallet);
    }

    public void clearConnectionNameMultiWallet()
    {
        utils.clear(connectionNameFieldMultiWallet);
    }

    public void clickOnCalculateAmountOnTotalMultiWallet()
    {
        utils.clickOnElement(calculateAmountOnTotalMultiWallet);
    }

    public Boolean calculateAmountOnTotalMultiWalletIsEnabled()
    {
        return utils.isEnabled(calculateAmountOnTotalMultiWallet);
    }

    public Boolean calculateAmountOnTotalMultiWalletIsSelected()
    {
        return utils.isSelected(calculateAmountOnTotalMultiWallet);
    }

    public void typeTotalCostMultiWallet(String totalCost)
    {
        utils.sendKeys(totalCostFieldMultiWallet, totalCost);
    }

    public String getTotalCostMultiWallet()
    {
        return utils.getText(totalCostFieldMultiWallet);
    }

    public void clearTotalCostMultiWallet()
    {
        utils.clear(totalCostFieldMultiWallet);
    }

    public void clickOnConnectNewWalletMulti()
    {
        utils.clickOnElement(connectNewWalletMultiWallet);
    }


    // Sub wallet

    public void typeConnectionNameSubWallet(String subWalletName)
    {
        utils.sendKeys(connectionNameFieldSubWallet, subWalletName);
    }

    public String getConnectionNameSubWallet()
    {
        return utils.getText(connectionNameFieldSubWallet);
    }

    public void clearConnectionNameSubWallet()
    {
        utils.clear(connectionNameFieldSubWallet);
    }

    public String getSubWalletName()
    {
        return utils.getText(walletNameFieldSubWallet);
    }

    public void typeSubWalletAddress(String subWalletAddress)
    {
        utils.sendKeys(walletAddressFieldSubWallet, subWalletAddress);
    }

    public String getSubWalletAddress()
    {
        return utils.getText(walletAddressFieldSubWallet);
    }

    public void clearSubWalletAddress()
    {
        utils.clear(walletAddressFieldSubWallet);
    }

}
