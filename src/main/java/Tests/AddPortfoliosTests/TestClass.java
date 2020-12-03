package Tests.AddPortfoliosTests;

import AllPages.PortfolioPage.AddPortfolio;
import AllPages.PortfolioPage.LeftSideOfPagePortfolios;
import AllPages.PortfolioPage.PortfolioPageWhenNotLogin;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.Paths;
import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class TestClass extends Driver{

    AddPortfolio addPortfolio;
    LeftSideOfPagePortfolios leftSideOfPagePortfolios;
    AllURLs allURLs;
    SeleniumUtils utils;
    Paths paths;
    PortfolioPageWhenNotLogin portfolioPageWhenNotLogin;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        addPortfolio = new AddPortfolio(driver);
        leftSideOfPagePortfolios = new LeftSideOfPagePortfolios(driver);
        paths = new Paths(driver);
        portfolioPageWhenNotLogin = new PortfolioPageWhenNotLogin(driver);
    }


    @Test(priority = 1)
    public void addAllExchangesCSVPositive() throws InterruptedException {

        allURLs.navigateToPortfolioPage();
        utils.enableCookie();

        List<WebElement> listTill = driver.findElements(By.className("qa-portfolios"));

        for (int i = 1; i < listTill.size(); i++)
        {
            List<WebElement> list = driver.findElements(By.className("qa-exchanges"));
            List<WebElement> listDelete = driver.findElements(By.className("icon-delete"));

            Thread.sleep(1000);
            utils.moveToElement((By) list.get(i));
            listDelete.get(i).click();
            leftSideOfPagePortfolios.clickOnDeleteInDelete();
        }

     //  while (true) {

     //      try {
     //          leftSideOfPagePortfolios.moveToFirstPortfolioName();
     //          leftSideOfPagePortfolios.clickOnFirstPortfolioDelete();
     //          leftSideOfPagePortfolios.clickOnDeleteInDelete();
     //          Thread.sleep(2000);
     //      }
     //      catch (NoSuchElementException e)
     //      {
     //          break;
     //      }

     //  }

     //  portfolioPageWhenNotLogin.clickOnAddManualPortfolio();
     //  addPortfolio.typeManualPortfolioName("Test");
     //  addPortfolio.clickOnSaveButtonInManualPortfolio();

    }

}