package chrome.allPages;

import chrome.mainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetStartedPages {

    WebDriver driver;
    SeleniumUtils utils;

    public GetStartedPages(WebDriver driver) {
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

    public GetStartedPages clickOnGeneralLogin() {
        utils.click(loginButton);
        return this;
    }

    public Boolean generalLoginIsDisplayed() {
        return utils.isDisplayed(loginButton);
    }

    public GetStartedPages clickOnGetStarted() {
        utils.click(getStartedButton);
        return this;
    }

    public Boolean getStartedIsDisplayed() {
        return utils.isDisplayed(getStartedButton);
    }


    // Get Started page

    public GetStartedPages clickOnLoginWithCoinbase() {
        utils.click(loginWithCoinbase);
        return this;
    }

    public GetStartedPages clickOnSignUpWithEmail() {
        utils.click(signUpWithEmail);
        return this;
    }

    public GetStartedPages clickOnTwitter() {
        utils.click(twitter);
        return this;
    }

    public GetStartedPages clickOnFacebook() {
        utils.click(facebook);
        return this;
    }

    public GetStartedPages clickOnGoogle() {
        utils.click(google);
        return this;
    }

    public GetStartedPages clickOnApple() {
        utils.click(apple);
        return this;
    }

    public GetStartedPages clickOnLogin() {
        utils.click(login);
        return this;
    }

    public GetStartedPages clickOnTermsOfUse() {
        utils.click(termsOfUse);
        return this;
    }

    public GetStartedPages clickOnPrivacyPolicy() {
        utils.click(privacyPolicy);
        return this;
    }


    // Sign Up with Email page

    public GetStartedPages typeEmailSignUp(String email) {
        utils.sendKeysAction(emailSignUp, email);
        return this;
    }

    public GetStartedPages clearEmailSignUp() {
        utils.clear(emailSignUp);
        return this;
    }

    public String getEmailSignUp() {
        return utils.getText(emailSignUp);
    }

    public GetStartedPages typePasswordSignUp(String password) {
        utils.sendKeysAction(passwordSignUp, password);
        return this;
    }

    public GetStartedPages clearPasswordSignUp() {
        utils.clear(passwordSignUp);
        return this;
    }

    public String getPasswordSignUp() {
        return utils.getText(passwordSignUp);
    }

    public GetStartedPages clickOnPasswordEyeSignUp() {
        utils.click(passwordEye);
        return this;
    }

    public Boolean errorMessageSignUpIsDisplayed() {
        return utils.isDisplayed(errorMessageSignUp);
    }

    public String getErrorMessageSignUp() {
        return utils.getText(errorMessageSignUp);
    }

    public String getFirstPasswordIndicatorColorSignUp() {
        return utils.getCSSValue(firstPasswordIndicatorSignUp, "color");
    }

    public String getSecondPasswordIndicatorColorSignUp() {
        return utils.getCSSValue(secondPasswordIndicatorSignUp, "color");
    }

    public String getThirdPasswordIndicatorColorSignUp() {
        return utils.getCSSValue(thirdPasswordIndicatorSignUp, "color");
    }

    public GetStartedPages clickOnEnableCaptcha() {
        utils.click(enableCaptcha);
        return this;
    }

    public GetStartedPages clickOnCreateAccountSignUp() {
        utils.click(createAccountButton);
        return this;
    }

    public GetStartedPages clickOnLoginSignUp() {
        utils.click(loginButtonSignUp);
        return this;
    }


    // Login page

    public GetStartedPages typeEmailLogin(String email) {
        utils.sendKeysAction(emailLogin, email);
        return this;
    }

    public GetStartedPages clearEmailLogin() {
        utils.clear(emailLogin);
        return this;
    }

    public String getEmailLogin() {
        return utils.getText(emailLogin);
    }

    public Boolean errorMessageEmailLoginIsDisplayed() {
        return utils.isDisplayed(emailErrorMessage);
    }

    public String getErrorMessageEmailLogin() {
        return utils.getText(emailErrorMessage);
    }

    public GetStartedPages typePasswordLogin(String password) {
        utils.sendKeysAction(passwordLogin, password);
        return this;
    }

    public GetStartedPages clearPasswordLogin() {
        utils.clear(passwordLogin);
        return this;
    }

    public String getPasswordLogin() {
        return utils.getText(passwordLogin);
    }

    public Boolean errorMessagePasswordLoginIsDisplayed() {
        return utils.isDisplayed(passwordErrorMessage);
    }

    public String getErrorMessagePasswordLogin() {
        return utils.getText(passwordErrorMessage);
    }

    public GetStartedPages clickOnEnableCaptchaLogin() {
        utils.click(enableCaptchaLogin);
        return this;
    }

    public GetStartedPages clickOnLoginButton() {
        utils.click(loginButtonLoginPage);
        return this;
    }

    public GetStartedPages clickOnForgotPassword() {
        utils.click(forgotPassword);
        return this;
    }

    public GetStartedPages clickOnCoinbaseLogin() {
        utils.click(coinbaseLogin);
        return this;
    }

    public GetStartedPages clickOnTwitterLogin() {
        utils.click(twitterLogin);
        return this;
    }

    public GetStartedPages clickOnFacebookLogin() {
        utils.click(facebookLogin);
        return this;
    }

    public GetStartedPages clickOnGoogleLogin() {
        utils.click(googleLogin);
        return this;
    }

    public GetStartedPages clickOnAppleLogin() {
        utils.click(appleLogin);
        return this;
    }

    public GetStartedPages clickOnCreateAccountLogin() {
        utils.click(createAccountButtonLoginPage);
        return this;
    }

    public String getGeneralErrorMessageLogin() {
        return utils.getText(generalErrorMessage);
    }


    // Forgot Password page

    public GetStartedPages typeEmailForgotPassword(String email) {
        utils.sendKeysAction(emailForgotPassword, email);
        return this;
    }

    public GetStartedPages clearEmailForgotPassword() {
        utils.clear(emailForgotPassword);
        return this;
    }

    public String getEmailForgotPassword() {
        return utils.getText(emailForgotPassword);
    }

    public Boolean errorMessageForgotPasswordIsDisplayed() {
        return utils.isDisplayed(errorMessageForgotPassword);
    }

    public String getErrorMessageForgotPassword() {
        return utils.getText(errorMessageForgotPassword);
    }

    public GetStartedPages clickOnEnableCaptchaForgotPassword() {
        utils.click(enableCaptchaForgotPassword);
        return this;
    }

    public GetStartedPages clickOnRecoverPassword() {
        utils.click(recoverPasswordButton);
        return this;
    }

    public GetStartedPages clickOnCreateAccountForgotPasswordPage() {
        utils.click(createAccountForgotPasswordPage);
        return this;
    }

}
