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

public class TestClass extends Driver {

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

        //deleteAllPortfolios();

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
                for(int j = 1; j <= 4; j++)
                {
                    WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                    importButton.sendKeys(paths.getAllCryptoComCSVs(j));

                    if (addPortfolio.invalidCSVErrorMessageIsDisplayed() == true)
                    {
                        System.err.println(exchangeName + " exchange CSV is Invalid");
                        addPortfolio.clickOnBack();
                        continue;
                    }

                    if (afterCSVUploading(exchangeName) == false)
                    {
                        addPortfolio.clickOnBack();
                        continue;
                    }

                }
            }

            else if (exchangeName.equals("Bittrex"))
            {
                addPortfolio.clickOnCSVTab();
                WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                importButton.sendKeys(paths.getBittrexCSV());

                if (addPortfolio.invalidCSVErrorMessageIsDisplayed() == true)
                {
                    System.err.println(exchangeName + " exchange CSV is Invalid");
                    addPortfolio.clickOnBack();
                    continue;
                }

                if (afterCSVUploading(exchangeName) == false)
                {
                    addPortfolio.clickOnBack();
                    continue;
                }
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

                if (addPortfolio.invalidCSVErrorMessageIsDisplayed() == true)
                {
                    System.err.println(exchangeName + " exchange CSV is Invalid");
                    addPortfolio.clickOnBack();
                    continue;
                }

                if (afterCSVUploading(exchangeName) == false)
                {
                    addPortfolio.clickOnBack();
                    continue;
                }
            }
        }

        deleteAllPortfolios();
    }

    public Boolean afterCSVUploading(String exchangeName) throws InterruptedException {

        Thread.sleep(3000);
        addPortfolio.clickOnSubmit();

        if (addPortfolio.invalidCSVErrorMessageIsDisplayed() == true)
        {
            System.err.println(exchangeName + " exchange CSV is Invalid");
            addPortfolio.clickOnBack();
            return false;
        }

        if (addPortfolio.noShowMeSyncedIsDisplayed() == true)
        {
            addPortfolio.clickOnNoShowMeSynced();
        }


        List<WebElement> list2 = driver.findElements(By.className("qa-portfolios"));
        String addedExchangeName = list2.get(list2.size() - 1)
                .getText().replace(" CSV", "");

        if (!exchangeName.equals(addedExchangeName))
        {
            System.err.println(exchangeName + " exchange CSV (name is invalid) doesn't add");
        }

        addPortfolio.clickOnAddPortfolio();
        addPortfolio.clickOnConnectExchange();

        return true;
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
