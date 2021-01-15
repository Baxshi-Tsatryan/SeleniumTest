package AllPages;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Report24h {

    WebDriver driver;
    SeleniumUtils utils;

    public Report24h(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }


    By setupPortfolio = By.cssSelector("div.no-auth-portfolio-content > .jsx-1426819953");


    // Your Portfolio

    By currentValue = By.cssSelector("div.market-report-grid td:nth-of-type(2) > .table-row");

    By change24hPrice = By.cssSelector("div.market-report-grid td:nth-of-type(2) > .table-row");

    By change24hPercent = By.cssSelector("div.market-report-grid td:nth-of-type(2) > div > .percent-preview > .table-row");

    By topPerformingCoinPrice = By.cssSelector("div.row > div > .table-row");

    By topPerformingCoinPercent = By.cssSelector("div.row .percent-preview > .table-row");

    By viewPortfolio = By.cssSelector("a.button-with-link > .jsx-1426819953");


    // Market Overview

    By marketOverviewViewLivePricesButton = By.cssSelector("div.market-report-grid > div:nth-of-type(2) > .jsx-1426819953");

    // All Data

    By marketOverviewFirstIndex = By.cssSelector("div.market-report-grid > div:nth-of-type(2) tr:nth-of-type(1) > td > span");

    By marketOverviewSecondIndex = By.cssSelector("div.market-report-grid > div:nth-of-type(2) tr:nth-of-type(2) > td > span");

    By marketOverviewThirdIndex = By.cssSelector("div.market-report-grid > div:nth-of-type(2) tr:nth-of-type(3) > td > span");


    By marketOverviewFirstName = By.xpath("//*[@id='__next']/main/section/div/div[2]/div[2]/div/table/tbody/tr[1]/td[3]/a");

    By marketOverviewSecondName = By.xpath("//*[@id='__next']/main/section/div/div[2]/div[2]/div/table/tbody/tr[2]/td[3]/a");

    By marketOverviewThirdName = By.xpath("//*[@id='__next']/main/section/div/div[2]/div[2]/div/table/tbody/tr[3]/td[3]/a");


    By marketOverviewFirstPrice = By.cssSelector("div.market-report-grid > div:nth-of-type(2) tr:nth-of-type(1) > td > div > .table-row");

    By marketOverviewSecondPrice = By.cssSelector("div.market-report-grid > div:nth-of-type(2) tr:nth-of-type(2) > td > div > .table-row");

    By marketOverviewThirdPrice = By.cssSelector("div.market-report-grid > div:nth-of-type(2) tr:nth-of-type(3) > td > div > .table-row");


    By marketOverviewFirstPercent = By.cssSelector("div.market-report-grid > div:nth-of-type(2) tr:nth-of-type(1) .percent-preview > .table-row");

    By marketOverviewSecondPercent = By.cssSelector("div.market-report-grid > div:nth-of-type(2) tr:nth-of-type(2) .percent-preview > .table-row");

    By marketOverviewThirdPercent = By.cssSelector("div.market-report-grid > div:nth-of-type(2) tr:nth-of-type(3) .percent-preview > .table-row");


    // Top Volume 24h

    By topVolume24hViewLivePricesButton = By.cssSelector("div.market-report-grid > div:nth-of-type(3) tr:nth-of-type(1) div > .table-row");

    // All data

    By topVolume24hFirstIndex = By.cssSelector("div.market-report-grid > div:nth-of-type(3) tr:nth-of-type(1) > td > span");

    By topVolume24hSecondIndex = By.cssSelector("div.market-report-grid > div:nth-of-type(3) tr:nth-of-type(2) > td > span");

    By topVolume24hThirdIndex = By.cssSelector("div.market-report-grid > div:nth-of-type(3) tr:nth-of-type(3) > td > span");


    By topVolume24hFirstName = By.xpath("//*[@id='__next']/main/section/div/div[2]/div[3]/div/table/tbody/tr[1]/td[3]/a");

    By topVolume24hSecondName = By.xpath("//*[@id='__next']/main/section/div/div[2]/div[3]/div/table/tbody/tr[2]/td[3]/a");

    By topVolume24hThirdName = By.xpath("//*[@id='__next']/main/section/div/div[2]/div[3]/div/table/tbody/tr[3]/td[3]/a");


    By topVolume24hFirstPrice = By.cssSelector("div.market-report-grid > div:nth-of-type(3) tr:nth-of-type(1) div > .table-row");

    By topVolume24hSecondPrice = By.cssSelector("div.market-report-grid > div:nth-of-type(3) tr:nth-of-type(2) div > .table-row");

    By topVolume24hThirdPrice = By.cssSelector("div.market-report-grid > div:nth-of-type(3) tr:nth-of-type(3) div > .table-row");


    // Top Gainers

    // All data

    By topGainersFirstIndex = By.cssSelector("div.market-report-grid > div:nth-of-type(4) tr:nth-of-type(1) > td > span");

    By topGainersSecondIndex = By.cssSelector("div.market-report-grid > div:nth-of-type(4) tr:nth-of-type(2) > td > span");

    By topGainersThirdIndex = By.cssSelector("div.market-report-grid > div:nth-of-type(4) tr:nth-of-type(3) > td > span");


    By topGainersFirstName = By.xpath("//*[@id='__next']/main/section/div/div[2]/div[4]/div/table/tbody/tr[1]/td[3]/a");

    By topGainersSecondName = By.xpath("//*[@id='__next']/main/section/div/div[2]/div[4]/div/table/tbody/tr[2]/td[3]/a");

    By topGainersThirdName = By.xpath("//*[@id='__next']/main/section/div/div[2]/div[4]/div/table/tbody/tr[3]/td[3]/a");


    By topGainersFirstPrice = By.cssSelector("div.market-report-grid > div:nth-of-type(4) tr:nth-of-type(1) > td > div > .table-row");

    By topGainersSecondPrice = By.cssSelector("div.market-report-grid > div:nth-of-type(4) tr:nth-of-type(2) > td > div > .table-row");

    By topGainersThirdPrice = By.cssSelector("div.market-report-grid > div:nth-of-type(4) tr:nth-of-type(3) > td > div > .table-row");


    By topGainersFirstPercent = By.cssSelector("div.market-report-grid tr:nth-of-type(1) .text-up > .table-row");

    By topGainersSecondPercent = By.cssSelector("div.market-report-grid tr:nth-of-type(2) .text-up > .table-row");

    By topGainersThirdPercent = By.cssSelector("div.market-report-grid tr:nth-of-type(3) > td > div > .text-up > .table-row");



    // Top Losers

    // All data

    By topLosersFirstIndex = By.cssSelector("div.market-report-grid > div:nth-of-type(5) tr:nth-of-type(1) > td > span");

    By topLosersSecondIndex = By.cssSelector("div.market-report-grid > div:nth-of-type(5) tr:nth-of-type(2) > td > span");

    By topLosersThirdIndex = By.cssSelector("div.market-report-grid > div:nth-of-type(5) tr:nth-of-type(3) > td > span");


    By topLosersFirstName = By.xpath("//*[@id='__next']/main/section/div/div[2]/div[5]/div/table/tbody/tr[1]/td[3]/a");

    By topLosersSecondName = By.xpath("//*[@id='__next']/main/section/div/div[2]/div[5]/div/table/tbody/tr[2]/td[3]/a");

    By topLosersThirdName = By.xpath("//*[@id='__next']/main/section/div/div[2]/div[5]/div/table/tbody/tr[3]/td[3]/a");


    By topLosersFirstPrice = By.cssSelector("div.market-report-grid > div:nth-of-type(5) tr:nth-of-type(1) > td > div > .table-row");

    By topLosersSecondPrice = By.cssSelector("div.market-report-grid > div:nth-of-type(5) tr:nth-of-type(2) > td > div > .table-row");

    By topLosersThirdPrice = By.cssSelector("div.market-report-grid > div:nth-of-type(5) tr:nth-of-type(3) > td > div > .table-row");


    By topLosersFirstPercent = By.cssSelector("div.market-report-grid > div:nth-of-type(5) tr:nth-of-type(1) .percent-preview > .table-row");

    By topLosersSecondPercent = By.cssSelector("div.market-report-grid > div:nth-of-type(5) tr:nth-of-type(2) .percent-preview > .table-row");

    By topLosersThirdPercent = By.cssSelector("div.market-report-grid > div:nth-of-type(5) tr:nth-of-type(3) .percent-preview > .table-row");



    // Top Exchanges

    By topExchangesMoreExchangesButton = By.cssSelector("div.market-report-grid > div:nth-of-type(6) > .jsx-1426819953");

    // All data

    By topExchangesFirstIndex = By.cssSelector("div.market-report-grid > div:nth-of-type(6) tr:nth-of-type(1) > td:nth-of-type(1) > .table-row");

    By topExchangesSecondIndex = By.cssSelector("div.market-report-grid > div:nth-of-type(6) tr:nth-of-type(2) > td:nth-of-type(1) > .table-row");

    By topExchangesThirdIndex = By.cssSelector("div.market-report-grid > div:nth-of-type(6) tr:nth-of-type(3) > td:nth-of-type(1) > .table-row");


    By topExchangesFirstName = By.xpath("//*[@id='__next']/main/section/div/div[2]/div[6]/div/table/tbody/tr[1]/td[3]/a");

    By topExchangesSecondName = By.xpath("//*[@id='__next']/main/section/div/div[2]/div[6]/div/table/tbody/tr[2]/td[3]/a");

    By topExchangesThirdName = By.xpath("//*[@id='__next']/main/section/div/div[2]/div[6]/div/table/tbody/tr[3]/td[3]/a");


    By topExchangesFirstPrice = By.cssSelector("div.market-report-grid tr:nth-of-type(1) > td:nth-of-type(4) > .table-row");

    By topExchangesSecondPrice = By.cssSelector("div.market-report-grid tr:nth-of-type(2) > td:nth-of-type(4) > .table-row");

    By topExchangesThirdPrice = By.cssSelector("div.market-report-grid tr:nth-of-type(3) > td:nth-of-type(4) > .table-row");


    // Subscribtion

    By subscribeEmailField = By.cssSelector("[placeholder='example@coinstats.com']");

    By subscribeButton = By.cssSelector(".primary-bordered");



    // ----------------------------------------------- Methods ---------------------------------------------


    public Boolean setupPortfolioIsDisplayed()
    {
        return utils.isDisplayed(setupPortfolio);
    }

    public void clickOnSetupPortfolio()
    {
        utils.clickOnElement(setupPortfolio);
    }


    // Your Portfolio

    public String getCurrentValue()
    {
        return utils.getText(currentValue);
    }

    public String get24hChangePrice()
    {
        return utils.getText(change24hPrice);
    }

    public String get24hChangePercent()
    {
        return utils.getText(change24hPercent);
    }

    public String get24hChangePercentColor()
    {
        return utils.getCSSValue(change24hPercent, "color");
    }

    public String getTopPerformingCoinPrice()
    {
        return utils.getText(topPerformingCoinPrice);
    }

    public String getTopPerformingCoinPercent()
    {
        return utils.getText(topPerformingCoinPercent);
    }

    public String getTopPerformingCoinPercentColor()
    {
        return utils.getCSSValue(topPerformingCoinPercent, "color");
    }

    public void clickOnViewPortfolio()
    {
        utils.clickOnElement(viewPortfolio);
    }


    // Market Overview

    public void clickOnMarketOverviewFirstCoin()
    {
        utils.clickOnElement(marketOverviewFirstName);
    }

    public void clickOnMarketOverviewSecondCoin()
    {
        utils.clickOnElement(marketOverviewSecondName);
    }

    public void clickOnMarketOverviewThirdCoin()
    {
        utils.clickOnElement(marketOverviewThirdName);
    }

    public String getMarketOverviewFirstIndex()
    {
        return utils.getText(marketOverviewFirstIndex);
    }

    public String getMarketOverviewFirstName()
    {
        return utils.getText(marketOverviewFirstName);
    }

    public String getMarketOverviewFirstPrice()
    {
        return utils.getText(marketOverviewFirstPrice);
    }

    public String getMarketOverviewFirstPercent()
    {
        return utils.getText(marketOverviewFirstPercent);
    }

    public String getMarketOverviewFirstPercentColor()
    {
        return utils.getCSSValue(marketOverviewFirstPercent, "color");
    }

    public String getMarketOverviewSecondIndex()
    {
        return utils.getText(marketOverviewSecondIndex);
    }

    public String getMarketOverviewSecondName()
    {
        return utils.getText(marketOverviewSecondName);
    }

    public String getMarketOverviewSecondPrice()
    {
        return utils.getText(marketOverviewSecondPrice);
    }

    public String getMarketOverviewSecondPercent()
    {
        return utils.getText(marketOverviewSecondPercent);
    }

    public String getMarketOverviewSecondPercentColor()
    {
        return utils.getCSSValue(marketOverviewSecondPercent, "color");
    }

    public String getMarketOverviewThirdIndex()
    {
        return utils.getText(marketOverviewThirdIndex);
    }

    public String getMarketOverviewThirdName()
    {
        return utils.getText(marketOverviewThirdName);
    }

    public String getMarketOverviewThirdPrice()
    {
        return utils.getText(marketOverviewThirdPrice);
    }

    public String getMarketOverviewThirdPercent()
    {
        return utils.getText(marketOverviewThirdPercent);
    }

    public String getMarketOverviewThirdPercentColor()
    {
        return utils.getCSSValue(marketOverviewThirdPercent, "color");
    }

    public void clickOnMarketOverviewViewLivePricesButton()
    {
        utils.clickOnElement(marketOverviewViewLivePricesButton);
    }


    // Top Volume 24h

    public void clickOnTopVolume24hFirstCoin()
    {
        utils.clickOnElement(topVolume24hFirstName);
    }

    public void clickOnTopVolume24hSecondCoin()
    {
        utils.clickOnElement(topVolume24hSecondName);
    }

    public void clickOnTopVolume24hThirdCoin()
    {
        utils.clickOnElement(topVolume24hThirdName);
    }

    public String getTopVolume24hFirstIndex()
    {
        return utils.getText(topVolume24hFirstIndex);
    }

    public String getTopVolume24hFirstName()
    {
        return utils.getText(topVolume24hFirstName);
    }

    public String getTopVolume24hFirstPrice()
    {
        return utils.getText(topVolume24hFirstPrice);
    }

    public String getTopVolume24hSecondIndex()
    {
        return utils.getText(topVolume24hSecondIndex);
    }

    public String getTopVolume24hSecondName()
    {
        return utils.getText(topVolume24hSecondName);
    }

    public String getTopVolume24hSecondPrice()
    {
        return utils.getText(topVolume24hSecondPrice);
    }

    public String getTopVolume24hThirdIndex()
    {
        return utils.getText(topVolume24hThirdIndex);
    }

    public String getTopVolume24hThirdName()
    {
        return utils.getText(topVolume24hThirdName);
    }

    public String getTopVolume24hThirdPrice()
    {
        return utils.getText(topVolume24hThirdPrice);
    }

    public void clickOnTopVolume24hViewLivePricesButton()
    {
        utils.clickOnElement(topVolume24hViewLivePricesButton);
    }


    // Top Gainers

    public void clickOnTopGainersFirstCoin()
    {
        utils.clickOnElement(topGainersFirstName);
    }

    public void clickOnTopGainersSecondCoin()
    {
        utils.clickOnElement(topGainersSecondName);
    }

    public void clickOnTopGainersThirdCoin()
    {
        utils.clickOnElement(topGainersThirdName);
    }

    public String getTopGainersFirstIndex()
    {
        return utils.getText(topGainersFirstIndex);
    }

    public String getTopGainersFirstName()
    {
        return utils.getText(topGainersFirstName);
    }

    public String getTopGainersFirstPrice()
    {
        return utils.getText(topGainersFirstPrice);
    }

    public String getTopGainersFirstPercent()
    {
        return utils.getText(topGainersFirstPercent);
    }

    public String getTopGainersFirstPercentColor()
    {
        return utils.getCSSValue(topGainersFirstPercent, "color");
    }

    public String getTopGainersSecondIndex()
    {
        return utils.getText(topGainersSecondIndex);
    }

    public String getTopGainersSecondName()
    {
        return utils.getText(topGainersSecondName);
    }

    public String getTopGainersSecondPrice()
    {
        return utils.getText(topGainersSecondPrice);
    }

    public String getTopGainersSecondPercent()
    {
        return utils.getText(topGainersSecondPercent);
    }

    public String getTopGainersSecondPercentColor()
    {
        return utils.getCSSValue(topGainersSecondPercent, "color");
    }

    public String getTopGainersThirdIndex()
    {
        return utils.getText(topGainersThirdIndex);
    }

    public String getTopGainersThirdName()
    {
        return utils.getText(topGainersThirdName);
    }

    public String getTopGainersThirdPrice()
    {
        return utils.getText(topGainersThirdPrice);
    }

    public String getTopGainersThirdPercent()
    {
        return utils.getText(topGainersThirdPercent);
    }

    public String getTopGainersThirdPercentColor()
    {
        return utils.getCSSValue(topGainersThirdPercent, "color");
    }


    // Top Losers

    public void clickOnTopLosersFirstCoin()
    {
        utils.clickOnElement(topLosersFirstName);
    }

    public void clickOnTopLosersSecondCoin()
    {
        utils.clickOnElement(topLosersSecondName);
    }

    public void clickOnTopLosersThirdCoin()
    {
        utils.clickOnElement(topLosersThirdName);
    }

    public String getTopLosersFirstIndex()
    {
        return utils.getText(topLosersFirstIndex);
    }

    public String getTopLosersFirstName()
    {
        return utils.getText(topLosersFirstName);
    }

    public String getTopLosersFirstPrice()
    {
        return utils.getText(topLosersFirstPrice);
    }

    public String getTopLosersFirstPercent()
    {
        return utils.getText(topLosersFirstPercent);
    }

    public String getTopLosersFirstPercentColor()
    {
        return utils.getCSSValue(topLosersFirstPercent, "color");
    }

    public String getTopLosersSecondIndex()
    {
        return utils.getText(topLosersSecondIndex);
    }

    public String getTopLosersSecondName()
    {
        return utils.getText(topLosersSecondName);
    }

    public String getTopLosersSecondPrice()
    {
        return utils.getText(topLosersSecondPrice);
    }

    public String getTopLosersSecondPercent()
    {
        return utils.getText(topLosersSecondPercent);
    }

    public String getTopLosersSecondPercentColor()
    {
        return utils.getCSSValue(topLosersSecondPercent, "color");
    }

    public String getTopLosersThirdIndex()
    {
        return utils.getText(topLosersThirdIndex);
    }

    public String getTopLosersThirdName()
    {
        return utils.getText(topLosersThirdName);
    }

    public String getTopLosersThirdPrice()
    {
        return utils.getText(topLosersThirdPrice);
    }

    public String getTopLosersThirdPercent()
    {
        return utils.getText(topLosersThirdPercent);
    }

    public String getTopLosersThirdPercentColor()
    {
        return utils.getCSSValue(topLosersThirdPercent, "color");
    }


    // Top Exchanges

    public void clickOnTopExchangesFirstCoin()
    {
        utils.clickOnElement(topExchangesFirstName);
    }

    public void clickOnTopExchangesSecondCoin()
    {
        utils.clickOnElement(topExchangesSecondName);
    }

    public void clickOnTopExchangesThirdCoin()
    {
        utils.clickOnElement(topExchangesThirdName);
    }

    public String getTopExchangesFirstIndex()
    {
        return utils.getText(topExchangesFirstIndex);
    }

    public String getTopExchangesFirstName()
    {
        return utils.getText(topExchangesFirstName);
    }

    public String getTopExchangesFirstPrice()
    {
        return utils.getText(topExchangesFirstPrice);
    }

    public String getTopExchangesSecondIndex()
    {
        return utils.getText(topExchangesSecondIndex);
    }

    public String getTopExchangesSecondName()
    {
        return utils.getText(topExchangesSecondName);
    }

    public String getTopExchangesSecondPrice()
    {
        return utils.getText(topExchangesSecondPrice);
    }

    public String getTopExchangesThirdIndex()
    {
        return utils.getText(topExchangesThirdIndex);
    }

    public String getTopExchangesThirdName()
    {
        return utils.getText(topExchangesThirdName);
    }

    public String getTopExchangesThirdPrice()
    {
        return utils.getText(topExchangesThirdPrice);
    }

    public void clickOnMoreExchangesButton()
    {
        utils.clickOnElement(topExchangesMoreExchangesButton);
    }


    // Subscribtion

    public void typeEmailForSubscribtion(String email)
    {
        utils.sendKeysAction(subscribeEmailField, email);
    }

    public void clearEmailSubscribeField()
    {
        utils.clear(subscribeEmailField);
    }

    public void clickOnSubscribe()
    {
        utils.clickOnElement(subscribeButton);
    }

}
