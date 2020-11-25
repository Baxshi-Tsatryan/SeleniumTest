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

    public void clickOnWidgetLarge()
    {
        utils.clickOnElement(coinName);
    }

    public String getCoinName()
    {
        return utils.getText(coinName);
    }

    public String getCoinIndex()
    {
        return utils.getText(coinIndex);
    }

    public String getCoinPrice()
    {
        return utils.getText(coinPrice);
    }

    public String getCoinPercentLarge()
    {
        return utils.getText(coinPercentLarge);
    }

    public String getCoinPercentColorLarge()
    {
        return utils.getCSSValue(coinPercentLarge, "color");
    }

    public String getCoinPriceBTCLarge()
    {
        return utils.getText(coinPriceBTCLarge);
    }

    public String getCoinPercentBTCLarge()
    {
        return utils.getText(coinPercentBTCLarge);
    }

    public String getCoinIndexColor()
    {
        return utils.getCSSValue(coinIndex, "color");
    }

    public String getCoinPercentMedium()
    {
        return utils.getText(coinPercentMedium);
    }

    public String getCoinPercentColorMedium()
    {
        return utils.getCSSValue(coinPercentMedium, "color");
    }

    public String getCoinPriceSmall()
    {
        return utils.getText(coinPriceSmall);
    }

    public String getCoinPriceColorSmall()
    {
        return utils.getCSSValue(coinPriceSmall, "color");
    }

    public void clickOnWidgetSmall()
    {
        utils.clickOnElement(coinPriceSmall);
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

    public void clickOnSmallType()
    {
        utils.clickOnElement(smallType);
    }

    public String getCurrentCoin()
    {
        return utils.getText(currentCoin);
    }

    public void clickOnClearCurrentCoin()
    {
        utils.clickOnElement(clearCurrentCoin);
    }

    public void clickOnCurrentCoin()
    {
        utils.clickOnElement(currentCoin);
    }

    public void typeCoinName(String coinName)
    {
        utils.clickOnElement(coinSearchField);
    }

    public void clickOnAllCoins()
    {
        utils.clickOnElement(allCoins);
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

    public void clearWidth()
    {
        utils.clear(widthField);
    }

    public void typeWidth(String width)
    {
        utils.sendKeys(widthField, width);
    }

    public String getHeight()
    {
        return utils.getText(heightField);
    }

    public void clearHeight()
    {
        utils.clear(heightField);
    }

    public void typeHeight(String height)
    {
        utils.sendKeys(heightField, height);
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
        return utils.getText(percentageArrowUpField);
    }

    public void clearPercentageArrowUpColorText()
    {
        utils.clear(percentageArrowUpField);
    }

    public void typePercentageArrowUpColorText(String colorText)
    {
        utils.sendKeys(percentageArrowUpField, colorText);
    }

    public String getPercentageArrowDownColorText()
    {
        return utils.getText(percentageArrowDownField);
    }

    public void clearPercentageArrowDownColorText()
    {
        utils.clear(percentageArrowDownField);
    }

    public void typePercentageArrowDownColorText(String colorText)
    {
        utils.sendKeys(rankBackgroundField, colorText);
    }

    public String getRankBackgroundColorText()
    {
        return utils.getText(rankBackgroundField);
    }

    public void clearRankBackgroundColorText()
    {
        utils.clear(rankBackgroundField);
    }

    public void typeRankBackgroundColorText(String colorText)
    {
        utils.sendKeys(rankBackgroundField, colorText);
    }

    public String getRankTextColorText()
    {
        return utils.getText(rankTextField);
    }

    public void clearRankTextColorText()
    {
        utils.clear(rankTextField);
    }

    public void typeRankTextColorText(String colorText)
    {
        utils.sendKeys(rankTextField, colorText);
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
        utils.sendKeys(widgetBorderColorField, colorText);
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
        return utils.getCSSValue(percentageArrowUp, "color");
    }

    public String getPercentageArrowDownColor()
    {
        return utils.getCSSValue(percentageArrowDown, "color");
    }

    public String getRankBackgroundColor()
    {
        return utils.getCSSValue(rankBackground, "color");
    }

    public String getRankTextColor()
    {
        return utils.getCSSValue(rankText, "color");
    }

    public String getWidgetBorderColor()
    {
        return utils.getCSSValue(widgetBorderColor, "color");
    }


    // Small Colors fields

    public String getBackgroundColorTextSmall()
    {
        return utils.getText(backgroundColorFieldSmall);
    }

    public void clearBackgroundColorTextSmall()
    {
        utils.clear(backgroundColorFieldSmall);
    }

    public void typeBackgroundColorTextSmall(String colorText)
    {
        utils.sendKeys(backgroundColorFieldSmall, colorText);
    }

    public String getTextColorTextSmall()
    {
        return utils.getText(textColorFieldSmall);
    }

    public void clearTextColorTextSmall()
    {
        utils.clear(textColorFieldSmall);
    }

    public void typeTextColorTextSmall(String colorText)
    {
        utils.sendKeys(textColorFieldSmall, colorText);
    }

    public String getWidgetBorderColorTextSmall()
    {
        return utils.getText(widgetBorderColorFieldSmall);
    }

    public void clearWidgetBorderColorTextSmall()
    {
        utils.clear(widgetBorderColorFieldSmall);
    }

    public void typeWidgetBorderColorTextSmall(String colorText)
    {
        utils.sendKeys(widgetBorderColorFieldSmall, colorText);
    }


    // Small Colors

    public String getBackgroundColorSmall()
    {
        return utils.getCSSValue(backgroundColorSmall, "color");
    }

    public String getTextColorSmall()
    {
        return utils.getCSSValue(textColorSmall, "color");
    }

    public String getWidgetBorderColorSmall()
    {
        return utils.getCSSValue(widgetBorderColorSmall, "color");
    }

}
