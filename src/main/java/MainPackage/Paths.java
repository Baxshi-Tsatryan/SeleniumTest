package MainPackage;

import org.openqa.selenium.WebDriver;

public class Paths {

    WebDriver driver;

    public Paths(WebDriver driver) {
        this.driver = driver;
    }

    CharSequence bittrexCSV = "/Users/jenkins/Desktop/SeleniumFiles/BittrexOrderHistory_2019.csv";
    CharSequence coinStatsTemplateCSV = "/Users/jenkins/Desktop/SeleniumFiles/coinstats_template.csv";
    CharSequence cryptoComCSV = "/Users/jenkins/Desktop/SeleniumFiles/crypto_transactions_record_20200623_132654 - crypto_transactions_record_20200623_132654.csv";
    CharSequence exodusCSV = "/Users/jenkins/Desktop/SeleniumFiles/Exodus.zip";
    CharSequence image = "/Users/jenkins/Desktop/SeleniumFiles/Screen Shot 2020-11-06 at 5.54.47 PM";
    CharSequence image2 = "/Users/jenkins/Desktop/SeleniumFiles/Screen Shot 2020-11-04 at 2.51.08 PM";

    public CharSequence getBittrexCSV()
    {
        return bittrexCSV;
    }

    public CharSequence getCoinStatsTemplateCSV()
    {
        return coinStatsTemplateCSV;
    }

    public CharSequence getCryptoComCSV()
    {
        return cryptoComCSV;
    }

    public CharSequence getExodusCSV()
    {
        return exodusCSV;
    }

    public CharSequence getImage()
    {
        return image;
    }

    public CharSequence getImage2()
    {
        return image2;
    }

}
