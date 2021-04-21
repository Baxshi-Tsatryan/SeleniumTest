package Chrome.Tests.AddPortfoliosTests;

import Chrome.AllPages.DevServer;
import Chrome.AllPages.PortfolioPage.LeftSideOfPagePortfolios;
import Chrome.MainPackage.AllURLs;
import Chrome.MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class DeleteAllPortfolios {

    WebDriver driver;
    SeleniumUtils utils;
    LeftSideOfPagePortfolios leftSideOfPagePortfolios;
    AllURLs allURLs;
    DevServer devServer;

    public DeleteAllPortfolios(WebDriver driver) {
        this.driver = driver;
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        leftSideOfPagePortfolios = new LeftSideOfPagePortfolios(driver);
        devServer = new DevServer(driver);
    }

    public void deleteAllPortfolios() throws InterruptedException {

        // Prod
//        allURLs.navigateToPortfolioPage();
//        utils.enableCookie();

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
}
