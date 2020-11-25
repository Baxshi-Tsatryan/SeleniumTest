package PagesTests.WidgetsTests;

import AllPages.WidgetsPage.CoinListWidgets;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CoinListWidgetsTest extends Driver {

    AllURLs allURLs;
    CoinListWidgets widget;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        widget = new CoinListWidgets(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test (priority = 1)
    public void coinListWidget()
    {
        allURLs.navigateToCoinListWidgetLargePage();

        widget.getCurrentType();
        widget.clickOnTypeDropDown();
        widget.clickOnMedium();
        widget.clickOnTypeDropDown();
        widget.clickOnSmall();
        widget.clickOnTypeDropDown();
        widget.clickOnLarge();
        widget.clickOnTopCoinsList();
        widget.clickOnCoinsCountDropDown();
        widget.clickOnCoinsCountDropDown();
        widget.clickOnCustomCoinsList();
        widget.getCurrentTheme();
        widget.clickOnThemeDropDown();
        widget.clickOnLightMode();
        widget.clickOnThemeDropDown();
        widget.clickOnDarkMode();
        widget.getCurrentCurrency();
        widget.clickOnCurrencyDropDown();
        widget.clickOnCurrencyDropDown();
        widget.getWidth();

    }

    @Test (priority = 2)
    public void colors()
    {
        allURLs.navigateToCoinListWidgetLargePage();

        widget.getBackgroundColorText();
        widget.getTextColorText();
        widget.getPositivePercentageColorText();
        widget.getNegativePercentageColorText();
        widget.getWidgetBorderColorText();

        widget.getBackgroundColor();
        widget.getTextColor();
        widget.getPositivePercentageColor();
        widget.getNegativePercentageColor();
        widget.getWidgetBorderColor();

    }

}
