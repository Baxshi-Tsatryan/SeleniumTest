package Chrome.AllPages;

import Chrome.MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoinGecko {

    WebDriver driver;
    SeleniumUtils utils;

    public CoinGecko(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    By searchField = By.cssSelector("[placeholder='Search']");

    By firstCoinSearchResult = By.cssSelector("#wrapper > div.header.dashboard > div.main-header.container.d-lg-flex.justify-content-between.align-items-center.py-2 > div.col-md-12.col-lg-3.d-inline-block.px-0 > div.d-none.d-sm-block > div > div > div.search-results.w-100.mt-2.rounded.p-3_5 > div > ul.list-reset.relevant-results > li:nth-child(1) > a > span:nth-child(2)");


    // Coin Details

    By coinName = By.cssSelector(".mr-md-3");

    By coinPrice = By.cssSelector("div.text-3xl > .no-wrap");

    By coinPercent = By.xpath("//span[@class='live-percent-change ml-1']/span[@class='text-green']");

    By coinPriceBTC = By.cssSelector(".text-normal.text-muted > div");

    By coinPercentBTC = By.cssSelector(".text-normal.text-muted > div:nth-of-type(1) .text-danger");

    By coinMarketCap = By.xpath(".mb-3.mt-1 > div:nth-of-type(6) > .mt-1"); // .mb-3.mt-1 > div:nth-of-type(6) > .mt-1"); //  body > div.container > div.mt-3 > div.col-12.row.p-0.m-0.mb-2.d-flex.flex-column-reverse.flex-sm-row > div.col-md-3.col-lg-5.text-center.text-md-right.mt-3.mt-md-0.pr-0 > div > div:nth-child(1) > div.mt-1 > span

    By coin24hTradingVol = By.cssSelector("body > div.container > div.mt-3 > div.col-12.row.p-0.m-0.mb-2.d-flex.flex-column-reverse.flex-sm-row > div.col-md-3.col-lg-5.text-center.text-md-right.mt-3.mt-md-0.pr-0 > div > div:nth-child(2) > div.mt-1 > span");

    By coin24hLow = By.cssSelector("body > div.container > div.mt-3 > div.col-12.row.p-0.m-0.mb-2.d-flex.flex-column-reverse.flex-sm-row > div.col-md-3.col-lg-5.text-center.text-md-right.mt-3.mt-md-0.pr-0 > div > div:nth-child(3) > div.mt-1 > span:nth-child(1)");

    By coin24hHigh = By.cssSelector("body > div.container > div.mt-3 > div.col-12.row.p-0.m-0.mb-2.d-flex.flex-column-reverse.flex-sm-row > div.col-md-3.col-lg-5.text-center.text-md-right.mt-3.mt-md-0.pr-0 > div > div:nth-child(3) > div.mt-1 > span:nth-child(2)");

    By coinTotalAndAvailableSupply = By.cssSelector(".mb-3.mt-1 > div:nth-of-type(4) > .mt-1");

    By coinFullyDilutedValuation = By.cssSelector(".mb-3.mt-1 > div:nth-of-type(4) > .mt-1"); // body > div.container > div.mt-3 > div.col-12.row.p-0.m-0.mb-2.d-flex.flex-column-reverse.flex-sm-row > div.col-md-3.col-lg-5.text-center.text-md-right.mt-3.mt-md-0.pr-0 > div > div:nth-child(5) > div.mt-1 > span

    By coinTotalSupply = By.cssSelector(".mb-3.mt-1 > div:nth-of-type(6) > .mt-1");

    By coinMarketCapDominance = By.cssSelector("table.b-b tr:nth-of-type(3) > td");

    By coinTradingVolume = By.cssSelector("#general > div:nth-child(1) > div.col-lg-4.card-column.d-flex.flex-column-reverse.flex-sm-column.order-3.order-sm-3.order-md-3.order-lg-2 > div:nth-child(1) > div > table > tbody > tr:nth-child(4) > td > span");

    By coinRank = By.cssSelector("table.b-b tr:nth-of-type(8) > td");


    By firstExchangeSearchResult = By.cssSelector("div.scroll-container > ul:nth-of-type(3) > li:nth-of-type(1) span:nth-of-type(2)");

    By exchangeAmount = By.cssSelector(".trade-vol-amount");


    // ------------------------------------------------ Methods ----------------------------------------------

    public CoinGecko typeSearchField(String coinOrExchangeName) {
        utils.sendKeys(searchField, coinOrExchangeName);
        return this;
    }

    public CoinGecko clickOnFirstCoinResult() {
        utils.click(firstCoinSearchResult);
        return this;
    }

    public String getCoinName() {
        return utils.getText(coinName);
    }

    public String getCoinPrice() {
        return utils.getText(coinPrice);
    }

    public String getCoinPercent() {
        return utils.getText(coinPercent);
    }

    public String getCoinPriceBTC() {
        return utils.getText(coinPriceBTC);
    }

    public String getCoinPercentBTC() {
        return utils.getText(coinPercentBTC);
    }

    public String getCoin24hTradingVol() {
        return utils.getText(coin24hTradingVol);
    }

    public String getCoin24hHigh() {
        return utils.getText(coin24hHigh);
    }

    public String getCoin24hLow() {
        return utils.getText(coin24hLow);
    }

    public String getCoinTotalAndAvailableSupply() {
        return utils.getText(coinTotalAndAvailableSupply);
    }

    public String getCoinFullyDilutedValuation() {
        return utils.getText(coinFullyDilutedValuation);
    }

    public String getCoinTotalSupply() {
        return utils.getText(coinTotalSupply);
    }

    public String getCoinMarketCapDominance() {
        return utils.getText(coinMarketCapDominance);
    }

    public String getCoinTradingVolume() {
        return utils.getText(coinTradingVolume);
    }

    public String getCoinRank() {
        return utils.getText(coinRank);
    }


    public String getCoinMarketCap() {
        return utils.getText(coinMarketCap);
    }

    public CoinGecko clickOnFirstExchangeResult() {
        utils.click(firstExchangeSearchResult);
        return this;
    }

    public String getExchangeAmount() {
        return utils.getText(exchangeAmount);
    }

}
