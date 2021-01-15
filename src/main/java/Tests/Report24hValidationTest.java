package Tests;

import AllPages.CoinGecko;
import AllPages.Report24h;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.Paths;
import MainPackage.SeleniumUtils;
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


        // CoinGecko

        allURLs.navigateToCoinGecko();

        coinGecko.typeSearchField(marketOverviewFirstCoinName);
        coinGecko.clickOnFirstCoinResult();
        coinGecko.getCoinPrice();
        coinGecko.getCoinPercent();

    }


}
