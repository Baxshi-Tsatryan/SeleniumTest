package Chrome.AllPages.WidgetsPage;

import Chrome.MainPackage.SeleniumUtils;
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

    public CoinPriceMarqueeWidgets clickOnNextStatic() {
        utils.click(nextButtonStatic);
        return this;
    }

    public CoinPriceMarqueeWidgets clickOnPreviousStatic() {
        utils.click(previousButtonStatic);
        return this;
    }


    // Fixed Top

    public CoinPriceMarqueeWidgets clickOnNextFixedTop() {
        utils.click(nextButtonFixedTop);
        return this;
    }

    public CoinPriceMarqueeWidgets clickOnPreviousFixedTop() {
        utils.click(previousButtonFixedTop);
        return this;
    }


    // Fixed Bottom

    public CoinPriceMarqueeWidgets clickOnNextFixedBottom() {
        utils.click(nextButtonFixedBottom);
        return this;
    }

    public CoinPriceMarqueeWidgets clickOnPreviousFixedBottom() {
        utils.click(previousButtonFixedBottom);
        return this;
    }


    // Settings

    public String getCurrentPosition() {
        return utils.getText(positionDropDown);
    }

    public CoinPriceMarqueeWidgets clickOnPositionDropDown() {
        utils.click(positionDropDown);
        return this;
    }

    public CoinPriceMarqueeWidgets clickOnStaticPosition() {
        utils.click(staticPosition);
        return this;
    }

    public CoinPriceMarqueeWidgets clickOnFixedTopPosition() {
        utils.click(fixedTopPosition);
        return this;
    }

    public CoinPriceMarqueeWidgets clickOnFixedBottomPosition() {
        utils.click(fixedBottomPosition);
        return this;
    }

    public String getCurrentCoinsCount() {
        return utils.getText(coinsCountDropDown);
    }

    public CoinPriceMarqueeWidgets clickOnCoinsCountDropDown() {
        utils.click(coinsCountDropDown);
        return this;
    }

    public String getCurrentTheme() {
        return utils.getText(themeDropDown);
    }

    public CoinPriceMarqueeWidgets clickOnThemeDropDown() {
        utils.click(themeDropDown);
        return this;
    }

    public CoinPriceMarqueeWidgets clickOnLightMode() {
        utils.click(lightMode);
        return this;
    }

    public CoinPriceMarqueeWidgets clickOnDarkMode() {
        utils.click(darkMode);
        return this;
    }

    public String getCurrentCurrency() {
        return utils.getText(currencyDropDown);
    }

    public CoinPriceMarqueeWidgets clickOnCurrencyDropDown() {
        utils.click(currencyDropDown);
        return this;
    }

    public String getWidth() {
        return utils.getText(widthField);
    }

    public CoinPriceMarqueeWidgets clearWidth() {
        utils.clear(widthField);
        return this;
    }

    public CoinPriceMarqueeWidgets typeWidth(String width) {
        utils.sendKeysAction(widthField, width);
        return this;
    }


    // Colors fields

    public String getBackgroundColorText() {
        return utils.getText(backgroundColorField);
    }

    public CoinPriceMarqueeWidgets clearBackgroundColorText() {
        utils.clear(backgroundColorField);
        return this;
    }

    public CoinPriceMarqueeWidgets typeBackgroundColorText(String colorText) {
        utils.sendKeysAction(backgroundColorField, "color");
        return this;
    }

    public String getTextColorText() {
        return utils.getText(textColorField);
    }

    public CoinPriceMarqueeWidgets clearTextColorText() {
        utils.clear(textColorField);
        return this;
    }

    public CoinPriceMarqueeWidgets typeTextColorText(String colorText) {
        utils.sendKeysAction(textColorField, "color");
        return this;
    }

    public String getPercentageArrowUpColorText() {
        return utils.getText(percentageArrowUpColorField);
    }

    public CoinPriceMarqueeWidgets clearPercentageArrowUpColorText() {
        utils.clear(percentageArrowUpColorField);
        return this;
    }

    public CoinPriceMarqueeWidgets typePercentageArrowUpColorText(String colorText) {
        utils.sendKeysAction(percentageArrowUpColorField, "color");
        return this;
    }

    public String getPercentageArrowDownColorText() {
        return utils.getText(percentageArrowDownColorField);
    }

    public CoinPriceMarqueeWidgets clearPercentageArrowDownColorText() {
        utils.clear(percentageArrowDownColorField);
        return this;
    }

    public CoinPriceMarqueeWidgets typePercentageArrowDownColorText(String colorText) {
        utils.sendKeysAction(navigationButtonsColorField, "color");
        return this;
    }

    public String getNavigationButtonsColorText() {
        return utils.getText(navigationButtonsColorField);
    }

    public CoinPriceMarqueeWidgets clearNavigationButtonsColorText() {
        utils.clear(navigationButtonsColorField);
        return this;
    }

    public CoinPriceMarqueeWidgets typeNavigationButtonsColorText(String colorText) {
        utils.sendKeysAction(navigationButtonsColorField, "color");
        return this;
    }

    public String getWidgetBorderColorText() {
        return utils.getText(widgetBorderColorField);
    }

    public CoinPriceMarqueeWidgets clearWidgetBorderColorText() {
        utils.clear(widgetBorderColorField);
        return this;
    }

    public CoinPriceMarqueeWidgets typeWidgetBorderColorText(String colorText) {
        utils.sendKeysAction(widgetBorderColorField, "color");
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

    public String getNavigationButtonsColor() {
        return utils.getCSSValue(navigationButtonsColor, "color");
    }

    public String getWidgetBorderColor() {
        return utils.getCSSValue(widgetBorderColor, "color");
    }

}
