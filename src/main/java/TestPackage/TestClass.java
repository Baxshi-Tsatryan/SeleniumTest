package TestPackage;

import AllPages.PortfolioPage.GeneralPortfolioHoldingsLiquidity;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass extends Driver {

    GeneralPortfolioHoldingsLiquidity generalPortfolioHoldingsLiquidity;
    AllURLs allURLs;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        generalPortfolioHoldingsLiquidity = new GeneralPortfolioHoldingsLiquidity(driver);
    }

    @Test
    public void testClass()
    {
        allURLs.navigateToPortfolioPage();
        utils.enableCookie();

    }

}
