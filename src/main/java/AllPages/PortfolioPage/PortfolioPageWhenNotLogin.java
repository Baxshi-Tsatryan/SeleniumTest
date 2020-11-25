package AllPages.PortfolioPage;

import MainPackage.SeleniumUtils;
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

    public void clickOnConnectExchange()
    {
        utils.clickOnElement(connectExchange);
    }

    public void clickOnConnectWallet()
    {
        utils.clickOnElement(connectWallet);
    }

    public void clickOnConnectToMetamask()
    {
        utils.clickOnElement(connectToMetamask);
    }

    public void clickOnConnectToLedger()
    {
        utils.clickOnElement(connectToLedger);
    }

    public void clickOnConnectToTrezor()
    {
        utils.clickOnElement(connectToTrezor);
    }


    // Manual Transactions

    public void clickOnAddManualTransaction()
    {
        utils.clickOnElement(addManualTransaction);
    }

    public void clickOnAddManualPortfolio()
    {
        utils.clickOnElement(addManualPortfolio);
    }

}
