package PagesTests.WidgetsTests;

import AllPages.WidgetsPage.CoinPriceWidgets;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class CoinPriceWidgetsTest extends Driver {
    AllURLs allURLs;
    CoinPriceWidgets widget;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        widget = new CoinPriceWidgets(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test (priority = 1)
    public void coinPriceWidgetOnWidget() throws InterruptedException {

        allURLs.navigateToCoinPriceWidgetLargePage();
        Thread.sleep(3000);
        widget.getCoinName();
        widget.getCoinIndex();
        widget.getCoinPrice();
        widget.getCoinPercentLarge();
        widget.getCoinPriceBTCLarge();
        widget.getCoinPercentBTCLarge();
        widget.getCoinPercentColorLarge();
        widget.getCoinPercentColorLarge();
        widget.clickOnWidgetLarge();
        ArrayList<String> tabs0 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs0.get(1));
        driver.close();
        driver.switchTo().window(tabs0.get(0));

        allURLs.navigateToCoinPriceWidgetMediumPage();
        widget.getCoinPercentMedium();
        widget.getCoinPercentColorMedium();

        allURLs.navigateToCoinPriceWidgetSmallPage();
        widget.getCoinPriceSmall();
        widget.getCoinPriceColorSmall();
        widget.clickOnWidgetSmall();

    }

    @Test (priority = 2)
    public void coinPriceWidget()
    {
        allURLs.navigateToCoinPriceWidgetLargePage();

        widget.getCurrentType();
        widget.clickOnTypeDropDown();
        widget.clickOnSmallType();
        widget.clickOnTypeDropDown();
        widget.clickOnMediumType();
        widget.clickOnTypeDropDown();
        widget.clickOnLargeType();
        widget.getCurrentCoin();
        widget.clickOnClearCurrentCoin();
        widget.typeCoinName("b");
        widget.clickOnAllCoins();
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

        allURLs.navigateToCoinPriceWidgetLargePage();
        widget.getBackgroundColorText();
        widget.getTextColorText();
        widget.getPercentageArrowUpColorText();
        widget.getPercentageArrowDownColorText();
        widget.getRankBackgroundColorText();
        widget.getRankTextColorText();
        widget.getWidgetBorderColorText();

        widget.getBackgroundColor();
        widget.getTextColor();
        widget.getPercentageArrowUpColor();
        widget.getPercentageArrowDownColor();
        widget.getRankBackgroundColor();
        widget.getRankTextColor();
        widget.getWidgetBorderColor();

        allURLs.navigateToCoinPriceWidgetSmallPage();
        widget.getBackgroundColorTextSmall();
        widget.getTextColorTextSmall();
        widget.getWidgetBorderColorTextSmall();

        widget.getBackgroundColorSmall();
        widget.getTextColorSmall();
        widget.getWidgetBorderColorSmall();

    }

}
