package Tests.AddPortfoliosTests;

import AllPages.PortfolioPage.AddPortfolio;
import AllPages.PortfolioPage.LeftSideOfPagePortfolios;
import AllPages.PortfolioPage.PortfolioPageWhenNotLogin;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.Paths;
import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class TestCSVPositive extends Driver {

    AddPortfolio addPortfolio;
    LeftSideOfPagePortfolios leftSideOfPagePortfolios;
    AllURLs allURLs;
    SeleniumUtils utils;
    Paths paths;
    PortfolioPageWhenNotLogin portfolioPageWhenNotLogin;
    DeleteAllPortfolios deleteAllPortfolios;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        addPortfolio = new AddPortfolio(driver);
        leftSideOfPagePortfolios = new LeftSideOfPagePortfolios(driver);
        paths = new Paths(driver);
        portfolioPageWhenNotLogin = new PortfolioPageWhenNotLogin(driver);
        deleteAllPortfolios = new DeleteAllPortfolios(driver);
    }

    @Test
    public void addAllExchangesPositive() throws InterruptedException {

        allURLs.navigateToPortfolioPage();
        utils.enableCookie();

        deleteAllPortfolios.deleteAllPortfolios();

        addPortfolio
                .clickOnAddPortfolio()
                .clickOnConnectExchange();

        List<WebElement> listTill = driver.findElements(By.className("qa-exchanges"));

        for (int i = 28; i < listTill.size(); i++) {

            List<WebElement> list = driver.findElements(By.className("qa-exchanges"));

            Thread.sleep(1000);
            String exchangeName = list.get(i).getText();
            list.get(i).click();

            if (exchangeName.equals("Crypto.com app")) {
                for (int j = 0; j <= 3; j++) {
                    WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                    importButton.sendKeys(paths.getAllCryptoComCSVs(j));

                    if (afterCSVUploading(exchangeName) == false) {
                        addPortfolio.clickOnBack();
                        List<WebElement> listC = driver.findElements(By.className("qa-exchanges"));
                        listC.get(i).click();
                        continue;
                    } else {
                        System.out.println(exchangeName + " " + j  + " th exchange CSV passed");
                    }

                    if (j == 3)
                        break;

                    List<WebElement> listC = driver.findElements(By.className("qa-exchanges"));
                    listC.get(i).click();
                }
            } else if (exchangeName.equals("Nexo (beta)") || exchangeName.equals("Nexo")) {
                for (int j = 0; j <= 6; j++) {
                    WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                    importButton.sendKeys(paths.getAllNexoCSVs(j));

                    if (afterCSVUploading(exchangeName) == false) {
                        addPortfolio.clickOnBack();
                        List<WebElement> listN = driver.findElements(By.className("qa-exchanges"));
                        listN.get(i).click();
                        continue;
                    } else {
                        System.out.println(exchangeName + " " +  j + " th exchange CSV passed");
                    }

                    if(j==6)
                        break;

                    List<WebElement> listN = driver.findElements(By.className("qa-exchanges"));
                    listN.get(i).click();

                }
            } else if (exchangeName.equals("BlockFi (beta)") || exchangeName.equals("BlockFi")) {
                for (int j = 0; j <= 1; j++) {
                    WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                    importButton.sendKeys(paths.getAllBlockFiCSVs(j));

                    if (afterCSVUploading(exchangeName) == false) {
                        addPortfolio.clickOnBack();
                        List<WebElement> listB = driver.findElements(By.className("qa-exchanges"));
                        listB.get(i).click();
                        continue;
                    } else {
                        System.out.println(exchangeName + " " + j + " th exchange CSV passed");
                    }

                    if(j==1)
                        break;

                    List<WebElement> listB = driver.findElements(By.className("qa-exchanges"));
                    listB.get(i).click();

                }
            } else if (exchangeName.equals("Bittrex")) {
                addPortfolio.clickOnCSVTab();
                WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                importButton.sendKeys(paths.getBittrexCSV());

                if (afterCSVUploading(exchangeName) == false) {
                    addPortfolio.clickOnBack();
                    List<WebElement> listB = driver.findElements(By.className("qa-exchanges"));
                    listB.get(i).click();
                    continue;
                } else {
                    System.out.println(exchangeName + " exchange CSV passed");
                }
            } else if (exchangeName.equals("Bybit") || exchangeName.equals("Currency.com") || exchangeName.equals("FTX") || exchangeName.equals("Bitrue") || exchangeName.equals("Bitbuy") || exchangeName.equals("Bitpanda Pro")) {
                addPortfolio.clickOnBack();
                continue;
            } else {
                addPortfolio.clickOnCSVTab();
                WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                importButton.sendKeys(paths.getCoinStatsTemplateCSV());

                if (afterCSVUploading(exchangeName) == false) {
                    addPortfolio.clickOnBack();
                    List<WebElement> listA = driver.findElements(By.className("qa-exchanges"));
                    listA.get(i).click();
                    continue;
                } else {
                    System.out.println(exchangeName + " exchange CSV passed");
                }
            }
        }

        utils.refreshPage();
        deleteAllPortfolios.deleteAllPortfolios();
    }

    public Boolean afterCSVUploading(String exchangeName) {

        try {
            addPortfolio.clickOnSubmit();
        } catch (Exception e)
        {
            return false;
        }

        if (addPortfolio.noShowMeSyncedIsDisplayed() == true) {
            addPortfolio.clickOnNoShowMeSynced();
        } else {
            System.err.println(exchangeName + " No Show Me Synced doesn't appear (CSV doesn't work correctly)");
            return false;
        }

//        List<WebElement> list2 = driver.findElements(By.className("qa-portfolios"));
//        int addedExchangeSize = list2.size() - 1;

//        if (!exchangeName.equals(addedExchangeName)) {
//            System.err.println(exchangeName + " exchange CSV (name is invalid) doesn't add");
//        }

        addPortfolio.clickOnAddPortfolio();
        addPortfolio.clickOnConnectExchange();

        return true;
    }
}