package TestPackage;

import AllPages.MainPage.Header;
import AllPages.PortfolioPage.AddPortfolio;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass extends Driver {

    AddPortfolio addPortfolio;
    Header header;
    AllURLs allURLs;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        addPortfolio = new AddPortfolio(driver);
        header = new Header (driver);
    }

    @Test
    public void testClass() throws InterruptedException {
        allURLs.navigateToMainPage();
        header.clickOnCurrenciesDropDown();
    }

}
