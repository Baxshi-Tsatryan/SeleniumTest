package Chrome.TestPackage;

import Chrome.AllPages.MainPage.Header;
import Chrome.AllPages.PortfolioPage.AddPortfolio;
import Chrome.MainPackage.AllURLs;
import Chrome.MainPackage.ChromeDriver;
import Chrome.MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass extends ChromeDriver {

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
