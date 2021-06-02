package chrome.allPages.widgetsPage;

import org.openqa.selenium.By;

public class PortfolioWidgets {


    By portfolioLinkField = By.cssSelector(".second-column > .input-item [type='text']");

    By currentType = By.cssSelector(".second-column > div:nth-of-type(2) .primary-nav");

    By typeDropDown = By.cssSelector(".second-column > div:nth-of-type(2) > .jsx-2262109736 > .jsx-2262109736");

    By largeTypeInDropDown = By.cssSelector("ul.jsx-2262109736 > li:nth-of-type(1) .table-row");

    By mediumTypeInDropDown = By.cssSelector("ul.jsx-2262109736 > li:nth-of-type(2) .table-row");

    By smallTypeInDropDown = By.cssSelector("li:nth-of-type(3) .table-row");

    By currentCoinsCount = By.cssSelector(".second-column > div:nth-of-type(3) .primary-nav");

    By currentTheme = By.cssSelector(".second-column > div:nth-of-type(4) .primary-nav");

    By themeDropDown = By.cssSelector(".second-column > div:nth-of-type(4) > .jsx-2262109736 > .jsx-2262109736");

    By darkMode = By.cssSelector("ul.jsx-2262109736 > li:nth-of-type(1) .table-row");

    By lightMode = By.cssSelector("ul.jsx-2262109736 > li:nth-of-type(2) .table-row");

    By currentCurrency = By.cssSelector(".second-column > div:nth-of-type(5) .primary-nav");

    By currencyDropDown = By.cssSelector(".second-column > div:nth-of-type(5) > .jsx-2262109736 > .jsx-2262109736");

    By widthField = By.cssSelector("[placeholder='Width']");


    // Colors fields

    By backgroundColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(1) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By textColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(1) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By positivePercentageField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(2) > td:nth-child(1) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By negativePercentageField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(2) > td:nth-child(2) > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");

    By widgetBorderColorField = By.cssSelector("#__next > main > div > div > div.second-column > table > tbody > tr:nth-child(3) > td > div > div.jsx-3534712709.widget-color-wrapper > div.jsx-1485860805.text-box-wrapper > input");


    // Colors

    By backgroundColor = By.cssSelector("tr:nth-of-type(1) > td:nth-of-type(1) .widget-color-rectangle");

    By textColor = By.cssSelector("tr:nth-of-type(1) > td:nth-of-type(2) .widget-color-rectangle");

    By positivePercentageColor = By.cssSelector("tr:nth-of-type(2) > td:nth-of-type(1) .widget-color-rectangle");

    By negativePercentageColor = By.cssSelector("tr:nth-of-type(2) > td:nth-of-type(2) .widget-color-rectangle");

    By widgetBorderColor = By.cssSelector("tr:nth-of-type(3) .widget-color-rectangle");


    // ---------------------------------------------------- Methods -----------------------------------------------------------

    

}
