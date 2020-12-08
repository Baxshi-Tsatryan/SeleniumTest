package AllPages;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Settings {

    WebDriver driver;
    SeleniumUtils utils;

    public Settings(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    // Always

    By uploadPhoto = By.id("upload-profile-pic");

    By editPhoto = By.cssSelector("div.profile-image-container-wrapper > .jsx-1426819953");

    By editUploadPhoto = By.cssSelector("div.edit-profile-image-container > .primary");

    By deletePhoto = By.cssSelector(".secondary");


    // If PRO and not verified

    By resendSendEmail = By.cssSelector("div.email-verification .jsx-1426819953");

    By userNameField = By.cssSelector("div.first-input [name]");

    By emailField = By.cssSelector("input[disabled]");

    By enable2FA = By.cssSelector("div.two-fa-container > .jsx-1426819953");

    By changePassword = By.cssSelector("div.buttons-container > .text");

    By saveChanges = By.cssSelector(".primary");


    // If not PRO

    By upgradeButton = By.cssSelector("div.plan-detail-row > .jsx-1426819953");


    // 2FA Window

    By GAKey = By.cssSelector("div.token-text > .table-row");

    By passwordFor2FA = By.cssSelector("div.two-factor-modal > div:nth-of-type(2) [name]");

    By googleVerificationCode = By.cssSelector("div.two-factor-modal > div:nth-of-type(3) [name]");

    By enable2FAButton = By.cssSelector(".buttons-container.jsx-3427788803 > .primary");

    By enable2FAButtonDisable = By.cssSelector("button[disabled]");

    By cancel2FAWindowButton = By.cssSelector(".secondary");


    // Change Password window

    By oldPasswordField = By.cssSelector("div.change-password-modal-content > div:nth-of-type(1) [name]");

    By visiblePasswordForOldPasswordField = By.cssSelector("div.change-password-modal-content > div:nth-of-type(1) .icon-hide");

    By newPasswordField = By.cssSelector("div.change-password-modal-content > div:nth-of-type(2) [name]");

    By visiblePasswordForNewPasswordField = By.cssSelector("div.change-password-modal-content > div:nth-of-type(2) .icon-hide");

    By firstNewPasswordIndicator = By.cssSelector("div.strength-bar > div:nth-of-type(1)");

    By secondNewPasswordIndicator = By.cssSelector("div.strength-bar > div:nth-of-type(2)");

    By thirdNewPasswordIndicator = By.cssSelector("div.strength-bar > div:nth-of-type(3)");

    By errorMessageChangePassword = By.cssSelector("div.change-password-modal-content .description");

    By saveNewPassword = By.cssSelector("div.change-password-modal-content .primary");

    By cancelChangePasswordWindow = By.cssSelector(".secondary");

    By errorMessage2FA = By.cssSelector("div.text-down > .description");

    By testText = By.cssSelector(".title");



    // ----------------------------------------------------- Methods --------------------------------------------------

    // Always

    public void uploadPhoto(String pathToPhoto)
    {
        utils.sendKeysAction(uploadPhoto, pathToPhoto);
    }

    public String getPhotoText()
    {
        return utils.getText(uploadPhoto);
    }

    public String getPhotoTextSOUT()
    {
        return utils.getText(uploadPhoto);
    }

    public void clickOnEditPhoto()
    {
        utils.clickOnElement(editPhoto);
    }

    public void uploadNewPhoto(String pathToPhoto)
    {
        utils.sendKeysAction(editUploadPhoto, pathToPhoto);
    }

    public void clickOnDeletePhoto()
    {
        utils.clickOnElement(deletePhoto);
    }

    // If PRO and not verified

    public void clickOnResendSend()
    {
        utils.clickOnElement(resendSendEmail);
    }

    public Boolean resendSendIsDisplayed()
    {
        return utils.isDisplayed(resendSendEmail);
    }

    public void clickOnUpgradeAccount()
    {
        utils.clickOnElement(upgradeButton);
    }

    public Boolean upgradeIsDisplayed()
    {
        return utils.isDisplayed(upgradeButton);
    }

    public String getUsername()
    {
        return utils.getText(userNameField);
    }

    public void clearUsername()
    {
        utils.clear(userNameField);
    }

    public void typeUsername(String username)
    {
        utils.sendKeysAction(userNameField, username);
    }

    public String getEmail()
    {
        return utils.getText(emailField);
    }

    public void clickOnSaveChanges()
    {
        utils.clickOnElement(saveChanges);
    }


    // 2FA

    public String get2FAText()
    {
        return utils.getText(enable2FA);
    }

    public void clickOnEnable2FA()
    {
        utils.clickOnElement(enable2FA);
    }

    public String getGAKey()
    {
        return utils.getText(GAKey);
    }

    public void typePassword2FA(String password)
    {
        utils.sendKeysAction(passwordFor2FA, password);
    }

    public void clearPassword2FA()
    {
        utils.clear(passwordFor2FA);
    }

    public String getPasswordFieldText2FA()
    {
        return utils.getText(passwordFor2FA);
    }

    public void typeGoogleVerificationCode2FA(String googleVerificationCode)
    {
        utils.sendKeysAction(this.googleVerificationCode, googleVerificationCode);
    }

    public void clearGoogleVerificationCode()
    {
        utils.clear(googleVerificationCode);
    }

    public String getGoogleVerificationCode()
    {
        return utils.getText(googleVerificationCode);
    }

    public void clickOnEnable2FAInWindow()
    {
        utils.clickOnElement(enable2FAButton);
    }

    public Boolean enable2FADisabledIsDisplayed()
    {
        return utils.isDisplayed(enable2FAButtonDisable);
    }

    public void clickOnCancel2FAWindow()
    {
        utils.clickOnElement(cancel2FAWindowButton);
    }

    public String get2FAErrorMessage()
    {
        return utils.getText(errorMessage2FA);
    }


    // Change Password

    public void clickOnChangePassword()
    {
        utils.clickOnElement(changePassword);
    }

    public void typeOldPassword(String oldPassword)
    {
        utils.sendKeysAction(oldPasswordField, oldPassword);
    }

    public void clearOldPassword()
    {
        utils.clear(oldPasswordField);
    }

    public String getOldPassword()
    {
        return utils.getText(oldPasswordField);
    }

    public void clickOnOldPasswordEye()
    {
        utils.clickOnElement(visiblePasswordForOldPasswordField);
    }

    public void typeNewPassword(String newPassword)
    {
        utils.sendKeysAction(newPasswordField, newPassword);
    }

    public void clearNewPassword()
    {
        utils.clear(newPasswordField);
    }

    public String getNewPassword()
    {
        return utils.getText(newPasswordField);
    }

    public void clickOnNewPasswordEye()
    {
        utils.clickOnElement(visiblePasswordForNewPasswordField);
    }

    public String getNewPasswordFirstIndicatorColor()
    {
        return utils.getCSSValue(firstNewPasswordIndicator, "color");
    }

    public String getNewPasswordSecondIndicatorColor()
    {
        return utils.getCSSValue(secondNewPasswordIndicator, "color");
    }

    public String getNewPasswordThirdIndicatorColor()
    {
        return utils.getCSSValue(thirdNewPasswordIndicator, "color");
    }

    public void clickOnSaveNewPassword()
    {
        utils.clickOnElement(saveNewPassword);
    }

    public void clickOnCancelNewPassword()
    {
        utils.clickOnElement(cancelChangePasswordWindow);
    }

    public String getChangePasswordErrorMessage()
    {
        return utils.getText(errorMessageChangePassword);
    }

}
