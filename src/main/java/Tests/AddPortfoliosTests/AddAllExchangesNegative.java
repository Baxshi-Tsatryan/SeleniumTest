package Tests.AddPortfoliosTests;

import AllPages.PortfolioPage.AddPortfolio;
import AllPages.PortfolioPage.LeftSideOfPagePortfolios;
import MainPackage.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

            String firstAPI = "firstAPI";
            String secondAPI = "secondAPI";
            String thirdAPI = "thirdAPI";

            if (exchangeName.equals("Coinbase") || exchangeName.equals("Crypto.com app") || exchangeName.equals("Nexo (beta)") || exchangeName.equals("Gemini"))
            {
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

            else if (exchangeName.equals("Coinbase Pro") || exchangeName.equals("Bitstamp") || exchangeName.equals("Cex.io") || exchangeName.equals("OKEX") || exchangeName.equals("KuCoin"))
            {
                addPortfolio.typeFirstAPI(firstAPI);
                addPortfolio.typeSecondAPI(secondAPI);
                addPortfolio.typeThirdAPI(thirdAPI);
            }

            else if (exchangeName.equals("Bybit") || exchangeName.equals("Currency.com") || exchangeName.equals("FTX"))
            {
                addPortfolio.typeFirstAPI(firstAPI);
                addPortfolio.typeSecondAPIByBit(secondAPI);
            }

            else
            {
                addPortfolio.typeFirstAPI(firstAPI);
                addPortfolio.typeSecondAPI(secondAPI);
            }

            Thread.sleep(1000);
            addPortfolio.clickOnSubmit();
            String errorMessage = addPortfolio.getErrorMessage();
            System.out.println(exchangeName + " - " + "invalid format - " + errorMessage);
                try
                {
                    addPortfolio.clickOnBack();
                }
                catch (Exception ee) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".icon-back")));
                }
        }

        for (int i = 0; i < listTill.size(); i++) {

            List<WebElement> list = driver.findElements(By.className("qa-exchanges"));

            String exchangeName = list.get(i).getText();
            list.get(i).click();

            String firstAPI = "BcN94QMVwlRzEaTs3xuKnk9s73cdvlDL9lTrUV0GBbD6zsOzlt0Z79HOCXIxjZvl";
            String secondAPI = "BcN94QMVwlRzEaTs3xuKnk9s73cdvlDL9lTrUV0GBbD6zsOzlt0Z79HOCXIxjZvl";
            String thirdAPI = "BcN94QMVwlRzEaTs3xuKnk9s73cdvlDL9lTrUV0GBbD6zsOzlt0Z79HOCXIxjZvl";

            if (exchangeName.equals("Coinbase") || exchangeName.equals("Crypto.com app") || exchangeName.equals("Nexo (beta)") || exchangeName.equals("Gemini"))
            {
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

            else if (exchangeName.equals("Coinbase Pro") || exchangeName.equals("Bitstamp") || exchangeName.equals("Cex.io") || exchangeName.equals("OKEX") || exchangeName.equals("KuCoin"))
            {
                addPortfolio.typeFirstAPI(firstAPI);
                addPortfolio.typeSecondAPI(secondAPI);
                addPortfolio.typeThirdAPI(thirdAPI);
            }

            else if (exchangeName.equals("Bybit") || exchangeName.equals("Currency.com") || exchangeName.equals("FTX"))
            {
                addPortfolio.typeFirstAPI(firstAPI);
                addPortfolio.typeSecondAPIByBit(secondAPI);
            }

            else
            {
                addPortfolio.typeFirstAPI(firstAPI);
                addPortfolio.typeSecondAPI(secondAPI);
            }

            Thread.sleep(1000);
            addPortfolio.clickOnSubmit();
            String errorMessage = addPortfolio.getErrorMessage();
            System.out.println(exchangeName + " - " + "wrong API - " + errorMessage);
            try
            {
                addPortfolio.clickOnBack();
            }
            catch (Exception ee) {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".icon-back")));
            }
        }
    }
}