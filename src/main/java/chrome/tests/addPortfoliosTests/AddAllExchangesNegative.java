package chrome.tests.addPortfoliosTests;

import chrome.allPages.DevServer;
import chrome.allPages.portfolioPage.AddPortfolioModal;
import chrome.allPages.portfolioPage.LeftSideOfPagePortfolios;
import chrome.mainPackage.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class AddAllExchangesNegative extends Driver {

    AddPortfolioModal addPortfolio;
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
        addPortfolio = new AddPortfolioModal(driver);
        leftSideOfPagePortfolios = new LeftSideOfPagePortfolios(driver);
        paths = new Paths(driver);
        exchangesWalletsAPIs = new ExchangesWalletsAPIs(driver);
        devServer = new DevServer(driver);
    }

    @Test
    public void connectAllExchanges() throws InterruptedException {

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
                .clickOnConnectExchange();

        List<WebElement> listTill = driver.findElements(By.className("qa-exchanges"));

        for (int i = 0; i < listTill.size(); i++) {

            List<WebElement> list = driver.findElements(By.className("qa-exchanges"));

            Thread.sleep(1000);
            String exchangeName = list.get(i).getText();
            list.get(i).click();

            String firstAPI = "firstAPI";
            String secondAPI = "secondAPI";
            String thirdAPI = "thirdAPI";

            switch (exchangeName) {
                case "Coinbase":
                case "Crypto.com app":
                case "Nexo (beta)":
                case "Nexo":
                case "BlockFi (beta)":
                case "BlockFi":
                case "Bitbuy":
                case "Bitpanda Pro": {
                    addPortfolio.clickOnBack();
                    continue;
                }

                case "Coinbase Pro":
                case "Bitstamp":
                case "Cex.io":
                case "OKEX":
                case "KuCoin": {
                    addPortfolio.typeFirstAPI(firstAPI);
                    addPortfolio.typeSecondAPI(secondAPI);
                    addPortfolio.typeThirdAPI(thirdAPI);
                    break;
                }

                case "Bybit":
                case "Currency.com":
                case "FTX":
                case "Bitrue": {
                    addPortfolio.typeFirstAPI(firstAPI);
                    //Thread.sleep(1000);
                    addPortfolio.typeSecondAPIByBit(secondAPI);
                    break;
                }

                default: {
                    addPortfolio.typeFirstAPI(firstAPI);
                    addPortfolio.typeSecondAPI(secondAPI);
                    break;
                }
            }

            addPortfolio.clickOnSubmit();

            if (addPortfolio.errorMessageIsDisplayed() == true) {
                String errorMessage = addPortfolio.getErrorMessage();
                System.out.println(exchangeName + " negative case Passed");
                System.out.print(exchangeName + " error message is - " + errorMessage);
                addPortfolio.clickOnBack();
            } else if (addPortfolio.errorMessage2IsDisplayed() == true) {
                String errorMessage2 = addPortfolio.getErrorMessage2();
                System.err.println(exchangeName + " negative case Passed");
                System.out.print(exchangeName + " error message is - " + errorMessage2);
                addPortfolio.clickOnBack();
            } else {
                System.err.println(exchangeName + " negative case Failed (portfolio added)");
                utils.refreshPage();

                addPortfolio.clickOnAddPortfolio();
                addPortfolio.clickOnConnectExchange();

                continue;
            }
        }
    }
}