package chrome.tests.addPortfoliosTests;

import chrome.allPages.DevServer;
import chrome.allPages.portfolioPage.AddPortfolioModal;
import chrome.allPages.portfolioPage.LeftSideOfPagePortfolios;
import chrome.allPages.portfolioPage.PortfolioPageWhenNotLogin;
import chrome.mainPackage.AllURLs;
import chrome.mainPackage.Driver;
import chrome.mainPackage.Paths;
import chrome.mainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class AddAllExchangesCSVPositive extends Driver {

    AddPortfolioModal addPortfolio;
    LeftSideOfPagePortfolios leftSideOfPagePortfolios;
    AllURLs allURLs;
    SeleniumUtils utils;
    Paths paths;
    PortfolioPageWhenNotLogin portfolioPageWhenNotLogin;
    DeleteAllPortfolios deleteAllPortfolios;
    DevServer devServer;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        addPortfolio = new AddPortfolioModal(driver);
        leftSideOfPagePortfolios = new LeftSideOfPagePortfolios(driver);
        paths = new Paths(driver);
        portfolioPageWhenNotLogin = new PortfolioPageWhenNotLogin(driver);
        deleteAllPortfolios = new DeleteAllPortfolios(driver);
        devServer = new DevServer(driver);
    }

    @Test
    public void addAllExchangesPositive() throws InterruptedException {

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

        deleteAllPortfolios.deleteAllPortfolios();

        addPortfolio
                .clickOnAddPortfolio()
                .clickOnConnectExchange();

        List<WebElement> listTill = driver.findElements(By.className("qa-exchanges"));

        for (int i = 5; i < listTill.size(); i++) {

            List<WebElement> list = driver.findElements(By.className("qa-exchanges"));

            Thread.sleep(1000);
            String exchangeName = list.get(i).getText();
            list.get(i).click();

            switch (exchangeName) {

                case "Crypto.com app": {
                    for (int j = 0; j <= 3; j++) {
                        WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                        importButton.sendKeys(paths.getAllCryptoComCSVs(j));

                        if (afterCSVUploading(exchangeName) == false) {
                            System.out.println(exchangeName + " error - " + addPortfolio.getInvalidCSVErrorMessage());
                            addPortfolio.clickOnBack();
                            List<WebElement> listC = driver.findElements(By.className("qa-exchanges"));
                            listC.get(i).click();
                            continue;
                        } else {
                            System.out.println(exchangeName + " " + j + " th exchange CSV passed");
                        }

                        if (j == 3)
                            break;

                        List<WebElement> listC = driver.findElements(By.className("qa-exchanges"));
                        listC.get(i).click();
                    }
                }
                case "Nexo (beta)":
                case "Nexo": {
                    for (int j = 0; j <= 6; j++) {
                        WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                        importButton.sendKeys(paths.getAllNexoCSVs(j));

                        if (afterCSVUploading(exchangeName) == false) {
                            System.out.println(exchangeName + " error - " + addPortfolio.getInvalidCSVErrorMessage());
                            addPortfolio.clickOnBack();
                            List<WebElement> listN = driver.findElements(By.className("qa-exchanges"));
                            listN.get(i).click();
                            continue;
                        } else {
                            System.out.println(exchangeName + " " + j + " th exchange CSV passed");
                        }

                        if (j == 6)
                            break;

                        List<WebElement> listN = driver.findElements(By.className("qa-exchanges"));
                        listN.get(i).click();

                    }
                }
                case "BlockFi (beta)":
                case "BlockFi": {
                    for (int j = 0; j <= 1; j++) {
                        WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                        importButton.sendKeys(paths.getAllBlockFiCSVs(j));

                        if (afterCSVUploading(exchangeName) == false) {
                            System.out.println(exchangeName + " error - " + addPortfolio.getInvalidCSVErrorMessage());
                            addPortfolio.clickOnBack();
                            List<WebElement> listB = driver.findElements(By.className("qa-exchanges"));
                            listB.get(i).click();
                            continue;
                        } else {
                            System.out.println(exchangeName + " " + j + " th exchange CSV passed");
                        }

                        if (j == 1)
                            break;

                        List<WebElement> listB = driver.findElements(By.className("qa-exchanges"));
                        listB.get(i).click();

                    }
                }
                case "Bittrex": {
                    addPortfolio.clickOnCSVTab();
                    WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                    importButton.sendKeys(paths.getBittrexCSV());

                    if (afterCSVUploading(exchangeName) == false) {
                        System.out.println(exchangeName + " error - " + addPortfolio.getInvalidCSVErrorMessage());
                        addPortfolio.clickOnBack();
                        List<WebElement> listB = driver.findElements(By.className("qa-exchanges"));
                        listB.get(i).click();
                        continue;
                    } else {
                        System.out.println(exchangeName + " exchange CSV passed");
                    }
                }
                case "Bybit":
                case "Currency.com":
                case "FTX":
                case "Bitrue":
                case "Bitbuy":
                case "Bitpanda Pro": {
                    addPortfolio.clickOnBack();
                    continue;
                }
                default: {
                    addPortfolio.clickOnCSVTab();
                    WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                    importButton.sendKeys(paths.getCoinStatsTemplateCSV());

                    if (afterCSVUploading(exchangeName) == false) {
                        System.out.println(exchangeName + " error - " + addPortfolio.getInvalidCSVErrorMessage());
                        addPortfolio.clickOnBack();
                        List<WebElement> listA = driver.findElements(By.className("qa-exchanges"));
                        listA.get(i).click();
                        continue;
                    } else {
                        System.out.println(exchangeName + " exchange CSV passed");
                    }
                }
            }

        }

        utils.refreshPage();
        deleteAllPortfolios.deleteAllPortfolios();
    }

    public Boolean afterCSVUploading(String exchangeName) {

        try {
            addPortfolio.clickOnSubmit();
        } catch (Exception e) {
            return false;
        }

        if (addPortfolio.noShowMeSyncedIsDisplayed() == true) {
            addPortfolio.clickOnNoShowMeSynced();
        } else {
            System.err.println(exchangeName + " No Show Me Synced doesn't appear (CSV doesn't work correctly)");
            return false;
        }

        addPortfolio.clickOnAddPortfolio();
        addPortfolio.clickOnConnectExchange();

        return true;
    }


}