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

public class AddAllWalletsNegative extends Driver {

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

        Thread.sleep(4000);
        try {
            addPortfolio.clickOnAddPortfolio();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".primary")));
        }

        addPortfolio.clickOnConnectWallet();

        List<WebElement> listTill = driver.findElements(By.className("qa-wallets"));

        // Invalid format
        for (int i = 0; i < listTill.size(); i++) {

            List<WebElement> list = driver.findElements(By.className("qa-wallets"));

            String walletName = list.get(i).getText();
            list.get(i).click();

            String walletAddress = "walletAddress";

            if (walletName.equals("Metamask") || walletName.equals("Exodus") || walletName.equals("Tron Wallet"))
            {
                try {
                    addPortfolio.clickOnBack();
                } catch (Exception ee) {
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
                String walletError = addPortfolio.getWalletError();
                System.out.println(walletName + " - invalid format - " + walletError);
            }

                try {
                    addPortfolio.clickOnBack();
                } catch (Exception ee) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".icon-back")));
                }
                continue;
        }

        // Invalid address
        for (int i = 0; i < listTill.size(); i++) {

            List<WebElement> list = driver.findElements(By.className("qa-wallets"));

            String walletName = list.get(i).getText();
            list.get(i).click();

            String walletAddress = "1xL22vTR5kCEfuRpaon38UsiT26KY8D";

            if (walletName.equals("Metamask") || walletName.equals("Exodus") || walletName.equals("Tron Wallet"))
            {
                try {
                    addPortfolio.clickOnBack();
                } catch (Exception ee) {
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
                String walletError = addPortfolio.getWalletError();
                System.out.println(walletName + " - invalid adress - " + walletError);
            }

            try {
                addPortfolio.clickOnBack();
            } catch (Exception ee) {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".icon-back")));
            }
            continue;
        }
    }
}
