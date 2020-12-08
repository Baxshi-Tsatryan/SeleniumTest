package AllPages;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pricing {

    WebDriver driver;
    SeleniumUtils utils;

    public Pricing(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }


    By monthlyAnnualSwitcher = By.cssSelector("label.big-size i");

    By monthlyText = By.cssSelector("span.false");

    By annualText = By.cssSelector("div.plan-period-wrapper > span:nth-of-type(2)");

    By pricePRO = By.cssSelector("div.pricing-plans-container > div:nth-of-type(1) .price");

    By pricePremium = By.cssSelector("div.pricing-plans-container > div:nth-of-type(2) .price");

    By iOSLinkPRO = By.cssSelector("div.pricing-plans-container > div:nth-of-type(1) [href='https://apps.apple.com/us/app/coin-stats-btc-eth-xrp-prices-and-altfolio/id1247849330']");

    By androidLinkPRO = By.cssSelector("div.pricing-plans-container > div:nth-of-type(1) a:nth-of-type(2)");

    By promoCodePRONotPRO = By.cssSelector("div.pricing-plans-container > div:nth-of-type(1) .text");

    By startFreeTrialPRO = By.cssSelector("div.pricing-plans-container > div:nth-of-type(1) .primary");

    By iOSLinkPremium = By.cssSelector("div.pricing-plans-container > div:nth-of-type(2) [href='https://apps.apple.com/us/app/coin-stats-btc-eth-xrp-prices-and-altfolio/id1247849330']");

    By androidLinkPremium = By.cssSelector("div.pricing-plans-container > div:nth-of-type(2) a:nth-of-type(2)");

    By promoCodePremiumNotPRO = By.cssSelector("div.pricing-plans-container > div:nth-of-type(2) .text");

    By startFreeTrialPremium = By.cssSelector("div.pricing-plans-container > div:nth-of-type(2) .primary");

    By contactUSCommunity = By.cssSelector("div.community-card .jsx-1426819953");

    By contactUSBottom = By.cssSelector("div.pay-in-crypto > .jsx-1426819953");

    By promoCodeField = By.cssSelector("div.circle-borders > [name]");

    By promoCodePaste = By.cssSelector(".primary-bordered");

    By promoCodeSubmit = By.cssSelector("div.changing-content > .jsx-1426819953");

    By promoCodeErrorMessage = By.cssSelector(".text-down");


    // ----------------------------------------------- Methods ----------------------------------------------------


    public Boolean monthlyAnnualSwitcherIsEnabled()
    {
        return utils.isEnabled(monthlyAnnualSwitcher);
    }

    public Boolean monthlyAnnualSwitcherIsSelected()
    {
        return utils.isSelected(monthlyAnnualSwitcher);
    }

    public void clickOnMonthlyAnnualSwitcher()
    {
        utils.clickOnElement(monthlyAnnualSwitcher);
    }

    public String getPricePRO()
    {
        return utils.getText(pricePRO);
    }

    public String getPricePremium()
    {
        return utils.getText(pricePremium);
    }

    public void clickOniOSLinkPRO()
    {
        utils.clickOnElement(iOSLinkPRO);
    }

    public void clickOnAndroidLinkPRO()
    {
        utils.clickOnElement(androidLinkPRO);
    }

    public void clickOniOSLinkPremium()
    {
        utils.clickOnElement(iOSLinkPremium);
    }

    public void clickOnAndroidLinkPremium()
    {
        utils.clickOnElement(androidLinkPremium);
    }

    public void clickOnPromoCodePRO()
    {
        utils.clickOnElement(promoCodePRONotPRO);
    }

    public void clickOnPromoCodePremium()
    {
        utils.clickOnElement(promoCodePremiumNotPRO);
    }

    public void clickOnStartFreeTrialPRO()
    {
        utils.clickOnElement(startFreeTrialPRO);
    }

    public void clickOnStartFreeTrialPremium()
    {
        utils.clickOnElement(startFreeTrialPremium);
    }

    public void clickOnContactUSCommunity()
    {
        utils.clickOnElement(contactUSCommunity);
    }

    public void clickOnContactUSBottom()
    {
        utils.clickOnElement(contactUSBottom);
    }


    // Promo Code

    public void typePromoCode(String promoCode)
    {
        utils.sendKeysAction(promoCodeField, promoCode);
    }

    public String getPromoCode()
    {
        return utils.getText(promoCodeField);
    }

    public void clearPromoCode()
    {
        utils.clear(promoCodeField);
    }

    public void clickOnCopy()
    {
        utils.clickOnElement(promoCodePaste);
    }

    public void clickOnSubmitPromoCode()
    {
        utils.clickOnElement(promoCodeSubmit);
    }

    public String getPromoCodeErrorMessage()
    {
        return utils.getText(promoCodeErrorMessage);
    }

}
