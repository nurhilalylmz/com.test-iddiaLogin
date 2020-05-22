package test;

import org.testng.annotations.Test;
import pages.BasePage;
import methods.LoginMethods;

public class LoginMethodsTest extends BaseTest {
    LoginMethods loginPage;

    @Test(description = "Hatalı bilgi girişi olan login uyarısının verilmesi beklenir.")
    public void wrongInformationTextLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .closePopup()
                .login("05349199999", "testhi54lal34")
                .checkTrueLogin(
                        "05349199999",
                        "testhi54lal34",
                        "Telefon numarası veya şifre hatalı.",
                        driver.getCurrentUrl());

    }

    @Test
    public void emptyPhoneLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .closePopup()
                .login("", "511365")
                .checkTrueLogin(
                        "",
                        "testhilal34",
                        "Bu alanın doldurulması zorunludur.",
                        "");
    }

    @Test
    public void emptyPasswordLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .closePopup()
                .login("05349199918", "")
                .checkTrueLogin(
                        "05349199918",
                        "", "Bu alanın doldurulması zorunludur.",
                        "");
    }

    @Test
    public void emptyAllTextFieldsLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .closePopup()
                .login("", "")
                .checkTrueLogin(
                        "",
                        "",
                        "Bu alanın doldurulması zorunludur.",
                        "");
    }

    @Test
    public void invalidMinPhoneNumberLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .closePopup()
                .login("0919999999", "testhilaltest")
                .checkTrueLogin(
                        "0919999999",
                        "testhilaltest",
                        "Lütfen geçerli bir telefon numarası giriniz. Telefon numarası başına 0 olacak şekilde 11 haneli olmalıdır.",
                        "");
    }

    @Test
    public void invalidMaxPhoneNumberLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .closePopup()
                .login("091999999999", "testhilaltest")
                .checkTrueLogin(
                        "091999999999",
                        "testhilaltest",
                        "Lütfen geçerli bir telefon numarası giriniz. Telefon numarası başına 0 olacak şekilde 11 haneli olmalıdır.",
                        "");
    }

    @Test
    public void invalidWithoutZeroPhoneNumberLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .closePopup()
                .login("919999999999", "testhilaltest")
                .checkTrueLogin(
                        "991999999999",
                        "testhilaltest",
                        "Lütfen geçerli bir telefon numarası giriniz. Telefon numarası başına 0 olacak şekilde 11 haneli olmalıdır.",
                        "");
    }

    @Test
    public void invalidMinPasswordLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .closePopup()
                .login("05349199918", "testhi")
                .checkTrueLogin("05349199918",
                        "testhi",
                        "Şifre maksimum 20 minimum 6 karakter içermelidir ve en az bir harf ve bir sayı içermelidir.",
                        "");
    }

    @Test
    public void invalidMaxPasswordLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .closePopup()
                .login("05349199918", "testhilaltesthilaltesthilal")
                .checkTrueLogin(
                        "05349199918",
                        "testhilaltesthilaltesthilal",
                        "Şifre maksimum 20 minimum 6 karakter içermelidir ve en az bir harf ve bir sayı içermelidir.",
                        "");
    }
}

