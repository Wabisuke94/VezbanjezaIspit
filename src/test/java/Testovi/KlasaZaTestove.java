package Testovi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom_classes.HomePage;

import java.util.concurrent.TimeUnit;

public class KlasaZaTestove extends BaseTest{
    HomePage homePage;

    @BeforeMethod
    public void kreiranjeDrajvera(){
        createDriver();
    }
    @AfterMethod
    public void unistavanje(){
        deleteDriver();
    }
    @Test
    public void test1(){
        homePage = new HomePage(driver);
        homePage.clickPrint();
    }
}
