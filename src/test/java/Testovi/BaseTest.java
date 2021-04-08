package Testovi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import seleniumCore.DriverManager;
import seleniumCore.DriverManagerFactory;

import java.util.concurrent.TimeUnit;


public class BaseTest {
    WebDriver driver;
    DriverManager driverManager;
    String URL = "https://www.nickmayerart.com";

    public void createDriver(){
        driverManager = DriverManagerFactory.setDriver("OPERA");
        driver = driverManager.getWebDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(URL);
    }
    public void deleteDriver(){
        driver.quit();
    }
}
