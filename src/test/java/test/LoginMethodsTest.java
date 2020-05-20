package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginMethods;

public class LoginMethodsTest extends LoginMethods {
    LoginMethods loginPage = new LoginMethods(driver);
    String phone="05349199918";

    public LoginMethodsTest(WebDriver webDriver) {
        super(webDriver);
    }

    @Test(description = "Başarılı login işlemi gerçekleşmesi beklenir.")
    public void successLogin() {
        loginPage
                .login(phone, "qwerty1")
                .checkUserMainPage("https://test.iddaa.com/");
    }

    @Test(description = "Hatalı bilgi girişi olan login uyarısının verilmesi beklenir.")
    public void wrongInformationTextLogin() {
        loginPage
                .login("05349199918", "testhi54lal34")
                .checkTrueLogin(
                        "05349199918",
                        "testhi54lal34",
                        "Telefon numarası veya şifre hatalı.",
                        driver.getCurrentUrl());

    }

    @Test
    public void emptyPhoneLogin() {
        loginPage
                .login("", "511365")
                .checkTrueLogin(
                        "",
                        "testhilal34",
                        "Bu alanın doldurulması zorunludur.",
                        "");
    }

    @Test
    public void emptyPasswordLogin() {
        loginPage
                .login("05349199918", "")
                .checkTrueLogin(
                        "05349199918",
                        "", "Bu alanın doldurulması zorunludur.",
                        "");
    }

    @Test
    public void emptyAllTextFieldsLogin() {
        loginPage
                .login("", "")
                .checkTrueLogin(
                        "",
                        "",
                        "Bu alanın doldurulması zorunludur.",
                        "");
    }

    @Test
    public void invalidMinPhoneNumberLogin() {
        loginPage
                .login("0919999999", "testhilaltest")
                .checkTrueLogin(
                        "0919999999",
                        "testhilaltest",
                        "Lütfen geçerli bir telefon numarası giriniz. Telefon numarası başına 0 olacak şekilde 11 haneli olmalıdır.",
                        "");
    }

    @Test
    public void invalidMaxPhoneNumberLogin() {
        loginPage
                .login("091999999999", "testhilaltest")
                .checkTrueLogin(
                        "091999999999",
                        "testhilaltest",
                        "Lütfen geçerli bir telefon numarası giriniz. Telefon numarası başına 0 olacak şekilde 11 haneli olmalıdır.",
                        "");
    }

    @Test
    public void invalidWithoutZeroPhoneNumberLogin() {
        loginPage
                .login("919999999999", "testhilaltest")
                .checkTrueLogin(
                        "991999999999",
                        "testhilaltest",
                        "Lütfen geçerli bir telefon numarası giriniz. Telefon numarası başına 0 olacak şekilde 11 haneli olmalıdır.",
                        "");
    }

    @Test
    public void invalidMinPasswordLogin() {
        loginPage
                .login("05349199918", "testhi")
                .checkTrueLogin("05349199918",
                        "testhi",
                        "Şifre maksimum 20 minimum 6 karakter içermelidir ve en az bir harf ve bir sayı içermelidir.",
                        "");
    }

    @Test
    public void invalidMaxPasswordLogin() {
        loginPage
                .login("05349199918", "testhilaltesthilaltesthilal")
                .checkTrueLogin(
                        "05349199918",
                        "testhilaltesthilaltesthilal",
                        "Şifre maksimum 20 minimum 6 karakter içermelidir ve en az bir harf ve bir sayı içermelidir.",
                        "");
    }
}

