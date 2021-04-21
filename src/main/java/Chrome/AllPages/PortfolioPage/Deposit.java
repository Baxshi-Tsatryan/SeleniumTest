package Chrome.AllPages.PortfolioPage;

import Chrome.MainPackage.ChromeDriver;
import Chrome.MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Deposit extends ChromeDriver {

    WebDriver driver;
    SeleniumUtils utils;

    public Deposit(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    By currentPortfolio = By.cssSelector("div.api-key-modal-content .table-row");

    By portfolioNameDropDown = By.cssSelector("div.api-key-modal-content > .jsx-3873611852 > .jsx-1751315535 > .jsx-1751315535");

    By currentCoin = By.cssSelector(".search-dropdown-enable-placeholder");

    By coinClearIcon = By.cssSelector(".icon-clear");

    By coinSearchField = By.cssSelector("input.jsx-931209423");

    By firstCoinResult = By.cssSelector("ul.jsx-931209423 > li:nth-of-type(1) .table-row");

    By currentDepositAddress = By.cssSelector("#__next > main > div > div > div.jsx-271685889.portfolio-container.show > div.jsx-271685889.overview-container > div.jsx-271685889.right-section > div.jsx-4109874676.universal-modal.additional-info-modal > div > div > div.jsx-4109874676.changing-content-wrapper > div > div > div.jsx-3873611852.api-key-container > div > input");

    By copyAddress = By.cssSelector("g[transform='translate(368 29) translate(3 2)']");

    By QRCode = By.cssSelector("svg[shape-rendering='crispEdges']");

    By addressTab = By.cssSelector("");

    By addressTabCopy = By.cssSelector("");


    // ----------------------------------------------- Methods --------------------------------------------------

    public String getCurrentPortfolio() {
        return utils.getText(currentPortfolio);
    }

    public Deposit clickOnPortfolioDropDown() {
        utils.click(portfolioNameDropDown);
        return this;
    }

    public String getCurrentCoin() {
        return utils.getText(currentCoin);
    }

    public Deposit clickOnCurrentCoin() {
        utils.click(currentCoin);
        return this;
    }

    public Deposit typeCoinName(String coinName) {
        utils.sendKeys(coinSearchField, coinName);
        return this;
    }

    public Deposit clearCoinName() {
        utils.clear(coinSearchField);
        return this;
    }

    public Deposit clickOnFirstCoinResult() {
        utils.click(firstCoinResult);
        return this;
    }

    public String getDepositAddress() {
        return utils.getText(currentDepositAddress);
    }

    public Deposit clickOnCopy() {
        utils.click(copyAddress);
        return this;
    }


    // -------------------------------------------- Scripts ------------------------------------------------------

    public void selectAnyPortfolio(String portfolioName) {
        int index = 1;
        clickOnPortfolioDropDown();
        String allPortfolios;

        try {
            allPortfolios = driver.findElement(By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(" + index + ") .table-row")).getText();
        } catch (NoSuchElementException e) {
            System.out.println("There isn't" + portfolioName + " portfolio");
            return;
        }
        do {
            if (allPortfolios.equals(portfolioName)) {
                utils.click(By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(" + index + ") .table-row"));
                return;
            }

            index++;
        } while (true);
    }
}
