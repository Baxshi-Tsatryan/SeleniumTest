package chrome.tests;

import chrome.allPages.CoinGecko;
import chrome.allPages.Report24h;
import chrome.mainPackage.AllURLs;
import chrome.mainPackage.Driver;
import chrome.mainPackage.Paths;
import chrome.mainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Report24hValidationTest extends Driver {

    CoinGecko coinGecko;
    Report24h report24h;
    AllURLs allURLs;
    SeleniumUtils utils;
    Paths paths;

    @BeforeClass
    public void beforeClass() {

        coinGecko = new CoinGecko(driver);
        report24h = new Report24h(driver);
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        paths = new Paths(driver);
    }

    @Test
    public void checkAllDataValidation()
    {
        allURLs.navigateTo24hReportPage();

        // Dev
//        allURLs.navigateToDevMainPage();
//        devServer
//                .clickOnServerDropDown()
//                .clickOnDevServer();
//        allURLs.navigateToDevPortfolioPage();

        // Staging
//        allURLs.navigateToStagingPortfolioPage();


        // CoinStats

        // Market Overview

        String marketOverviewFirstCoinName = report24h.getMarketOverviewFirstName();
        String marketOverviewSecondCoinName = report24h.getMarketOverviewSecondName();
        String marketOverviewThirdCoinName = report24h.getMarketOverviewThirdName();

        String marketOverviewFirstCoinPrice = report24h.getMarketOverviewFirstPrice();
        String marketOverviewSecondCoinPrice = report24h.getMarketOverviewSecondPrice();
        String marketOverviewThirdCoinPrice = report24h.getMarketOverviewThirdPrice();

        String marketOverviewFirstCoinPercent = report24h.getMarketOverviewFirstPercent();
        String marketOverviewSecondCoinPercent = report24h.getMarketOverviewSecondPercent();
        String marketOverviewThirdCoinPercent = report24h.getMarketOverviewThirdPercent();

        // Top Volume (24h)

        String topVolume24hFirstCoinName = report24h.getTopVolume24hFirstName();
        String topVolume24hSecondCoinName = report24h.getTopVolume24hSecondName();
        String topVolume24hThirdCoinName = report24h.getTopVolume24hThirdName();

        String topVolume24hFirstCoinPrice = report24h.getTopVolume24hFirstPrice();
        String topVolume24hSecondCoinPrice = report24h.getTopVolume24hSecondPrice();
        String topVolume24hThirdCoinPrice = report24h.getTopVolume24hThirdPrice();

        // Top Gainers

        String topGainersFirstCoinName = report24h.getTopGainersFirstName();
        String topGainersSecondCoinName = report24h.getTopGainersSecondName();
        String topGainersThirdCoinName = report24h.getTopGainersThirdName();

        String topGainersFirstCoinPrice = report24h.getTopGainersFirstPrice();
        String topGainersSecondCoinPrice = report24h.getTopGainersSecondPrice();
        String topGainersThirdCoinPrice = report24h.getTopGainersThirdPrice();

        String topGainersFirstCoinPercent = report24h.getTopGainersFirstPercent();
        String topGainersSecondCoinPercent = report24h.getTopGainersSecondPercent();
        String topGainersThirdCoinPercent = report24h.getTopGainersThirdPercent();

        // Top Losers

        String topLosersFirstCoinName = report24h.getTopLosersFirstName();
        String topLosersSecondCoinName = report24h.getTopLosersSecondName();
        String topLosersThirdCoinName = report24h.getTopLosersThirdName();

        String topLosersFirstCoinPrice = report24h.getTopLosersFirstPrice();
        String topLosersSecondCoinPrice = report24h.getTopLosersSecondPrice();
        String topLosersThirdCoinPrice = report24h.getTopLosersThirdPrice();

        String topLosersFirstCoinPercent = report24h.getTopLosersFirstPercent();
        String topLosersSecondCoinPercent = report24h.getTopLosersSecondPercent();
        String topLosersThirdCoinPercent = report24h.getTopLosersThirdPercent();

        // Top Exchanges

        String topExchangesFirstCoinName = report24h.getTopExchangesFirstName();
        String topExchangesSecondCoinName = report24h.getTopExchangesSecondName();
        String topExchangesThirdCoinName = report24h.getTopExchangesThirdName();

        String topExchangesFirstCoinPrice = report24h.getTopExchangesFirstPrice();
        String topExchangesSecondCoinPrice = report24h.getTopExchangesSecondPrice();
        String topExchangesThirdCoinPrice = report24h.getTopExchangesThirdPrice();


        System.out.println(marketOverviewFirstCoinName);
        System.out.println(marketOverviewSecondCoinName);
        System.out.println(marketOverviewThirdCoinName);
        System.out.println(marketOverviewFirstCoinPrice);
        System.out.println(marketOverviewSecondCoinPrice);
        System.out.println(marketOverviewThirdCoinPrice);
        System.out.println(marketOverviewFirstCoinPercent);
        System.out.println(marketOverviewSecondCoinPercent);
        System.out.println(marketOverviewThirdCoinPercent);
        System.out.println();

        System.out.println(topVolume24hFirstCoinName);
        System.out.println(topVolume24hSecondCoinName);
        System.out.println(topVolume24hThirdCoinName);
        System.out.println(topVolume24hFirstCoinPrice);
        System.out.println(topVolume24hSecondCoinPrice);
        System.out.println(topVolume24hThirdCoinPrice);
        System.out.println();

        System.out.println(topGainersFirstCoinName);
        System.out.println(topGainersSecondCoinName);
        System.out.println(topGainersThirdCoinName);
        System.out.println(topGainersFirstCoinPrice);
        System.out.println(topGainersSecondCoinPrice);
        System.out.println(topGainersThirdCoinPrice);
        System.out.println(topGainersFirstCoinPercent);
        System.out.println(topGainersSecondCoinPercent);
        System.out.println(topGainersThirdCoinPercent);
        System.out.println();

        System.out.println(topLosersFirstCoinName);
        System.out.println(topLosersSecondCoinName);
        System.out.println(topLosersThirdCoinName);
        System.out.println(topLosersFirstCoinPrice);
        System.out.println(topLosersSecondCoinPrice);
        System.out.println(topLosersThirdCoinPrice);
        System.out.println(topLosersFirstCoinPercent);
        System.out.println(topLosersSecondCoinPercent);
        System.out.println(topLosersThirdCoinPercent);
        System.out.println();

        System.out.println(topExchangesFirstCoinName);
        System.out.println(topExchangesSecondCoinName);
        System.out.println(topExchangesThirdCoinName);
        System.out.println(topExchangesFirstCoinPrice);
        System.out.println(topExchangesSecondCoinPrice);
        System.out.println(topExchangesThirdCoinPrice);

    }


}
