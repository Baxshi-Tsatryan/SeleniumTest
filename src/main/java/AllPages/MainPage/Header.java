package AllPages.MainPage;

import MainPackage.AllURLs;
import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header{

    WebDriver driver;
    SeleniumUtils utils;
    AllURLs allURLs;

    public Header(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
        allURLs = new AllURLs(driver);
    }


    By iconButton = By.cssSelector(".icon-logo");

    By lightDarkModeSelector = By .cssSelector("i");

    By portfolioTracker = By.cssSelector(".portfolio-tab");

    By livePrices = By.cssSelector("nav.nav-items > [href='/en/']");

    By news = By.cssSelector("nav.nav-items > [href='/en/news/']");

    By pricing = By.cssSelector("nav.nav-items > [href='/en/pricing/']");

    By threeDotButton = By.cssSelector(".icon-more_big");


    // In 3 dot button

    By report24 = By.cssSelector("div.section-bar [href='/en/market-report/']");

    By pressKit = By.cssSelector("div.section-bar [href='/en/press-kit/']");

    By APIDocs = By.cssSelector("a[href='https://apidocs.coinstats.app']");

    By blog = By.cssSelector("a[href='https://blog.coinstats.app']");

    By widgets = By.cssSelector("a[href='/en/widgets/']");

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


    By getStarted = By.cssSelector("div.header-inner-wrapper .jsx-1426819953");

    By accountDropDown = By.cssSelector(".user-drop");

    By currentAccountName = By.cssSelector("div.user-drop .primary-nav");


    // Account DropDown

    By becomePro = By.xpath("//div[.='Become Pro']");

    By settings = By.xpath("//a[.='Settings']");

    By signOut = By.xpath("//span[.='Sign Out']");

    By noThanks = By.cssSelector("#onesignal-slidedown-cancel-button");

    // -------------------------------------------- Methods -----------------------------------------------

    public void clickOnNoThanks()
    {
        utils.clickOnElement(noThanks);
    }

    public void clickOnIcon()
    {
        utils.clickOnElement(iconButton);
    }

    public void clickOnLightMode()
    {
        utils.clickOnElement(lightDarkModeSelector);
    }

    public Boolean lightDarkModeIsEnabled()
    {
        return utils.isEnabled(lightDarkModeSelector);
    }

    public Boolean lightDarkModeIsSelected()
    {
        return utils.isSelected(lightDarkModeSelector);
    }

    public void clickOnPortfolioTracker()
    {
        utils.clickOnElement(portfolioTracker);
    }

    public void clickOnLivePrices()
    {
        utils.clickOnElement(livePrices);
    }

    public void clickOnNews()
    {
        utils.clickOnElement(news);
    }

    public void clickOnPricing()
    {
        utils.clickOnElement(pricing);
    }

    public void clickOn3DotButton()
    {
        utils.clickOnElement(threeDotButton);
    }


    // 3 dot button

    public void clickOn24hReport()
    {
        utils.clickOnElement(report24);
    }

    public void clickOnPressKit()
    {
        utils.clickOnElement(pressKit);
    }

    public void clickOnAPIDocs()
    {
        utils.clickOnElement(APIDocs);
    }

    public void clickOnBlog()
    {
        utils.clickOnElement(blog);
    }

    public void clickOnWidgets()
    {
        utils.clickOnElement(widgets);
    }

    public void clickOnAppStore()
    {
        utils.clickOnElement(appStore);
    }

    public void clickOnGooglePlay()
    {
        utils.clickOnElement(googlePlay);
    }


    // Currencies

    public void clickOnCurrenciesDropDown()
    {
        utils.clickOnElement(currenciesDropDown);
    }

    public String getCurrentCurrencyName()
    {
        return utils.getText(currentCurrency);
    }

    public void clickOnUSD()
    {
        utils.clickOnElement(USD);
    }

    public void clickOnBTC()
    {
        utils.clickOnElement(BTC);
    }

    public void clickOnETH()
    {
        utils.clickOnElement(ETH);
    }

    public void clickOnAMD()
    {
        utils.clickOnElement(AMD);
    }

    public void clickOnAUD()
    {
        utils.clickOnElement(AUD);
    }

    public void clickOnBGN()
    {
        utils.clickOnElement(BGN);
    }

    public void clickOnBRL()
    {
        utils.clickOnElement(BRL);
    }

    public void clickOnCAD()
    {
        utils.clickOnElement(CAD);
    }

    public void clickOnCHF()
    {
        utils.clickOnElement(CHF);
    }

    public void clickOnCNY()
    {
        utils.clickOnElement(CNY);
    }

    public void clickOnCZK()
    {
        utils.clickOnElement(CZK);
    }

    public void clickOnDKK()
    {
        utils.clickOnElement(DKK);
    }

    public void clickOnEUR()
    {
        utils.clickOnElement(EUR);
    }

    public void clickOnGBP()
    {
        utils.clickOnElement(GBP);
    }

    public void clickOnHKD()
    {
        utils.clickOnElement(HKD);
    }

    public void clickOnHRK()
    {
        utils.clickOnElement(HRK);
    }

    public void clickOnHUF()
    {
        utils.clickOnElement(HUF);
    }

    public void clickOnIDR()
    {
        utils.clickOnElement(IDR);
    }

    public void clickOnILS()
    {
        utils.clickOnElement(ILS);
    }

    public void clickOnINR()
    {
        utils.clickOnElement(INR);
    }

    public void clickOnISK()
    {
        utils.clickOnElement(ISK);
    }

    public void clickOnJPY()
    {
        utils.clickOnElement(JPY);
    }

    public void clickOnKRW()
    {
        utils.clickOnElement(KRW);
    }

    public void clickOnMXN()
    {
        utils.clickOnElement(MXN);
    }

    public void clickOnMYR()
    {
        utils.clickOnElement(MYR);
    }

    public void clickOnNOK()
    {
        utils.clickOnElement(NOK);
    }

    public void clickOnNZD()
    {
        utils.clickOnElement(NZD);
    }

    public void clickOnPHP()
    {
        utils.clickOnElement(PHP);
    }

    public void clickOnPLN()
    {
        utils.clickOnElement(PLN);
    }

    public void clickOnRON()
    {
        utils.clickOnElement(RON);
    }

    public void clickOnRUB()
    {
        utils.clickOnElement(RUB);
    }

    public void clickOnSEK()
    {
        utils.clickOnElement(SEK);
    }

    public void clickOnSGD()
    {
        utils.clickOnElement(SGD);
    }

    public void clickOnTHB()
    {
        utils.clickOnElement(THB);
    }

    public void clickOnTRY()
    {
        utils.clickOnElement(TRY);
    }

    public void clickOnZAR()
    {
        utils.clickOnElement(ZAR);
    }


    // Languages

    public void clickOnLanguagesDropDown()
    {
        utils.clickOnElement(languagesDropDown);
    }

    public String getCurrentLanguageName()
    {
        return utils.getText(currentLanguage);
    }

    public void clickOnEnglish()
    {
        utils.clickOnElement(english);
    }

    public void clickOnGerman()
    {
        utils.clickOnElement(german);
    }

    public void clickOnKorean()
    {
        utils.clickOnElement(korean);
    }

    public void clickOnJapanese()
    {
        utils.clickOnElement(japanese);
    }

    public void clickOnChinese()
    {
        utils.clickOnElement(chinese);
    }

    public void clickOnSpanish()
    {
        utils.clickOnElement(spanish);
    }

    public void clickOnFrench()
    {
        utils.clickOnElement(french);
    }

    public void clickOnArmenian()
    {
        utils.clickOnElement(armenian);
    }

    public void clickOnDutch()
    {
        utils.clickOnElement(dutch);
    }

    public void clickOnRussian()
    {
        utils.clickOnElement(russian);
    }

    public void clickOnItalian()
    {
        utils.clickOnElement(italian);
    }

    public void clickOnPortuguese()
    {
        utils.clickOnElement(portuguese);
    }

    public void clickOnTurkish()
    {
        utils.clickOnElement(turkish);
    }

    public void openSearchField()
    {
        utils.clickOnElement(searchFieldMinScreen);
    }

    public void typeInSearchField(String searchString)
    {
        utils.sendKeysAction(searchFieldMaxScreen, searchString);
    }

    public void clearFromSearchField()
    {
        utils.clear(searchFieldMaxScreen);
    }


    public void clickOnGetStarted()
    {
        utils.clickOnElement(getStarted);
    }

    public Boolean getStartedIsDisplayed()
    {
        return utils.isDisplayed(getStarted);
    }

    public void clickOnAccountDropDown()
    {
        utils.clickOnElement(accountDropDown);
    }

    public Boolean accountDropDownIsDisplayed()
    {
        return utils.isDisplayed(accountDropDown);
    }

    public String getCurrentAccountName()
    {
        return utils.getText(currentAccountName);
    }


    // Account DropDown

    public void clickOnBecomePro()
    {
        utils.clickOnElement(becomePro);
    }

    public Boolean becomeProIsDisplayed()
    {
        return utils.isDisplayed(becomePro);
    }

    public void clickOnSettings()
    {
        utils.clickOnElement(settings);
    }

    public void clickOnSignOut()
    {
        utils.clickOnElement(signOut);
    }

}

//    public void clickOnAllCurrencies()
//    {
//        int index = 1;
//
//        do {
//
//            utils.clickOnElement(currenciesDropDown);
//            driver.findElement(By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(" + index + ")")).click();
//
//            index++;
//
//        } while(index != 37);
//    }





// Search several results (Coins)
// int index = 1;

// Thread.sleep(3000);

// By alertWindowBy = By.cssSelector("#onesignal-slidedown-cancel-button");
// WebElement alertWindow = driver.findElement(alertWindowBy);
// alertWindow.click();

// driver.manage().window().maximize();

// do {

// // By testBy = By.cssSelector(".text-box-wrapper");
// // WebElement test = driver.findElement(testBy);
// // test.click();

// By asdBy = By.cssSelector("[placeholder='Search']");
// WebElement asd = driver.findElement(asdBy);
// asd.sendKeys("Qt");

// Thread.sleep(2000);

// WebElement results = driver.findElement(By.cssSelector("#__next > main > header > div > div.header-wrapper.show-desktop > div > div.search-dropdowns-container > div.search-wrapper > div > div.jsx-550402856.result-wrapper > div > div:nth-child(2) > a:nth-child(" + index + ") > div"));
// actions.click(results).build().perform();

// index ++;

// Thread.sleep(2000);
// }
// while(index != 5);


// Search several results (Exchanges)

// int index = 1;

//  Thread.sleep(3000);

//  By alertWindowBy = By.cssSelector("#onesignal-slidedown-cancel-button");
//  WebElement alertWindow = driver.findElement(alertWindowBy);
//  alertWindow.click();

//  driver.manage().window().maximize();

//  do {

// // By testBy = By.cssSelector(".text-box-wrapper");
// // WebElement test = driver.findElement(testBy);
// // test.click();

// By asdBy = By.cssSelector("[placeholder='Search']");
// WebElement asd = driver.findElement(asdBy);
// asd.sendKeys("b");

// Thread.sleep(2000);

// WebElement results = driver.findElement(By.cssSelector("#__next > main > header > div > div.header-wrapper.show-desktop > div > div.search-dropdowns-container > div.search-wrapper > div > div.jsx-550402856.result-wrapper > div > div:nth-child(4) > a:nth-child(" + index + ") > div"));
// actions.click(results).build().perform();

// index ++;

// Thread.sleep(2000);
// }
//  while(index != 3);


//
//public void clickOnAllLanguages()
//{
//    int index = 1;
//
//    do{
//
//        utils.clickOnElement(languagesDropDown);
//        driver.findElement(By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(" + index + ")")).click();
//
//        index++;
//
//    } while(index != 14);
//}