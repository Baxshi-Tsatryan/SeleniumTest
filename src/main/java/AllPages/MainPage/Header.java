package AllPages.MainPage;

import MainPackage.AllURLs;
import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {

    WebDriver driver;
    SeleniumUtils utils;
    AllURLs allURLs;

    public Header(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
        allURLs = new AllURLs(driver);
    }


    By iconButton = By.cssSelector(".icon-logo");

    By lightDarkModeSelector = By.cssSelector("i");

    By portfolioTracker = By.cssSelector(".portfolio-tab");

    By livePrices = By.cssSelector("nav.nav-items > [href='/en/']");

    By pricing = By.cssSelector("nav.jsx-207749059 > [href='/en/pricing/']");

    By alerts = By.cssSelector(".is-new");

    By threeDotButton = By.cssSelector(".icon-more_big");


    // In 3 dot button

    By report24 = By.cssSelector("div.section-bar [href='/en/market-report/']");

    By pressKit = By.cssSelector("div.section-bar [href='/en/press-kit/']");

    By APIDocs = By.cssSelector("a[href='https://apidocs.coinstats.app']");

    By blog = By.cssSelector("a[href='https://blog.coinstats.app']");

    By widgets = By.cssSelector("a[href='/en/widgets/']");

    By news = By.cssSelector("div.section-bar a:nth-of-type(11)");

    By appStore = By.xpath("//*[@id='__next']/main/header/div[2]/div[1]/div/div[5]/a[1]/img");

    By googlePlay = By.xpath("//*[@id='__next']/main/header/div[2]/div[1]/div/div[5]/a[2]/img");

    // / In 3 dot button


    By currenciesDropDown = By.cssSelector("div.search-dropdowns-container > div:nth-of-type(1) .primary-nav");

    By currentCurrency = By.cssSelector("div.search-dropdowns-container > div:nth-of-type(1) .primary-nav");

    // Currencies

    By USD = By.xpath("//li[.='USD']");

    By BTC = By.xpath("//li[.='BTC']");

    By ETH = By.xpath("//li[.='ETH']");

    By AMD = By.xpath("//li[.='AMD']");

    By AUD = By.xpath("//li[.='AUD']");

    By BGN = By.xpath("//li[.='BGN']");

    By BRL = By.xpath("//li[.='BRL']");

    By CAD = By.xpath("//li[.='CAD']");

    By CHF = By.xpath("//li[.='CHF']");

    By CNY = By.xpath("//li[.='CNY']");

    By CZK = By.xpath("//li[.='CZK']");

    By DKK = By.xpath("//li[.='DKK']");

    By EUR = By.xpath("//li[.='EUR']");

    By GBP = By.xpath("//li[.='GBP']");

    By HKD = By.xpath("//li[.='HKD']");

    By HRK = By.xpath("//li[.='HRK']");

    By HUF = By.xpath("//li[.='HUF']");

    By IDR = By.xpath("//li[.='IDR']");

    By ILS = By.xpath("//li[.='ILS']");

    By INR = By.xpath("//li[.='INR']");

    By ISK = By.xpath("//li[.='ISK']");

    By JPY = By.xpath("//li[.='JPY']");

    By KRW = By.xpath("//li[.='KRW']");

    By MXN = By.xpath("//li[.='MXN']");

    By MYR = By.xpath("//li[.='MYR']");

    By NOK = By.xpath("//li[.='NOK']");

    By NZD = By.xpath("//li[.='NZD']");

    By PHP = By.xpath("//li[.='PHP']");

    By PLN = By.xpath("//li[.='PLN']");

    By RON = By.xpath("//li[.='RON']");

    By RUB = By.xpath("//li[.='RUB']");

    By SEK = By.xpath("//li[.='SEK']");

    By SGD = By.xpath("//li[.='SGD']");

    By THB = By.xpath("//li[.='THB']");

    By TRY = By.xpath("//li[.='TRY']");

    By ZAR = By.xpath("//li[.='ZAR']");


    // Languages

    By languagesDropDown = By.cssSelector("div.search-dropdowns-container > div:nth-of-type(2) > .dropdown-placeholder");

    By currentLanguage = By.cssSelector("div.search-dropdowns-container > div:nth-of-type(2) .primary-nav");

    By english = By.xpath("//li[.='English']");

    By german = By.xpath("//li[.='German']");

    By korean = By.xpath("//li[.='Korean']");

    By japanese = By.xpath("//li[.='Japanese']");

    By chinese = By.xpath("//li[.='Chinese']");

    By spanish = By.xpath("//li[.='Spanish']");

    By french = By.xpath("//li[.='French']");

    By armenian = By.xpath("//li[.='Armenian']");

    By dutch = By.xpath("//li[.='Dutch']");

    By russian = By.xpath("//li[.='Russian']");

    By italian = By.xpath("//li[.='Italian']");

    By portuguese = By.xpath("//li[.='Portuguese']");

    By turkish = By.xpath("//li[.='Turkish']");


    // Search

    By searchFieldMinScreen = By.cssSelector(".text-box-wrapper");

    By searchFieldMaxScreen = By.cssSelector("[placeholder='Search']");

    By firstSearchCoinResult = By.cssSelector("#__next > main > header > div > div.jsx-207749059.header-wrapper.show-desktop > div > div.jsx-207749059.search-dropdowns-container > div.search-wrapper > div > div.jsx-550402856.result-wrapper > div > div:nth-child(2) > a:nth-child(1) > div > span > span.table-row");

    By firstSearchExchangeResult = By.cssSelector("#__next > main > header > div > div.jsx-207749059.header-wrapper.show-desktop > div > div.jsx-207749059.search-dropdowns-container > div.search-wrapper > div > div.jsx-550402856.result-wrapper > div > div:nth-child(4) > a:nth-child(1) > div > span");


    By login = By.cssSelector(".login-button");

    By getStarted = By.cssSelector("div.header-inner-wrapper .jsx-1426819953");

    By accountDropDown = By.cssSelector(".user-drop");

    By currentAccountName = By.cssSelector("div.user-drop .primary-nav");


    // Account DropDown

    By becomePro = By.xpath("//div[.='Become Pro']");

    By settings = By.xpath("//a[.='Settings']");

    By signOut = By.xpath("//span[.='Sign Out']");

    By noThanks = By.cssSelector("#onesignal-slidedown-cancel-button");

    // -------------------------------------------- Methods -----------------------------------------------

    public Header clickOnNoThanks() {
        utils.click(noThanks);
        return this;
    }

    public Header clickOnIcon() {
        utils.click(iconButton);
        return this;
    }

    public Header clickOnLightMode() {
        utils.click(lightDarkModeSelector);
        return this;
    }

    public Boolean lightDarkModeIsEnabled() {
        return utils.isEnabled(lightDarkModeSelector);
    }

    public Boolean lightDarkModeIsSelected() {
        return utils.isSelected(lightDarkModeSelector);
    }

    public Header clickOnPortfolioTracker() {
        utils.click(portfolioTracker);
        return this;
    }

    public Header clickOnLivePrices() {
        utils.click(livePrices);
        return this;
    }

    public Header clickOnPricing() {
        utils.click(pricing);
        return this;
    }

    public Header clickOnAlerts() {
        utils.click(alerts);
        return this;
    }

    public Header clickOn3DotButton() {
        utils.click(threeDotButton);
        return this;
    }


    // 3 dot button

    public Header clickOn24hReport() {
        utils.click(report24);
        return this;
    }

    public Header clickOnPressKit() {
        utils.click(pressKit);
        return this;
    }

    public Header clickOnAPIDocs() {
        utils.click(APIDocs);
        return this;
    }

    public Header clickOnBlog() {
        utils.click(blog);
        return this;
    }

    public Header clickOnWidgets() {
        utils.click(widgets);
        return this;
    }

    public Header clickOnNews() {
        utils.click(news);
        return this;
    }

    public Header clickOnAppStore() {
        utils.click(appStore);
        return this;
    }

    public Header clickOnGooglePlay() {
        utils.click(googlePlay);
        return this;
    }


    // Currencies

    public Header clickOnCurrenciesDropDown() {
        utils.click(currenciesDropDown);
        return this;
    }

    public String getCurrentCurrencyName() {
        return utils.getText(currentCurrency);
    }

    public Header clickOnUSD() {
        utils.click(USD);
        return this;
    }

    public Header clickOnBTC() {
        utils.click(BTC);
        return this;
    }

    public Header clickOnETH() {
        utils.click(ETH);
        return this;
    }

    public Header clickOnAMD() {
        utils.click(AMD);
        return this;
    }

    public Header clickOnAUD() {
        utils.click(AUD);
        return this;
    }

    public Header clickOnBGN() {
        utils.click(BGN);
        return this;
    }

    public Header clickOnBRL() {
        utils.click(BRL);
        return this;
    }

    public Header clickOnCAD() {
        utils.click(CAD);
        return this;
    }

    public Header clickOnCHF() {
        utils.click(CHF);
        return this;
    }

    public Header clickOnCNY() {
        utils.click(CNY);
        return this;
    }

    public Header clickOnCZK() {
        utils.click(CZK);
        return this;
    }

    public Header clickOnDKK() {
        utils.click(DKK);
        return this;
    }

    public Header clickOnEUR() {
        utils.click(EUR);
        return this;
    }

    public Header clickOnGBP() {
        utils.click(GBP);
        return this;
    }

    public Header clickOnHKD() {
        utils.click(HKD);
        return this;
    }

    public Header clickOnHRK() {
        utils.click(HRK);
        return this;
    }

    public Header clickOnHUF() {
        utils.click(HUF);
        return this;
    }

    public Header clickOnIDR() {
        utils.click(IDR);
        return this;
    }

    public Header clickOnILS() {
        utils.click(ILS);
        return this;
    }

    public Header clickOnINR() {
        utils.click(INR);
        return this;
    }

    public Header clickOnISK() {
        utils.click(ISK);
        return this;
    }

    public Header clickOnJPY() {
        utils.click(JPY);
        return this;
    }

    public Header clickOnKRW() {
        utils.click(KRW);
        return this;
    }

    public Header clickOnMXN() {
        utils.click(MXN);
        return this;
    }

    public Header clickOnMYR() {
        utils.click(MYR);
        return this;
    }

    public Header clickOnNOK() {
        utils.click(NOK);
        return this;
    }

    public Header clickOnNZD() {
        utils.click(NZD);
        return this;
    }

    public Header clickOnPHP() {
        utils.click(PHP);
        return this;
    }

    public Header clickOnPLN() {
        utils.click(PLN);
        return this;
    }

    public Header clickOnRON() {
        utils.click(RON);
        return this;
    }

    public Header clickOnRUB() {
        utils.click(RUB);
        return this;
    }

    public Header clickOnSEK() {
        utils.click(SEK);
        return this;
    }

    public Header clickOnSGD() {
        utils.click(SGD);
        return this;
    }

    public Header clickOnTHB() {
        utils.click(THB);
        return this;
    }

    public Header clickOnTRY() {
        utils.click(TRY);
        return this;
    }

    public Header clickOnZAR() {
        utils.click(ZAR);
        return this;
    }


    // Languages

    public Header clickOnLanguagesDropDown() {
        utils.click(languagesDropDown);
        return this;
    }

    public String getCurrentLanguageName() {
        return utils.getText(currentLanguage);
    }

    public Header clickOnEnglish() {
        utils.click(english);
        return this;
    }

    public Header clickOnGerman() {
        utils.click(german);
        return this;
    }

    public Header clickOnKorean() {
        utils.click(korean);
        return this;
    }

    public Header clickOnJapanese() {
        utils.click(japanese);
        return this;
    }

    public Header clickOnChinese() {
        utils.click(chinese);
        return this;
    }

    public Header clickOnSpanish() {
        utils.click(spanish);
        return this;
    }

    public Header clickOnFrench() {
        utils.click(french);
        return this;
    }

    public Header clickOnArmenian() {
        utils.click(armenian);
        return this;
    }

    public Header clickOnDutch() {
        utils.click(dutch);
        return this;
    }

    public Header clickOnRussian() {
        utils.click(russian);
        return this;
    }

    public Header clickOnItalian() {
        utils.click(italian);
        return this;
    }

    public Header clickOnPortuguese() {
        utils.click(portuguese);
        return this;
    }

    public Header clickOnTurkish() {
        utils.click(turkish);
        return this;
    }


    // Search field

    public Header openSearchField() {
        utils.click(searchFieldMinScreen);
        return this;
    }

    public Header typeInSearchField(String searchString) {
        utils.sendKeysAction(searchFieldMaxScreen, searchString);
        return this;
    }

    public Header clearSearchField() {
        utils.clear(searchFieldMaxScreen);
        return this;
    }

    public Header clickOnFirstSearchCoinResult() {
        utils.click(firstSearchCoinResult);
        return this;
    }

    public Header clickOnFirstSearchExchangeResult() {
        utils.click(firstSearchExchangeResult);
        return this;
    }


    public Header clickOnLogin() {
        utils.click(login);
        return this;
    }

    public Boolean loginIsDisplayed() {
        return utils.isDisplayed(login);
    }

    public Header clickOnGetStarted() {
        utils.click(getStarted);
        return this;
    }

    public Boolean getStartedIsDisplayed() {
        return utils.isDisplayed(getStarted);
    }

    public Header clickOnAccountDropDown() {
        utils.click(accountDropDown);
        return this;
    }

    public Boolean accountDropDownIsDisplayed() {
        return utils.isDisplayed(accountDropDown);
    }

    public String getCurrentAccountName() {
        return utils.getText(currentAccountName);
    }


    // Account DropDown

    public Header clickOnBecomePro() {
        utils.click(becomePro);
        return this;
    }

    public Boolean becomeProIsDisplayed() {
        return utils.isDisplayed(becomePro);
    }

    public Header clickOnSettings() {
        utils.click(settings);
        return this;
    }

    public Header clickOnSignOut() {
        utils.click(signOut);
        return this;
    }


    // ----------------------------------------------- Scripts ------------------------------------------------

    public Header searchAnyCoin(String coinName) {
        typeInSearchField(coinName);
        clickOnFirstSearchCoinResult();
        return this;
    }

    public Header searchAnyExchange(String exchangeName) {
        typeInSearchField(exchangeName);
        clickOnFirstSearchExchangeResult();
        return this;
    }

}