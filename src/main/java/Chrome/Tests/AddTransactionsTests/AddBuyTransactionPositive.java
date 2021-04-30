package Chrome.Tests.AddTransactionsTests;

import Chrome.AllPages.PortfolioPage.AddTransactions;
import Chrome.AllPages.PortfolioPage.TradesTransactionsOpenOrders;
import Chrome.MainPackage.AllURLs;
import Chrome.MainPackage.Driver;
import Chrome.MainPackage.Paths;
import Chrome.MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddBuyTransactionPositive extends Driver {

    AddTransactions addTransactions;
    TradesTransactionsOpenOrders tradesTransactionsOpenOrders;
    AllURLs allURLs;
    SeleniumUtils utils;
    Paths paths;

    @BeforeClass
    public void beforeClass() {

        addTransactions = new AddTransactions(driver);
        tradesTransactionsOpenOrders = new TradesTransactionsOpenOrders(driver);
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        paths = new Paths(driver);
    }

    // Coin, Amount, Note
    @Test(priority = 1)
    public void addTransactionCase1() throws InterruptedException {
        allURLs.navigateToPortfolioPage();
        utils.enableCookie();
        allURLs.navigateToPortfolioTransactionsPage();

        for (int i = 0; i < 10; i++) {

            int coinAmountInt = utils.randomNumber(50);
            String coinAmount = String.valueOf(coinAmountInt);
            String note = "My Note";

            String coinName = addTransactions.select10Coins(i);

            try {
                addTransactions.clickOnAddTransactions();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("div.transaction-btn-container > .jsx-1426819953")));
            }
            addTransactions.typeCoinName(coinName);
            addTransactions.clickOnFirstCoinResult();
            addTransactions.typeAmount(coinAmount);
            addTransactions.typeNote(note);
            addTransactions.clickOnSave();
            Thread.sleep(2000);

            String transactionType = tradesTransactionsOpenOrders.getLastTransactionType();
            String transactionAmountLength = tradesTransactionsOpenOrders.getLastTransactionCoinAmount();
            String transactionAmount = tradesTransactionsOpenOrders.getLastTransactionCoinAmount().substring(0, transactionAmountLength.length() - 4);
            String transactionCoinPrice = tradesTransactionsOpenOrders.getLastTransactionCoinPrice().replace("$", "").replace(",", "");
            String transactionWorth = tradesTransactionsOpenOrders.getLastTransactionWorth().replace("$", "").replace(",", "");
            String transactionNotes = tradesTransactionsOpenOrders.getLastTransactionNotes();

            if (!transactionType.equals("Buy")) {
                System.err.println(coinName + " transaction type is invalid, should be Buy, but Sell");
            }

            if (!transactionAmount.equals(coinAmount)) {
                System.err.println(coinName + " amount is invalid, should be " + coinAmount + ", but " + transactionAmount);
            }

            if (!transactionNotes.equals(note)) {
                System.err.println(coinName + " transaction note is invalid, should be " + note + ", but " + transactionNotes);
            }

            float transactionAmountFloat = Float.parseFloat(transactionAmount);
            float transactionCoinPriceFloat = Float.parseFloat(transactionCoinPrice);
            float transactionCoinWorthFloat = transactionCoinPriceFloat * transactionAmountFloat;
            float transactionWorthFloat = Float.parseFloat(transactionWorth);

            if (transactionCoinWorthFloat != transactionWorthFloat) {
                System.err.println(coinName + " transaction worth is invalid, should be " + transactionCoinWorthFloat + ", but " + transactionWorthFloat);
            }
        }
    }

    // Coin, Amount, Price, Note
    @Test
    public void addTransactionCase2() throws InterruptedException {
        allURLs.navigateToPortfolioPage();
        utils.enableCookie();
        allURLs.navigateToPortfolioTransactionsPage();

        for (int i = 0; i < 10; i++) {

            int coinAmountInt = utils.randomNumber(50);
            String coinAmount = String.valueOf(coinAmountInt);
            String note = "My Note";
            int coinPriceInt = utils.randomNumber(10000);
            String coinPrice = String.valueOf(coinAmountInt);

            String coinName = addTransactions.select10Coins(i);

            try {
                addTransactions.clickOnAddTransactions();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("div.transaction-btn-container > .jsx-1426819953")));
            }

            addTransactions.typeCoinName(coinName);
            addTransactions.clickOnFirstCoinResult();
            addTransactions.typeAmount(coinAmount);
            Thread.sleep(1000);
            addTransactions.deletePrice();
            addTransactions.typePrice(coinPrice);
            addTransactions.typeNote(note);
            addTransactions.clickOnSave();
            Thread.sleep(2000);

            String transactionType = tradesTransactionsOpenOrders.getLastTransactionType();
            String transactionAmountLength = tradesTransactionsOpenOrders.getLastTransactionCoinAmount();
            String transactionAmount = tradesTransactionsOpenOrders.getLastTransactionCoinAmount().substring(0, transactionAmountLength.length() - 4);
            String transactionCoinPrice = tradesTransactionsOpenOrders.getLastTransactionCoinPrice().replace("$", "").replace(",", "");
            String transactionWorth = tradesTransactionsOpenOrders.getLastTransactionWorth().replace("$", "").replace(",", "");
            String transactionNotes = tradesTransactionsOpenOrders.getLastTransactionNotes();

            if (!transactionType.equals("Buy")) {
                System.err.println(coinName + " transaction type is invalid, should be Buy, but Sell");
            }

            if (!transactionAmount.equals(coinAmount)) {
                System.err.println(coinName + " amount is invalid, should be " + coinAmount + ", but " + transactionAmount);
            }

            if (!transactionNotes.equals(note)) {
                System.err.println(coinName + " transaction note is invalid, should be " + note + ", but " + transactionNotes);
            }

            float transactionPrice = Float.parseFloat(coinPrice);
            float transactionAmountFloat = Float.parseFloat(transactionAmount);
            float transactionCoinPriceFloat = Float.parseFloat(transactionCoinPrice);
            float transactionCoinWorthFloat = transactionCoinPriceFloat * transactionAmountFloat;
            float transactionWorthFloat = Float.parseFloat(transactionWorth);

            if (transactionCoinWorthFloat != transactionWorthFloat) {
                System.err.println(coinName + " transaction worth is invalid, should be " + transactionCoinWorthFloat + ", but " + transactionWorthFloat);
            }

            if (transactionCoinPriceFloat != transactionPrice) {
                System.err.println(coinName + " transaction price is invalid, should be " + transactionPrice + ", but " + transactionCoinPriceFloat);
            }
        }

    }

    // Coin, Amount, Price checking, Note
    @Test(enabled = false)
    public void addTransactionCase3() throws InterruptedException {
        allURLs.navigateToPortfolioPage();
        utils.enableCookie();
        allURLs.navigateToPortfolioTransactionsPage();

        for (int i = 0; i < 10; i++) {

            int coinAmountInt = utils.randomNumber(50);
            String coinAmount = String.valueOf(coinAmountInt);
            String note = "My Note";

            String coinName = addTransactions.select10Coins(i);

            try {
                addTransactions.clickOnAddTransactions();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("div.transaction-btn-container > .jsx-1426819953")));
            }

            addTransactions.typeCoinName(coinName);
            addTransactions.clickOnFirstCoinResult();
            addTransactions.typeAmount(coinAmount);
            Thread.sleep(3000);
            String price = addTransactions.getPrice();
            addTransactions.typeNote(note);
            addTransactions.clickOnSave();
            Thread.sleep(2000);

            String transactionType = tradesTransactionsOpenOrders.getLastTransactionType();
            String transactionAmountLength = tradesTransactionsOpenOrders.getLastTransactionCoinAmount();
            String transactionAmount = tradesTransactionsOpenOrders.getLastTransactionCoinAmount().substring(0, transactionAmountLength.length() - 4);
            String transactionCoinPrice = tradesTransactionsOpenOrders.getLastTransactionCoinPrice().replace("$", "").replace(",", "");
            String transactionWorth = tradesTransactionsOpenOrders.getLastTransactionWorth().replace("$", "").replace(",", "");
            String transactionNotes = tradesTransactionsOpenOrders.getLastTransactionNotes();

            if (!transactionType.equals("Buy")) {
                System.err.println(coinName + " transaction type is invalid, should be Buy, but Sell");
            }

            if (!transactionAmount.equals(coinAmount)) {
                System.err.println(coinName + " amount is invalid, should be " + coinAmount + ", but " + transactionAmount);
            }

            if (!transactionNotes.equals(note)) {
                System.err.println(coinName + " transaction note is invalid, should be " + note + ", but " + transactionNotes);
            }

            float transactionPrice = Float.parseFloat(price);
            float transactionAmountFloat = Float.parseFloat(transactionAmount);
            float transactionCoinPriceFloat = Float.parseFloat(transactionCoinPrice);
            float transactionCoinWorthFloat = transactionCoinPriceFloat * transactionAmountFloat;
            float transactionWorthFloat = Float.parseFloat(transactionWorth);

            if (transactionCoinWorthFloat != transactionWorthFloat) {
                System.err.println(coinName + " transaction worth is invalid, should be " + transactionCoinWorthFloat + ", but " + transactionWorthFloat);
            }

            if (transactionCoinPriceFloat != transactionPrice) {
                System.err.println(coinName + " transaction price is invalid, should be " + transactionPrice + ", but " + transactionCoinPriceFloat);
            }
        }

    }

    // Coin, Amount, Fee with percent
    @Test
    public void addTransactionCase4() throws InterruptedException {
        allURLs.navigateToPortfolioPage();
        utils.enableCookie();
        allURLs.navigateToPortfolioTransactionsPage();

        for (int i = 0; i < 10; i++) {

            String coinAmount = "1";
            int fee = (int) (Math.random() * 99 + 1);

            String coinName = addTransactions.select10Coins(i);

            try {
                addTransactions.clickOnAddTransactions();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("div.transaction-btn-container > .jsx-1426819953")));
            }

            addTransactions.typeCoinName(coinName);
            addTransactions.clickOnFirstCoinResult();
            String feeType = addTransactions.getCurrentFeeType();

            if (feeType.equals("$")) {
                addTransactions.clickOnFeeTypeDropDown();
                addTransactions.clickOnFeeOtherTypeInDropDown();
            }

            String feeString = String.valueOf(fee);
            addTransactions.typeFee(feeString);
            addTransactions.typeAmount(coinAmount);
            addTransactions.clickOnSave();
            Thread.sleep(2000);

            String transactionAmountLength = tradesTransactionsOpenOrders.getLastTransactionCoinAmount();
            String transactionAmount = tradesTransactionsOpenOrders.getLastTransactionCoinAmount().substring(0, transactionAmountLength.length() - 4);
            String feeInTransaction = tradesTransactionsOpenOrders.getLastTransactionFee();

            feeString = feeString + "%";

            if (!transactionAmount.equals(coinAmount)) {
                System.err.println(coinName + " amount is invalid, should be " + coinAmount + ", but " + transactionAmount);
            }

            if (!feeInTransaction.equals(feeString)) {
                System.err.println(coinName + " transaction fee is invalid, should be " + feeString + ", but " + feeInTransaction);
            }

        }
    }

    // Coin, Amount, Fee with currency
    @Test
    public void addTransactionCase5() throws InterruptedException {
        allURLs.navigateToPortfolioPage();
        utils.enableCookie();
        allURLs.navigateToPortfolioTransactionsPage();

        for (int i = 0; i < 10; i++) {

            int coinAmountInt = utils.randomNumber(50);
            String coinAmount = String.valueOf(coinAmountInt);
            int fee = utils.randomNumber(100);

            String coinName = addTransactions.select10Coins(i);

            try {
                addTransactions.clickOnAddTransactions();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("div.transaction-btn-container > .jsx-1426819953")));
            }

            addTransactions.typeCoinName(coinName);
            addTransactions.clickOnFirstCoinResult();
            String feeType = addTransactions.getCurrentFeeType();

            if (feeType.equals("%")) {
                addTransactions.clickOnFeeTypeDropDown();
                addTransactions.clickOnFeeOtherTypeInDropDown();
            }

            Thread.sleep(2000);
            addTransactions.clickOnCurrentFeeCurrency();
            addTransactions.typeFeeCurrency(coinName);
            String feeFirstResultSymbol = addTransactions.getFirstFeeCurrencyResultSymbol();
            feeFirstResultSymbol = feeFirstResultSymbol.substring(1);
            addTransactions.clickOnFeeCurrencyFirstResult();
            String feeString = String.valueOf(fee);
            addTransactions.typeFee(feeString);
            addTransactions.typeAmount(coinAmount);
            addTransactions.clickOnSave();
            Thread.sleep(2000);

            String transactionAmountLength = tradesTransactionsOpenOrders.getLastTransactionCoinAmount();
            String transactionAmount = tradesTransactionsOpenOrders.getLastTransactionCoinAmount().substring(0, transactionAmountLength.length() - 4);
            String feeInTransaction = tradesTransactionsOpenOrders.getLastTransactionFee();

            feeString = feeString + "" + feeFirstResultSymbol;

            if (!transactionAmount.equals(coinAmount)) {
                System.err.println(coinName + " amount is invalid, should be " + coinAmount + ", but " + transactionAmount);
            }

            if (!feeInTransaction.equals(feeString)) {
                System.err.println(coinName + " transaction fee is invalid, should be " + feeString + ", but " + feeInTransaction);
            }

        }
    }

    // Coin, Amount, Date, Time, Note
    @Test
    public void addTransactionCase6() throws InterruptedException {
        allURLs.navigateToPortfolioPage();
        utils.enableCookie();
        allURLs.navigateToPortfolioTransactionsPage();

        for (int i = 0; i < 10; i++) {

            int coinAmountInt = utils.randomNumber(50);
            String coinAmount = String.valueOf(coinAmountInt);
            String monthAndYear = "July 2020";
            int dayInt = utils.randomNumber(31);
            String day = String.valueOf(dayInt);
            String time = "4:15 PM";

            String coinName = addTransactions.select10Coins(i);

            try {
                addTransactions.clickOnAddTransactions();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("div.transaction-btn-container > .jsx-1426819953")));
            }

            addTransactions.typeCoinName(coinName);
            addTransactions.clickOnFirstCoinResult();
            addTransactions.typeAmount(coinAmount);
            addTransactions.selectAnyDate(monthAndYear, day);
            addTransactions.selectAnyTime(time);
            addTransactions.clickOnSave();
            Thread.sleep(2000);

            String transactionType = tradesTransactionsOpenOrders.getLastTransactionType();
            String transactionAmountForLength = tradesTransactionsOpenOrders.getLastTransactionCoinAmount();
            String transactionAmount = tradesTransactionsOpenOrders.getLastTransactionCoinAmount().substring(0, transactionAmountForLength.length() - 4);
            String transactionCoinPrice = tradesTransactionsOpenOrders.getLastTransactionCoinPrice().replace("$", "").replace(",", "");
            String transactionWorth = tradesTransactionsOpenOrders.getLastTransactionWorth().replace("$", "").replace(",", "");
            String transactionTime = tradesTransactionsOpenOrders.getLastTransactionTime();

            if (!transactionType.equals("Buy")) {
                System.err.println(coinName + " transaction type is invalid, should be Buy");
            }

            if (!transactionAmount.equals(coinAmount)) {
                System.err.println(coinName + " amount is invalid, should be " + coinAmount + ", but " + transactionAmount);
            }

            time = "0" + time;

            if (!transactionTime.equals(time))
            {
                System.err.println(coinName + " transaction time is invalid, should be " + time + ", but " + transactionTime);
            }

            float transactionAmountFloat = Float.parseFloat(transactionAmount);
            float transactionCoinPriceFloat = Float.parseFloat(transactionCoinPrice);
            float transactionCoinWorthFloat = transactionCoinPriceFloat * transactionAmountFloat;
            float transactionWorthFloat = Float.parseFloat(transactionWorth);

            if (transactionCoinWorthFloat != transactionWorthFloat) {
                System.err.println(coinName + " transaction worth is invalid, should be " + transactionCoinWorthFloat + ", but " + transactionWorthFloat);
            }

        }

    }


}
