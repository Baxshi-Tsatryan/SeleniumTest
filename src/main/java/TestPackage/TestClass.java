package TestPackage;

import AllPages.PortfolioPage.AddPortfolio;
import AllPages.PortfolioPage.LeftSideOfPagePortfolios;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.Paths;
import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class TestClass extends Driver {
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

    @Test
    public void testClass()
    {
        allURLs.navigateToPortfolioPage();
        utils.enableCookie();

        addPortfolio.clickOnAddPortfolio();
        addPortfolio.clickOnConnectExchange();


        List<WebElement> list = driver.findElements(By.className("qa-exchanges"));

        for (WebElement webElement: list
             ) {

            int size = list.size();
            System.out.println(size);

        }


    }

}
