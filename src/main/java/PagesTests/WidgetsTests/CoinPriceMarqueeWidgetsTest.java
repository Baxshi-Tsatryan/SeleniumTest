package PagesTests.WidgetsTests;

import AllPages.WidgetsPage.CoinPriceMarqueeWidgets;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CoinPriceMarqueeWidgetsTest extends Driver {
    AllURLs allURLs;
    CoinPriceMarqueeWidgets widget;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        widget = new CoinPriceMarqueeWidgets(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test
    public void coinPriceMarqueeWidget()
    {
        allURLs.navigateToCoinPricesMarqueeWidgetPage();

        widget.getCurrentPosition();
        widget.clickOnNextStatic();
        widget.clickOnPreviousStatic();

        widget.clickOnPositionDropDown();
        widget.clickOnFixedTopPosition();

        widget.clickOnNextFixedTop();
        widget.clickOnPreviousFixedTop();

        widget.clickOnPositionDropDown();
        widget.clickOnFixedBottomPosition();

        widget.clickOnNextFixedBottom();
        widget.clickOnPreviousFixedBottom();

        widget.getCurrentCoinsCount();
        widget.clickOnCoinsCountDropDown();
        widget.clickOnCoinsCountDropDown();

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

    @Test
    public void colors()
    {
        allURLs.navigateToCoinPricesMarqueeWidgetPage();

        widget.getBackgroundColorText();
        widget.getTextColorText();
        widget.getPercentageArrowUpColorText();
        widget.getPercentageArrowDownColorText();
        widget.getNavigationButtonsColorText();
        widget.getWidgetBorderColorText();

        widget.getBackgroundColor();
        widget.getTextColor();
        widget.getPercentageArrowUpColor();
        widget.getPercentageArrowDownColor();
        widget.getNavigationButtonsColor();
        widget.getWidgetBorderColor();

    }



}
