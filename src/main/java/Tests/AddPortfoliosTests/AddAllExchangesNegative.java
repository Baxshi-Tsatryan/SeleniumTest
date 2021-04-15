package Tests.AddPortfoliosTests;

import AllPages.PortfolioPage.AddPortfolio;
import AllPages.PortfolioPage.LeftSideOfPagePortfolios;
import MainPackage.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class AddAllExchangesNegative extends Driver {

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
    public void connectAllExchanges() throws InterruptedException {
        allURLs.navigateToPortfolioPage();
        utils.enableCookie();

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