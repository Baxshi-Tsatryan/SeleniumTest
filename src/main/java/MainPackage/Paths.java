package MainPackage;

import org.openqa.selenium.WebDriver;

public class Paths {

    WebDriver driver;

    public Paths(WebDriver driver) {
        this.driver = driver;
    }

    String bittrexCSV = "/Users/jenkins/Desktop/SeleniumFiles/BittrexOrderHistory_2019.csv";
    String coinStatsTemplateCSV = "/Users/jenkins/Desktop/SeleniumFiles/coinstats_template.csv";
    String cryptoComCSV = "/Users/jenkins/Desktop/SeleniumFiles/crypto_transactions_record_20200623_132654 - crypto_transactions_record_20200623_132654.csv";
    String exodusCSV = "/Users/jenkins/Desktop/SeleniumFiles/Exodus.zip";
    String image = "/Users/jenkins/Desktop/SeleniumFiles/Screen Shot 2020-11-06 at 5.54.47 PM";
    String image2 = "/Users/jenkins/Desktop/SeleniumFiles/Screen Shot 2020-11-04 at 2.51.08 PM";

    public String getBittrexCSV()
    {
        return bittrexCSV;
    }

    public String getCoinStatsTemplateCSV()
    {
        return coinStatsTemplateCSV;
    }

    public String getCryptoComCSV()
    {
        return cryptoComCSV;
    }

    public String getExodusZIP()
    {
        return exodusCSV;
    }

    public String getImage()
    {
        return image;
    }

    public String getImage2()
    {
        return image2;
    }

}
