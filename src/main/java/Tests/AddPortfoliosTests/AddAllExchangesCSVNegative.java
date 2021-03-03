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

    @Test (priority = 1)
    public void addAllExchangesNegative() throws InterruptedException {

        allURLs.navigateToPortfolioPage();
        utils.enableCookie();

        Thread.sleep(3000);
        addPortfolio.clickOnAddPortfolio();
        addPortfolio.clickOnConnectExchange();

        List<WebElement> listTill = driver.findElements(By.className("qa-exchanges"));

        // Invalid CSV
        for (int i = 0; i < listTill.size(); i++) {

            List<WebElement> list = driver.findElements(By.className("qa-exchanges"));

            String exchangeName = list.get(i).getText();
            list.get(i).click();

            if (exchangeName.equals("Crypto.com app"))
            {
                WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                importButton.sendKeys(paths.getBittrexCSV());
                Thread.sleep(3000);

                if(addPortfolio.invalidCSVErrorMessageIsDisplayed() == true) {
                    String errorCSV = addPortfolio.getInvalidCSVErrorMessage();

                    System.err.println(exchangeName + " negative case passed");
                    System.out.println(exchangeName + " invalid CSV" + " - " + errorCSV);
                    System.out.println();
                }

                else
                {
                    System.out.println(exchangeName + " negative case failed");
                }

                addPortfolio.clickOnBack();
                continue;
            }

            else if (exchangeName.equals("Nexo (beta)") || exchangeName.equals("Nexo"))
            {
                WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                importButton.sendKeys(paths.getBittrexCSV());
                Thread.sleep(3000);

                if(addPortfolio.invalidCSVErrorMessageIsDisplayed() == true) {
                    String errorCSV = addPortfolio.getInvalidCSVErrorMessage();

                    System.err.println(exchangeName + " negative case passed");
                    System.out.println(exchangeName + " invalid CSV" + " - " + errorCSV);
                    System.out.println();
                }

                else
                {
                    System.out.println(exchangeName + " negative case failed");
                }

                addPortfolio.clickOnBack();
                continue;
            }

            else if (exchangeName.equals("BlockFi (beta)") || exchangeName.equals("BlockFi"))
            {
                WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                importButton.sendKeys(paths.getCoinStatsTemplateCSV());
                Thread.sleep(3000);

                if(addPortfolio.invalidCSVErrorMessageIsDisplayed() == true) {
                    String errorCSV = addPortfolio.getInvalidCSVErrorMessage();

                    System.err.println(exchangeName + " negative case passed");
                    System.out.println(exchangeName + " invalid CSV" + " - " + errorCSV);
                    System.out.println();
                }

                else
                {
                    System.out.println(exchangeName + " negative case failed");
                }

                addPortfolio.clickOnBack();
                continue;
            }

            else if (exchangeName.equals("Bittrex"))
            {
                addPortfolio.clickOnCSVTab();
                WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                importButton.sendKeys(paths.getCoinStatsTemplateCSV());
                Thread.sleep(3000);

                if(addPortfolio.invalidCSVErrorMessageIsDisplayed() == true) {
                    String errorCSV = addPortfolio.getInvalidCSVErrorMessage();

                    System.err.println(exchangeName + " negative case passed");
                    System.out.println(exchangeName + " invalid CSV" + " - " + errorCSV);
                    System.out.println();
                }

                else
                {
                    System.out.println(exchangeName + " negative case failed");
                }

                addPortfolio.clickOnBack();
                continue;
            }

            else if (exchangeName.equals("Bybit") || exchangeName.equals("Currency.com") || exchangeName.equals("FTX")
                    || exchangeName.equals("Nexo (beta)") || exchangeName.equals("Nexo") || exchangeName.equals("Bitrue")
                    || exchangeName.equals("BlockFi (beta)") || exchangeName.equals("BlockFi"))
            {
                addPortfolio.clickOnBack();
                continue;
            }

            else
                {
                addPortfolio.clickOnCSVTab();
                WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                importButton.sendKeys(paths.getCryptoComCSV1());
                Thread.sleep(3000);

                if(addPortfolio.invalidCSVErrorMessageIsDisplayed() == true) {
                    String errorCSV = addPortfolio.getInvalidCSVErrorMessage();

                    System.err.println(exchangeName + " negative case passed");
                    System.out.println(exchangeName + " invalid CSV" + " - " + errorCSV);
                    System.out.println();
                }

                else
                {
                    System.out.println(exchangeName + " negative case failed");
                }

                addPortfolio.clickOnBack();

            }
        }

        }
    }