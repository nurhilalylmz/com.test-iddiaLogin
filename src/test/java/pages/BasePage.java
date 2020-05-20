package pages;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import test.BaseTest;

public class BasePage {
    public static void setBrowser(String browser) {
        if(browser.equals("chrome")){
            //chrome driver dizinini belirttik.
            System.setProperty("webdriver.chrome.driver", "properties\\driver\\chromedriver.exe");
            //Browser ayarları
            DesiredCapabilities capabilities = new DesiredCapabilities();
            //Chrome ayarlarını yapmak için yeni bir obje nesnesi oluşturulur.
            ChromeOptions chromeOptions = new ChromeOptions();
            //Browser'ı test modunda çalıştırma.
            chromeOptions.addArguments("test-type");
           //Dil çevirme penceresini kapattırma.
            chromeOptions.addArguments("disable-translate");
            //Browser tam ekranda gösterilir.
            chromeOptions.addArguments("start-maximized");
            //Pop-uplar bloklanır.
            chromeOptions.addArguments("disable-popup-blocking");
            chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
            capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
            //Driver'ımızı setliyoruz.
            BaseTest.setDriver(new ChromeDriver(chromeOptions));
        }
        else if(browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "properties\\driver\\geckodriver.exe");
            //Browser ayarları
            DesiredCapabilities capabilities = new DesiredCapabilities();
            //Chrome ayarlarını yapmak için yeni bir obje nesnesi oluşturulur.
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            //Browser'ı test modunda çalıştırma.
            firefoxOptions.addArguments("test-type");
//        //Dil çevirme penceresini kapattırma.
            firefoxOptions.addArguments("disable-translate");
            //Browser tam ekranda gösterilir.
            firefoxOptions.addArguments("start-maximized");
            //Pop-uplar bloklanır.
            firefoxOptions.addArguments("disable-popup-blocking");
            firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
            capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, firefoxOptions);
            //Driver'ımızı setliyoruz.
            BaseTest.setDriver(new FirefoxDriver(firefoxOptions));
        }
        else{
            Assert.fail("Driver bulunamadı.Ayarları kontrol ediniz.");
        }
    }
}
