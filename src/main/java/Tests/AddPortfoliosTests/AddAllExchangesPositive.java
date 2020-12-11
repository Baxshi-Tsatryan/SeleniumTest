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

public class AddAllExchangesPositive extends Driver {

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

        deleteAllPortfolios();

        String firstAPI = "";
        String secondAPI = "";
        String thirdAPI = "";

        Thread.sleep(4000);
        try {
            addPortfolio.clickOnAddPortfolio();
        }
        catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".primary")));
        }

        addPortfolio.clickOnConnectExchange();

        List<WebElement> listTill = driver.findElements(By.className("qa-exchanges"));

        for (int i = 0; i < listTill.size(); i++) {

            List<WebElement> list = driver.findElements(By.className("qa-exchanges"));

            String exchangeName = list.get(i).getText();
            list.get(i).click();

            int loop = 0;

            switch (i) {
                case 0: {
                    firstAPI = exchangesWalletsAPIs.getBinanceAPIKey();
                    secondAPI = exchangesWalletsAPIs.getBinanceAPISecret();
                    loop = 1;
                    break;
                }

                case 1: {
                    firstAPI = exchangesWalletsAPIs.getBinanceUSAPIKey();
                    secondAPI = exchangesWalletsAPIs.getBinanceUSAPISecret();
                    loop = 2;
                    break;
                }

                case 2: {
                    loop = 0;
                    break;
                }

                case 3: {
                    loop = 0;
                    break;
                }

                case 4: {
                    loop = 0;
                    break;
                }

                case 5: {
                    loop = 0;
                    break;
                }

                case 6: {
                    firstAPI = exchangesWalletsAPIs.getBitmaxAPIKey();
                    secondAPI = exchangesWalletsAPIs.getBitmaxAPISecret();
                    loop = 2;
                    break;
                }

                case 7: {
                    //firstAPI = exchangesWalletsAPIs.getBitmexID();
                    //secondAPI = exchangesWalletsAPIs.getBitmexAPISecret();
                    loop = 0;
                    break;
                }

                case 8: {
                    firstAPI = exchangesWalletsAPIs.getBitfinexAPIKey();
                    secondAPI = exchangesWalletsAPIs.getBitfinexAPISecret();
                    loop = 2;
                    break;
                }

                case 9: {
                    firstAPI = exchangesWalletsAPIs.getBitsoAPIKey();
                    secondAPI = exchangesWalletsAPIs.getBitsoAPISecret();
                    loop = 2;
                    break;
                }

                case 10: {
                    loop = 0;
                    break;
                }

                case 11: {
                    loop = 0;
                    break;
                }

                case 12: {
                    firstAPI = exchangesWalletsAPIs.getByBitAPIPrivateKey();
                    secondAPI = exchangesWalletsAPIs.getByBitPrivateKey();
                    loop = 8;
                    break;
                }

                case 13: {
                    firstAPI = exchangesWalletsAPIs.getCexioAPIKey();
                    secondAPI = exchangesWalletsAPIs.getCexioAPISecret();
                    thirdAPI = exchangesWalletsAPIs.getCexioUserID();
                    loop = 3;
                    break;
                }

                case 14: {
                    loop = 0;
                    break;
                }

                case 15: {
                    firstAPI = exchangesWalletsAPIs.getDeribitClientID();
                    secondAPI = exchangesWalletsAPIs.getDeribitClientSecret();
                    loop = 2;
                    break;
                }

                case 16: {
                    firstAPI = exchangesWalletsAPIs.getFTXAPIKey();
                    secondAPI = exchangesWalletsAPIs.getFTXAPISecret();
                    loop = 8;
                    break;
                }

                case 17: {
                    loop = 0;
                    break;
                }

                case 18: {
                    firstAPI = exchangesWalletsAPIs.getHitBTCAPIKey();
                    secondAPI = exchangesWalletsAPIs.getHitBTCAPISecret();
                    loop = 2;
                    break;
                }

                case 19: {
                    firstAPI = exchangesWalletsAPIs.getHuobiAccessKey();
                    secondAPI = exchangesWalletsAPIs.getHuobiAccessSecret();
                    loop = 2;
                    break;
                }

                case 20: {
                    firstAPI = exchangesWalletsAPIs.getIdexAPICode();
                    secondAPI = exchangesWalletsAPIs.getIdexAPISecret();
                    loop = 2;
                    break;
                }

                case 21: {
                    firstAPI = exchangesWalletsAPIs.getKrakenAPIKey();
                    secondAPI = exchangesWalletsAPIs.getKrakenAPISecret();
                    loop = 2;
                    break;
                }

                case 22: {
                    firstAPI = exchangesWalletsAPIs.getKucoinKey();
                    secondAPI = exchangesWalletsAPIs.getKucoinSecret();
                    thirdAPI = exchangesWalletsAPIs.getKucoinPassphrase();
                    loop = 3;
                    break;
                }

                case 23: {
                    firstAPI = exchangesWalletsAPIs.getLiquidID();
                    secondAPI = exchangesWalletsAPIs.getLiquidTokenSecret();
                    loop = 2;
                    break;
                }

                case 24: {
                    firstAPI = exchangesWalletsAPIs.getOkexKey();
                    secondAPI = exchangesWalletsAPIs.getOkexSecret();
                    thirdAPI = exchangesWalletsAPIs.getOkexPassphrase();
                    loop = 3;
                    break;
                }

                case 25: {
                    firstAPI = exchangesWalletsAPIs.getPoloniexAPIKey();
                    secondAPI = exchangesWalletsAPIs.getPoloniexAPISecret();
                    loop = 2;
                    break;
                }
            }

            if (loop == 0)
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

            else if (loop == 1)
            {
                addPortfolio.typeFirstAPI(firstAPI);
                addPortfolio.typeSecondAPI(secondAPI);
                Thread.sleep(1000);
                addPortfolio.clickOnSubmit();
                addPortfolio.clickOnBinanceAddAccounts();
                addPortfolio.clickOnSuccessYes();
                addPortfolio.clickOnConnectExchange();
                continue;
            }

            else if (loop == 2)
            {
                addPortfolio.typeFirstAPI(firstAPI);
                addPortfolio.typeSecondAPI(secondAPI);
            }

            else if (loop == 8)
            {
                addPortfolio.typeFirstAPI(firstAPI);
                addPortfolio.typeSecondAPIByBit(secondAPI);
            }

            else if (loop == 3)
            {
                addPortfolio.typeFirstAPI(firstAPI);
                addPortfolio.typeSecondAPI(secondAPI);
                addPortfolio.typeThirdAPI(thirdAPI);
            }
            
            Thread.sleep(1000);
            addPortfolio.clickOnSubmit();
            try {
                addPortfolio.clickOnNoShowMeSynced();
            }
            catch (NoSuchElementException e)
            {
                System.err.println(exchangeName + " exchange API is Invalid or exception with Submit button");
                try
                {
                    addPortfolio.clickOnBack();
                }
                catch (Exception ee) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".icon-back")));
                }
                continue;
            }

            List<WebElement> list2 = driver.findElements(By.className("qa-portfolios"));
            String addedExchangeName = list2.get(list2.size() - 1).getText();

            if (!exchangeName.equals(addedExchangeName))
            {
                System.err.println(exchangeName + " exchange API is invalid");
            }

            Thread.sleep(2000);
            try {
                addPortfolio.clickOnAddPortfolio();
            }
            catch (Exception e) {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".primary")));
            }
            addPortfolio.clickOnConnectExchange();

        }

        deleteAllPortfolios();
    }


    public void deleteAllPortfolios() throws InterruptedException {
        allURLs.navigateToPortfolioPage();

        while (true) {

            try {
                leftSideOfPagePortfolios.moveToSecondPortfolioName();
                Thread.sleep(1000);
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