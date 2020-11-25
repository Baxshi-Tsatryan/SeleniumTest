package AllPages;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PressKit {

    WebDriver driver;
    SeleniumUtils utils;

    public PressKit(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }


    // Logo Assets

    By logoForDarkBackgroundSVG = By.cssSelector("a[href='https://static.coinstats.app/presskit/logos/logo_darkbg.svg']");

    By logoForDarkBackgroundPNG = By.cssSelector("a[href='https://static.coinstats.app/presskit/logos/logo_darkbg.png']");

    By logoSymbolForDarkAndLightBackgroundSVG = By.cssSelector("div.press-kit-section div:nth-of-type(2) > .jsx-3318207212 > a:nth-of-type(1)");

    By logoSymbolForDarkAndLightBackgroundPNG = By.cssSelector("div.press-kit-section div:nth-of-type(2) a:nth-of-type(2)");

    By logoForLightBackgroundSVG = By.cssSelector("a[href='https://static.coinstats.app/presskit/logos/logo_lightbg.svg']");

    By logoForLightBackgroundPNG = By.cssSelector("a[href='https://static.coinstats.app/presskit/logos/logo_lightbg.png']");


    // Main Colors

    By copyMainColorForDarkBackground = By.cssSelector("div.press-kit-section div:nth-of-type(1) span:nth-of-type(2)");

    By copyMainColorForLightBackground = By.cssSelector("div.press-kit-section > .stands-wrapper > div:nth-of-type(2) span:nth-of-type(2)");


    // Banner & Brand Images

    By generalBannerLarge = By.cssSelector("a[href='https://static.coinstats.app/presskit/banners/general_2320x720.png']");

    By generalBannerMedium = By.cssSelector("a[href='https://static.coinstats.app/presskit/banners/general_1920x720.png']");

    By generalBannerSmall = By.cssSelector("a[href='https://static.coinstats.app/presskit/banners/general_608x608.png']");


    By portfolioBannerMedium = By.cssSelector("a[href='https://static.coinstats.app/presskit/banners/portfolio_300x250.png']");

    By portfolioBannerLarge = By.cssSelector("a[href='https://static.coinstats.app/presskit/banners/portfolio_415x255.png']");

    By portfolioBannerSmall = By.cssSelector("a[href='https://static.coinstats.app/presskit/banners/portfolio_760x94.png']");


    By appScreensFirst = By.cssSelector("a[href='https://static.coinstats.app/presskit/banners/appScreens_1024x512_1.png']");

    By appScreensSecond = By.cssSelector("a[href='https://static.coinstats.app/presskit/banners/appScreens_1024x512_2.png']");

    By appScreensThird = By.cssSelector("a[href='https://static.coinstats.app/presskit/banners/appScreens_1024x512_3.png']");



    // ---------------------------------------------- Methods --------------------------------------------------

    // Logo Assets

    public void clickOnLogoForDarkBackgroundSVG()
    {
        utils.clickOnElement(logoForDarkBackgroundSVG);
    }

    public void clickOnLogoForDarkBackgroundPNG()
    {
        utils.clickOnElement(logoForDarkBackgroundPNG);
    }

    public void clickOnLogoSymbolForDarkAndLightBackgroundSVG()
    {
        utils.clickOnElement(logoSymbolForDarkAndLightBackgroundSVG);
    }

    public void clickOnLogoSymbolForDarkAndLightBackgroundPNG()
    {
        utils.clickOnElement(logoSymbolForDarkAndLightBackgroundPNG);
    }

    public void clickOnLogoForLightBackgroundSVG()
    {
        utils.clickOnElement(logoForLightBackgroundSVG);
    }

    public void clickOnLogoForLightBackgroundPNG()
    {
        utils.clickOnElement(logoForLightBackgroundPNG);
    }


    // Main Colors

    public void clickOnCopyMainColorForDarkBackground()
    {
        utils.clickOnElement(copyMainColorForDarkBackground);
    }

    public void clickOnCopyMainColorForLightBackground()
    {
        utils.clickOnElement(copyMainColorForLightBackground);
    }


    // Banner & Brand Images

    public void clickOnGeneralLargeBanner()
    {
        utils.clickOnElement(generalBannerLarge);
    }

    public void clickOnGeneralMediumBanner()
    {
        utils.clickOnElement(generalBannerMedium);
    }

    public void clickOnGeneralSmallBanner()
    {
        utils.clickOnElement(generalBannerSmall);
    }


    public void clickOnPortfolioLargeBanner()
    {
        utils.clickOnElement(portfolioBannerLarge);
    }

    public void clickOnPortfolioMediumBanner()
    {
        utils.clickOnElement(portfolioBannerMedium);
    }

    public void clickOnPortfolioSmallBanner()
    {
        utils.clickOnElement(portfolioBannerSmall);
    }


    public void clickOnAppScreensFirstBanner()
    {
        utils.clickOnElement(appScreensFirst);
    }

    public void clickOnAppScreensSecondBanner()
    {
        utils.clickOnElement(appScreensSecond);
    }

    public void clickOnAppScreensThirdBanner() {
        utils.clickOnElement(appScreensThird);
    }

}
