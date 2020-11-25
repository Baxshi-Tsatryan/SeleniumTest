package AllPages.ExchangesPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarketsAndTeamUpdates {
    WebDriver driver;
    SeleniumUtils utils;

    public MarketsAndTeamUpdates(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    By marketsTab = By.cssSelector("#__next > main > section > div > div.exchange-info-inner-wrapper > div.exchange-info-tabs-wrapper > div > ul > li:nth-child(2) > a");

    By teamUpdatesTab = By.cssSelector("#__next > main > section > div > div.exchange-info-inner-wrapper > div.exchange-info-tabs-wrapper > div > ul > li:nth-child(3) > a");


    // Markets

    By marketsIndexRank = By.cssSelector("thead th:nth-of-type(1) > .table-column-title");

    By marketsNameRank = By.cssSelector("thead th:nth-of-type(2) > .table-column-title");

    By marketPairRank = By.cssSelector("thead th:nth-of-type(3) > .table-column-title");

    By marketsVolume24hRank = By.cssSelector("thead th:nth-of-type(4) > .table-column-title");

    By marketsVolumePercentRank = By.cssSelector("thead th:nth-of-type(5) > .table-column-title");

    By marketsPriceRank = By.cssSelector("thead th:nth-of-type(6) > .table-column-title");

    By marketsLastUpdatedRank = By.cssSelector("thead span:nth-of-type(2)");


    // Team Updates

    By teamUpdatesTweetNow = By.cssSelector(".secondary");


    // -------------------------------------------------- Methods -----------------------------------------------------

    public void clickOnMarketsTab()
    {
        utils.clickOnElement(marketsTab);
    }

    public void clickOnTeamUpdatesTab()
    {
        utils.clickOnElement(teamUpdatesTab);
    }


    // Markets

    public void clickOnMarketsIndexRank()
    {
        utils.clickOnElement(marketsIndexRank);
    }

    public void clickOnMarketsNameRank()
    {
        utils.clickOnElement(marketsNameRank);
    }

    public void clickOnMarketsPairRank()
    {
        utils.clickOnElement(marketPairRank);
    }

    public void clickOnMarketsVolume24hRank()
    {
        utils.clickOnElement(marketsVolume24hRank);
    }

    public void clickOnMarketsVolumePercentRank()
    {
        utils.clickOnElement(marketsVolumePercentRank);
    }

    public void clickOnMarketsPriceRank()
    {
        utils.clickOnElement(marketsPriceRank);
    }

    public void clickOnMarketsLastUpdatedRank()
    {
        utils.clickOnElement(marketsLastUpdatedRank);
    }


    // Team Updates

    public void clickOnTeamUpdatesTweetNow()
    {
        utils.clickOnElement(teamUpdatesTweetNow);
    }


}
