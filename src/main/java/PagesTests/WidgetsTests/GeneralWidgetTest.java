package PagesTests.WidgetsTests;

import AllPages.WidgetsPage.GeneralWidgets;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GeneralWidgetTest extends Driver {

    AllURLs allURLs;
    GeneralWidgets widgets;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        widgets = new GeneralWidgets(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test
    public void generalWidget()
    {
        allURLs.navigateToWidgetsPage();

        widgets.clickOnCoinPriceWidgetLarge();
        allURLs.navigateToWidgetsPage();
        widgets.clickOnCoinPriceWidgetMedium();
        allURLs.navigateToWidgetsPage();
        //widgets.clickOnCoinPriceWidgetSmall();
        //allURLs.navigateToWidgetsPage();

        widgets.clickOnCoinListWidgetLarge();
        allURLs.navigateToWidgetsPage();
        widgets.clickOnCoinListWidgetMedium();
        allURLs.navigateToWidgetsPage();
        widgets.clickOnCoinListWidgetSmall();
        allURLs.navigateToWidgetsPage();

        widgets.clickOnCoinPriceChartWidgetLarge();
        allURLs.navigateToWidgetsPage();
        widgets.clickOnCoinPriceChartWidgetMedium();
        allURLs.navigateToWidgetsPage();

        widgets.clickOnFirstInsightWidget();
        allURLs.navigateToWidgetsPage();
        widgets.clickOnSecondInsightWidget();
        allURLs.navigateToWidgetsPage();
        widgets.clickOnThirdInsightWidget();
        allURLs.navigateToWidgetsPage();
        widgets.clickOnForthInsightWidget();
        allURLs.navigateToWidgetsPage();

        widgets.clickOnConverterWidgetLarge();
        allURLs.navigateToWidgetsPage();
        widgets.clickOnConverterWidgetMedium();
        allURLs.navigateToWidgetsPage();
       // widgets.clickOnConverterWidgetSmall();
       // allURLs.navigateToWidgetsPage();

        widgets.clickOnCoinCalcWidget();
        allURLs.navigateToWidgetsPage();

        widgets.clickOnCoinPriceMarqueeWidget();
        widgets.clickOnWordpressConfigTab();
        widgets.getWordpressConfigCode();
        widgets.clickOnScriptTab();
        widgets.getScriptCode();

    }



}
