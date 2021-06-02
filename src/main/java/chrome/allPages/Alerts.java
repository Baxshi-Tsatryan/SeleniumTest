package chrome.allPages;

import chrome.mainPackage.Driver;
import chrome.mainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alerts extends Driver {
    WebDriver driver;
    SeleniumUtils utils;

    public Alerts(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    // Auto

    By priceNotificationsSwitcher = By.cssSelector("div.alerts-grid > .alerts-container > div:nth-of-type(3) i");

    By priceNotificationsLow = By.cssSelector("div.table-row-auto > button:nth-of-type(1)");

    By priceNotificationsMedium = By.cssSelector("div.table-row-auto > button:nth-of-type(2)");

    By priceNotificationsHigh = By.cssSelector("div.table-row-auto > button:nth-of-type(3)");


    By breakingNewsNotificationsSwitcher = By.cssSelector("div.alerts-grid div:nth-of-type(4) div:nth-of-type(1) i");

    By newPairNotificationsSwitcher = By.cssSelector("div.alerts-grid div:nth-of-type(2) i");

    By pumpNotificationsSwitcher = By.cssSelector("div.alerts-grid .alerts-row > div:nth-of-type(3) i");

    By teamUpdateNotificationsSwitcher = By.cssSelector("div.alerts-grid .alerts-section div:nth-of-type(4) i");

    By portfolioValueNotificationSwitcher = By.cssSelector("div.alerts-grid div:nth-of-type(5) i");

    By portfolioValueNotificationCurrentTime = By.cssSelector("#__next > main > div > div > div:nth-child(1) > div:nth-child(5) > div.date-time-section > div > div > div > div > input[type=text]");

    By learnMoreButton = By.cssSelector("a.description");


    // Custom

    By priceLimit = By.cssSelector("div.buttons-container > button:nth-of-type(1)");

    By marketCap = By.cssSelector("div.buttons-container > button:nth-of-type(2)");

    By volume = By.cssSelector("div.buttons-container > button:nth-of-type(3)");


    // Modals

    By currentCoin = By.cssSelector("div.alerts-modal-container > div:nth-of-type(1) .search-dropdown-enable-placeholder");

    By clearCurrentCoinIcon = By.cssSelector(".icon-clear");

    By coinField = By.cssSelector(".jsx-931209423[placeholder='Search']");

    By firstCoinResult = By.cssSelector("ul.jsx-931209423 > li:nth-of-type(1) .coin-item-wrapper > .table-row");

    By pairFieldPriceLimit = By.cssSelector("[placeholder='Please select exchange-pair']");

    By currentPairPriceLimit = By.cssSelector("div.alerts-modal-container > div:nth-of-type(2) .search-dropdown-enable-placeholder");

    By currentCondition = By.cssSelector("div.alerts-modal-container > .row-section > div:nth-of-type(1) .table-row");

    By conditionDropDown = By.cssSelector("div.alerts-modal-container div:nth-of-type(1) > .dropdown-section > .jsx-1751315535 > .jsx-1751315535");

    By moreThanCondition = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By lessThanCondition = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By increasedByCondition = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(3) .table-row");

    By decreasedByCondition = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(4) .table-row");

    By changedByCondition = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(5) .table-row");

    By currentAlertFrequency = By.cssSelector("div.alerts-modal-container div:nth-of-type(2) .table-row");

    By alertFrequencyDropDown = By.cssSelector("div.alerts-modal-container div:nth-of-type(2) > .dropdown-section > .jsx-1751315535 > .jsx-1751315535");

    By time1AlertFrequency = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By persistentAlertFrequency = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By priceField = By.cssSelector("input[type='number']");

    By currentPriceCurrency = By.cssSelector(".input-right-sign");

    By notes = By.cssSelector("[placeholder='Type Something...']");

    By save = By.cssSelector(".primary");

    By cancel = By.cssSelector("div.alerts-modal-container .secondary");


    // Last alert

    By lastCoinName = By.cssSelector("tbody > tr:nth-of-type(1) .pair-price > .table-row");

    By lastTotalMarketCapType = By.cssSelector("tbody > tr:nth-of-type(3) > .left > .table-value .table-row");

    By lastCoinSymbol = By.cssSelector("tbody > tr:nth-of-type(1) .additional-label > .table-row");

    By lastPriceLimitExchange = By.cssSelector("tbody > tr:nth-of-type(1) > .left .table-row-secondary");

    By lastVolume24hTextVolume = By.cssSelector("tbody > tr:nth-of-type(1) > .left .table-row-secondary");

    By lastPriceOrPercent = By.cssSelector("tbody > tr:nth-of-type(1) > .right > .table-value .table-row");

    By lastCondition = By.cssSelector("tbody > tr:nth-of-type(1) > .right .table-row-secondary");

    By lastFrequency = By.cssSelector("tbody > tr:nth-of-type(1) > .center > .table-value .table-row");

    By lastNotes = By.cssSelector("tbody > tr:nth-of-type(2) .note-text");

    By last3DotButton = By.cssSelector("tbody > tr:nth-of-type(1) .jsx-3397508174 > .jsx-3397508174 > .jsx-3397508174");

    By deleteCustomAlertIn3Dot = By.cssSelector("div.more-menu-item > .table-row");


    // ---------------------------------------------------- Methods ------------------------------------------------------------

    // Auto

    public Alerts clickOnPriceNotificationsSwitcher() {
        utils.click(priceNotificationsSwitcher);
        return this;
    }

    public boolean priceNotificationsSwitcherIsEnabled() {
        return utils.isEnabled(priceNotificationsSwitcher);
    }

    public boolean priceNotificationsSwitcherIsSelected() {
        return utils.isSelected(priceNotificationsSwitcher);
    }

    public Alerts clickOnPriceNotificationsLow() {
        utils.click(priceNotificationsLow);
        return this;
    }

    public Alerts clickOnPriceNotificationsMedium() {
        utils.click(priceNotificationsMedium);
        return this;
    }

    public Alerts clickOnPriceNotificationsHigh() {
        utils.click(priceNotificationsHigh);
        return this;
    }

    public Alerts clickOnBreakingNewsNotificationsSwitcher() {
        utils.click(breakingNewsNotificationsSwitcher);
        return this;
    }

    public boolean breakingNewsNotificationsSwitcherIsEnabled() {
        return utils.isEnabled(breakingNewsNotificationsSwitcher);
    }

    public boolean breakingNewsNotificationsSwitcherIsSelected() {
        return utils.isSelected(breakingNewsNotificationsSwitcher);
    }

    public Alerts clickOnNewPairNotificationsSwitcher() {
        utils.click(newPairNotificationsSwitcher);
        return this;
    }

    public boolean newPairNotificationsSwitcherIsEnabled() {
        return utils.isEnabled(newPairNotificationsSwitcher);
    }

    public boolean newPairNotificationsSwitcherIsSelected() {
        return utils.isSelected(newPairNotificationsSwitcher);
    }

    public Alerts clickOnPumpNotificationsSwitcher() {
        utils.click(pumpNotificationsSwitcher);
        return this;
    }

    public boolean pumpNotificationsSwitcherIsEnabled() {
        return utils.isEnabled(pumpNotificationsSwitcher);
    }

    public boolean pumpNotificationsSwitcherIsSelected() {
        return utils.isSelected(pumpNotificationsSwitcher);
    }

    public Alerts clickOnTeamUpdateNotificationsSwitcher() {
        utils.click(teamUpdateNotificationsSwitcher);
        return this;
    }

    public boolean teamUpdateNotificationsSwitcherIsEnabled() {
        return utils.isEnabled(teamUpdateNotificationsSwitcher);
    }

    public boolean teamUpdateNotificationsSwitcherIsSelected() {
        return utils.isSelected(teamUpdateNotificationsSwitcher);
    }

    public Alerts clickOnPortfolioValueNotificationSwitcher() {
        utils.click(portfolioValueNotificationSwitcher);
        return this;
    }

    public boolean portfolioValueNotificationSwitcherIsEnabled() {
        return utils.isEnabled(portfolioValueNotificationSwitcher);
    }

    public boolean portfolioValueNotificationSwitcherIsSelected() {
        return utils.isSelected(portfolioValueNotificationSwitcher);
    }

    public String getCurrentPortfolioValueNotificationTime() {
        return utils.getText(portfolioValueNotificationCurrentTime);
    }

    public Alerts typePortfolioValueNotificationTime(String time) {
        utils.sendKeys(portfolioValueNotificationCurrentTime, time);
        return this;
    }

    public Alerts clearPortfolioValueNotificationTime() {
        utils.clear(portfolioValueNotificationCurrentTime);
        return this;
    }

    public Alerts clickOnPortfolioValueNotificationTime() {
        utils.click(portfolioValueNotificationCurrentTime);
        return this;
    }

    public Alerts clickOnLearnMore() {
        utils.click(learnMoreButton);
        return this;
    }


    // Custom

    public Alerts clickOnPriceLimit() {
        utils.click(priceLimit);
        return this;
    }

    public Alerts clickOnMarketCap() {
        utils.click(marketCap);
        return this;
    }

    public Alerts clickOnVolume() {
        utils.click(volume);
        return this;
    }


    // Modal

    public String getCurrentCoin() {
        return utils.getText(currentCoin);
    }

    public Alerts clickOnCoinField() {
        utils.click(currentCoin);
        return this;
    }

    public Alerts clickOnClearCurrentCoinIcon() {
        utils.click(clearCurrentCoinIcon);
        return this;
    }

    public Alerts typeCoinName(String coinName) {
        utils.sendKeys(coinField, coinName);
        return this;
    }

    public Alerts clearCoinName() {
        utils.clear(coinField);
        return this;
    }

    public Alerts clickOnFirstCoinResult() {
        utils.click(firstCoinResult);
        return this;
    }

    public Alerts clickOnPriceLimitPairField() {
        utils.click(pairFieldPriceLimit);
        return this;
    }

    public Alerts typePriceLimitPair(String pair) {
        utils.sendKeys(pairFieldPriceLimit, pair);
        return this;
    }

    public String getCurrentPriceLimitPair() {
        return utils.getText(currentPairPriceLimit);
    }

    public Alerts clearPriceLimitPair() {
        utils.clear(pairFieldPriceLimit);
        return this;
    }

    public String getCurrentCondition() {
        return utils.getText(currentCondition);
    }

    public Alerts clickOnConditionDropDown() {
        utils.click(conditionDropDown);
        return this;
    }

    public Alerts clickOnConditionMoreThan() {
        utils.click(moreThanCondition);
        return this;
    }

    public Alerts clickOnConditionLessThan() {
        utils.click(lessThanCondition);
        return this;
    }

    public Alerts clickOnConditionIncreasedBy() {
        utils.click(increasedByCondition);
        return this;
    }

    public Alerts clickOnConditionDecreasedBy() {
        utils.click(decreasedByCondition);
        return this;
    }

    public Alerts clickOnConditionChangedBy() {
        utils.click(changedByCondition);
        return this;
    }

    public String getCurrentAlertFrequency() {
        return utils.getText(currentAlertFrequency);
    }

    public Alerts clickOnAlertFrequencyDropDown() {
        utils.click(alertFrequencyDropDown);
        return this;
    }

    public Alerts clickOnAlertFrequency1Time() {
        utils.click(time1AlertFrequency);
        return this;
    }

    public Alerts clickOnAlertFrequencyPersistent() {
        utils.click(persistentAlertFrequency);
        return this;
    }

    public String getCurrentPrice() {
        return utils.getText(priceField);
    }

    public Alerts typePrice(String price) {
        utils.sendKeys(priceField, price);
        return this;
    }

    public Alerts clearPrice() {
        utils.clear(priceField);
        return this;
    }

    public String getCurrentPriceCurrency() {
        return utils.getText(currentPriceCurrency);
    }

    public Alerts typeNote(String note) {
        utils.sendKeys(notes, note);
        return this;
    }

    public Alerts clearNotes() {
        utils.clear(notes);
        return this;
    }

    public Alerts clickOnSave() {
        utils.click(save);
        return this;
    }

    public Alerts clickOnCancel() {
        utils.click(cancel);
        return this;
    }


    // Last alert

    public boolean lastCoinNameIsDisplayed() {
        return utils.isDisplayed(lastCoinName);
    }

    public String getLastCoinName() {
        return utils.getText(lastCoinName);
    }

    public boolean lastCoinSymbolIsDisplayed() {
        return utils.isDisplayed(lastCoinSymbol);
    }

    public String getLastCoinSymbol() {
        return utils.getText(lastCoinSymbol);
    }

    public boolean lastTotalMarketCapTextIsDisplayed() {
        return utils.isDisplayed(lastTotalMarketCapType);
    }

    public String getLastAlertExchange() {
        return utils.getText(lastPriceLimitExchange);
    }

    public String getLastAlertPriceOrPercent() {
        return utils.getText(lastPriceOrPercent);
    }

    public String getLastCondition() {
        return utils.getText(lastCondition);
    }

    public String getLastFrequency() {
        return utils.getText(lastFrequency);
    }

    public Alerts clickOnLastAlert3Dot() {
        utils.click(last3DotButton);
        return this;
    }

    public Alerts clickOnDeleteIn3Dot() {
        utils.click(deleteCustomAlertIn3Dot);
        return this;
    }

    public boolean lastNoteIsDisplayed() {
        return utils.isDisplayed(lastNotes);
    }

    public String getLastNote() {
        return utils.getText(lastNotes);
    }
}
