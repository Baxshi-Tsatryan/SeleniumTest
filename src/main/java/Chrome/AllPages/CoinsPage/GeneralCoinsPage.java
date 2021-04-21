package Chrome.AllPages.CoinsPage;

import Chrome.MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeneralCoinsPage {
    WebDriver driver;
    SeleniumUtils utils;

    public GeneralCoinsPage(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    By iconClose = By.cssSelector(".icon-close");

    By coinName = By.xpath("//*[@id='__next']/main/section/div/div[1]/div[1]/div[3]/div[1]/h1");

    By coinSecondName = By.cssSelector("p.coin-description > span:nth-of-type(1)");

    By coinIndex = By.cssSelector(".show-desktop.name-wrapper > .jsx-226630945");

    By coinPrice = By.cssSelector("div.big > .show-desktop > .main-price");

    By coinPercent = By.cssSelector("div.big .jsx-544775375");

    By coinPriceBTC = By.cssSelector("div.main-info-wrapper .show-desktop > .jsx-544775375");

    By coinPercentBTC = By.cssSelector("div.main-info-wrapper > div:nth-of-type(3) span:nth-of-type(2)");

    By marketCapPrice = By.cssSelector("div.item-previewer > div:nth-of-type(2) > div:nth-of-type(1) > .jsx-544775375");

    By volume24hPrice = By.cssSelector("div.item-previewer > div:nth-of-type(2) > div:nth-of-type(3) > .jsx-544775375");

    By availableSupply = By.cssSelector("div.item-previewer > div:nth-of-type(3) > div:nth-of-type(1) > .jsx-544775375");

    By totalSupply = By.cssSelector("div.item-previewer > div:nth-of-type(3) > div:nth-of-type(3) > .jsx-544775375");

    By coinWebsite = By.cssSelector("#__next > main > section > div > div.jsx-1002317834.item-previewer > div.jsx-213344483.social-column > div:nth-child(1) > div > div > a");

    By coinTwitter = By.cssSelector("#__next > main > section > div > div.jsx-1002317834.item-previewer > div.jsx-213344483.social-column > div:nth-child(2) > div > div:nth-child(1) > a");

    By coinReddit = By.cssSelector("#__next > main > section > div > div.jsx-1002317834.item-previewer > div.jsx-213344483.social-column > div:nth-child(2) > div > div:nth-child(2) > a");

    By coinTelegram = By.cssSelector("#__next > main > section > div > div.jsx-1002317834.item-previewer > div.jsx-213344483.social-column > div:nth-child(2) > div > div:nth-child(3) > a");

    By coinBitcointalk = By.cssSelector("div.item-previewer > .jsx-3134332359 > div:nth-of-type(1) > span:nth-of-type(2)");


    By explorersDropDown = By.cssSelector(".explorers > .jsx-3397508174 > .jsx-3397508174 > .jsx-3397508174");

    By contractAddress = By.cssSelector(".contracts .filter-value");

    By copyContractAddress = By.cssSelector(".icon-copy-icon");

    By contractAddressDropDown = By.cssSelector(".contract-row > .jsx-3397508174 > .jsx-3397508174 > .jsx-3397508174");


    By addRemoveFavorites = By.cssSelector("[title='Add a coin to your favorites list ']");

    By enableDisableAlerts = By.cssSelector(".show-desktop.alert-icon > .jsx-1002317834");

    By addTransactionButton = By.cssSelector("div.coininfo-buttons-container > button:nth-of-type(1)");

    By tradeCoinButton = By.cssSelector("div.coininfo-buttons-container > button:nth-of-type(2)");

    By buyCoinButton = By.cssSelector("div.coininfo-buttons-container > button:nth-of-type(3)");


    // Tabs

    By overviewTab = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-tabs-wrapper > div > ul > li.active-tab > a");

    By newsTab = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-tabs-wrapper > div > ul > li:nth-child(2) > a");

    By marketsTab = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-tabs-wrapper > div > ul > li:nth-child(3) > a");

    By holdingsTab = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-tabs-wrapper > div > ul > li:nth-child(4) > a");

    By teamUpdatesTab = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-tabs-wrapper > div > ul > li:nth-child(5) > a");

    By onChainDataTab = By.cssSelector("#__next > main > section > div > div.coin-info-inner-wrapper > div.coin-info-tabs-wrapper > div > ul > li:nth-child(6) > a");

    By widgetButton = By.cssSelector("button.show-desktop");


    // ----------------------------------------------------- Methods -------------------------------------------------

    public GeneralCoinsPage clickOnCloseIcon() {
        utils.click(iconClose);
        return this;
    }

    public String getCoinName() {
        return utils.getText(coinName);
    }

    public String getCoinSecondName() {
        return utils.getText(coinSecondName);
    }

    public String getCoinIndex() {
        return utils.getText(coinIndex);
    }

    public String getCoinPrice() {
        return utils.getText(coinPrice);
    }

    public String getCoinPercent() {
        return utils.getText(coinPercent);
    }

    public String getCoinPercentColor() {
        return utils.getCSSValue(coinPercent, "color");
    }

    public String getCoinPriceBTC() {
        return utils.getText(coinPriceBTC);
    }

    public String getCoinPercentBTC() {
        return utils.getText(coinPercentBTC);
    }

    public String getCoinPercentBTCColor() {
        return utils.getCSSValue(coinPercentBTC, "color");
    }

    public String getMarketCap() {
        return utils.getText(marketCapPrice);
    }

    public String getVolume24h() {
        return utils.getText(volume24hPrice);
    }

    public String getAvailableSupply() {
        return utils.getText(availableSupply);
    }

    public String getTotalSupply() {
        return utils.getText(totalSupply);
    }


    public GeneralCoinsPage clickOnWebsite() {
        utils.click(coinWebsite);
        return this;
    }

    public GeneralCoinsPage clickOnTwitter(){
        utils.click(coinTwitter);
        return this;
    }

    public GeneralCoinsPage clickOnReddit(){
        utils.click(coinReddit);
        return this;
    }

    public GeneralCoinsPage clickOnTelegram(){
        utils.click(coinTelegram);
        return this;
    }

    public GeneralCoinsPage clickOnBitcointalk(){
        utils.click(coinBitcointalk);
        return this;
    }

    public Boolean explorersDropDownIsDisplayed(){
        return utils.isDisplayed(explorersDropDown);
    }

    public GeneralCoinsPage clickOnExplorersDropDown(){
        utils.click(explorersDropDown);
        return this;
    }

    public GeneralCoinsPage getAllExplorersNames(){
        int i = 1;
        do {
            try {
                System.out.println(driver.findElement(By.cssSelector("#__next > main > section > div > div.jsx-1002317834.item-previewer > div.jsx-213344483.social-column > div.jsx-213344483.row.explorers > div.jsx-213344483.list > div:nth-child(" + i + ") > a")).getText());
            } catch (Exception e) {
                break;
            }
            i++;
        }
        while (true);

        if(explorersDropDownIsDisplayed() == true){
            clickOnExplorersDropDown();
            int j = 1;

            do{
                try {
                    System.out.println(driver.findElement(By.cssSelector("#__next > main > section > div > div.jsx-1002317834.item-previewer > div.jsx-213344483.social-column > div.jsx-213344483.row.explorers > div.jsx-3397508174.table-more-menu > div.jsx-3397508174.more-menu-wrapper.undefined > div:nth-child(" + j + ") > span > a")).getText());
                } catch (Exception e) {
                    break;
                }
                j++;
            }
            while (true);
        }

        return this;
    }

    public Boolean contractAddressIsDisplayed(){
        return utils.isDisplayed(contractAddress);
    }

    public GeneralCoinsPage clickOnContractAddressCopyButton(){
        utils.click(copyContractAddress);
        return this;
    }

    public GeneralCoinsPage getContractAddress(){
        utils.getText(contractAddress);
        return this;
    }

    public Boolean contractAddressDropDownIsDisplayed(){
        return utils.isDisplayed(contractAddressDropDown);
    }

    public GeneralCoinsPage clickOnContractAddressDropDown(){
        utils.getText(contractAddress);
        return this;
    }

    public GeneralCoinsPage getAllContractAddressNamesAndAddresses(){
        if(contractAddressDropDownIsDisplayed() == true)
        {
            clickOnContractAddressDropDown();
            int i = 1;
            do{
                try {
                    System.out.println(driver.findElement(By.cssSelector(".more-menu-wrapper > div:nth-of-type(" + i + ") .jsx-213344483 > div:nth-of-type(1) > div:nth-of-type(1)")).getText());
                    System.out.println(driver.findElement(By.cssSelector(".more-menu-wrapper > div:nth-of-type(" + i + ") .light")));
                    driver.findElement(By.cssSelector(".more-menu-wrapper > div:nth-of-type(" + i + ") .jsx-1808485698 > .jsx-1808485698 > .jsx-1808485698")).click();
                }catch (Exception e){
                    break;
                }
            }while (true);
            i++;
        }
        return this;
    }


    public GeneralCoinsPage clickOnAddRemoveFavorite(){
        utils.click(addRemoveFavorites);
        return this;
    }

    public GeneralCoinsPage clickOnEnableDisableAlerts(){
        utils.click(enableDisableAlerts);
        return this;
    }

    public GeneralCoinsPage clickOnAddTransaction() {
        utils.click(addTransactionButton);
        return this;
    }

    public GeneralCoinsPage clickOnTradeCoin() {
        utils.click(tradeCoinButton);
        return this;
    }

    public GeneralCoinsPage clickOnBuyCoin() {
        utils.click(buyCoinButton);
        return this;
    }

    // Tabs

    public GeneralCoinsPage clickOnOverviewTab() {
        utils.click(overviewTab);
        return this;
    }

    public GeneralCoinsPage clickOnNewsTab() {
        utils.click(newsTab);
        return this;
    }

    public GeneralCoinsPage clickOnMarketsTab() {
        utils.click(marketsTab);
        return this;
    }

    public GeneralCoinsPage clickOnHoldingsTab() {
        utils.click(holdingsTab);
        return this;
    }

    public GeneralCoinsPage clickOnTeamUpdatesTab() {
        utils.click(teamUpdatesTab);
        return this;
    }

    public GeneralCoinsPage clickOnOnChainDataTab() {
        utils.click(onChainDataTab);
        return this;
    }

    public GeneralCoinsPage clickOnWidget() {
        utils.click(widgetButton);
        return this;
    }

}
