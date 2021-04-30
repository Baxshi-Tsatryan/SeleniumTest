package Chrome.TestPackage;

import Chrome.AllPages.CoinGecko;
import Chrome.MainPackage.AllURLs;
import Chrome.MainPackage.Driver;
import Chrome.MainPackage.SeleniumUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass extends Driver {

    CoinGecko coinGecko;
    AllURLs allURLs;
    SeleniumUtils utils;

    @BeforeClass
    public void beforeClass() {
        allURLs = new AllURLs(driver);
        utils = new SeleniumUtils(driver);
        coinGecko = new CoinGecko(driver);

    }

    @Test
    public void test(){
        allURLs.navigateToCoinGecko();
        coinGecko.searchAnyCoin("ethereum classic");
    }
}
