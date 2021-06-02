package chrome.tests.addTransactionsTests;

import chrome.allPages.portfolioPage.AddTransactionsModal;
import chrome.allPages.portfolioPage.TradesTransactionsOpenOrders;
import chrome.mainPackage.AllURLs;
import chrome.mainPackage.Driver;
import chrome.mainPackage.Paths;
import chrome.mainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddTransferTransactionPositive extends Driver {

    AddTransactionsModal addTransactions;
    TradesTransactionsOpenOrders tradesTransactionsOpenOrders;
    AllURLs allURLs;
    SeleniumUtils utils;
    Paths paths;

    @BeforeClass
    public void beforeClass() {

        addTransactions = new AddTransactionsModal(driver);
        tradesTransactionsOpenOrders = new TradesTransactionsOpenOrders(driver);
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        paths = new Paths(driver);
    }

    // All with all
    @Test
    public void addTransferCase1() throws InterruptedException {
        allURLs.navigateToPortfolioPage();
        utils.enableCookie();
        tradesTransactionsOpenOrders.clickOnTransactionsTab();

        String coinName = "Ethereum";
        int amount = (int) (Math.random() * 99 + 1);
        String coinAmount = String.valueOf(amount);
        String note = "My Note";
        int index1 = 1;
        int index2 = 1;

        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                addTransactions.clickOnAddTransactions();
                addTransactions.clickOnTransferTab();

                addTransactions.typeCoinName(coinName);
                addTransactions.clickOnFirstCoinResult();
                addTransactions.clickOnFromDropDown();
                String currentFromType = utils.getText((By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(" + index1 + ") .table-row")));
                utils.click(By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(" + index1 + ") .table-row"));

                addTransactions.clickOnToDropDown();
                String currentToType = utils.getText((By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(" + index2 + ") .table-row")));
                utils.click(By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(" + index2 + ") .table-row"));

                addTransactions.typeAmount(coinAmount);
                addTransactions.typeNote(note);
                addTransactions.clickOnSave();
                Thread.sleep(2000);

                String transactionType = tradesTransactionsOpenOrders.getLastTransactionType();
                String transactionAmountLength = tradesTransactionsOpenOrders.getLastTransactionCoinAmount();
                String transactionAmount = tradesTransactionsOpenOrders.getLastTransactionCoinAmount().substring(0, transactionAmountLength.length() - 4);
                String transactionFromType = tradesTransactionsOpenOrders.getLastTransactionFrom();
                String transactionToType = tradesTransactionsOpenOrders.getLastTransactionTo();

                if(!transactionType.equals("Transfer"))
                {
                    System.err.println(currentFromType + "->" + currentToType + " transaction type is invalid, should be Transfer, but " + transactionType);
                }

                if(!transactionAmount.equals(coinAmount))
                {
                    System.err.println(currentFromType + "->" + currentToType + " transaction amount is invalid, should be " + coinAmount +", but " + transactionAmount);
                }

                if(!transactionFromType.equals(currentFromType))
                {
                    System.err.println(currentFromType + "->" + currentToType + " transaction From type is invalid, should be " + currentFromType +", but " + transactionFromType);
                }

                if(!transactionToType.equals(currentToType))
                {
                    System.err.println(currentFromType + "->" + currentToType + " transaction From type is invalid, should be " + currentToType +", but " + transactionToType);
                }

                index2++;
                Thread.sleep(2000);
            }
            index1++;
        }
    }
}
