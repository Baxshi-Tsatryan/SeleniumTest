package Chrome.Tests.CheckAllCoinsAllData;

import Chrome.AllPages.CoinsPage.GeneralCoinsPage;
import Chrome.AllPages.ExchangesPage.GeneralExchangePage;
import Chrome.AllPages.MainPage.CoinsFavoritesExchangesHeatmap;
import Chrome.AllPages.MainPage.Header;
import Chrome.MainPackage.AllURLs;
import Chrome.MainPackage.Driver;
import Chrome.MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class CheckAllCoinsExchangesAllData extends Driver {

    AllURLs allURLs;
    SeleniumUtils utils;
    CoinsFavoritesExchangesHeatmap coinsFavoritesExchangesHeatmap;
    GeneralCoinsPage generalCoinsPage;
    GeneralExchangePage generalExchangePage;
    Header header;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        coinsFavoritesExchangesHeatmap = new CoinsFavoritesExchangesHeatmap(driver);
        generalCoinsPage = new GeneralCoinsPage(driver);
        generalExchangePage = new GeneralExchangePage(driver);
        header = new Header(driver);
    }

    @Test
    public void getAllCoinsDetailsAllData() throws InterruptedException {

        allURLs.navigateToMainPage();
        int i = 0;
        coinsFavoritesExchangesHeatmap.clickOnRowsPerPageDropDown();
        coinsFavoritesExchangesHeatmap.clickOnRowsPerPage300();
        Thread.sleep(2000);

        do {
            List<WebElement> coinNames = driver.findElements(By.className("qa-coin-name"));
            coinNames.get(i).click();

            //Thread.sleep(1000);
            //String coinRank = generalCoinsPage.getCoinIndex();
            String coinName = generalCoinsPage.getCoinSecondName();
            double coinPrice = coinsFavoritesExchangesHeatmap.getCoinPriceWithoutSymbols(generalCoinsPage.getCoinPrice());

            double coin1hChange = coinsFavoritesExchangesHeatmap.getCoinPercentWithoutPercent(generalCoinsPage.getCoinPercent());

            double coinPriceInBTC = Double.parseDouble(generalCoinsPage.getCoinPriceBTC().replace("฿", ""));

            double coin1hChangeInBTC = coinsFavoritesExchangesHeatmap.getCoinPercentWithoutPercent(generalCoinsPage.getCoinPercentBTC());

            double coinMarketCap = coinsFavoritesExchangesHeatmap.getCoinVolumeCap(generalCoinsPage.getMarketCap());

            double coinVolume24h = coinsFavoritesExchangesHeatmap.getCoinVolumeCap(generalCoinsPage.getVolume24h());

            String coinAvailableSupplyStr = coinsFavoritesExchangesHeatmap.getCoinSupplies(generalCoinsPage.getAvailableSupply());
            //int coinAvailableSupply = Integer.parseInt(coinAvailableSupplyStr);

            String coinTotalSupplyStr = coinsFavoritesExchangesHeatmap.getCoinSupplies(generalCoinsPage.getTotalSupply());
            //int coinTotalSupply = Integer.parseInt(coinTotalSupplyStr);

            //System.out.println(coinRank);
            System.out.println(coinName);
            System.out.println(coinPrice);
            System.out.println(coin1hChange);
            System.out.println(coinPriceInBTC);
            System.out.println(coin1hChangeInBTC);
            System.out.println(coinMarketCap);
            System.out.println(coinVolume24h);
            System.out.println(coinAvailableSupplyStr);
            System.out.println(coinTotalSupplyStr);
            System.out.println();

            utils.goToBackPage();

            i++;

            if (i == 12)
            {
                i++;
            }

            if (i == 300)
            {
                coinsFavoritesExchangesHeatmap.clickOnBottomNextPage();
                Thread.sleep(1000);
                i = 0;
            }
        }
        while (true);
    }

    @Test
    public void getAllCoinsAllData()
    {
        allURLs.navigateToMainPage();

        coinsFavoritesExchangesHeatmap.clickOnCustomColumnDropDown();
        coinsFavoritesExchangesHeatmap.clickOnCustomColumns1hChange();
        coinsFavoritesExchangesHeatmap.clickOnCustomColumns7dChange();
        coinsFavoritesExchangesHeatmap.clickOnCustomColumnsMarketCap();

        int i = 0;

        do
        {
            try {
                System.out.println(coinsFavoritesExchangesHeatmap.getAllCoinsNames(i));
            }
            catch (IndexOutOfBoundsException e)
            {
                System.err.println("Finish");
            }
            System.out.println(coinsFavoritesExchangesHeatmap.getAllCoins1hChanges(i));
            System.out.println(coinsFavoritesExchangesHeatmap.getAllCoins24hChanges(i));
            System.out.println(coinsFavoritesExchangesHeatmap.getAllCoins7dChanges(i));
            System.out.println(coinsFavoritesExchangesHeatmap.getAllCoinsPrices(i));
            System.out.println(coinsFavoritesExchangesHeatmap.getAllCoinsPricesInBTC(i));
            System.out.println(coinsFavoritesExchangesHeatmap.getAllCoinsMarketCaps(i));
            System.out.println(coinsFavoritesExchangesHeatmap.getAllCoinsVolume24h(i));
            System.out.println();

            i++;

            if (i == 20)
            {
                i = 0;
                coinsFavoritesExchangesHeatmap.clickOnNextPage();
            }
        }
        while (true);
    }

    @Test
    public void getAllExchangesAllData() throws InterruptedException
    {
        allURLs.navigateToExchangeTabPage();
        int i = 0;

        coinsFavoritesExchangesHeatmap.clickOnRowsPerPageDropDown();
        coinsFavoritesExchangesHeatmap.clickOnRowsPerPageAllExchanges();
        Thread.sleep(2000);

        do
        {
            try {
                System.out.println(coinsFavoritesExchangesHeatmap.getAllExchangesNames(i));
            }
            catch (IndexOutOfBoundsException e)
            {
                System.err.println("Finish");
            }
            System.out.println(coinsFavoritesExchangesHeatmap.getAllExchangesVolumes24h(i));
            System.out.println(coinsFavoritesExchangesHeatmap.getAllExchangesVolumes7d(i));
            System.out.println(coinsFavoritesExchangesHeatmap.getAllExchangesVolumes30d(i));
            System.out.println(coinsFavoritesExchangesHeatmap.getAllExchangesChanges24h(i));
            System.out.println();

            i++;
        }
        while (true);
    }

    @Test
    public void getAllExchangesDetailsAllData() throws InterruptedException
    {
        allURLs.navigateToExchangeTabPage();
        int i = 0;

        do {
            coinsFavoritesExchangesHeatmap.clickOnRowsPerPageDropDown();
            coinsFavoritesExchangesHeatmap.clickOnRowsPerPageAllExchanges();
            Thread.sleep(2000);

            List<WebElement> exchangesNames = driver.findElements(By.className("qa-exchange-name"));
            try {
                exchangesNames.get(i).click();
            }
            catch (IndexOutOfBoundsException e)
            {
                System.err.println("Finish");
            }

            String exchangeName = generalExchangePage.getExchangeName();

            double exchangeVolume = coinsFavoritesExchangesHeatmap.getCoinVolumeCap(generalExchangePage.getExchangeVolume());

            double exchangeVolumePercent = coinsFavoritesExchangesHeatmap.getCoinPercentWithoutPercent(generalExchangePage.getExchangeVolumePercent());

            double exchangeVolumeBTC = Double.parseDouble(generalExchangePage.getExchangeVolumeBTC().replace("฿", ""));

            double exchangeVolumeBTCPercent = coinsFavoritesExchangesHeatmap.getCoinPercentWithoutPercent(generalExchangePage.getExchangeVolumeBTCPercent());

            double exchangeVolume24h = coinsFavoritesExchangesHeatmap.getCoinVolumeCap(generalExchangePage.getExchangeVolume24h());

            double exchangeVolume7d = coinsFavoritesExchangesHeatmap.getCoinVolumeCap(generalExchangePage.getExchangeVolume7d());

            double exchangeVolume30d = coinsFavoritesExchangesHeatmap.getCoinVolumeCap(generalExchangePage.getExchangeVolume30d());

            int exchangeNoMarkets = Integer.parseInt(generalExchangePage.getExchangeNoMarkets());

            String exchangeFee = generalExchangePage.getExchangeFee();

            String exchangeLaunched = generalExchangePage.getExchangeLaunched();

            String exchangeType = generalExchangePage.getExchangesType();

            String exchangeCountry = generalExchangePage.getExchangeCountry();

            System.out.println(exchangeName);
            System.out.println(exchangeVolume);
            System.out.println(exchangeVolumePercent);
            System.out.println(exchangeVolumeBTC);
            System.out.println(exchangeVolumeBTCPercent);
            System.out.println(exchangeVolume24h);
            System.out.println(exchangeVolume7d);
            System.out.println(exchangeVolume30d);
            System.out.println(exchangeNoMarkets);
            System.out.println(exchangeFee);
            System.out.println(exchangeLaunched);
            System.out.println(exchangeType);
            System.out.println(exchangeCountry);
            System.out.println();

            utils.goToBackPage();

            i++;
        }while (true);


    }

}