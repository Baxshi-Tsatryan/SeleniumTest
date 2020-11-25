package PagesTests.WidgetsTests;

import AllPages.WidgetsPage.CoinPriceWidgets;
import AllPages.WidgetsPage.InsightWidgets;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class InsightsWidgetsTest extends Driver {

    AllURLs allURLs;
    InsightWidgets widget;
    SeleniumUtils utils;
    CoinPriceWidgets widgets;

    @BeforeClass
    public void beforeClass() {

        widgets = new CoinPriceWidgets(driver);
        allURLs = new AllURLs(driver);
        widget = new InsightWidgets(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test (priority = 1)
    public void insightsWidgetsOnWidget()
    {
        allURLs.navigateToInsightWidgetHowManyCoinStatsUsersHoldBTCPage();

        widget.getFirstInsightPercent();
        widget.clickOnFirstInsightShowChart();
        ArrayList<String> tabs0 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs0.get(1));
        driver.close();
        driver.switchTo().window(tabs0.get(0));

        allURLs.navigateToInsightWidgetBTCDominanceInCoinStatsPortfoliosPage();
        widget.getSecondInsightPercent();
        widget.clickOnSecondInsightShowChart();
        ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        driver.close();
        driver.switchTo().window(tabs1.get(0));

        allURLs.navigateToInsightWidgetWhereCoinStatsUsersHoldBTCPage();
        widget.getThirdInsightPercent();
        widget.getThirdInsightWalletPercent();
        widget.getThirdInsightExchangePercent();
        widget.clickOnThirdInsightShowChart();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));

        allURLs.navigateToInsightWidgetBTCTradesTodayPage();
        widget.getForthInsightPercent();
        widget.getForthInsightBuyPercent();
        widget.getForthInsightSellPercent();
        widget.clickOnForthInsightShowChart();
        ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(1));
        driver.close();
        driver.switchTo().window(tabs3.get(0));

    }

    @Test (priority = 2)
    public void insightsWidget()
    {
        allURLs.navigateToInsightWidgetHowManyCoinStatsUsersHoldBTCPage();

        widget.getCurrentInsightType();
        widget.clickOnInsightTypeDropDown();
        widget.clickOnFirstInsightType();
        widget.clickOnInsightTypeDropDown();
        widget.clickOnSecondInsightType();
        widget.clickOnInsightTypeDropDown();
        widget.clickOnThirdInsightType();
        widget.clickOnInsightTypeDropDown();
        widget.clickOnForthInsightType();
        widget.getCurrentCoin();
        widget.clickOnClearCurrentCoin();
        widget.typeCoinName("b");
        widgets.clickOnAllCoins();
        widget.getCurrentTheme();
        widget.clickOnThemeDropDown();
        widget.clickOnLightMode();
        widget.clickOnThemeDropDown();
        widget.clickOnDarkMode();

    }

    @Test (priority = 3)
    public void colors()
    {
        allURLs.navigateToInsightWidgetHowManyCoinStatsUsersHoldBTCPage();

        widget.getBackgroundColorText();
        widget.getTextColorText();
        widget.getChartPrimaryColorText();
        widget.getChartSecondaryColorText();
        widget.getButtonColorText();
        widget.getWidgetBorderColorText();

        widget.getBackgroundColor();
        widget.getTextColor();
        widget.getChartPrimaryColor();
        widget.getChartSecondaryColor();
        widget.getButtonColor();
        widget.getWidgetBorderColor();

    }


}
