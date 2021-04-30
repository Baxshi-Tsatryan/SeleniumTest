package Chrome.Tests.CheckAllCoinsAllData;

import Chrome.AllPages.CoinGecko;
import Chrome.AllPages.CoinsPage.GeneralCoinsPage;
import Chrome.AllPages.MainPage.CoinsFavoritesExchangesHeatmap;
import Chrome.AllPages.MainPage.Header;
import Chrome.MainPackage.AllURLs;
import Chrome.MainPackage.Driver;
import Chrome.MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckAllCoinsPrices extends Driver {
    AllURLs allURLs;
    SeleniumUtils utils;
    CoinsFavoritesExchangesHeatmap coinsFavoritesExchangesHeatmap;
    Header header;
    CoinGecko coinGecko;
    GeneralCoinsPage generalCoinsPage;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        coinsFavoritesExchangesHeatmap = new CoinsFavoritesExchangesHeatmap(driver);
        header = new Header(driver);
        coinGecko = new CoinGecko(driver);
        generalCoinsPage = new GeneralCoinsPage(driver);
    }


    @Test
    public void checkAllCoinsPrices() {

    }

    @Test
    public void checkCoinPrice() {
        allURLs.navigateToMainPage();
        int i = 1;

        String coinName = "zombie.finance";
        String allCoinsNames = null;
        header.searchAnyCoin(coinName);
        do {
            try {
                allCoinsNames = driver.findElement(By.cssSelector("#__next > main > header > div > div.jsx-207749059.header-wrapper.show-desktop > div > div.jsx-207749059.search-dropdowns-container > div.search-wrapper > div > div.jsx-550402856.result-wrapper > div > div:nth-child(2) > a:nth-child(" + i + ") > div > span > span.table-row")).getText();
            } catch (Exception e) {
                System.err.println("Coin not found");
                return;
            }
            if (allCoinsNames.equals(coinName)) {
                driver.findElement(By.cssSelector("#__next > main > header > div > div.jsx-207749059.header-wrapper.show-desktop > div > div.jsx-207749059.search-dropdowns-container > div.search-wrapper > div > div.jsx-550402856.result-wrapper > div > div:nth-child(2) > a:nth-child(" + i + ") > div > span > span.table-row")).click();
            } else {
                i++;
            }
        } while (allCoinsNames == coinName);

        String coinPrice = generalCoinsPage.getCoinPrice();

        allURLs.navigateToCoinGecko();
        coinGecko.typeSearchField(coinName);

        int j = 1;

        do {
            try {
                allCoinsNames = driver.findElement(By.cssSelector("body > div.header.dashboard > div.main-header.container.lg\\:tw-flex.tw-justify-between.tw-items-center.py-2 > div.col-md-12.col-lg-3.d-inline-block.px-0 > div.tw-hidden.d-sm-block > div > div > div.search-results.w-100.mt-2.rounded.p-3_5 > div > ul.list-reset.relevant-results > li:nth-child(" + j + ") > a > span:nth-child(2)")).getText();
            } catch (Exception e) {
                System.err.println("Coin not found");
                return;
            }
            if (allCoinsNames.equals(coinName)) {
                driver.findElement(By.cssSelector("#__next > main > header > div > div.jsx-207749059.header-wrapper.show-desktop > div > div.jsx-207749059.search-dropdowns-container > div.search-wrapper > div > div.jsx-550402856.result-wrapper > div > div:nth-child(2) > a:nth-child(" + i + ") > div > span > span.table-row")).click();
            } else {
                i++;
            }
        } while (allCoinsNames == coinName);
    }

    public Boolean checkPriceValidation(String actualPrice, String expectedPrice) {

        double percent = 5;

        double actualPriceDouble = coinsFavoritesExchangesHeatmap.getCoinPriceWithoutSymbols(actualPrice);
        double expectedPriceDouble = coinsFavoritesExchangesHeatmap.getCoinPriceWithoutSymbols(expectedPrice);
        double permittedPercent = (expectedPriceDouble / 100) * percent;

        if (expectedPriceDouble - actualPriceDouble > permittedPercent || expectedPriceDouble < 0) {
            return false;
        } else {
            return true;
        }
    }

}
