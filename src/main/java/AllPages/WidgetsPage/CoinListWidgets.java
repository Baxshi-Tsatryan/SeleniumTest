package AllPages.WidgetsPage;

import MainPackage.SeleniumUtils;
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

    public String getCurrentType()
    {
        return utils.getText(typeDropDown);
    }

    public void clickOnTypeDropDown()
    {
        utils.clickOnElement(typeDropDown);
    }

    public void clickOnLarge()
    {
        utils.clickOnElement(largeType);
    }

    public void clickOnMedium()
    {
        utils.clickOnElement(mediumType);
    }

    public void clickOnSmall()
    {
        utils.clickOnElement(smallType);
    }

    public void clickOnCustomCoinsList()
    {
        utils.clickOnElement(customCoinsList);
    }

    public Boolean customCoinsListIsEnabled()
    {
        return utils.isEnabled(customCoinsList);
    }

    public Boolean customCoinsListIsSelected()
    {
        return utils.isSelected(customCoinsList);
    }

    public void clickOnTopCoinsList()
    {
        utils.clickOnElement(topCoinsList);
    }

    public Boolean topCoinsListIsEnabled()
    {
        return utils.isEnabled(topCoinsList);
    }

    public Boolean topCoinsListIsSelected()
    {
        return utils.isSelected(topCoinsList);
    }

    public void typeCustomCoin(String coinName)
    {
        utils.sendKeys(searchFieldCustomCoins, coinName);
    }

    public String getCurrentCoinsCount()
    {
        return utils.getText(coinsCountDropDown);
    }

    public void clickOnCoinsCountDropDown()
    {
        utils.clickOnElement(coinsCountDropDown);
    }

    public String getTheme()
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

    public String getCurrentTheme()
    {
        return utils.getText(themeDropDown);
    }


    // Color field

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

    public String getPositivePercentageColorText()
    {
        return utils.getText(positivePercentageColorField);
    }

    public void clearPositivePercentageColorText()
    {
        utils.clear(positivePercentageColorField);
    }

    public void typePositivePercentageColorText(String colorText)
    {
        utils.sendKeys(positivePercentageColorField, colorText);
    }

    public String getNegativePercentageColorText()
    {
        return utils.getText(negativePercentageColorField);
    }

    public void clearNegativePercentageColorText()
    {
        utils.clear(negativePercentageColorField);
    }

    public void typeNegativePercentageColorText(String colorText)
    {
        utils.sendKeys(negativePercentageColorField, colorText);
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

    public String getPositivePercentageColor()
    {
        return utils.getCSSValue(positivePercentageColor, "color");
    }

    public String getNegativePercentageColor()
    {
        return utils.getCSSValue(negativePercentageColor, "color");
    }

    public String getWidgetBorderColor()
    {
        return utils.getCSSValue(widgetBorderColor, "color");
    }

}
