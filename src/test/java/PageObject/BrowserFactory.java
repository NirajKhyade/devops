package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {
    protected static WebDriver driver;
    protected WebDriver openBrowser(String browserName) {
        if (browserName.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
            driver = new ChromeDriver();
        } else if (browserName.equals("FireFox")) {
            System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
            driver = new FirefoxDriver();
        }
        return driver;
    }
    protected WebDriver enterUrl(String Url) {
        driver.get(Url);
        return driver;
    }




}
