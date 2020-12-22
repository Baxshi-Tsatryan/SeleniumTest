package Tests.AddPortfoliosTests;

import AllPages.PortfolioPage.AddTransactions;
import AllPages.PortfolioPage.LeftSideOfPagePortfolios;
import AllPages.PortfolioPage.PortfolioPageWhenNotLogin;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.Paths;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.IOException;

public class TestClass extends Driver{

    AddTransactions addTransactions;
    LeftSideOfPagePortfolios leftSideOfPagePortfolios;
    AllURLs allURLs;
    SeleniumUtils utils;
    Paths paths;
    PortfolioPageWhenNotLogin portfolioPageWhenNotLogin;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        addTransactions = new AddTransactions(driver);
        leftSideOfPagePortfolios = new LeftSideOfPagePortfolios(driver);
        paths = new Paths(driver);
        portfolioPageWhenNotLogin = new PortfolioPageWhenNotLogin(driver);
    }

    @Test(priority = 1)
    public void addAllExchangesCSVPositive() throws InterruptedException, IOException {

        allURLs.navigateToPortfolioPage();
        utils.enableCookie();

        addTransactions.clickOnAddTransactions();
        addTransactions.clickOnAnyCoinResult("ZoZoCoin");

        Thread.sleep(3000);

    }
}