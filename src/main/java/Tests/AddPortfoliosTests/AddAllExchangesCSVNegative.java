package Tests.AddPortfoliosTests;

import AllPages.PortfolioPage.AddPortfolio;
import AllPages.PortfolioPage.LeftSideOfPagePortfolios;
import AllPages.PortfolioPage.PortfolioPageWhenNotLogin;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.Paths;
import MainPackage.SeleniumUtils;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class AddAllExchangesCSVNegative extends Driver {

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

    @Test
    public void addAllExchangesNegative() throws InterruptedException {

        allURLs.navigateToPortfolioPage();
        utils.enableCookie();

        addPortfolio
                .clickOnAddPortfolio()
                .clickOnConnectExchange();

        List<WebElement> listTill = driver.findElements(By.className("qa-exchanges"));

        // Invalid CSV
        for (int i = 0; i < listTill.size(); i++) {

            List<WebElement> list = driver.findElements(By.className("qa-exchanges"));

            String exchangeName = list.get(i).getText();
            list.get(i).click();

            switch (exchangeName) {
                case "Crypto.com app":
                case "Nexo (beta)":
                case "Nexo":
                case "BlockFi (beta)":
                case "BlockFi:": {
                    WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                    importButton.sendKeys(paths.getCoinStatsTemplateCSV());

                    if (addPortfolio.invalidCSVErrorMessageIsDisplayed() == true) {
                        String errorCSV = addPortfolio.getInvalidCSVErrorMessage();

                        System.out.println(exchangeName + " negative case passed");
                        System.out.println(exchangeName + " invalid CSV" + " - " + errorCSV);
                        System.out.println();
                    } else {
                        System.err.println(exchangeName + " negative case failed");
                    }

                    addPortfolio.clickOnBack();
                    continue;
                }

                case "Bitbuy":
                case "Bybit":
                case "Bitrue":
                case "Bitpanda pro":
                case "Currency.com":
                case "FTX": {
                    addPortfolio.clickOnBack();
                    continue;
                }

                default: {
                    try {
                        addPortfolio.clickOnCSVTab();
                    }
                    catch (Exception e)
                    {
                        addPortfolio.clickOnBack();
                        continue;
                    }
                    WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                    importButton.sendKeys(paths.getCryptoComCSV1());

                    if (addPortfolio.invalidCSVErrorMessageIsDisplayed() == true) {
                        String errorCSV = addPortfolio.getInvalidCSVErrorMessage();

                        System.out.println(exchangeName + " negative case passed");
                        System.out.println(exchangeName + " invalid CSV" + " - " + errorCSV);
                        System.out.println();
                    } else {
                        System.err.println(exchangeName + " negative case failed");
                    }

                    addPortfolio.clickOnBack();

                }
            }
        }

    }
}