package Tests.AddTransactionsTests;

import AllPages.PortfolioPage.AddTransactions;
import AllPages.PortfolioPage.PortfolioPageWhenNotLogin;
import AllPages.PortfolioPage.TradesTransactionsOpenOrders;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.Paths;
import MainPackage.SeleniumUtils;
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
    PortfolioPageWhenNotLogin portfolioPageWhenNotLogin;

    @BeforeClass
    public void beforeClass() {

        addTransactions = new AddTransactions(driver);
        tradesTransactionsOpenOrders = new TradesTransactionsOpenOrders(driver);
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        paths = new Paths(driver);
    }

    // Coin, Amount, Note
    @Test (priority = 1)
    public void addTransactionCase1() throws InterruptedException {
        allURLs.navigateToPortfolioPage();
        utils.enableCookie();
        allURLs.navigateToPortfolioTransactionsPage();

        for (int i = 0; i < 10; i++) {

        String coinAmount = "2";
        String note = "My Note";
        String coinName = "";

            switch (i)
            {
                case 0:
                {
                    coinName = "Ethereum";
                    break;
                }

                case 1:
                {
                    coinName = "Bitcoin";
                    break;
                }

                case 2:
                {
                    coinName = "XRP";
                    break;
                }

                case 3:
                {
                    coinName = "Tron";
                    break;
                }

                case 4:
                {
                    coinName = "Polkadot";
                    break;
                }

                case 5:
                {
                    coinName = "EOS";
                    break;
                }

                case 6:
                {
                    coinName = "Golem";
                    break;
                }

                case 7:
                {
                    coinName = "Aragon";
                    break;
                }

                case 8:
                {
                    coinName = "EOSJacks";
                    break;
                }

                case 9:
                {
                    coinName = "AdultChain";
                    break;
                }

                case 10:
                {
                    coinName = "ZoZoCoin";
                    break;
                }

            }

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

            String coinName = "";
            String coinAmount = "1";
            String note = "My Note";
            String price = "100";

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
            addTransactions.typePrice(price);
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

    // Coin, Amount, Price checking, Note
    @Test (enabled = false)
    public void addTransactionCase3() throws InterruptedException {
        allURLs.navigateToPortfolioPage();
        utils.enableCookie();
        allURLs.navigateToPortfolioTransactionsPage();

        for (int i = 0; i < 10; i++) {

            String coinName = "";
            String coinAmount = "1";
            String note = "My Note";

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

            String coinName = "";
            String coinAmount = "1";
            int fee = (int) (Math.random() * 99 + 1);

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

            try {
                addTransactions.clickOnAddTransactions();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("div.transaction-btn-container > .jsx-1426819953")));
            }

            addTransactions.typeCoinName(coinName);
            addTransactions.clickOnFirstCoinResult();
            String feeType = addTransactions.getCurrentFeeType();

            if (feeType.equals("$"))
            {
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

            if (!feeInTransaction.equals(feeString))
            {
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

            String coinName = "";
            String coinAmount = "1";
            int fee = (int) (Math.random() * 99 + 1);

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

            try {
                addTransactions.clickOnAddTransactions();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("div.transaction-btn-container > .jsx-1426819953")));
            }

            addTransactions.typeCoinName(coinName);
            addTransactions.clickOnFirstCoinResult();
            String feeType = addTransactions.getCurrentFeeType();

            if (feeType.equals("%"))
            {
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

            if (!feeInTransaction.equals(feeString))
            {
                System.err.println(coinName + " transaction fee is invalid, should be " + feeString + ", but " + feeInTransaction);
            }

        }
    }
}
