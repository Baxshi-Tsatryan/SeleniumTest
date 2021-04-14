package AllPages.WidgetsPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoinPriceChartWidgets {

    WebDriver driver;
    SeleniumUtils utils;

    public CoinPriceChartWidgets(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }


    // Large

    // On Widget

    By coinNameLarge = By.cssSelector("coin-stats-chart-widget[type='large'] div:nth-of-type(1) > span");

    By change24hLarge = By.cssSelector("div.cs-percent-block span:nth-of-type(2)");

    By candleLineChart = By.id("Combined-Shape");

    By chart24h = By.cssSelector("div.cs-chart-round-buttons-block > div:nth-of-type(2)");

    By chart1w = By.cssSelector("div.cs-chart-round-buttons-block > div:nth-of-type(3)");

    By chart1m = By.cssSelector("div.cs-chart-round-buttons-block > div:nth-of-type(4)");

    By chart3m = By.cssSelector("div.cs-chart-round-buttons-block > div:nth-of-type(5)");

    By chart6m = By.cssSelector("div.cs-chart-round-buttons-block > div:nth-of-type(6)");

    By chart1y = By.cssSelector("div.cs-chart-round-buttons-block > div:nth-of-type(7)");

    By chartAll = By.cssSelector("div.cs-chart-round-buttons-block > div:nth-of-type(8)");

    By chartUSD = By.cssSelector("label.chart-checkbox-usd > span");

    By chartBTC = By.cssSelector("label.chart-checkbox-btc > span");

    By chartETH = By.cssSelector("label.chart-checkbox-eth > span");


    // Settings

    By typeDropDown = By.cssSelector("div.second-column > div:nth-of-type(1) > .jsx-1751315535 > .jsx-1751315535");

    By largeType = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By mediumType = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By currentCoin = By.cssSelector(".search-dropdown-enable-placeholder");

    By coinClearIcon = By.cssSelector(".icon-clear");

    By searchCoinField = By.cssSelector("input.jsx-931209423");

    By themeDropDown = By.cssSelector("div.second-column > div:nth-of-type(3) > .jsx-1751315535 > .jsx-1751315535");

    By darkMode = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By lightMode = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By currencyDropDown = By.cssSelector("div.second-column > div:nth-of-type(4) > .jsx-1751315535 > .jsx-1751315535");

    By widthField = By.cssSelector("[placeholder='Width']");

    By heightField = By.cssSelector("[placeholder='chart height']");


    // Colors fields

    By backgroundColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(1) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By textColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(1) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By percentageArrowUpColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(2) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By percentageArrowDownColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(2) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By chartColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(3) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By buttonsBackgroundColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(3) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By chartGradientFromColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(4) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By chartGradientToColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(4) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By coloBTCFieldLarge = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(5) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By colorETHFieldLarge = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(5) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By chartLabelBackgroundColorFieldLarge = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(6) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By candleChartGridsColorFieldLarge = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(6) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By widgetBorderColorFieldLarge = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(7) > td > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");


    // Colors

    By backgroundColor = By.cssSelector("tbody > tr:nth-of-type(1) > td:nth-of-type(1) .widget-color-rectangle");

    By textColor = By.cssSelector("tbody > tr:nth-of-type(1) > td:nth-of-type(2) .widget-color-rectangle");

    By percentageArrowUpColor = By.cssSelector("tbody > tr:nth-of-type(2) > td:nth-of-type(1) .widget-color-rectangle");

    By percentageArrowDownColor = By.cssSelector("tbody > tr:nth-of-type(2) > td:nth-of-type(2) .widget-color-rectangle");

    By chartColor = By.cssSelector("tbody > tr:nth-of-type(3) > td:nth-of-type(1) .widget-color-rectangle");

    By buttonsBackgroundColor = By.cssSelector("tbody > tr:nth-of-type(3) > td:nth-of-type(2) .widget-color-rectangle");

    By chartGradientFromColor = By.cssSelector("tbody > tr:nth-of-type(5) > td:nth-of-type(1) .widget-color-rectangle");

    By chartGradientToColor = By.cssSelector("tbody > tr:nth-of-type(4) > td:nth-of-type(2) .widget-color-rectangle");

    By colorBTCLarge = By.cssSelector("tbody > tr:nth-of-type(5) > td:nth-of-type(1) .widget-color-rectangle");

    By colorETHLarge = By.cssSelector("tbody > tr:nth-of-type(5) > td:nth-of-type(2) .widget-color-rectangle");

    By chartLabelBackgroundColorLarge = By.cssSelector("tbody > tr:nth-of-type(6) > td:nth-of-type(1) .widget-color-rectangle");

    By candleChartGridsColorLarge = By.cssSelector("tbody > tr:nth-of-type(6) > td:nth-of-type(2) .widget-color-rectangle");

    By widgetBorderColorLarge = By.cssSelector("tbody > tr:nth-of-type(7) .widget-color-rectangle");


    // Medium

    By coinNameMedium = By.cssSelector("coin-stats-chart-widget[type='medium'] > div > div > div span");


    // Colors fields

    By chartLabelBackgroundColorFieldMedium = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(5) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By candleChartGridsColorFieldMedium = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(5) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By widgetBorderColorFieldMedium = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(6) > td > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");


    // Colors

    By candleChartGridsColorMedium = By.cssSelector("tbody > tr:nth-of-type(5) > td:nth-of-type(2) .widget-color-rectangle");

    By widgetBorderColorMedium = By.cssSelector("tbody > tr:nth-of-type(6) .widget-color-rectangle");


    // --------------------------------------------- Methods ------------------------------------------------------

    // On Widget

    public CoinPriceChartWidgets clickOnWidgetLarge() {
        utils.click(coinNameLarge);
        return this;
    }

    public CoinPriceChartWidgets clickOnWidgetMedium() {
        utils.click(coinNameMedium);
        return this;
    }

    public String get24hChangeLarge() {
        return utils.getText(change24hLarge);
    }

    public CoinPriceChartWidgets clickOnCandleLineChart() {
        utils.click(candleLineChart);
        return this;
    }

    public CoinPriceChartWidgets clickOnChart24h() {
        utils.click(chart24h);
        return this;
    }

    public CoinPriceChartWidgets clickOnChart1w() {
        utils.click(chart1w);
        return this;
    }

    public CoinPriceChartWidgets clickOnChart1m() {
        utils.click(chart1m);
        return this;
    }

    public CoinPriceChartWidgets clickOnChart3m() {
        utils.click(chart3m);
        return this;
    }

    public CoinPriceChartWidgets clickOnChart6m() {
        utils.click(chart6m);
        return this;
    }

    public CoinPriceChartWidgets clickOnChart1y() {
        utils.click(chart1y);
        return this;
    }

    public CoinPriceChartWidgets clickOnChartAll() {
        utils.click(chartAll);
        return this;
    }

    public CoinPriceChartWidgets clickOnChartUSD() {
        utils.click(chartUSD);
        return this;
    }

    public Boolean chartUSDIsEnabled() {
        return utils.isEnabled(chartUSD);
    }

    public Boolean chartUSDIsSelected() {
        return utils.isSelected(chartUSD);
    }

    public CoinPriceChartWidgets clickOnChartBTC() {
        utils.click(chartBTC);
        return this;
    }

    public Boolean chartBTCIsEnabled() {
        return utils.isEnabled(chartBTC);
    }

    public Boolean chartBTCIsSelected() {
        return utils.isSelected(chartBTC);
    }

    public CoinPriceChartWidgets clickOnChartETH() {
        utils.click(chartETH);
        return this;
    }

    public Boolean chartETHIsEnabled() {
        return utils.isEnabled(chartETH);
    }

    public Boolean chartETHIsSelected() {
        return utils.isSelected(chartETH);
    }


    // Settings

    public String getCurrentType() {
        return utils.getText(typeDropDown);
    }

    public CoinPriceChartWidgets clickOnTypeDropDown() {
        utils.click(typeDropDown);
        return this;
    }

    public CoinPriceChartWidgets clickOnLargeType() {
        utils.click(largeType);
        return this;
    }

    public CoinPriceChartWidgets clickOnMediumType() {
        utils.click(mediumType);
        return this;
    }

    public String getCurrentCoin() {
        return utils.getText(currentCoin);
    }

    public CoinPriceChartWidgets clearCurrentCoin() {
        utils.click(coinClearIcon);
        return this;
    }

    public CoinPriceChartWidgets clickOnCurrentCoin() {
        utils.click(currentCoin);
        return this;
    }

    public CoinPriceChartWidgets typeCoinName(String coinName) {
        utils.sendKeysAction(searchCoinField, coinName);
        return this;
    }

    public String getCurrentTheme() {
        return utils.getText(themeDropDown);
    }

    public CoinPriceChartWidgets clickOnThemeDropDown() {
        utils.click(themeDropDown);
        return this;
    }

    public CoinPriceChartWidgets clickOnLightMode() {
        utils.click(lightMode);
        return this;
    }

    public CoinPriceChartWidgets clickOnDarkMode() {
        utils.click(darkMode);
        return this;
    }

    public String getCurrentCurrency() {
        return utils.getText(currencyDropDown);
    }

    public CoinPriceChartWidgets clickOnCurrencyDropDown() {
        utils.click(currencyDropDown);
        return this;
    }

    public String getWidth() {
        return utils.getText(widthField);
    }

    public CoinPriceChartWidgets typeWidth(String width) {
        utils.sendKeysAction(widthField, width);
        return this;
    }

    public CoinPriceChartWidgets clearWidth() {
        utils.clear(widthField);
        return this;
    }

    public String getHeight() {
        return utils.getText(heightField);
    }

    public CoinPriceChartWidgets typeHeight(String height) {
        utils.sendKeysAction(heightField, height);
        return this;
    }

    public CoinPriceChartWidgets clearHeight() {
        utils.clear(heightField);
        return this;
    }


    // Color fields

    public String getBackgroundColorText() {
        return utils.getText(backgroundColorField);
    }

    public CoinPriceChartWidgets clearBackgroundColorText() {
        utils.clear(backgroundColorField);
        return this;
    }

    public CoinPriceChartWidgets typeBackgroundColorText(String colorText) {
        utils.sendKeysAction(backgroundColorField, colorText);
        return this;
    }

    public String getTextColorText() {
        return utils.getText(textColorField);
    }

    public CoinPriceChartWidgets clearTextColorText() {
        utils.clear(textColorField);
        return this;
    }

    public CoinPriceChartWidgets typeTextColorText(String colorText) {
        utils.sendKeysAction(textColorField, colorText);
        return this;
    }

    public String getPercentageArrowUpColorText() {
        return utils.getText(percentageArrowUpColorField);
    }

    public CoinPriceChartWidgets clearPercentageArrowUpColorText() {
        utils.clear(percentageArrowUpColorField);
        return this;
    }

    public CoinPriceChartWidgets typePercentageArrowUpColorText(String colorText) {
        utils.sendKeysAction(percentageArrowUpColorField, colorText);
        return this;
    }

    public String getPercentageArrowDownColorText() {
        return utils.getText(percentageArrowDownColorField);
    }

    public CoinPriceChartWidgets clearPercentageArrowDownColorText() {
        utils.clear(percentageArrowDownColorField);
        return this;
    }

    public CoinPriceChartWidgets typePercentageArrowDownColorText(String colorText) {
        utils.sendKeysAction(percentageArrowDownColorField, colorText);
        return this;
    }

    public String getChartColorText() {
        return utils.getText(chartColorField);
    }

    public CoinPriceChartWidgets clearChartColorText() {
        utils.clear(chartColorField);
        return this;
    }

    public CoinPriceChartWidgets typeChartColorText(String colorText) {
        utils.sendKeysAction(chartColorField, colorText);
        return this;
    }

    public String getButtonsBackgroundColorText() {
        return utils.getText(buttonsBackgroundColorField);
    }

    public CoinPriceChartWidgets clearButtonsBackgroundColorText() {
        utils.clear(buttonsBackgroundColorField);
        return this;
    }

    public CoinPriceChartWidgets typeButtonsBackgroundColorText(String colorText) {
        utils.sendKeysAction(buttonsBackgroundColorField, colorText);
        return this;
    }

    public String getChartGradientFromColorText() {
        return utils.getText(chartGradientFromColorField);
    }

    public CoinPriceChartWidgets clearChartGradientFromColorText() {
        utils.clear(chartGradientFromColorField);
        return this;
    }

    public CoinPriceChartWidgets typeChartGradientFromColorText(String colorText) {
        utils.sendKeysAction(chartGradientFromColorField, colorText);
        return this;
    }

    public String getChartGradientToColorText() {
        return utils.getText(chartGradientToColorField);
    }

    public CoinPriceChartWidgets clearChartGradientToColorText() {
        utils.clear(chartGradientToColorField);
        return this;
    }

    public CoinPriceChartWidgets typeChartGradientToColorText(String colorText) {
        utils.sendKeysAction(chartGradientToColorField, colorText);
        return this;
    }

    public String getBTCColorTextLarge() {
        return utils.getText(coloBTCFieldLarge);
    }

    public CoinPriceChartWidgets clearBTCColorTextLarge() {
        utils.clear(coloBTCFieldLarge);
        return this;
    }

    public CoinPriceChartWidgets typeBTCColorTextLarge(String colorText) {
        utils.sendKeysAction(coloBTCFieldLarge, colorText);
        return this;
    }

    public String getETHColorTextLarge() {
        return utils.getText(colorETHFieldLarge);
    }

    public CoinPriceChartWidgets clearETHColorTextLarge() {
        utils.clear(colorETHFieldLarge);
        return this;
    }

    public CoinPriceChartWidgets typeETHColorTextLarge(String colorText) {
        utils.sendKeysAction(colorETHFieldLarge, colorText);
        return this;
    }

    public String getChartLabelBackgroundColorTextLarge() {
        return utils.getText(chartLabelBackgroundColorFieldLarge);
    }

    public CoinPriceChartWidgets clearChartLabelBackgroundColorTextLarge() {
        utils.clear(chartLabelBackgroundColorFieldLarge);
        return this;
    }

    public CoinPriceChartWidgets typeChartLabelBackgroundColorTextLarge(String colorText) {
        utils.sendKeysAction(chartLabelBackgroundColorFieldLarge, colorText);
        return this;
    }

    public String getCandleChartGridsColorTextLarge() {
        return utils.getText(candleChartGridsColorFieldLarge);
    }

    public CoinPriceChartWidgets clearCandleChartGridsColorTextLarge() {
        utils.clear(candleChartGridsColorFieldLarge);
        return this;
    }

    public CoinPriceChartWidgets typeCandleChartGridsColorTextLarge(String colorText) {
        utils.sendKeysAction(candleChartGridsColorFieldLarge, colorText);
        return this;
    }

    public String getWidgetBorderColorTextLarge() {
        return utils.getText(widgetBorderColorFieldLarge);
    }

    public CoinPriceChartWidgets clearWidgetBorderColorTextLarge() {
        utils.clear(widgetBorderColorFieldLarge);
        return this;
    }

    public CoinPriceChartWidgets typeWidgetBorderColorTextLarge(String colorText) {
        utils.sendKeysAction(widgetBorderColorFieldLarge, colorText);
        return this;
    }


    // Medium

    public String getChartLabelBackgroundColorTextMedium() {
        return utils.getText(chartLabelBackgroundColorFieldMedium);
    }

    public CoinPriceChartWidgets clearChartLabelBackgroundColorTextMedium() {
        utils.clear(chartLabelBackgroundColorFieldMedium);
        return this;
    }

    public CoinPriceChartWidgets typeChartLabelBackgroundColorTextMedium(String colorText) {
        utils.sendKeysAction(chartLabelBackgroundColorFieldMedium, colorText);
        return this;
    }

    public String getCandleChartGridsColorTextMedium() {
        return utils.getText(candleChartGridsColorFieldMedium);
    }

    public CoinPriceChartWidgets clearCandleChartGridsColorTextMedium() {
        utils.clear(candleChartGridsColorFieldMedium);
        return this;
    }

    public CoinPriceChartWidgets typeCandleChartGridsColorTextMedium(String colorText) {
        utils.sendKeysAction(candleChartGridsColorFieldMedium, colorText);
        return this;
    }

    public String getWidgetBorderColorTextMedium() {
        return utils.getText(widgetBorderColorFieldMedium);
    }

    public CoinPriceChartWidgets clearWidgetBorderColorTextMedium() {
        utils.clear(widgetBorderColorFieldMedium);
        return this;
    }

    public CoinPriceChartWidgets typeWidgetBorderColorTextMedium(String colorText) {
        utils.sendKeysAction(widgetBorderColorFieldMedium, colorText);
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
        return utils.getCSSValue(percentageArrowUpColor, "color");
    }

    public String getPercentageArrowDownColor() {
        return utils.getCSSValue(percentageArrowDownColor, "color");
    }

    public String getChartColor() {
        return utils.getCSSValue(chartColor, "color");
    }

    public String getButtonsBackgroundColor() {
        return utils.getCSSValue(buttonsBackgroundColor, "color");
    }

    public String getChartGradientFromColor() {
        return utils.getCSSValue(chartGradientFromColor, "color");
    }

    public String getChartGradientToColor() {
        return utils.getCSSValue(chartGradientToColor, "color");
    }

    public String getBTCColorLarge() {
        return utils.getCSSValue(colorBTCLarge, "color");
    }

    public String getETHColorLarge() {
        return utils.getCSSValue(colorETHLarge, "color");
    }

    public String getChartLabelBackgroundColorLarge() {
        return utils.getCSSValue(chartLabelBackgroundColorFieldLarge, "color");
    }

    public String getCandleChartGridsColorLarge() {
        return utils.getCSSValue(candleChartGridsColorLarge, "color");
    }

    public String getWidgetBorderColorLarge() {
        return utils.getCSSValue(widgetBorderColorLarge, "color");
    }


    // Medium

    public String getChartLabelBackgroundColorMedium() {
        return utils.getCSSValue(chartLabelBackgroundColorFieldMedium, "color");
    }

    public String getCandleChartGridsColorMedium() {
        return utils.getCSSValue(candleChartGridsColorMedium, "color");
    }

    public String getWidgetBorderColorMedium() {
        return utils.getCSSValue(widgetBorderColorMedium, "color");
    }


}
