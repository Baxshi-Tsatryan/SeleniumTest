package AllPages.PortfolioPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeftSideOfPagePortfolios {

    WebDriver driver;
    SeleniumUtils utils;

    public LeftSideOfPagePortfolios(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    // General

    By searchPortfoliosOrCoins = By.cssSelector("div.search-order-container [name]");

    By filterA_Z = By.cssSelector("[alt='portfolio-ordering']");

    By allAssets = By.cssSelector("li#totalPortfolio .jsx-544775375");

    By firstPortfolioName = By.cssSelector("ul#portfolio-list > li:nth-of-type(2) .jsx-544775375");

    By firstPortfolioDelete = By.cssSelector("ul#portfolio-list > li:nth-of-type(2) .icon-delete");

    By portfolioSettings = By.cssSelector(".icon-settings");

    By linkSharing = By.cssSelector(".icon-link");

    By managePortfolios = By.cssSelector(".text");


    // Settings

    By percentHoldings = By.cssSelector("div.toggles-section > div:nth-of-type(1) i");

    By hideSmallBalances = By.cssSelector("div.toggles-section > div:nth-of-type(2) i");

    By hideUnidentifiedBalances = By.cssSelector("div.toggles-section > div:nth-of-type(3) i");

    By coinBlacklist = By.cssSelector(".blacklist-link");


    // Blacklist

    By searchCoinsBlacklist = By.cssSelector("input.jsx-931209423");

    By rankNameBlacklist = By.cssSelector("table.blacklist-table th:nth-of-type(2) > .table-column-title");


    // Manage Portfolio

    By managePortfoliosNewPopOp = By.cssSelector(".bottom-section.jsx-360535486 > .jsx-1426819953");

    By backToAllAssets = By.cssSelector(".tab-label");


    // API Key window

    By myPortfolioNameInAPIKeyWindow = By.cssSelector(".title");

    By myPortfolioAPIKey = By.cssSelector("div.api-key-modal-content > div:nth-of-type(1) > .jsx-1485860805");

    By myPortfolioAPISecret = By.cssSelector("div.api-key-modal-content > div:nth-of-type(2) > .jsx-1485860805");

    // Delete window

    By deleteButtonInDelete = By.cssSelector("div.buttons-container > .primary");

    By cancelButtonInDelete = By.cssSelector(".secondary");


    By addPortfolioInManagePortfolios = By.cssSelector("div.add-button-block > .jsx-1426819953");



    // ------------------------------------------------- Methods --------------------------------------------------


    // General

    public void searchPortfoliosOrCoins(String portfoliosOrCoins)
    {
        utils.sendKeys(searchPortfoliosOrCoins, portfoliosOrCoins);
    }

    public String getSearchPortfoliosOrCoinsName()
    {
        return utils.getText(searchPortfoliosOrCoins);
    }

    public void clearPortfoliosOrCoinsName()
    {
        utils.clear(searchPortfoliosOrCoins);
    }

    public void clickOnA_ZFilter()
    {
        utils.clickOnElement(filterA_Z);
    }

    public Boolean filterA_ZIsEnabled()
    {
        return utils.isEnabled(filterA_Z);
    }

    public Boolean filterA_ZIsSelected()
    {
        return utils.isSelected(filterA_Z);
    }

    public void clickOnAllAssets()
    {
        utils.clickOnElement(allAssets);
    }

    public boolean firstPortfolioIsDisplayed()
    {
        boolean firstPortfolioIsDisplayed = utils.isDisplayed(firstPortfolioName);

        return firstPortfolioIsDisplayed;
    }

    public void moveToFirstPortfolioName()
    {
        utils.moveToElement(firstPortfolioName);
    }

    public void clickOnFirstPortfolioDelete()
    {
        utils.clickOnElement(firstPortfolioDelete);
    }

    public void clickOnFirstPortfolioDeleteWithMove()
    {
        utils.moveToElement(firstPortfolioName);
        utils.clickOnElement(firstPortfolioDelete);
    }

    public void clickOnSettings()
    {
        utils.clickOnElement(portfolioSettings);
    }

    public void clickOnLinkSharing()
    {
        utils.clickOnElement(linkSharing);
    }

    public void clickOnManagePortfolios()
    {
        utils.clickOnElement(managePortfolios);
    }


    // Settings

    public void clickOnPercentHoldings()
    {
        utils.clickOnElement(percentHoldings);
    }

    public Boolean percentageHoldingsIsEnabled()
    {
        return utils.isEnabled(percentHoldings);
    }

    public Boolean percentageHoldingsIsSelected()
    {
        return utils.isSelected(percentHoldings);
    }

    public void clickOnHideSmallBalances()
    {
        utils.clickOnElement(hideSmallBalances);
    }

    public Boolean hideSmallBalancesIsEnabled()
    {
        return utils.isEnabled(hideSmallBalances);
    }

    public Boolean hideSmallBalancesIsSelected()
    {
        return utils.isSelected(hideSmallBalances);
    }

    public void clickOnHideUnidentifiedBalances()
    {
        utils.clickOnElement(hideUnidentifiedBalances);
    }

    public Boolean hideUnidentifiedBalancesIsEnabled()
    {
        return utils.isEnabled(hideUnidentifiedBalances);
    }

    public Boolean hideUnidentifiedBalancesIsSelected()
    {
        return utils.isSelected(hideUnidentifiedBalances);
    }

    public void clickOnCoinBlacklist()
    {
        utils.clickOnElement(coinBlacklist);
    }

    // Blacklist

    public void typeCoinNameBlackList(String coinName)
    {
        utils.sendKeys(searchCoinsBlacklist, coinName);
    }

    public String getCoinNameBlacklist()
    {
        return utils.getText(searchCoinsBlacklist);
    }

    public void clearCoinNameBlacklist()
    {
        utils.clear(searchCoinsBlacklist);
    }

    public void clickOnNameRankBlacklist()
    {
        utils.clickOnElement(rankNameBlacklist);
    }


    // Manage Portfolios

    public void clickOnBackToALlAssets()
    {
        utils.clickOnElement(backToAllAssets);
    }

    public void clickOnAddPortfolioInManagePortfolio()
    {
        utils.clickOnElement(addPortfolioInManagePortfolios);
    }

    // Delete window

    public void clickOnCancelInDelete()
    {
        utils.clickOnElement(cancelButtonInDelete);
    }

    public void clickOnDeleteInDelete()
    {
        utils.clickOnElement(deleteButtonInDelete);
    }

    public void clickOnOkGotItInManagePortfolioNewPopOp()
    {
        utils.clickOnElement(managePortfoliosNewPopOp);
    }

    // API window

    public String getPortfolioNameInAPIKey()
    {
        return utils.getText(myPortfolioNameInAPIKeyWindow);
    }

    public String getPortfolioAPIKey()
    {
        return utils.getText(myPortfolioAPIKey);
    }

    public String getPortfolioAPISecret()
    {
        return utils.getText(myPortfolioAPISecret);
    }



}
