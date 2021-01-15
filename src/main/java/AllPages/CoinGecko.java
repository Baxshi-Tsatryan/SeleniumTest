package AllPages;

import MainPackage.SeleniumUtils;
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

    By coinName = By.cssSelector(".mr-md-3");

    By coinPrice = By.cssSelector("div.text-3xl > .no-wrap");

    By coinPercent = By.cssSelector("span.ml-1 > .text-danger");

    By coinPriceBTC = By.cssSelector(".text-normal.text-muted > div:nth-of-type(1) .text-danger");

    By coinPriceETH = By.cssSelector(".text-normal.text-muted > div:nth-of-type(2) .text-danger");

    By coinMarketCap = By.cssSelector(".mb-3.mt-1 [data-price-btc='2249.70575424491']");

    By firstExchangeSearchResult = By.cssSelector("div.scroll-container > ul:nth-of-type(3) > li:nth-of-type(1) span:nth-of-type(2)");

    By exchangeAmount = By.cssSelector(".trade-vol-amount");



    // ------------------------------------------------ Methods ----------------------------------------------

    public void typeSearchField(String coinOrExchangeName)
    {
        utils.sendKeys(searchField, coinOrExchangeName);
    }

    public void clickOnFirstCoinResult()
    {
        utils.clickOnElement(firstCoinSearchResult);
    }

    public String getCoinName()
    {
        return utils.getText(coinName);
    }

    public String getCoinPrice()
    {
        return utils.getText(coinPrice);
    }

    public String getCoinPercent()
    {
        return utils.getText(coinPercent);
    }

    public String getCoinPriceBTC()
    {
        return utils.getText(coinPriceBTC);
    }

    public String getCoinPriceETH()
    {
        return utils.getText(coinPriceETH);
    }

    public String getCoinMarketCap()
    {
        return utils.getText(coinMarketCap);
    }

    public void clickOnFirstExchangeResult()
    {
        utils.clickOnElement(firstExchangeSearchResult);
    }

    public String getExchangeAmount()
    {
        return utils.getText(exchangeAmount);
    }

}
