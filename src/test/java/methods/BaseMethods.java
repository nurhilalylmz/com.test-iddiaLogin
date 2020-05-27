package methods;

import jdk.jfr.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;

public class BaseMethods extends BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait ;

    public BaseMethods(WebDriver webDriver) {
        this.wait= new WebDriverWait(webDriver, 30);
        this.driver=webDriver;
    }

    @Description("İlgili element tıklanabilir olana kadar bekler.")
    protected void waitElementToClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    @Description("Console'a mesaj yazdırılmasını sağlar.")
    protected void logMessage(String text) {
        System.out.println(text);
    }

    @Description("İlgili elemente tıklanmasını,eğer tıklanamazsa uyarı çıkması sağlanır.")
    protected void clickElement(WebElement element) {
        try {
            element.click();
            waitSeconds(1);
            logMessage(element.getText() + " elementine tıklandı.");
        } catch (Exception e) {
            logMessage("Elemente tıklanamadı. Element: " + element + " Hata: " + e.getMessage());
        }

    }

    @Description("İlgili elemente string ifade girilmesini sağlar.")
    protected void writeText(WebElement element, String text) {
        try {
            if (element.getText().equals("")) {
                element.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
            }
            element.sendKeys(text);

        } catch (Exception e) {
            logMessage("İlgili elemente yazı yazılırken hata oluştu. Element:"+ element +"Hata: " + e.getMessage());
        }
    }

    @Description("Sayfada belirtilen saniye kadar beklmesini sağlar.")
    protected void waitSeconds(int seconds) {
        try {
            logMessage(seconds + " saniye kadar bekleniyor.");
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            logMessage(e.getMessage());
        }
    }

    @Description("Sayfayı belirli bir element yüklenene kadar beklemesini sağlar.")
    protected void waitForPageLoad(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    @Description("Belirtilen email'de türkçe karakter var ise kullanıcıya bildirir.")
    protected boolean controllEmailTurkishCharacter(String textValue){
        boolean isTurkishCharacter=false;
        if(textValue.toLowerCase().contains("ş")||textValue.contains("ç")||textValue.contains("ğ")||textValue.contains("ı")||textValue.contains("ö")||textValue.contains("ü")){
            isTurkishCharacter=true;
        }
        return isTurkishCharacter;
    }

    @Description("Gelen Email bilgisinin türkçe karakter kontrolünü sağlar.")
    protected void controlEmail(String textValue){
        if(controllEmailTurkishCharacter(textValue)){
            Assert.fail("Mail adresinde türkçe karakterler bulunmakta kontrol ediniz. Email: "+textValue);
        }
    }

    @Description("Gelen Email bilgisinin türkçe karakter kontrolünü sağlar.")
    protected void controlEmailError(String expectingError,WebElement actualTextError){
        if(!actualTextError.getText().equals(expectingError)){
            Assert.fail("Belirtilen hata kontrol edilirken hata alındı.Kontrol ediniz. " +
                    "Aslında : " + actualTextError.getText()+" "+
                    "Beklenen : "+ expectingError);
        }
    }

    @Description("Beklenen ve Aslında olan text ifadelerini karşılaştırır, ona göre değer döner.")
    protected boolean controlTextWithEquality(String expectingText,WebElement actualText){
        boolean isTextEqual=false;
        if(actualText.getText().equals(expectingText)){
            isTextEqual=true;
        }
        return isTextEqual;
    }

    @Description("Beklenen ve Aslında olan text ifadelerini karşılaştırır.")
    protected void controlPageTextEqual(String actualText,String expectingText){
        try {
            if(!actualText.equals(expectingText)){
                Assert.fail("Beklenen: "+expectingText+" ,"+" Aslında olan: "+actualText);
            }
        }
        catch (Exception e){
            Assert.fail("Text'ler karşılatırılırken hata ile karşılaşıldı.Hata: "+e.getLocalizedMessage());
        }

    }

    @Description("Beklenen ve aslında olan text ifadelerin durumuna göre Vazgeç butonuna tıklanması sağlanır.")
    protected void controlTextError(String expectingText,WebElement actualText){
        if(controlTextWithEquality(expectingText,actualText)==false){
            Assert.fail("Verilen text'ler eş değil. Aslında : "+actualText.getText()+", Beklenen: "+expectingText);
        }
    }

    @Description("İlgili element tıklanana kadar bekler")
    protected void waitUntilElementClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    @Description("Beklenen sayfanın Url bilgisi verilmişse, sayfanın doğruluğunu kontrol eder.")
    protected void controlCurrentPageURL(String expectedUrl){
        try {
            if(!expectedUrl.isEmpty()){
                if(expectedUrl.equals(driver.getCurrentUrl())){
                    Assert.fail("Verilen URL'ler eş değil. Aslında : "+driver.getCurrentUrl()+"/ Beklenen: "+expectedUrl);
                }
            }
        }catch (Exception e){
            logMessage("Sayfa kontrolü yapılırken hata alındı. Hata : "+e.getMessage());
        }

    }


}