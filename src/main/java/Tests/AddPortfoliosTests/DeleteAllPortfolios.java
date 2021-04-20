package Tests.AddPortfoliosTests;

import AllPages.PortfolioPage.LeftSideOfPagePortfolios;
import MainPackage.AllURLs;
import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class DeleteAllPortfolios {

    WebDriver driver;
    SeleniumUtils utils;
    LeftSideOfPagePortfolios leftSideOfPagePortfolios;
    AllURLs allURLs;

    public DeleteAllPortfolios(WebDriver driver) {
        this.driver = driver;
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        leftSideOfPagePortfolios = new LeftSideOfPagePortfolios(driver);
    }

    public void deleteAllPortfolios() throws InterruptedException {

        List<WebElement> list = driver.findElements(By.className("qa-portfolios"));

        if (list.size() < 2) {
            return;
        }

        for (int i = 0; i < list.size() - 2; i++) {

            leftSideOfPagePortfolios.moveToSecondPortfolioName();
            Thread.sleep(1000);
            leftSideOfPagePortfolios.clickOnSecondPortfolioDelete();
            leftSideOfPagePortfolios.clickOnDeleteInDelete();
            Thread.sleep(3000);
        }
    }

    public void deleteAllPortfolios2(){

    }
}
