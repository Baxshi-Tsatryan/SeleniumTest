package AllPages.WidgetsPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoinPriceMarqueeWidgets {

    WebDriver driver;
    SeleniumUtils utils;

    public CoinPriceMarqueeWidgets(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }


    // On Widget

    // Static

    By nextButtonStatic = By.cssSelector("coin-stats-marquee-widget[locale='en'] div:nth-of-type(2) > [width='8']");

    By previousButtonStatic = By.cssSelector("coin-stats-marquee-widget[locale='en'] div:nth-of-type(1) > [width='8']");


    // Fixed Top

    By nextButtonFixedTop = By.cssSelector("coin-stats-marquee-widget[locale='en'] > div:nth-of-type(2) > div > div > div:nth-of-type(2)");

    By previousButtonFixedTop = By.cssSelector("coin-stats-marquee-widget[locale='en'] > div:nth-of-type(2) div:nth-of-type(1) > [width='8']");


    // Fixed Bottom

    By nextButtonFixedBottom = By.cssSelector("");

    By previousButtonFixedBottom = By.cssSelector("");


    // Settings

    By positionDropDown = By.cssSelector("div.second-column > div:nth-of-type(1) > .jsx-1751315535 > .jsx-1751315535");

    By staticPosition = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By fixedTopPosition = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By fixedBottomPosition = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(3) .table-row");

    By coinsCountDropDown = By.cssSelector("div.second-column > div:nth-of-type(2) > .jsx-1751315535 > .jsx-1751315535");

    By themeDropDown = By.cssSelector("div.second-column > div:nth-of-type(3) > .jsx-1751315535 > .jsx-1751315535");

    By darkMode = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By lightMode = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By currencyDropDown = By.cssSelector("div.second-column > div:nth-of-type(4) > .jsx-1751315535 > .jsx-1751315535");

    By widthField = By.cssSelector("[placeholder='Width']");


    // Color fields

    By backgroundColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(1) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By textColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(1) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By percentageArrowUpColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(2) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By percentageArrowDownColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(2) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By navigationButtonsColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(3) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By widgetBorderColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(3) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");


    // Color

    By backgroundColor = By.cssSelector("tbody > tr:nth-of-type(1) > td:nth-of-type(1) .widget-color-rectangle");

    By textColor = By.cssSelector("tbody > tr:nth-of-type(1) > td:nth-of-type(2) .widget-color-rectangle");

    By percentageArrowUpColor = By.cssSelector("tbody > tr:nth-of-type(2) > td:nth-of-type(1) .widget-color-rectangle");

    By percentageArrowDownColor = By.cssSelector("tbody > tr:nth-of-type(2) > td:nth-of-type(2) .widget-color-rectangle");

    By navigationButtonsColor = By.cssSelector("tbody > tr:nth-of-type(3) > td:nth-of-type(1) .widget-color-rectangle");

    By widgetBorderColor = By.cssSelector("tbody > tr:nth-of-type(3) > td:nth-of-type(2) .widget-color-rectangle");



    // -------------------------------------------- Methods -------------------------------------------------

    // On Widget

    // Static

    public void clickOnNextStatic()
    {
        utils.clickOnElement(nextButtonStatic);
    }

    public void clickOnPreviousStatic()
    {
        utils.clickOnElement(previousButtonStatic);
    }


    // Fixed Top

    public void clickOnNextFixedTop()
    {
        utils.clickOnElement(nextButtonFixedTop);
    }

    public void clickOnPreviousFixedTop()
    {
        utils.clickOnElement(previousButtonFixedTop);
    }


    // Fixed Bottom

    public void clickOnNextFixedBottom()
    {
        utils.clickOnElement(nextButtonFixedBottom);
    }

    public void clickOnPreviousFixedBottom()
    {
        utils.clickOnElement(previousButtonFixedBottom);
    }


    // Settings

    public String getCurrentPosition()
    {
        return utils.getText(positionDropDown);
    }

    public void clickOnPositionDropDown()
    {
        utils.clickOnElement(positionDropDown);
    }

    public void clickOnStaticPosition()
    {
        utils.clickOnElement(staticPosition);
    }

    public void clickOnFixedTopPosition()
    {
        utils.clickOnElement(fixedTopPosition);
    }

    public void clickOnFixedBottomPosition()
    {
        utils.clickOnElement(fixedBottomPosition);
    }

    public String getCurrentCoinsCount()
    {
        return utils.getText(coinsCountDropDown);
    }

    public void clickOnCoinsCountDropDown()
    {
        utils.clickOnElement(coinsCountDropDown);
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
        utils.sendKeysAction(backgroundColorField, "color");
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
        utils.sendKeysAction(textColorField, "color");
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
        utils.sendKeysAction(percentageArrowUpColorField, "color");
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
        utils.sendKeysAction(navigationButtonsColorField, "color");
    }

    public String getNavigationButtonsColorText()
    {
        return utils.getText(navigationButtonsColorField);
    }

    public void clearNavigationButtonsColorText()
    {
        utils.clear(navigationButtonsColorField);
    }

    public void typeNavigationButtonsColorText(String colorText)
    {
        utils.sendKeysAction(navigationButtonsColorField, "color");
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
        utils.sendKeysAction(widgetBorderColorField, "color");
    }


    // Colors

    public String getBackgroundColor()
    {
        return utils.getCSSValue(backgroundColor, "color");
    }

    public String getTextColor(){
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

    public String getNavigationButtonsColor()
    {
        return utils.getCSSValue(navigationButtonsColor, "color");
    }

    public String getWidgetBorderColor()
    {
        return utils.getCSSValue(widgetBorderColor, "color");
    }

}
