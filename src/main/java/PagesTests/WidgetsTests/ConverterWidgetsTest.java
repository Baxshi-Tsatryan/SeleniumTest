package PagesTests.WidgetsTests;

import AllPages.WidgetsPage.CoinPriceWidgets;
import AllPages.WidgetsPage.ConverterWidgets;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConverterWidgetsTest extends Driver {
    AllURLs allURLs;
    CoinPriceWidgets widgets;
    ConverterWidgets widget;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        widgets = new CoinPriceWidgets(driver);
        widget = new ConverterWidgets(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test (priority = 1)
    public void converterWidgetOnWidget() throws InterruptedException {
        allURLs.navigateToConverterLargeWidgetPage();
        Thread.sleep(3000);
        widget.getFirstCoinNameLarge();
        widget.getFirstCoinPriceLarge();
        widget.getSecondCoinNameLarge();
        widget.getSecondCoinPriceLarge();
        widget.clickOnReverse();

        allURLs.navigateToConverterMediumWidgetPage();
        Thread.sleep(3000);
        widget.getFirstCoinNameMedium();
        widget.getFirstCoinPriceMedium();
        widget.getSecondCoinNameMedium();
        widget.getSecondCoinPriceMedium();

        allURLs.navigateToConverterSmallWidgetPage();
        Thread.sleep(3000);
        widget.getFirstCoinSymbolSmall();
        widget.getSecondCoinSymbolSmall();
        widget.getFirstCoinPriceSmall();
        widget.getSecondCoinPriceSmall();

    }

    @Test (priority = 2)
    public void converterWidget()
    {

        allURLs.navigateToConverterLargeWidgetPage();

        widget.getCurrentType();
        widget.clickOnTypeDropDown();
        widget.clickOnMediumType();
        widget.clickOnTypeDropDown();
        widget.clickOnSmallType();
        widget.clickOnTypeDropDown();
        widget.clickOnLargeType();
      //  widget.getCurrentSellCoinName();
      //  widget.clickOnClearCurrentSellCoin();
      //  widget.typeSellCoin("b");
      //  widgets.clickOnAllCoins();
      //  widget.getCurrentBuyCoinName();
      //  widget.clickOnClearCurrentBuyCoin();
      //  widget.typeBuyCoin("b");
      //  widgets.clickOnAllCoins();
        widget.getCurrentTheme();
        widget.clickOnThemeDropDown();
        widget.clickOnLightMode();
        widget.clickOnThemeDropDown();
        widget.clickOnDarkMode();
        widget.getWidth();

    }

    @Test (priority = 3)
    public void colors()
    {
        allURLs.navigateToConverterLargeWidgetPage();

        widget.getBackgroundColorText();
        widget.getTextColorText();
        widget.getWidgetBorderColorText();
        widget.getRotateButtonColorText();

        widget.getBackgroundColor();
        widget.getTextColor();
        widget.getWidgetBorderColor();
        widget.getRotateButtonColor();

    }


}
