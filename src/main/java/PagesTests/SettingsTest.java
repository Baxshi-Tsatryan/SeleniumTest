package PagesTests;

import AllPages.Settings;
import MainPackage.AllURLs;
import MainPackage.Driver;
import MainPackage.Paths;
import MainPackage.SeleniumUtils;
import org.openqa.selenium.Cookie;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SettingsTest extends Driver {
    AllURLs allURLs;
    Settings settings;
    SeleniumUtils utils;
    Paths paths;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        settings = new Settings(driver);
        utils = new SeleniumUtils(driver);
        paths = new Paths(driver);
    }


    @Test
    public void settingsPageNotPRO()
    {
        allURLs.navigateToMainPage();

        driver.manage().addCookie(new Cookie("userData", "eyJzZXNzaW9uVG9rZW4iOiJyOmM0OWRiMjJiYmRmZTRhNGExZDUxODk0MDJkMmZlODUwIn0="));
        driver.navigate().refresh();

        allURLs.navigateToSettingsPage();

       // settings.uploadPhoto(paths.getImage());
       // settings.clickOnEditPhoto();
       // settings.uploadNewPhoto(paths.getImage());
       // settings.clickOnEditPhoto();
       // settings.clickOnDeletePhoto();

        settings.clickOnResendSend();
        settings.clickOnUpgradeAccount();
        utils.refreshPage();

        settings.getUsername();
        settings.getEmail();

        settings.clickOnEnable2FA();
        settings.getGAKey();
        settings.typePassword2FA("asd");
        settings.typeGoogleVerificationCode2FA("123123");
        settings.clickOnEnable2FAInWindow();
        settings.get2FAErrorMessage();
        settings.clickOnCancel2FAWindow();

        settings.clickOnChangePassword();
        settings.typeOldPassword("asdsad");
        settings.clickOnOldPasswordEye();
        settings.typeNewPassword("asdas");
        settings.clickOnNewPasswordEye();
        settings.getNewPasswordFirstIndicatorColor();
        settings.getNewPasswordSecondIndicatorColor();
        settings.getNewPasswordThirdIndicatorColor();
        settings.clickOnSaveNewPassword();
        settings.getChangePasswordErrorMessage();
        settings.clickOnCancelNewPassword();

        settings.clickOnSaveChanges();



    }



}
