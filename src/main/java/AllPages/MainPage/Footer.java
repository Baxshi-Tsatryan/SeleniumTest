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

    public void clickOnTelegramIcon() {
        utils.clickOnElement(telegramIcon);
    }

    public void clickOnFacebookIcon() {
        utils.clickOnElement(facebookIcon);
    }

    public void clickOnTwitterIcon() {
        utils.clickOnElement(twitterIcon);
    }

    public void clickOnSteemitIcon() {
        utils.clickOnElement(steemitIcon);
    }

    public void clickOnMediumIcon() {
        utils.clickOnElement(mediumIcon);
    }

    public void clickOnMailtoIcon() {
        utils.clickOnElement(mailtoIcon);
    }


    // Explore Our Product

    public void clickOnMacAppStore() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.SPACE).build().perform();
        action.sendKeys(Keys.SPACE).build().perform();

        utils.clickOnElement(macAppStore);
    }

    public void clickOnAppStore() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.SPACE).build().perform();
        action.sendKeys(Keys.SPACE).build().perform();

        utils.clickOnElement(appStore);
    }

    public void clickOnGooglePlayMarket() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.SPACE).build().perform();
        action.sendKeys(Keys.SPACE).build().perform();

        utils.clickOnElement(googlePlayMarket);
    }


    // Footers' links

    // Company

    public void clickOnLivePrices() {
        utils.clickOnElement(livePrices);
    }

    public void clickOn24hMarketReport() {
        utils.clickOnElement(report24h);
    }

    public void clickOnNews() {
        utils.clickOnElement(news);
    }

    public void clickOnPortfolioTracker() {
        utils.clickOnElement(portfolioTracker);
    }


    //Learn

    public void clickOnLearnConnectExchange() {
        utils.clickOnElement(learnConnectExchangeAccount);
    }

    public void clickOnLearnConnectWallet() {
        utils.clickOnElement(learnConnectWalletAccount);
    }

    public void clickOnLearnTradeOnYourExchanges() {
        utils.clickOnElement(learnTradeOnYourExchanges);
    }

    public void clickOnLearnAddTransactions() {
        utils.clickOnElement(learnAddTransaction);
    }

    public void clickOnLearnPLCalculation() {
        utils.clickOnElement(learnPLCalculation);
    }


    // Resources

    public void clickOnPressKit() {
        utils.clickOnElement(pressKit);
    }

    public void clickOnAPIDocs() {
        utils.clickOnElement(APIDocs);
    }

    public void clickOnBlog() {
        utils.clickOnElement(blog);
    }


    // Other Products

    public void clickOnMacOSWidget() {
        utils.clickOnElement(macOSWidget);
    }

    public void clickOnMozillaExtension() {
        utils.clickOnElement(mozillaExtension);
    }

    public void clickOnChromeExtension() {
        utils.clickOnElement(chromeExtension);
    }

    public void clickOnAppleTV() {
        utils.clickOnElement(appleTV);
    }


    // Company

    public void clickOnPricing() {
        utils.clickOnElement(pricing);
    }

    public void clickOnPrivacyPolicy() {
        utils.clickOnElement(privacyPolicy);
    }

    public void clickOnTermsOfUse()
    {
        utils.clickOnElement(termsOfUse);
    }


    // Contact Us

    public void clickOnHelpCenter()
    {
        utils.clickOnElement(helpCenter);
    }

    public void clickOnFeatureRequest()
    {
        utils.clickOnElement(featureRequest);
    }

    public void clickOnAdvertiseAtCoinStats()
    {
        utils.clickOnElement(advertiseAtCoinStats);
    }

}
