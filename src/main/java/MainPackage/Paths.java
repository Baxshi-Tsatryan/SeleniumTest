package MainPackage;

import org.openqa.selenium.WebDriver;

public class Paths {

    WebDriver driver;

    public Paths(WebDriver driver) {
        this.driver = driver;
    }

    String bittrexCSV = "/Users/baxshi/Desktop/SeleniumFiles/CSVs/BittrexOrderHistory_2019.csv";
    String coinStatsTemplateCSV = "/Users/baxshi/Desktop/SeleniumFiles/CSVs/coinstats_template.csv";
    String exodusZIP = "/Users/baxshi/Desktop/SeleniumFiles/CSVs/Exodus.zip";
    String image = "/Users/baxshi/Desktop/SeleniumFiles/Screen";

    String blockFiCSV1 = "/Users/baxshi/Desktop/SeleniumFiles/CSVs/BlockFi/1614143016387transactions.csv";
    String blockFiCSV2 = "/Users/baxshi/Desktop/SeleniumFiles/CSVs/BlockFi/1614143836844transactions(2).csv";

    String cryptoComCSV1 = "/Users/baxshi/Desktop/SeleniumFiles/CSVs/Crypto.com/1595747032036crypto_transactions_record_20200726_085903.csv";
    String cryptoComCSV2 = "/Users/baxshi/Desktop/SeleniumFiles/CSVs/Crypto.com/1614148700176crypto_transactions_record_20210224_063803.csv";
    String cryptoComCSV3 = "/Users/baxshi/Desktop/SeleniumFiles/CSVs/Crypto.com/1614148710638crypto_transactions_record_20210224_073710.csv";
    String cryptoComCSV4 = "/Users/baxshi/Desktop/SeleniumFiles/CSVs/Crypto.com/crypto_transactions_record_20200623_132654 - crypto_transactions_record_20200623_132654.csv";

    String nexoCSV1 = "/Users/baxshi/Desktop/SeleniumFiles/CSVs/Nexo/1608057483621Nexo_Transactions_1608057434.csv";
    String nexoCSV2 = "/Users/baxshi/Desktop/SeleniumFiles/CSVs/Nexo/1614148576771nexo_transactions-2.csv";
    String nexoCSV3 = "/Users/baxshi/Desktop/SeleniumFiles/CSVs/Nexo/1614148611614nexo_transactions-2.csv";
    String nexoCSV4 = "/Users/baxshi/Desktop/SeleniumFiles/CSVs/Nexo/nexo_transactions (2).csv";
    String nexoCSV5 = "/Users/baxshi/Desktop/SeleniumFiles/CSVs/Nexo/Nexo_Transactions_1608112893 (2).csv";
    String nexoCSV6 = "/Users/baxshi/Desktop/SeleniumFiles/CSVs/Nexo/nexo_transactions_test_new.csv";
    String nexoCSV7 = "/Users/baxshi/Desktop/SeleniumFiles/CSVs/Nexo/nexo_transactions-2.csv";


    // ------------------------------------------------ Methods -----------------------------------------------

    public String getBittrexCSV()
    {
        return bittrexCSV;
    }

    public String getCoinStatsTemplateCSV()
    {
        return coinStatsTemplateCSV;
    }

    public String getExodusZIP()
    {
        return exodusZIP;
    }

    public String getImage()
    {
        return image;
    }


    public String getBlockFiCSV1()
    {
        return blockFiCSV1;
    }

    public String getBlockFiCSV2()
    {
        return blockFiCSV2;
    }


    public String getCryptoComCSV1()
    {
        return cryptoComCSV1;
    }

    public String getCryptoComCSV2()
    {
        return cryptoComCSV2;
    }

    public String getCryptoComCSV3()
    {
        return cryptoComCSV3;
    }

    public String getCryptoComCSV4()
    {
        return cryptoComCSV4;
    }


    public String getNexoCSV1()
    {
        return nexoCSV1;
    }

    public String getNexoCSV2()
    {
        return nexoCSV2;
    }

    public String getNexoCSV3()
    {
        return nexoCSV3;
    }

    public String getNexoCSV4()
    {
        return nexoCSV4;
    }

    public String getNexoCSV5()
    {
        return nexoCSV5;
    }

    public String getNexoCSV6()
    {
        return nexoCSV6;
    }

    public String getNexoCSV7()
    {
        return nexoCSV7;
    }

}
