package PagesTests;

import AllPages.Report24h;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.openqa.selenium.Cookie;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Report24hTest extends Driver {

    AllURLs allURLs;
    Report24h report24h;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        report24h = new Report24h(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test
    public void report24hPage()
    {

        allURLs.navigateTo24hReportPage();

        // Portfolio

        report24h.clickOnSetupPortfolio();
        utils.goToBackPage();
        driver.manage().addCookie(new Cookie("userData", "eyJzZXNzaW9uVG9rZW4iOiJyOjI0MTEwNzEwNDRhMDllMjc4YTAyYTU4YmQ1NWU3MzIxIn0="));
        driver.navigate().refresh();

        report24h.getCurrentValue();
        report24h.get24hChangePrice();
        report24h.get24hChangePercent();
        report24h.get24hChangePercentColor();
        report24h.getTopPerformingCoinPrice();
        report24h.getTopPerformingCoinPercent();

        // Market Overview

        report24h.getMarketOverviewFirstIndex();
        report24h.getMarketOverviewSecondIndex();
        report24h.getMarketOverviewThirdIndex();
        report24h.getMarketOverviewFirstName();
        report24h.getMarketOverviewSecondName();
        report24h.getMarketOverviewThirdName();
        report24h.clickOnMarketOverviewFirstCoin();
        allURLs.navigateTo24hReportPage();
        report24h.clickOnMarketOverviewSecondCoin();
        allURLs.navigateTo24hReportPage();
        report24h.clickOnMarketOverviewThirdCoin();
        allURLs.navigateTo24hReportPage();
        report24h.getMarketOverviewFirstPrice();
        report24h.getMarketOverviewSecondPrice();
        report24h.getMarketOverviewThirdPrice();
        report24h.getMarketOverviewFirstPercent();
        report24h.getMarketOverviewSecondPercent();
        report24h.getMarketOverviewThirdPercent();
        report24h.clickOnMarketOverviewViewLivePricesButton();
        allURLs.navigateTo24hReportPage();

        // Top Volume (24h)

        report24h.getTopVolume24hFirstIndex();
        report24h.getTopVolume24hSecondIndex();
        report24h.getTopVolume24hThirdIndex();
        report24h.getTopVolume24hFirstName();
        report24h.getTopVolume24hSecondName();
        report24h.getTopVolume24hThirdName();
        report24h.clickOnTopVolume24hFirstCoin();
        allURLs.navigateTo24hReportPage();
        report24h.clickOnTopVolume24hSecondCoin();
        allURLs.navigateTo24hReportPage();
        report24h.clickOnTopVolume24hThirdCoin();
        allURLs.navigateTo24hReportPage();
        report24h.getTopVolume24hFirstPrice();
        report24h.getTopVolume24hSecondPrice();
        report24h.getTopVolume24hThirdPrice();
        report24h.clickOnTopVolume24hViewLivePricesButton();
        allURLs.navigateTo24hReportPage();

        // Top Gainers

        report24h.getTopGainersFirstIndex();
        report24h.getTopGainersSecondIndex();
        report24h.getTopGainersThirdIndex();
        report24h.getTopGainersFirstName();
        report24h.getTopGainersSecondName();
        report24h.getTopGainersThirdName();
        report24h.clickOnTopGainersFirstCoin();
        allURLs.navigateTo24hReportPage();
        report24h.clickOnTopGainersSecondCoin();
        allURLs.navigateTo24hReportPage();
        report24h.clickOnTopGainersThirdCoin();
        allURLs.navigateTo24hReportPage();
        report24h.getTopGainersFirstPrice();
        report24h.getTopGainersSecondPrice();
        report24h.getTopGainersThirdPrice();
        report24h.getTopGainersFirstPercent();
        report24h.getTopGainersSecondPercent();
        report24h.getTopGainersThirdPercent();

        // Top Losers

        report24h.getTopLosersFirstIndex();
        report24h.getTopLosersSecondIndex();
        report24h.getTopLosersThirdIndex();
        report24h.getTopLosersFirstName();
        report24h.getTopLosersSecondName();
        report24h.getTopLosersThirdName();
        report24h.clickOnTopLosersFirstCoin();
        allURLs.navigateTo24hReportPage();
        report24h.clickOnTopLosersSecondCoin();
        allURLs.navigateTo24hReportPage();
        report24h.clickOnTopLosersThirdCoin();
        allURLs.navigateTo24hReportPage();
        report24h.getTopLosersFirstPrice();
        report24h.getTopLosersSecondPrice();
        report24h.getTopLosersThirdPrice();
        report24h.getTopLosersFirstPercent();
        report24h.getTopLosersSecondPercent();
        report24h.getTopLosersThirdPercent();

        // Top Exchanges

        report24h.getTopExchangesFirstIndex();
        report24h.getTopExchangesSecondIndex();
        report24h.getTopExchangesThirdIndex();
        report24h.getTopExchangesFirstName();
        report24h.getTopExchangesSecondName();
        report24h.getTopExchangesThirdName();
        report24h.clickOnTopExchangesFirstCoin();
        allURLs.navigateTo24hReportPage();
        report24h.clickOnTopExchangesSecondCoin();
        allURLs.navigateTo24hReportPage();
        report24h.clickOnTopExchangesThirdCoin();
        allURLs.navigateTo24hReportPage();
        report24h.getTopExchangesFirstPrice();
        report24h.getTopExchangesSecondPrice();
        report24h.getTopExchangesThirdPrice();
        report24h.clickOnMoreExchangesButton();
        allURLs.navigateTo24hReportPage();

        // Subscription

        report24h.typeEmailForSubscribtion("asd");
        report24h.clickOnSubscribe();

    }




}
