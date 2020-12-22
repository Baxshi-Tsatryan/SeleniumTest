package AllPages.PortfolioPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeneralPortfolioHoldingsLiquidity {


    WebDriver driver;
    SeleniumUtils utils;

    public GeneralPortfolioHoldingsLiquidity(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    // General

    By updateButton = By.cssSelector(".icon-sync.jsx-3108973771");

    By portfolioAmount = By.cssSelector(".main-price");

    By profitOrLossValue = By.cssSelector("div.profit-container > .jsx-544775375");

    By profitOrLossPercent = By.cssSelector("div.profit-container > .jsx-3108973771 > .jsx-544775375");

    By syncAll = By.cssSelector("span.jsx-3439475407");

    By rangeDropDown = By.cssSelector("div.section3 .primary-nav");

    By currentRange = By.cssSelector("div[title='Set the chart for the date range you would like to see'] .primary-nav");

    By range24h = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By range1w = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By range1m = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(3) .table-row");

    By range3m = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(4) .table-row");

    By range6m = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(5) .table-row");

    By range1y = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(6) .table-row");

    By rangeAll = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(7) .table-row");

    By trade = By.cssSelector(".primary-bordered");

    By moreActionsDropDown = By.cssSelector("div.more-actions .primary-nav");

    By addTransactionInDropDown = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By depositInDropDown = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");


    // Tabs

    By holdingsTab = By.cssSelector("a[href='/en/portfolio/holdings/']");

    By liquidityTab = By.cssSelector("a[href='/en/portfolio/liquidity/']");

    By openPositionsTab = By.cssSelector("a[href='/en/portfolio/open-positions/']");

    By chartsTab = By.cssSelector("a[href='/en/portfolio/charts/']");

    By ordersTab = By.cssSelector("a[href='/en/portfolio/order-history/']");

    By tradesTab = By.cssSelector("a[href='/en/portfolio/trade-history/']");

    By transactionsTab = By.cssSelector("a[href='/en/portfolio/transactions/']");

    By openOrdersTab = By.cssSelector("a[href='/en/portfolio/open-orders/']");


    // Holdings

    //Ranks

    By holdingsNameRank = By.cssSelector("thead th:nth-of-type(1) > .table-column-title"); //thead th:nth-of-type(1)

    By holdingsAmountRank = By.cssSelector("thead span:nth-of-type(2)");

    By holdingsPriceRank = By.cssSelector("thead th:nth-of-type(3) > .table-column-title"); //thead th:nth-of-type(3)

    By holdingsTotalRank = By.cssSelector("thead th:nth-of-type(4) > .table-column-title"); //thead th:nth-of-type(4)

    By holdingsPLRank = By.cssSelector("th.has-value .table-column-title");

    By holdingsPL3Dot = By.cssSelector("th.has-value .jsx-152191236 > .jsx-152191236 > .jsx-152191236");

    By holdingsPLAllTime = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(1) > .table-row");

    By holdingsPL24hours = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(2) > .table-row");

    By holdingsPLLastTrade = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(3) > .table-row");

    By holdingsPLCurrentHoldings = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(4) > .table-row");


    // Liquidity

    // Ranks

    By liquidityNameRank = By.cssSelector("thead th:nth-of-type(1) > .table-column-title");

    By liquidityPriceRank = By.cssSelector("thead th:nth-of-type(2) > .table-column-title");

    By liquidityRank = By.cssSelector("thead span:nth-of-type(2)");

    By liquidityTotalFeesEarned = By.cssSelector("thead th:nth-of-type(4) > .table-column-title");



    // --------------------------------------------------- Methods -----------------------------------------------------

    // General

    public void clickOnUpdate()
    {
        utils.clickOnElement(updateButton);
    }

    public String getPortfolioAmount()
    {
        return utils.getText(portfolioAmount);
    }

    public String getPortfolioProfitLossValue()
    {
        return utils.getText(profitOrLossValue);
    }

    public String getPortfolioProfitLossPercent()
    {
        return utils.getText(profitOrLossPercent);
    }

    public String getPortfolioProfitLossValueColor()
    {
        return utils.getCSSValue(profitOrLossValue, "color");
    }

    public String getPortfolioProfitLossPercentColor()
    {
        return utils.getCSSValue(profitOrLossPercent, "color");
    }

    public String getCurrentRangeTime()
    {
        return utils.getText(currentRange);
    }

    public void clickOnRangeDropDown()
    {
        utils.clickOnElement(rangeDropDown);
    }

    public void clickOnRange24h()
    {
        utils.clickOnElement(range24h);
    }

    public void clickOnRange1w()
    {
        utils.clickOnElement(range1w);
    }

    public void clickOnRange1m()
    {
        utils.clickOnElement(range1m);
    }

    public void clickOnRange3m()
    {
        utils.clickOnElement(range3m);
    }

    public void clickOnRange6m()
    {
        utils.clickOnElement(range6m);
    }

    public void clickOnRange1y()
    {
        utils.clickOnElement(range1y);
    }

    public void clickOnRangeAll()
    {
        utils.clickOnElement(rangeAll);
    }

    public void clickOnSyncAll()
    {
        utils.clickOnElement(syncAll);
    }

    public void clickOnTrade()
    {
        utils.clickOnElement(trade);
    }

    public void clickOnMoreActionsDropDown()
    {
        utils.clickOnElement(moreActionsDropDown);
    }

    public void clickOnAddTransactionsInDropDown()
    {
        utils.clickOnElement(addTransactionInDropDown);
    }

    public void clickOnDepositInDropDown()
    {
        utils.clickOnElement(depositInDropDown);
    }


    // Tabs

    public void clickOnHoldingsTab()
    {
        utils.clickOnElement(holdingsTab);
    }

    public void clickOnLiquidityTab()
    {
        utils.clickOnElement(liquidityTab);
    }

    public Boolean liquidityTabIsDisplayed()
    {
        return utils.isDisplayed(liquidityTab);
    }

    public void clickOnOpenPositionTab()
    {
        utils.clickOnElement(openPositionsTab);
    }

    public Boolean openPositionTabIsDisplayed()
    {
        return utils.isDisplayed(openPositionsTab);
    }

    public void clickOnChartsTab()
    {
        utils.clickOnElement(chartsTab);
    }

    public void clickOnOrdersTab()
    {
        utils.clickOnElement(ordersTab);
    }

    public Boolean ordersTabIsDisplayed()
    {
        return utils.isDisplayed(ordersTab);
    }

    public void clickOnTradeTab()
    {
        utils.clickOnElement(tradesTab);
    }

    public Boolean tradesTabIsDisplayed()
    {
        return utils.isDisplayed(tradesTab);
    }

    public void clickOnTransactionsTab()
    {
        utils.clickOnElement(transactionsTab);
    }

    public void clickOnOpenOrdersTab()
    {
        utils.clickOnElement(openOrdersTab);
    }


    // Holdings

    public void clickOnNameRankHoldings()
    {
        utils.clickOnElement(holdingsNameRank);
    }

    public void clickOnAmountRankHoldings()
    {
        utils.clickOnElement(holdingsAmountRank);
    }

    public void clickOnPriceRankHoldings()
    {
        utils.clickOnElement(holdingsPriceRank);
    }

    public void clickOnTotalRankHoldings()
    {
        utils.clickOnElement(holdingsTotalRank);
    }

    public void clickOnPLRankHoldings()
    {
        utils.clickOnElement(holdingsPLRank);
    }

    public String getCurrentPLHoldings()
    {
        return utils.getText(holdingsPLCurrentHoldings);
    }

    public void clickOnPL3DotHoldings()
    {
        utils.clickOnElement(holdingsPL3Dot);
    }

    public void clickOnAllTime3DotHoldings()
    {
        utils.clickOnElement(holdingsPLAllTime);
    }

    public void clickOn24hours3DotHoldings()
    {
        utils.clickOnElement(holdingsPL24hours);
    }

    public void clickOnLastTrade3DotHoldings()
    {
        utils.clickOnElement(holdingsPLLastTrade);
    }

    public void clickOnCurrentHoldings3DotHoldings()
    {
        utils.clickOnElement(holdingsPLCurrentHoldings);
    }


    // Liquidity

    public void clickOnNameRankLiquidity()
    {
        utils.clickOnElement(liquidityNameRank);
    }

    public void clickOnPriceRankLiquidity()
    {
        utils.clickOnElement(liquidityPriceRank);
    }

    public void clickOnLiquidityRankLiquidity()
    {
        utils.clickOnElement(liquidityRank);
    }

    public void clickOnTotalFeesEarnedRankLiquidity()
    {
        utils.clickOnElement(liquidityTotalFeesEarned);
    }


}
