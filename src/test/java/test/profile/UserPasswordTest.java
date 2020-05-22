package test.profile;

import jdk.jfr.Description;
import methods.profile.UserPasswordMethods;
import org.testng.annotations.Test;
import pages.BasePage;

public class UserPasswordTest extends BasePage {
    UserPasswordMethods userPasswordPage;

    @Description("Bütün default alanlar kontrol edilir.")
    @Test
    public void controlDefaultValue() {
        userPasswordPage = new UserPasswordMethods(driver);
        userPasswordPage
                .goToChangePasswordPage()
                .controlDefaultTextMyPassword(
                        "ŞİFRE DEĞİŞTİR",
                        "Şifre Bilgilerim",
                        "Mevcut Şifre",
                        "Yeni Şifre",
                        "Yeni Şifre (Tekrar)"
                )
                .clickSaveButton();
    }

    @Description("Bütün alanlara değerler girilir ve kaydedilir.")
    @Test
    public void allInputChangeValue() {
        userPasswordPage = new UserPasswordMethods(driver);
        userPasswordPage
                .goToChangePasswordPage()
                .currentPasswordInputChangeValue("qwerty1")
                .newPasswordInputChangeValue("testhilaltest34")
                .confirmNewPasswordInputChangeValue("testhilaltest34")
                .clickSaveButton();
    }

    @Description("Alanlara değer girilmez ve kaydet butonuna tıklanır.")
    @Test
    public void emptyPasswordInputChangeValue() {
        userPasswordPage = new UserPasswordMethods(driver);
        userPasswordPage
                .goToChangePasswordPage()
                .currentPasswordInputChangeValue(" ")
                .newPasswordInputChangeValue(" ")
                .confirmNewPasswordInputChangeValue(" ")
                .clickSaveButton()
                .controlTextErrorAndClick("Bu alanın doldurulması zorunludur.");
    }

    @Description("Alanlara altı karakter numara girilir ve kaydet butonuna tıklanır.")
    @Test
    public void sixLetterRuleJustNumberInputChangeValue() {
        userPasswordPage = new UserPasswordMethods(driver);
        userPasswordPage
                .goToChangePasswordPage()
                .currentPasswordInputChangeValue("789456")
                .newPasswordInputChangeValue("123456")
                .confirmNewPasswordInputChangeValue("123456")
                .clickSaveButton()
                .controlTextErrorAndClick("Şifre maksimum 20 minimum 6 karakter içermelidir ve en az bir harf ve bir sayı içermelidir.");
    }

    @Description("Alanlara altı karakter harf girilir ve kaydet butonuna tıklanır.")
    @Test
    public void sixLetterRuleJustLetterInputValue() {
        userPasswordPage = new UserPasswordMethods(driver);
        userPasswordPage
                .goToChangePasswordPage()
                .currentPasswordInputChangeValue("hilalt")
                .newPasswordInputChangeValue("testhil")
                .confirmNewPasswordInputChangeValue("testhil")
                .clickSaveButton()
                .controlTextErrorAndClick("Şifre maksimum 20 minimum 6 karakter içermelidir ve en az bir harf ve bir sayı içermelidir.");
    }

    @Description("Mevcut Şifre alanına hatalı şifre girilir ve kaydet butonuna tıklanır.")
    @Test
    public void invalidCurrentPasswordInputValue() {
        userPasswordPage = new UserPasswordMethods(driver);
        userPasswordPage
                .goToChangePasswordPage()
                .currentPasswordInputChangeValue("testhilal34")
                .newPasswordInputChangeValue("123456h")
                .confirmNewPasswordInputChangeValue("123456h")
                .clickSaveButton()
                .controlTextErrorAndClick("Eski şifrenizi hatalı girdiniz.");
    }

    @Description("Yeni Şifre alanlarına birbirlerinin aynı olmayan şifre girilir ve kaydet butonuna tıklanır.")
    @Test
    public void doNotMatchNewAndConfirmPasswordInputValue() {
        userPasswordPage = new UserPasswordMethods(driver);
        userPasswordPage
                .goToChangePasswordPage()
                .currentPasswordInputChangeValue("qwerty1")
                .newPasswordInputChangeValue("123456h")
                .confirmNewPasswordInputChangeValue("123456hk")
                .clickSaveButton()
                .controlTextErrorAndClick("Şifreleriniz eşleşmemektedir.");
    }

}
