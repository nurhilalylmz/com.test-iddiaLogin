package test.profile;

import jdk.jfr.Description;
import methods.profile.UserPasswordMethods;
import org.testng.annotations.Test;
import test.BaseTest;
import utils.properties.UserDataProperties.user.UserPasswordPageProperties;

public class UserPasswordTest extends BaseTest {

    UserPasswordMethods userPasswordPage=new UserPasswordMethods(driver);
    UserPasswordPageProperties getValueProps= new UserPasswordPageProperties();

    @Description("Bütün default alanlar kontrol edilir.")
    @Test
    public void controlDefaultValue() {
        goToProfilePage();
        userPasswordPage
                .goToChangePasswordPage()
                .controlDefaultTextMyPassword(
                        getValueProps.textDefaultChangePasswordTitle,
                        getValueProps.textDefaultPasswordInfo,
                        getValueProps.textDefaultCurrentPassword,
                        getValueProps.textDefaultNewPassword,
                        getValueProps.textDefaultConfirmNewPassword
                );
    }

    @Description("Bütün alanlara değerler girilir ve kaydedilir.")
    @Test
    public void allInputChangeValue() {
        goToProfilePage();
        userPasswordPage
                .goToChangePasswordPage()
                .currentPasswordInputChangeValue(getValueProps.password)
                .newPasswordInputChangeValue(getValueProps.newPassword)
                .confirmNewPasswordInputChangeValue(getValueProps.newPassword)
                .clickSaveButton()
                .goToLoginPage();
        successLogin(getValueProps.phoneNumber,getValueProps.newPassword);
    }

    @Description("Alanlara değer girilmez ve kaydet butonuna tıklanır.")
    @Test
    public void emptyPasswordInputChangeValue() {
        goToProfilePage();
        userPasswordPage
                .goToChangePasswordPage()
                .currentPasswordInputChangeValue("")
                .newPasswordInputChangeValue("")
                .confirmNewPasswordInputChangeValue("")
                .clickSaveButton()
                .controlTextError(getValueProps.textErrorEmptyInput);
    }

    @Description("Alanlara altı karakter numara girilir ve kaydet butonuna tıklanır.")
    @Test
    public void sixLetterRuleJustNumberInputChangeValue() {
        goToProfilePage();
        userPasswordPage
                .goToChangePasswordPage()
                .currentPasswordInputChangeValue(getValueProps.wrongPasswordJustNumber)
                .newPasswordInputChangeValue(getValueProps.wrongNewPasswordJustNumber)
                .confirmNewPasswordInputChangeValue(getValueProps.wrongNewPasswordJustNumber)
                .clickSaveButton()
                .controlTextError(getValueProps.textErrorInvalidPassword);
    }

    @Description("Alanlara altı karakter harf girilir ve kaydet butonuna tıklanır.")
    @Test
    public void sixLetterRuleJustLetterInputValue() {
        goToProfilePage();
        userPasswordPage
                .goToChangePasswordPage()
                .currentPasswordInputChangeValue(getValueProps.wrongPasswordJustLetter)
                .newPasswordInputChangeValue(getValueProps.wrongNewPasswordJustLetter)
                .confirmNewPasswordInputChangeValue(getValueProps.wrongNewPasswordJustLetter)
                .clickSaveButton()
                .controlTextError(getValueProps.textErrorInvalidPassword);
    }

    @Description("Mevcut Şifre alanına hatalı şifre girilir ve kaydet butonuna tıklanır.")
    @Test
    public void invalidCurrentPasswordInputValue() {
        goToProfilePage();
        userPasswordPage
                .goToChangePasswordPage()
                .currentPasswordInputChangeValue(getValueProps.wrongPassword)
                .newPasswordInputChangeValue(getValueProps.newPassword)
                .confirmNewPasswordInputChangeValue(getValueProps.newPassword)
                .clickSaveButton()
                .controlTextError(getValueProps.textErrorCurrentPassword);
    }

    @Description("Eski şifre ile yeni şifre aynı girilir ve kaydet butonuna tıklanır.")
    @Test
    public void newAndOldPasswordAreNotSame() {
        goToProfilePage();
        userPasswordPage = new UserPasswordMethods(driver);
        userPasswordPage
                .goToChangePasswordPage()
                .currentPasswordInputChangeValue(getValueProps.password)
                .newPasswordInputChangeValue(getValueProps.password)
                .confirmNewPasswordInputChangeValue(getValueProps.password)
                .clickSaveButton()
                .controlTextError(getValueProps.textErrorOldNewPassword);
    }

    @Description("Yeni Şifre alanlarına birbirlerinin aynı olmayan şifre girilir ve kaydet butonuna tıklanır.")
    @Test
    public void doNotMatchNewAndConfirmPasswordInputValue() {
        goToProfilePage();
        userPasswordPage
                .goToChangePasswordPage()
                .currentPasswordInputChangeValue(getValueProps.password)
                .newPasswordInputChangeValue(getValueProps.newPassword)
                .confirmNewPasswordInputChangeValue(getValueProps.wrongConfirmPassword)
                .clickSaveButton()
                .controlTextError(getValueProps.textErrorMismatchPassword);
    }

}
