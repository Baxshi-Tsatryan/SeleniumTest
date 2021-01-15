package AllPages.MainPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.NoSuchElementException;

public class CoinsFavoritesExchangesHeatmap {

    WebDriver driver;
    SeleniumUtils utils;

    public CoinsFavoritesExchangesHeatmap(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    By topBannerHereButton = By.cssSelector("#__next > main > header > div.jsx-3251546915.top-banner-container > span > a");

    // Crypto Prices and Portfolio Tracker

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

    By heatmapTab = By.cssSelector("a[href='/en/heatmap/']");


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

    By rankColumn = By.cssSelector("th.nowrap > .table-column-title");

    By nameColumn = By.cssSelector("thead th:nth-of-type(2) > .table-column-title");

    By change1hColumn = By.cssSelector("thead th:nth-of-type(3) > .table-column-title");

    By change24hColumn = By.cssSelector("thead th:nth-of-type(4) > .table-column-title");

    By change7dColumn = By.cssSelector("thead th:nth-of-type(5) > .table-column-title");

    By priceColumn = By.cssSelector("thead th:nth-of-type(6) > .table-column-title");

    By priceInBTCColumn = By.cssSelector("thead th:nth-of-type(7) > .table-column-title");

    By marketCapColumn = By.cssSelector("thead th:nth-of-type(8) > .table-column-title");

    By volume24hColumn = By.cssSelector("thead th:nth-of-type(9) > .table-column-title");

    By CSScoreColumn = By.cssSelector("thead th:nth-of-type(10) > .table-column-title");

    By CSScore24hColumn = By.cssSelector("thead th:nth-of-type(11) > .table-column-title");

    By priceGraphColumn = By.cssSelector("thead th:nth-of-type(12) > .table-column-title");

    By customColumnsDropDown = By.cssSelector(".jsx-2095321675");

    By customColumnsRank = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .column-wrapper .table-row");

    By customColumns1hChange = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .column-wrapper .table-row");

    By customColumns24hChange = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(3) .column-wrapper .table-row");

    By customColumns7dChange = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(4) .column-wrapper .table-row");

    By customColumnsPrice = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(5) .column-wrapper .table-row");

    By customColumnsPriceInBTC = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(6) .column-wrapper .table-row");

    By customColumnsMarketCap = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(7) .column-wrapper .table-row");

    By customColumns24hVolume = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(8) .column-wrapper .table-row");

    By customColumnsCSScore = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(9) .column-wrapper .table-row");

    By customColumnsCSScore24h = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(10) .column-wrapper .table-row");

    By customColumnsPriceGraph = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(11) .column-wrapper .table-row");


    // Exchanges Ranks

    By indexColumnExchange = By.cssSelector("thead th:nth-of-type(1) > .table-column-title");

    By nameColumnExchange = By.cssSelector("thead th:nth-of-type(2) > .table-column-title");

    By volume24hColumnExchange = By.cssSelector("thead th:nth-of-type(3) > .table-column-title");

    By volume7dColumnExchange = By.cssSelector("thead th:nth-of-type(4) > .table-column-title");

    By volume30dColumnExchange = By.cssSelector("thead th:nth-of-type(5) > .table-column-title");

    By noMarketsColumnExchange = By.cssSelector("thead th:nth-of-type(6) > .table-column-title");

    By change24hColumnExchange = By.cssSelector("thead th:nth-of-type(7) > .table-column-title"); // thead span:nth-of-type(2)


    // Favorites Ranks

    By rankColumnFavorites = By.cssSelector("th.nowrap > .table-column-title");

    By nameColumnFavorites = By.cssSelector("thead th:nth-of-type(2) > .table-column-title");

    By change24hColumnFavorites = By.cssSelector("thead th:nth-of-type(3) > .table-column-title");

    By priceColumnFavorites = By.cssSelector("thead th:nth-of-type(4) > .table-column-title");

    By priceInBTCColumnFavorites = By.cssSelector("thead th:nth-of-type(5) > .table-column-title");

    By marketCapColumnFavorites = By.cssSelector("thead th:nth-of-type(6) > .table-column-title");

    By volume24hColumnFavorites = By.cssSelector("thead th:nth-of-type(7) > .table-column-title");

    By CSScore24hColumnFavorites = By.cssSelector("thead th:nth-of-type(8) > .table-column-title");

    By priceGraphColumnFavorites = By.cssSelector("thead th:nth-of-type(9) > .table-column-title");

    By customColumnsRankFavorites = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .column-wrapper .table-row");

    By customColumns24hChangeFavorites = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .column-wrapper .table-row");

    By customColumnsPriceFavorites = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(3) .column-wrapper .table-row");

    By customColumnsPriceInBTCFavorites = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(4) .column-wrapper .table-row");

    By customColumnsMarketCapFavorites = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(5) .column-wrapper .table-row");

    By customColumns24hVolumeFavorites = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(6) .column-wrapper .table-row");

    By customColumnsCSScore24hFavorites = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(7) .column-wrapper .table-row");

    By customColumnsPriceGraphFavorites = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(8) .column-wrapper .table-row");


    // 3 dot button

    By coins3Dot = By.cssSelector("tbody > tr:nth-of-type(1) .jsx-152191236 > .jsx-152191236 > .jsx-152191236");

    By removeAddFromToFavoritesCoins3Dot = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(1) > .table-row");

    By trackInPortfolioCoins3Dot = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(2)");

    By watchInNewsCoins3Dot = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(3)");

    By marketsCoins3Dot = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(4)");

    By holdingsCoins3Dot = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(5)");


    // Heatmap

    By currentPerformanceHeatmap = By.cssSelector("div.treemap-filters > div:nth-of-type(1) > .jsx-1751315535 .filter-value");

    By performanceDropDownHeatmap = By.cssSelector("div.treemap-filters > div:nth-of-type(1) > .jsx-1751315535 > .jsx-1751315535 > .jsx-1751315535");

    By performance1HourHeatmap = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By performance1DayHeatmap = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By performance7DaysHeatmap = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(3) .table-row");

    By currentBlockSizeHeatmap = By.cssSelector("div.filter-size > .jsx-1751315535 .filter-value");

    By blockSizeDropDownHeatmap = By.cssSelector("div.filter-size > .jsx-1751315535 > .jsx-1751315535 > .jsx-1751315535");

    By blockSizeMarketCapHeatmap = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By blockSizeVolumeHeatmap = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By fullScreenIconHeatmap = By.cssSelector(".icon-full-screen");

    By currentItemsInMapHeatmap = By.cssSelector("div.pagination-filter > .jsx-1751315535 .filter-value");

    By itemsInMapDropDownHeatmap = By.cssSelector("div.pagination-filter > .jsx-1751315535 > .jsx-1751315535 > .jsx-1751315535");

    By itemsInMap20Heatmap = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By itemsInMap100Heatmap = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");


    By goToPortfolioButton = By.xpath("//button[@class='jsx-1426819953 standart-button  primary']");


    // --------------------------------------------- Methods -----------------------------------------------

    public void clickOnTopBannerHere()
    {
        utils.clickOnElement(topBannerHereButton);
    }

    // Crypto Prices and Portfolio Tracker

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

    public void clickOnHeatmapTab()
    {
        utils.clickOnElement(heatmapTab);
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


    // Coins Columns

    public void clickOnRankColumn()
    {
        utils.clickOnElement(rankColumn);
    }

    public void clickOnNameColumn()
    {
        utils.clickOnElement(nameColumn);
    }

    public void clickOnChange1hColumn()
    {
        utils.clickOnElement(change1hColumn);
    }

    public void clickOnChange24hColumn()
    {
        utils.clickOnElement(change24hColumn);
    }

    public void clickOnChange7dColumn()
    {
        utils.clickOnElement(change7dColumn);
    }

    public void clickOnPriceColumn()
    {
        utils.clickOnElement(priceColumn);
    }

    public void clickOnPriceInBTCColumn()
    {
        utils.clickOnElement(priceInBTCColumn);
    }

    public void clickOnMarketCapColumn()
    {
        utils.clickOnElement(marketCapColumn);
    }

    public void clickOnVolume24hColumn()
    {
        utils.clickOnElement(volume24hColumn);
    }

    public void clickOnCSScoreColumn()
    {
        utils.clickOnElement(CSScoreColumn);
    }

    public void clickOnCSScore24hColumn()
    {
        utils.clickOnElement(CSScore24hColumn);
    }


    public Boolean rankColumnIsDisplayed()
    {
        return utils.isDisplayed(rankColumn);
    }

    public Boolean nameColumnIsDisplayed()
    {
        return utils.isDisplayed(nameColumn);
    }

    public Boolean change1hColumnIsDisplayed()
    {
        return utils.isDisplayed(change1hColumn);
    }

    public Boolean change24hColumnIsDisplayed()
    {
        return utils.isDisplayed(change24hColumn);
    }

    public Boolean change7dColumnIsDisplayed()
    {
        return utils.isDisplayed(change7dColumn);
    }

    public Boolean priceColumnIsDisplayed()
    {
        return utils.isDisplayed(priceColumn);
    }

    public Boolean priceInBTCColumnIsDisplayed()
    {
        return utils.isDisplayed(priceInBTCColumn);
    }

    public Boolean marketCapColumnIsDisplayed()
    {
        return utils.isDisplayed(marketCapColumn);
    }

    public Boolean volume24hColumnIsDisplayed()
    {
        return utils.isDisplayed(volume24hColumn);
    }

    public Boolean CSScoreColumnIsDisplayed()
    {
        return utils.isDisplayed(CSScoreColumn);
    }

    public Boolean CSScore24hColumnIsDisplayed()
    {
        return utils.isDisplayed(CSScore24hColumn);
    }

    public Boolean priceGraphColumnIsDisplayed()
    {
        return utils.isDisplayed(priceGraphColumn);
    }


    public void clickOnCustomColumnDropDown()
    {
        utils.clickOnElement(customColumnsDropDown);
    }

    public void clickOnCustomColumnsRank()
    {
        utils.clickOnElement(customColumnsRank);
    }

    public void clickOnCustomColumns1hChange()
    {
        utils.clickOnElement(customColumns1hChange);
    }

    public void clickOnCustomColumns24hChange()
    {
        utils.clickOnElement(customColumns24hChange);
    }

    public void clickOnCustomColumns7dChange()
    {
        utils.clickOnElement(customColumns7dChange);
    }

    public void clickOnCustomColumnsPrice()
    {
        utils.clickOnElement(customColumnsPrice);
    }

    public void clickOnCustomColumnsPriceInBTC()
    {
        utils.clickOnElement(customColumnsPriceInBTC);
    }

    public void clickOnCustomColumnsMarketCap()
    {
        utils.clickOnElement(customColumnsMarketCap);
    }

    public void clickOnCustomColumns24hVolume()
    {
        utils.clickOnElement(customColumns24hVolume);
    }

    public void clickOnCustomColumnsCSScore()
    {
        utils.clickOnElement(customColumnsCSScore);
    }

    public void clickOnCustomColumnsCSScore24h()
    {
        utils.clickOnElement(customColumnsCSScore24h);
    }

    public void clickOnCustomColumnsPriceGraph()
    {
        utils.clickOnElement(customColumnsPriceGraph);
    }


    // Exchanges Columns

    public void clickOnRankColumnExchanges()
    {
        utils.clickOnElement(indexColumnExchange);
    }

    public void clickOnNameColumnExchanges()
    {
        utils.clickOnElement(nameColumnExchange);
    }

    public void clickOnVolume24hColumnExchanges()
    {
        utils.clickOnElement(volume24hColumnExchange);
    }

    public void clickOnVolume7dColumnExchanges()
    {
        utils.clickOnElement(volume7dColumnExchange);
    }

    public void clickOnVolume30dColumnExchanges()
    {
        utils.clickOnElement(volume30dColumnExchange);
    }

    public void clickOnNoMarketsColumnExchanges()
    {
        utils.clickOnElement(noMarketsColumnExchange);
    }

    public void clickOnChange24hColumnExchanges()
    {
        utils.clickOnElement(change24hColumnExchange);
    }


    // Favorites Columns

    public void clickOnRankColumnFavorites()
    {
        utils.clickOnElement(rankColumnFavorites);
    }

    public void clickOnNameColumnFavorites()
    {
        utils.clickOnElement(nameColumnFavorites);
    }

    public void clickOnChange24hColumnFavorites()
    {
        utils.clickOnElement(change24hColumnFavorites);
    }

    public void clickOnPriceColumnFavorites()
    {
        utils.clickOnElement(priceColumnFavorites);
    }

    public void clickOnPriceInBTCColumnFavorites()
    {
        utils.clickOnElement(priceInBTCColumnFavorites);
    }

    public void clickOnMarketCapColumnFavorites()
    {
        utils.clickOnElement(marketCapColumnFavorites);
    }

    public void clickOnVolume24hColumnFavorites()
    {
        utils.clickOnElement(volume24hColumnFavorites);
    }

    public void clickOnCSScore24hColumnFavorites()
    {
        utils.clickOnElement(CSScore24hColumnFavorites);
    }


    public Boolean rankColumnIsDisplayedFavorites()
    {
        return utils.isDisplayed(rankColumnFavorites);
    }

    public Boolean nameColumnIsDisplayedFavorites()
    {
        return utils.isDisplayed(nameColumnFavorites);
    }

    public Boolean change24hColumnIsDisplayedFavorites()
    {
        return utils.isDisplayed(change24hColumnFavorites);
    }

    public Boolean priceColumnIsDisplayedFavorites()
    {
        return utils.isDisplayed(priceColumnFavorites);
    }

    public Boolean priceInBTCColumnIsDisplayedFavorites()
    {
        return utils.isDisplayed(priceInBTCColumnFavorites);
    }

    public Boolean marketCapColumnIsDisplayedFavorites()
    {
        return utils.isDisplayed(marketCapColumnFavorites);
    }

    public Boolean volume24hColumnIsDisplayedFavorites()
    {
        return utils.isDisplayed(volume24hColumnFavorites);
    }

    public Boolean CSScore24hColumnIsDisplayedFavorites()
    {
        return utils.isDisplayed(CSScore24hColumnFavorites);
    }

    public Boolean priceGraphIsDisplayedFavorites()
    {
        return utils.isDisplayed(priceGraphColumnFavorites);
    }


    public void clickOnCustomColumnsRankFavorites()
    {
        utils.clickOnElement(customColumnsRankFavorites);
    }

    public void clickOnCustomColumns24hChangeFavorites()
    {
        utils.clickOnElement(customColumns24hChangeFavorites);
    }

    public void clickOnCustomColumnsPriceFavorites()
    {
        utils.clickOnElement(customColumnsPriceFavorites);
    }

    public void clickOnCustomColumnsPriceInBTCFavorites()
    {
        utils.clickOnElement(customColumnsPriceInBTCFavorites);
    }

    public void clickOnCustomColumnsMarketCapFavorites()
    {
        utils.clickOnElement(customColumnsMarketCapFavorites);
    }

    public void clickOnCustomColumns24hVolumeFavorites()
    {
        utils.clickOnElement(customColumns24hVolumeFavorites);
    }

    public void clickOnCustomColumnsCSScore24hFavorites()
    {
        utils.clickOnElement(customColumnsCSScore24hFavorites);
    }

    public void clickOnCustomColumnsPriceGraphFavorites()
    {
        utils.clickOnElement(customColumnsPriceGraphFavorites);
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


    // Heatmap

    public String getCurrentPerformanceHeatmap()
    {
        return utils.getText(currentPerformanceHeatmap);
    }

    public void clickOnPerformanceDropDownHeatmap()
    {
        utils.clickOnElement(performanceDropDownHeatmap);
    }

    public void clickOnPerformance1HourHeatmap()
    {
        utils.clickOnElement(performance1HourHeatmap);
    }

    public void clickOnPerformance1DayHeatmap()
    {
        utils.clickOnElement(performance1DayHeatmap);
    }

    public void clickOnPerformance7DaysHeatmap()
    {
        utils.clickOnElement(performance7DaysHeatmap);
    }

    public String getCurrentBlockSizeHeatmap()
    {
        return utils.getText(currentBlockSizeHeatmap);
    }

    public void clickOnBlockSizeDropDownHeatmap()
    {
        utils.clickOnElement(blockSizeDropDownHeatmap);
    }

    public void clickOnBlockSizeMarketCapHeatmap()
    {
        utils.clickOnElement(blockSizeMarketCapHeatmap);
    }

    public void clickOnBlockSizeVolumeHeatmap()
    {
        utils.clickOnElement(blockSizeVolumeHeatmap);
    }

    public void clickOnFullScreenHeatmap()
    {
        utils.clickOnElement(fullScreenIconHeatmap);
    }

    public String getCurrentItemsInMapHeatmap()
    {
        return utils.getText(currentItemsInMapHeatmap);
    }

    public void clickOnItemsInMapDropDownHeatmap()
    {
        utils.clickOnElement(itemsInMapDropDownHeatmap);
    }

    public void clickOnItemsInMap20Heatmap()
    {
        utils.clickOnElement(itemsInMap20Heatmap);
    }

    public void clickOnItemsInMap100Heatmap()
    {
        utils.clickOnElement(itemsInMap100Heatmap);
    }


    public void clickOnGoToPortfolio()
    {
        utils.clickOnElement(goToPortfolioButton);
    }

    // --------------------------------------------- Scripts -----------------------------------------------

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

