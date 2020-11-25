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

    public void clickOnWidgetLarge()
    {
        utils.clickOnElement(coinNameLarge);
    }

    public void clickOnWidgetMedium()
    {
        utils.clickOnElement(coinNameMedium);
    }

    public String get24hChangeLarge()
    {
        return utils.getText(change24hLarge);
    }

    public void clickOnCandleLineChart()
    {
        utils.clickOnElement(candleLineChart);
    }

    public void clickOnChart24h()
    {
        utils.clickOnElement(chart24h);
    }

    public void clickOnChart1w()
    {
        utils.clickOnElement(chart1w);
    }

    public void clickOnChart1m()
    {
        utils.clickOnElement(chart1m);
    }

    public void clickOnChart3m()
    {
        utils.clickOnElement(chart3m);
    }

    public void clickOnChart6m()
    {
        utils.clickOnElement(chart6m);
    }

    public void clickOnChart1y()
    {
        utils.clickOnElement(chart1y);
    }

    public void clickOnChartAll()
    {
        utils.clickOnElement(chartAll);
    }

    public void clickOnChartUSD()
    {
        utils.clickOnElement(chartUSD);
    }

    public Boolean chartUSDIsEnabled()
    {
        return utils.isEnabled(chartUSD);
    }

    public Boolean chartUSDIsSelected()
    {
        return utils.isSelected(chartUSD);
    }

    public void clickOnChartBTC()
    {
        utils.clickOnElement(chartBTC);
    }

    public Boolean chartBTCIsEnabled()
    {
        return utils.isEnabled(chartBTC);
    }

    public Boolean chartBTCIsSelected()
    {
        return utils.isSelected(chartBTC);
    }

    public void clickOnChartETH()
    {
        utils.clickOnElement(chartETH);
    }

    public Boolean chartETHIsEnabled()
    {
        return utils.isEnabled(chartETH);
    }

    public Boolean chartETHIsSelected()
    {
        return utils.isSelected(chartETH);
    }


    // Settings

    public String getCurrentType()
    {
        return utils.getText(typeDropDown);
    }

    public void clickOnTypeDropDown()
    {
        utils.clickOnElement(typeDropDown);
    }

    public void clickOnLargeType()
    {
        utils.clickOnElement(largeType);
    }

    public void clickOnMediumType()
    {
        utils.clickOnElement(mediumType);
    }

    public String getCurrentCoin()
    {
        return utils.getText(currentCoin);
    }

    public void clearCurrentCoin()
    {
        utils.clickOnElement(coinClearIcon);
    }

    public void clickOnCurrentCoin()
    {
        utils.clickOnElement(currentCoin);
    }

    public void typeCoinName(String coinName)
    {
        utils.sendKeys(searchCoinField, coinName);
    }

    public String getCurrentTheme()
    {
        return utils.getText(themeDropDown);
    }

    public void clickOnThemeDropDown()
    {
        utils.clickOnElement(themeDropDown);
    }

    public void clickOnLightMode()
    {
        utils.clickOnElement(lightMode);
    }

    public void clickOnDarkMode()
    {
        utils.clickOnElement(darkMode);
    }

    public String getCurrentCurrency()
    {
        return utils.getText(currencyDropDown);
    }

    public void clickOnCurrencyDropDown()
    {
        utils.clickOnElement(currencyDropDown);
    }

    public String getWidth()
    {
        return utils.getText(widthField);
    }

    public void typeWidth(String width)
    {
        utils.sendKeys(widthField, width);
    }

    public void clearWidth()
    {
        utils.clear(widthField);
    }

    public String getHeight()
    {
        return utils.getText(heightField);
    }

    public void typeHeight(String height)
    {
        utils.sendKeys(heightField, height);
    }

    public void clearHeight()
    {
        utils.clear(heightField);
    }


    // Color fields

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
        utils.sendKeys(backgroundColorField, colorText);
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
        utils.sendKeys(textColorField, colorText);
    }

    public String getPercentageArrowUpColorText()
    {
        return utils.getText(percentageArrowUpColorField);
    }

    public void clearPercentageArrowUpColorText()
    {
        utils.clear(percentageArrowUpColorField);
    }

    public void typePercentageArrowUpColorText(String colorText)
    {
        utils.sendKeys(percentageArrowUpColorField, colorText);
    }

    public String getPercentageArrowDownColorText()
    {
        return utils.getText(percentageArrowDownColorField);
    }

    public void clearPercentageArrowDownColorText()
    {
        utils.clear(percentageArrowDownColorField);
    }

    public void typePercentageArrowDownColorText(String colorText)
    {
        utils.sendKeys(percentageArrowDownColorField, colorText);
    }

    public String getChartColorText()
    {
        return utils.getText(chartColorField);
    }

    public void clearChartColorText()
    {
        utils.clear(chartColorField);
    }

    public void typeChartColorText(String colorText)
    {
        utils.sendKeys(chartColorField, colorText);
    }

    public String getButtonsBackgroundColorText()
    {
        return utils.getText(buttonsBackgroundColorField);
    }

    public void clearButtonsBackgroundColorText()
    {
        utils.clear(buttonsBackgroundColorField);
    }

    public void typeButtonsBackgroundColorText(String colorText)
    {
        utils.sendKeys(buttonsBackgroundColorField, colorText);
    }

    public String getChartGradientFromColorText()
    {
        return utils.getText(chartGradientFromColorField);
    }

    public void clearChartGradientFromColorText()
    {
        utils.clear(chartGradientFromColorField);
    }

    public void typeChartGradientFromColorText(String colorText)
    {
        utils.sendKeys(chartGradientFromColorField, colorText);
    }

    public String getChartGradientToColorText()
    {
        return utils.getText(chartGradientToColorField);
    }

    public void clearChartGradientToColorText()
    {
        utils.clear(chartGradientToColorField);
    }

    public void typeChartGradientToColorText(String colorText)
    {
        utils.sendKeys(chartGradientToColorField, colorText);
    }

    public String getBTCColorTextLarge()
    {
        return utils.getText(coloBTCFieldLarge);
    }

    public void clearBTCColorTextLarge()
    {
        utils.clear(coloBTCFieldLarge);
    }

    public void typeBTCColorTextLarge(String colorText)
    {
        utils.sendKeys(coloBTCFieldLarge, colorText);
    }

    public String getETHColorTextLarge()
    {
        return utils.getText(colorETHFieldLarge);
    }

    public void clearETHColorTextLarge()
    {
        utils.clear(colorETHFieldLarge);
    }

    public void typeETHColorTextLarge(String colorText)
    {
        utils.sendKeys(colorETHFieldLarge, colorText);
    }

    public String getChartLabelBackgroundColorTextLarge()
    {
        return utils.getText(chartLabelBackgroundColorFieldLarge);
    }

    public void clearChartLabelBackgroundColorTextLarge()
    {
        utils.clear(chartLabelBackgroundColorFieldLarge);
    }

    public void typeChartLabelBackgroundColorTextLarge(String colorText)
    {
        utils.sendKeys(chartLabelBackgroundColorFieldLarge, colorText);
    }

    public String getCandleChartGridsColorTextLarge()
    {
        return utils.getText(candleChartGridsColorFieldLarge);
    }

    public void clearCandleChartGridsColorTextLarge()
    {
        utils.clear(candleChartGridsColorFieldLarge);
    }

    public void typeCandleChartGridsColorTextLarge(String colorText)
    {
        utils.sendKeys(candleChartGridsColorFieldLarge, colorText);
    }

    public String getWidgetBorderColorTextLarge()
    {
        return utils.getText(widgetBorderColorFieldLarge);
    }

    public void clearWidgetBorderColorTextLarge()
    {
        utils.clear(widgetBorderColorFieldLarge);
    }

    public void typeWidgetBorderColorTextLarge(String colorText)
    {
        utils.sendKeys(widgetBorderColorFieldLarge, colorText);
    }


    // Medium

    public String getChartLabelBackgroundColorTextMedium()
    {
        return utils.getText(chartLabelBackgroundColorFieldMedium);
    }

    public void clearChartLabelBackgroundColorTextMedium()
    {
        utils.clear(chartLabelBackgroundColorFieldMedium);
    }

    public void typeChartLabelBackgroundColorTextMedium(String colorText)
    {
        utils.sendKeys(chartLabelBackgroundColorFieldMedium, colorText);
    }

    public String getCandleChartGridsColorTextMedium()
    {
        return utils.getText(candleChartGridsColorFieldMedium);
    }

    public void clearCandleChartGridsColorTextMedium()
    {
        utils.clear(candleChartGridsColorFieldMedium);
    }

    public void typeCandleChartGridsColorTextMedium(String colorText)
    {
        utils.sendKeys(candleChartGridsColorFieldMedium, colorText);
    }

    public String getWidgetBorderColorTextMedium()
    {
        return utils.getText(widgetBorderColorFieldMedium);
    }

    public void clearWidgetBorderColorTextMedium()
    {
        utils.clear(widgetBorderColorFieldMedium);
    }

    public void typeWidgetBorderColorTextMedium(String colorText)
    {
        utils.sendKeys(widgetBorderColorFieldMedium, colorText);
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

    public String getPercentageArrowUpColor()
    {
        return utils.getCSSValue(percentageArrowUpColor, "color");
    }

    public String getPercentageArrowDownColor()
    {
        return utils.getCSSValue(percentageArrowDownColor, "color");
    }

    public String getChartColor()
    {
        return utils.getCSSValue(chartColor, "color");
    }

    public String getButtonsBackgroundColor()
    {
        return utils.getCSSValue(buttonsBackgroundColor, "color");
    }

    public String getChartGradientFromColor()
    {
        return utils.getCSSValue(chartGradientFromColor, "color");
    }

    public String getChartGradientToColor()
    {
        return utils.getCSSValue(chartGradientToColor, "color");
    }

    public String getBTCColorLarge()
    {
        return utils.getCSSValue(colorBTCLarge, "color");
    }

    public String getETHColorLarge()
    {
        return utils.getCSSValue(colorETHLarge, "color");
    }

    public String getChartLabelBackgroundColorLarge()
    {
        return utils.getCSSValue(chartLabelBackgroundColorFieldLarge, "color");
    }

    public String getCandleChartGridsColorLarge()
    {
        return utils.getCSSValue(candleChartGridsColorLarge, "color");
    }

    public String getWidgetBorderColorLarge()
    {
        return utils.getCSSValue(widgetBorderColorLarge, "color");
    }


    // Medium

    public String getChartLabelBackgroundColorMedium()
    {
        return utils.getCSSValue(chartLabelBackgroundColorFieldMedium, "color");
    }

    public String getCandleChartGridsColorMedium()
    {
        return utils.getCSSValue(candleChartGridsColorMedium, "color");
    }

    public String getWidgetBorderColorMedium()
    {
        return utils.getCSSValue(widgetBorderColorMedium, "color");
    }


}
