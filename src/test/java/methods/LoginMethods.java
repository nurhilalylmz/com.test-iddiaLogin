package methods;

import contants.ContantsLoginPage;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginMethods extends BaseMethods
{
    ContantsLoginPage loginPage = PageFactory.initElements(driver, ContantsLoginPage.class);

    public LoginMethods(WebDriver driver) {
        super(driver);
    }


    @Description("Girilen bilgilerle birlikte kullanıcı login olur.")
    public LoginMethods login(String phoneNumber, String password) {
        waitForPageLoad(loginPage.copyrightText);
        writeText(loginPage.phoneNumber, phoneNumber);
        writeText(loginPage.password, password);
        clickElement(loginPage.buttonLogin);
        return new LoginMethods(driver);
    }

    @Description("Kullanıcının hangi sayfada olduğu kontrol edilir.")
    public LoginMethods checkUserMainPage(String expectingUrl) {
        waitForPageLoad(loginPage.copyrightText);
        Assert.assertEquals(driver.getCurrentUrl(), expectingUrl, "İstenen sayfada olunmadığı görüldü");
        return new LoginMethods(driver);
    }

    @Description("Girilen bilgilere göre hata mesajlarının verilmesi sağlanır.")
    public LoginMethods checkTrueLogin(String phoneNumber, String password, String expectedText, String expectedURL) {
        if (phoneNumber.isEmpty()) {
            Assert.assertEquals(loginPage.loginError.getText(), expectedText);
        } else if (phoneNumber.isEmpty() && password.isEmpty()) {
            Assert.assertEquals(loginPage.loginError.getText(), expectedText);
        } else if (password.isEmpty()) {
            Assert.assertEquals(loginPage.loginError.getText(), expectedText);
        } else if ((!phoneNumber.isEmpty() && !password.isEmpty()) && driver.getCurrentUrl() != expectedURL) {
            Assert.assertEquals(loginPage.loginError.getText(), expectedText);
        }
        return new LoginMethods(driver);
    }

    @Description("Çıkan pop-up'ı kapatır.")
    public LoginMethods closePopup() {
        waitElementToClickable(loginPage.buttonClosePopup);
        clickElement(loginPage.buttonClosePopup);
        return new LoginMethods(driver);
    }
}

