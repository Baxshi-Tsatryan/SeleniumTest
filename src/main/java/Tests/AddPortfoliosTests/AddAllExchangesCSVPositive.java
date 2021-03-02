package Tests.AddPortfoliosTests;

import AllPages.PortfolioPage.AddPortfolio;
import AllPages.PortfolioPage.LeftSideOfPagePortfolios;
import AllPages.PortfolioPage.PortfolioPageWhenNotLogin;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.Paths;
import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class AddAllExchangesCSVPositive extends Driver {

    AddPortfolio addPortfolio;
    LeftSideOfPagePortfolios leftSideOfPagePortfolios;
    AllURLs allURLs;
    SeleniumUtils utils;
    Paths paths;
    PortfolioPageWhenNotLogin portfolioPageWhenNotLogin;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        addPortfolio = new AddPortfolio(driver);
        leftSideOfPagePortfolios = new LeftSideOfPagePortfolios(driver);
        paths = new Paths(driver);
        portfolioPageWhenNotLogin = new PortfolioPageWhenNotLogin(driver);
    }

    @Test (priority = 1)
    public void addAllExchangesNegative() throws InterruptedException {

        allURLs.navigateToPortfolioPage();
        utils.enableCookie();

        deleteAllPortfolios();

        Thread.sleep(3000);
        addPortfolio.clickOnAddPortfolio();
        addPortfolio.clickOnConnectExchange();

        List<WebElement> listTill = driver.findElements(By.className("qa-exchanges"));

        for (int i = 0; i < listTill.size(); i++)
        {

            List<WebElement> list = driver.findElements(By.className("qa-exchanges"));

            String exchangeName = list.get(i).getText();
            list.get(i).click();

            if (exchangeName.equals("Crypto.com app"))
            {
                WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                importButton.sendKeys(paths.getCryptoComCSV1());
            }

            else if (exchangeName.equals("Bittrex"))
            {
                addPortfolio.clickOnCSVTab();
                WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                importButton.sendKeys(paths.getBittrexCSV());
            }

            else if (exchangeName.equals("Bybit") || exchangeName.equals("Currency.com") || exchangeName.equals("FTX") || exchangeName.equals("Nexo (beta)"))
            {
                addPortfolio.clickOnBack();
                continue;
            }

            else
            {
                addPortfolio.clickOnCSVTab();
                WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                importButton.sendKeys(paths.getCoinStatsTemplateCSV());
            }

            Thread.sleep(3000);
            addPortfolio.clickOnSubmit();
            try {
                addPortfolio.clickOnNoShowMeSynced();
            }
            catch (NoSuchElementException e)
            {
                System.err.println(exchangeName + " exchange CSV is Invalid or exception with Submit button");
                addPortfolio.clickOnBack();
                continue;
            }

            List<WebElement> list2 = driver.findElements(By.className("qa-portfolios"));
            String addedExchangeName = list2.get(list2.size() - 1)
                    .getText().replace(" CSV", "");

            if (!exchangeName.equals(addedExchangeName))
            {
                System.err.println(exchangeName + " exchange CSV is invalid");
            }

            addPortfolio.clickOnAddPortfolio();
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
