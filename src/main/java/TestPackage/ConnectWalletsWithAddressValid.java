package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Cookie;

public class ConnectWalletsWithAddressValid {

    public static void main(String[] args) throws InterruptedException {

        // Enable ChromeDriverName and ChromeDriverPath
        String chromeDriverName = "webdriver.chrome.driver";
        String chromeDriverPath = "/Users/jenkins/Desktop/SeleniumTest/src/main/resources/chromedriver";
        System.setProperty(chromeDriverName, chromeDriverPath);

        // New driver object
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // Index for set all exchanges
        int index = 1;

        // Run main method
        addPortfolios(driver, index);

        // Sleep 5 sec
        Thread.sleep(5000);

        // Quit test
        driver.quit();

    }

    // Add all excahnges method
    public static void addPortfolios(WebDriver driver, int index) {

        // Get to CoinStats site
        String coinstatsURL = "https://coinstats.app/en/portfolio";
        driver.get(coinstatsURL);

        // Set Cookie (mail@mail.com | password account)
        driver.manage().addCookie(new Cookie("userData", "eyJzZXNzaW9uVG9rZW4iOiJyOjRhZTNjNTRhNDNjNGFiNDMwMzk1YWM2YWJmMWJkZTFhIn0="));
        driver.navigate().refresh();

        // Create By and Element for addPortfolio button
        By addPortfolioBy = By.cssSelector("#__next > main > div > div > div.jsx-2241105801.sidebar-container-wrapper.show > div > div.jsx-60857151.add-portfolio-container > button");
        WebElement addPortfolio = driver.findElement(addPortfolioBy);

        // Click on addPortfolio button
        addPortfolio.click();

        // ------------------------------ Wallets data ----------------------------------------

        // Ethereum
        String ethereumAddress = "0xC20a1CB4389903b97ab42b911aAb420BBec6eC1c";

        // Bitcoin
        String bitcoinAddress = "bc1qhm9dyt5gdlyrd0kd99gxj9g2p37msr8zxqyqpf";

        // Binance Chain
        String binanceChainAddress = "bnb1zqd5l3hvtwkmd2l3aptvwwehzk825unvn4w9sc";

        // Bitcoin Cash
        String bitcoinCashAddress = "qrknzg6l9cwsyzcf7wqfshssaqtn8qcpfgn7dkxw67";

        // Cardano
        String cardanoAddress = "TN8EoftcTEW7VjDiaLhYCNRGswwRkjSh7S";

        // DASH
        String dashAddress = "XqYs6Z3zifERiU1FBNnfnTTAhjEVgp1iED";

        // EOS
        String eosAddress = "bnb1zgez9tj4fd2834pntff0shdfw43udh58wezwxt";

        // Ethereum Classic
        String ethereumClassicAddress = "0x871bEC6F199395D99424B8a554Fd6FAD6Fb32e3d";

        // Litecoin
        String litecoinAddress = "ltc1qz5rgrxvyhdjyqree86na3qaane76agcsur7037";

        // NEO
        String neoAddress = "AcuCi6tppw7eWdXovtiv6JSMT2bnmK1xwQ";

        // Stellar
        String stellarAddress = "GBR27DA6RV47ORID6PE2CCGSUO4S6UKZVO553VKYJ2PNI6TEWFSMWUDL";

        // Tron
        String tronAddress = "TN8EoftcTEW7VjDiaLhYCNRGswwRkjSh7S";

        // VeChain
        String vechainAddress = "0xF1Ca85Ada7BfC2fF13995164Fd20d3C2C6f026d2";
        // 0x687912d858Fb7B44Ccec48ac0564F5aE77fDCE04

        // Waves
        String wavesAddress = "3P9ici3ievSXxt59yxaCWcmQhbss8AQ11mL";

        // XRP
        String xrpAddress = "rDszsE4tWgCfx8yzkZEx7aYeVRiHF23yg3";




        // ------------------------------ /Wallets data ----------------------------------------

        do {

            // Only for now
            if (index == 3)
            {
                index += 2;
            }
            else if (index == 7)
            {
                index ++;
            }
            else if (index == 10)
            {
                index++;
            }
            else if (index == 13)
            {
                index += 3;
            }
            else if(index == 18)
            {
                index ++;
            }
            else if (index == 20)
            {
                index += 2;
            }


            // Create By and Element for connectWallet button
            By connectWalletBy = By.cssSelector("div.buttons-with-info > button:nth-of-type(2)");
            WebElement connectWallet = driver.findElement(connectWalletBy);

            // Click on connectExchange button
            connectWallet.click();

            // Create By and Element for selectExchange
            By selectWalletBy = By.cssSelector("ul.jsx-842027962 > li:nth-of-type(" + index + ")");
            WebElement selectWallet = driver.findElement(selectWalletBy);

            // Click on exchanges buttons
            selectWallet.click();

            // Create By for firstTextBox
            By textBoxBy = By.cssSelector("[placeholder='Enter here']");

            // Create By for submitButton
            By submitButtonBy = By.cssSelector("div.submit-section > .jsx-1426819953");

            // Create By for yesButton
            By yesButtonBy = By.cssSelector("div.buttons-section > .primary");

            // Run exchanges method with index
            switch (index)
            {
                case 1:
                {
                    // Ethereum
                    connectWallets (driver, textBoxBy, submitButtonBy, yesButtonBy, ethereumAddress);
                    break;
                }

                case 2:
                {
                    // Bitcoin
                    connectWallets (driver, textBoxBy, submitButtonBy, yesButtonBy, bitcoinAddress);
                    break;
                }

                case 3:
                {
                    // Ledger
                    break;
                }

                case 4:
                {
                    // Exodus
                    break;
                }

                case 5:
                {
                    // Binance Chain
                    connectWallets (driver, textBoxBy, submitButtonBy, yesButtonBy, binanceChainAddress);
                    break;
                }

                case 6:
                {
                    // Bitcoin Cash
                    connectWallets (driver, textBoxBy, submitButtonBy, yesButtonBy, bitcoinCashAddress);
                    break;
                }

                case 7:
                {
                    // Binance CV
                    break;
                }

                case 8:
                {
                    // Cardano
                    connectWallets (driver, textBoxBy, submitButtonBy, yesButtonBy, cardanoAddress);
                    break;
                }

                case 9:
                {
                    // DASH
                    connectWallets (driver, textBoxBy, submitButtonBy, yesButtonBy, dashAddress);
                    break;
                }

                case 10:
                {
                    // DigiByte
                    break;
                }

                case 11:
                {
                    // EOS
                    connectWallets (driver, textBoxBy, submitButtonBy, yesButtonBy, eosAddress);
                    break;
                }

                case 12:
                {
                    // Ethereum Classic
                    connectWallets (driver, textBoxBy, submitButtonBy, yesButtonBy, ethereumClassicAddress);
                    break;
                }

                case 13:
                {
                    // IOST
                    break;
                }

                case 14:
                {
                    // IOTA
                    break;
                }

                case 15:
                {
                    // KeepKey
                    break;
                }

                case 16:
                {
                    // Litecoin
                    connectWallets (driver, textBoxBy, submitButtonBy, yesButtonBy, litecoinAddress);
                    break;
                }

                case 17:
                {
                    // NEO
                    connectWallets (driver, textBoxBy, submitButtonBy, yesButtonBy, neoAddress);
                    break;
                }

                case 18:
                {
                    // Polkadot
                    break;
                }

                case 19:
                {
                    // Stellar
                    connectWallets (driver, textBoxBy, submitButtonBy, yesButtonBy, stellarAddress);
                    break;
                }

                case 20:
                {
                    // Tezos
                    break;
                }

                case 21:
                {
                    // Trezor
                    break;
                }

                case 22:
                {
                    // Tron
                    connectWallets (driver, textBoxBy, submitButtonBy, yesButtonBy, tronAddress);
                    break;
                }

                case 23:
                {
                    // VeChain
                    connectWallets (driver, textBoxBy, submitButtonBy, yesButtonBy, vechainAddress);
                    break;
                }

                case 24:
                {
                    // Waves
                    connectWallets (driver, textBoxBy, submitButtonBy, yesButtonBy, wavesAddress);
                    break;
                }

                case 25:
                {
                    // XRP
                    connectWallets (driver, textBoxBy, submitButtonBy, yesButtonBy, xrpAddress);
                    break;
                }

            }

            // Index + 1
            index++;

        } while (index != 26);

    }

    // Connect Binance method
    public static void connectWallets (WebDriver driver, By textBoxby, By submitButtonBy, By yesButtonBy, String walletAddress)
    {
        // Create Element for textBox
        WebElement textBox = driver.findElement(textBoxby);

        textBox.sendKeys(walletAddress);

        // Create Element for submitButton
        WebElement submitButton = driver.findElement(submitButtonBy);

        // Click on submitButton
        submitButton.click();

        // Create Element for yesButton
        WebElement yesButton = driver.findElement(yesButtonBy);

        // Click on yesButton
        yesButton.click();

    }

}