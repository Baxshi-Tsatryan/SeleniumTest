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

public class AddAllWalletsPositive2Name extends Driver {

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
        addPortfolio.clickOnAddPortfolio();
        addPortfolio.clickOnConnectWallet();

        List<WebElement> listTill = driver.findElements(By.className("qa-wallets"));

        for (int i = 0; i < listTill.size(); i++) {

            List<WebElement> list = driver.findElements(By.className("qa-wallets"));

            String walletName = list.get(i).getText();
            list.get(i).click();

            String changedWalletName = "My" + walletName;
            int loop = 0;

            switch (walletName) {
                case "Ethereum Wallet": {
                    walletAddress = exchangesWalletsAPIs.getEthereumAddress();
                    break;
                }

                case "Bitcoin Wallet": {
                    walletAddress = exchangesWalletsAPIs.getBitcoinAddress();
                    break;
                }

                case "Algorand Wallet": {
                    walletAddress = exchangesWalletsAPIs.getAlgorandAddress();
                    break;
                }

                case "Bitcoin Cash Wallet": {
                    walletAddress = exchangesWalletsAPIs.getBitcoinCashAddress();
                    break;
                }

                case "Cardano Wallet": {
                    walletAddress = exchangesWalletsAPIs.getCardanoAddress();
                    break;
                }

                case "Cosmos Wallet": {
                    walletAddress = exchangesWalletsAPIs.getCosmosAddress();
                    break;
                }

                case "DASH Wallet": {
                    walletAddress = exchangesWalletsAPIs.getDashAddress();
                    break;
                }

                case "DigiByte Wallet": {
                    walletAddress = exchangesWalletsAPIs.getDigiByteAddress();
                    break;
                }

                case "Ethereum Classic Wallet": {
                    walletAddress = exchangesWalletsAPIs.getEthereumClassicAddress();
                    break;
                }

                case "Litecoin Wallet": {
                    walletAddress = exchangesWalletsAPIs.getLitecoinAddress();
                    break;
                }

                case "NEO Wallet": {
                    walletAddress = exchangesWalletsAPIs.getNEOAddress();
                    break;
                }

                case "Ontology Wallet": {
                    walletAddress = exchangesWalletsAPIs.getOntologyAddress();
                    break;
                }

                case "Stellar Wallet": {
                    walletAddress = exchangesWalletsAPIs.getStellarAddress();
                    break;
                }

                case "Tron Wallet": {
                    walletAddress = exchangesWalletsAPIs.getTronAddress();
                    break;
                }

                case "Waves Wallet": {
                    walletAddress = exchangesWalletsAPIs.getWavesAddress();
                    break;
                }

                case "ZClassic Wallet": {
                    walletAddress = exchangesWalletsAPIs.getZClassicAddress();
                    break;
                }

                case "Zilliqa Wallet": {
                    walletAddress = exchangesWalletsAPIs.getZillqaAddress();
                    break;
                }

                default: {
                    Thread.sleep(1000);
                    addPortfolio.clickOnBack();
                    continue;
                }
            }

            addPortfolio.clearExchangeName();
            addPortfolio.typeExchangeName(changedWalletName);
            addPortfolio.typeWalletAddress(walletAddress);
            Thread.sleep(1000);
            addPortfolio.clickOnSubmit();
            try {
                addPortfolio.clickOnNoShowMeSynced();
            } catch (NoSuchElementException e) {
                System.err.println(walletName + " wallet address is Invalid or exception with Submit button");
                addPortfolio.clickOnBack();
            }

            List<WebElement> list2 = driver.findElements(By.className("qa-portfolios"));
            String addedExchangeName = list2.get(list2.size() - 1).getText();

            if (!changedWalletName.equals(addedExchangeName)) {
                System.err.println(walletName + " wallet address (name) is invalid");
            }

            Thread.sleep(2000);
            addPortfolio.clickOnAddPortfolio();
            addPortfolio.clickOnConnectWallet();
        }

        deleteAllPortfolios();

    }


 //  public void addManualPortfolioPositive() {

 //      allURLs.navigateToPortfolioPage();

 //      addPortfolio.clickOnAddPortfolio();
 //      addPortfolio.clickOnAddManualPortfolio();
 //      addPortfolio.clickOnSaveButtonInManualPortfolio();
 //      utils.refreshPage();

 //      addPortfolio.clickOnAddPortfolio();
 //      addPortfolio.clickOnAddManualPortfolio();
 //      addPortfolio.typeManualPortfolioName("Name");
 //      addPortfolio.typeManualPortfolioTotalCost("100");
 //      addPortfolio.clickOnSaveButtonInManualPortfolio();
 //      utils.refreshPage();
 //  }

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
