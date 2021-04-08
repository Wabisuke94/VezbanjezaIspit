package seleniumCore;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected WebDriver driver;

    public abstract void createDriver();

    public void quitDriver(){
        if(driver != null){
            driver.quit();
        }
        driver = null;
    }
    public WebDriver getWebDriver(){
        if(driver == null){
            createDriver();
        }
        return driver;
    }
}
