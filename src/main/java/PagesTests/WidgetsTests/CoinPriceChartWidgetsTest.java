package PagesTests.WidgetsTests;

import AllPages.WidgetsPage.CoinPriceChartWidgets;
import AllPages.WidgetsPage.CoinPriceWidgets;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CoinPriceChartWidgetsTest extends Driver {

    AllURLs allURLs;
    CoinPriceChartWidgets widget;
    CoinPriceWidgets widgets;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        widget = new CoinPriceChartWidgets(driver);
        widgets = new CoinPriceWidgets(driver);
        utils = new SeleniumUtils(driver);
    }


    @Test (priority = 1)
    public void coinPriceChartWidgetOnWidget()
    {
        allURLs.navigateToCoinPriceChartWidgetLargePage();

        widget.get24hChangeLarge();
        widget.clickOnCandleLineChart();
        widget.clickOnChart24h();
        widget.clickOnChart1w();
        widget.clickOnChart1m();
        widget.clickOnChart3m();
        widget.clickOnChart6m();
        widget.clickOnChart1y();
        widget.clickOnChartAll();

        widget.clickOnChartUSD();
        widget.clickOnChartBTC();
        widget.clickOnChartETH();

    }

    @Test (priority = 2)
    public void coinPriceChartWidget()
    {
        allURLs.navigateToCoinPriceChartWidgetLargePage();

        widget.getCurrentType();
        widget.clickOnTypeDropDown();
        widget.clickOnLightMode();
        widget.clickOnTypeDropDown();
        widget.clickOnDarkMode();
        widget.getCurrentCoin();
        widget.clearCurrentCoin();
        widget.typeCoinName("b");
        widgets.clickOnAllCoins();
        widget.getCurrentTheme();
        widget.clickOnThemeDropDown();
        widget.clickOnLightMode();
        widget.clickOnThemeDropDown();
        widget.clickOnDarkMode();
        widget.getCurrentCurrency();
        widget.clickOnCurrencyDropDown();
        widget.clickOnCurrencyDropDown();
        widget.getWidth();
        widget.getHeight();

    }

    @Test (priority = 3)
    public void colors()
    {
        allURLs.navigateToCoinPriceChartWidgetLargePage();

        widget.getBackgroundColorText();
        widget.getTextColorText();
        widget.getPercentageArrowUpColorText();
        widget.getPercentageArrowDownColorText();
        widget.getChartColorText();
        widget.getButtonsBackgroundColorText();
        widget.getChartGradientFromColorText();
        widget.getChartGradientToColorText();
        widget.getBTCColorTextLarge();
        widget.getETHColorTextLarge();
        widget.getChartLabelBackgroundColorTextLarge();
        widget.getCandleChartGridsColorTextLarge();
        widget.getWidgetBorderColorTextLarge();

        widget.getChartLabelBackgroundColorTextMedium();
        widget.getCandleChartGridsColorTextMedium();
        widget.getWidgetBorderColorTextMedium();

        widget.getBackgroundColor();
        widget.getTextColor();
        widget.getPercentageArrowUpColor();
        widget.getPercentageArrowDownColor();
        widget.getChartColor();
        widget.getButtonsBackgroundColor();
        widget.getChartGradientFromColor();
        widget.getChartGradientToColor();
        widget.getBTCColorLarge();
        widget.getETHColorLarge();
        widget.getChartLabelBackgroundColorLarge();
        widget.getCandleChartGridsColorLarge();
        widget.getWidgetBorderColorLarge();

        widget.getChartLabelBackgroundColorMedium();
        widget.getCandleChartGridsColorMedium();
        widget.getWidgetBorderColorMedium();

    }


}
