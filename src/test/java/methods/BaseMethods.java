package methods;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
public class BaseMethods {
    protected WebDriver driver;
    protected WebDriverWait wait ;

    public BaseMethods(WebDriver webDriver) {
        this.wait= new WebDriverWait(webDriver, 30);
        this.driver=webDriver;
    }

    protected void logMessage(String text) {
        System.out.println(text);
    }

    protected void clickElement(WebElement element) {
        try {
            element.click();
            waitSeconds(1);
            logMessage(element.getText() + " elementine tıklandı.");
        } catch (Exception e) {
            logMessage("Elemente tıklanamadı. Element: " + element + " Hata: " + e.getMessage());
        }

    }

    protected void writeText(WebElement element, String text) {
        try {
            if (element.getText().equals("")) {
                element.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
            }
            element.sendKeys(text);

        } catch (Exception e) {
            logMessage("İlgili elemente yazı yazılırken hata oluştu. Element:" + element + "Hata: " + e.getMessage());
        }
    }

    protected void waitSeconds(int seconds) {
        try {
            logMessage(seconds + " saniye kadar bekleniyor.");
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            logMessage(e.getMessage());
        }
    }

    //Sayfayı belirli bir element yüklenene kadar bekletir.
    protected void waitForPageLoad(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}