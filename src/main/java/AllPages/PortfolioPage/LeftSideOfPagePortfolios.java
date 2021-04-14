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

    By secondPortfolioName = By.cssSelector("ul#portfolio-list > li:nth-of-type(3) .jsx-544775375");

    By secondPortfolioDelete = By.cssSelector("ul#portfolio-list > li:nth-of-type(3) .icon-delete");

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

    public LeftSideOfPagePortfolios searchPortfoliosOrCoins(String portfoliosOrCoins) {
        utils.sendKeysAction(searchPortfoliosOrCoins, portfoliosOrCoins);
        return this;
    }

    public String getSearchPortfoliosOrCoinsName() {
        return utils.getText(searchPortfoliosOrCoins);
    }

    public LeftSideOfPagePortfolios clearPortfoliosOrCoinsName() {
        utils.clear(searchPortfoliosOrCoins);
        return this;
    }

    public LeftSideOfPagePortfolios clickOnA_ZFilter() {
        utils.click(filterA_Z);
        return this;
    }

    public Boolean filterA_ZIsEnabled() {
        return utils.isEnabled(filterA_Z);
    }

    public Boolean filterA_ZIsSelected() {
        return utils.isSelected(filterA_Z);
    }

    public LeftSideOfPagePortfolios clickOnAllAssets() {
        utils.click(allAssets);
        return this;
    }

    public boolean firstPortfolioIsDisplayed() {
        boolean firstPortfolioIsDisplayed = utils.isDisplayed(firstPortfolioName);

        return firstPortfolioIsDisplayed;
    }

    public String getSecondPortfolioName() {
        String secondPortfolioName2 = utils.getText(secondPortfolioName);

        return secondPortfolioName2;
    }

    public LeftSideOfPagePortfolios moveToFirstPortfolioName() {
        utils.moveToElement(firstPortfolioName);
        return this;
    }

    public LeftSideOfPagePortfolios clickOnFirstPortfolioDelete() {
        utils.click(firstPortfolioDelete);
        return this;
    }

    public LeftSideOfPagePortfolios clickOnFirstPortfolioDeleteWithMove() {
        utils.moveToElement(firstPortfolioName);
        utils.click(firstPortfolioDelete);
        return this;
    }

    public LeftSideOfPagePortfolios moveToSecondPortfolioName() {
        utils.moveToElement(secondPortfolioName);
        return this;
    }

    public LeftSideOfPagePortfolios clickOnSecondPortfolioDelete() {
        utils.click(secondPortfolioDelete);
        return this;
    }

    public LeftSideOfPagePortfolios clickOnSecondPortfolioDeleteWithMove() {
        utils.moveToElement(secondPortfolioName);
        utils.click(secondPortfolioDelete);
        return this;
    }

    public LeftSideOfPagePortfolios clickOnSettings() {
        utils.click(portfolioSettings);
        return this;
    }

    public LeftSideOfPagePortfolios clickOnLinkSharing() {
        utils.click(linkSharing);
        return this;
    }

    public LeftSideOfPagePortfolios clickOnManagePortfolios() {
        utils.click(managePortfolios);
        return this;
    }


    // Settings

    public LeftSideOfPagePortfolios clickOnPercentHoldings() {
        utils.click(percentHoldings);
        return this;
    }

    public Boolean percentageHoldingsIsEnabled() {
        return utils.isEnabled(percentHoldings);
    }

    public Boolean percentageHoldingsIsSelected() {
        return utils.isSelected(percentHoldings);
    }

    public LeftSideOfPagePortfolios clickOnHideSmallBalances() {
        utils.click(hideSmallBalances);
        return this;
    }

    public Boolean hideSmallBalancesIsEnabled() {
        return utils.isEnabled(hideSmallBalances);
    }

    public Boolean hideSmallBalancesIsSelected() {
        return utils.isSelected(hideSmallBalances);
    }

    public LeftSideOfPagePortfolios clickOnHideUnidentifiedBalances() {
        utils.click(hideUnidentifiedBalances);
        return this;
    }

    public Boolean hideUnidentifiedBalancesIsEnabled() {
        return utils.isEnabled(hideUnidentifiedBalances);
    }

    public Boolean hideUnidentifiedBalancesIsSelected() {
        return utils.isSelected(hideUnidentifiedBalances);
    }

    public LeftSideOfPagePortfolios clickOnCoinBlacklist() {
        utils.click(coinBlacklist);
        return this;
    }

    // Blacklist

    public LeftSideOfPagePortfolios typeCoinNameBlackList(String coinName) {
        utils.sendKeysAction(searchCoinsBlacklist, coinName);
        return this;
    }

    public String getCoinNameBlacklist() {
        return utils.getText(searchCoinsBlacklist);
    }

    public LeftSideOfPagePortfolios clearCoinNameBlacklist() {
        utils.clear(searchCoinsBlacklist);
        return this;
    }

    public LeftSideOfPagePortfolios clickOnNameRankBlacklist() {
        utils.click(rankNameBlacklist);
        return this;
    }


    // Manage Portfolios

    public LeftSideOfPagePortfolios clickOnBackToALlAssets() {
        utils.click(backToAllAssets);
        return this;
    }

    public LeftSideOfPagePortfolios clickOnAddPortfolioInManagePortfolio() {
        utils.click(addPortfolioInManagePortfolios);
        return this;
    }

    // Delete window

    public LeftSideOfPagePortfolios clickOnCancelInDelete() {
        utils.click(cancelButtonInDelete);
        return this;
    }

    public LeftSideOfPagePortfolios clickOnDeleteInDelete() {
        utils.click(deleteButtonInDelete);
        return this;
    }

    public LeftSideOfPagePortfolios clickOnOkGotItInManagePortfolioNewPopOp() {
        utils.click(managePortfoliosNewPopOp);
        return this;
    }

    // API window

    public String getPortfolioNameInAPIKey() {
        return utils.getText(myPortfolioNameInAPIKeyWindow);
    }

    public String getPortfolioAPIKey() {
        return utils.getText(myPortfolioAPIKey);
    }

    public String getPortfolioAPISecret() {
        return utils.getText(myPortfolioAPISecret);
    }


}
