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

public class AddAllWalletsNegative extends Driver {

    AddPortfolio addPortfolio;
    LeftSideOfPagePortfolios leftSideOfPagePortfolios;
    AllURLs allURLs;
    SeleniumUtils utils;
    Paths paths;
    ExchangesWalletsAPIs exchangesWalletsAPIs;
    DevServer devServer;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        addPortfolio = new AddPortfolio(driver);
        leftSideOfPagePortfolios = new LeftSideOfPagePortfolios(driver);
        paths = new Paths(driver);
        exchangesWalletsAPIs = new ExchangesWalletsAPIs(driver);
        devServer = new DevServer(driver);
    }

    @Test
    public void connectAllWallets() {

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

        addPortfolio
                .clickOnAddPortfolio()
                .clickOnConnectWallet();

        List<WebElement> listTill = driver.findElements(By.className("qa-wallets"));

        for (int i = 0; i < listTill.size(); i++) {

            List<WebElement> list = driver.findElements(By.className("qa-wallets"));

            String walletName = list.get(i).getText();
            list.get(i).click();

            String walletAddress = "walletAddress";

            if (walletName.equals("Metamask") || walletName.equals("Exodus") || walletName.equals("Tron Wallet") || walletName.equals("Ledger") || walletName.equals("Trezor") || walletName
            .equals("KeepKey") || walletName.equals("Blockchain.com"))
            {
                addPortfolio.clickOnBack();
                continue;
            }

            else
            {
                addPortfolio.typeWalletAddress(walletAddress);
                addPortfolio.clickOnSubmit();

                if (addPortfolio.walletErrorIsDisplayed() == true) {
                    String errorMessage = addPortfolio.getWalletError();
                    System.out.println(walletName + " negative case Passed");
                    System.out.print(walletName + " error message is - " + errorMessage);
                    addPortfolio.clickOnBack();
                }
                else {
                    System.err.println(walletName + " negative case filed");
                    utils.refreshPage();
                    addPortfolio
                            .clickOnAddPortfolio()
                            .clickOnConnectWallet();
                    continue;
                }
            }
        }
    }
}
