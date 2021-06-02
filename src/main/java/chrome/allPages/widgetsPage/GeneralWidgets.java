package chrome.allPages.widgetsPage;

import chrome.mainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeneralWidgets {

    WebDriver driver;
    SeleniumUtils utils;

    public GeneralWidgets(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    // Portfolio Widget

    By portfolioWidgetLarge = By.cssSelector("[src='/_next/static/images/largePortfolioWidget-298d7d427530449f071c868ec6411e58.png']");

    By portfolioWidgetMedium = By.cssSelector("[src='/_next/static/images/portfolioWidgetM-1173e9992271ccf3f92b922d0d4e2735.png']");

    By portfolioWidgetSmall = By.cssSelector("[src='/_next/static/images/portfolioWidgetS-de385d708555b4e0b7d9053837e0e5c8.png']");


    // Coin Price Widgets

    By coinPriceWidgetLarge = By.cssSelector("[src='/_next/static/images/coin_L-584969e477e05c280953340b964cb65f.png']");

    By coinPriceWidgetMedium = By.cssSelector("[src='/_next/static/images/coin_M-fc3c6dd753e2c0eee945518d60575081.png']");

    By coinPriceWidgetSmall = By.cssSelector("#__next > main > div > div:nth-child(2) > div > div.jsx-2728094565.coin-price-widget-s > img");


    // Coin List Widget

    By coinListWidgetLarge = By.cssSelector("[src='/_next/static/images/list_L-7136b3a8f04d58749b8d5483d555007f.png']");

    By coinListWidgetMedium = By.cssSelector("[src='/_next/static/images/list_M-cb632fd0f1bdf3472a9fad986f485555.png']");

    By coinListWidgetSmall = By.cssSelector("[src='/_next/static/images/list_S-9c3c485cd64881d677a7217791caf0d0.png']");


    // Coin Price Chart Widget

    By coinPriceChartWidgetLarge = By.cssSelector("[src='/_next/static/images/chart_L-3b3352d33610ba4d92ae78d85c1fb7a0.png']");

    By coinPriceChartWidgetMedium = By.cssSelector("[src='/_next/static/images/chart_M-1b725a22f581d9ee8ef9401ae5eac3b1.png']");


    // Insight Widget

    By firstInsight = By.cssSelector("[src='/_next/static/images/insight_1-c9991b27ec9e16baa7df60d1d71ce166.png']");

    By secondInsight = By.cssSelector("[src='/_next/static/images/insight_2-80f124e507675edce8f649b63e484677.png']");

    By thirdInsight = By.cssSelector("[src='/_next/static/images/insight_3-dffdca1296d2af13eae325a1c927376e.png']");

    By forthInsight = By.cssSelector("[src='/_next/static/images/insight_4-94495cd3ae7088a42c8e61f6468d5065.png']");


    // Converter Widget

    By converterWidgetLarge = By.cssSelector("[src='/_next/static/images/converter_L-dff5fefb167f1b15262c00228c72a31e.png']");

    By converterWidgetMedium = By.cssSelector("[src='/_next/static/images/converter_M-da57b10beaccac2185e7b4e49a070f44.png']");

    By converterWidgetSmall = By.cssSelector("#__next > main > div > div:nth-child(6) > div > div.jsx-1097841964.converter-widget-3 > img");


    // Coin Calc Widget

    By coinCalcWidget = By.cssSelector("[src='/_next/static/images/coincalc-d6b56228b4f102c8f10f32ec34f96f60.png']");


    // Coin Price Marquee Widget

    By coinPriceMarqueeWidget = By.cssSelector("[src='/_next/static/images/marquee-94d3fbda0aa9f6d31adac5c5a0f7b6a4.png']");


    // For All Widgets

    By scriptTab = By.cssSelector("ul.inline-tabs > li:nth-of-type(1) > .tab-label");

    By scriptCode = By.cssSelector(".widget-code-container");

    By wordpressConfigTab = By.cssSelector("ul.inline-tabs > li:nth-of-type(2) > .tab-label");

    By wordpressConfigCode = By.cssSelector(".widget-code-container");


    // ------------------------------------------------------ Methods -------------------------------------------------

    // Coin Price Widget

    public GeneralWidgets clickOnCoinPriceWidgetLarge() {
        utils.click(coinPriceWidgetLarge);
        return this;
    }

    public GeneralWidgets clickOnCoinPriceWidgetMedium() {
        utils.click(coinPriceWidgetMedium);
        return this;
    }

    public GeneralWidgets clickOnCoinPriceWidgetSmall() {
        utils.click(coinPriceWidgetSmall);
        return this;
    }


    // Coin List Widget

    public GeneralWidgets clickOnCoinListWidgetLarge() {
        utils.click(coinListWidgetLarge);
        return this;
    }

    public GeneralWidgets clickOnCoinListWidgetMedium() {
        utils.click(coinListWidgetMedium);
        return this;
    }

    public GeneralWidgets clickOnCoinListWidgetSmall() {
        utils.click(coinListWidgetSmall);
        return this;
    }


    // Coin Price Chart Widget

    public GeneralWidgets clickOnCoinPriceChartWidgetLarge() {
        utils.click(coinPriceChartWidgetLarge);
        return this;
    }

    public GeneralWidgets clickOnCoinPriceChartWidgetMedium() {
        utils.click(coinPriceChartWidgetMedium);
        return this;
    }


    // Insight Widget

    public GeneralWidgets clickOnFirstInsightWidget() {
        utils.click(firstInsight);
        return this;
    }

    public GeneralWidgets clickOnSecondInsightWidget() {
        utils.click(secondInsight);
        return this;
    }

    public GeneralWidgets clickOnThirdInsightWidget() {
        utils.click(thirdInsight);
        return this;
    }

    public GeneralWidgets clickOnForthInsightWidget() {
        utils.click(forthInsight);
        return this;
    }


    // Converter Widget

    public GeneralWidgets clickOnConverterWidgetLarge() {
        utils.click(converterWidgetLarge);
        return this;
    }

    public GeneralWidgets clickOnConverterWidgetMedium() {
        utils.click(converterWidgetMedium);
        return this;
    }

    public GeneralWidgets clickOnConverterWidgetSmall() {
        utils.click(converterWidgetSmall);
        return this;
    }


    // Coin Calc Widget

    public GeneralWidgets clickOnCoinCalcWidget() {
        utils.click(coinCalcWidget);
        return this;
    }


    // Coin Price Marquee Widget

    public GeneralWidgets clickOnCoinPriceMarqueeWidget() {
        utils.click(coinPriceMarqueeWidget);
        return this;
    }


    // All Widgets

    public GeneralWidgets clickOnScriptTab() {
        utils.click(scriptTab);
        return this;
    }

    public String getScriptCode() {
        return utils.getText(scriptCode);
    }

    public GeneralWidgets clickOnWordpressConfigTab() {
        utils.click(wordpressConfigTab);
        return this;
    }

    public String getWordpressConfigCode() {
        return utils.getText(wordpressConfigCode);
    }

}
