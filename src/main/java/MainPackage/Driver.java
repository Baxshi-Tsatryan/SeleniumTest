package MainPackage;

import AllPages.Alerts;
import AllPages.CoinsPage.GeneralCoinsPage;
import AllPages.CoinsPage.Overview;
import AllPages.ExchangesPage.GeneralExchangePage;
import AllPages.MainPage.CoinsFavoritesExchangesHeatmap;
import AllPages.MainPage.Header;
import AllPages.MarketCap;
import AllPages.PortfolioPage.*;
import AllPages.Report24h;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Driver {

    public WebDriver driver;
    public SeleniumUtils utils;
    public AllURLs allURLs;
    public ExchangesWalletsAPIs exchangesWalletsAPIs;
    public Paths paths;
    public GeneralCoinsPage generalCoinsPage;
    public Overview overview;
    public GeneralExchangePage generalExchangePage;
    public AllPages.ExchangesPage.Overview overviewExchange;
    public CoinsFavoritesExchangesHeatmap coinsFavoritesExchangesHeatmap;
    public Header header;
    public AddPortfolio addPortfolio;
    public AddTransactions addTransactions;
    public Deposit deposit;
    public EditPortfolios editPortfolios;
    public GeneralPortfolioHoldingsLiquidity generalPortfolioHoldingsLiquidity;
    public LeftSideOfPagePortfolios leftSideOfPagePortfolios;
    public PortfolioPageWhenNotLogin portfolioPageWhenNotLogin;
    public TradesTransactionsOpenOrders tradesTransactionsOpenOrders;
    public Alerts alerts;
    public MarketCap marketCap;
    public Report24h report24h;

    @BeforeSuite
    public void DriverBeforeSuit()
    {
        String chromeDriverName = "webdriver.chrome.driver";
        String chromeDriverPath = "//Users//baxshi//IdeaProjects//SeleniumTest//src//main//resources//chromedriver";
        System.setProperty(chromeDriverName,chromeDriverPath);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        options.setExperimentalOption("prefs", prefs);

        utils = new SeleniumUtils(driver);
        allURLs = new AllURLs(driver);
        exchangesWalletsAPIs = new ExchangesWalletsAPIs(driver);
        paths = new Paths(driver);
        generalCoinsPage = new GeneralCoinsPage(driver);
        overview = new Overview(driver);
        generalExchangePage = new GeneralExchangePage(driver);
        overviewExchange = new AllPages.ExchangesPage.Overview(driver);
        coinsFavoritesExchangesHeatmap = new CoinsFavoritesExchangesHeatmap(driver);
        header = new Header(driver);
        addPortfolio = new AddPortfolio(driver);
        addTransactions = new AddTransactions(driver);
        deposit = new Deposit(driver);
        editPortfolios = new EditPortfolios(driver);
        generalPortfolioHoldingsLiquidity = new GeneralPortfolioHoldingsLiquidity(driver);
        leftSideOfPagePortfolios = new LeftSideOfPagePortfolios(driver);
        portfolioPageWhenNotLogin = new PortfolioPageWhenNotLogin(driver);
        tradesTransactionsOpenOrders = new TradesTransactionsOpenOrders(driver);
        alerts = new Alerts(driver);
        marketCap = new MarketCap(driver);
        report24h = new Report24h(driver);

        // ChromeDriver
        this.driver = new ChromeDriver();

        // TimeOut
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void QuitDriver()
    {
        driver.quit();
    }
}



