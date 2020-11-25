package AllPages.MainPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.NoSuchElementException;

public class CoinsFavoritesExchanges {

    WebDriver driver;
    SeleniumUtils utils;

    public CoinsFavoritesExchanges(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    By topBannerHereButton = By.cssSelector("#__next > main > header > div.jsx-3251546915.top-banner-container > span > a");


    // Crypto Prices and Portfolio Tracker

    By cryptoPricesAndPortfolioTrackerText = By.cssSelector("a.title");

    By marketCapPrice = By.cssSelector("div.big-stats-list li:nth-of-type(1) .big-stats-value > [href='/en/market-cap-charts/']");

    By marketCapPercent = By.cssSelector("a.text-up > span:nth-of-type(2)");

    By volume24hPrice = By.cssSelector("div.big-stats-list li:nth-of-type(2) .big-stats-value > [href='/en/market-cap-charts/']");

    By volume24hPercent = By.cssSelector("div.big-stats-list li:nth-of-type(2) span:nth-of-type(2)");

    By BTCDominanceFirstPercent = By.cssSelector("div.big-stats-list li:nth-of-type(3) .big-stats-value > [href='/en/market-cap-charts/']");

    By BTCDominanceSecondPercent = By.cssSelector("div.big-stats-list li:nth-of-type(3) span:nth-of-type(2)");


    // Tabs

    By coinsTab = By.cssSelector(".tab-label[href='/en/']");

    By exchangesTab = By.cssSelector("a[href='/en/exchanges/']");

    By favoritesTab = By.cssSelector("a[href='/en/favorites/']");


    // Coins Rows Per Page

    By rowsPerPageDropDown = By.cssSelector("div.section-wrapper > div:nth-of-type(2) .jsx-1751315535 > .jsx-1751315535 > .jsx-1751315535");

    By currentRowsPerPage = By.cssSelector("div.section-wrapper > div:nth-of-type(2) .jsx-1751315535 .filter-value");

    By rowsPerPage20 = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By rowsPerPage100 = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By rowsPerPage300 = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(3) .table-row");

    // Exchanges Rows Per Page

    By rowsPerPageDropDownExchanges = By.cssSelector("div.section-wrapper > div:nth-of-type(2) .jsx-1751315535 > .jsx-1751315535 > .jsx-1751315535");

    By rowsPerPage20Exchanges = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By rowsPerPage100Exchanges = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By rowsPerPageAllExchanges = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(3) .table-row");

    By nextPage = By.cssSelector("div.section-wrapper > div:nth-of-type(2) .icon-next");

    By previousPage = By.cssSelector("div.section-wrapper > div:nth-of-type(2) .icon-prev");

    // Bottom Rows Per Page

    By bottomRowsPerPageDropDown = By.cssSelector("div.section-wrapper > div:nth-of-type(4) .jsx-1751315535 > .jsx-1751315535 > .jsx-1751315535");

    By bottomCurrentRowsPerPage = By.cssSelector("div.section-wrapper > div:nth-of-type(4) .jsx-1751315535 .filter-value");

    By bottomRowsPerPage20 = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By bottomRowsPerPage100 = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By bottomRowsPerPage300 = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(3) .table-row");

    // Bottom Rows Per Page Exchanges

    By bottomRowsPerPageDropDownExchanges = By.cssSelector("div.section-wrapper > div:nth-of-type(4) .jsx-1751315535 > .jsx-1751315535 > .jsx-1751315535");

    By bottomRowsPerPage20Exchanges = By.cssSelector("`ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By bottomRowsPerPage100Exchanges = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By bottomRowsPerPageAllExchanges = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(3) .table-row");

    By bottomNextPage = By.cssSelector("div.section-wrapper > div:nth-of-type(4) .icon-next");

    By bottomPreviousPage = By.cssSelector("div.section-wrapper > div:nth-of-type(4) .icon-prev");


    // Columns

    By columnIcon = By.cssSelector(".icon-edit-cols");

    By rankColumn = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .column-wrapper .table-row");

    By change1hColumn = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .column-wrapper .table-row");

    By change24hColumn = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(3) .column-wrapper .table-row");

    By change7dColumn = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(4) .column-wrapper .table-row");

    By priceColumn = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(5) .column-wrapper .table-row");

    By priceBtcColumn = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(6) .column-wrapper .table-row");

    By marketCapColumn = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(7) .column-wrapper .table-row");

    By volume24hColumn = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(8) .column-wrapper .table-row");

    By coinStatsScoreColumn = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(9) .column-wrapper .table-row");

    By coinStatsScore24hColumn = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(10) .column-wrapper .table-row");

    By priceGraphColumn = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(11) .column-wrapper .table-row");


    // Exchanges Ranks

    By indexRankExchange = By.cssSelector("thead th:nth-of-type(1) > .table-column-title");

    By nameRankExchange = By.cssSelector("thead th:nth-of-type(2) > .table-column-title");

    By volume24hRankExchange = By.cssSelector("thead th:nth-of-type(3) > .table-column-title");

    By volume7dRankExchange = By.cssSelector("thead th:nth-of-type(4) > .table-column-title");

    By volume30dRankExchange = By.cssSelector("thead th:nth-of-type(5) > .table-column-title");

    By noMarketsRankExchange = By.cssSelector("thead th:nth-of-type(6) > .table-column-title");

    By change24hRankExchange = By.cssSelector("thead th:nth-of-type(7) > .table-column-title"); // thead span:nth-of-type(2)


    // 3 dot button

    By coins3Dot = By.cssSelector("tbody > tr:nth-of-type(1) .jsx-152191236 > .jsx-152191236 > .jsx-152191236");

    By removeAddFromToFavoritesCoins3Dot = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(1) > .table-row");

    By trackInPortfolioCoins3Dot = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(2)");

    By watchInNewsCoins3Dot = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(3)");

    By marketsCoins3Dot = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(4)");

    By holdingsCoins3Dot = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(5)");


    By goToPortfolioButton = By.xpath("//button[@class='jsx-1426819953 standart-button  primary']");


    // --------------------------------------------- Methods -----------------------------------------------

    public void clickOnTopBannerHere()
    {
        utils.clickOnElement(topBannerHereButton);
    }

    // Crypto Prices and Portfolio Tracker

    public void clickOnCryptoPricesAndPortfolioTracker() {
        utils.clickOnElement(cryptoPricesAndPortfolioTrackerText);
    }

    public void clickOnMarketCap() {
        utils.clickOnElement(marketCapPrice);
    }

    public String getMarketCapPrice() {
        return utils.getText(marketCapPrice);
    }

    public String getMarketCapPercent() {
        return utils.getText(marketCapPercent);
    }

    public String getMarketCapPercentColor()
    {
        return utils.getCSSValue(marketCapPercent, "color");
    }

    public void clickOnVolume24h() {
        utils.clickOnElement(volume24hPrice);
    }

    public String getVolume24hPrice() {
        return utils.getText(volume24hPrice);
    }

    public String getVolume24hPercent() {
        return utils.getText(volume24hPercent);
    }

    public String getVolume24hPercentColor()
    {
        return utils.getCSSValue(volume24hPercent, "color");
    }

    public void clickOnBTCDominance() {
        utils.clickOnElement(BTCDominanceFirstPercent);
    }

    public String getBTCDominanceFirstPercent() {
        return utils.getText(BTCDominanceFirstPercent);
    }

    public String getBTCDominanceSecondPercent() {
        return utils.getText(BTCDominanceSecondPercent);
    }

    public String getBTCDominanceSecondPercentColor()
    {
        return utils.getCSSValue(BTCDominanceSecondPercent, "color");
    }


    // Tabs

    public void clickOnCoinsTab() {
        utils.clickOnElement(coinsTab);
    }

    public void clickOnExchangesTab() {
        utils.clickOnElement(exchangesTab);
    }

    public void clickOnFavoritesTab() {
        utils.clickOnElement(favoritesTab);
    }


    // Rows Per Page

    public void clickOnRowsPerPageDropDown() {
        utils.clickOnElement(rowsPerPageDropDown);
    }

    public String getCurrentRowsPerPage()
    {
        return utils.getText(currentRowsPerPage);
    }

    public void clickOnRowsPerPage20() {
        utils.clickOnElement(rowsPerPage20);
    }

    public void clickOnRowsPerPage100() {
        utils.clickOnElement(rowsPerPage100);
    }

    public void clickOnRowsPerPage300() {
        utils.clickOnElement(rowsPerPage300);
    }

    public void clickOnNextPage()
    {
        utils.clickOnElement(nextPage);
    }

    public void clickOnPreviousPage()
    {
        utils.clickOnElement(previousPage);
    }

    // Exchanges Rows Per Page

    public void clickOnRowsPerPageAllExchanges() {
        utils.clickOnElement(rowsPerPageAllExchanges);
    }

    // Bottom Rows Per Page

    public void clickOnBottomRowsPerPageDropDown()
    {
        utils.clickOnElement(bottomRowsPerPageDropDown);
    }

    public String getBottomCurrentRowsPerPage()
    {
        return utils.getText(bottomCurrentRowsPerPage);
    }

    public void clickOnBottomRowsPerPage20()
    {
        utils.clickOnElement(bottomRowsPerPage20);
    }

    public void clickOnBottomRowsPerPage100()
    {
        utils.clickOnElement(bottomRowsPerPage100);
    }

    public void clickOnBottomRowsPerPage300()
    {
        utils.clickOnElement(bottomRowsPerPage300);
    }

    // Bottom Rows Per Page Exchanges

    public void clickOnBottomRowsPerPageDropDownExchanges()
    {
        utils.clickOnElement(bottomRowsPerPageDropDownExchanges);
    }

    public void clickOnBottomRowsPerPage20Exchanges()
    {
        utils.clickOnElement(bottomRowsPerPage20Exchanges);
    }

    public void clickOnBottomRowsPerPage100Exchanges()
    {
        utils.clickOnElement(bottomRowsPerPage100Exchanges);
    }

    public void clickOnBottomRowsPerPageAllExchanges()
    {
        utils.clickOnElement(bottomRowsPerPageAllExchanges);
    }

    public void clickOnBottomNextPage()
    {
        utils.clickOnElement(bottomNextPage);
    }

    public void clickOnBottomPreviousPage()
    {
        utils.clickOnElement(bottomPreviousPage);
    }


    // Exchanges Ranks

    public void clickOnIndexRankExchanges()
    {
        utils.clickOnElement(indexRankExchange);
    }

    public void clickOnNameRankExchanges()
    {
        utils.clickOnElement(nameRankExchange);
    }

    public void clickOnVolume24hRankExchanges()
    {
        utils.clickOnElement(volume24hRankExchange);
    }

    public void clickOnVolume7dRankExchanges()
    {
        utils.clickOnElement(volume7dRankExchange);
    }

    public void clickOnVolume30dRankExchanges()
    {
        utils.clickOnElement(volume30dRankExchange);
    }

    public void clickOnNoMarketsRankExchanges()
    {
        utils.clickOnElement(noMarketsRankExchange);
    }

    public void clickOnChange24hRankExchanges()
    {
        utils.clickOnElement(change24hRankExchange);
    }


    // Coins 3 dot button

    public void clickOnCoins3Dot()
    {
        utils.clickOnElement(coins3Dot);
    }

    public void clickOnRemoveAddFromToFavoritesCoins3Dot()
    {
        utils.clickOnElement(removeAddFromToFavoritesCoins3Dot);
    }

    public void clickOnTrackPortfolioCoins3Dot()
    {
        utils.clickOnElement(trackInPortfolioCoins3Dot);
    }

    public void clickOnWatchInNewsCoins3Dot()
    {
        utils.clickOnElement(watchInNewsCoins3Dot);
    }

    public void clickOnMarketsCoins3Dot()
    {
        utils.clickOnElement(marketsCoins3Dot);
    }

    public void clickOnHoldingsCoins3Dot()
    {
        utils.clickOnElement(holdingsCoins3Dot);
    }


    public void clickOnGoToPortfolio()
    {
        utils.clickOnElement(goToPortfolioButton);
    }

    // --------------------------------------------- Scripts -----------------------------------------------


    // Click on all ranks
    public void clickOnAllRanks()
    {
        int index = 1;

        do {
            driver.findElement(By.cssSelector("thead th:nth-of-type(" + index + ") > .table-column-title")).click();

            index++;
        } while(index != 8);

    }


    // Get all coins indexes
    public void AllCoinsByIndex()
    {

        int index = 1;
        int index2 = 2;

        do {
            try {
                WebElement allCoins = driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[1]//a//span//span"));

                String coinIndexText = allCoins.getText();
                System.out.println(coinIndexText);
            } catch (NoSuchElementException e) {}

            index++;

            if (index == 300) {

                driver.get("https://coinstats.app/en/?pagesize=300&page=" + index2);
                index2++;
                index = 1;

            }
        }
        while (index != 9000);
    }

    // Click on all coins
    public void clickOnAllCoins() {

         int index = 1;
         int index2 = 1;

             do {
                 driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[1]//a//span//span")).click();
                 driver.get("https://coinstats.app/en/?pagesize=20&page=" + index2);

             index++;

             if (index == 21) {
                 index2++;
                 driver.get("https://coinstats.app/en/?pagesize=20&page=" + index2);
                 index = 1;
             }
         }

             while (index != 9000) ;
    }

    // Get all coins names
    public void getAllCoinsNames()
    {
         int index = 1;
         int index2 = 2;

             do {
                 WebElement coinNames = driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div[2]/div[3]/table/tbody/tr[" + index + "]/td[2]/a/span[1]/span"));
                 String allCoinsNames = coinNames.getText();
                 System.out.println(allCoinsNames);

             index++;

             if (index == 21) {
                 driver.get("https://coinstats.app/en/?pagesize=20&page=" + index2);
                 index = 1;
                 index2 ++;
             }

         } while (index != 9000);
    }

    // Get all coins all data
    public void getAllCoinsAllData()
    {

        int index = 1;
        int index2 = 2;

        do {

            WebElement coinsIndexesElement = driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[1]//a//span//span"));
            String coinsIndexes = coinsIndexesElement.getText();
            System.out.println(coinsIndexes);

            WebElement coinsNamesElement = driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[2]//a//span[1]//span"));
            String coinsNames = coinsNamesElement.getText();
            System.out.println(coinsNames);

            WebElement coinsABBRsElement = driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[2]//a//span[2]//span"));
            String coinsABBRs = coinsABBRsElement
                    .getText()
                    .replace("• ", "");
            System.out.println(coinsABBRs);

            WebElement coins24hChangesElement = driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[3]//a//span//span[2]"));
            String coins24hChange = coins24hChangesElement
                    .getText()
                    .replace("%", "");
            double coins24hChangesDouble = Double.parseDouble(coins24hChange);
            System.out.println("24h Change - " + coins24hChangesDouble);

            WebElement coinsPricesElement = driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[4]//a//span//span"));
            String coinsPrices = coinsPricesElement
                    .getText()
                    .replace("$", "")
                    .replace(",", "");
            double coinsPricesDouble = Double.parseDouble(coinsPrices);
            System.out.println("Price - " + coinsPricesDouble);

            WebElement coinsPricesInBTCElement = driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[5]//a//span//span"));
            String coinsPricesInBTC = coinsPricesInBTCElement.getText();
            double coinsPricesInBTCDouble = Double.parseDouble(coinsPricesInBTC);
            System.out.println("Price In BTC - " + coinsPricesInBTCDouble);

            WebElement coinsMarketCapElement = driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[6]//a//span//span"));
            String coinsMarketCap = coinsMarketCapElement
                    .getText()
                    .replace("$", "")
                    .replace(".", "")
                    .replace("B","000000000")
                    .replace("M", "000000")
                    .replace("K", "000");
            double coinsMarketCapDouble = Double.parseDouble(coinsMarketCap);
            System.out.println("Market Cap - " + coinsMarketCapDouble);

            WebElement coinsVolume24hElement = driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[7]//a//span//span"));
            String coinsVolume24h = coinsVolume24hElement
                    .getText()
                    .replace("$", "")
                    .replace(".", "")
                    .replace("B","000000000")
                    .replace("M", "000000")
                    .replace("K", "000");
            double coinsVolume24hDouble = Double.parseDouble(coinsVolume24h);
            System.out.println("Volume 24h - " + coinsVolume24hDouble);

            System.out.println();
            System.out.println();

            index ++;

            if (index == 21) {
                driver.get("https://coinstats.app/en/?pagesize=20&page=" + index2);
                index = 1;
                index2++;
            }

        }while (index != 9000);
    }

    // Click on all exchanges
    public void clickOnAllExchanges()
    {

        int index = 1;
        int index2 = 1;

        do {
            driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[1]//a//span//span")).click();
            driver.get("https://coinstats.app/en/exchanges/?pagesize=100&page=" + index2);

            index++;

            if (index == 101) {
                index2++;
                driver.get("https://coinstats.app/en/exchanges/?pagesize=100&page=" + index2);
                index = 1;
            }
        }

        while (index != 400) ;
    }

    // Get all exchanges all data
    public void getAllExchangesAllData()
    {

        int index = 1;
        int index2 = 2;

        do {

            WebElement exchangesIndexesElement = driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[1]//a//span//span"));
            String exchangesIndexes = exchangesIndexesElement.getText();
            System.out.println(exchangesIndexes);

            WebElement exchangesNamesElement = driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[2]//a//span[1]//span"));
            String exchangesNames = exchangesNamesElement.getText();
            System.out.println(exchangesNames);

            WebElement exchangesVolume24hElement = driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[3]//a//span//span"));
            String exchangesVolume24h = exchangesVolume24hElement
                    .getText()
                    .replace("$", "")
                    .replace(".", "")
                    .replace("T", "000000000000")
                    .replace("B","000000000")
                    .replace("M", "000000")
                    .replace("K", "000");
            double exchangesVolume24hDouble = Double.parseDouble(exchangesVolume24h);
            System.out.println("24h Change - " + exchangesVolume24hDouble);

            WebElement exchangesVolume7dElement = driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[4]//a//span//span"));
            String exchangesVolume7d = exchangesVolume7dElement
                    .getText()
                    .replace("$", "")
                    .replace(".", "")
                    .replace("T", "000000000000")
                    .replace("B","000000000")
                    .replace("M", "000000")
                    .replace("K", "000");
            double exchangesVolume7dDouble = Double.parseDouble(exchangesVolume7d);
            System.out.println("Price - " + exchangesVolume7dDouble);

            WebElement exchangesVolume30dElement = driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[5]//a//span//span"));
            String exchangesVolume30d = exchangesVolume30dElement
                    .getText()
                    .replace("$", "")
                    .replace(".", "")
                    .replace("T", "000000000000")
                    .replace("B","000000000")
                    .replace("M", "000000")
                    .replace("K", "000");
            double exchangesVolume30dDouble = Double.parseDouble(exchangesVolume30d);
            System.out.println("Price In BTC - " + exchangesVolume30dDouble);

            WebElement exchangesNoMarketsElement = driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[6]//a//span//span"));
            String exchangesNoMarkets = exchangesNoMarketsElement.getText();
            double exchangesNoMarketsDouble = Double.parseDouble(exchangesNoMarkets);
            System.out.println("Market Cap - " + exchangesNoMarketsDouble);

            WebElement exchangesChange24hElement = driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[7]//a//span//span[2]"));
            String exchangesChange24h = exchangesChange24hElement
                    .getText()
                    .replace("%", "");
            double exchangesChange24hDouble = Double.parseDouble(exchangesChange24h);
            System.out.println("Volume 24h - " + exchangesChange24hDouble);

            WebElement exchangesLaunchedElement = driver.findElement(By.xpath("//html//body//div[1]//main//section//div//div[2]//div[3]//table//tbody//tr[" + index + "]//td[8]//a//span//span"));
            String exchangesLaunched = exchangesLaunchedElement.getText();
            System.out.println("Launched - " + exchangesLaunched);

            System.out.println();
            System.out.println();

            index++;

            if (index == 15)
            {
                Actions actions = new Actions(driver);
                actions.sendKeys(Keys.SPACE).build().perform();
                actions.sendKeys(Keys.SPACE).build().perform();
            }

            if (index == 21) {
                driver.get("https://coinstats.app/en/exchanges/?pagesize=20&page=" + index2);
                index = 1;
                index2++;
            }

        }while (index != 400);
    }

}

