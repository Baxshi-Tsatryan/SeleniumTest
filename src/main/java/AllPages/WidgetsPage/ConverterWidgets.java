package AllPages.WidgetsPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConverterWidgets {
    WebDriver driver;
    SeleniumUtils utils;

    public ConverterWidgets(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }


    // Large

    // On Widget

    By firstCoinNameLarge = By.cssSelector("coin-stats-converter-widget[type='large'] > div > div > div:nth-of-type(1) span");

    By secondCoinNameLarge = By.cssSelector("coin-stats-converter-widget[type='large'] div:nth-of-type(3) span");

    By firstCoinPriceLarge = By.cssSelector("coin-stats-converter-widget[type='large'] > div > div > div:nth-of-type(1) [placeholder='Count']");

    By secondCoinPriceLarge = By.cssSelector("coin-stats-converter-widget[type='large'] div:nth-of-type(3) [placeholder='Count']");

    By reverseButton = By.cssSelector("svg[width='24']");


    // Settings

    By typeDropDown = By.cssSelector("div.second-column > div:nth-of-type(1) > .jsx-1751315535 > .jsx-1751315535");

    By largeType = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By mediumType = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By smallType = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(3) .table-row");

    By currentSellCoin = By.cssSelector("div.second-column > div:nth-of-type(2) .search-dropdown-enable-placeholder");

    By clearSellCoin = By.cssSelector("div.second-column > div:nth-of-type(2) .icon-clear");

    By searchSellCoin = By.cssSelector("div.second-column div:nth-of-type(1) > [placeholder='Search']");

    By currentBuyCoin = By.cssSelector(".search-dropdown-enable-placeholder");

    By clearBuyCoin = By.cssSelector(".icon-clear");

    By searchBuyCoin = By.cssSelector("div.second-column > div:nth-of-type(3) [placeholder='Search']");

    By themeDropDown = By.cssSelector("div.second-column > div:nth-of-type(4) > .jsx-1751315535 > .jsx-1751315535");

    By darkMode = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By lightMode = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By widthField = By.cssSelector("[placeholder='Width']");


    // Colors field

    By backgroundColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(1) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By textColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(1) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By widgetBorderColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(2) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By rotateButtonColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(2) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");


    // Colors

    By backgroundColor = By.cssSelector("tbody > tr:nth-of-type(1) > td:nth-of-type(1) .widget-color-rectangle");

    By textColor = By.cssSelector("tbody > tr:nth-of-type(1) > td:nth-of-type(2) .widget-color-rectangle");

    By widgetBorderColor = By.cssSelector("tbody > tr:nth-of-type(2) > td:nth-of-type(1) .widget-color-rectangle");

    By rotateButtonColor = By.cssSelector("tbody > tr:nth-of-type(2) > td:nth-of-type(2) .widget-color-rectangle");


    // Medium

    By firstCoinNameMedium = By.cssSelector("coin-stats-converter-widget[type='medium'] > div > div > div:nth-of-type(1) span");

    By firstCoinPriceMedium = By.cssSelector("coin-stats-converter-widget[type='medium'] > div > div > div:nth-of-type(1) [placeholder='Count']");

    By secondCoinNameMedium = By.cssSelector("coin-stats-converter-widget[type='medium'] div:nth-of-type(3) span");

    By secondCoinPriceMedium = By.cssSelector("coin-stats-converter-widget[type='medium'] div:nth-of-type(3) [placeholder='Count']");


    // Small

    By firstCoinSymbolSmall = By.cssSelector("coin-stats-converter-widget[type='small'] > div > div > div:nth-of-type(1) span");

    By firstCoinPriceSmall = By.cssSelector("coin-stats-converter-widget[type='small'] > div > div > div:nth-of-type(1) [placeholder='Count']");

    By secondCoinSymbolSmall = By.cssSelector("coin-stats-converter-widget[type='small'] div:nth-of-type(3) span");

    By secondCoinPriceSmall = By.cssSelector("coin-stats-converter-widget[type='small'] div:nth-of-type(3) [placeholder='Count']");


    // ------------------------------------------------- Methods -------------------------------------------------------

    // On Widget

    // Large

    public String getFirstCoinNameLarge() {
        return utils.getText(firstCoinNameLarge);
    }

    public String getSecondCoinNameLarge() {
        return utils.getText(secondCoinNameLarge);
    }

    public String getFirstCoinPriceLarge() {
        return utils.getText(firstCoinPriceLarge);
    }

    public String getSecondCoinPriceLarge() {
        return utils.getText(secondCoinPriceLarge);
    }

    public ConverterWidgets clickOnFirstCoinLarge() {
        utils.click(firstCoinNameLarge);
        return this;
    }

    public ConverterWidgets typeFirstCoinNameLarge(String coinName) {
        utils.sendKeysAction(firstCoinNameLarge, coinName);
        return this;
    }

    public ConverterWidgets clearFirstCoinNameLarge() {
        utils.clear(firstCoinNameLarge);
        return this;
    }

    public ConverterWidgets clickOnSecondCoinLarge() {
        utils.click(secondCoinNameLarge);
        return this;
    }

    public ConverterWidgets typeSecondCoinNameLarge(String coinName) {
        utils.sendKeysAction(secondCoinNameLarge, coinName);
        return this;
    }

    public ConverterWidgets clearSecondCoinNameLarge() {
        utils.clear(secondCoinNameLarge);
        return this;
    }

    public ConverterWidgets typeFirstCoinPriceLarge(String price) {
        utils.sendKeysAction(firstCoinPriceLarge, price);
        return this;
    }

    public ConverterWidgets clearFirstCoinPrice() {
        utils.clear(firstCoinPriceLarge);
        return this;
    }

    public ConverterWidgets typeSecondCoinPriceLarge(String price) {
        utils.sendKeysAction(secondCoinPriceLarge, price);
        return this;
    }

    public ConverterWidgets clearSecondCoinPriceLarge() {
        utils.clear(secondCoinPriceLarge);
        return this;
    }

    public ConverterWidgets clickOnReverse() {
        utils.click(reverseButton);
        return this;
    }


    // Medium

    public String getFirstCoinNameMedium() {
        return utils.getText(firstCoinNameMedium);
    }

    public String getSecondCoinNameMedium() {
        return utils.getText(secondCoinNameMedium);
    }

    public String getFirstCoinPriceMedium() {
        return utils.getText(firstCoinPriceMedium);
    }

    public String getSecondCoinPriceMedium() {
        return utils.getText(secondCoinPriceMedium);
    }

    public ConverterWidgets clickOnFirstCoinMedium() {
        utils.click(firstCoinNameMedium);
        return this;
    }

    public ConverterWidgets typeFirstCoinNameMedium(String coinName) {
        utils.sendKeysAction(firstCoinNameMedium, coinName);
        return this;
    }

    public ConverterWidgets clearFirstCoinNameMedium() {
        utils.clear(firstCoinNameMedium);
        return this;
    }

    public ConverterWidgets clickOnSecondCoinMedium() {
        utils.click(secondCoinNameMedium);
        return this;
    }

    public ConverterWidgets typeSecondCoinNameMedium(String coinName) {
        utils.sendKeysAction(secondCoinNameMedium, coinName);
        return this;
    }

    public ConverterWidgets clearSecondCoinNameMedium() {
        utils.clear(secondCoinNameMedium);
        return this;
    }

    public ConverterWidgets typeFirstCoinPriceMedium(String price) {
        utils.sendKeysAction(firstCoinPriceMedium, price);
        return this;
    }

    public ConverterWidgets clearFirstCoinMedium() {
        utils.clear(firstCoinPriceMedium);
        return this;
    }

    public ConverterWidgets typeSecondCoinPriceMedium(String price) {
        utils.sendKeysAction(secondCoinPriceMedium, price);
        return this;
    }

    public ConverterWidgets clearSecondCoinPriceMedium() {
        utils.clear(secondCoinPriceMedium);
        return this;
    }


    // Small

    public String getFirstCoinSymbolSmall() {
        return utils.getText(firstCoinSymbolSmall);
    }

    public String getSecondCoinSymbolSmall() {
        return utils.getText(secondCoinSymbolSmall);
    }

    public String getFirstCoinPriceSmall() {
        return utils.getText(firstCoinPriceSmall);
    }

    public String getSecondCoinPriceSmall() {
        return utils.getText(secondCoinPriceSmall);
    }

    public ConverterWidgets clickOnFirstCoinSmall() {
        utils.click(firstCoinSymbolSmall);
        return this;
    }

    public ConverterWidgets typeFirstCoinNameSmall(String coinName) {
        utils.sendKeysAction(firstCoinSymbolSmall, coinName);
        return this;
    }

    public ConverterWidgets clearFirstCoinNameSmall() {
        utils.clear(firstCoinSymbolSmall);
        return this;
    }

    public ConverterWidgets clickOnSecondCoinSmall() {
        utils.click(secondCoinSymbolSmall);
        return this;
    }

    public ConverterWidgets typeSecondCoinNameSmall(String coinName) {
        utils.sendKeysAction(secondCoinSymbolSmall, coinName);
        return this;
    }

    public ConverterWidgets clearSecondCoinNameSmall() {
        utils.clear(secondCoinSymbolSmall);
        return this;
    }

    public ConverterWidgets typeFirstCoinPriceSmall(String price) {
        utils.sendKeysAction(firstCoinPriceSmall, price);
        return this;
    }

    public ConverterWidgets clearFirstCoinSmall() {
        utils.clear(firstCoinPriceSmall);
        return this;
    }

    public ConverterWidgets typeSecondCoinPriceSmall(String price) {
        utils.sendKeysAction(secondCoinPriceSmall, price);
        return this;
    }

    public ConverterWidgets clearSecondCoinPriceSmall() {
        utils.clear(secondCoinPriceSmall);
        return this;
    }


    // Settings

    public String getCurrentType() {
        return utils.getText(typeDropDown);
    }

    public ConverterWidgets clickOnTypeDropDown() {
        utils.click(typeDropDown);
        return this;
    }

    public ConverterWidgets clickOnLargeType() {
        utils.click(largeType);
        return this;
    }

    public ConverterWidgets clickOnMediumType() {
        utils.click(mediumType);
        return this;
    }

    public ConverterWidgets clickOnSmallType() {
        utils.click(smallType);
        return this;
    }

    public String getCurrentSellCoinName() {
        return utils.getText(currentSellCoin);
    }

    public ConverterWidgets clickOnClearCurrentSellCoin() {
        utils.click(clearSellCoin);
        return this;
    }

    public ConverterWidgets clickOnCurrentSellCoin() {
        utils.click(currentSellCoin);
        return this;
    }

    public ConverterWidgets typeSellCoin(String coinName) {
        utils.sendKeysAction(searchSellCoin, coinName);
        return this;
    }

    public ConverterWidgets clearSellCoinName() {
        utils.clear(searchSellCoin);
        return this;
    }

    public String getTypedSellCoinName() {
        return utils.getText(searchSellCoin);
    }

    public String getCurrentBuyCoinName() {
        return utils.getText(currentBuyCoin);
    }

    public ConverterWidgets clickOnClearCurrentBuyCoin() {
        utils.click(clearBuyCoin);
        return this;
    }

    public ConverterWidgets clickOnCurrentBuyCoin() {
        utils.click(currentBuyCoin);
        return this;
    }

    public ConverterWidgets typeBuyCoin(String coinName) {
        utils.sendKeysAction(searchBuyCoin, coinName);
        return this;
    }

    public ConverterWidgets clearBuyCoinName() {
        utils.clear(searchBuyCoin);
        return this;
    }

    public String getTypedBuyCoinName() {
        return utils.getText(searchBuyCoin);
    }

    public String getCurrentTheme() {
        return utils.getText(themeDropDown);
    }

    public ConverterWidgets clickOnThemeDropDown() {
        utils.click(themeDropDown);
        return this;
    }

    public ConverterWidgets clickOnLightMode() {
        utils.click(lightMode);
        return this;
    }

    public ConverterWidgets clickOnDarkMode() {
        utils.click(darkMode);
        return this;
    }

    public String getWidth() {
        return utils.getText(widthField);
    }

    public ConverterWidgets clearWidth() {
        utils.clear(widthField);
        return this;
    }

    public ConverterWidgets typeWidth(String width) {
        utils.sendKeysAction(widthField, width);
        return this;
    }


    // Colors fields

    public String getBackgroundColorText() {
        return utils.getText(backgroundColorField);
    }

    public ConverterWidgets clearBackgroundColorText() {
        utils.clear(backgroundColorField);
        return this;
    }

    public ConverterWidgets typeBackgroundColorText(String colorText) {
        utils.sendKeysAction(backgroundColorField, colorText);
        return this;
    }

    public String getTextColorText() {
        return utils.getText(textColorField);
    }

    public ConverterWidgets clearTextColorText() {
        utils.clear(textColorField);
        return this;
    }

    public ConverterWidgets typeTextColorText(String colorText) {
        utils.sendKeysAction(textColorField, colorText);
        return this;
    }

    public String getWidgetBorderColorText() {
        return utils.getText(widgetBorderColorField);
    }

    public ConverterWidgets clearWidgetBorderColorText() {
        utils.clear(widgetBorderColorField);
        return this;
    }

    public ConverterWidgets typeWidgetBorderColorText(String colorText) {
        utils.sendKeysAction(widgetBorderColorField, colorText);
        return this;
    }

    public String getRotateButtonColorText() {
        return utils.getText(rotateButtonColorField);
    }

    public ConverterWidgets clearRotateButtonColorText() {
        utils.clear(rotateButtonColorField);
        return this;
    }

    public ConverterWidgets typeRotateButtonColorText(String colorText) {
        utils.sendKeysAction(rotateButtonColorField, colorText);
        return this;
    }


    // Colors

    public String getBackgroundColor() {
        return utils.getCSSValue(backgroundColor, "color");
    }

    public String getTextColor() {
        return utils.getCSSValue(textColor, "color");
    }

    public String getWidgetBorderColor() {
        return utils.getCSSValue(widgetBorderColor, "color");
    }

    public String getRotateButtonColor() {
        return utils.getCSSValue(rotateButtonColor, "color");
    }

}
