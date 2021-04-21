//package Chrome.Tests.AddPortfoliosTests;
//
//import Chrome.AllPages.PortfolioPage.AddPortfolio;
//import Chrome.AllPages.PortfolioPage.LeftSideOfPagePortfolios;
//import Chrome.Mozilla.Mozilla.MainPackage.MainPackage.MainPackage.Mozilla.MainPackage.MainPackage.MainPackage.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import java.util.List;
//
//public class AddAllMultiCoinsWalletsPositive extends Driver {
//
//    AddPortfolio addPortfolio;
//    LeftSideOfPagePortfolios leftSideOfPagePortfolios;
//    AllURLs allURLs;
//    SeleniumUtils utils;
//    Paths paths;
//    ExchangesWalletsAPIs exchangesWalletsAPIs;
//    DevServer devServre;
//
//    @BeforeClass
//    public void beforeClass() {
//        allURLs = new AllURLs(driver);
//        utils = new SeleniumUtils(driver);
//        addPortfolio = new AddPortfolio(driver);
//        leftSideOfPagePortfolios = new LeftSideOfPagePortfolios(driver);
//        paths = new Paths(driver);
//        exchangesWalletsAPIs = new ExchangesWalletsAPIs(driver);
//        devServer = new DevServer(driver);
//    }
//
//    @Test
//    public void addAllMultiCoinsWalletsPositive() throws InterruptedException {

          // Prod
//        allURLs.navigateToPortfolioPage();
//        utils.enableCookie();

          // Dev
//                  allURLs.navigateToDevMainPage();
//                          devServer
//                          .clickOnServerDropDown()
//                          .clickOnDevServer();
//                          allURLs.navigateToDevPortfolioPage();
//                          utils.enableDevCookie();
//
//                          addPortfolio
//                          .clickOnAddPortfolio()
//                          .clickOnConnectExchange();

          // Staging
//        allURLs.navigateToStagingPortfolioPage();
//                utils.enableStagingCookie();
//
//        //
//        deleteAllPortfolios();
//
//        String walletAddress = "";
//
//        Thread.sleep(3000);
//        addPortfolio.clickOnAddPortfolio();
//        addPortfolio.clickOnConnectWallet();
//
//        List<WebElement> listTill = driver.findElements(By.className("qa-wallets"));
//
//        for (int i = 0; i < listTill.size(); i++) {
//
//            List<WebElement> list = driver.findElements(By.className("qa-wallets"));
//
//            String walletName = list.get(i).getText();
//
//            switch (walletAddress)
//            {
//                case "Ledger Wallet":
//                {
//                    list.get(i).click();
//                    addPortfolio.clickOnSearchDropDownMultiCoinsWallets();
//                    addPortfolio.typeMultiCoinsWallet("Bitcoin");
//                    addPortfolio.clickOnFirstMultiCoinResult();
//                    addPortfolio.typeWalletAddress(exchangesWalletsAPIs.getBitcoinLedger());
//                    addPortfolio.clickOnAddAnotherCoin();
//                    addPortfolio.typeMultiCoinsWallet("Ethereum");
//                    addPortfolio.clickOnFirstMultiCoinResult();
//                    addPortfolio.typeWalletAddress(exchangesWalletsAPIs.getEthereumLedger());
//                    addPortfolio.clickOnSuccessYes();
//
//                    List<WebElement> list2 = driver.findElements(By.className("qa-portfolios"));
//                    int list2Size = list2.size();
//                    String ledgerParentWalletName = list2.get(list2Size).getText();
//                    String ledgerBitcoinWalletName = list2.get(list2Size - 1).getText();
//                    String ledgerEthereumWalletName = list2.get(list2Size - 2).getText();
//
//                    if(!ledgerEthereumWalletName.equals("Ledger Ethereum Wallet"))
//                    {
//                        System.err.println("Ledger Ethereum address (name) is invalid");
//                    }
//
//                    else if (!ledgerBitcoinWalletName.equals("Ledger Bitcoin Wallet"))
//                    {
//                        System.err.println("Ledger Bitcoin address (name) is invalid");
//                    }
//
//                    else if (!ledgerParentWalletName.equals("Ledger Wallet"))
//                    {
//                        System.err.println("Ledger Parent name is invalid");
//                    }
//                }
//
//                case "Exodus":
//                {
//
//
//
//                }
//
//                case "Blockchain.com":
//                {
//
//                }
//
//                case "KeepKey":
//                {
//
//                }
//
//                case "Trezor Wallet":
//                {
//
//                }
//
//                default:
//                {
//
//                }
//            }
//
//        }
//
//
//    }
//
//    public void deleteAllPortfolios() throws InterruptedException {
//        allURLs.navigateToPortfolioPage();
//
//        while (true) {
//
//            try {
//                leftSideOfPagePortfolios.moveToSecondPortfolioName();
//                Thread.sleep(1000);
//                try {
//                    leftSideOfPagePortfolios.clickOnSecondPortfolioDelete();
//                } catch (Exception e) {
//                    JavascriptExecutor executor = (JavascriptExecutor) driver;
//                    executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("ul#portfolio-list > li:nth-of-type(3) .icon-delete")));
//                }
//                leftSideOfPagePortfolios.clickOnDeleteInDelete();
//                Thread.sleep(3000);
//            }
//            catch (NoSuchElementException e)
//            {
//                break;
//            }
//        }
//    }
//
//
//}
