package PagesTests;

import AllPages.PressKit;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PressKitTest extends Driver {

    AllURLs allURLs;
    PressKit pressKit;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        pressKit = new PressKit(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test
    public void pressKitPage()
    {
        allURLs.navigateToPressKitPage();

        // Logo Assets

        pressKit.clickOnLogoForDarkBackgroundPNG();
        utils.goToBackPage();
        pressKit.clickOnLogoForDarkBackgroundSVG();
        utils.goToBackPage();
        pressKit.clickOnLogoSymbolForDarkAndLightBackgroundPNG();
        utils.goToBackPage();
        pressKit.clickOnLogoSymbolForDarkAndLightBackgroundSVG();
        utils.goToBackPage();
        pressKit.clickOnLogoForLightBackgroundPNG();
        utils.goToBackPage();
        pressKit.clickOnLogoForLightBackgroundSVG();
        utils.goToBackPage();


        // Main Colors

        pressKit.clickOnCopyMainColorForDarkBackground();
        pressKit.clickOnCopyMainColorForLightBackground();

        // Banner & Brand Images

        pressKit.clickOnGeneralLargeBanner();
        utils.goToBackPage();
        pressKit.clickOnGeneralMediumBanner();
        utils.goToBackPage();
        pressKit.clickOnGeneralSmallBanner();
        utils.goToBackPage();
        pressKit.clickOnPortfolioLargeBanner();
        utils.goToBackPage();
        pressKit.clickOnPortfolioMediumBanner();
        utils.goToBackPage();
        pressKit.clickOnPortfolioSmallBanner();
        utils.goToBackPage();
        pressKit.clickOnAppScreensFirstBanner();
        utils.goToBackPage();
        pressKit.clickOnAppScreensSecondBanner();
        utils.goToBackPage();
        pressKit.clickOnAppScreensThirdBanner();
        utils.goToBackPage();


    }


}
