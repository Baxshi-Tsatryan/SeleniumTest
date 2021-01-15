package AllPages;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetStarted {

    WebDriver driver;
    SeleniumUtils utils;

    public GetStarted(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    By loginButton = By.cssSelector(".login-button");

    By getStartedButton = By.cssSelector(".primary[type='button']");


    // Get Started page

    By loginWithCoinbase = By.cssSelector(".jsx-3897312982");

    By signUpWithEmail = By.cssSelector("a[href='/en/sign-up/'] > .jsx-1426819953");

    By twitter = By.cssSelector("i.icon-twitter");

    By facebook = By.cssSelector("i.icon-facebook");

    By google = By.id("googleLoginBtn");

    By apple = By.cssSelector(".apple");

    By login = By.cssSelector("a.table-row");

    By termsOfUse = By.cssSelector("a[href='/terms.html']");

    By privacyPolicy = By.cssSelector("a[href='/privacy.html']");


    // Sign Up with Email page

    By emailSignUp = By.name("email");

    By passwordSignUp = By.name("password");

    By passwordEye = By.cssSelector(".icon-hide");

    By errorMessageSignUp = By.cssSelector("div.text-down > .jsx-3533834788");

    By firstPasswordIndicatorSignUp = By.cssSelector("div.strength-bar > div:nth-of-type(1) > .jsx-2192721998");

    By secondPasswordIndicatorSignUp = By.cssSelector("div.strength-bar > div:nth-of-type(2) > .jsx-2192721998");

    By thirdPasswordIndicatorSignUp = By.cssSelector("div.strength-bar > div:nth-of-type(3) > .jsx-2192721998");

    By enableCaptcha = By.cssSelector(".recaptcha-checkbox-border");

    By createAccountButton = By.cssSelector("button[type='submit']");

    By loginButtonSignUp = By.cssSelector("a.table-row");


    // Login page

    By emailLogin = By.name("email");

    By passwordLogin = By.name("password");

    By enableCaptchaLogin = By.cssSelector(".recaptcha-checkbox-border");

    By emailErrorMessage = By.cssSelector("div.inputs-section > div:nth-of-type(1) > .jsx-3568230944 > .jsx-3568230944");

    By passwordErrorMessage = By.cssSelector("div.inputs-section > div:nth-of-type(2) > .jsx-3568230944 > .jsx-3568230944");

    By generalErrorMessage = By.cssSelector("div.wrong-error > .jsx-3568230944 > .jsx-3568230944");

    By loginButtonLoginPage = By.cssSelector(".login-btn");

    By forgotPassword = By.cssSelector(".forgot-password");

    By coinbaseLogin = By.cssSelector(".coinbase");

    By twitterLogin = By.cssSelector(".twitter");

    By facebookLogin = By.cssSelector(".facebook");

    By googleLogin = By.id("googleLoginBtn");

    By appleLogin = By.cssSelector(".apple");

    By createAccountButtonLoginPage = By.cssSelector("a.table-row");


    // Forgot Password page

    By emailForgotPassword = By.name("email");

    By errorMessageForgotPassword = By.cssSelector("div.text-down > .jsx-657614916");

    By enableCaptchaForgotPassword = By.cssSelector(".recaptcha-checkbox-border");

    By recoverPasswordButton = By.cssSelector("button[type='submit']");

    By createAccountForgotPasswordPage = By.cssSelector("a.table-row");



    // ----------------------------------------------------- Methods ------------------------------------------------------

    public void clickOnGeneralLogin()
    {
        utils.clickOnElement(loginButton);
    }

    public Boolean generalLoginIsDisplayed()
    {
        return utils.isDisplayed(loginButton);
    }

    public void clickOnGetStarted()
    {
        utils.clickOnElement(getStartedButton);
    }

    public Boolean getStartedIsDisplayed()
    {
        return utils.isDisplayed(getStartedButton);
    }


    // Get Started page

    public void clickOnLoginWithCoinbase()
    {
        utils.clickOnElement(loginWithCoinbase);
    }

    public void clickOnSignUpWithEmail()
    {
        utils.clickOnElement(signUpWithEmail);
    }

    public void clickOnTwitter()
    {
        utils.clickOnElement(twitter);
    }

    public void clickOnFacebook()
    {
        utils.clickOnElement(facebook);
    }

    public void clickOnGoogle()
    {
        utils.clickOnElement(google);
    }

    public void clickOnApple()
    {
        utils.clickOnElement(apple);
    }

    public void clickOnLogin()
    {
        utils.clickOnElement(login);
    }

    public void clickOnTermsOfUse()
    {
        utils.clickOnElement(termsOfUse);
    }

    public void clickOnPrivacyPolicy()
    {
        utils.clickOnElement(privacyPolicy);
    }


    // Sign Up with Email page

    public void typeEmailSignUp(String email)
    {
        utils.sendKeysAction(emailSignUp, email);
    }

    public void clearEmailSignUp()
    {
        utils.clear(emailSignUp);
    }

    public String getEmailSignUp()
    {
        return utils.getText(emailSignUp);
    }

    public void typePasswordSignUp(String password)
    {
        utils.sendKeysAction(passwordSignUp, password);
    }

    public void clearPasswordSignUp()
    {
        utils.clear(passwordSignUp);
    }

    public String getPasswordSignUp()
    {
        return utils.getText(passwordSignUp);
    }

    public void clickOnPasswordEyeSignUp()
    {
        utils.clickOnElement(passwordEye);
    }

    public Boolean errorMessageSignUpIsDisplayed()
    {
        return utils.isDisplayed(errorMessageSignUp);
    }

    public String getErrorMessageSignUp()
    {
        return utils.getText(errorMessageSignUp);
    }

    public String getFirstPasswordIndicatorColorSignUp()
    {
        return utils.getCSSValue(firstPasswordIndicatorSignUp, "color");
    }

    public String getSecondPasswordIndicatorColorSignUp()
    {
        return utils.getCSSValue(secondPasswordIndicatorSignUp, "color");
    }

    public String getThirdPasswordIndicatorColorSignUp()
    {
        return utils.getCSSValue(thirdPasswordIndicatorSignUp, "color");
    }

    public void clickOnEnableCaptcha()
    {
        utils.clickOnElement(enableCaptcha);
    }

    public void clickOnCreateAccountSignUp()
    {
        utils.clickOnElement(createAccountButton);
    }

    public void clickOnLoginSignUp()
    {
        utils.clickOnElement(loginButtonSignUp);
    }


    // Login page

    public void typeEmailLogin(String email)
    {
        utils.sendKeysAction(emailLogin, email);
    }

    public void clearEmailLogin()
    {
        utils.clear(emailLogin);
    }

    public String getEmailLogin()
    {
        return utils.getText(emailLogin);
    }

    public Boolean errorMessageEmailLoginIsDisplayed()
    {
        return utils.isDisplayed(emailErrorMessage);
    }

    public String getErrorMessageEmailLogin()
    {
        return utils.getText(emailErrorMessage);
    }

    public void typePasswordLogin(String password)
    {
        utils.sendKeysAction(passwordLogin, password);
    }

    public void clearPasswordLogin()
    {
        utils.clear(passwordLogin);
    }

    public String getPasswordLogin()
    {
        return utils.getText(passwordLogin);
    }

    public Boolean errorMessagePasswordLoginIsDisplayed()
    {
        return utils.isDisplayed(passwordErrorMessage);
    }

    public String getErrorMessagePasswordLogin()
    {
        return utils.getText(passwordErrorMessage);
    }

    public void clickOnEnableCaptchaLogin()
    {
        utils.clickOnElement(enableCaptchaLogin);
    }

    public void clickOnLoginButton()
    {
        utils.clickOnElement(loginButtonLoginPage);
    }

    public void clickOnForgotPassword()
    {
        utils.clickOnElement(forgotPassword);
    }

    public void clickOnCoinbaseLogin()
    {
        utils.clickOnElement(coinbaseLogin);
    }

    public void clickOnTwitterLogin()
    {
        utils.clickOnElement(twitterLogin);
    }

    public void clickOnFacebookLogin()
    {
        utils.clickOnElement(facebookLogin);
    }

    public void clickOnGoogleLogin()
    {
        utils.clickOnElement(googleLogin);
    }

    public void clickOnAppleLogin()
    {
        utils.clickOnElement(appleLogin);
    }

    public void clickOnCreateAccountLogin()
    {
        utils.clickOnElement(createAccountButtonLoginPage);
    }

    public String getGeneralErrorMessageLogin()
    {
        return utils.getText(generalErrorMessage);
    }


    // Forgot Password page

    public void typeEmailForgotPassword(String email)
    {
        utils.sendKeysAction(emailForgotPassword, email);
    }

    public void clearEmailForgotPassword()
    {
        utils.clear(emailForgotPassword);
    }

    public String getEmailForgotPassword()
    {
        return utils.getText(emailForgotPassword);
    }

    public Boolean errorMessageForgotPasswordIsDisplayed()
    {
        return utils.isDisplayed(errorMessageForgotPassword);
    }

    public String getErrorMessageForgotPassword()
    {
        return utils.getText(errorMessageForgotPassword);
    }

    public void clickOnEnableCaptchaForgotPassword()
    {
        utils.clickOnElement(enableCaptchaForgotPassword);
    }

    public void clickOnRecoverPassword()
    {
        utils.clickOnElement(recoverPasswordButton);
    }

    public void clickOnCreateAccountForgotPasswordPage()
    {
        utils.clickOnElement(createAccountForgotPasswordPage);
    }

}
