package Tests.AddPortfoliosTests;

import AllPages.PortfolioPage.AddPortfolio;
import AllPages.PortfolioPage.LeftSideOfPagePortfolios;
import AllPages.PortfolioPage.PortfolioPageWhenNotLogin;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteAllPortfolios extends Driver {
    LeftSideOfPagePortfolios leftSideOfPagePortfolios;
    PortfolioPageWhenNotLogin portfolioPageWhenNotLogin;
    AddPortfolio addPortfolio;
    AllURLs allURLs;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        leftSideOfPagePortfolios = new LeftSideOfPagePortfolios(driver);
        portfolioPageWhenNotLogin = new PortfolioPageWhenNotLogin(driver);
        addPortfolio = new AddPortfolio(driver);
    }


    @Test
    public void deleteAllPortfolios() throws InterruptedException {
        allURLs.navigateToPortfolioPage();
        utils.enableCookie();

            while (true) {

                try {
                    leftSideOfPagePortfolios.moveToFirstPortfolioName();
                    leftSideOfPagePortfolios.clickOnFirstPortfolioDelete();
                    leftSideOfPagePortfolios.clickOnDeleteInDelete();
                    Thread.sleep(2000);
                }
                catch (NoSuchElementException e)
                {
                    break;
                }

            }

            portfolioPageWhenNotLogin.clickOnAddManualPortfolio();
            addPortfolio.typeManualPortfolioName("Test");
            addPortfolio.clickOnSaveButtonInManualPortfolio();

    }

    public void deleteSecondPortfolio()
    {
        leftSideOfPagePortfolios.moveToSecondPortfolioName();
        leftSideOfPagePortfolios.clickOnSecondPortfolioDelete();
        leftSideOfPagePortfolios.clickOnDeleteInDelete();
    }

}
