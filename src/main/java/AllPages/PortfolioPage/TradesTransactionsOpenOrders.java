package AllPages.PortfolioPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TradesTransactionsOpenOrders {

    WebDriver driver;
    SeleniumUtils utils;

    public TradesTransactionsOpenOrders(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }


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



    // --------------------------------------------- Methods -----------------------------------------------------------

    // Trades Filters

    public void typeDateFromTrades(String date)
    {
        utils.sendKeysAction(dateFromField, date);
    }

    public String getDateFromTrades()
    {
        return utils.getText(dateFromField);
    }

    public void clearDateFromTrades()
    {
        utils.clear(dateFromField);
    }

    public void typeDateToTrades(String date)
    {
        utils.sendKeysAction(dateToField, date);
    }

    public String getDateToTrades()
    {
        return utils.getText(dateToField);
    }

    public void clearDateToTrades()
    {
        utils.clear(dateToField);
    }

    public void clickOnNextMonth()
    {
        utils.clickOnElement(nextMonth);
    }

    public void clickOnPreviousMonth()
    {
        utils.clickOnElement(previousMonth);
    }

    public String getCurrentMonthYear()
    {
        return utils.getText(currentMonthYear);
    }

    public void typeCoinNameTrades(String coinName)
    {
        utils.sendKeysAction(searchCoinFieldTrades, coinName);
    }

    public String getCoinNameTrades()
    {
        return utils.getText(searchCoinFieldTrades);
    }

    public void clearCoinNameTrades()
    {
        utils.clear(searchCoinFieldTrades);
    }


    // Transactions

    // Filters

    public void typeCoinNameTransactions(String coinName)
    {
        utils.sendKeysAction(searchCoinFieldTransactions, coinName);
    }

    public String getCoinNameTransactions()
    {
        return utils.getText(searchCoinFieldTransactions);
    }

    public void clearCoinNameTransactions()
    {
        utils.clear(searchCoinFieldTransactions);
    }

    public String getCurrentTypeFilterTransactions()
    {
        return utils.getText(currentTypeTransactions);
    }

    public void clickOnTypesDropDownTransactions()
    {
        utils.clickOnElement(typeDropDownTransaction);
    }

    public void clickOnApplyTypeTransactions()
    {
        utils.clickOnElement(applyTypeTransaction);
    }

    public Boolean applyTypeTransactionsIsDisplayed()
    {
        return utils.isDisplayed(applyTypeTransaction);
    }

    public void clickOnExportCSV()
    {
        utils.clickOnElement(exportCSV);
    }

}
