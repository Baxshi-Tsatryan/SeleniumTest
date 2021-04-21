package Chrome.AllPages.WidgetsPage;

import Chrome.MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoinListWidgets {

    WebDriver driver;
    SeleniumUtils utils;

    public CoinListWidgets(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }


    // Large

    // Settings

    By typeDropDown = By.cssSelector("div.second-column > div:nth-of-type(1) > .jsx-1751315535 > .jsx-1751315535");

    By largeType = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By mediumType = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By smallType = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(3) .table-row");

    By customCoinsList = By.cssSelector("div.radio-container > label:nth-of-type(1) > .checkmark");

    By topCoinsList = By.cssSelector("div.radio-container > label:nth-of-type(2) > .checkmark");


    // Custom Coins List

    By searchFieldCustomCoins = By.cssSelector(".coin-search-input");


    // Top Coins List

    By coinsCountDropDown = By.cssSelector("div.second-column > div:nth-of-type(3) > .jsx-1751315535 > .jsx-1751315535");

    By themeDropDown = By.cssSelector("div.second-column > div:nth-of-type(4) > .jsx-1751315535 > .jsx-1751315535");

    By darkMode = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By lightMode = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By currencyDropDown = By.cssSelector("div.second-column > div:nth-of-type(5) > .jsx-1751315535 > .jsx-1751315535");

    By widthField = By.cssSelector("[placeholder='Width']");


    // Colors fields

    By backgroundColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(1) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By textColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(1) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By positivePercentageColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(2) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By negativePercentageColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(2) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By widgetBorderColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(3) > td > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");


    // Colors

    By backgroundColor = By.cssSelector("table.colors-container-grid tr:nth-of-type(1) > td:nth-of-type(1) .widget-color-rectangle");

    By textColor = By.cssSelector("table.colors-container-grid tr:nth-of-type(1) > td:nth-of-type(2) .widget-color-rectangle");

    By positivePercentageColor = By.cssSelector("table.colors-container-grid tr:nth-of-type(2) > td:nth-of-type(1) .widget-color-rectangle");

    By negativePercentageColor = By.cssSelector("table.colors-container-grid tr:nth-of-type(2) > td:nth-of-type(2) .widget-color-rectangle");

    By widgetBorderColor = By.cssSelector("table.colors-container-grid tr:nth-of-type(3) .widget-color-rectangle");


    // ----------------------------------------------- Methods --------------------------------------------------

    public String getCurrentType() {
        return utils.getText(typeDropDown);
    }

    public CoinListWidgets clickOnTypeDropDown() {
        utils.click(typeDropDown);
        return this;
    }

    public CoinListWidgets clickOnLarge() {
        utils.click(largeType);
        return this;
    }

    public CoinListWidgets clickOnMedium() {
        utils.click(mediumType);
        return this;
    }

    public CoinListWidgets clickOnSmall() {
        utils.click(smallType);
        return this;
    }

    public CoinListWidgets clickOnCustomCoinsList() {
        utils.click(customCoinsList);
        return this;
    }

    public Boolean customCoinsListIsEnabled() {
        return utils.isEnabled(customCoinsList);
    }

    public Boolean customCoinsListIsSelected() {
        return utils.isSelected(customCoinsList);
    }

    public CoinListWidgets clickOnTopCoinsList() {
        utils.click(topCoinsList);
        return this;
    }

    public Boolean topCoinsListIsEnabled() {
        return utils.isEnabled(topCoinsList);
    }

    public Boolean topCoinsListIsSelected() {
        return utils.isSelected(topCoinsList);
    }

    public CoinListWidgets typeCustomCoin(String coinName) {
        utils.sendKeysAction(searchFieldCustomCoins, coinName);
        return this;
    }

    public String getCurrentCoinsCount() {
        return utils.getText(coinsCountDropDown);
    }

    public CoinListWidgets clickOnCoinsCountDropDown() {
        utils.click(coinsCountDropDown);
        return this;
    }

    public String getTheme() {
        return utils.getText(themeDropDown);
    }

    public CoinListWidgets clickOnThemeDropDown() {
        utils.click(themeDropDown);
        return this;
    }

    public CoinListWidgets clickOnDarkMode() {
        utils.click(darkMode);
        return this;
    }

    public CoinListWidgets clickOnLightMode() {
        utils.click(lightMode);
        return this;
    }

    public String getCurrentCurrency() {
        return utils.getText(currencyDropDown);
    }

    public CoinListWidgets clickOnCurrencyDropDown() {
        utils.click(currencyDropDown);
        return this;
    }

    public String getWidth() {
        return utils.getText(widthField);
    }

    public CoinListWidgets clearWidth() {
        utils.clear(widthField);
        return this;
    }

    public CoinListWidgets typeWidth(String width) {
        utils.sendKeysAction(widthField, width);
        return this;
    }

    public String getCurrentTheme() {
        return utils.getText(themeDropDown);
    }


    // Color field

    public String getBackgroundColorText() {
        return utils.getText(backgroundColorField);
    }

    public CoinListWidgets clearBackgroundColorText() {
        utils.clear(backgroundColorField);
        return this;
    }

    public CoinListWidgets typeBackgroundColorText(String colorText) {
        utils.sendKeysAction(backgroundColorField, colorText);
        return this;
    }

    public String getTextColorText() {
        return utils.getText(textColorField);
    }

    public CoinListWidgets clearTextColorText() {
        utils.clear(textColorField);
        return this;
    }

    public CoinListWidgets typeTextColorText(String colorText) {
        utils.sendKeysAction(textColorField, colorText);
        return this;
    }

    public String getPositivePercentageColorText() {
        return utils.getText(positivePercentageColorField);
    }

    public CoinListWidgets clearPositivePercentageColorText() {
        utils.clear(positivePercentageColorField);
        return this;
    }

    public CoinListWidgets typePositivePercentageColorText(String colorText) {
        utils.sendKeysAction(positivePercentageColorField, colorText);
        return this;
    }

    public String getNegativePercentageColorText() {
        return utils.getText(negativePercentageColorField);
    }

    public CoinListWidgets clearNegativePercentageColorText() {
        utils.clear(negativePercentageColorField);
        return this;
    }

    public CoinListWidgets typeNegativePercentageColorText(String colorText) {
        utils.sendKeysAction(negativePercentageColorField, colorText);
        return this;
    }

    public String getWidgetBorderColorText() {
        return utils.getText(widgetBorderColorField);
    }

    public CoinListWidgets clearWidgetBorderColorText() {
        utils.clear(widgetBorderColorField);
        return this;
    }

    public CoinListWidgets typeWidgetBorderColorText(String colorText) {
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

    public String getPositivePercentageColor() {
        return utils.getCSSValue(positivePercentageColor, "color");
    }

    public String getNegativePercentageColor() {
        return utils.getCSSValue(negativePercentageColor, "color");
    }

    public String getWidgetBorderColor() {
        return utils.getCSSValue(widgetBorderColor, "color");
    }

}
