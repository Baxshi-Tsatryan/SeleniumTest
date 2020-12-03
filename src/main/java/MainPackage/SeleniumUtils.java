package MainPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import static org.testng.internal.Utils.copyFile;

public class SeleniumUtils{

    WebDriver driver;

    public SeleniumUtils(WebDriver driver) {

        this.driver = driver;
    }

    String cookie = "eyJzZXNzaW9uVG9rZW4iOiJyOmRlMzgyYmY0NWUyODJiOTI0ODg0ZDgxZTMzYmQwNzgwIn0=";

    // Navigation

    public void openURL(String URL)
    {
        driver.navigate().to(URL);
    }

    public void findElement(By by)
    {
        driver.findElement(by);
    }

    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    public void actionClickOnElement(By by)
    {
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(by)).build().perform();
    }

    public void goToBackPage()
    {
        driver.navigate().back();
    }

    public void goToForwardPage()
    {
        driver.navigate().forward();
    }

    public void goToBottom()
    {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.SPACE).build().perform();
    }

    public void refreshPage()
    {
        driver.navigate().refresh();
    }


    // Work with window

    public String getTitle()
    {
        return driver.getTitle();
    }

    public String getCurrentURL()
    {
        return driver.getCurrentUrl();
    }

    public String getPageSource()
    {
        return driver.getPageSource();
    }


    // Manage Windows

    public void makeScreenMax()
    {
        driver.manage().window().maximize();
    }

    public void makeScreenMin()
    {
        //driver.manage().window().minimize();
    }

    public void makeFullScreen()
    {
        driver.manage().window().fullscreen();
    }

    public void getWindowSize()
    {
        driver.manage().window().getSize();
    }

    public void setWindowSize(int width, int height)
    {
        driver.manage().window().setSize(new Dimension(width, height));
    }

    public void getWindowPosition()
    {
        driver.manage().window().getPosition();
    }

    public void setWindowPosition(int x, int y)
    {
        driver.manage().window().setPosition(new Point(x, y));
    }

    public void takeAScreenShot()
    {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        copyFile(scrFile, new File("/Users/jenkins"));
    }


    // Work with Texts

    public void sendKeys(By by, String searchString)
    {
        Actions actions = new Actions(driver);
        actions.sendKeys(driver.findElement(by), searchString).build().perform();
    }

    public void clear(By by)
    {
        driver.findElement(by).clear();
    }


    // Get data

    public String getText(By by)
    {
        return driver.findElement(by).getText();
    }

    public String getAttribute(String attributeName, By by)
    {
        return driver.findElement(by).getAttribute(attributeName);
    }

    public String getCSSValue(By by, String CSSValue)
    {
        return driver.findElement(by).getCssValue(CSSValue);
    }

    public String getTagName(By by)
    {
        return driver.findElement(by).getTagName();
    }

    public void getLocation(By by)
    {
        driver.findElement(by).getLocation();
    }

    public void getSize(By by)
    {
        driver.findElement(by).getSize();
    }

    // Get booleans

    public Boolean isEnabled(By by)
    {
        return driver.findElement(by).isEnabled();
    }

    public Boolean isDisplayed(By by)
    {
        return driver.findElement(by).isDisplayed();
    }

    public Boolean isSelected(By by)
    {
        return driver.findElement(by).isSelected();
    }


    // Actions

    public void moveToElement(By by)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    public void moveToElementByCoordinates(By by, int x, int y)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by), x, y).build().perform();
    }

    public void clickByAction(By by)
    {
        Actions actions = new Actions(driver);
        actions.click().build().perform();
    }

    public void doubleClickOnElement(By by)
    {
        Actions actions = new Actions(driver);
        actions.doubleClick().build().perform();
    }

    public void clickAndHold(By by)
    {
        Actions actions = new Actions(driver);
        actions.clickAndHold().build().perform();
    }

    public void rightClickOnElement(By by)
    {
        Actions actions = new Actions(driver);
        actions.contextClick().build().perform();
    }

    public void dragAndDrop(By by, By by2)
    {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(by), driver.findElement(by2)).build().perform();
    }

    public void dragAndDropByCoordinates(By by, int x, int y)
    {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(driver.findElement(by), x, y).build().perform();
    }

    public void pause(int time)
    {
        Actions actions = new Actions(driver);
        actions.pause(time).build().perform();
    }


    // Driver close and quit

    public void driverClose()
    {
        driver.close();
    }

    public void driverQuit()
    {
        driver.quit();
    }


    // Timeouts

    public void threadSleep(int milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
    }


    // Cookies

    public void enableCookieShouldChange()
    {
        driver.manage().addCookie(new Cookie("userData", "eyJzZXNzaW9uVG9rZW4iOiJyOjM1YjIxODQ4YzZlMWRiZGZiODFlOTIzY2ZkMmMzMTEzIn0=="));
        driver.navigate().refresh();
    }

    public void enableCookie()
    {
        driver.manage().addCookie(new Cookie("userData", cookie));
        driver.navigate().refresh();
    }


    // Switch Frames and Alerts

    public void switchFrame(int frameI, String frameName)
    {
        driver.switchTo().frame(frameI);
        driver.switchTo().frame(frameName);
    }

    public void workWithFrame(By by)
    {
        driver.switchTo().frame(driver.findElement(by));
        driver.switchTo().parentFrame();
    }

    public void navigateToParentFrame()
    {
        driver.switchTo().defaultContent();
    }

    public void switchToAlert()
    {
        driver.switchTo().alert();
    }

}