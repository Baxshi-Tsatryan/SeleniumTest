package chrome.tests.addPortfoliosTests;

import chrome.allPages.DevServer;
import chrome.allPages.portfolioPage.AddPortfolioModal;
import chrome.allPages.portfolioPage.LeftSideOfPagePortfolios;
import chrome.mainPackage.AllURLs;
import chrome.mainPackage.Driver;
import chrome.mainPackage.SeleniumUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddManualPortfolioPositive extends Driver {
    AddPortfolioModal addPortfolio;
    LeftSideOfPagePortfolios leftSideOfPagePortfolios;
    AllURLs allURLs;
    SeleniumUtils utils;
    DeleteAllPortfolios deleteAllPortfolios;
    DevServer devServer;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        addPortfolio = new AddPortfolioModal(driver);
        leftSideOfPagePortfolios = new LeftSideOfPagePortfolios(driver);
        deleteAllPortfolios = new DeleteAllPortfolios(driver);
        devServer = new DevServer(driver);

    }

    @Test
    public void addManualPortfolioPositive() {

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