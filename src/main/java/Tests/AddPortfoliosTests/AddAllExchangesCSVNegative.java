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
        try {
            addPortfolio.clickOnAddPortfolio();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".primary")));
        }
        addPortfolio.clickOnConnectExchange();

        List<WebElement> listTill = driver.findElements(By.className("qa-exchanges"));

        // Invalid CSV
        for (int i = 0; i < listTill.size(); i++) {

            List<WebElement> list = driver.findElements(By.className("qa-exchanges"));

            String exchangeName = list.get(i).getText();
            list.get(i).click();

            if (exchangeName.equals("Crypto.com app")) {
                WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                importButton.sendKeys(paths.getBittrexCSV());
                Thread.sleep(3000);
                addPortfolio.clickOnSubmit();
                String errorCSV = addPortfolio.getInvalidCSVErrorMessage();

                System.out.println(exchangeName + " invalid CSV" + " - " + errorCSV);

                try {
                    addPortfolio.clickOnBack();
                } catch (Exception ee) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".icon-back")));
                }
                continue;
            }

            else if (exchangeName.equals("Bittrex"))
            {
                addPortfolio.clickOnCSVTab();
                WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                importButton.sendKeys(paths.getCoinStatsTemplateCSV());
                Thread.sleep(3000);
                addPortfolio.clickOnSubmit();
                String errorCSV = addPortfolio.getInvalidCSVErrorMessage();

                System.out.println(exchangeName + " invalid CSV" + " - " + errorCSV);

                try {
                    addPortfolio.clickOnBack();
                } catch (Exception ee) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".icon-back")));
                }
                continue;
            }

            else if (exchangeName.equals("Bybit") || exchangeName.equals("Currency.com") || exchangeName.equals("FTX") || exchangeName.equals("Nexo (beta)")) {
                addPortfolio.clickOnBack();
                continue;
            }

            else
                {
                addPortfolio.clickOnCSVTab();
                WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                importButton.sendKeys(paths.getCryptoComCSV());
                Thread.sleep(3000);
                addPortfolio.clickOnSubmit();
                String errorCSV = addPortfolio.getInvalidCSVErrorMessage();

                System.out.println(exchangeName + " invalid CSV" + " - " + errorCSV);

                try {
                    addPortfolio.clickOnBack();
                } catch (Exception ee) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".icon-back")));
                }
            }
        }

            // ZIP file
            for (int i = 0; i < listTill.size(); i++) {

                List<WebElement> list = driver.findElements(By.className("qa-exchanges"));

                String exchangeName = list.get(i).getText();
                list.get(i).click();


                if (exchangeName.equals("Bybit") || exchangeName.equals("Currency.com") || exchangeName.equals("FTX") || exchangeName.equals("Nexo (beta)") || exchangeName.equals("Crypto.com app")) {
                    addPortfolio.clickOnBack();
                    continue;
                }

                else
                    {
                    addPortfolio.clickOnCSVTab();
                    WebElement importButton = driver.findElement(By.cssSelector("input.jsx-2090407883"));
                    importButton.sendKeys(paths.getExodusZIP());
                    Thread.sleep(3000);
                    addPortfolio.clickOnSubmit();
                    String errorZIP = addPortfolio.getInvalidCSVErrorMessage();

                    System.out.println(exchangeName + " ZIP file" + " - " + errorZIP);
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
    }