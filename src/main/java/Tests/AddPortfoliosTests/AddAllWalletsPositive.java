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

public class AddAllWalletsPositive extends Driver{

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
            }
            catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".primary")));
            }

            addPortfolio.clickOnConnectWallet();

            List<WebElement> listTill = driver.findElements(By.className("qa-wallets"));

            for (int i = 29; i < listTill.size(); i++) {

                List<WebElement> list = driver.findElements(By.className("qa-wallets"));
                list.get(i).click();

                int loop = 0;

                switch (i) {
                    case 0: {
                        walletAddress = exchangesWalletsAPIs.getEthereumWallet();
                        break;
                    }

                    case 1: {
                        loop = 1;
                        break;
                    }

                    case 2: {
                        walletAddress = exchangesWalletsAPIs.getBitcoinWallet();
                        break;
                    }

                    case 3: {
                        loop = 1;
                        break;
                    }

                    case 4: {
                        loop = 1;
                        break;
                    }

                    case 5: {
                        loop = 1;
                        break;
                    }

                    case 6: {
                        walletAddress = exchangesWalletsAPIs.getAlgorandWallet();
                        break;
                    }

                    case 7: {
                        loop = 1;
                        break;
                    }

                    case 8: {
                        walletAddress = exchangesWalletsAPIs.getBitcoinCashWallet();
                        break;
                    }

                    case 9: {
                        loop = 1;
                        break;
                    }

                    case 10: {
                        walletAddress = exchangesWalletsAPIs.getCardanoWallet();
                        break;
                    }

                    case 11: {
                        walletAddress = exchangesWalletsAPIs.getCosmosWallet();
                        break;
                    }

                    case 12: {
                        walletAddress = exchangesWalletsAPIs.getDashWallet();
                        break;
                    }

                    case 13: {
                        walletAddress = exchangesWalletsAPIs.getDigiByteWallet();
                        break;
                    }

                    case 14: {
                        //walletAddress = exchangesWalletsAPIs.getEOSWallet();
                        loop = 1;
                        break;
                    }

                    case 15: {
                        walletAddress = exchangesWalletsAPIs.getEthereumClassicWallet();
                        break;
                    }

                    case 16: {
                        loop = 1;
                        break;
                    }

                    case 17: {
                        loop = 1;
                        break;
                    }

                    case 18: {
                        walletAddress = exchangesWalletsAPIs.getLitecoinWallet();
                        break;
                    }

                    case 19: {
                        walletAddress = exchangesWalletsAPIs.getNeoWallet();
                        break;
                    }

                    case 20: {
                        loop = 1;
                        break;
                    }

                    case 21: {
                        walletAddress = exchangesWalletsAPIs.getOntologyWallet();
                        break;
                    }

                    case 22: {
                        loop = 1;
                        break;
                    }

                    case 23: {
                        walletAddress = exchangesWalletsAPIs.getStellarWallet();
                        break;
                    }

                    case 24: {
                        // walletAddress = exchangesWalletsAPIs.getTezosWallet();
                        loop = 1;
                        break;
                    }

                    case 25: {
                        loop = 1;
                        break;
                    }

                    case 26:
                    {
                        walletAddress = exchangesWalletsAPIs.getTronWallet();
                        break;
                    }

                    case 27:
                    {
                        //walletAddress = exchangesWalletsAPIs.getVeChainWallet();
                        loop = 1;
                        break;
                    }

                    case 28:
                    {
                        walletAddress = exchangesWalletsAPIs.getWavesWallet();
                        break;
                    }

                    case 29:
                    {
                        //walletAddress = exchangesWalletsAPIs.getXRPWallet();
                        loop = 1;
                        break;
                    }

                    case 30:
                    {
                        walletAddress = exchangesWalletsAPIs.getZClassicWallet();
                        break;
                    }

                    case 31:
                    {
                        walletAddress = exchangesWalletsAPIs.getZillqaWallet();
                        break;
                    }

                    case 32:
                    {
                        loop = 1;
                        break;
                    }
                }

                if (loop == 1)
                {
                    Thread.sleep(1000);
                    try {
                        addPortfolio.clickOnBack();
                    }
                    catch (Exception e) {
                        JavascriptExecutor executor = (JavascriptExecutor) driver;
                        executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".icon-back")));
                    }
                    continue;
                }

                else
                {
                    addPortfolio.typeWalletAddress(walletAddress);
                    Thread.sleep(1000);
                    addPortfolio.clickOnSubmit();
                    addPortfolio.clickOnSuccessYes();
                    addPortfolio.clickOnConnectWallet();
                    continue;
                }

            }

            deleteAllPortfolios();
        }


        public void deleteAllPortfolios() throws InterruptedException {
            allURLs.navigateToPortfolioPage();

            while (true) {

                try {
                    leftSideOfPagePortfolios.moveToSecondPortfolioName();
                    leftSideOfPagePortfolios.clickOnSecondPortfolioDelete();
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
