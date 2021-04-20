package Tests.AddPortfoliosTests;

import AllPages.PortfolioPage.AddPortfolio;
import AllPages.PortfolioPage.LeftSideOfPagePortfolios;
import MainPackage.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class AddAllExchangesPositive extends Driver {

    AddPortfolio addPortfolio;
    LeftSideOfPagePortfolios leftSideOfPagePortfolios;
    AllURLs allURLs;
    SeleniumUtils utils;
    Paths paths;
    ExchangesWalletsAPIs exchangesWalletsAPIs;
    DeleteAllPortfolios deleteAllPortfolios;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        addPortfolio = new AddPortfolio(driver);
        leftSideOfPagePortfolios = new LeftSideOfPagePortfolios(driver);
        paths = new Paths(driver);
        exchangesWalletsAPIs = new ExchangesWalletsAPIs(driver);
        deleteAllPortfolios = new DeleteAllPortfolios(driver);
    }

    @Test
    public void connectAllExchanges() throws InterruptedException {
        allURLs.navigateToPortfolioPage();
        utils.enableCookie();

        deleteAllPortfolios.deleteAllPortfolios();

        String firstAPI = "";
        String secondAPI = "";
        String thirdAPI = "";

        addPortfolio.clickOnAddPortfolio();
        addPortfolio.clickOnConnectExchange();

        List<WebElement> listTill = driver.findElements(By.className("qa-exchanges"));

        for (int i = 0; i < listTill.size(); i++) {

            List<WebElement> list = driver.findElements(By.className("qa-exchanges"));

            String exchangeName = list.get(i).getText();
            list.get(i).click();

            int loop = 0;

            Thread.sleep(1000);
            switch (exchangeName) {
                case "Binance US": {
                    firstAPI = exchangesWalletsAPIs.getBinanceUSAPIKey();
                    secondAPI = exchangesWalletsAPIs.getBinanceUSAPISecret();
                    loop = 2;
                    break;
                }

                case "Coinbase Pro":{
                    loop = 0;
                    break;
                }

                case "Crypto.com exchange":{
                    loop = 0;
                    break;
                }

                case "Bitbuy":{
                    loop = 0;
                    break;
                }

                case "Bitpanda Pro":{
                    loop = 0;
                    break;
                }

                case "Bitrue":{
                    loop = 0;
                    break;
                }

                case "Bitstamp":{
                    loop = 0;
                    break;
                }

                case "Currency.com":{
                    loop = 0;
                    break;
                }

                case "BitMax": {
                    firstAPI = exchangesWalletsAPIs.getBitmaxAPIKey();
                    secondAPI = exchangesWalletsAPIs.getBitmaxAPISecret();
                    loop = 2;
                    break;
                }

                case "Bittrex":{
                    firstAPI = exchangesWalletsAPIs.getBittrexAPIKey();
                    secondAPI = exchangesWalletsAPIs.getBittrexAPISecret();
                    loop = 2;
                    break;
                }

                case "Bitmex": {
                    firstAPI = exchangesWalletsAPIs.getBitmexID();
                    secondAPI = exchangesWalletsAPIs.getBitmexSecret();
                    loop = 2;
                    break;
                }

                case "Bitfinex": {
                    firstAPI = exchangesWalletsAPIs.getBitfinexAPIKey();
                    secondAPI = exchangesWalletsAPIs.getBitfinexAPISecret();
                    loop = 2;
                    break;
                }

                case "Bitso": {
                    firstAPI = exchangesWalletsAPIs.getBitsoAPIKey();
                    secondAPI = exchangesWalletsAPIs.getBitsoAPISecret();
                    loop = 2;
                    break;
                }

                case "Bybit": {
                    firstAPI = exchangesWalletsAPIs.getByBitPrivateAPIKey();
                    secondAPI = exchangesWalletsAPIs.getByBitPrivateKey();
                    loop = 1;
                    break;
                }

                case "Cex.io": {
                    firstAPI = exchangesWalletsAPIs.getCexioAPIKey();
                    secondAPI = exchangesWalletsAPIs.getCexioAPISecret();
                    thirdAPI = exchangesWalletsAPIs.getCexioUserID();
                    loop = 3;
                    break;
                }

                case "Deribit": {
                    firstAPI = exchangesWalletsAPIs.getDeribitClientID();
                    secondAPI = exchangesWalletsAPIs.getDeribitClientSecret();
                    loop = 2;
                    break;
                }

                case "FTX": {
                    firstAPI = exchangesWalletsAPIs.getFTXAPIKey();
                    secondAPI = exchangesWalletsAPIs.getFTXAPISecret();
                    loop = 1;
                    break;
                }

                case "HitBTC": {
                    firstAPI = exchangesWalletsAPIs.getHitBTCAPIKey();
                    secondAPI = exchangesWalletsAPIs.getHitBTCAPISecret();
                    loop = 2;
                    break;
                }

                case "Huobi": {
                    firstAPI = exchangesWalletsAPIs.getHuobiAccessKey();
                    secondAPI = exchangesWalletsAPIs.getHuobiSecretKey();
                    loop = 2;
                    break;
                }

                case "IDEX": {
                    firstAPI = exchangesWalletsAPIs.getIDEXAPICode();
                    secondAPI = exchangesWalletsAPIs.getIDEXAPISecret();
                    loop = 2;
                    break;
                }

                case "Kraken": {
                    firstAPI = exchangesWalletsAPIs.getKrakenAPIKey();
                    secondAPI = exchangesWalletsAPIs.getKrakenAPISecret();
                    loop = 2;
                    break;
                }

                case "KuCoin": {
                    firstAPI = exchangesWalletsAPIs.getKucoinKey();
                    secondAPI = exchangesWalletsAPIs.getKucoinSecret();
                    thirdAPI = exchangesWalletsAPIs.getKucoinPassphrase();
                    loop = 3;
                    break;
                }

                case "Liquid": {
                    firstAPI = exchangesWalletsAPIs.getLiquidTokenID();
                    secondAPI = exchangesWalletsAPIs.getLiquidTokenSecret();
                    loop = 2;
                    break;
                }

                case "OKEX": {
                    firstAPI = exchangesWalletsAPIs.getOKEXKey();
                    secondAPI = exchangesWalletsAPIs.getOKEXSecret();
                    thirdAPI = exchangesWalletsAPIs.getOKEXPassphrase();
                    loop = 3;
                    break;
                }

                case "Poloniex": {
                    firstAPI = exchangesWalletsAPIs.getPoloniexAPIKey();
                    secondAPI = exchangesWalletsAPIs.getPoloniexAPISecret();
                    loop = 2;
                    break;
                }

                default: {
                    addPortfolio.clickOnBack();
                    continue;
                }
            }

            if (loop == 2) {
                addPortfolio.typeFirstAPI(firstAPI);
                addPortfolio.typeSecondAPI(secondAPI);
            } else if (loop == 0){
                addPortfolio.clickOnBack();
                continue;
            } else if (loop == 1) {
                addPortfolio.typeFirstAPI(firstAPI);
                addPortfolio.typeSecondAPIByBit(secondAPI);
            } else if (loop == 3) {
                addPortfolio.typeFirstAPI(firstAPI);
                addPortfolio.typeSecondAPI(secondAPI);
                addPortfolio.typeThirdAPI(thirdAPI);
            }

            addPortfolio.clickOnSubmit();

            try {
                addPortfolio.clickOnNoShowMeSynced();
            } catch (Exception e) {
                String errorMessage = addPortfolio.getErrorMessage();
                String errorMessage2 = addPortfolio.getErrorMessage();
                System.out.println(exchangeName + " API is invalid");
                System.err.println(exchangeName + " error message is - " + errorMessage);
                System.err.println(exchangeName + " error message is - " + errorMessage2);
                addPortfolio.clickOnBack();
                continue;
            }

            System.out.println(exchangeName + " exchange connecting passed");

            List<WebElement> list2 = driver.findElements(By.className("qa-portfolios"));
            String addedExchangeName = list2.get(list2.size() - 1).getText();

            if (!exchangeName.equals(addedExchangeName)) {
                System.err.println(exchangeName + " exchange name is invalid");
            }

            addPortfolio.clickOnAddPortfolio();
            addPortfolio.clickOnConnectExchange();

        }

        deleteAllPortfolios.deleteAllPortfolios();
    }
}