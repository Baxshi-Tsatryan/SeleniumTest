package Tests.AddPortfoliosTests;

import AllPages.PortfolioPage.AddPortfolio;
import AllPages.PortfolioPage.LeftSideOfPagePortfolios;
import MainPackage.*;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddAllExchangesPositive extends Driver {

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
    public void connectAllExchanges()
        {
            allURLs.navigateToPortfolioPage();
            utils.enableCookie();

            int index = 1;

            switch (index)
            {
                case 1:
                {
                    String apiKey = exchangesWalletsAPIs.getBinanceAPIKey();
                    String apiSecret = exchangesWalletsAPIs.getBinanceAPISecret();
                }

                case 2:
                {
                    String apiKey = exchangesWalletsAPIs.getBinanceUSAPIKey();
                    String apiSecret = exchangesWalletsAPIs.getBinanceUSAPISecret();
                }

                case 3:
                {

                }
            }


        }


        public void oneFieldExchanges(int index)
        {

        }

        public void twoFieldsExchanges(int index)
        {
            addPortfolio.clickOnAddPortfolio();
            addPortfolio.clickOnConnectExchange();
            driver.findElement(By.cssSelector("ul.jsx-2489091780 > li:nth-of-type(" + index + ") > .table-row")).click();


        }

        public void threeFieldsExchanges(int index)
        {

        }

}
