package AllPages.WidgetsPage;

import MainPackage.SeleniumUtils;
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

    public String getFirstInsightPercent()
    {
        return utils.getText(firstInsightPercent);
    }

    public void clickOnFirstInsightShowChart()
    {
        utils.clickOnElement(firstInsightShowChart);
    }


    // BTC dominance in CoinStats portfolios

    public String getSecondInsightPercent()
    {
        return utils.getText(secondInsightPercent);
    }

    public void clickOnSecondInsightShowChart()
    {
        utils.clickOnElement(secondInsightShowChart);
    }


    // Where CoinStats users hold BTC?

    public String getThirdInsightPercent()
    {
        return utils.getText(thirdInsightPercent);
    }

    public String getThirdInsightWalletPercent()
    {
        return utils.getText(thirdInsightWalletPercent);
    }

    public String getThirdInsightExchangePercent()
    {
        return utils.getText(thirdInsightExchangePercent);
    }

    public void clickOnThirdInsightShowChart()
    {
        utils.clickOnElement(thirdInsightShowChart);
    }


    // BTC trades today

    public String getForthInsightPercent()
    {
        return utils.getText(forthInsightPercent);
    }

    public String getForthInsightBuyPercent()
    {
        return utils.getText(forthInsightBuyPercent);
    }

    public String getForthInsightSellPercent()
    {
        return utils.getText(forthInsightSellPercent);
    }

    public void clickOnForthInsightShowChart()
    {
        utils.clickOnElement(forthInsightShowChart);
    }


    // Settings

    public String getCurrentInsightType()
    {
        return utils.getText(insightTypeDropDown);
    }

    public void clickOnInsightTypeDropDown()
    {
        utils.clickOnElement(insightTypeDropDown);
    }

    public void clickOnFirstInsightType() // How many CoinStats users hold BTC?
    {
        utils.clickOnElement(firstInsightType);
    }

    public void clickOnSecondInsightType()
    {
        utils.clickOnElement(secondInsightType); // BTC dominance in CoinStats portfolios
    }

    public void clickOnThirdInsightType() // Where CoinStats users hold BTC?
    {
        utils.clickOnElement(thirdInsightType);
    }

    public void clickOnForthInsightType() // BTC trades today
    {
        utils.clickOnElement(forthInsightType);
    }

    public String getCurrentCoin()
    {
        return utils.getText(currentCoin);
    }

    public void clickOnClearCurrentCoin()
    {
        utils.clickOnElement(clearCurrentCoin);
    }

    public void typeCoinName(String coinName)
    {
        utils.sendKeysAction(searchCoinField, coinName);
    }

    public void clearCoinName()
    {
        utils.clear(searchCoinField);
    }

    public String getCoinName()
    {
        return utils.getText(searchCoinField);
    }

    public String getCurrentTheme()
    {
        return utils.getText(themeDropDown);
    }

    public void clickOnThemeDropDown()
    {
        utils.clickOnElement(themeDropDown);
    }

    public void clickOnDarkMode()
    {
        utils.clickOnElement(darkMode);
    }

    public void clickOnLightMode()
    {
        utils.clickOnElement(lightMode);
    }


    // Colors field

    public String getBackgroundColorText()
    {
        return utils.getText(backgroundColorField);
    }

    public void clearBackgroundColorText()
    {
        utils.clear(backgroundColorField);
    }

    public void typeBackgroundColorText(String colorText)
    {
        utils.sendKeysAction(backgroundColorField, colorText);
    }

    public String getTextColorText()
    {
        return utils.getText(textColorField);
    }

    public void clearTextColorText()
    {
        utils.clear(textColorField);
    }

    public void typeTextColorText(String colorText)
    {
        utils.sendKeysAction(textColorField, colorText);
    }

    public String getChartPrimaryColorText()
    {
        return utils.getText(chartPrimaryColorField);
    }

    public void clearChartPrimaryColorText()
    {
        utils.clear(chartPrimaryColorField);
    }

    public void typeChartPrimaryColorText(String colorText)
    {
        utils.sendKeysAction(chartPrimaryColorField, colorText);
    }

    public String getChartSecondaryColorText()
    {
        return utils.getText(chartSecondaryColorField);
    }

    public void clearChartSecondaryColorText()
    {
        utils.clear(chartSecondaryColorField);
    }

    public void typeChartSecondaryColorText(String colorText)
    {
        utils.sendKeysAction(chartSecondaryColorField, colorText);
    }

    public String getButtonColorText()
    {
        return utils.getText(buttonColorField);
    }

    public void clearButtonColorText()
    {
        utils.clear(buttonColorField);
    }

    public void typeButtonColorText(String colorText)
    {
        utils.sendKeysAction(buttonColorField, colorText);
    }

    public String getWidgetBorderColorText()
    {
        return utils.getText(widgetBorderColorField);
    }

    public void clearWidgetBorderColorText()
    {
        utils.clear(widgetBorderColorField);
    }

    public void typeWidgetBorderColorText(String colorText)
    {
        utils.sendKeysAction(widgetBorderColorField, colorText);
    }


    // Colors

    public String getBackgroundColor()
    {
        return utils.getCSSValue(backgroundColor, "color");
    }

    public String getTextColor()
    {
        return utils.getCSSValue(textColor, "color");
    }

    public String getChartPrimaryColor()
    {
        return utils.getCSSValue(chartPrimaryColor, "color");
    }

    public String getChartSecondaryColor()
    {
        return utils.getCSSValue(chartSecondaryColor, "color");
    }

    public String getButtonColor()
    {
        return utils.getCSSValue(buttonColor, "color");
    }

    public String getWidgetBorderColor()
    {
        return utils.getCSSValue(widgetBorderColor, "color");
    }

}
