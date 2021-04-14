package AllPages.WidgetsPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoinPriceWidgets {

    WebDriver driver;
    SeleniumUtils utils;

    public CoinPriceWidgets(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }


    // Large widget

    // On widget

    By coinName = By.cssSelector("coin-stats-ticker-widget[locale='en'] > div > div > div > div:nth-of-type(2) > span");

    By coinIndex = By.cssSelector("coin-stats-ticker-widget[locale='en'] div:nth-of-type(1) > span");

    By coinPrice = By.cssSelector("coin-stats-ticker-widget[locale='en'] > div > div > div > span");

    By coinPercentLarge = By.cssSelector("coin-stats-ticker-widget[locale='en'] > div > div > div > div:nth-of-type(2) > div span");

    By coinPriceBTCLarge = By.cssSelector("coin-stats-ticker-widget[locale='en'] div:nth-of-type(3) > div:nth-of-type(2)");

    By coinPercentBTCLarge = By.cssSelector("coin-stats-ticker-widget[locale='en'] div:nth-of-type(3) span");

    // Settings

    By typeDropDown = By.cssSelector("div.second-column > div:nth-of-type(1) > .jsx-1751315535 > .jsx-1751315535");

    By largeType = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By mediumType = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By smallType = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(3) .table-row");

    By currentCoin = By.cssSelector(".search-dropdown-enable-placeholder");

    By clearCurrentCoin = By.cssSelector(".icon-clear");

    By coinSearchField = By.cssSelector("input.jsx-931209423");

    By allCoins = By.cssSelector("ul.jsx-931209423 > li:nth-of-type(1) .table-row");

    By themeDropDown = By.cssSelector("div.second-column > div:nth-of-type(3) > .jsx-1751315535 > .jsx-1751315535");

    By darkMode = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By lightMode = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By currencyDropDown = By.cssSelector("div.second-column > div:nth-of-type(4) > .jsx-1751315535 > .jsx-1751315535");

    By widthField = By.cssSelector("[placeholder='Width']");

    By heightField = By.cssSelector("[placeholder='Height']");


    // Color fields

    By backgroundColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(1) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By textColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(1) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By percentageArrowUpField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(2) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By percentageArrowDownField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(2) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By rankBackgroundField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(3) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By rankTextField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(3) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By widgetBorderColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(4) > td > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");


    // Colors

    By backgroundColor = By.cssSelector("tbody > tr:nth-of-type(1) > td:nth-of-type(1) .widget-color-rectangle");

    By textColor = By.cssSelector("tbody > tr:nth-of-type(1) > td:nth-of-type(2) .widget-color-rectangle");

    By percentageArrowUp = By.cssSelector("tbody > tr:nth-of-type(2) > td:nth-of-type(1) .widget-color-rectangle");

    By percentageArrowDown = By.cssSelector("tbody > tr:nth-of-type(2) > td:nth-of-type(2) .widget-color-rectangle");

    By rankBackground = By.cssSelector("tbody > tr:nth-of-type(3) > td:nth-of-type(1) .widget-color-rectangle");

    By rankText = By.cssSelector("tbody > tr:nth-of-type(3) > td:nth-of-type(2) .widget-color-rectangle");

    By widgetBorderColor = By.cssSelector("tbody > tr:nth-of-type(4) .widget-color-rectangle");


    // Medium

    By coinPercentMedium = By.cssSelector("coin-stats-ticker-widget[locale='en'] > div > div > div > div > div span");


    // Small

    By coinPriceSmall = By.cssSelector("coin-stats-ticker-widget[locale='en'] > div > div > div");


    // Colors fields

    By backgroundColorFieldSmall = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(1) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By textColorFieldSmall = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(1) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By widgetBorderColorFieldSmall = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(2) > td > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");


    // Colors

    By backgroundColorSmall = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(2) > td > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By textColorSmall = By.cssSelector("tbody td:nth-of-type(2) .widget-color-rectangle");

    By widgetBorderColorSmall = By.cssSelector("tbody > tr:nth-of-type(2) .widget-color-rectangle");


    // ----------------------------------------------------- Methods ------------------------------------------------


    // On Widget

    public CoinPriceWidgets clickOnWidgetLarge() {
        utils.click(coinName);
        return this;
    }

    public String getCoinName() {
        return utils.getText(coinName);
    }

    public String getCoinIndex() {
        return utils.getText(coinIndex);
    }

    public String getCoinPrice() {
        return utils.getText(coinPrice);
    }

    public String getCoinPercentLarge() {
        return utils.getText(coinPercentLarge);
    }

    public String getCoinPercentColorLarge() {
        return utils.getCSSValue(coinPercentLarge, "color");
    }

    public String getCoinPriceBTCLarge() {
        return utils.getText(coinPriceBTCLarge);
    }

    public String getCoinPercentBTCLarge() {
        return utils.getText(coinPercentBTCLarge);
    }

    public String getCoinIndexColor() {
        return utils.getCSSValue(coinIndex, "color");
    }

    public String getCoinPercentMedium() {
        return utils.getText(coinPercentMedium);
    }

    public String getCoinPercentColorMedium() {
        return utils.getCSSValue(coinPercentMedium, "color");
    }

    public String getCoinPriceSmall() {
        return utils.getText(coinPriceSmall);
    }

    public String getCoinPriceColorSmall() {
        return utils.getCSSValue(coinPriceSmall, "color");
    }

    public CoinPriceWidgets clickOnWidgetSmall() {
        utils.click(coinPriceSmall);
        return this;
    }


    // Settings

    public String getCurrentType() {
        return utils.getText(typeDropDown);
    }

    public CoinPriceWidgets clickOnTypeDropDown() {
        utils.click(typeDropDown);
        return this;
    }

    public CoinPriceWidgets clickOnLargeType() {
        utils.click(largeType);
        return this;
    }

    public CoinPriceWidgets clickOnMediumType() {
        utils.click(mediumType);
        return this;
    }

    public CoinPriceWidgets clickOnSmallType() {
        utils.click(smallType);
        return this;
    }

    public String getCurrentCoin() {
        return utils.getText(currentCoin);
    }

    public CoinPriceWidgets clickOnClearCurrentCoin() {
        utils.click(clearCurrentCoin);
        return this;
    }

    public CoinPriceWidgets clickOnCurrentCoin() {
        utils.click(currentCoin);
        return this;
    }

    public CoinPriceWidgets typeCoinName(String coinName) {
        utils.click(coinSearchField);
        return this;
    }

    public CoinPriceWidgets clickOnAllCoins() {
        utils.click(allCoins);
        return this;
    }

    public String getCurrentTheme() {
        return utils.getText(themeDropDown);
    }

    public CoinPriceWidgets clickOnThemeDropDown() {
        utils.click(themeDropDown);
        return this;
    }

    public CoinPriceWidgets clickOnDarkMode() {
        utils.click(darkMode);
        return this;
    }

    public CoinPriceWidgets clickOnLightMode() {
        utils.click(lightMode);
        return this;
    }

    public String getCurrentCurrency() {
        return utils.getText(currencyDropDown);
    }

    public CoinPriceWidgets clickOnCurrencyDropDown() {
        utils.click(currencyDropDown);
        return this;
    }

    public String getWidth() {
        return utils.getText(widthField);
    }

    public CoinPriceWidgets clearWidth() {
        utils.clear(widthField);
        return this;
    }

    public CoinPriceWidgets typeWidth(String width) {
        utils.sendKeysAction(widthField, width);
        return this;
    }

    public String getHeight() {
        return utils.getText(heightField);
    }

    public CoinPriceWidgets clearHeight() {
        utils.clear(heightField);
        return this;
    }

    public CoinPriceWidgets typeHeight(String height) {
        utils.sendKeysAction(heightField, height);
        return this;
    }


    // Colors field

    public String getBackgroundColorText() {
        return utils.getText(backgroundColorField);
    }

    public CoinPriceWidgets clearBackgroundColorText() {
        utils.clear(backgroundColorField);
        return this;
    }

    public CoinPriceWidgets typeBackgroundColorText(String colorText) {
        utils.sendKeysAction(backgroundColorField, colorText);
        return this;
    }

    public String getTextColorText() {
        return utils.getText(textColorField);
    }

    public CoinPriceWidgets clearTextColorText() {
        utils.clear(textColorField);
        return this;
    }

    public CoinPriceWidgets typeTextColorText(String colorText) {
        utils.sendKeysAction(textColorField, colorText);
        return this;
    }

    public String getPercentageArrowUpColorText() {
        return utils.getText(percentageArrowUpField);
    }

    public CoinPriceWidgets clearPercentageArrowUpColorText() {
        utils.clear(percentageArrowUpField);
        return this;
    }

    public CoinPriceWidgets typePercentageArrowUpColorText(String colorText) {
        utils.sendKeysAction(percentageArrowUpField, colorText);
        return this;
    }

    public String getPercentageArrowDownColorText() {
        return utils.getText(percentageArrowDownField);
    }

    public CoinPriceWidgets clearPercentageArrowDownColorText() {
        utils.clear(percentageArrowDownField);
        return this;
    }

    public CoinPriceWidgets typePercentageArrowDownColorText(String colorText) {
        utils.sendKeysAction(rankBackgroundField, colorText);
        return this;
    }

    public String getRankBackgroundColorText() {
        return utils.getText(rankBackgroundField);
    }

    public CoinPriceWidgets clearRankBackgroundColorText() {
        utils.clear(rankBackgroundField);
        return this;
    }

    public CoinPriceWidgets typeRankBackgroundColorText(String colorText) {
        utils.sendKeysAction(rankBackgroundField, colorText);
        return this;
    }

    public String getRankTextColorText() {
        return utils.getText(rankTextField);
    }

    public CoinPriceWidgets clearRankTextColorText() {
        utils.clear(rankTextField);
        return this;
    }

    public CoinPriceWidgets typeRankTextColorText(String colorText) {
        utils.sendKeysAction(rankTextField, colorText);
        return this;
    }

    public String getWidgetBorderColorText() {
        return utils.getText(widgetBorderColorField);
    }

    public CoinPriceWidgets clearWidgetBorderColorText() {
        utils.clear(widgetBorderColorField);
        return this;
    }

    public CoinPriceWidgets typeWidgetBorderColorText(String colorText) {
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

    public String getPercentageArrowUpColor() {
        return utils.getCSSValue(percentageArrowUp, "color");
    }

    public String getPercentageArrowDownColor() {
        return utils.getCSSValue(percentageArrowDown, "color");
    }

    public String getRankBackgroundColor() {
        return utils.getCSSValue(rankBackground, "color");
    }

    public String getRankTextColor() {
        return utils.getCSSValue(rankText, "color");
    }

    public String getWidgetBorderColor() {
        return utils.getCSSValue(widgetBorderColor, "color");
    }


    // Small Colors fields

    public String getBackgroundColorTextSmall() {
        return utils.getText(backgroundColorFieldSmall);
    }

    public CoinPriceWidgets clearBackgroundColorTextSmall() {
        utils.clear(backgroundColorFieldSmall);
        return this;
    }

    public CoinPriceWidgets typeBackgroundColorTextSmall(String colorText) {
        utils.sendKeysAction(backgroundColorFieldSmall, colorText);
        return this;
    }

    public String getTextColorTextSmall() {
        return utils.getText(textColorFieldSmall);
    }

    public CoinPriceWidgets clearTextColorTextSmall() {
        utils.clear(textColorFieldSmall);
        return this;
    }

    public CoinPriceWidgets typeTextColorTextSmall(String colorText) {
        utils.sendKeysAction(textColorFieldSmall, colorText);
        return this;
    }

    public String getWidgetBorderColorTextSmall() {
        return utils.getText(widgetBorderColorFieldSmall);
    }

    public CoinPriceWidgets clearWidgetBorderColorTextSmall() {
        utils.clear(widgetBorderColorFieldSmall);
        return this;
    }

    public CoinPriceWidgets typeWidgetBorderColorTextSmall(String colorText) {
        utils.sendKeysAction(widgetBorderColorFieldSmall, colorText);
        return this;
    }


    // Small Colors

    public String getBackgroundColorSmall() {
        return utils.getCSSValue(backgroundColorSmall, "color");
    }

    public String getTextColorSmall() {
        return utils.getCSSValue(textColorSmall, "color");
    }

    public String getWidgetBorderColorSmall() {
        return utils.getCSSValue(widgetBorderColorSmall, "color");
    }

}
