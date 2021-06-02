package chrome.allPages;

import chrome.mainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Settings {

    WebDriver driver;
    SeleniumUtils utils;

    public Settings(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    By userDropDown = By.cssSelector(".user-drop .primary-nav");

    By settingsButton = By.cssSelector("[aria-label='Settings']");

    By enabledPROFromApp = By.cssSelector(".filter-value");

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

    public Settings userDropDownIsDisplayed(){
        utils.isDisplayed(userDropDown);
        return this;
    }

    public Settings clickOnUserDropDown(){
        utils.click(userDropDown);
        return this;
    }

    public Settings settingsButtonIsDisplayed(){
        utils.isDisplayed(settingsButton);
        return this;
    }

    public Settings clickOnSettings(){
        utils.click(settingsButton);
        return this;
    }

    public Settings enabledPROFromAppIsDisplayed(){
        utils.isDisplayed(enabledPROFromApp);
        return this;
    }

    // Always

    public Settings uploadPhoto(String pathToPhoto) {
        utils.sendKeysAction(uploadPhoto, pathToPhoto);
        return this;
    }

    public String getPhotoText() {
        return utils.getText(uploadPhoto);
    }

    public Settings clickOnEditPhoto() {
        utils.click(editPhoto);
        return this;
    }

    public Settings uploadNewPhoto(String pathToPhoto) {
        utils.sendKeysAction(editUploadPhoto, pathToPhoto);
        return this;
    }

    public Settings clickOnDeletePhoto() {
        utils.click(deletePhoto);
        return this;
    }

    // If PRO and not verified

    public Settings clickOnResendSend() {
        utils.click(resendSendEmail);
        return this;
    }

    public Boolean resendSendIsDisplayed() {
        return utils.isDisplayed(resendSendEmail);
    }

    public Settings clickOnUpgradeAccount() {
        utils.click(upgradeButton);
        return this;
    }

    public Boolean upgradeIsDisplayed() {
        return utils.isDisplayed(upgradeButton);
    }

    public String getUsername() {
        return utils.getText(userNameField);
    }

    public Settings clearUsername() {
        utils.clear(userNameField);
        return this;
    }

    public Settings typeUsername(String username) {
        utils.sendKeysAction(userNameField, username);
        return this;
    }

    public String getEmail() {
        return utils.getText(emailField);
    }

    public Settings clickOnSaveChanges() {
        utils.click(saveChanges);
        return this;
    }


    // 2FA

    public String get2FAText() {
        return utils.getText(enable2FA);
    }

    public Settings clickOnEnable2FA() {
        utils.click(enable2FA);
        return this;
    }

    public String getGAKey() {
        return utils.getText(GAKey);
    }

    public Settings typePassword2FA(String password) {
        utils.sendKeysAction(passwordFor2FA, password);
        return this;
    }

    public Settings clearPassword2FA() {
        utils.clear(passwordFor2FA);
        return this;
    }

    public String getPasswordFieldText2FA() {
        return utils.getText(passwordFor2FA);
    }

    public Settings typeGoogleVerificationCode2FA(String googleVerificationCode) {
        utils.sendKeysAction(this.googleVerificationCode, googleVerificationCode);
        return this;
    }

    public Settings clearGoogleVerificationCode() {
        utils.clear(googleVerificationCode);
        return this;
    }

    public String getGoogleVerificationCode() {
        return utils.getText(googleVerificationCode);
    }

    public Settings clickOnEnable2FAInWindow() {
        utils.click(enable2FAButton);
        return this;
    }

    public Boolean enable2FADisabledIsDisplayed() {
        return utils.isDisplayed(enable2FAButtonDisable);
    }

    public Settings clickOnCancel2FAWindow() {
        utils.click(cancel2FAWindowButton);
        return this;
    }

    public String get2FAErrorMessage() {
        return utils.getText(errorMessage2FA);
    }


    // Change Password

    public Settings changePasswordIsDisplayed(){
        utils.isDisplayed(changePassword);
        return this;
    }

    public Settings clickOnChangePassword() {
        utils.click(changePassword);
        return this;
    }

    public Settings typeOldPassword(String oldPassword) {
        utils.sendKeysAction(oldPasswordField, oldPassword);
        return this;
    }

    public Settings clearOldPassword() {
        utils.clear(oldPasswordField);
        return this;
    }

    public String getOldPassword() {
        return utils.getText(oldPasswordField);
    }

    public Settings clickOnOldPasswordEye() {
        utils.click(visiblePasswordForOldPasswordField);
        return this;
    }

    public Settings typeNewPassword(String newPassword) {
        utils.sendKeysAction(newPasswordField, newPassword);
        return this;
    }

    public Settings clearNewPassword() {
        utils.clear(newPasswordField);
        return this;
    }

    public String getNewPassword() {
        return utils.getText(newPasswordField);
    }

    public Settings clickOnNewPasswordEye() {
        utils.click(visiblePasswordForNewPasswordField);
        return this;
    }

    public String getNewPasswordFirstIndicatorColor() {
        return utils.getCSSValue(firstNewPasswordIndicator, "color");
    }

    public String getNewPasswordSecondIndicatorColor() {
        return utils.getCSSValue(secondNewPasswordIndicator, "color");
    }

    public String getNewPasswordThirdIndicatorColor() {
        return utils.getCSSValue(thirdNewPasswordIndicator, "color");
    }

    public Settings clickOnSaveNewPassword() {
        utils.click(saveNewPassword);
        return this;
    }

    public Settings clickOnCancelNewPassword() {
        utils.click(cancelChangePasswordWindow);
        return this;
    }

    public String getChangePasswordErrorMessage() {
        return utils.getText(errorMessageChangePassword);
    }

}
