package methods.profile;

import contants.profilePage.ContantsUserInfoPage;
import jdk.jfr.Description;
import methods.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UserInfoMethods extends BaseMethods {
    ContantsUserInfoPage userInfoPage = PageFactory.initElements(driver, ContantsUserInfoPage.class);

    public UserInfoMethods(WebDriver driver) {
        super(driver);
    }

    @Description("Profil sayfasına gidilmesini sağlar.")
    public UserInfoMethods goToProfilePage() {
        waitElementToClickable(userInfoPage.wrapperProfile);
        clickElement(userInfoPage.wrapperProfile);
        waitElementToClickable(userInfoPage.buttonProfilim);
        clickElement(userInfoPage.buttonProfilim);
        return new UserInfoMethods(driver);
    }

    @Description("Bilgilerim alanında bulunan default textleri kontrol eder.")
    public UserInfoMethods controlDefaultTextMyInfo(String textBilgilerim, String textPersonInfo, String textName, String textLastName, String textEdit) {
        waitSeconds(1);
        controlPageTextEqual(userInfoPage.textMyInfo.getText(), textBilgilerim);
        controlPageTextEqual(userInfoPage.textPersonInfo.getText(), textPersonInfo);
        controlPageTextEqual(userInfoPage.textDefaultPersonName.getText(), textName);
        controlPageTextEqual(userInfoPage.textDefaultPersonLastName.getText(), textLastName);
        controlPageTextEqual(userInfoPage.textButtonEdit.getText(), textEdit);
        return new UserInfoMethods(driver);
    }

    @Description("İletişim alanında bulunan default textleri kontrol eder.")
    public UserInfoMethods controlDefaultTextContactInfo(String textContactInfo, String textEmail, String textPhone, String textInformed) {
        controlPageTextEqual(userInfoPage.textMyContactInfo.getText(), textContactInfo);
        controlPageTextEqual(userInfoPage.textDefaultContactPersonEmail.getText(), textEmail);
        controlPageTextEqual(userInfoPage.textDefaultPersonPhoneNumber.getText(), textPhone);
        controlPageTextEqual(userInfoPage.textInformedByMailPhone.getText(), textInformed);
        return new UserInfoMethods(driver);
    }

    @Description("Bayi alanında bulunan default textleri kontrol eder.")
    public UserInfoMethods controlDefaultTextDealerInfo(String textDealerInfo, String textDealerNumber, String textDealerName, String textDealerAddress) {
        controlPageTextEqual(userInfoPage.textMyDealerInfo.getText(), textDealerInfo);
        controlPageTextEqual(userInfoPage.textDefaultDealerNumber.getText(), textDealerNumber);
        controlPageTextEqual(userInfoPage.textDefaultDealerName.getText(), textDealerName);
        controlPageTextEqual(userInfoPage.textDefaultDealerAddress.getText(), textDealerAddress);
        return new UserInfoMethods(driver);
    }

    @Description("Bakiye alanında bulunan default textleri kontrol eder.")
    public UserInfoMethods controlDefaultTextMyMoneyInfo(String textMoneyInfo, String textDailyLimit, String textDailyLimitNote) {
        controlPageTextEqual(userInfoPage.textDefaultMoneyInfo.getText().substring(0, 6), textMoneyInfo);
        controlPageTextEqual(userInfoPage.textDefaultDailyLimit.getText(), textDailyLimit);
        controlPageTextEqual(userInfoPage.textDailyLimitNote.getText(), textDailyLimitNote);
        return new UserInfoMethods(driver);
    }

    @Description("Ayarlar alanında bulunan default textleri kontrol eder.")
    public UserInfoMethods controlDefaultTextSettings(String textSettings, String textChangePassword) {
        controlPageTextEqual(userInfoPage.textSettings.getText(), textSettings);
        controlPageTextEqual(userInfoPage.textChangePassword.getText(), textChangePassword);
        return new UserInfoMethods(driver);
    }

    @Description("Bilgilerim alanında bulunan kullanıcının bilgilerini kontrol eder.")
    public UserInfoMethods controlTextMyInfo(String textName, String textLastName) {
        controlPageTextEqual(userInfoPage.textPersonName.getText(), textName);
        controlPageTextEqual(userInfoPage.textPersonLastName.getText(), textLastName);
        return new UserInfoMethods(driver);
    }

    @Description("İletişim alanında bulunan kullanıcının bilgilerini kontrol eder.")
    public UserInfoMethods controlTextContactInfo(String textEmail, String textPhone) {
        controlPageTextEqual(userInfoPage.textPersonEmail.getText(), textEmail);
        controlPageTextEqual(userInfoPage.textPersonPhoneNumber.getText(), textPhone);
        return new UserInfoMethods(driver);
    }

    @Description("Bayi alanında bulunan kullanıcının bilgilerini kontrol eder.")
    public UserInfoMethods controlTextDealerInfo(String textDealerNumber, String textDealerName, String textDealerAddress) {
        controlPageTextEqual(userInfoPage.textDealerNumber.getText(), textDealerNumber);
        controlPageTextEqual(userInfoPage.textDealarName.getText(), textDealerName);
        controlPageTextEqual(userInfoPage.textDealerAddress.getText(), textDealerAddress);
        return new UserInfoMethods(driver);
    }

    @Description("Bakiye alanında bulunan kullanıcının bilgilerini kontrol eder.")
    public UserInfoMethods controlTextMyMoneyInfo(String userName, String textMoneyInfo, String textDailyLimit) {
        controlPageTextEqual(userInfoPage.textUserName.getText(), userName);
        controlPageTextEqual(userInfoPage.textMoneyInfo.getText(), textMoneyInfo);
        controlPageTextEqual(userInfoPage.textDailyLimit.getText(), textDailyLimit);
        return new UserInfoMethods(driver);
    }

    @Description("Bulunulan sayfayı kontrol eder.")
    public UserInfoMethods pageControl(String expectedURl) {
        controlCurrentPageURL(expectedURl);
        return new UserInfoMethods(driver);
    }

}