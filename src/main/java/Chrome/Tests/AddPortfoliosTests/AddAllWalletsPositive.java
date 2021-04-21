package Chrome.Tests.AddPortfoliosTests;

import Chrome.AllPages.DevServer;
import Chrome.AllPages.PortfolioPage.AddPortfolio;
import Chrome.AllPages.PortfolioPage.LeftSideOfPagePortfolios;
import Chrome.MainPackage.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class AddAllWalletsPositive extends ChromeDriver {

    AddPortfolio addPortfolio;
    LeftSideOfPagePortfolios leftSideOfPagePortfolios;
    AllURLs allURLs;
    SeleniumUtils utils;
    Paths paths;
    ExchangesWalletsAPIs exchangesWalletsAPIs;
    DeleteAllPortfolios deleteAllPortfolios;
    DevServer devServer;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        addPortfolio = new AddPortfolio(driver);
        leftSideOfPagePortfolios = new LeftSideOfPagePortfolios(driver);
        paths = new Paths(driver);
        exchangesWalletsAPIs = new ExchangesWalletsAPIs(driver);
        deleteAllPortfolios = new DeleteAllPortfolios(driver);
        devServer = new DevServer(driver);
    }

    @Test
    public void connectAllWallets() throws InterruptedException {

        // Prod
        allURLs.navigateToPortfolioPage();
        utils.enableCookie();

        // Dev
//        allURLs.navigateToDevMainPage();
//        devServer
//                .clickOnServerDropDown()
//                .clickOnDevServer();
//        allURLs.navigateToDevPortfolioPage();
//        utils.enableDevCookie();
//
//        addPortfolio
//                .clickOnAddPortfolio()
//                .clickOnConnectExchange();

        // Staging
//        allURLs.navigateToStagingPortfolioPage();
//        utils.enableStagingCookie();

        deleteAllPortfolios.deleteAllPortfolios();

        String walletAddress = "";

        addPortfolio
                .clickOnAddPortfolio()
                .clickOnConnectWallet();

        List<WebElement> listTill = driver.findElements(By.className("qa-wallets"));

        for (int i = 0; i < listTill.size(); i++) {

            List<WebElement> list = driver.findElements(By.className("qa-wallets"));

            String walletName = list.get(i).getText();
            list.get(i).click();

            int loop = 0;

            Thread.sleep(1000);
            switch (walletName) {
                case "Ethereum Wallet": {
                    walletAddress = exchangesWalletsAPIs.getEthereumAddress();
                    break;
                }

                case "Bitcoin Wallet": {
                    walletAddress = exchangesWalletsAPIs.getBitcoinAddress();
                    break;
                }

//                case "Celsius Network":{
//                    break;
//                }

                case "Algorand Wallet": {
                    walletAddress = exchangesWalletsAPIs.getAlgorandAddress();
                    break;
                }

//                case "Binance Chain":{
//                    break;
//                }

                case "Bitcoin Cash Wallet": {
                    walletAddress = exchangesWalletsAPIs.getBitcoinCashAddress();
                    break;
                }

//                case "Binance Smart Chain":{
//                    break;
//                }

                case "Cardano Wallet": {
                    walletAddress = exchangesWalletsAPIs.getCardanoAddress();
                    break;
                }

                case "Cosmos Wallet": {
                    walletAddress = exchangesWalletsAPIs.getCosmosAddress();
                    break;
                }
//
//                case "XRP Wallet":{
//                    break;
//                }

                case "DASH Wallet": {
                    walletAddress = exchangesWalletsAPIs.getDashAddress();
                    break;
                }

                case "DigiByte Wallet": {
                    walletAddress = exchangesWalletsAPIs.getDigiByteAddress();
                    break;
                }

//                case "Doge Wallet":{
//                    break;
//                }

                case "Ethereum Classic Wallet": {
                    walletAddress = exchangesWalletsAPIs.getEthereumClassicAddress();
                    break;
                }

//                case "EOS Wallet":{
//                    break;
//                }

                case "Litecoin Wallet": {
                    walletAddress = exchangesWalletsAPIs.getLitecoinAddress();
                    break;
                }

//                case "Polkadot Wallet":{
//                    break;
//                }

                case "NEO Wallet": {
                    walletAddress = exchangesWalletsAPIs.getNEOAddress();
                    break;
                }

//                case "Tezos Wallet":{
//                    break;
//                }

                case "Ontology Wallet": {
                    walletAddress = exchangesWalletsAPIs.getOntologyAddress();
                    break;
                }

//                case "VeChain Wallet":{
//                    break;
//                }

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
                    addPortfolio.clickOnBack();
                    continue;
                }
            }
            
            addPortfolio.typeWalletAddress(walletAddress);
            addPortfolio.clickOnSubmit();
            try {
                addPortfolio.clickOnNoShowMeSynced();
            } catch (Exception e) {
                System.err.println(walletName + " wallet address is invalid");
                String errorMessage = addPortfolio.getWalletError();
                System.err.println(walletName + " error message is - " + errorMessage);
                addPortfolio.clickOnBack();
                continue;
            }

            System.out.println(walletName + " wallet positive case passed");

            List<WebElement> list2 = driver.findElements(By.className("qa-portfolios"));
            String addedExchangeName = list2.get(list2.size() - 1).getText();

            if (!walletName.equals(addedExchangeName)) {
                System.err.println(walletName + " wallet address is invalid");
            }

            addPortfolio.clickOnAddPortfolio();
            addPortfolio.clickOnConnectWallet();
        }

        utils.refreshPage();
        deleteAllPortfolios.deleteAllPortfolios();
    }
}
