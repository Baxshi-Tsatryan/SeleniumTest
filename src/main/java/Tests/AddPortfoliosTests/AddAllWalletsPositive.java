package Tests.AddPortfoliosTests;

import AllPages.PortfolioPage.AddPortfolio;
import AllPages.PortfolioPage.LeftSideOfPagePortfolios;
import MainPackage.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class AddAllWalletsPositive extends Driver {

    AddPortfolio addPortfolio;
    LeftSideOfPagePortfolios leftSideOfPagePortfolios;
    AllURLs allURLs;
    SeleniumUtils utils;
    Paths paths;
    ExchangesWalletsAPIs exchangesWalletsAPIs;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        addPortfolio = new AddPortfolio(driver);
        leftSideOfPagePortfolios = new LeftSideOfPagePortfolios(driver);
        paths = new Paths(driver);
        exchangesWalletsAPIs = new ExchangesWalletsAPIs(driver);
    }

    @Test
    public void connectAllWallets() throws InterruptedException {
        allURLs.navigateToPortfolioPage();
        utils.enableCookie();

        String walletAddress = "";

        Thread.sleep(4000);
        try {
            addPortfolio.clickOnAddPortfolio();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".primary")));
        }

        addPortfolio.clickOnConnectWallet();

        List<WebElement> listTill = driver.findElements(By.className("qa-wallets"));

        for (int i = 0; i < listTill.size(); i++) {

            List<WebElement> list = driver.findElements(By.className("qa-wallets"));

            String exchangeName = list.get(i).getText();
            list.get(i).click();

            int loop = 0;

            switch (exchangeName) {
                case "Ethereum Wallet": {
                    walletAddress = exchangesWalletsAPIs.getEthereumWallet();
                    break;
                }

                case "Bitcoin Wallet": {
                    walletAddress = exchangesWalletsAPIs.getBitcoinWallet();
                    break;
                }

                case "Algorand Wallet": {
                    walletAddress = exchangesWalletsAPIs.getAlgorandWallet();
                    break;
                }

                case "Bitcoin Cash Wallet": {
                    walletAddress = exchangesWalletsAPIs.getBitcoinCashWallet();
                    break;
                }

                case "Cardano Wallet": {
                    walletAddress = exchangesWalletsAPIs.getCardanoWallet();
                    break;
                }

                case "Cosmos Wallet": {
                    walletAddress = exchangesWalletsAPIs.getCosmosWallet();
                    break;
                }

                case "DASH Wallet": {
                    walletAddress = exchangesWalletsAPIs.getDashWallet();
                    break;
                }

                case "DigiByte Wallet": {
                    walletAddress = exchangesWalletsAPIs.getDigiByteWallet();
                    break;
                }

                case "Ethereum Classic Wallet": {
                    walletAddress = exchangesWalletsAPIs.getEthereumClassicWallet();
                    break;
                }

                case "Litecoin Wallet": {
                    walletAddress = exchangesWalletsAPIs.getLitecoinWallet();
                    break;
                }

                case "NEO Wallet": {
                    walletAddress = exchangesWalletsAPIs.getNeoWallet();
                    break;
                }

                case "Ontology Wallet": {
                    walletAddress = exchangesWalletsAPIs.getOntologyWallet();
                    break;
                }

                case "Stellar Wallet": {
                    walletAddress = exchangesWalletsAPIs.getStellarWallet();
                    break;
                }

                case "Tron Wallet": {
                    walletAddress = exchangesWalletsAPIs.getTronWallet();
                    break;
                }

                case "Waves Wallet": {
                    walletAddress = exchangesWalletsAPIs.getWavesWallet();
                    break;
                }

                case "ZClassic Wallet": {
                    walletAddress = exchangesWalletsAPIs.getZClassicWallet();
                    break;
                }

                case "Zilliqa Wallet": {
                    walletAddress = exchangesWalletsAPIs.getZillqaWallet();
                    break;
                }

                default: {
                    Thread.sleep(1000);
                    try {
                        addPortfolio.clickOnBack();
                    } catch (Exception e) {
                        JavascriptExecutor executor = (JavascriptExecutor) driver;
                        executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".icon-back")));
                    }
                    continue;
                }
            }
            addPortfolio.typeWalletAddress(walletAddress);
            Thread.sleep(1000);
            addPortfolio.clickOnSubmit();
            try {
                addPortfolio.clickOnNoShowMeSynced();
            } catch (NoSuchElementException e) {
                System.err.println(exchangeName + " wallet address is Invalid or exception with Submit button");
                try {
                    addPortfolio.clickOnBack();
                } catch (Exception ee) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".icon-back")));
                }
            }

            List<WebElement> list2 = driver.findElements(By.className("qa-portfolios"));
            String addedExchangeName = list2.get(list2.size() - 1).getText();

            if (!exchangeName.equals(addedExchangeName)) {
                System.err.println(exchangeName + " exchange API is invalid");
            }

            Thread.sleep(2000);
            try {
                addPortfolio.clickOnAddPortfolio();
            } catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".primary")));
            }

            addPortfolio.clickOnConnectWallet();
        }

        deleteAllPortfolios();

    }


         public void addManualPortfolioPositive() {

                allURLs.navigateToPortfolioPage();

                addPortfolio.clickOnAddPortfolio();
                addPortfolio.clickOnAddManualPortfolio();
                addPortfolio.clickOnSaveButtonInManualPortfolio();
                utils.refreshPage();

                addPortfolio.clickOnAddPortfolio();
                addPortfolio.clickOnAddManualPortfolio();
                addPortfolio.typeManualPortfolioName("Name");
                addPortfolio.typeManualPortfolioTotalCost("100");
                addPortfolio.clickOnSaveButtonInManualPortfolio();
                utils.refreshPage();
    }

        public void deleteAllPortfolios() throws InterruptedException {
            allURLs.navigateToPortfolioPage();

            while (true) {

                try {
                    leftSideOfPagePortfolios.moveToSecondPortfolioName();
                    Thread.sleep(1000);
                    try {
                        leftSideOfPagePortfolios.clickOnSecondPortfolioDelete();
                    } catch (Exception e) {
                        JavascriptExecutor executor = (JavascriptExecutor) driver;
                        executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("ul#portfolio-list > li:nth-of-type(3) .icon-delete")));
                    }
                    leftSideOfPagePortfolios.clickOnDeleteInDelete();
                    Thread.sleep(3000);
                }
                catch (NoSuchElementException e)
                {
                    break;
                }
            }
        }
    }
