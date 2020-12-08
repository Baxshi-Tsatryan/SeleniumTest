package AllPages.WidgetsPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoinCalcWidgets {

    WebDriver driver;
    SeleniumUtils utils;

    public CoinCalcWidgets(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }


    // On Widget

    // Invest

    By investInvestedButton = By.cssSelector("div.coin-stats-calculator-container > div:nth-of-type(1) > div");

    By firstField = By.cssSelector("div.coin-stats-calculator-container > div > [type='number']");

    By coinName = By.cssSelector("div.coin-stats-calculator-container > div:nth-of-type(3) span");

    By searchCoinField = By.cssSelector("[placeholder='crypto name']");

    By investSecondField = By.cssSelector("div.coin-stats-calculator-container > div > div > [type='number']");

    By result = By.cssSelector("div.coin-stats-calculator-container > div:nth-of-type(5) > div");


    // Invested

    By investedCoinName = By.cssSelector("div.coin-stats-calculator-container > div > div > span");

    By investedDate = By.cssSelector("input[type='date']");


    // Settings

    By typeDropDown = By.cssSelector("div.second-column > div:nth-of-type(1) > .jsx-1751315535 > .jsx-1751315535");

    By investType = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By investedType = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By themeDropDown = By.cssSelector("div.second-column > div:nth-of-type(2) > .jsx-1751315535 > .jsx-1751315535");

    By darkMode = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By lightMode = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By currenciesDropDown = By.cssSelector("div.second-column > div:nth-of-type(3) > .jsx-1751315535 > .jsx-1751315535");

    By isEditable = By.cssSelector("div.toggle-editable .switcher-check");


    // Colors field

    By backgroundColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(1) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By textColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(1) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By selectionColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(2) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By widgetBorderColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(2) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");


    // Colors

    By backgroundColor = By.cssSelector("tbody > tr:nth-of-type(1) > td:nth-of-type(1) .widget-color-rectangle");

    By textColor = By.cssSelector("tbody > tr:nth-of-type(1) > td:nth-of-type(2) .widget-color-rectangle");

    By selectionColor = By.cssSelector("tbody > tr:nth-of-type(2) > td:nth-of-type(1) .widget-color-rectangle");

    By widgetBorderColor = By.cssSelector("tbody > tr:nth-of-type(2) > td:nth-of-type(2) .widget-color-rectangle");



    // ------------------------------------------------ Methods ---------------------------------------------------------

    // On Widget

    public String getInvestInvested()
    {
        return utils.getText(investInvestedButton);
    }

    public void clickOnInvestInvested()
    {
        utils.clickOnElement(investInvestedButton);
    }

    public String getFirstFieldPrice()
    {
        return utils.getText(firstField);
    }

    public void clearFirstFieldPrice()
    {
        utils.clear(firstField);
    }

    public void typeFirstFieldPrice(String firstPrice)
    {
        utils.sendKeysAction(firstField, firstPrice);
    }

    public void clickOnCoinName()
    {
        utils.clickOnElement(coinName);
    }

    public String getCurrentCoinName()
    {
        return utils.getText(coinName);
    }

    public void typeCoinName(String coinName)
    {
        utils.sendKeysAction(searchCoinField, coinName);
    }

    public void clearCoinName()
    {
        utils.clear(searchCoinField);
    }

    public String getInvestSecondFieldPrice()
    {
        return utils.getText(investSecondField);
    }

    public void clearInvestSecondFieldPrice()
    {
        utils.clear(investSecondField);
    }

    public void typeInvestSecondFieldPrice(String secondPrice)
    {
        utils.sendKeysAction(investSecondField, secondPrice);
    }

    public String getResult()
    {
        return utils.getText(result);
    }

    public void clickOnInvestedDate()
    {
        utils.clickOnElement(investedDate);
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

    public void clickOnInvestType()
    {
        utils.clickOnElement(investType);
    }

    public void clickOnInvestedType()
    {
        utils.clickOnElement(investedType);
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
        return utils.getText(currenciesDropDown);
    }

    public void clickOnCurrencyDropDown()
    {
        utils.clickOnElement(currenciesDropDown);
    }

    public void clickOnIsEditable()
    {
        utils.clickOnElement(isEditable);
    }

    public Boolean isEditableIsSelected()
    {
        return utils.isSelected(isEditable);
    }

    public Boolean isEditableIsEnabled()
    {
        return utils.isEnabled(isEditable);
    }


    // Colors Fields

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

    public String getSelectionColorText()
    {
        return utils.getText(selectionColorField);
    }

    public void clearSelectionColorText()
    {
        utils.clear(selectionColorField);
    }

    public void typeSelectionColorText(String colorText)
    {
        utils.sendKeysAction(selectionColorField, "color");
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

    public String getTextColor()
    {
        return utils.getCSSValue(textColor, "color");
    }

    public String getSelectionColor()
    {
        return utils.getCSSValue(selectionColor, "color");
    }

    public String getWidgetBorderColor()
    {
        return utils.getCSSValue(widgetBorderColor, "color");
    }

}
