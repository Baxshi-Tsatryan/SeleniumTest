package chrome.allPages.portfolioPage;

import chrome.mainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddTransactionsModal {

    WebDriver driver;
    SeleniumUtils utils;

    public AddTransactionsModal(WebDriver driver) {
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

    By priceField = By.cssSelector(".jsx-693624628:nth-child(2) > .jsx-1485860805 > .text-box");

    By priceCurrency = By.cssSelector(".input-right-sign");

    By currentFeeType = By.cssSelector("div.manual-transaction-modal .jsx-1485860805 .table-row");

    By feeTypeDropDown = By.cssSelector("div.manual-transaction-modal .jsx-1485860805 .jsx-1751315535 > .jsx-1751315535 > .jsx-1751315535");

    By feeOtherTypeInDropDown = By.cssSelector(".dropdown-item-value");

    By currentFeeCurrency = By.cssSelector("div.false .search-dropdown-enable-placeholder");

    By firstFeeCurrencyResult = By.cssSelector("ul.jsx-931209423 > li:nth-of-type(1) .coin-item-wrapper > .table-row");

    By firstFeeCurrencyResultSymbol = By.cssSelector("ul.jsx-931209423 > li:nth-of-type(1) .additional-label > .table-row");

    By clearFeeCurrencyButton = By.cssSelector(".icon-clear");

    By feeCurrencySearchField = By.cssSelector("div.false [placeholder='Search']");

    By feeField = By.cssSelector("[placeholder='Fee amount']");

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


    public AddTransactionsModal clickOnMoreActionsDropDown() {
        utils.click(moreActionsDropDown);
        return this;
    }

    public AddTransactionsModal clickOnAddTransactions() {
        utils.click(addTransaction);
        return this;
    }

    public AddTransactionsModal clickOnAddTransactionsInDropDown() {
        utils.click(addTransactionInDropDown);
        return this;
    }

    public AddTransactionsModal clickOnDepositInDropDown() {
        utils.click(depositInDropDown);
        return this;
    }

    public AddTransactionsModal clickOnBuyTab() {
        utils.click(buyTab);
        return this;
    }

    public AddTransactionsModal clickOnSellTab() {
        utils.click(sellTab);
        return this;
    }

    public AddTransactionsModal clickOnTransferTab() {
        utils.click(transferTab);
        return this;
    }


    // Buy/Sell

    public AddTransactionsModal clickOnPortfolioDropDown() {
        utils.click(portfolioDropDown);
        return this;
    }

    public String getCurrentPortfolioName() {
        return utils.getText(selectedPortfolioName);
    }

    public AddTransactionsModal typeCoinName(String coinName) {
        utils.sendKeysAction(coinSearchField, coinName);
        return this;
    }

    public AddTransactionsModal deleteCoinName() {
        utils.clear(coinSearchField);
        return this;
    }

    public AddTransactionsModal clickOnFirstCoinResult() {
        utils.click(firstCoinResult);
        return this;
    }

    public String getFirstCoinResult() {
        return utils.getText(firstCoinResult);
    }

    public AddTransactionsModal clickOnCoinNameField() {
        utils.click(coinSearchField);
        return this;
    }

    public AddTransactionsModal clickOnPairField() {
        utils.click(pairField);
        return this;
    }

    public AddTransactionsModal typePair(String pairName) {
        utils.sendKeysAction(pairField, pairName);
        return this;
    }

    public AddTransactionsModal deletePair() {
        utils.clear(pairField);
        return this;
    }

    public AddTransactionsModal getCurrentPair() {
        utils.getText(currentPair);
        return this;
    }

    public AddTransactionsModal clickOnCurrentPair() {
        utils.click(currentPair);
        return this;
    }

    public String getCurrentDate() {
        return utils.getText(dateField);
    }

    public AddTransactionsModal clickOnDate() {
        utils.click(dateField);
        return this;
    }

    public AddTransactionsModal clickOnPreviousMonth() {
        utils.click(previousMonth);
        return this;
    }

    public AddTransactionsModal clickOnNextMonth() {
        utils.click(nextMonth);
        return this;
    }

    public String getCurrentMonthAndYear() {
        return utils.getText(currentMonthAndYear);
    }

    public String getCurrentTime() {
        return utils.getText(timeField);
    }

    public AddTransactionsModal clearTime() {
        utils.clear(timeField);
        return this;
    }

    public AddTransactionsModal clickOnTime() {
        utils.click(timeField);
        return this;
    }

    public AddTransactionsModal typeTime(String time) {
        utils.sendKeysAction(timeField, time);
        return this;
    }

    public AddTransactionsModal typeAmount(String amount) {
        utils.sendKeysAction(amountField, amount);
        return this;
    }

    public String getAmount() {
        return utils.getText(amountField);
    }

    public AddTransactionsModal clearAmount() {
        utils.clear(amountField);
        return this;
    }

    public String getPrice() {
        return utils.getText(priceField);
    }

    public AddTransactionsModal typePrice(String price) {
        utils.sendKeysAction(priceField, price);
        return this;
    }

    public AddTransactionsModal deletePrice() {
        utils.clear(priceField);
        return this;
    }

    public String getPriceCurrency() {
        return utils.getText(priceCurrency);
    }

    public AddTransactionsModal typeFee(String fee) {
        utils.sendKeysAction(feeField, fee);
        return this;
    }

    public AddTransactionsModal clearFee() {
        utils.clear(feeField);
        return this;
    }

    public String getFee() {
        return utils.getText(feeField);
    }

    public String getCurrentFeeType() {
        return utils.getText(currentFeeType);
    }

    public AddTransactionsModal clickOnFeeTypeDropDown() {
        utils.click(feeTypeDropDown);
        return this;
    }

    public AddTransactionsModal clickOnFeeOtherTypeInDropDown() {
        utils.click(feeOtherTypeInDropDown);
        return this;
    }

    public String getCurrentFeeCurrency() {
        return utils.getText(currentFeeCurrency);
    }

    public AddTransactionsModal typeFeeCurrency(String feeCurrency) {
        utils.sendKeys(feeCurrencySearchField, feeCurrency);
        return this;
    }

    public AddTransactionsModal clickOnFeeCurrencyFirstResult() {
        utils.click(firstFeeCurrencyResult);
        return this;
    }

    public String getFirstFeeCurrencyResultSymbol() {
        return utils.getText(firstFeeCurrencyResultSymbol);
    }

    public AddTransactionsModal clickOnCurrentFeeCurrency() {
        utils.click(currentFeeCurrency);
        return this;
    }

    public AddTransactionsModal typeNote(String note) {
        utils.sendKeysAction(notesField, note);
        return this;
    }

    public String getNote() {
        return utils.getText(notesField);
    }

    public AddTransactionsModal clearNote() {
        utils.clear(notesField);
        return this;
    }

    public AddTransactionsModal clickOnChecklist() {
        utils.click(checklist);
        return this;
    }


    // Transfer

    public String getCurrentPortfolioTransfer() {
        return utils.getText(currentPortfolioTransfer);
    }

    public AddTransactionsModal clickOnPortfolioDropDownTransfer() {
        utils.click(portfolioDropDownTransfer);
        return this;
    }

    public String getCurrentCoinTransfer() {
        return utils.getText(coinFieldTransfer);
    }

    public AddTransactionsModal clickOnCurrentCoinTransfer() {
        utils.click(currentCoinTransfer);
        return this;
    }

    public AddTransactionsModal typeCoinNameTransfer(String coinName) {
        utils.sendKeys(coinFieldTransfer, coinName);
        return this;
    }

    public String getCurrentFromType() {
        return utils.getText(currentFromType);
    }

    public String getCurrentToType() {
        return utils.getText(currentToType);
    }

    public AddTransactionsModal clickOnFromDropDown() {
        utils.click(fromDropDown);
        return this;
    }

    public AddTransactionsModal clickOnToDropDown() {
        utils.click(toDropDown);
        return this;
    }

    public AddTransactionsModal clickOnFromMyWallet() {
        utils.click(fromMyWallet);
        return this;
    }

    public AddTransactionsModal clickOnFromExchange() {
        utils.click(fromExchange);
        return this;
    }

    public AddTransactionsModal clickOnFromOtherWallet() {
        utils.click(fromOtherWallet);
        return this;
    }

    public AddTransactionsModal clickOnFromAirdrop() {
        utils.click(fromAirdrop);
        return this;
    }

    public AddTransactionsModal clickOnFromMining() {
        utils.click(fromMining);
        return this;
    }

    public AddTransactionsModal clickOnFromFork() {
        utils.click(fromFork);
        return this;
    }

    public AddTransactionsModal clickOnFromDividends() {
        utils.click(fromDividends);
        return this;
    }

    public AddTransactionsModal clickOnFromOtherUnknown() {
        utils.click(fromOtherUnknown);
        return this;
    }

    public AddTransactionsModal clickOnToMyWallet() {
        utils.click(toMyWallet);
        return this;
    }

    public AddTransactionsModal clickOnToExchange() {
        utils.click(toExchange);
        return this;
    }

    public AddTransactionsModal clickOnToOtherWallet() {
        utils.click(toOtherWallet);
        return this;
    }

    public AddTransactionsModal clickOnToOtherUnknown() {
        utils.click(toOtherUnknown);
        return this;
    }

    public String getCurrentFromExchange() {
        return utils.getText(fromCurrentExchange);
    }

    public AddTransactionsModal clickOnCurrentFromExchange() {
        utils.click(fromCurrentExchange);
        return this;
    }

    public AddTransactionsModal typeFromExchange(String exchangeName) {
        utils.sendKeys(fromExchangeField, exchangeName);
        return this;
    }

    public AddTransactionsModal clickOnFromExchangeFirstResult() {
        utils.click(fromExchangeFirstResult);
        return this;
    }

    public AddTransactionsModal clickOnToExchangeFirstResult() {
        utils.click(toExchangeFirstResult);
        return this;
    }

    public String getCurrentToExchange() {
        return utils.getText(toCurrentExchange);
    }

    public AddTransactionsModal clickOnCurrentToExchange() {
        utils.click(toCurrentExchange);
        return this;
    }

    public AddTransactionsModal typeToExchange(String exchangeName) {
        utils.sendKeys(toExchangeField, exchangeName);
        return this;
    }

    public String getCurrentTimeTransfer() {
        return utils.getText(timeFieldTransfer);
    }

    public AddTransactionsModal clickOnTimeTransfer() {
        utils.click(timeFieldTransfer);
        return this;
    }

    public AddTransactionsModal typeTimeTransfer(String time) {
        utils.sendKeysAction(timeFieldTransfer, time);
        return this;
    }


    public AddTransactionsModal clickOnSave() {
        utils.click(saveButton);
        return this;
    }

    public AddTransactionsModal clickOnCancel() {
        utils.click(cancelButton);
        return this;
    }


    // -------------------------------------------- Scripts -----------------------------------------------

    public AddTransactionsModal clickOnAnyPortfolioFromDropDown(String portfolioName) {
        utils.click(portfolioDropDown);

        int index = 1;

        while (true) {
            try {
                By allPortfoliosBy = By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(" + index + ") .table-row");
                WebElement allPortfolios = driver.findElement(allPortfoliosBy);
                String allPortfoliosNames = allPortfolios.getText();

                if (allPortfoliosNames.equals(portfolioName)) {
                    allPortfolios.click();
                    break;
                }
            } catch (NoSuchElementException e) {
                System.out.println("There isn't your portfolio");
                break;
            }

            index++;
        }
        return this;
    }

    public AddTransactionsModal clickOnAnyCoinResult(String coinName) {
        utils.click(coinSearchField);
        typeCoinName(coinName);

        int index = 1;

        while (true) {
            try {
                By allResultsBy = By.cssSelector("ul.jsx-931209423 > li:nth-of-type(" + index + ") .coin-item-wrapper > .table-row");
                WebElement allResults = driver.findElement(allResultsBy);
                String allResultsString = allResults.getText();

                if (allResultsString.equals(coinName)) {
                    allResults.click();
                    break;
                }
            } catch (NoSuchElementException e) {
                System.out.println("There isn't your result");
                break;
            }

            index++;
        }
        return this;
    }

    public AddTransactionsModal selectAnyDate(String monthAndYear, String day) {
        clickOnDate();

        do {
            getCurrentMonthAndYear();
            if (!monthAndYear.equals(getCurrentMonthAndYear())) {
                clickOnPreviousMonth();
            } else {
                break;
            }
        } while (true);

        int length = String.valueOf(day).length();

        if (length == 1) {
            driver.findElement(By.cssSelector(".react-datepicker__day--00" + day)).click();
        } else if (length == 2) {
            driver.findElement(By.cssSelector(".react-datepicker__day--0" + day)).click();
        }
        return this;
    }

    public AddTransactionsModal selectAnyTime(String time) {
        utils.click(timeField);

        int index = 1;

        while (true) {
            try {
                By allTimesBy = By.cssSelector("ul.react-datepicker__time-list > li:nth-of-type(" + index + ")");
                WebElement allTimes = driver.findElement(allTimesBy);
                String allTimesString = allTimes.getText();

                if (allTimesString.equals(time)) {
                    allTimes.click();
                    break;
                }
            } catch (NoSuchElementException e) {
                System.out.println("There isn't your time");
                break;
            }

            index++;
        }
        return this;
    }

    public AddTransactionsModal clickOnAnyFeeCurrencyResult(String coinName) {
        utils.click(currentFeeCurrency);
        typeFeeCurrency(coinName);

        int index = 1;

        while (true) {
            try {
                By allResultBy = By.cssSelector("ul.jsx-931209423 > li:nth-of-type(" + index + ") .coin-item-wrapper > .table-row");
                WebElement allResult = driver.findElement(allResultBy);
                String allResultsString = allResult.getText();

                if (allResultsString.equals(coinName)) {
                    allResult.click();
                    break;
                }
            } catch (NoSuchElementException e) {
                System.out.println("There isn't your result");
                break;
            }

            index++;
        }
        return this;
    }

    public AddTransactionsModal clickOnAnyFromExchangeResultTransfer(String exchangeName) {
        utils.click(fromExchangeField);
        typeFromExchange(exchangeName);

        int index = 1;

        while (true) {
            try {
                By allExchangesBy = By.cssSelector("ul.jsx-931209423 > li:nth-of-type(" + index + ") .table-row");
                WebElement allExchanges = driver.findElement(allExchangesBy);
                String allResultsString = allExchanges.getText();

                if (allResultsString.equals(exchangeName)) {
                    allExchanges.click();
                    break;
                }
            } catch (NoSuchElementException e) {
                System.out.println("There isn't your result");
                break;
            }

            index++;
        }
        return this;
    }

    public AddTransactionsModal clickOnAnyToExchangeResultTransfer(String exchangeName) {
        utils.click(toExchangeField);
        typeToExchange(exchangeName);

        int index = 1;

        while (true) {
            try {
                By allExchangesBy = By.cssSelector("ul.jsx-931209423 > li:nth-of-type(" + index + ") .table-row");
                WebElement allExchanges = driver.findElement(allExchangesBy);
                String allResultsString = allExchanges.getText();

                if (allResultsString.equals(exchangeName)) {
                    allExchanges.click();
                    break;
                }
            } catch (NoSuchElementException e) {
                System.out.println("There isn't your result");
                break;
            }

            index++;
        }
        return this;
    }

    public String select10Coins(int i) {
        String coinName = null;

        switch (i) {
            case 0: {
                coinName = "Ethereum";
                break;
            }

            case 1: {
                coinName = "Bitcoin";
                break;
            }

            case 2: {
                coinName = "XRP";
                break;
            }

            case 3: {
                coinName = "Tron";
                break;
            }

            case 4: {
                coinName = "Polkadot";
                break;
            }

            case 5: {
                coinName = "EOS";
                break;
            }

            case 6: {
                coinName = "Golem";
                break;
            }

            case 7: {
                coinName = "Aragon";
                break;
            }

            case 8: {
                coinName = "EOSJacks";
                break;
            }

            case 9: {
                coinName = "AdultChain";
                break;
            }

            case 10: {
                coinName = "ZoZoCoin";
                break;
            }
        }
        return coinName;
    }
}