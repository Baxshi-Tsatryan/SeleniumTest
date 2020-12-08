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

    public String getFirstCoinNameLarge()
    {
        return utils.getText(firstCoinNameLarge);
    }

    public String getSecondCoinNameLarge()
    {
        return utils.getText(secondCoinNameLarge);
    }

    public String getFirstCoinPriceLarge()
    {
        return utils.getText(firstCoinPriceLarge);
    }

    public String getSecondCoinPriceLarge()
    {
        return utils.getText(secondCoinPriceLarge);
    }

    public void clickOnFirstCoinLarge()
    {
        utils.clickOnElement(firstCoinNameLarge);
    }

    public void typeFirstCoinNameLarge(String coinName)
    {
        utils.sendKeysAction(firstCoinNameLarge, coinName);
    }

    public void clearFirstCoinNameLarge()
    {
        utils.clear(firstCoinNameLarge);
    }

    public void clickOnSecondCoinLarge()
    {
        utils.clickOnElement(secondCoinNameLarge);
    }

    public void typeSecondCoinNameLarge(String coinName)
    {
        utils.sendKeysAction(secondCoinNameLarge, coinName);
    }

    public void clearSecondCoinNameLarge()
    {
        utils.clear(secondCoinNameLarge);
    }

    public void typeFirstCoinPriceLarge(String price)
    {
        utils.sendKeysAction(firstCoinPriceLarge, price);
    }

    public void clearFirstCoinPrice()
    {
        utils.clear(firstCoinPriceLarge);
    }

    public void typeSecondCoinPriceLarge(String price)
    {
        utils.sendKeysAction(secondCoinPriceLarge, price);
    }

    public void clearSecondCoinPriceLarge()
    {
        utils.clear(secondCoinPriceLarge);
    }

    public void clickOnReverse()
    {
        utils.clickOnElement(reverseButton);
    }


    // Medium

    public String getFirstCoinNameMedium()
    {
        return utils.getText(firstCoinNameMedium);
    }

    public String getSecondCoinNameMedium()
    {
        return utils.getText(secondCoinNameMedium);
    }

    public String getFirstCoinPriceMedium()
    {
        return utils.getText(firstCoinPriceMedium);
    }

    public String getSecondCoinPriceMedium()
    {
        return utils.getText(secondCoinPriceMedium);
    }

    public void clickOnFirstCoinMedium()
    {
        utils.clickOnElement(firstCoinNameMedium);
    }

    public void typeFirstCoinNameMedium(String coinName)
    {
        utils.sendKeysAction(firstCoinNameMedium, coinName);
    }

    public void clearFirstCoinNameMedium()
    {
        utils.clear(firstCoinNameMedium);
    }

    public void clickOnSecondCoinMedium()
    {
        utils.clickOnElement(secondCoinNameMedium);
    }

    public void typeSecondCoinNameMedium(String coinName)
    {
        utils.sendKeysAction(secondCoinNameMedium, coinName);
    }

    public void clearSecondCoinNameMedium()
    {
        utils.clear(secondCoinNameMedium);
    }

    public void typeFirstCoinPriceMedium(String price)
    {
        utils.sendKeysAction(firstCoinPriceMedium, price);
    }

    public void clearFirstCoinMedium()
    {
        utils.clear(firstCoinPriceMedium);
    }

    public void typeSecondCoinPriceMedium(String price)
    {
        utils.sendKeysAction(secondCoinPriceMedium, price);
    }

    public void clearSecondCoinPriceMedium()
    {
        utils.clear(secondCoinPriceMedium);
    }


    // Small

    public String getFirstCoinSymbolSmall()
    {
        return utils.getText(firstCoinSymbolSmall);
    }

    public String getSecondCoinSymbolSmall()
    {
        return utils.getText(secondCoinSymbolSmall);
    }

    public String getFirstCoinPriceSmall()
    {
        return utils.getText(firstCoinPriceSmall);
    }

    public String getSecondCoinPriceSmall()
    {
        return utils.getText(secondCoinPriceSmall);
    }

    public void clickOnFirstCoinSmall()
    {
        utils.clickOnElement(firstCoinSymbolSmall);
    }

    public void typeFirstCoinNameSmall(String coinName)
    {
        utils.sendKeysAction(firstCoinSymbolSmall, coinName);
    }

    public void clearFirstCoinNameSmall()
    {
        utils.clear(firstCoinSymbolSmall);
    }

    public void clickOnSecondCoinSmall()
    {
        utils.clickOnElement(secondCoinSymbolSmall);
    }

    public void typeSecondCoinNameSmall(String coinName)
    {
        utils.sendKeysAction(secondCoinSymbolSmall, coinName);
    }

    public void clearSecondCoinNameSmall()
    {
        utils.clear(secondCoinSymbolSmall);
    }

    public void typeFirstCoinPriceSmall(String price)
    {
        utils.sendKeysAction(firstCoinPriceSmall, price);
    }

    public void clearFirstCoinSmall()
    {
        utils.clear(firstCoinPriceSmall);
    }

    public void typeSecondCoinPriceSmall(String price)
    {
        utils.sendKeysAction(secondCoinPriceSmall, price);
    }

    public void clearSecondCoinPriceSmall()
    {
        utils.clear(secondCoinPriceSmall);
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

    public String getCurrentSellCoinName()
    {
        return utils.getText(currentSellCoin);
    }

    public void clickOnClearCurrentSellCoin()
    {
        utils.clickOnElement(clearSellCoin);
    }

    public void clickOnCurrentSellCoin()
    {
        utils.clickOnElement(currentSellCoin);
    }

    public void typeSellCoin(String coinName)
    {
        utils.sendKeysAction(searchSellCoin, coinName);
    }

    public void clearSellCoinName()
    {
        utils.clear(searchSellCoin);
    }

    public String getTypedSellCoinName()
    {
        return utils.getText(searchSellCoin);
    }

    public String getCurrentBuyCoinName()
    {
        return utils.getText(currentBuyCoin);
    }

    public void clickOnClearCurrentBuyCoin()
    {
        utils.clickOnElement(clearBuyCoin);
    }

    public void clickOnCurrentBuyCoin()
    {
        utils.clickOnElement(currentBuyCoin);
    }

    public void typeBuyCoin(String coinName)
    {
        utils.sendKeysAction(searchBuyCoin, coinName);
    }

    public void clearBuyCoinName()
    {
        utils.clear(searchBuyCoin);
    }

    public String getTypedBuyCoinName()
    {
        return utils.getText(searchBuyCoin);
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
        utils.sendKeysAction(widthField, width);
    }


    // Colors fields

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

    public String getRotateButtonColorText()
    {
        return utils.getText(rotateButtonColorField);
    }

    public void clearRotateButtonColorText()
    {
        utils.clear(rotateButtonColorField);
    }

    public void typeRotateButtonColorText(String colorText)
    {
        utils.sendKeysAction(rotateButtonColorField, colorText);
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

    public String getWidgetBorderColor()
    {
        return utils.getCSSValue(widgetBorderColor, "color");
    }

    public String getRotateButtonColor()
    {
        return utils.getCSSValue(rotateButtonColor, "color");
    }

}
