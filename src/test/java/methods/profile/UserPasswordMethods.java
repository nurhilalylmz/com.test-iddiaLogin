package methods.profile;


import contants.profilePage.ContantsUserInfoPage;
import contants.profilePage.ContantsUserPasswordPage;
import jdk.jfr.Description;
import methods.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UserPasswordMethods extends BaseMethods {
    ContantsUserPasswordPage userPasswordPage = PageFactory.initElements(driver, ContantsUserPasswordPage.class);
    ContantsUserInfoPage userInfoPage = PageFactory.initElements(driver, ContantsUserInfoPage.class);

    public UserPasswordMethods(WebDriver driver) {
        super(driver);
    }

    @Description("Şifrelerim alanında bulunan default textleri kontrol eder.")
    public UserPasswordMethods controlDefaultTextMyPassword(String textDefaultChangePassword, String textDefaultMyPasswordInfo, String textDefaultCurrentPassword, String textDefaultNewPassword, String textDefaultConfirmNewPassword) {
        Assert.assertEquals(userPasswordPage.textDefaultChangePassword.getText(), textDefaultChangePassword);
        Assert.assertEquals(userPasswordPage.textDefaultChangeMyPassword.getText(), textDefaultMyPasswordInfo);
        Assert.assertEquals(userPasswordPage.textDefaultCurrentPassword.getText(), textDefaultCurrentPassword);
        Assert.assertEquals(userPasswordPage.textDefaultNewPassword.getText(), textDefaultNewPassword);
        Assert.assertEquals(userPasswordPage.textDefaultConfirmNewPassword.getText(), textDefaultConfirmNewPassword);
        return new UserPasswordMethods(driver);
    }

    @Description("Mevcut şifre alanına veri girişini sağlar.")
    public UserPasswordMethods currentPasswordInputChangeValue(String inputCurrentPassword) {
        writeText(userPasswordPage.inputCurrentPassword, inputCurrentPassword);
        return new UserPasswordMethods(driver);
    }

    @Description("Yeni şifre alanına veri girişini sağlar.")
    public UserPasswordMethods newPasswordInputChangeValue(String inputNewPassword) {
        writeText(userPasswordPage.inputNewPassword, inputNewPassword);
        return new UserPasswordMethods(driver);
    }

    @Description("Yeni şifre(tekrar) alanına veri girişini sağlar.")
    public UserPasswordMethods confirmNewPasswordInputChangeValue(String inputConfirmNewPassword) {
        writeText(userPasswordPage.inputConfirmNewPassword, inputConfirmNewPassword);
        return new UserPasswordMethods(driver);
    }

    @Description("Kaydet butonuna tıklanır.")
    public UserPasswordMethods clickSaveButton() {
        clickElement(userPasswordPage.buttonSave);
        return new UserPasswordMethods(driver);
    }
    @Description("Verilen bilgilerin doğruluğuna göre kontrol eder.")
    public UserPasswordMethods controlTextErrorAndClick(String textError) {
        waitSeconds(2);
        if (textError.contains("Eski şifrenizi hatalı girdiniz.")) {
            controlTextError(textError, userPasswordPage.textAfterSaveButtonError);
        } else {
            controlTextError(textError, userPasswordPage.textError);
        }
        return new UserPasswordMethods(driver);
    }

    @Description("Şifre güncelleme sayfasına gidilmesini sağlar.")
    public UserPasswordMethods goToChangePasswordPage() {
        clickElement(userInfoPage.textChangePassword);
        return new UserPasswordMethods(driver);
    }

}
