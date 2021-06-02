package chrome.allPages.portfolioPage;

import chrome.mainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PortfolioPageWhenNotLogin {
    WebDriver driver;
    SeleniumUtils utils;

    public PortfolioPageWhenNotLogin(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    By connectExchange = By.cssSelector("div.empty-portfolio-container > .items-container > div:nth-of-type(1)");

    By connectWallet = By.cssSelector("div.empty-portfolio-container > .items-container > div:nth-of-type(2)");

    By connectToMetamask = By.cssSelector("div.empty-portfolio-container > .jsx-3625133709 > div:nth-of-type(3)");

    By connectToLedger = By.cssSelector("div.empty-portfolio-container > .jsx-3625133709 > div:nth-of-type(4)");

    By connectToTrezor = By.cssSelector("div.empty-portfolio-container > .jsx-3625133709 > div:nth-of-type(5)"); // div.empty-portfolio-container div:nth-of-type(5)

    By addManualTransaction = By.cssSelector(".manual.items-container > div:nth-of-type(1)");

    By addManualPortfolio = By.cssSelector(".manual.items-container > div:nth-of-type(2)");


    // ------------------------------------------------- Methods --------------------------------------------

    // Connect Exchange/Wallet

    public PortfolioPageWhenNotLogin clickOnConnectExchange() {
        utils.click(connectExchange);
        return this;
    }

    public PortfolioPageWhenNotLogin clickOnConnectWallet() {
        utils.click(connectWallet);
        return this;
    }

    public PortfolioPageWhenNotLogin clickOnConnectToMetamask() {
        utils.click(connectToMetamask);
        return this;
    }

    public PortfolioPageWhenNotLogin clickOnConnectToLedger() {
        utils.click(connectToLedger);
        return this;
    }

    public PortfolioPageWhenNotLogin clickOnConnectToTrezor() {
        utils.click(connectToTrezor);
        return this;
    }


    // Manual Transactions

    public PortfolioPageWhenNotLogin clickOnAddManualTransaction() {
        utils.click(addManualTransaction);
        return this;
    }

    public PortfolioPageWhenNotLogin clickOnAddManualPortfolio() {
        utils.click(addManualPortfolio);
        return this;
    }

}
