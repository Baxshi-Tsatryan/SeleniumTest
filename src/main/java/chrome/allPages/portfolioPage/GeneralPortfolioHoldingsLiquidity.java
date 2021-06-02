package chrome.allPages.portfolioPage;

import chrome.mainPackage.SeleniumUtils;
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

    By defiTab = By.cssSelector("a[href='/en/portfolio/defi/']");

    By openPositionsTab = By.cssSelector("a[href='/en/portfolio/open-positions/']");

    By chartsTab = By.cssSelector("a[href='/en/portfolio/charts/']");

    By ordersTab = By.cssSelector("a[href='/en/portfolio/order-history/']");

    By tradesTab = By.cssSelector("a[href='/en/portfolio/trade-history/']");

    By transactionsTab = By.cssSelector("a[href='/en/portfolio/transactions/']");

    By openOrdersTab = By.cssSelector("a[href='/en/portfolio/open-orders/']");


    // Holdings

    // Columns

    By holdingsNameColumn = By.cssSelector("thead th:nth-of-type(1) > .table-column-title"); //thead th:nth-of-type(1)

    By holdingsAmountColumn = By.cssSelector("thead span:nth-of-type(2)");

    By holdingsPriceColumn = By.cssSelector("thead th:nth-of-type(3) > .table-column-title"); //thead th:nth-of-type(3)

    By holdingsTotalColumn = By.cssSelector("thead th:nth-of-type(4) > .table-column-title"); //thead th:nth-of-type(4)

    By holdingsPLColumn = By.cssSelector("th.has-value .table-column-title");

    By holdingsPL3Dot = By.cssSelector("th.has-value .jsx-152191236 > .jsx-152191236 > .jsx-152191236");

    By holdingsPLAllTime = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(1) > .table-row");

    By holdingsPL24hours = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(2) > .table-row");

    By holdingsPLLastTrade = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(3) > .table-row");

    By holdingsPLCurrentHoldings = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(4) > .table-row");


    By customColumnsDropDown = By.cssSelector(".jsx-2095321675");

    By customColumnsRank = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .column-wrapper .table-row");

    By customColumnsAmount = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .column-wrapper .table-row");

    By customColumnsPrice = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(3) .column-wrapper .table-row");

    By customColumns1hChange = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(4) .column-wrapper .table-row");

    By customColumns24hChange = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(5) .column-wrapper .table-row");

    By customColumnsTotal = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(6) .column-wrapper .table-row");

    By customColumnsPriceInBTC = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(7) .column-wrapper .table-row");

    By customColumnsMarketCap = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(8) .column-wrapper .table-row");

    By customColumns24hVolume = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(9) .column-wrapper .table-row");

    By customColumnsCSScore = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(10) .column-wrapper .table-row");

    By customColumnsCSScore24h = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(11) .column-wrapper .table-row");

    By customColumnsPriceGraph = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(12) .column-wrapper .table-row");

    By customColumnsPL = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(13) .column-wrapper .table-row");


    // Liquidity

    // Columns

    By liquidityNameColumn = By.cssSelector("thead th:nth-of-type(1) > .table-column-title");

    By liquidityPriceColumn = By.cssSelector("thead th:nth-of-type(2) > .table-column-title");

    By liquidityColumn = By.cssSelector("thead span:nth-of-type(2)");

    By liquidityTotalFeesEarned = By.cssSelector("thead th:nth-of-type(4) > .table-column-title");


    // --------------------------------------------------- Methods -----------------------------------------------------

    public void clickOnTabs(String tabName){
        utils.click(By.linkText(tabName));
    }

    // General

    public GeneralPortfolioHoldingsLiquidity clickOnUpdate() {
        utils.click(updateButton);
        return this;
    }

    public String getPortfolioAmount() {
        return utils.getText(portfolioAmount);
    }

    public String getPortfolioProfitLossValue() {
        return utils.getText(profitOrLossValue);
    }

    public String getPortfolioProfitLossPercent() {
        return utils.getText(profitOrLossPercent);
    }

    public String getPortfolioProfitLossValueColor() {
        return utils.getCSSValue(profitOrLossValue, "color");
    }

    public String getPortfolioProfitLossPercentColor() {
        return utils.getCSSValue(profitOrLossPercent, "color");
    }

    public String getCurrentRangeTime() {
        return utils.getText(currentRange);
    }

    public GeneralPortfolioHoldingsLiquidity clickOnRangeDropDown() {
        utils.click(rangeDropDown);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnRange24h() {
        utils.click(range24h);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnRange1w() {
        utils.click(range1w);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnRange1m() {
        utils.click(range1m);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnRange3m() {
        utils.click(range3m);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnRange6m() {
        utils.click(range6m);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnRange1y() {
        utils.click(range1y);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnRangeAll() {
        utils.click(rangeAll);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnSyncAll() {
        utils.click(syncAll);
        return this;
    }

    public Boolean syncAllIsDisplayed() {
        return utils.isDisplayed(syncAll);
    }

    public GeneralPortfolioHoldingsLiquidity clickOnTrade() {
        utils.click(trade);
        return this;
    }

    public Boolean tradeIsDisplayed() {
        return utils.isDisplayed(trade);
    }

    public GeneralPortfolioHoldingsLiquidity clickOnMoreActionsDropDown() {
        utils.click(moreActionsDropDown);
        return this;
    }

    public Boolean moreActionDropDownIsDisplayed() {
        return utils.isDisplayed(moreActionsDropDown);
    }

    public GeneralPortfolioHoldingsLiquidity clickOnAddTransactionsInDropDown() {
        utils.click(addTransactionInDropDown);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnDepositInDropDown() {
        utils.click(depositInDropDown);
        return this;
    }

    public Boolean depositIsDisplayed() {
        return utils.isDisplayed(depositInDropDown);
    }


    // Tabs

    public GeneralPortfolioHoldingsLiquidity clickOnHoldingsTab() {
        utils.click(holdingsTab);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnDefiTab() {
        utils.click(defiTab);
        return this;
    }

    public boolean defiTabIsDisplayed() {
        return utils.isDisplayed(defiTab);
    }

    public boolean defiTabIsDisplayed2() {
        return utils.isDisplayed(defiTab);
    }

    public GeneralPortfolioHoldingsLiquidity clickOnOpenPositionTab() {
        utils.click(openPositionsTab);
        return this;
    }

    public Boolean openPositionTabIsDisplayed() {
        return utils.isDisplayed(openPositionsTab);
    }

    public Boolean openPositionTabIsDisplayed2() {
        return utils.isDisplayed2(openPositionsTab);
    }

    public GeneralPortfolioHoldingsLiquidity clickOnChartsTab() {
        utils.click(chartsTab);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnOrdersTab() {
        utils.click(ordersTab);
        return this;
    }

    public Boolean ordersTabIsDisplayed() {
        return utils.isDisplayed(ordersTab);
    }

    public GeneralPortfolioHoldingsLiquidity clickOnTradeTab() {
        utils.click(tradesTab);
        return this;
    }

    public Boolean tradesTabIsDisplayed() {
        return utils.isDisplayed(tradesTab);
    }

    public GeneralPortfolioHoldingsLiquidity clickOnTransactionsTab() {
        utils.click(transactionsTab);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnOpenOrdersTab() {
        utils.click(openOrdersTab);
        return this;
    }


    // Holdings

    public GeneralPortfolioHoldingsLiquidity clickOnNameColumnHoldings() {
        utils.click(holdingsNameColumn);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnAmountColumnHoldings() {
        utils.click(holdingsAmountColumn);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnPriceColumnHoldings() {
        utils.click(holdingsPriceColumn);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnTotalColumnHoldings() {
        utils.click(holdingsTotalColumn);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnPLColumnHoldings() {
        utils.click(holdingsPLColumn);
        return this;
    }

    public String getCurrentPLHoldings() {
        return utils.getText(holdingsPLCurrentHoldings);
    }

    public GeneralPortfolioHoldingsLiquidity clickOnPL3DotHoldings() {
        utils.click(holdingsPL3Dot);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnAllTime3DotHoldings() {
        utils.click(holdingsPLAllTime);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOn24hours3DotHoldings() {
        utils.click(holdingsPL24hours);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnLastTrade3DotHoldings() {
        utils.click(holdingsPLLastTrade);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnCurrentHoldings3DotHoldings() {
        utils.click(holdingsPLCurrentHoldings);
        return this;
    }


    public GeneralPortfolioHoldingsLiquidity clickOnCustomColumnsDropDown() {
        utils.click(customColumnsDropDown);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnCustomColumnsRank() {
        utils.click(customColumnsRank);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnCustomColumnsAmount() {
        utils.click(customColumnsAmount);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnCustomColumnsPrice() {
        utils.click(customColumnsPrice);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnCustomColumns1hChange() {
        utils.click(customColumns1hChange);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnCustomColumns24hChange() {
        utils.click(customColumns24hChange);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnCustomColumnsTotal() {
        utils.click(customColumnsTotal);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnCustomColumnsPriceInBTC() {
        utils.click(customColumnsPriceInBTC);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnCustomColumnsMarketCap() {
        utils.click(customColumnsMarketCap);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnCustomColumns24hVolume() {
        utils.click(customColumns24hVolume);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnCustomColumnsCSScore() {
        utils.click(customColumnsCSScore);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnCustomColumnsCSScore24h() {
        utils.click(customColumnsCSScore24h);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnCustomColumnsPriceGraph() {
        utils.click(customColumnsPriceGraph);
        return this;
    }

    public GeneralPortfolioHoldingsLiquidity clickOnCustomColumnsPL() {
        utils.click(customColumnsPL);
        return this;
    }


    // Defi


}
