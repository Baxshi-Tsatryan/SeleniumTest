package Chrome.AllPages;

import Chrome.MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DevServer {
    WebDriver driver;
    SeleniumUtils utils;

    public DevServer(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }

    By currentServer = By.cssSelector(".btn-section .primary-nav");

    By serversDropDown = By.cssSelector(".btn-section > .jsx-2262109736 > .jsx-2262109736 > .jsx-2262109736");

    By prodServer = By.cssSelector("ul.jsx-2262109736 > li:nth-of-type(1) .table-row");

    By devServer = By.cssSelector("ul.jsx-2262109736 > li:nth-of-type(2) .table-row");

    By dev2Server = By.cssSelector("ul.jsx-2262109736 > li:nth-of-type(3) .table-row");

    By newsServer = By.cssSelector("ul.jsx-2262109736 > li:nth-of-type(4) .table-row");

    By localServer = By.cssSelector("ul.jsx-2262109736 > li:nth-of-type(5) .table-row");


    // ------------------------------------------ Methods ------------------------------------------------------

    public String getCurrentServer(){
        return driver.findElement(currentServer).getText();
    }

    public DevServer clickOnServerDropDown(){
        driver.findElement(serversDropDown).click();
        return this;
    }

    public DevServer clickOnProdServer(){
        driver.findElement(prodServer).click();
        return this;
    }

    public DevServer clickOnDevServer(){
        driver.findElement(devServer).click();
        return this;
    }

    public DevServer clickOnDev2Server(){
        driver.findElement(dev2Server).click();
        return this;
    }

    public DevServer clickOnNewsServer(){
        driver.findElement(newsServer).click();
        return this;
    }

    public DevServer clickOnLocalServer(){
        driver.findElement(localServer).click();
        return this;
    }

}
