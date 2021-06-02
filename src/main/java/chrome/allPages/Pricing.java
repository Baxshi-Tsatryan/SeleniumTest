package chrome.allPages;

import chrome.mainPackage.SeleniumUtils;
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


    public Boolean monthlyAnnualSwitcherIsEnabled() {
        return utils.isEnabled(monthlyAnnualSwitcher);
    }

    public Boolean monthlyAnnualSwitcherIsSelected() {
        return utils.isSelected(monthlyAnnualSwitcher);
    }

    public Pricing clickOnMonthlyAnnualSwitcher() {
        utils.click(monthlyAnnualSwitcher);
        return this;
    }

    public String getPricePRO() {
        return utils.getText(pricePRO);
    }

    public String getPricePremium() {
        return utils.getText(pricePremium);
    }

    public Pricing clickOniOSLinkPRO() {
        utils.click(iOSLinkPRO);
        return this;
    }

    public Pricing clickOnAndroidLinkPRO() {
        utils.click(androidLinkPRO);
        return this;
    }

    public Pricing clickOniOSLinkPremium() {
        utils.click(iOSLinkPremium);
        return this;
    }

    public Pricing clickOnAndroidLinkPremium() {
        utils.click(androidLinkPremium);
        return this;
    }

    public Pricing clickOnPromoCodePRO() {
        utils.click(promoCodePRONotPRO);
        return this;
    }

    public Pricing clickOnPromoCodePremium() {
        utils.click(promoCodePremiumNotPRO);
        return this;
    }

    public Pricing clickOnStartFreeTrialPRO() {
        utils.click(startFreeTrialPRO);
        return this;
    }

    public Pricing clickOnStartFreeTrialPremium() {
        utils.click(startFreeTrialPremium);
        return this;
    }

    public Pricing clickOnContactUSCommunity() {
        utils.click(contactUSCommunity);
        return this;
    }

    public Pricing clickOnContactUSBottom() {
        utils.click(contactUSBottom);
        return this;
    }


    // Promo Code

    public Pricing typePromoCode(String promoCode) {
        utils.sendKeysAction(promoCodeField, promoCode);
        return this;
    }

    public String getPromoCode() {
        return utils.getText(promoCodeField);
    }

    public Pricing clearPromoCode() {
        utils.clear(promoCodeField);
        return this;
    }

    public Pricing clickOnCopy() {
        utils.click(promoCodePaste);
        return this;
    }

    public Pricing clickOnSubmitPromoCode() {
        utils.click(promoCodeSubmit);
        return this;
    }

    public String getPromoCodeErrorMessage() {
        return utils.getText(promoCodeErrorMessage);
    }

}
