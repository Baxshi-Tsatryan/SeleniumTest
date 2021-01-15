package AllPages;

import MainPackage.Driver;
import MainPackage.SeleniumUtils;
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

    public void clickOnPriceNotificationsSwitcher()
    {
        utils.clickOnElement(priceNotificationsSwitcher);
    }

    public boolean priceNotificationsSwitcherIsEnabled()
    {
        return utils.isEnabled(priceNotificationsSwitcher);
    }

    public boolean priceNotificationsSwitcherIsSelected()
    {
        return utils.isSelected(priceNotificationsSwitcher);
    }

    public void clickOnPriceNotificationsLow()
    {
        utils.clickOnElement(priceNotificationsLow);
    }

    public void clickOnPriceNotificationsMedium()
    {
        utils.clickOnElement(priceNotificationsMedium);
    }

    public void clickOnPriceNotificationsHigh()
    {
        utils.clickOnElement(priceNotificationsHigh);
    }

    public void clickOnBreakingNewsNotificationsSwitcher()
    {
        utils.clickOnElement(breakingNewsNotificationsSwitcher);
    }

    public boolean breakingNewsNotificationsSwitcherIsEnabled()
    {
        return utils.isEnabled(breakingNewsNotificationsSwitcher);
    }

    public boolean breakingNewsNotificationsSwitcherIsSelected()
    {
        return utils.isSelected(breakingNewsNotificationsSwitcher);
    }

    public void clickOnNewPairNotificationsSwitcher()
    {
        utils.clickOnElement(newPairNotificationsSwitcher);
    }

    public boolean newPairNotificationsSwitcherIsEnabled()
    {
        return utils.isEnabled(newPairNotificationsSwitcher);
    }

    public boolean newPairNotificationsSwitcherIsSelected()
    {
        return utils.isSelected(newPairNotificationsSwitcher);
    }

    public void clickOnPumpNotificationsSwitcher()
    {
        utils.clickOnElement(pumpNotificationsSwitcher);
    }

    public boolean pumpNotificationsSwitcherIsEnabled()
    {
        return utils.isEnabled(pumpNotificationsSwitcher);
    }

    public boolean pumpNotificationsSwitcherIsSelected()
    {
        return utils.isSelected(pumpNotificationsSwitcher);
    }

    public void clickOnTeamUpdateNotificationsSwitcher()
    {
        utils.clickOnElement(teamUpdateNotificationsSwitcher);
    }

    public boolean teamUpdateNotificationsSwitcherIsEnabled()
    {
        return utils.isEnabled(teamUpdateNotificationsSwitcher);
    }

    public boolean teamUpdateNotificationsSwitcherIsSelected()
    {
        return utils.isSelected(teamUpdateNotificationsSwitcher);
    }

    public void clickOnPortfolioValueNotificationSwitcher()
    {
        utils.clickOnElement(portfolioValueNotificationSwitcher);
    }

    public boolean portfolioValueNotificationSwitcherIsEnabled()
    {
        return utils.isEnabled(portfolioValueNotificationSwitcher);
    }

    public boolean portfolioValueNotificationSwitcherIsSelected()
    {
        return utils.isSelected(portfolioValueNotificationSwitcher);
    }

    public String getCurrentPortfolioValueNotificationTime()
    {
        return utils.getText(portfolioValueNotificationCurrentTime);
    }

    public void typePortfolioValueNotificationTime(String time)
    {
        utils.sendKeys(portfolioValueNotificationCurrentTime, time);
    }

    public void clearPortfolioValueNotificationTime()
    {
        utils.clear(portfolioValueNotificationCurrentTime);
    }

    public void clickOnPortfolioValueNotificationTime()
    {
        utils.clickOnElement(portfolioValueNotificationCurrentTime);
    }

    public void clickOnLearnMore()
    {
        utils.clickOnElement(learnMoreButton);
    }


    // Custom

    public void clickOnPriceLimit()
    {
        utils.clickOnElement(priceLimit);
    }

    public void clickOnMarketCap()
    {
        utils.clickOnElement(marketCap);
    }

    public void clickOnVolume()
    {
        utils.clickOnElement(volume);
    }


    // Modal

    public String getCurrentCoin()
    {
        return utils.getText(currentCoin);
    }

    public void clickOnCoinField()
    {
        utils.clickOnElement(currentCoin);
    }

    public void clickOnClearCurrentCoinIcon()
    {
        utils.clickOnElement(clearCurrentCoinIcon);
    }

    public void typeCoinName(String coinName)
    {
        utils.sendKeys(coinField, coinName);
    }

    public void clearCoinName()
    {
        utils.clear(coinField);
    }

    public void clickOnFirstCoinResult()
    {
        utils.clickOnElement(firstCoinResult);
    }

    public void clickOnPriceLimitPairField()
    {
        utils.clickOnElement(pairFieldPriceLimit);
    }

    public void typePriceLimitPair(String pair)
    {
        utils.sendKeys(pairFieldPriceLimit, pair);
    }

    public String getCurrentPriceLimitPair()
    {
        return utils.getText(currentPairPriceLimit);
    }

    public void clearPriceLimitPair()
    {
        utils.clear(pairFieldPriceLimit);
    }

    public String getCurrentCondition()
    {
        return utils.getText(currentCondition);
    }

    public void clickOnConditionDropDown()
    {
        utils.clickOnElement(conditionDropDown);
    }

    public void clickOnConditionMoreThan()
    {
        utils.clickOnElement(moreThanCondition);
    }

    public void clickOnConditionLessThan()
    {
        utils.clickOnElement(lessThanCondition);
    }

    public void clickOnConditionIncreasedBy()
    {
        utils.clickOnElement(increasedByCondition);
    }

    public void clickOnConditionDecreasedBy()
    {
        utils.clickOnElement(decreasedByCondition);
    }

    public void clickOnConditionChangedBy()
    {
        utils.clickOnElement(changedByCondition);
    }

    public String getCurrentAlertFrequency()
    {
        return utils.getText(currentAlertFrequency);
    }

    public void clickOnAlertFrequencyDropDown()
    {
        utils.clickOnElement(alertFrequencyDropDown);
    }

    public void clickOnAlertFrequency1Time()
    {
        utils.clickOnElement(time1AlertFrequency);
    }

    public void clickOnAlertFrequencyPersistent()
    {
        utils.clickOnElement(persistentAlertFrequency);
    }

    public String getCurrentPrice()
    {
        return utils.getText(priceField);
    }

    public void typePrice(String price)
    {
        utils.sendKeys(priceField, price);
    }

    public void clearPrice()
    {
        utils.clear(priceField);
    }

    public String getCurrentPriceCurrency()
    {
        return utils.getText(currentPriceCurrency);
    }

    public void typeNote(String note)
    {
        utils.sendKeys(notes, note);
    }

    public void clearNotes()
    {
        utils.clear(notes);
    }

    public void clickOnSave()
    {
        utils.clickOnElement(save);
    }

    public void clickOnCancel()
    {
        utils.clickOnElement(cancel);
    }


    // Last alert

    public boolean lastCoinNameIsDisplayed()
    {
        return utils.isDisplayed(lastCoinName);
    }

    public String getLastCoinName()
    {
        return utils.getText(lastCoinName);
    }

    public boolean lastCoinSymbolIsDisplayed()
    {
        return utils.isDisplayed(lastCoinSymbol);
    }

    public String getLastCoinSymbol()
    {
        return utils.getText(lastCoinSymbol);
    }

    public boolean lastTotalMarketCapTextIsDisplayed()
    {
        return utils.isDisplayed(lastTotalMarketCapType);
    }

    public String getLastAlertExchange()
    {
        return utils.getText(lastPriceLimitExchange);
    }

    public String getLastAlertPriceOrPercent()
    {
        return utils.getText(lastPriceOrPercent);
    }

    public String getLastCondition()
    {
        return utils.getText(lastCondition);
    }

    public String getLastFrequency()
    {
        return utils.getText(lastFrequency);
    }

    public void clickOnLastAlert3Dot()
    {
        utils.clickOnElement(last3DotButton);
    }

    public void clickOnDeleteIn3Dot()
    {
        utils.clickOnElement(deleteCustomAlertIn3Dot);
    }

    public boolean lastNoteIsDisplayed()
    {
        return utils.isDisplayed(lastNotes);
    }

    public String getLastNote()
    {
        return utils.getText(lastNotes);
    }
}
