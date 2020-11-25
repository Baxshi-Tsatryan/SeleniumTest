package PagesTests;

import AllPages.GetStarted;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class GetStartedTest extends Driver {

    GetStarted getStarted;
    AllURLs allURLs;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        getStarted = new GetStarted(driver);
        utils = new SeleniumUtils(driver);
    }

    @Test (priority = 1)
    public void getStartedPage() throws InterruptedException {

        allURLs.navigateToGetStartedPage();
        getStarted.clickOnLoginWithCoinbase();
        ArrayList<String> tabs0 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs0.get(1));
        driver.close();
        driver.switchTo().window(tabs0.get(0));

        getStarted.clickOnSignUpWithEmail();
        allURLs.navigateToGetStartedPage();
        getStarted.clickOnTwitter();
        ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        driver.close();
        driver.switchTo().window(tabs1.get(0));

        allURLs.navigateToGetStartedPage();
        getStarted.clickOnFacebook();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));

        allURLs.navigateToGetStartedPage();
        getStarted.clickOnGoogle();
        ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(1));
        driver.close();
        driver.switchTo().window(tabs3.get(0));

        allURLs.navigateToGetStartedPage();
        getStarted.clickOnApple();
        ArrayList<String> tabs4 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs4.get(1));
        driver.close();
        driver.switchTo().window(tabs4.get(0));

        allURLs.navigateToGetStartedPage();
        getStarted.clickOnLogin();
        allURLs.navigateToGetStartedPage();
        getStarted.clickOnTermsOfUse();
        ArrayList<String> tabs5 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs5.get(1));
        driver.close();
        driver.switchTo().window(tabs5.get(0));

        allURLs.navigateToGetStartedPage();
        getStarted.clickOnPrivacyPolicy();
        ArrayList<String> tabs6 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs6.get(1));
        driver.close();
        driver.switchTo().window(tabs6.get(0));

        allURLs.navigateToGetStartedPage();

    }

    @Test (priority = 2)
    public void signUpWithEmailPage()
    {
        allURLs.navigateToSignUpWithEmailPage();
        getStarted.typeEmailSignUp("asdasd");
        getStarted.clearEmailSignUp();
        getStarted.typePasswordSignUp("asssss");
        getStarted.clickOnPasswordEyeSignUp();
        getStarted.getFirstPasswordIndicatorColorSignUp();
        getStarted.getSecondPasswordIndicatorColorSignUp();
        getStarted.getThirdPasswordIndicatorColorSignUp();
        getStarted.clearPasswordSignUp();
        getStarted.clickOnCreateAccountSignUp();
        getStarted.getErrorMessageSignUp();
        getStarted.clickOnLoginSignUp();
    }

    @Test (priority = 3)
    public void loginPage()
    {

        allURLs.navigateToLoginWithEmailPage();
        getStarted.clickOnLoginButton();
        getStarted.getErrorMessageEmailLogin();
        getStarted.getErrorMessagePasswordLogin();
        getStarted.typeEmailLogin("asdasdsad");
        getStarted.clearEmailLogin();
        getStarted.typePasswordLogin("asdasdasd");
        getStarted.clickOnLoginButton();
        getStarted.getGeneralErrorMessageLogin();
        getStarted.clickOnCoinbaseLogin();
        ArrayList<String> tabs7 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs7.get(1));
        driver.close();
        driver.switchTo().window(tabs7.get(0));

        getStarted.clickOnTwitterLogin();
        ArrayList<String> tabs8 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs8.get(1));
        driver.close();
        driver.switchTo().window(tabs8.get(0));

        getStarted.clickOnFacebookLogin();
        ArrayList<String> tabs9 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs9.get(1));
        driver.close();
        driver.switchTo().window(tabs9.get(0));

        getStarted.clickOnGoogleLogin();
        ArrayList<String> tabs10 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs10.get(1));
        driver.close();
        driver.switchTo().window(tabs10.get(0));

        getStarted.clickOnAppleLogin();
        ArrayList<String> tabs11 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs11.get(1));
        driver.close();
        driver.switchTo().window(tabs11.get(0));

        getStarted.clickOnForgotPassword();
        allURLs.navigateToLoginWithEmailPage();
        getStarted.clickOnCreateAccountLogin();

    }

    @Test (priority = 4)
    public void forgotPasswordPage()
    {

        allURLs.navigateToForgotPasswordPage();
        getStarted.clickOnRecoverPassword();
        getStarted.getErrorMessageForgotPassword();
        getStarted.typeEmailForgotPassword("asdasd");
        getStarted.clickOnCreateAccountForgotPasswordPage();

    }


}
