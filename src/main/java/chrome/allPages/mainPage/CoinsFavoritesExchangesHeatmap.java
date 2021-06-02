package chrome.allPages.mainPage;

import chrome.mainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CoinsFavoritesExchangesHeatmap {

    WebDriver driver;
    SeleniumUtils utils;
    Header header;

    public CoinsFavoritesExchangesHeatmap(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
        header = new Header(driver);
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

    By defiTab = By.cssSelector("a[href='/en/defi/']");

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

    public CoinsFavoritesExchangesHeatmap clickOnTopBannerHere() {
        utils.click(topBannerHereButton);
        return this;
    }

    // Crypto Prices and Portfolio Tracker

    public CoinsFavoritesExchangesHeatmap clickOnMarketCap() {
        utils.click(marketCapPrice);
        return this;
    }

    public String getMarketCapPrice() {
        return utils.getText(marketCapPrice);
    }

    public String getMarketCapPercent() {
        return utils.getText(marketCapPercent);
    }

    public String getMarketCapPercentColor() {
        return utils.getCSSValue(marketCapPercent, "color");
    }

    public CoinsFavoritesExchangesHeatmap clickOnVolume24h() {
        utils.click(volume24hPrice);
        return this;
    }

    public String getVolume24hPrice() {
        return utils.getText(volume24hPrice);
    }

    public String getVolume24hPercent() {
        return utils.getText(volume24hPercent);
    }

    public String getVolume24hPercentColor() {
        return utils.getCSSValue(volume24hPercent, "color");
    }

    public CoinsFavoritesExchangesHeatmap clickOnBTCDominance() {
        utils.click(BTCDominanceFirstPercent);
        return this;
    }

    public String getBTCDominanceFirstPercent() {
        return utils.getText(BTCDominanceFirstPercent);
    }

    public String getBTCDominanceSecondPercent() {
        return utils.getText(BTCDominanceSecondPercent);
    }

    public String getBTCDominanceSecondPercentColor() {
        return utils.getCSSValue(BTCDominanceSecondPercent, "color");
    }


    // Tabs

    public CoinsFavoritesExchangesHeatmap clickOnCoinsTab() {
        utils.click(coinsTab);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnExchangesTab() {
        utils.click(exchangesTab);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnFavoritesTab() {
        utils.click(favoritesTab);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnDefiTab() {
        utils.click(defiTab);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnHeatmapTab() {
        utils.click(heatmapTab);
        return this;
    }


    // Rows Per Page

    public CoinsFavoritesExchangesHeatmap clickOnRowsPerPageDropDown() {
        utils.click(rowsPerPageDropDown);
        return this;
    }

    public String getCurrentRowsPerPage() {
        return utils.getText(currentRowsPerPage);
    }

    public CoinsFavoritesExchangesHeatmap clickOnRowsPerPage20() {
        utils.click(rowsPerPage20);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnRowsPerPage100() {
        utils.click(rowsPerPage100);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnRowsPerPage300() {
        utils.click(rowsPerPage300);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnNextPage() {
        utils.click(nextPage);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnPreviousPage() {
        utils.click(previousPage);
        return this;
    }

    // Exchanges Rows Per Page

    public CoinsFavoritesExchangesHeatmap clickOnRowsPerPageAllExchanges() {
        utils.click(rowsPerPageAllExchanges);
        return this;
    }

    // Bottom Rows Per Page

    public CoinsFavoritesExchangesHeatmap clickOnBottomRowsPerPageDropDown() {
        utils.click(bottomRowsPerPageDropDown);
        return this;
    }

    public String getBottomCurrentRowsPerPage() {
        return utils.getText(bottomCurrentRowsPerPage);
    }

    public CoinsFavoritesExchangesHeatmap clickOnBottomRowsPerPage20() {
        utils.click(bottomRowsPerPage20);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnBottomRowsPerPage100() {
        utils.click(bottomRowsPerPage100);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnBottomRowsPerPage300() {
        utils.click(bottomRowsPerPage300);
        return this;
    }

    // Bottom Rows Per Page Exchanges

    public CoinsFavoritesExchangesHeatmap clickOnBottomRowsPerPageDropDownExchanges() {
        utils.click(bottomRowsPerPageDropDownExchanges);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnBottomRowsPerPage20Exchanges() {
        utils.click(bottomRowsPerPage20Exchanges);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnBottomRowsPerPage100Exchanges() {
        utils.click(bottomRowsPerPage100Exchanges);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnBottomRowsPerPageAllExchanges() {
        utils.click(bottomRowsPerPageAllExchanges);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnBottomNextPage() {
        utils.click(bottomNextPage);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnBottomPreviousPage() {
        utils.click(bottomPreviousPage);
        return this;
    }


    // Coins Columns

    public CoinsFavoritesExchangesHeatmap clickOnRankColumn() {
        utils.click(rankColumn);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnNameColumn() {
        utils.click(nameColumn);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnChange1hColumn() {
        utils.click(change1hColumn);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnChange24hColumn() {
        utils.click(change24hColumn);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnChange7dColumn() {
        utils.click(change7dColumn);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnPriceColumn() {
        utils.click(priceColumn);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnPriceInBTCColumn() {
        utils.click(priceInBTCColumn);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnMarketCapColumn() {
        utils.click(marketCapColumn);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnVolume24hColumn() {
        utils.click(volume24hColumn);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCSScoreColumn() {
        utils.click(CSScoreColumn);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCSScore24hColumn() {
        utils.click(CSScore24hColumn);
        return this;
    }


    public Boolean rankColumnIsDisplayed() {
        return utils.isDisplayed(rankColumn);
    }

    public Boolean nameColumnIsDisplayed() {
        return utils.isDisplayed(nameColumn);
    }

    public Boolean change1hColumnIsDisplayed() {
        return utils.isDisplayed(change1hColumn);
    }

    public Boolean change24hColumnIsDisplayed() {
        return utils.isDisplayed(change24hColumn);
    }

    public Boolean change7dColumnIsDisplayed() {
        return utils.isDisplayed(change7dColumn);
    }

    public Boolean priceColumnIsDisplayed() {
        return utils.isDisplayed(priceColumn);
    }

    public Boolean priceInBTCColumnIsDisplayed() {
        return utils.isDisplayed(priceInBTCColumn);
    }

    public Boolean marketCapColumnIsDisplayed() {
        return utils.isDisplayed(marketCapColumn);
    }

    public Boolean volume24hColumnIsDisplayed() {
        return utils.isDisplayed(volume24hColumn);
    }

    public Boolean CSScoreColumnIsDisplayed() {
        return utils.isDisplayed(CSScoreColumn);
    }

    public Boolean CSScore24hColumnIsDisplayed() {
        return utils.isDisplayed(CSScore24hColumn);
    }

    public Boolean priceGraphColumnIsDisplayed() {
        return utils.isDisplayed(priceGraphColumn);
    }


    public CoinsFavoritesExchangesHeatmap clickOnCustomColumnDropDown() {
        utils.click(customColumnsDropDown);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCustomColumnsRank() {
        utils.click(customColumnsRank);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCustomColumns1hChange() {
        utils.click(customColumns1hChange);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCustomColumns24hChange() {
        utils.click(customColumns24hChange);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCustomColumns7dChange() {
        utils.click(customColumns7dChange);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCustomColumnsPrice() {
        utils.click(customColumnsPrice);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCustomColumnsPriceInBTC() {
        utils.click(customColumnsPriceInBTC);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCustomColumnsMarketCap() {
        utils.click(customColumnsMarketCap);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCustomColumns24hVolume() {
        utils.click(customColumns24hVolume);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCustomColumnsCSScore() {
        utils.click(customColumnsCSScore);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCustomColumnsCSScore24h() {
        utils.click(customColumnsCSScore24h);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCustomColumnsPriceGraph() {
        utils.click(customColumnsPriceGraph);
        return this;
    }


    // Exchanges Columns

    public CoinsFavoritesExchangesHeatmap clickOnRankColumnExchanges() {
        utils.click(indexColumnExchange);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnNameColumnExchanges() {
        utils.click(nameColumnExchange);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnVolume24hColumnExchanges() {
        utils.click(volume24hColumnExchange);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnVolume7dColumnExchanges() {
        utils.click(volume7dColumnExchange);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnVolume30dColumnExchanges() {
        utils.click(volume30dColumnExchange);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnNoMarketsColumnExchanges() {
        utils.click(noMarketsColumnExchange);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnChange24hColumnExchanges() {
        utils.click(change24hColumnExchange);
        return this;
    }


    // Favorites Columns

    public CoinsFavoritesExchangesHeatmap clickOnRankColumnFavorites() {
        utils.click(rankColumnFavorites);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnNameColumnFavorites() {
        utils.click(nameColumnFavorites);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnChange24hColumnFavorites() {
        utils.click(change24hColumnFavorites);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnPriceColumnFavorites() {
        utils.click(priceColumnFavorites);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnPriceInBTCColumnFavorites() {
        utils.click(priceInBTCColumnFavorites);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnMarketCapColumnFavorites() {
        utils.click(marketCapColumnFavorites);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnVolume24hColumnFavorites() {
        utils.click(volume24hColumnFavorites);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCSScore24hColumnFavorites() {
        utils.click(CSScore24hColumnFavorites);
        return this;
    }


    public Boolean rankColumnIsDisplayedFavorites() {
        return utils.isDisplayed(rankColumnFavorites);
    }

    public Boolean nameColumnIsDisplayedFavorites() {
        return utils.isDisplayed(nameColumnFavorites);
    }

    public Boolean change24hColumnIsDisplayedFavorites() {
        return utils.isDisplayed(change24hColumnFavorites);
    }

    public Boolean priceColumnIsDisplayedFavorites() {
        return utils.isDisplayed(priceColumnFavorites);
    }

    public Boolean priceInBTCColumnIsDisplayedFavorites() {
        return utils.isDisplayed(priceInBTCColumnFavorites);
    }

    public Boolean marketCapColumnIsDisplayedFavorites() {
        return utils.isDisplayed(marketCapColumnFavorites);
    }

    public Boolean volume24hColumnIsDisplayedFavorites() {
        return utils.isDisplayed(volume24hColumnFavorites);
    }

    public Boolean CSScore24hColumnIsDisplayedFavorites() {
        return utils.isDisplayed(CSScore24hColumnFavorites);
    }

    public Boolean priceGraphIsDisplayedFavorites() {
        return utils.isDisplayed(priceGraphColumnFavorites);
    }


    public CoinsFavoritesExchangesHeatmap clickOnCustomColumnsRankFavorites() {
        utils.click(customColumnsRankFavorites);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCustomColumns24hChangeFavorites() {
        utils.click(customColumns24hChangeFavorites);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCustomColumnsPriceFavorites() {
        utils.click(customColumnsPriceFavorites);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCustomColumnsPriceInBTCFavorites() {
        utils.click(customColumnsPriceInBTCFavorites);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCustomColumnsMarketCapFavorites() {
        utils.click(customColumnsMarketCapFavorites);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCustomColumns24hVolumeFavorites() {
        utils.click(customColumns24hVolumeFavorites);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCustomColumnsCSScore24hFavorites() {
        utils.click(customColumnsCSScore24hFavorites);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnCustomColumnsPriceGraphFavorites() {
        utils.click(customColumnsPriceGraphFavorites);
        return this;
    }


    // Coins 3 dot button

    public CoinsFavoritesExchangesHeatmap clickOnCoins3Dot() {
        utils.click(coins3Dot);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnRemoveAddFromToFavoritesCoins3Dot() {
        utils.click(removeAddFromToFavoritesCoins3Dot);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnTrackPortfolioCoins3Dot() {
        utils.click(trackInPortfolioCoins3Dot);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnWatchInNewsCoins3Dot() {
        utils.click(watchInNewsCoins3Dot);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnMarketsCoins3Dot() {
        utils.click(marketsCoins3Dot);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnHoldingsCoins3Dot() {
        utils.click(holdingsCoins3Dot);
        return this;
    }


    // Heatmap

    public String getCurrentPerformanceHeatmap() {
        return utils.getText(currentPerformanceHeatmap);
    }

    public CoinsFavoritesExchangesHeatmap clickOnPerformanceDropDownHeatmap() {
        utils.click(performanceDropDownHeatmap);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnPerformance1HourHeatmap() {
        utils.click(performance1HourHeatmap);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnPerformance1DayHeatmap() {
        utils.click(performance1DayHeatmap);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnPerformance7DaysHeatmap() {
        utils.click(performance7DaysHeatmap);
        return this;
    }

    public String getCurrentBlockSizeHeatmap() {
        return utils.getText(currentBlockSizeHeatmap);
    }

    public CoinsFavoritesExchangesHeatmap clickOnBlockSizeDropDownHeatmap() {
        utils.click(blockSizeDropDownHeatmap);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnBlockSizeMarketCapHeatmap() {
        utils.click(blockSizeMarketCapHeatmap);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnBlockSizeVolumeHeatmap() {
        utils.click(blockSizeVolumeHeatmap);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnFullScreenHeatmap() {
        utils.click(fullScreenIconHeatmap);
        return this;
    }

    public String getCurrentItemsInMapHeatmap() {
        return utils.getText(currentItemsInMapHeatmap);
    }

    public CoinsFavoritesExchangesHeatmap clickOnItemsInMapDropDownHeatmap() {
        utils.click(itemsInMapDropDownHeatmap);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnItemsInMap20Heatmap() {
        utils.click(itemsInMap20Heatmap);
        return this;
    }

    public CoinsFavoritesExchangesHeatmap clickOnItemsInMap100Heatmap() {
        utils.click(itemsInMap100Heatmap);
        return this;
    }


    public CoinsFavoritesExchangesHeatmap clickOnGoToPortfolio() {
        utils.click(goToPortfolioButton);
        return this;
    }

    // --------------------------------------------- Scripts -----------------------------------------------

    // Coins Data

    public void clickOnCoins(int index) {
        driver.findElement(By.cssSelector("#__next > main > section > div > div.jsx-3798992717.section-wrapper > div.common-table > table > tbody > tr:nth-child(" + index + ") > td.border.left.regular-weight-not-mobile.coin-name-col.qa-coin-name.line-link > a > span:nth-child(2) > span")).click();
    }

    public String getAllCoinsNames(int index) {
        List<WebElement> coinsNames = driver.findElements(By.className("qa-coin-name"));

        String coinName = coinsNames.get(index).getText();
        coinName = coinName.substring(0, coinName.lastIndexOf('•'));

        return coinName;
    }

    public float getAllCoins1hChanges(int index) {
        List<WebElement> coins1hChanges = driver.findElements(By.className("qa-coin-1h"));
        String coin1hChangeStr = coins1hChanges.get(index).getText();

        coin1hChangeStr = coin1hChangeStr.replace("%", "");
        float coin1hChange = Float.parseFloat(coin1hChangeStr);

        return coin1hChange;
    }

    public float getAllCoins24hChanges(int index) {
        List<WebElement> coins24hChanges = driver.findElements(By.className("qa-coin-24h"));
        String coin24hChangeStr = coins24hChanges.get(index).getText();

        coin24hChangeStr = coin24hChangeStr.replace("%", "");
        float coin24hChange = Float.parseFloat(coin24hChangeStr);

        return coin24hChange;
    }

    public float getAllCoins7dChanges(int index) {
        List<WebElement> coins7dChanges = driver.findElements(By.className("qa-coin-7d"));
        String coin7dChangeStr = coins7dChanges.get(index).getText();

        coin7dChangeStr = coin7dChangeStr.replace("%", "");
        float coin7dChange = Float.parseFloat(coin7dChangeStr);

        return coin7dChange;
    }

    public double getAllCoinsPrices(int index) {
        List<WebElement> coinsPrices = driver.findElements(By.className("qa-coin-price"));
        String coinPriceStr = coinsPrices.get(index).getText();

        //coinPriceStr = coinPriceStr.replace("$", "").replace(",", "");
        double coinPrice = getCoinPriceWithoutSymbols(coinPriceStr);

        return coinPrice;
    }

    public double getAllCoinsPricesInBTC(int index) {
        List<WebElement> coinsPricesInBTC = driver.findElements(By.className("qa-coin-price-btc"));
        String coinPriceInBTCStr = coinsPricesInBTC.get(index).getText();

        double coinPriceInBTC = Double.parseDouble(coinPriceInBTCStr);

        return coinPriceInBTC;
    }

    public double getAllCoinsMarketCaps(int index) {
        List<WebElement> coinsMarketCaps = driver.findElements(By.className("qa-coin-market-cap"));
        String coinMarketCapStr = coinsMarketCaps.get(index).getText();

        //coinMarketCapStr = coinMarketCapStr.replace("$", "").replace("B", "000000000").replace("M", "000000").replace("K", "000");
        double coinMarketCap = getCoinVolumeCap(coinMarketCapStr);

        return coinMarketCap;
    }

    public double getAllCoinsVolume24h(int index) {
        List<WebElement> coinsVolume24h = driver.findElements(By.className("qa-coin-volume-24h"));
        String coinVolume24hStr = coinsVolume24h.get(index).getText();

        //coinVolume24hStr = coinVolume24hStr.replace("$", "").replace("B", "000000000").replace("M", "000000").replace("K", "000");
        double coinVolume24h = getCoinVolumeCap(coinVolume24hStr);

        return coinVolume24h;
    }


    // Exchanges Data

    public String getAllExchangesNames(int index) {
        List<WebElement> exchangesNames = driver.findElements(By.className("qa-exchange-name"));
        String exchangeName = exchangesNames.get(index).getText();

        return exchangeName;
    }

    public double getAllExchangesVolumes24h(int index) {
        List<WebElement> exchangesVolumes24h = driver.findElements(By.className("qa-exchange-volume-24h"));
        String exchangeVolume24hStr = exchangesVolumes24h.get(index).getText(); //.replace("$", "").replace("B", "").replace("M", "").replace("K", "").replace("T", "");

        double exchangeVolume24h = getCoinVolumeCap(exchangeVolume24hStr);

        return exchangeVolume24h;
    }

    public double getAllExchangesVolumes7d(int index) {
        List<WebElement> exchangesVolumes7d = driver.findElements(By.className("qa-exchange-volume-7d"));
        String exchangeVolume7dStr = exchangesVolumes7d.get(index).getText(); //.replace("$", "").replace("B", "").replace("M", "").replace("K", "").replace("T", "");
        double exchangeVolume7d = getCoinVolumeCap(exchangeVolume7dStr);

        return exchangeVolume7d;
    }

    public double getAllExchangesVolumes30d(int index) {
        List<WebElement> exchangesVolumes30d = driver.findElements(By.className("qa-exchange-volume-1m"));
        String exchangeVolume30dStr = exchangesVolumes30d.get(index).getText(); //.replace("$", "").replace("B", "").replace("M", "").replace("K", "").replace("T", "");
        double exchangeVolume30d = getCoinVolumeCap(exchangeVolume30dStr);

        return exchangeVolume30d;
    }

    public double getAllExchangesChanges24h(int index) {
        List<WebElement> exchangesChanges24h = driver.findElements(By.className("qa-exchange-24h"));
        String exchangeChange24hStr = exchangesChanges24h.get(index).getText(); //.replace("%", "");
        double exchangeChange24h = getCoinPercentWithoutPercent(exchangeChange24hStr);

        return exchangeChange24h;
    }

    public double getCoinPriceWithoutSymbols(String coinPriceStr) {
        if (header.getCurrentCurrencyName().equals("ZAR")) {
            coinPriceStr = coinPriceStr.replace("R", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("TRY")) {
            coinPriceStr = coinPriceStr.replace("TL", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("THB")) {
            coinPriceStr = coinPriceStr.replace("฿", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("SGD") || header.getCurrentCurrencyName().equals("NZD") || header.getCurrentCurrencyName().equals("MXN") || header.getCurrentCurrencyName().equals("HKD") || header.getCurrentCurrencyName().equals("CAD") || header.getCurrentCurrencyName().equals("AUD") || header.getCurrentCurrencyName().equals("USD")) {
            coinPriceStr = coinPriceStr.replace("$", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("SEK") || header.getCurrentCurrencyName().equals("NOK") || header.getCurrentCurrencyName().equals("ISK") || header.getCurrentCurrencyName().equals("DKK")) {
            coinPriceStr = coinPriceStr.replace("kr", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("RON")) {
            coinPriceStr = coinPriceStr.replace("RON", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("PLN")) {
            coinPriceStr = coinPriceStr.replace("zł", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("PHP")) {
            coinPriceStr = coinPriceStr.replace("₱", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("MYR")) {
            coinPriceStr = coinPriceStr.replace("RM", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("KRW")) {
            coinPriceStr = coinPriceStr.replace("₩", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("JPY")) {
            coinPriceStr = coinPriceStr.replace("￥", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("INR")) {
            coinPriceStr = coinPriceStr.replace("₹", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("ILS")) {
            coinPriceStr = coinPriceStr.replace("₪", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("IDR")) {
            coinPriceStr = coinPriceStr.replace("Rp", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("HUF")) {
            coinPriceStr = coinPriceStr.replace("Ft", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("HRK")) {
            coinPriceStr = coinPriceStr.replace("kn", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("CZK")) {
            coinPriceStr = coinPriceStr.replace("Kč", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("CNY")) {
            coinPriceStr = coinPriceStr.replace("CN¥", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("CHF")) {
            coinPriceStr = coinPriceStr.replace("CHF", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("BRL")) {
            coinPriceStr = coinPriceStr.replace("R$", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("BGN")) {
            coinPriceStr = coinPriceStr.replace("лв", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("AMD")) {
            coinPriceStr = coinPriceStr.replace("֏", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("GBP")) {
            coinPriceStr = coinPriceStr.replace("£", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("EUR")) {
            coinPriceStr = coinPriceStr.replace("€", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("BTC")) {
            coinPriceStr = coinPriceStr.replace("฿", "").replace(",", "");
        } else if (header.getCurrentCurrencyName().equals("ETH")) {
            coinPriceStr = coinPriceStr.replace("Ξ", "").replace(",", "");
        }


        double coinPrice = Double.parseDouble(coinPriceStr);

        return coinPrice;
    }

    public double getCoinPercentWithoutPercent(String coinPercentStr) {
        coinPercentStr = coinPercentStr.replace("%", "");
        double coinPercent = Double.parseDouble(coinPercentStr);

        return coinPercent;
    }

    public double getCoinVolumeCap(String coinVolumeCapStr) {

        String currencySymbol = "$";

        if (header.getCurrentCurrencyName().equals("ZAR")) {
            currencySymbol = "R";
        } else if (header.getCurrentCurrencyName().equals("TRY")) {
            currencySymbol = "TL";
        } else if (header.getCurrentCurrencyName().equals("THB")) {
            currencySymbol = "฿";
        } else if (header.getCurrentCurrencyName().equals("SGD") || header.getCurrentCurrencyName().equals("NZD") || header.getCurrentCurrencyName().equals("MXN") || header.getCurrentCurrencyName().equals("HKD") || header.getCurrentCurrencyName().equals("CAD") || header.getCurrentCurrencyName().equals("AUD") || header.getCurrentCurrencyName().equals("USD")) {
            currencySymbol = "$";
        } else if (header.getCurrentCurrencyName().equals("SEK") || header.getCurrentCurrencyName().equals("NOK") || header.getCurrentCurrencyName().equals("ISK") || header.getCurrentCurrencyName().equals("DKK")) {
            currencySymbol = "kr";
        } else if (header.getCurrentCurrencyName().equals("RON")) {
            currencySymbol = "RON";
        } else if (header.getCurrentCurrencyName().equals("PLN")) {
            currencySymbol = "zł";
        } else if (header.getCurrentCurrencyName().equals("PHP")) {
            currencySymbol = "₱";
        } else if (header.getCurrentCurrencyName().equals("MYR")) {
            currencySymbol = "RM";
        } else if (header.getCurrentCurrencyName().equals("KRW")) {
            currencySymbol = "₩";
        } else if (header.getCurrentCurrencyName().equals("JPY")) {
            currencySymbol = "￥";
        } else if (header.getCurrentCurrencyName().equals("INR")) {
            currencySymbol = "₹";
        } else if (header.getCurrentCurrencyName().equals("ILS")) {
            currencySymbol = "₪";
        } else if (header.getCurrentCurrencyName().equals("IDR")) {
            currencySymbol = "Rp";
        } else if (header.getCurrentCurrencyName().equals("HUF")) {
            currencySymbol = "Ft";
        } else if (header.getCurrentCurrencyName().equals("HRK")) {
            currencySymbol = "kn";
        } else if (header.getCurrentCurrencyName().equals("CZK")) {
            currencySymbol = "Kč";
        } else if (header.getCurrentCurrencyName().equals("CNY")) {
            currencySymbol = "CN¥";
        } else if (header.getCurrentCurrencyName().equals("CHF")) {
            currencySymbol = "CHF";
        } else if (header.getCurrentCurrencyName().equals("BRL")) {
            currencySymbol = "R$";
        } else if (header.getCurrentCurrencyName().equals("BGN")) {
            currencySymbol = "лв";
        } else if (header.getCurrentCurrencyName().equals("AMD")) {
            currencySymbol = "֏";
        } else if (header.getCurrentCurrencyName().equals("GBP")) {
            currencySymbol = "£";
        } else if (header.getCurrentCurrencyName().equals("EUR")) {
            currencySymbol = "€";
        } else if (header.getCurrentCurrencyName().equals("BTC")) {
            currencySymbol = "฿";
        } else if (header.getCurrentCurrencyName().equals("ETH")) {
            currencySymbol = "Ξ";
        }


        if (coinVolumeCapStr.endsWith("B")) {
            coinVolumeCapStr = coinVolumeCapStr.replace(currencySymbol, "").replace(".", "").replace("B", "000000000");
        } else if (coinVolumeCapStr.endsWith("M")) {
            coinVolumeCapStr = coinVolumeCapStr.replace(currencySymbol, "").replace(".", "").replace("M", "000000");
        } else if (coinVolumeCapStr.endsWith("K")) {
            coinVolumeCapStr = coinVolumeCapStr.replace(currencySymbol, "").replace(".", "").replace("K", "000");
        } else if (coinVolumeCapStr.equals("T")) {
            coinVolumeCapStr = coinVolumeCapStr.replace(currencySymbol, "").replace(".", "").replace("T", "000000000000");
        } else {
            coinVolumeCapStr = coinVolumeCapStr.replace(currencySymbol, "").replace(".", "");
        }

        double coinVolumeCap = Double.parseDouble(coinVolumeCapStr);

        return coinVolumeCap;
    }

    public String getCoinSupplies(String coinSupplyStr) {
        String coinSupply = coinSupplyStr.replaceAll(",", "");

        return coinSupply;
    }


}