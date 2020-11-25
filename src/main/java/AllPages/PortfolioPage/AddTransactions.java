package AllPages.PortfolioPage;

import MainPackage.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddTransactions {

    WebDriver driver;
    SeleniumUtils utils;

    public AddTransactions(WebDriver driver) {
        this.driver = driver;
        utils = new SeleniumUtils(this.driver);
    }


    By addTransaction = By.cssSelector(".primary-bordered");

    By buyTab = By.cssSelector("div.buy-sell > button:nth-of-type(1)");

    By sellTab = By.cssSelector("div.buy-sell > button:nth-of-type(2)");

    By portfolioDropDown = By.cssSelector("div.manual-transaction-modal > .jsx-1256533704 > .jsx-1751315535 > .jsx-1751315535");

    By selectedPortfolioName = By.cssSelector("div.manual-transaction-modal > .jsx-1256533704 .table-row");

    By coinSearchField = By.cssSelector(".jsx-931209423[placeholder='Search']");

    By pairField = By.cssSelector("[placeholder='Please select exchange-pair']");

    By dateField = By.cssSelector("input[value='17-09-2020']");

    By previousMonth = By.cssSelector(".react-datepicker__navigation");

    By nextMonth = By.cssSelector(".react-datepicker__navigation--next");

    By timeField = By.cssSelector(".react-datepicker-ignore-onclickoutside");

    By amountField = By.cssSelector("[placeholder='Amount']");

    By priceField = By.cssSelector("[placeholder='Price']");

    By feeField = By.cssSelector("[placeholder='Fee']");

    By notesField = By.cssSelector("[placeholder='Type Something...']");

    By checklist = By.cssSelector("span.jsx-3279326736");

    By closeButton = By.cssSelector(".icon-close");

    By saveButton = By.cssSelector("div.action-buttons > .primary");

    By cancelButton = By.cssSelector("div.action-buttons > .bordered");



    // --------------------------------------------- Methods ----------------------------------------------


    public void clickOnAddTransaction()
    {
        utils.clickOnElement(addTransaction);
    }

    public void clickOnBuyTab()
    {
        utils.clickOnElement(buyTab);
    }

    public void clickOnSellTab()
    {
        utils.clickOnElement(sellTab);
    }

    public void clickOnPortfolioDropDown()
    {
        utils.clickOnElement(portfolioDropDown);
    }

    public String getSelectedPortfolioName()
    {
        return utils.getText(selectedPortfolioName);
    }

    public void typeCoinName(String coinName)
    {
        utils.sendKeys(coinSearchField, coinName);
    }

    public void clickOnPairField()
    {
        utils.clickOnElement(pairField);
    }

    public void typePair(String pairName)
    {
        utils.sendKeys(pairField, pairName);
    }

    public String getCurrentDate()
    {
        return utils.getText(dateField);
    }

    public void clickOnDate()
    {
        utils.clickOnElement(dateField);
    }

    public void typeDate(String date)
    {
        utils.sendKeys(dateField, date);
    }

    public void clickOnPreviousMonth()
    {
        utils.clickOnElement(previousMonth);
    }

    public void clickOnNextMonth()
    {
        utils.clickOnElement(nextMonth);
    }

    public String getCurrentTime()
    {
        return utils.getText(timeField);
    }

    public void clickOnTime()
    {
        utils.clickOnElement(timeField);
    }

    public void typeTime(String time)
    {
        utils.sendKeys(timeField, time);
    }

    public void typeAmount(String amount)
    {
        utils.sendKeys(amountField, amount);
    }

    public String getPrice()
    {
        return utils.getText(priceField);
    }

    public void typePrice(String price)
    {
        utils.sendKeys(priceField, price);
    }

    public void typeFee(String fee)
    {
        utils.sendKeys(feeField, fee);
    }

    public void typeNote(String note)
    {
        utils.sendKeys(notesField, note);
    }

    public void clickOnChecklist()
    {
        utils.clickOnElement(checklist);
    }

    public void clickOnSave()
    {
        utils.clickOnElement(saveButton);
    }

    public void clickOnCancel()
    {
        utils.clickOnElement(cancelButton);
    }




    // ----------------------------------------------- Scripts ------------------------------------------

    public void getAllPortfoliosName()
    {
        int index = 1;

        do {

            WebElement allPortfolios = driver.findElement(By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(" + index + ") .table-row"));
            System.out.println(allPortfolios.getText());

            index++;

        }while(index != 10);

    }

    public void clickOnAllPortfolios()
    {
        int index = 1;

        do {

            driver.findElement(By.cssSelector("ul.jsx-1751315535 > li:nth-of-type(" + index + ") .table-row")).click();

            index++;

        }while(index != 10);

    }

    public void selectDateOnlyDay(String day) // 02, 12
    {
        driver.findElement(By.cssSelector(".react-datepicker__day--0" + day)).click();
    }

    public void selectAllDate(String allDate) // Wednesday, September 2nd, 2020
    {
        driver.findElement(By.cssSelector("div[aria-label='Choose " + allDate + "']")).click();
    }




}
