package PagesTests;

import AllPages.Pricing;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class PricingTest extends Driver {

    AllURLs allURLs;
    Pricing pricing;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        pricing = new Pricing(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test
    public void pricingPage()
    {

        allURLs.navigateToPricingPage();
        // pricing.clickOnMonthlyAnnualSwitcher();
        // pricing.clickOnMonthlyAnnualSwitcher();
        pricing.getPricePRO();
        pricing.getPricePremium();
        pricing.clickOniOSLinkPRO();
        ArrayList<String> tabs0 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs0.get(1));
        driver.close();
        driver.switchTo().window(tabs0.get(0));

        pricing.clickOnAndroidLinkPRO();
        ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        driver.close();
        driver.switchTo().window(tabs1.get(0));

        pricing.clickOniOSLinkPremium();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));

        pricing.clickOnAndroidLinkPremium();
        ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(1));
        driver.close();
        driver.switchTo().window(tabs3.get(0));

        pricing.clickOnStartFreeTrialPRO();
        allURLs.navigateToPricingPage();
        pricing.clickOnStartFreeTrialPremium();
        allURLs.navigateToPricingPage();
        pricing.clickOnContactUSBottom();
        pricing.clickOnContactUSCommunity();
        pricing.clickOnPromoCodePRO();
        pricing.typePromoCode("asd");
        pricing.clickOnCopy();
        pricing.clickOnSubmitPromoCode();
        pricing.getPromoCodeErrorMessage();
        allURLs.navigateToPricingPage();
        pricing.clickOnPromoCodePremium();


    }

}
