package Tests.AddPortfoliosTests;

import AllPages.PortfolioPage.AddPortfolio;
import AllPages.PortfolioPage.LeftSideOfPagePortfolios;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.Paths;
import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddAllExchangesCSVPositive extends Driver{

    AddPortfolio addPortfolio;
    LeftSideOfPagePortfolios leftSideOfPagePortfolios;
    AllURLs allURLs;
    SeleniumUtils utils;
    Paths paths;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        addPortfolio = new AddPortfolio(driver);
        leftSideOfPagePortfolios = new LeftSideOfPagePortfolios(driver);
        paths = new Paths(driver);
    }


    @Test (priority = 1)
    public void addAllExchangesCSVPositive() throws InterruptedException {

        allURLs.navigateToPortfolioPage();
        utils.enableCookie();

        int index = 1;

        do
        {
            if (index == 5)
            {
                addCryptoComApp(index);
                index++;
            }
            else if (index == 12)
            {
                addBittrex(index);
                index++;
            }
            else if (index == 13 || index == 15 || index == 17)
            {
                index++;
            }

            addStandardPortfolios(index);

        }
        while(index != 27);

    }

    public void addStandardPortfolios(int index)
    {
      //  try
      //  {
      //      driver.findElement(By.cssSelector("#onesignal-slidedown-cancel-button")).click();
      //  }
      //  catch (NoSuchElementException e)
      //  {}

        addPortfolio.clickOnAddPortfolio();
        addPortfolio.clickOnConnectExchange();
        driver.findElement(By.cssSelector("ul.jsx-2489091780 > li:nth-of-type(" + index + ") > .table-row")).click();
        addPortfolio.clickOnCSVTab();
        addPortfolio.importCSVFile(paths.getCoinStatsTemplateCSV());
        addPortfolio.clickOnSubmit();
        addPortfolio.clickOnNoShowMeSynced();
    }

    public void addCryptoComApp(int index)
    {
        addPortfolio.clickOnAddPortfolio();
        addPortfolio.clickOnConnectExchange();
        driver.findElement(By.cssSelector("ul.jsx-2489091780 > li:nth-of-type(" + index + ") > .table-row")).click();
        addPortfolio.importCSVFile(paths.getCryptoComCSV());
        addPortfolio.clickOnSubmit();
        addPortfolio.clickOnNoShowMeSynced();
    }

    public void addBittrex(int index)
    {
        addPortfolio.clickOnAddPortfolio();
        addPortfolio.clickOnConnectExchange();
        driver.findElement(By.cssSelector("ul.jsx-2489091780 > li:nth-of-type(" + index + ") > .table-row")).click();
        addPortfolio.importCSVFile(paths.getBittrexCSV());
        addPortfolio.clickOnSubmit();
        addPortfolio.clickOnNoShowMeSynced();
    }

}
