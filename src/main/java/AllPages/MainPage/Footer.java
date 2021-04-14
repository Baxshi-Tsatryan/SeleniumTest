package AllPages.MainPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Footer {

    WebDriver driver;
    SeleniumUtils utils;

    public Footer(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    // Stay in Touch

    By telegramIcon = By.cssSelector(".icon-telegram");

    By facebookIcon = By.cssSelector(".icon-facebook");

    By twitterIcon = By.cssSelector(".icon-twitter");

    By steemitIcon = By.cssSelector(".icon-steemit");

    By mediumIcon = By.cssSelector(".icon-medium");

    By mailtoIcon = By.cssSelector(".icon-email");


    // Explore Our Products

    By macAppStore = By.cssSelector("[alt='Mac App Store']");

    By appStore = By.cssSelector("[alt='App Store']");

    By googlePlayMarket = By.cssSelector("[alt='Google Play']");


    // Footer's links

    // Platform

    By livePrices = By.cssSelector("div.footer-nav [href='/en/']");

    By report24h = By.cssSelector("a[href='/en/market-report/']");

    By news = By.cssSelector("div.footer-nav [href='/en/news/']");

    By portfolioTracker = By.xpath("//a[.='Crypto Portfolio Tracker']");

    // Learn

    By learnConnectExchangeAccount = By.cssSelector("a[href='https://help.coinstats.app/en/collections/763341-connecting-exchange-accounts']");

    By learnConnectWalletAccount = By.cssSelector("a[href='https://help.coinstats.app/en/collections/763360-wallets']");

    By learnTradeOnYourExchanges = By.cssSelector("a[href='https://help.coinstats.app/en/articles/3807847-how-to-trade-on-your-exchanges-using-coinstats-app']");

    By learnAddTransaction = By.cssSelector("a[href='https://help.coinstats.app/en/articles/3592645-how-to-add-transaction-to-your-manual-portfolio']");

    By learnPLCalculation = By.cssSelector("a[href='https://help.coinstats.app/en/articles/4175182-profit-loss-options-in-portfolio']");

    // Resources

    By pressKit = By.cssSelector("a[href='/en/press-kit/']");

    By APIDocs = By.cssSelector("div.footer-nav > div:nth-of-type(3) > a:nth-of-type(2)");

    By blog = By.cssSelector("a[href='https://blog.coinstats.app/']");

    // Other Products

    By macOSWidget = By.cssSelector("div.footer-nav > div:nth-of-type(4) > a:nth-of-type(1)");

    By mozillaExtension = By.cssSelector("a[href='https://addons.mozilla.org/en-US/firefox/addon/coinstats/']");

    By chromeExtension = By.cssSelector("a[href='https://chrome.google.com/webstore/detail/coinstats-crypto-portfoli/fbbckponafgkennhnmgfoikfmbkiplgp']");

    By appleTV = By.cssSelector("a[href='https://apps.apple.com/us/app/coin-stats-crypto-portfolio/id1247849330']");

    // Company

    By pricing = By.cssSelector("a[href='https://apps.apple.com/us/app/coin-stats-crypto-portfolio/id1247849330']");

    By privacyPolicy = By.cssSelector("a[href='https://inomma.com/coinstatsprivacy.html']");

    By termsOfUse = By.cssSelector("a[href='https://coinstats.app/terms.html']");

    // ContactUs

    By helpCenter = By.cssSelector("a[href='https://help.coinstats.app/en/']");

    By featureRequest = By.cssSelector("a[href='https://coin-stats.upvoty.com/admin/overview/']");

    By advertiseAtCoinStats = By.cssSelector("a[href='https://help.coinstats.app/en/articles/4437259-coinstats-advertisement-guidelines']");


    // ---------------------------------------- Methods --------------------------------------------------

    // Stay In Touch

    public Footer clickOnTelegramIcon() {
        utils.click(telegramIcon);
        return this;
    }

    public Footer clickOnFacebookIcon() {
        utils.click(facebookIcon);
        return this;
    }

    public Footer clickOnTwitterIcon() {
        utils.click(twitterIcon);
        return this;
    }

    public Footer clickOnSteemitIcon() {
        utils.click(steemitIcon);
        return this;
    }

    public Footer clickOnMediumIcon() {
        utils.click(mediumIcon);
        return this;
    }

    public Footer clickOnMailtoIcon() {
        utils.click(mailtoIcon);
        return this;
    }


    // Explore Our Product

    public Footer clickOnMacAppStore() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.SPACE).build().perform();
        action.sendKeys(Keys.SPACE).build().perform();

        utils.click(macAppStore);
        return this;
    }

    public Footer clickOnAppStore() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.SPACE).build().perform();
        action.sendKeys(Keys.SPACE).build().perform();

        utils.click(appStore);
        return this;
    }

    public Footer clickOnGooglePlayMarket() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.SPACE).build().perform();
        action.sendKeys(Keys.SPACE).build().perform();

        utils.click(googlePlayMarket);
        return this;
    }


    // Footers' links

    // Company

    public Footer clickOnLivePrices() {
        utils.click(livePrices);
        return this;
    }

    public Footer clickOn24hMarketReport() {
        utils.click(report24h);
        return this;
    }

    public Footer clickOnNews() {
        utils.click(news);
        return this;
    }

    public Footer clickOnPortfolioTracker() {
        utils.click(portfolioTracker);
        return this;
    }


    //Learn

    public Footer clickOnLearnConnectExchange() {
        utils.click(learnConnectExchangeAccount);
        return this;
    }

    public Footer clickOnLearnConnectWallet() {
        utils.click(learnConnectWalletAccount);
        return this;
    }

    public Footer clickOnLearnTradeOnYourExchanges() {
        utils.click(learnTradeOnYourExchanges);
        return this;
    }

    public Footer clickOnLearnAddTransactions() {
        utils.click(learnAddTransaction);
        return this;
    }

    public Footer clickOnLearnPLCalculation() {
        utils.click(learnPLCalculation);
        return this;
    }


    // Resources

    public Footer clickOnPressKit() {
        utils.click(pressKit);
        return this;
    }

    public Footer clickOnAPIDocs() {
        utils.click(APIDocs);
        return this;
    }

    public Footer clickOnBlog() {
        utils.click(blog);
        return this;
    }


    // Other Products

    public Footer clickOnMacOSWidget() {
        utils.click(macOSWidget);
        return this;
    }

    public Footer clickOnMozillaExtension() {
        utils.click(mozillaExtension);
        return this;
    }

    public Footer clickOnChromeExtension() {
        utils.click(chromeExtension);
        return this;
    }

    public Footer clickOnAppleTV() {
        utils.click(appleTV);
        return this;
    }


    // Company

    public Footer clickOnPricing() {
        utils.click(pricing);
        return this;
    }

    public Footer clickOnPrivacyPolicy() {
        utils.click(privacyPolicy);
        return this;
    }

    public Footer clickOnTermsOfUse() {
        utils.click(termsOfUse);
        return this;
    }


    // Contact Us

    public Footer clickOnHelpCenter() {
        utils.click(helpCenter);
        return this;
    }

    public Footer clickOnFeatureRequest() {
        utils.click(featureRequest);
        return this;
    }

    public Footer clickOnAdvertiseAtCoinStats() {
        utils.click(advertiseAtCoinStats);
        return this;
    }

}
