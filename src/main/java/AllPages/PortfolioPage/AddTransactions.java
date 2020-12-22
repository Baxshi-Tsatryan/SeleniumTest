package AllPages.PortfolioPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddTransactions {

    WebDriver driver;
    SeleniumUtils utils;

    public AddTransactions(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }


    By moreActionsDropDown = By.cssSelector("div.more-actions .primary-nav");

    By addTransaction = By.cssSelector("div.transaction-btn-container > .jsx-1426819953");

    By addTransactionInDropDown = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By depositInDropDown = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By buyTab = By.cssSelector("div.buy-sell > button:nth-of-type(1)");

    By sellTab = By.cssSelector("div.buy-sell > button:nth-of-type(2)");

    By transferTab = By.cssSelector(".wide-button");


    // Buy/Sell

    By portfolioDropDown = By.cssSelector("div.manual-transaction-modal .jsx-693624628 > .jsx-1751315535 > .jsx-1751315535 > .jsx-1751315535");

    By selectedPortfolioName = By.cssSelector("div.manual-transaction-modal > .jsx-1256533704 .table-row");

    By coinSearchField = By.cssSelector(".jsx-931209423[placeholder='Search']");

    By firstCoinResult = By.cssSelector("ul.jsx-931209423 > li:nth-of-type(1) .coin-item-wrapper > .table-row");

    By pairField = By.cssSelector("[placeholder='Please select exchange-pair']");

    By currentPair = By.cssSelector("div.search-exchange .search-dropdown-enable-placeholder");

    By dateField = By.cssSelector("#__next > main > div > div > div.jsx-271685889.portfolio-container.show > div.jsx-271685889.overview-container > div.jsx-271685889.right-section > div > div > div > div > div.jsx-4109874676.changing-content-wrapper > div > div.jsx-693624628.manual-transaction-modal > div.jsx-693624628.date-time-section > div.jsx-693624628.date-section > div > div > div > input[type=text]");

    By currentMonthAndYear = By.cssSelector(".react-datepicker__current-month");

    By previousMonth = By.cssSelector(".react-datepicker__navigation");

    By nextMonth = By.cssSelector(".react-datepicker__navigation--next");

    By timeField = By.cssSelector("#__next > main > div > div > div.jsx-271685889.portfolio-container.show > div.jsx-271685889.overview-container > div.jsx-271685889.right-section > div > div > div > div > div.jsx-4109874676.changing-content-wrapper > div > div.jsx-693624628.manual-transaction-modal > div.jsx-693624628.date-time-section > div.jsx-693624628.time-section > div > div > div > input[type=text]");

    By amountField = By.cssSelector("[placeholder='Amount']");

    By priceField = By.cssSelector("[placeholder='Price']");

    By priceCurrency = By.cssSelector(".input-right-sign");

    By currentFeeType = By.cssSelector("div.manual-transaction-modal .jsx-1485860805 .table-row");

    By feeTypeDropDown = By.cssSelector("div.manual-transaction-modal .jsx-1485860805 .jsx-1751315535 > .jsx-1751315535 > .jsx-1751315535");

    By feeOtherTypeInDropDown = By.cssSelector(".dropdown-item-value");

    By currentFeeCurrency = By.cssSelector("div.false .search-dropdown-enable-placeholder");

    By firstFeeCurrencyResult = By.cssSelector("ul.jsx-931209423 > li:nth-of-type(1) .coin-item-wrapper > .table-row");

    By clearFeeCurrencyButton = By.cssSelector(".icon-clear");

    By feeCurrencySearchField = By.cssSelector("div.false [placeholder='Search']");

    By feeField = By.cssSelector("[placeholder='Fee']");

    By notesField = By.cssSelector("[placeholder='Type Something...']");

    By checklist = By.cssSelector("span.jsx-3279326736");

    By closeButton = By.cssSelector(".icon-close");

    By saveButton = By.cssSelector("div.action-buttons > .primary");

    By cancelButton = By.cssSelector("div.action-buttons > .bordered");


    // Transfer

    By currentPortfolioTransfer = By.cssSelector("div.transfer-block .table-row");

    By portfolioDropDownTransfer = By.cssSelector("div.transfer-block .jsx-1751315535 > .jsx-1751315535 > .jsx-1751315535");

    By coinFieldTransfer = By.cssSelector("div.search-coin [placeholder='Search']");

    By currentCoinTransfer = By.cssSelector("div.search-coin .search-dropdown-enable-placeholder");

    By currentFromType = By.cssSelector("div.manual-transaction-modal > div:nth-of-type(3) .primary-nav");

    By currentToType = By.cssSelector("div.manual-transaction-modal > div:nth-of-type(4) .primary-nav");

    By fromDropDown = By.cssSelector("div.manual-transaction-modal > div:nth-of-type(3) > .jsx-1751315535 > .jsx-1751315535 > .jsx-1751315535");

    By toDropDown = By.cssSelector("div.manual-transaction-modal > div:nth-of-type(4) > .jsx-1751315535 > .jsx-1751315535 > .jsx-1751315535");

    By fromMyWallet = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By fromExchange = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By fromOtherWallet = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(3) .table-row");

    By fromAirdrop = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(4) .table-row");

    By fromMining = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(5) .table-row");

    By fromFork = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(6) .table-row");

    By fromDividends = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(7) .table-row");

    By fromOtherUnknown = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(8) .table-row");

    By toMyWallet = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(1) .table-row");

    By toExchange = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(2) .table-row");

    By toOtherWallet = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(3) .table-row");

    By toOtherUnknown = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(8) .table-row");

    By fromExchangeField = By.cssSelector("div.manual-transaction-modal div:nth-of-type(1) > [placeholder='Search exchange']");

    By fromExchangeFirstResult = By.cssSelector("ul.jsx-931209423 > li:nth-of-type(1) .table-row");

    By fromCurrentExchange = By.cssSelector("div.manual-transaction-modal > div:nth-of-type(4) .search-dropdown-enable-placeholder");

    By toExchangeField = By.cssSelector("div.manual-transaction-modal div:nth-of-type(1) > [placeholder='Search exchange']");

    By toExchangeFirstResult = By.cssSelector("ul.jsx-931209423 > li:nth-of-type(1) .table-row");

    By toCurrentExchange = By.cssSelector("div.manual-transaction-modal > div:nth-of-type(6) .search-dropdown-enable-placeholder");

    By timeFieldTransfer = By.cssSelector("#__next > main > div > div.jsx-4109874676.universal-modal > div > div > div.jsx-4109874676.changing-content-wrapper > div > div.jsx-693624628.manual-transaction-modal > div.jsx-693624628.date-time-section > div.jsx-693624628.time-section > div > div > div > input[type=text]");



    // --------------------------------------------- Methods ----------------------------------------------


    public void clickOnMoreActionsDropDown()
    {
        utils.clickOnElement(moreActionsDropDown);
    }

    public void clickOnAddTransactions()
    {
        utils.clickOnElement(addTransaction);
    }

    public void clickOnAddTransactionsInDropDown()
    {
        utils.clickOnElement(addTransactionInDropDown);
    }

    public void clickOnDepositInDropDown()
    {
        utils.clickOnElement(depositInDropDown);
    }

    public void clickOnBuyTab()
    {
        utils.clickOnElement(buyTab);
    }

    public void clickOnSellTab()
    {
        utils.clickOnElement(sellTab);
    }

    public void clickOnTransferTab()
    {
        utils.clickOnElement(transferTab);
    }


    // Buy/Sell

    public void clickOnPortfolioDropDown()
    {
        utils.clickOnElement(portfolioDropDown);
    }

    public String getCurrentPortfolioName()
    {
        return utils.getText(selectedPortfolioName);
    }

    public void typeCoinName(String coinName)
    {
        utils.sendKeysAction(coinSearchField, coinName);
    }

    public void deleteCoinName()
    {
        utils.clear(coinSearchField);
    }

    public void clickOnFirstCoinResult()
    {
        utils.clickOnElement(firstCoinResult);
    }

    public String getFirstCoinResult()
    {
        return utils.getText(firstCoinResult);
    }

    public void clickOnCoinNameField()
    {
        utils.clickOnElement(coinSearchField);
    }

    public void clickOnPairField()
    {
        utils.clickOnElement(pairField);
    }

    public void typePair(String pairName)
    {
        utils.sendKeysAction(pairField, pairName);
    }

    public void deletePair()
    {
        utils.clear(pairField);
    }

    public void getCurrentPair()
    {
        utils.getText(currentPair);
    }

    public void clickOnCurrentPair()
    {
        utils.clickOnElement(currentPair);
    }

    public String getCurrentDate()
    {
        return utils.getText(dateField);
    }

    public void clickOnDate()
    {
        utils.clickOnElement(dateField);
    }

    public void clickOnPreviousMonth()
    {
        utils.clickOnElement(previousMonth);
    }

    public void clickOnNextMonth()
    {
        utils.clickOnElement(nextMonth);
    }

    public String getCurrentMonthAndYear()
    {
        return utils.getText(currentMonthAndYear);
    }

    public String getCurrentTime()
    {
        return utils.getText(timeField);
    }

    public void clearTime()
    {
        utils.clear(timeField);
    }

    public void clickOnTime()
    {
        utils.clickOnElement(timeField);
    }

    public void typeTime(String time)
    {
        utils.sendKeysAction(timeField, time);
    }

    public void typeAmount(String amount)
    {
        utils.sendKeysAction(amountField, amount);
    }

    public String getAmount()
    {
        return utils.getText(amountField);
    }

    public void clearAmount()
    {
        utils.clear(amountField);
    }

    public String getPrice()
    {
        return utils.getText(priceField);
    }

    public void typePrice(String price)
    {
        utils.sendKeysAction(priceField, price);
    }

    public void deletePrice()
    {
        utils.clear(priceField);
    }

    public String getPriceCurrency()
    {
        return utils.getText(priceCurrency);
    }

    public void typeFee(String fee)
    {
        utils.sendKeysAction(feeField, fee);
    }

    public void clearFee()
    {
        utils.clear(feeField);
    }

    public String getFee()
    {
        return utils.getText(feeField);
    }

    public String getCurrentFeeType()
    {
        return utils.getText(currentFeeType);
    }

    public void clickOnFeeTypeDropDown()
    {
        utils.clickOnElement(feeTypeDropDown);
    }

    public void clickOnFeeOtherTypeInDropDown()
    {
        utils.clickOnElement(feeOtherTypeInDropDown);
    }

    public String getCurrentFeeCurrency()
    {
        return utils.getText(currentFeeCurrency);
    }

    public void typeFeeCurrency(String feeCurrency)
    {
        utils.sendKeys(feeCurrencySearchField, feeCurrency);
    }

    public void clickOnFeeCurrencyFirstResult()
    {
        utils.clickOnElement(firstFeeCurrencyResult);
    }

    public void clickOnCurrentFeeCurrency()
    {
        utils.clickOnElement(currentFeeCurrency);
    }

    public void typeNote(String note)
    {
        utils.sendKeysAction(notesField, note);
    }

    public String getNote()
    {
        return utils.getText(notesField);
    }

    public void clearNote()
    {
        utils.clear(notesField);
    }

    public void clickOnChecklist()
    {
        utils.clickOnElement(checklist);
    }


    // Transfer

    public String getCurrentPortfolioTransfer()
    {
        return utils.getText(currentPortfolioTransfer);
    }

    public void clickOnPortfolioDropDownTransfer()
    {
        utils.clickOnElement(portfolioDropDownTransfer);
    }

    public String getCurrentCoinTransfer()
    {
        return utils.getText(coinFieldTransfer);
    }

    public void clickOnCurrentCoinTransfer()
    {
        utils.clickOnElement(currentCoinTransfer);
    }

    public void typeCoinNameTransfer(String coinName)
    {
        utils.sendKeys(coinFieldTransfer, coinName);
    }

    public String getCurrentFromType()
    {
        return utils.getText(currentFromType);
    }

    public String getCurrentToType()
    {
        return utils.getText(currentToType);
    }

    public void clickOnFromDropDown()
    {
        utils.clickOnElement(fromDropDown);
    }

    public void clickOnToDropDown()
    {
        utils.clickOnElement(toDropDown);
    }

    public void clickOnFromMyWallet()
    {
        utils.clickOnElement(fromMyWallet);
    }

    public void clickOnFromExchange()
    {
        utils.clickOnElement(fromExchange);
    }

    public void clickOnFromOtherWallet()
    {
        utils.clickOnElement(fromOtherWallet);
    }

    public void clickOnFromAirdrop()
    {
        utils.clickOnElement(fromAirdrop);
    }

    public void clickOnFromMining()
    {
        utils.clickOnElement(fromMining);
    }

    public void clickOnFromFork()
    {
        utils.clickOnElement(fromFork);
    }

    public void clickOnFromDividends()
    {
        utils.clickOnElement(fromDividends);
    }

    public void clickOnFromOtherUnknown()
    {
        utils.clickOnElement(fromOtherUnknown);
    }

    public void clickOnToMyWallet()
    {
        utils.clickOnElement(toMyWallet);
    }

    public void clickOnToExchange()
    {
        utils.clickOnElement(toExchange);
    }

    public void clickOnToOtherWallet()
    {
        utils.clickOnElement(toOtherWallet);
    }

    public void clickOnToOtherUnknown()
    {
        utils.clickOnElement(toOtherUnknown);
    }

    public String getCurrentFromExchange()
    {
        return utils.getText(fromCurrentExchange);
    }

    public void clickOnCurrentFromExchange()
    {
        utils.clickOnElement(fromCurrentExchange);
    }

    public void typeFromExchange(String exchangeName)
    {
        utils.sendKeys(fromExchangeField, exchangeName);
    }

    public void clickOnFromExchangeFirstResult()
    {
        utils.clickOnElement(fromExchangeFirstResult);
    }

    public void clickOnToExchangeFirstResult()
    {
        utils.clickOnElement(toExchangeFirstResult);
    }

    public String getCurrentToExchange()
    {
        return utils.getText(toCurrentExchange);
    }

    public void clickOnCurrentToExchange()
    {
        utils.clickOnElement(toCurrentExchange);
    }

    public void typeToExchange(String exchangeName)
    {
        utils.sendKeys(toExchangeField, exchangeName);
    }

    public String getCurrentTimeTransfer()
    {
        return utils.getText(timeFieldTransfer);
    }

    public void clickOnTimeTransfer()
    {
        utils.clickOnElement(timeFieldTransfer);
    }

    public void typeTimeTransfer(String time)
    {
        utils.sendKeysAction(timeFieldTransfer, time);
    }


    public void clickOnSave()
    {
        utils.clickOnElement(saveButton);
    }

    public void clickOnCancel()
    {
        utils.clickOnElement(cancelButton);
    }


    // -------------------------------------------- Scripts -----------------------------------------------

    public void clickOnAnyPortfolioFromDropDown(String portfolioName)
    {
        utils.clickOnElement(portfolioDropDown);

        int index = 1;

        while (true) {
            try {
                By allPortfoliosBy = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(" + index + ") .table-row");
                WebElement allPortfolios = driver.findElement(allPortfoliosBy);
                String allPortfoliosNames = allPortfolios.getText();

                if (allPortfoliosNames.equals(portfolioName))
                {
                    allPortfolios.click();
                    break;
                }
            }
            catch (NoSuchElementException e)
            {
                System.out.println("There isn't your portfolio");
                break;
            }

            index++;
        }
    }

    public void clickOnAnyCoinResult(String coinName)
    {
        utils.clickOnElement(coinSearchField);
        typeCoinName(coinName);

        int index = 1;

        while (true) {
            try {
                By allResultsBy = By.cssSelector("ul.jsx-931209423 > li:nth-of-type(" + index + ") .coin-item-wrapper > .table-row");
                WebElement allResults = driver.findElement(allResultsBy);
                String allResultsString = allResults.getText();

                if (allResultsString.equals(coinName))
                {
                    allResults.click();
                    break;
                }
            }
            catch (NoSuchElementException e)
            {
                System.out.println("There isn't your result");
                break;
            }

            index++;
        }
    }

    public void selectAnyDate (String monthAndYear, String day)
    {
        clickOnDate();

        do {
            getCurrentMonthAndYear();
            if (!monthAndYear.equals(getCurrentMonthAndYear()))
            {
                clickOnPreviousMonth();
            }
            else
            {
                break;
            }
        } while (true);

        int length = String.valueOf(day).length();

        if (length == 1)
        {
            driver.findElement(By.cssSelector(".react-datepicker__day--00" + day)).click();
        }
        else if (length == 2)
        {
            driver.findElement(By.cssSelector(".react-datepicker__day--0" + day)).click();
        }
    }

    public void selectAnyTime(String time)
    {
        utils.clickOnElement(timeField);

        int index = 1;

        while (true) {
            try {
                By allTimesBy = By.cssSelector("ul.react-datepicker__time-list > li:nth-of-type(" + index + ")");
                WebElement allTimes = driver.findElement(allTimesBy);
                String allTimesString = allTimes.getText();

                if (allTimesString.equals(time))
                {
                    allTimes.click();
                    break;
                }
            }
            catch (NoSuchElementException e)
            {
                System.out.println("There isn't your time");
                break;
            }

            index++;
        }
    }

    public void clickOnAnyFeeCurrencyResult(String coinName)
    {
        utils.clickOnElement(currentFeeCurrency);
        typeFeeCurrency(coinName);

        int index = 1;

        while (true) {
            try {
                By allResultBy = By.cssSelector("ul.jsx-931209423 > li:nth-of-type(" + index + ") .coin-item-wrapper > .table-row");
                WebElement allResult = driver.findElement(allResultBy);
                String allResultsString = allResult.getText();

                if (allResultsString.equals(coinName))
                {
                    allResult.click();
                    break;
                }
            }
            catch (NoSuchElementException e)
            {
                System.out.println("There isn't your result");
                break;
            }

            index++;
        }
    }

    public void clickOnAnyFromExchangeResultTransfer(String exchangeName)
    {
        utils.clickOnElement(fromExchangeField);
        typeFromExchange(exchangeName);

        int index = 1;

        while (true) {
            try {
                By allExchangesBy = By.cssSelector("ul.jsx-931209423 > li:nth-of-type(" + index + ") .table-row");
                WebElement allExchanges = driver.findElement(allExchangesBy);
                String allResultsString = allExchanges.getText();

                if (allResultsString.equals(exchangeName))
                {
                    allExchanges.click();
                    break;
                }
            }
            catch (NoSuchElementException e)
            {
                System.out.println("There isn't your result");
                break;
            }

            index++;
        }
    }

    public void clickOnAnyToExchangeResultTransfer(String exchangeName)
    {
        utils.clickOnElement(toExchangeField);
        typeToExchange(exchangeName);

        int index = 1;

        while (true) {
            try {
                By allExchangesBy = By.cssSelector("ul.jsx-931209423 > li:nth-of-type(" + index + ") .table-row");
                WebElement allExchanges = driver.findElement(allExchangesBy);
                String allResultsString = allExchanges.getText();

                if (allResultsString.equals(exchangeName))
                {
                    allExchanges.click();
                    break;
                }
            }
            catch (NoSuchElementException e)
            {
                System.out.println("There isn't your result");
                break;
            }

            index++;
        }
    }
}