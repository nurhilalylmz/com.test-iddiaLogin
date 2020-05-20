package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.BasePage;

public class BaseTest {
    public static WebDriver driver=null;

    @BeforeTest(alwaysRun = true)
    public void beginTest() {
        BasePage.setBrowser("chrome");
        driver.navigate().to("https://test.iddaa.com/giris-yap");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        if(driver!=null){
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver webDriver) {
        BaseTest.driver = webDriver;
    }
}
