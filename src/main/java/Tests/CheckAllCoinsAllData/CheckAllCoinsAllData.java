package Tests.CheckAllCoinsAllData;

import AllPages.CoinsPage.GeneralCoinsPage;
import AllPages.MainPage.CoinsFavoritesExchangesHeatmap;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckAllCoinsAllData extends Driver {

    AllURLs allURLs;
    SeleniumUtils utils;
    CoinsFavoritesExchangesHeatmap coinsFavoritesExchangesHeatmap;
    GeneralCoinsPage generalCoinsPage;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        coinsFavoritesExchangesHeatmap = new CoinsFavoritesExchangesHeatmap(driver);
        generalCoinsPage = new GeneralCoinsPage(driver);
    }

    @Test
    public void getAllCoinsAllData() throws InterruptedException {
        allURLs.navigateToMainPage();
        int index = 19;

        do {

                    try {
                        coinsFavoritesExchangesHeatmap.clickOnCoins(index);
                    }
                    catch (NoSuchElementException e) {
                        break;
                    }

            String coinName = generalCoinsPage.getCoinSecondName();
            String coinPrice = generalCoinsPage.getCoinPrice();
            String coin1hChange = generalCoinsPage.getCoinPercent();
            String coinPriceInBTC = generalCoinsPage.getCoinPriceBTC();
            String coin1hChangeInBTC = generalCoinsPage.getCoinPercentBTC();
            String coinMarketCap = generalCoinsPage.getMarketCap();
            String coinVolume24h = generalCoinsPage.getVolume24h();
            String coinAvailableSupply = generalCoinsPage.getAvailableSupply();
            String coinTotalSupply = generalCoinsPage.getTotalSupply();

            System.out.println("CoinName is " + coinName);
            System.out.println("coinPrice is " + coinPrice);
            System.out.println("coin1hChange is " + coin1hChange);
            System.out.println("coinPriceInBTC is " + coinPriceInBTC);
            System.out.println("coin1hChangeInBTC is " + coin1hChangeInBTC);
            System.out.println("coinMarketCap is " + coinMarketCap);
            System.out.println("coinVolume24h is " + coinVolume24h);
            System.out.println("coinAvailableSupply is " + coinAvailableSupply);
            System.out.println("coinTotalSupply is " + coinTotalSupply);
            System.out.println();

            utils.goToBackPage();

            index++;

            if (index == 21)
            {
                index = 1;
                try {
                    coinsFavoritesExchangesHeatmap.clickOnNextPage();
                }
                catch (Exception e) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("div.section-wrapper > div:nth-of-type(2) .icon-next")));
                }
            }

        }
        while (true);
    }

}
