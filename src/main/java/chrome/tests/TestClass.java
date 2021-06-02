package chrome.tests;

import chrome.allPages.portfolioPage.AddPortfolioModal;
import chrome.allPages.portfolioPage.GeneralPortfolioHoldingsLiquidity;
import chrome.mainPackage.AllURLs;
import chrome.mainPackage.Driver;
import chrome.mainPackage.Paths;
import chrome.mainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass extends Driver {

    AllURLs allURLs;
    SeleniumUtils utils;
    Paths paths;
    AddPortfolioModal addPortfolio;
    GeneralPortfolioHoldingsLiquidity generalPortfolioHoldingsLiquidity;

    @BeforeClass
    public void beforeClass() {

        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        paths = new Paths(driver);
        addPortfolio = new AddPortfolioModal(driver);
        generalPortfolioHoldingsLiquidity = new GeneralPortfolioHoldingsLiquidity(driver);
    }

    @Test
    public void test(){

        allURLs.navigateToPortfolioPage();
        generalPortfolioHoldingsLiquidity.clickOnTabs("Holdings");
    }
}
