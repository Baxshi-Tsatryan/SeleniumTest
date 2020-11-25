package AllPages;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landing {

    WebDriver driver;
    SeleniumUtils utils;

    public Landing(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    By getStartedButtonTop = By.cssSelector(".get-started-btn");

    By kevinRoseTwitter = By.cssSelector("div.images-section > .twitter-post-card");


    // Exchanges / Wallets buttons

    By binance = By.cssSelector("[alt='Sync Portfolio Binance']");

    By coinbase = By.cssSelector("[alt='Sync Portfolio Coinbase']");

    By ethereum = By.cssSelector("[alt='Sync Portfolio Ethereum']");

    By ledger = By.cssSelector("[alt='Sync Portfolio Ledger']");

    By metamask = By.cssSelector("[alt='Sync Portfolio Metamask']");

    By moreButton = By.cssSelector(".bordered");


    // Testimonials

    By sebastianGronewoldTwitter = By.cssSelector("div.testimonial-container > div:nth-of-type(1)");

    By tyDanielSmithTwitter = By.cssSelector("div.testimonial-container > div:nth-of-type(2)");

    By adelDeMeyerTwitter = By.cssSelector("div.testimonial-container > div:nth-of-type(3)");


    // Medium buttons

    By yahooFinance = By.cssSelector("[alt='Yahoo']");

    By cryptoSlate = By.cssSelector("[alt='Cryptoslate']");

    By cryptoGlobe = By.cssSelector("[alt='Cryptoglobe']");

    By hackernoon = By.cssSelector("[alt='Hackernoon']");

    By productHunt = By.cssSelector("[alt='ProductHunt']");

    By getStartedButtonBottom = By.cssSelector("button.jsx-4266659403");


    // ------------------------------------------ Methods -----------------------------------------------

    public void clickOnGetStartedTop()
    {
        utils.clickOnElement(getStartedButtonTop);
    }

    public void clickOnKevinRoseTwitter()
    {
        utils.clickOnElement(kevinRoseTwitter);
    }


    // Exchanges / Wallets buttons

    public void clickOnBinance()
    {
        utils.clickOnElement(binance);
    }

    public void clickOnCoinbase()
    {
        utils.clickOnElement(coinbase);
    }

    public void clickOnEthereum()
    {
        utils.clickOnElement(ethereum);
    }

    public void clickOnLedger()
    {
        utils.clickOnElement(ledger);
    }

    public void clickOnMetamask()
    {
        utils.clickOnElement(metamask);
    }

    public void clickOnMoreButton()
    {
        utils.clickOnElement(moreButton);
    }


    // Testimonials

    public void clickOnSebastianGronewoldTwitter()
    {
        utils.clickOnElement(sebastianGronewoldTwitter);
    }

    public void clickOnTyDanielSmithTwitter()
    {
        utils.clickOnElement(tyDanielSmithTwitter);
    }

    public void clickOnAdelDeMeyerTwitter()
    {
        utils.clickOnElement(adelDeMeyerTwitter);
    }


    // Media buttons

    public void clickOnYahooFinance()
    {
        utils.clickOnElement(yahooFinance);
    }

    public void clickOnCryptoslate()
    {
        utils.clickOnElement(cryptoSlate);
    }

    public void clickOnCryptoglobe()
    {
        utils.clickOnElement(cryptoGlobe);
    }

    public void clickOnHackernoon()
    {
        utils.clickOnElement(hackernoon);
    }

    public void clickOnProductHunt()
    {
        utils.clickOnElement(productHunt);
    }


    public void clickOnGetStartedBottom()
    {
        utils.clickOnElement(getStartedButtonBottom);
    }

}
