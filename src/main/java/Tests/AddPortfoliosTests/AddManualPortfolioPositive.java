package Tests.AddPortfoliosTests;

import AllPages.PortfolioPage.AddPortfolio;
import AllPages.PortfolioPage.LeftSideOfPagePortfolios;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddManualPortfolioPositive extends Driver {
    AddPortfolio addPortfolio;
    LeftSideOfPagePortfolios leftSideOfPagePortfolios;
    AllURLs allURLs;
    SeleniumUtils utils;
    DeleteAllPortfolios deleteAllPortfolios;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        addPortfolio = new AddPortfolio(driver);
        leftSideOfPagePortfolios = new LeftSideOfPagePortfolios(driver);
        deleteAllPortfolios = new DeleteAllPortfolios(driver);

    }

    @Test
    public void addManualPortfolioPositive() {
        allURLs.navigateToPortfolioPage();
        utils.enableCookie();

        addPortfolio.clickOnAddPortfolio();
        addPortfolio.clickOnAddManualPortfolio();
        addPortfolio.clickOnSaveButtonInManualPortfolio();
        utils.refreshPage();

        addPortfolio.clickOnAddPortfolio();
        addPortfolio.clickOnAddManualPortfolio();
        addPortfolio.typeManualPortfolioName("Name");
        addPortfolio.typeManualPortfolioTotalCost("100");
        addPortfolio.clickOnSaveButtonInManualPortfolio();
        utils.refreshPage();

        String addedPortfolioName = leftSideOfPagePortfolios.getSecondPortfolioName();
        Assert.assertEquals(addedPortfolioName, "Name");

    }
}