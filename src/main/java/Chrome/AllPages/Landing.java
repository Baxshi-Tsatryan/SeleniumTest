package Chrome.AllPages;

import Chrome.MainPackage.SeleniumUtils;
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

    public Landing clickOnGetStartedTop() {
        utils.click(getStartedButtonTop);
        return this;
    }

    public Landing clickOnKevinRoseTwitter() {
        utils.click(kevinRoseTwitter);
        return this;
    }


    // Exchanges / Wallets buttons

    public Landing clickOnBinance() {
        utils.click(binance);
        return this;
    }

    public Landing clickOnCoinbase() {
        utils.click(coinbase);
        return this;
    }

    public Landing clickOnEthereum() {
        utils.click(ethereum);
        return this;
    }

    public Landing clickOnLedger() {
        utils.click(ledger);
        return this;
    }

    public Landing clickOnMetamask() {
        utils.click(metamask);
        return this;
    }

    public Landing clickOnMoreButton() {
        utils.click(moreButton);
        return this;
    }


    // Testimonials

    public Landing clickOnSebastianGronewoldTwitter() {
        utils.click(sebastianGronewoldTwitter);
        return this;
    }

    public Landing clickOnTyDanielSmithTwitter() {
        utils.click(tyDanielSmithTwitter);
        return this;
    }

    public Landing clickOnAdelDeMeyerTwitter() {
        utils.click(adelDeMeyerTwitter);
        return this;
    }


    // Media buttons

    public Landing clickOnYahooFinance() {
        utils.click(yahooFinance);
        return this;
    }

    public Landing clickOnCryptoslate() {
        utils.click(cryptoSlate);
        return this;
    }

    public Landing clickOnCryptoglobe() {
        utils.click(cryptoGlobe);
        return this;
    }

    public Landing clickOnHackernoon() {
        utils.click(hackernoon);
        return this;
    }

    public Landing clickOnProductHunt() {
        utils.click(productHunt);
        return this;
    }


    public Landing clickOnGetStartedBottom() {
        utils.click(getStartedButtonBottom);
        return this;
    }

}
