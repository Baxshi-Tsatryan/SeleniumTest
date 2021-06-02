package chrome.allPages.widgetsPage;

import chrome.mainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsightWidgets {

    WebDriver driver;
    SeleniumUtils utils;

    public InsightWidgets(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }


    // How many CoinStats users hold BTC?

    // On Widget

    By firstInsightPercent = By.cssSelector("text.highcharts-title > tspan");

    By firstInsightShowChart = By.cssSelector("coin-stats-insight-widget[type='howManyUsersHold'] > div > div > div [target='_blank']");


    // Settings

    By insightTypeDropDown = By.cssSelector("div.second-column > div:nth-of-type(1) > .jsx-1751315535 > .jsx-1751315535");

    By firstInsightType = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By secondInsightType = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By thirdInsightType = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(3) .table-row");

    By forthInsightType = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(4) .table-row");

    By currentCoin = By.cssSelector(".search-dropdown-enable-placeholder");

    By clearCurrentCoin = By.cssSelector(".icon-clear");

    By searchCoinField = By.cssSelector("input.jsx-931209423");

    By themeDropDown = By.cssSelector("div.second-column > div:nth-of-type(3) > .jsx-1751315535 > .jsx-1751315535");

    By darkMode = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By lightMode = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");


    // Colors field

    By backgroundColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(1) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By textColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(1) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By chartPrimaryColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(2) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By chartSecondaryColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(2) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By buttonColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(3) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By widgetBorderColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(3) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");


    // Colors

    By backgroundColor = By.cssSelector("tbody > tr:nth-of-type(1) > td:nth-of-type(1) .widget-color-rectangle");

    By textColor = By.cssSelector("tbody > tr:nth-of-type(1) > td:nth-of-type(2) .widget-color-rectangle");

    By chartPrimaryColor = By.cssSelector("tbody > tr:nth-of-type(2) > td:nth-of-type(1) .widget-color-rectangle");

    By chartSecondaryColor = By.cssSelector("tbody > tr:nth-of-type(2) > td:nth-of-type(2) .widget-color-rectangle");

    By buttonColor = By.cssSelector("tbody > tr:nth-of-type(3) > td:nth-of-type(1) .widget-color-rectangle");

    By widgetBorderColor = By.cssSelector("tbody > tr:nth-of-type(3) > td:nth-of-type(2) .widget-color-rectangle");


    // BTC dominance in CoinStats portfolios

    By secondInsightPercent = By.cssSelector("tspan");

    By secondInsightShowChart = By.cssSelector("coin-stats-insight-widget[type='dominance'] > div > div > div [target='_blank']");


    // Where CoinStats users hold BTC?

    By thirdInsightPercent = By.cssSelector("tspan");

    By thirdInsightWalletPercent = By.cssSelector("coin-stats-insight-widget[type='whereUsersHold'] li:nth-of-type(1) > span");

    By thirdInsightExchangePercent = By.cssSelector("coin-stats-insight-widget[type='whereUsersHold'] li:nth-of-type(2) > span");

    By thirdInsightShowChart = By.cssSelector("coin-stats-insight-widget[type='whereUsersHold'] > div > div > div [target='_blank']");


    // BTC trades today

    By forthInsightPercent = By.cssSelector("tspan");

    By forthInsightBuyPercent = By.cssSelector("coin-stats-insight-widget[type='tradesToday'] li:nth-of-type(1) > span");

    By forthInsightSellPercent = By.cssSelector("coin-stats-insight-widget[type='tradesToday'] li:nth-of-type(2) > span");

    By forthInsightShowChart = By.cssSelector("coin-stats-insight-widget[type='tradesToday'] > div > div > div [target='_blank']");


    // -------------------------------------------------- Methods ------------------------------------------------


    // On Widget

    // How many CoinStats users hold BTC?

    public String getFirstInsightPercent() {
        return utils.getText(firstInsightPercent);
    }

    public InsightWidgets clickOnFirstInsightShowChart() {
        utils.click(firstInsightShowChart);
        return this;
    }


    // BTC dominance in CoinStats portfolios

    public String getSecondInsightPercent() {
        return utils.getText(secondInsightPercent);
    }

    public InsightWidgets clickOnSecondInsightShowChart() {
        utils.click(secondInsightShowChart);
        return this;
    }


    // Where CoinStats users hold BTC?

    public String getThirdInsightPercent() {
        return utils.getText(thirdInsightPercent);
    }

    public String getThirdInsightWalletPercent() {
        return utils.getText(thirdInsightWalletPercent);
    }

    public String getThirdInsightExchangePercent() {
        return utils.getText(thirdInsightExchangePercent);
    }

    public InsightWidgets clickOnThirdInsightShowChart() {
        utils.click(thirdInsightShowChart);
        return this;
    }


    // BTC trades today

    public String getForthInsightPercent() {
        return utils.getText(forthInsightPercent);
    }

    public String getForthInsightBuyPercent() {
        return utils.getText(forthInsightBuyPercent);
    }

    public String getForthInsightSellPercent() {
        return utils.getText(forthInsightSellPercent);
    }

    public InsightWidgets clickOnForthInsightShowChart() {
        utils.click(forthInsightShowChart);
        return this;
    }


    // Settings

    public String getCurrentInsightType() {
        return utils.getText(insightTypeDropDown);
    }

    public InsightWidgets clickOnInsightTypeDropDown() {
        utils.click(insightTypeDropDown);
        return this;
    }

    public InsightWidgets clickOnFirstInsightType() // How many CoinStats users hold BTC?
    {
        utils.click(firstInsightType);
        return this;
    }

    public InsightWidgets clickOnSecondInsightType() // BTC dominance in CoinStats portfolios
    {
        utils.click(secondInsightType);
        return this;
    }

    public InsightWidgets clickOnThirdInsightType() // Where CoinStats users hold BTC?
    {
        utils.click(thirdInsightType);
        return this;
    }

    public InsightWidgets clickOnForthInsightType() // BTC trades today
    {
        utils.click(forthInsightType);
        return this;
    }

    public String getCurrentCoin() {
        return utils.getText(currentCoin);
    }

    public InsightWidgets clickOnClearCurrentCoin() {
        utils.click(clearCurrentCoin);
        return this;
    }

    public InsightWidgets typeCoinName(String coinName) {
        utils.sendKeysAction(searchCoinField, coinName);
        return this;
    }

    public InsightWidgets clearCoinName() {
        utils.clear(searchCoinField);
        return this;
    }

    public String getCoinName() {
        return utils.getText(searchCoinField);
    }

    public String getCurrentTheme() {
        return utils.getText(themeDropDown);
    }

    public InsightWidgets clickOnThemeDropDown() {
        utils.click(themeDropDown);
        return this;
    }

    public InsightWidgets clickOnDarkMode() {
        utils.click(darkMode);
        return this;
    }

    public InsightWidgets clickOnLightMode() {
        utils.click(lightMode);
        return this;
    }


    // Colors field

    public String getBackgroundColorText() {
        return utils.getText(backgroundColorField);
    }

    public InsightWidgets clearBackgroundColorText() {
        utils.clear(backgroundColorField);
        return this;
    }

    public InsightWidgets typeBackgroundColorText(String colorText) {
        utils.sendKeysAction(backgroundColorField, colorText);
        return this;
    }

    public String getTextColorText() {
        return utils.getText(textColorField);
    }

    public InsightWidgets clearTextColorText() {
        utils.clear(textColorField);
        return this;
    }

    public InsightWidgets typeTextColorText(String colorText) {
        utils.sendKeysAction(textColorField, colorText);
        return this;
    }

    public String getChartPrimaryColorText() {
        return utils.getText(chartPrimaryColorField);
    }

    public InsightWidgets clearChartPrimaryColorText() {
        utils.clear(chartPrimaryColorField);
        return this;
    }

    public InsightWidgets typeChartPrimaryColorText(String colorText) {
        utils.sendKeysAction(chartPrimaryColorField, colorText);
        return this;
    }

    public String getChartSecondaryColorText() {
        return utils.getText(chartSecondaryColorField);
    }

    public InsightWidgets clearChartSecondaryColorText() {
        utils.clear(chartSecondaryColorField);
        return this;
    }

    public InsightWidgets typeChartSecondaryColorText(String colorText) {
        utils.sendKeysAction(chartSecondaryColorField, colorText);
        return this;
    }

    public String getButtonColorText() {
        return utils.getText(buttonColorField);
    }

    public InsightWidgets clearButtonColorText() {
        utils.clear(buttonColorField);
        return this;
    }

    public InsightWidgets typeButtonColorText(String colorText) {
        utils.sendKeysAction(buttonColorField, colorText);
        return this;
    }

    public String getWidgetBorderColorText() {
        return utils.getText(widgetBorderColorField);
    }

    public InsightWidgets clearWidgetBorderColorText() {
        utils.clear(widgetBorderColorField);
        return this;
    }

    public InsightWidgets typeWidgetBorderColorText(String colorText) {
        utils.sendKeysAction(widgetBorderColorField, colorText);
        return this;
    }


    // Colors

    public String getBackgroundColor() {
        return utils.getCSSValue(backgroundColor, "color");
    }

    public String getTextColor() {
        return utils.getCSSValue(textColor, "color");
    }

    public String getChartPrimaryColor() {
        return utils.getCSSValue(chartPrimaryColor, "color");
    }

    public String getChartSecondaryColor() {
        return utils.getCSSValue(chartSecondaryColor, "color");
    }

    public String getButtonColor() {
        return utils.getCSSValue(buttonColor, "color");
    }

    public String getWidgetBorderColor() {
        return utils.getCSSValue(widgetBorderColor, "color");
    }

}
