package Chrome.AllPages;

import Chrome.MainPackage.SeleniumUtils;
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

    public PressKit clickOnLogoForDarkBackgroundSVG() {
        utils.click(logoForDarkBackgroundSVG);
        return this;
    }

    public PressKit clickOnLogoForDarkBackgroundPNG() {
        utils.click(logoForDarkBackgroundPNG);
        return this;
    }

    public PressKit clickOnLogoSymbolForDarkAndLightBackgroundSVG() {
        utils.click(logoSymbolForDarkAndLightBackgroundSVG);
        return this;
    }

    public PressKit clickOnLogoSymbolForDarkAndLightBackgroundPNG() {
        utils.click(logoSymbolForDarkAndLightBackgroundPNG);
        return this;
    }

    public PressKit clickOnLogoForLightBackgroundSVG() {
        utils.click(logoForLightBackgroundSVG);
        return this;
    }

    public PressKit clickOnLogoForLightBackgroundPNG() {
        utils.click(logoForLightBackgroundPNG);
        return this;
    }


    // Main Colors

    public PressKit clickOnCopyMainColorForDarkBackground() {
        utils.click(copyMainColorForDarkBackground);
        return this;
    }

    public PressKit clickOnCopyMainColorForLightBackground() {
        utils.click(copyMainColorForLightBackground);
        return this;
    }


    // Banner & Brand Images

    public PressKit clickOnGeneralLargeBanner() {
        utils.click(generalBannerLarge);
        return this;
    }

    public PressKit clickOnGeneralMediumBanner() {
        utils.click(generalBannerMedium);
        return this;
    }

    public PressKit clickOnGeneralSmallBanner() {
        utils.click(generalBannerSmall);
        return this;
    }


    public PressKit clickOnPortfolioLargeBanner() {
        utils.click(portfolioBannerLarge);
        return this;
    }

    public PressKit clickOnPortfolioMediumBanner() {
        utils.click(portfolioBannerMedium);
        return this;
    }

    public PressKit clickOnPortfolioSmallBanner() {
        utils.click(portfolioBannerSmall);
        return this;
    }


    public PressKit clickOnAppScreensFirstBanner() {
        utils.click(appScreensFirst);
        return this;
    }

    public PressKit clickOnAppScreensSecondBanner() {
        utils.click(appScreensSecond);
        return this;
    }

    public PressKit clickOnAppScreensThirdBanner() {
        utils.click(appScreensThird);
        return this;
    }

}
