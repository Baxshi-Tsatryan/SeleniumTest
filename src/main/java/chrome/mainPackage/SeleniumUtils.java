package chrome.mainPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import static org.testng.internal.Utils.copyFile;

public class SeleniumUtils {

    WebDriver driver;

    public SeleniumUtils(WebDriver driver) {

        this.driver = driver;
    }

    String cookie = "eyJzZXNzaW9uVG9rZW4iOiJyOjc2YzZlNDFhOTdjZDBjODYzODcwOTkyZDRjOTU0YzQ3In0=";
    String stagingCookie = "eyJzZXNzaW9uVG9rZW4iOiJyOmI3N2I3Y2RjNzYwZTZmYzExZDhmZTQ5ZGMzZWM2NGQxIn0=";
    String devCookie = "eyJzZXNzaW9uVG9rZW4iOiJyOjkzMTA1MWU4ZTcxYjEyZTk1YzVjN2Y5OWYzODNlYzg3In0=";

//    public SeleniumUtils waitVisibility2(By by) {
//        wait.ignoring(NoSuchElementException.class);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//        return this;
//    }
//
//    public SeleniumUtils waitTest() {
//        WebDriverWait wait = new WebDriverWait(driver, 5);
//        return this;
//    }
//
//    public SeleniumUtils testClick(By by)
//    {
//        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//        webElement.click();
//        return this;
//    }

    public SeleniumUtils waitVisibility(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return this;
    }

    public SeleniumUtils waitClickable(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(by));
        return this;
    }

    // Navigation

    public SeleniumUtils navigateTo(String URL) {
        driver.navigate().to(URL);
        return this;
    }

    public SeleniumUtils findElement(By by) {
        waitVisibility(by);
        driver.findElement(by);
        return this;
    }

    public SeleniumUtils click(By by) {
        waitClickable(by);
        driver.findElement(by).click();
        return this;
    }

    public SeleniumUtils actionClick(By by) {
        waitClickable(by);
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(by)).build().perform();
        return this;
    }

    public SeleniumUtils goToBackPage() {
        driver.navigate().back();
        return this;
    }

    public SeleniumUtils goToForwardPage() {
        driver.navigate().forward();
        return this;
    }

    public SeleniumUtils goToBottom() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.SPACE).build().perform();
        return this;
    }

    public SeleniumUtils refreshPage() {
        driver.navigate().refresh();
        return this;
    }


    // Work with window

    public String getTitle() {
        return driver.getTitle();
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public String getPageSource() {
        return driver.getPageSource();
    }


    // Manage Windows

    public SeleniumUtils makeScreenMax() {
        driver.manage().window().maximize();
        return this;
    }

    public SeleniumUtils makeScreenMin() {
        //driver.manage().window().minimize();
        return this;
    }

    public SeleniumUtils makeFullScreen() {
        driver.manage().window().fullscreen();
        return this;
    }

    public SeleniumUtils getWindowSize() {
        driver.manage().window().getSize();
        return this;
    }

    public SeleniumUtils setWindowSize(int width, int height) {
        driver.manage().window().setSize(new Dimension(width, height));
        return this;
    }

    public SeleniumUtils getWindowPosition() {
        driver.manage().window().getPosition();
        return this;
    }

    public SeleniumUtils setWindowPosition(int x, int y) {
        driver.manage().window().setPosition(new Point(x, y));
        return this;
    }

    public SeleniumUtils takeAScreenShot() {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        copyFile(scrFile, new File("/Users/jenkins"));
        return this;
    }


    // Work with Texts

    public SeleniumUtils sendKeysAction(By by, String searchString) {
        waitVisibility(by);
        Actions actions = new Actions(driver);
        actions.sendKeys(driver.findElement(by), searchString).build().perform();
        return this;
    }

    public SeleniumUtils sendKeys(By by, String searchString) {
        waitVisibility(by);
        WebElement element = driver.findElement(by);
        element.sendKeys(searchString);
        return this;
    }

    public SeleniumUtils clear(By by) {
        waitVisibility(by);
        driver.findElement(by).clear();
        return this;
    }


    // Get data

    public String getText(By by) {
        waitVisibility(by);
        return driver.findElement(by).getText();
    }

    public String getAttribute(String attributeName, By by) {
        return driver.findElement(by).getAttribute(attributeName);
    }

    public String getCSSValue(By by, String CSSValue) {
        return driver.findElement(by).getCssValue(CSSValue);
    }

    public String getTagName(By by) {
        return driver.findElement(by).getTagName();
    }

    public SeleniumUtils getLocation(By by) {
        driver.findElement(by).getLocation();
        return this;
    }

    public SeleniumUtils getSize(By by) {
        driver.findElement(by).getSize();
        return this;
    }

    // Get booleans

    public Boolean isEnabled(By by) {
        return driver.findElement(by).isEnabled();
    }

    public Boolean isSelected(By by) {
        return driver.findElement(by).isSelected();
    }

    public boolean isDisplayed(By by) {
        if (!driver.findElements(by).isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDisplayed2(By by) {
        if (driver.findElements(by).size() < 1) {
            return false;
        } else {
            return true;
        }
    }

    public Boolean isDisplayed3(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean pageSourceContain(String text) {
        if (driver.getPageSource().contains(text))
            return true;
        else return false;
    }


    // Actions

    public SeleniumUtils moveToElement(By by) {
        waitVisibility(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
        return this;
    }

    public SeleniumUtils moveToElementByCoordinates(By by, int x, int y) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by), x, y).build().perform();
        return this;
    }

    public SeleniumUtils clickByAction(By by) {
        waitVisibility(by);
        Actions actions = new Actions(driver);
        actions.click().build().perform();
        return this;
    }

    public SeleniumUtils doubleClickOnElement(By by) {
        waitVisibility(by);
        Actions actions = new Actions(driver);
        actions.doubleClick().build().perform();
        return this;
    }

    public SeleniumUtils clickAndHold(By by) {
        waitVisibility(by);
        Actions actions = new Actions(driver);
        actions.clickAndHold().build().perform();
        return this;
    }

    public SeleniumUtils rightClickOnElement(By by) {
        waitVisibility(by);
        Actions actions = new Actions(driver);
        actions.contextClick().build().perform();
        return this;
    }

    public SeleniumUtils dragAndDrop(By by, By by2) {
        waitVisibility(by);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(by), driver.findElement(by2)).build().perform();
        return this;
    }

    public SeleniumUtils dragAndDropByCoordinates(By by, int x, int y) {
        waitVisibility(by);
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(driver.findElement(by), x, y).build().perform();
        return this;
    }

    public SeleniumUtils pause(int time) {
        Actions actions = new Actions(driver);
        actions.pause(time).build().perform();
        return this;
    }


    // Driver close and quit

    public SeleniumUtils driverClose() {
        driver.close();
        return this;
    }

    public SeleniumUtils driverQuit() {
        driver.quit();
        return this;
    }


    // Timeouts

    public SeleniumUtils threadSleep(int milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
        return this;
    }


    // Cookies

    public SeleniumUtils enableCookieShouldChange() {
        driver.manage().addCookie(new Cookie("userData", "eyJzZXNzaW9uVG9rZW4iOiJyOjM1YjIxODQ4YzZlMWRiZGZiODFlOTIzY2ZkMmMzMTEzIn0=="));
        driver.navigate().refresh();
        return this;
    }

    public SeleniumUtils enableCookie() {
        driver.manage().addCookie(new Cookie("userData", cookie));
        driver.navigate().refresh();
        return this;
    }

    public SeleniumUtils enableStagingCookie(){
        driver.manage().addCookie(new Cookie("userData", stagingCookie));
        driver.navigate().refresh();
        return this;
    }

    public SeleniumUtils enableDevCookie(){
        driver.manage().addCookie(new Cookie("userData", devCookie));
        driver.navigate().refresh();
        return this;
    }


    // Parses

    public int parseFromStringToInt(String string) {
        int intNumber = Integer.parseInt(string);

        return intNumber;
    }

    public float parseFromStringToFloat(String string) {
        float floatNumber = Float.parseFloat(string);

        return floatNumber;
    }

    public String parseFromIntToString(int intNumber) {
        String string = String.valueOf(intNumber);

        return string;
    }

    public String parseFromFloatToString(int floatNumber) {
        String string = String.valueOf(floatNumber);

        return string;
    }


    // Other

    public int randomNumber(int max) {
        int randNum = (int) (Math.random() * (max - 1) + 1);

        return randNum;
    }

}