package methods.profile;


import contants.profilePage.ContantsUserPasswordPage;
import jdk.jfr.Description;
import methods.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UserPasswordMethods extends BaseMethods {
    ContantsUserPasswordPage userPasswordPage = PageFactory.initElements(driver, ContantsUserPasswordPage.class);

    public UserPasswordMethods(WebDriver driver) {
        super(driver);
    }

    @Description("Şifrelerim alanında bulunan default textleri kontrol eder.")
    public UserPasswordMethods controlDefaultTextMyPassword(String textDefaultChangePassword, String textDefaultMyPasswordInfo, String textDefaultCurrentPassword, String textDefaultNewPassword, String textDefaultConfirmNewPassword) {
        controlPageTextEqual(userPasswordPage.textDefaultChangePassword.getText(), textDefaultChangePassword);
        controlPageTextEqual(userPasswordPage.textDefaultChangeMyPassword.getText(), textDefaultMyPasswordInfo);
        controlPageTextEqual(userPasswordPage.textDefaultCurrentPassword.getText(), textDefaultCurrentPassword);
        controlPageTextEqual(userPasswordPage.textDefaultNewPassword.getText(), textDefaultNewPassword);
        controlPageTextEqual(userPasswordPage.textDefaultConfirmNewPassword.getText(), textDefaultConfirmNewPassword);
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
    public UserPasswordMethods controlTextError(String textError) {
        waitSeconds(2);
        if (textError.contains("Eski şifrenizi hatalı girdiniz.")) {
            controlTextError(textError, userPasswordPage.textAfterSaveButtonError);
        } else {
            controlTextError(textError, userPasswordPage.textErrorFirstInputAndName);
            controlTextError(textError, userPasswordPage.textErrorNewPassword);
            controlTextError(textError, userPasswordPage.textErrorConfNewPassword);
        }
        return new UserPasswordMethods(driver);
    }

    @Description("Şifre güncelleme sayfasına gidilmesini sağlar.")
    public UserPasswordMethods goToChangePasswordPage() {
        clickElement(userPasswordPage.textChangePassword);
        return new UserPasswordMethods(driver);
    }

}
