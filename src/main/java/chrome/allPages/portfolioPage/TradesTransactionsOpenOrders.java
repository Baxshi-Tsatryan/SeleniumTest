package chrome.allPages.portfolioPage;

import chrome.mainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TradesTransactionsOpenOrders {

    WebDriver driver;
    SeleniumUtils utils;

    public TradesTransactionsOpenOrders(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    // Tabs

    By transactionsTab = By.cssSelector("a[href='/en/portfolio/transactions/']");

    By openOrdersTab = By.cssSelector("a[href='/en/portfolio/open-orders/']");

    // Filters

    By searchCoinFieldTrades = By.cssSelector("[placeholder='Search coin']");

    By dateFromField = By.cssSelector("[placeholder='From']");

    By dateToField = By.cssSelector("[placeholder='To']");


    // Calendar

    By nextMonth = By.cssSelector(".react-datepicker__navigation--next");

    By previousMonth = By.cssSelector(".react-datepicker__navigation--previous");

    By currentMonthYear = By.cssSelector(".react-datepicker__current-month");


    // Filters

    By searchCoinFieldTransactions = By.cssSelector("input.jsx-931209423");

    By currentTypeTransactions = By.cssSelector("div.multi-select-dropdown-placeholder > .table-row");

    By typeDropDownTransaction = By.cssSelector(".multi-select-dropdown-placeholder");

    By applyTypeTransaction = By.cssSelector(".actions-container.jsx-1597052978 > .jsx-1426819953");

    By exportCSV = By.cssSelector("div.export-with-loader > span:nth-of-type(2)");


    // Transactions Last

    By transactionTypeLast = By.cssSelector("tbody > tr:nth-of-type(2) .text-up > .table-row");

    By transactionDateLast = By.cssSelector("tbody > tr:nth-of-type(2) .transaction-date > span:nth-of-type(1)");

    By transactionTimeLast = By.cssSelector("tbody > tr:nth-of-type(2) .transaction-date > span:nth-of-type(2)");

    By transactionCoinAmountLast = By.cssSelector("tbody > tr:nth-of-type(2) .transaction-coin > .table-row");

    By transactionWorthLast = By.cssSelector("tbody > tr:nth-of-type(2) .transaction-coin .table-row-secondary");

    By transactionCoinPriceLast = By.cssSelector("tbody > tr:nth-of-type(2) > td:nth-of-type(4) .table-row");

    By transactionPairLast = By.cssSelector("tbody td:nth-of-type(5) > .table-value > span > .table-row");

    By transactionPairPriceLast = By.cssSelector("tbody span:nth-of-type(1) > .table-row-secondary");

    By transactionFeeLast = By.cssSelector("tbody .table-value > .table-row-secondary");

    By transactionPLFirstLast = By.cssSelector("tbody > tr:nth-of-type(2) .profit-loss > .table-row");

    By transactionPLSecondLast = By.cssSelector("tbody > tr:nth-of-type(2) .profit-loss .table-row-secondary");

    By transaction3DotLast = By.cssSelector("tbody > tr:nth-of-type(2) .jsx-3397508174 > .jsx-3397508174 > .jsx-3397508174");

    By transactionEditIn3Dot = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(1) > .table-row");

    By transactionDeleteIn3Dot = By.cssSelector("div.more-menu-wrapper > div:nth-of-type(2) > .table-row");

    By transactionFromLast = By.cssSelector("div.transfer > span:nth-of-type(1)");

    By transactionToLast = By.cssSelector("div.transfer > span:nth-of-type(3)");

    By transactionNotesLast = By.cssSelector("div.note-container > .table-row-secondary > span");


    // --------------------------------------------- Methods -----------------------------------------------------------

    // Tabs

    public TradesTransactionsOpenOrders clickOnTransactionsTab() {
        utils.click(transactionsTab);
        return this;
    }

    public Boolean openOrdersTabIsDisplayed() {
        return utils.isDisplayed(openOrdersTab);
    }

    public TradesTransactionsOpenOrders clickOnOpenOrdersTab() {
        utils.click(openOrdersTab);
        return this;
    }

    // Trades Filters

    public TradesTransactionsOpenOrders typeDateFromTrades(String date) {
        utils.sendKeysAction(dateFromField, date);
        return this;
    }

    public String getDateFromTrades() {
        return utils.getText(dateFromField);
    }

    public TradesTransactionsOpenOrders clearDateFromTrades() {
        utils.clear(dateFromField);
        return this;
    }

    public TradesTransactionsOpenOrders typeDateToTrades(String date) {
        utils.sendKeysAction(dateToField, date);
        return this;
    }

    public String getDateToTrades() {
        return utils.getText(dateToField);
    }

    public TradesTransactionsOpenOrders clearDateToTrades() {
        utils.clear(dateToField);
        return this;
    }

    public TradesTransactionsOpenOrders clickOnNextMonth() {
        utils.click(nextMonth);
        return this;
    }

    public TradesTransactionsOpenOrders clickOnPreviousMonth() {
        utils.click(previousMonth);
        return this;
    }

    public String getCurrentMonthYear() {
        return utils.getText(currentMonthYear);
    }

    public TradesTransactionsOpenOrders typeCoinNameTrades(String coinName) {
        utils.sendKeysAction(searchCoinFieldTrades, coinName);
        return this;
    }

    public String getCoinNameTrades() {
        return utils.getText(searchCoinFieldTrades);
    }

    public TradesTransactionsOpenOrders clearCoinNameTrades() {
        utils.clear(searchCoinFieldTrades);
        return this;
    }


    // Transactions

    // Filters

    public TradesTransactionsOpenOrders typeCoinNameTransactions(String coinName) {
        utils.sendKeysAction(searchCoinFieldTransactions, coinName);
        return this;
    }

    public String getCoinNameTransactions() {
        return utils.getText(searchCoinFieldTransactions);
    }

    public TradesTransactionsOpenOrders clearCoinNameTransactions() {
        utils.clear(searchCoinFieldTransactions);
        return this;
    }

    public String getCurrentTypeFilterTransactions() {
        return utils.getText(currentTypeTransactions);
    }

    public TradesTransactionsOpenOrders clickOnTypesDropDownTransactions() {
        utils.click(typeDropDownTransaction);
        return this;
    }

    public TradesTransactionsOpenOrders clickOnApplyTypeTransactions() {
        utils.click(applyTypeTransaction);
        return this;
    }

    public Boolean applyTypeTransactionsIsDisplayed() {
        return utils.isDisplayed(applyTypeTransaction);
    }

    public TradesTransactionsOpenOrders clickOnExportCSV() {
        utils.click(exportCSV);
        return this;
    }


    // Transactions Last

    public String getLastTransactionType() {
        return utils.getText(transactionTypeLast);
    }

    public String getLastTransactionTypeColor() {
        return utils.getCSSValue(transactionTypeLast, "color");
    }

    public String getLastTransactionDate() {
        return utils.getText(transactionDateLast);
    }

    public String getLastTransactionTime() {
        return utils.getText(transactionTimeLast);
    }

    public String getLastTransactionCoinAmount() {
        return utils.getText(transactionCoinAmountLast);
    }

    public String getLastTransactionWorth() {
        return utils.getText(transactionWorthLast);
    }

    public String getLastTransactionWorthColor() {
        return utils.getCSSValue(transactionWorthLast, "color");
    }

    public String getLastTransactionCoinPrice() {
        return utils.getText(transactionCoinPriceLast);
    }

    public String getLastTransactionPair() {
        return utils.getText(transactionPairLast);
    }

    public Boolean lastTransactionPairIsDisplayed() {
        return utils.isDisplayed(transactionPairLast);
    }

    public String getLastTransactionPairPrice() {
        return utils.getText(transactionPairPriceLast);
    }

    public Boolean lastTransactionPairPriceIsDisplayed() {
        return utils.isDisplayed(transactionPairPriceLast);
    }

    public String getLastTransactionFrom() {
        return utils.getText(transactionFromLast);
    }

    public Boolean lastTransactionFromIsDisplayed() {
        return utils.isDisplayed(transactionFromLast);
    }

    public String getLastTransactionTo() {
        return utils.getText(transactionToLast);
    }

    public Boolean lastTransactionToIsDisplayed() {
        return utils.isDisplayed(transactionToLast);
    }

    public String getLastTransactionFee() {
        return utils.getText(transactionFeeLast);
    }

    public String getLastTransactionPLFirst() {
        return utils.getText(transactionPLFirstLast);
    }

    public String getLastTransactionPLSecond() {
        return utils.getText(transactionPLSecondLast);
    }

    public String getLastTransactionPLFirstColor() {
        return utils.getCSSValue(transactionPLFirstLast, "Color");
    }

    public String getLastTransactionPLSecondColor() {
        return utils.getCSSValue(transactionPLSecondLast, "Color");
    }

    public String getLastTransactionNotes() {
        return utils.getText(transactionNotesLast);
    }

    public Boolean lastTransactionNotesIsDisplayed() {
        return utils.isDisplayed(transactionNotesLast);
    }

    public TradesTransactionsOpenOrders clickOnLastTransaction3Dot() {
        utils.click(transaction3DotLast);
        return this;
    }

    public TradesTransactionsOpenOrders clickOnEditIn3Dot() {
        utils.click(transactionEditIn3Dot);
        return this;
    }

    public TradesTransactionsOpenOrders clickOnDeleteIn3Dot() {
        utils.click(transactionDeleteIn3Dot);
        return this;
    }

}
