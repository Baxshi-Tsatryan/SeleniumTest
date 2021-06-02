package chrome.tests;

import chrome.allPages.Alerts;
import chrome.mainPackage.AllURLs;
import chrome.mainPackage.Driver;
import chrome.mainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckCustomAlerts extends Driver {

    AllURLs allURLs;
    SeleniumUtils utils;
    Alerts alerts;

    @BeforeClass
    public void beforeClass() {

        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        alerts = new Alerts(driver);
    }

    @Test
    public void checkMarketCapAlerts() throws InterruptedException {
        allURLs.navigateToAlertsPage();
        utils.enableCookie();

        // Dev
//        allURLs.navigateToDevMainPage();
//        devServer
//                .clickOnServerDropDown()
//                .clickOnDevServer();
//        allURLs.navigateToDevPortfolioPage();
//        utils.enableDevCookie();
//

        // Staging
//        allURLs.navigateToStagingPortfolioPage();
//        utils.enableStagingCookie();

        int index = 1;
        int index2 = 1;
        int randomNumber = (int) (Math.random() * 999 + 1);
        String randNum = Integer.toString(randomNumber);

        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                alerts.clickOnMarketCap();

                alerts.clickOnConditionDropDown();
                driver.findElement(By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(" + index + ") .table-row")).getText();
                utils.click(By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(" + index + ") .table-row"));

                alerts.clickOnAlertFrequencyDropDown();
                driver.findElement(By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(" + index2 + ") .table-row")).getText();
                utils.click(By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(" + index2 + ") .table-row"));

                alerts.typePrice(randNum);
                alerts.typeNote("AnyNote");
                alerts.clickOnSave();
                Thread.sleep(3000);

                index2++;
                j++;
            }
            index2 = 1;
            index++;
            i++;
        }
    }
}
