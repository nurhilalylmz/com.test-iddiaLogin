package test;

import org.testng.annotations.Test;
import methods.LoginMethods;
import utils.UserDataProperties.LoginPageProperties;

public class LoginMethodsTest extends BaseTest {
    LoginMethods loginPage;
    LoginPageProperties getValueProp=new LoginPageProperties();

    @Test(description = "Hatalı bilgi girişi olan login uyarısının verilmesi beklenir.")
    public void wrongInformationTextLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .closePopup()
                .login(getValueProp.phoneNumber, getValueProp.wrongPassword)
                .checkTrueLogin(
                        getValueProp.phoneNumber,
                        getValueProp.wrongPassword,
                        getValueProp.textErrorWrongInformation,
                        driver.getCurrentUrl());

    }

    @Test(description = "Telefon alanı boş bırakılıp giriş butonuna tıklandığında uyarının verilmesi beklenir.")
    public void emptyPhoneLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .closePopup()
                .login("", getValueProp.password)
                .checkTrueLogin(
                        "",
                        getValueProp.password,
                        getValueProp.textErrorEmptyInput,
                        "");
    }

    @Test(description = "Şifre alanı boş bırakılıp giriş butonuna tıklandığında uyarının verilmesi beklenir.")
    public void emptyPasswordLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .closePopup()
                .login(getValueProp.phoneNumber, "")
                .checkTrueLogin(
                        getValueProp.phoneNumber,
                        "", getValueProp.textErrorEmptyInput,
                        "");
    }

    @Test(description = "Tüm alanlar boş bırakılıp giriş butonuna tıklandığında uyarının verilmesi beklenir.")
    public void emptyAllTextFieldsLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .closePopup()
                .login("", "")
                .checkTrueLogin(
                        "",
                        "",
                        getValueProp.textErrorEmptyInput,
                        "");
    }

    @Test(description = "Telefon alanı hatalı min telefon numarası giriş butonuna tıklandığında uyarının verilmesi beklenir.")
    public void invalidMinPhoneNumberLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .closePopup()
                .login(getValueProp.wrongMinPhoneNumber, getValueProp.password)
                .checkTrueLogin(
                        getValueProp.wrongMinPhoneNumber,
                        getValueProp.password,
                        getValueProp.textErrorInvalidPhone,
                        "");
    }

    @Test(description = "Telefon alanı hatalı max telefon numarası giriş butonuna tıklandığında uyarının verilmesi beklenir.")
    public void invalidMaxPhoneNumberLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .closePopup()
                .login(getValueProp.wrongMaxPhoneNumber, getValueProp.password)
                .checkTrueLogin(
                        getValueProp.wrongMaxPhoneNumber,
                        getValueProp.password,
                        getValueProp.textErrorInvalidPhone,
                        "");
    }

    @Test(description = "Telefon alanı hatalı başında 0 olmadan telefon numarası giriş butonuna tıklandığında uyarının verilmesi beklenir.")
    public void invalidWithoutZeroPhoneNumberLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .closePopup()
                .login(getValueProp.wrongWithoutZeroPhoneNumber, getValueProp.password)
                .checkTrueLogin(
                        getValueProp.wrongWithoutZeroPhoneNumber,
                        getValueProp.password,
                        getValueProp.textErrorInvalidPhone,
                        "");
    }

    @Test(description = "Şifre alanı hatalı min şifre girilir ve  giriş butonuna tıklandığında uyarının verilmesi beklenir.")
    public void invalidMinPasswordLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .closePopup()
                .login(getValueProp.phoneNumber, getValueProp.wrongMinPassword)
                .checkTrueLogin(getValueProp.phoneNumber,
                        getValueProp.wrongMinPassword,
                        getValueProp.textErrorInvalidPassword,
                        "");
    }

    @Test(description = "Şifre alanı hatalı max şifre girilir ve  giriş butonuna tıklandığında uyarının verilmesi beklenir.")
    public void invalidMaxPasswordLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .closePopup()
                .login(getValueProp.phoneNumber, getValueProp.wrongMaxPassword)
                .checkTrueLogin(
                        getValueProp.phoneNumber,
                        getValueProp.wrongMaxPassword,
                        getValueProp.textErrorInvalidPassword,
                        "");
    }
}

