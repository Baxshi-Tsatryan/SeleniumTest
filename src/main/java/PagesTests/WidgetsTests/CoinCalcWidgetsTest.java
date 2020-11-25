package PagesTests.WidgetsTests;

import AllPages.WidgetsPage.CoinCalcWidgets;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CoinCalcWidgetsTest extends Driver {

    AllURLs allURLs;
    CoinCalcWidgets widget;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        widget = new CoinCalcWidgets(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test (priority = 1)
    public void coinCalcWidgetOnWidget() throws InterruptedException {

        allURLs.navigateToCoinCalcWidgetPage();

        Thread.sleep(3000);
        widget.typeFirstFieldPrice("12");
        //widget.clickOnCoinName();
        widget.typeCoinName("b");
        widget.typeInvestSecondFieldPrice("21");
        widget.getResult();
        widget.clickOnInvestInvested();
        widget.clickOnInvestedDate();

    }

    @Test (priority = 2)
    public void coinCalcWidget()
    {
        allURLs.navigateToCoinCalcWidgetPage();

        widget.getCurrentType();
        widget.clickOnTypeDropDown();
        widget.clickOnInvestedType();
        widget.clickOnTypeDropDown();
        widget.clickOnInvestType();
        widget.getCurrentTheme();
        widget.clickOnThemeDropDown();
        widget.clickOnLightMode();
        widget.clickOnThemeDropDown();
        widget.clickOnDarkMode();
        widget.getCurrentCurrency();
        widget.clickOnCurrencyDropDown();
        widget.clickOnCurrencyDropDown();
        widget.clickOnIsEditable();

    }

    @Test (priority = 3)
    public void colors()
    {
        allURLs.navigateToCoinCalcWidgetPage();

        widget.getBackgroundColorText();
        widget.getTextColorText();
        widget.getSelectionColorText();
        widget.getWidgetBorderColorText();

        widget.getBackgroundColor();
        widget.getTextColor();
        widget.getSelectionColor();
        widget.getWidgetBorderColor();

    }

}
