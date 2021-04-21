package Chrome.AllPages;

import Chrome.MainPackage.SeleniumUtils;
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

    public GetStarted clickOnGeneralLogin() {
        utils.click(loginButton);
        return this;
    }

    public Boolean generalLoginIsDisplayed() {
        return utils.isDisplayed(loginButton);
    }

    public GetStarted clickOnGetStarted() {
        utils.click(getStartedButton);
        return this;
    }

    public Boolean getStartedIsDisplayed() {
        return utils.isDisplayed(getStartedButton);
    }


    // Get Started page

    public GetStarted clickOnLoginWithCoinbase() {
        utils.click(loginWithCoinbase);
        return this;
    }

    public GetStarted clickOnSignUpWithEmail() {
        utils.click(signUpWithEmail);
        return this;
    }

    public GetStarted clickOnTwitter() {
        utils.click(twitter);
        return this;
    }

    public GetStarted clickOnFacebook() {
        utils.click(facebook);
        return this;
    }

    public GetStarted clickOnGoogle() {
        utils.click(google);
        return this;
    }

    public GetStarted clickOnApple() {
        utils.click(apple);
        return this;
    }

    public GetStarted clickOnLogin() {
        utils.click(login);
        return this;
    }

    public GetStarted clickOnTermsOfUse() {
        utils.click(termsOfUse);
        return this;
    }

    public GetStarted clickOnPrivacyPolicy() {
        utils.click(privacyPolicy);
        return this;
    }


    // Sign Up with Email page

    public GetStarted typeEmailSignUp(String email) {
        utils.sendKeysAction(emailSignUp, email);
        return this;
    }

    public GetStarted clearEmailSignUp() {
        utils.clear(emailSignUp);
        return this;
    }

    public String getEmailSignUp() {
        return utils.getText(emailSignUp);
    }

    public GetStarted typePasswordSignUp(String password) {
        utils.sendKeysAction(passwordSignUp, password);
        return this;
    }

    public GetStarted clearPasswordSignUp() {
        utils.clear(passwordSignUp);
        return this;
    }

    public String getPasswordSignUp() {
        return utils.getText(passwordSignUp);
    }

    public GetStarted clickOnPasswordEyeSignUp() {
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

    public GetStarted clickOnEnableCaptcha() {
        utils.click(enableCaptcha);
        return this;
    }

    public GetStarted clickOnCreateAccountSignUp() {
        utils.click(createAccountButton);
        return this;
    }

    public GetStarted clickOnLoginSignUp() {
        utils.click(loginButtonSignUp);
        return this;
    }


    // Login page

    public GetStarted typeEmailLogin(String email) {
        utils.sendKeysAction(emailLogin, email);
        return this;
    }

    public GetStarted clearEmailLogin() {
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

    public GetStarted typePasswordLogin(String password) {
        utils.sendKeysAction(passwordLogin, password);
        return this;
    }

    public GetStarted clearPasswordLogin() {
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

    public GetStarted clickOnEnableCaptchaLogin() {
        utils.click(enableCaptchaLogin);
        return this;
    }

    public GetStarted clickOnLoginButton() {
        utils.click(loginButtonLoginPage);
        return this;
    }

    public GetStarted clickOnForgotPassword() {
        utils.click(forgotPassword);
        return this;
    }

    public GetStarted clickOnCoinbaseLogin() {
        utils.click(coinbaseLogin);
        return this;
    }

    public GetStarted clickOnTwitterLogin() {
        utils.click(twitterLogin);
        return this;
    }

    public GetStarted clickOnFacebookLogin() {
        utils.click(facebookLogin);
        return this;
    }

    public GetStarted clickOnGoogleLogin() {
        utils.click(googleLogin);
        return this;
    }

    public GetStarted clickOnAppleLogin() {
        utils.click(appleLogin);
        return this;
    }

    public GetStarted clickOnCreateAccountLogin() {
        utils.click(createAccountButtonLoginPage);
        return this;
    }

    public String getGeneralErrorMessageLogin() {
        return utils.getText(generalErrorMessage);
    }


    // Forgot Password page

    public GetStarted typeEmailForgotPassword(String email) {
        utils.sendKeysAction(emailForgotPassword, email);
        return this;
    }

    public GetStarted clearEmailForgotPassword() {
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

    public GetStarted clickOnEnableCaptchaForgotPassword() {
        utils.click(enableCaptchaForgotPassword);
        return this;
    }

    public GetStarted clickOnRecoverPassword() {
        utils.click(recoverPasswordButton);
        return this;
    }

    public GetStarted clickOnCreateAccountForgotPasswordPage() {
        utils.click(createAccountForgotPasswordPage);
        return this;
    }

}
