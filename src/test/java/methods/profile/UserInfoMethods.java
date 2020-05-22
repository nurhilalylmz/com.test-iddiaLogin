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
        Assert.assertEquals(userInfoPage.textMyInfo.getText(), textBilgilerim);
        Assert.assertEquals(userInfoPage.textPersonInfo.getText(), textPersonInfo);
        Assert.assertEquals(userInfoPage.textDefaultPersonName.getText(), textName);
        Assert.assertEquals(userInfoPage.textDefaultPersonLastName.getText(), textLastName);
        Assert.assertEquals(userInfoPage.textButtonEdit.getText(), textEdit);
        return new UserInfoMethods(driver);
    }

    @Description("İletişim alanında bulunan default textleri kontrol eder.")
    public UserInfoMethods controlDefaultTextContactInfo(String textContactInfo, String textEmail, String textPhone, String textInformed) {
        Assert.assertEquals(userInfoPage.textMyContactInfo.getText(), textContactInfo);
        Assert.assertEquals(userInfoPage.textDefaultContactPersonEmail.getText(), textEmail);
        Assert.assertEquals(userInfoPage.textDefaultPersonPhoneNumber.getText(), textPhone);
        Assert.assertEquals(userInfoPage.textInformedByMailPhone.getText(), textInformed);
        return new UserInfoMethods(driver);
    }

    @Description("Bayi alanında bulunan default textleri kontrol eder.")
    public UserInfoMethods controlDefaultTextDealerInfo(String textDealerInfo, String textDealerNumber, String textDealerName, String textDealerAddress) {
        Assert.assertEquals(userInfoPage.textMyDealerInfo.getText(), textDealerInfo);
        Assert.assertEquals(userInfoPage.textDefaultDealerNumber.getText(), textDealerNumber);
        Assert.assertEquals(userInfoPage.textDefaultDealerName.getText(), textDealerName);
        Assert.assertEquals(userInfoPage.textDefaultDealerAddress.getText(), textDealerAddress);
        return new UserInfoMethods(driver);
    }

    @Description("Bakiye alanında bulunan default textleri kontrol eder.")
    public UserInfoMethods controlDefaultTextMyMoneyInfo(String textMoneyInfo, String textDailyLimit, String textDailyLimitNote) {
        Assert.assertEquals(userInfoPage.textDefaultMoneyInfo.getText().substring(0, 6), textMoneyInfo);
        Assert.assertEquals(userInfoPage.textDefaultDailyLimit.getText(), textDailyLimit);
        Assert.assertEquals(userInfoPage.textDailyLimitNote.getText(), textDailyLimitNote);
        return new UserInfoMethods(driver);
    }

    @Description("Ayarlar alanında bulunan default textleri kontrol eder.")
    public UserInfoMethods controlDefaultTextSettings(String textSettings, String textChangePassword) {
        Assert.assertEquals(userInfoPage.textSettings.getText(), textSettings);
        Assert.assertEquals(userInfoPage.textChangePassword.getText(), textChangePassword);
        return new UserInfoMethods(driver);
    }

    @Description("Bilgilerim alanında bulunan kullanıcının bilgilerini kontrol eder.")
    public UserInfoMethods controlTextMyInfo(String textName, String textLastName) {
        Assert.assertEquals(userInfoPage.textPersonName.getText(), textName);
        Assert.assertEquals(userInfoPage.textPersonLastName.getText(), textLastName);
        return new UserInfoMethods(driver);
    }

    @Description("İletişim alanında bulunan kullanıcının bilgilerini kontrol eder.")
    public UserInfoMethods controlTextContactInfo(String textEmail, String textPhone) {
        Assert.assertEquals(userInfoPage.textPersonEmail.getText(), textEmail);
        Assert.assertEquals(userInfoPage.textPersonPhoneNumber.getText(), textPhone);
        return new UserInfoMethods(driver);
    }

    @Description("Bayi alanında bulunan kullanıcının bilgilerini kontrol eder.")
    public UserInfoMethods controlTextDealerInfo(String textDealerNumber, String textDealerName, String textDealerAddress) {
        Assert.assertEquals(userInfoPage.textDealerNumber.getText(), textDealerNumber);
        Assert.assertEquals(userInfoPage.textDealarName.getText(), textDealerName);
        Assert.assertEquals(userInfoPage.textDealerAddress.getText(), textDealerAddress);
        return new UserInfoMethods(driver);
    }

    @Description("Bakiye alanında bulunan kullanıcının bilgilerini kontrol eder.")
    public UserInfoMethods controlTextMyMoneyInfo(String userName, String textMoneyInfo, String textDailyLimit) {
        Assert.assertEquals(userInfoPage.textUserName.getText(), userName);
        Assert.assertEquals(userInfoPage.textMoneyInfo.getText(), textMoneyInfo);
        Assert.assertEquals(userInfoPage.textDailyLimit.getText(), textDailyLimit);
        return new UserInfoMethods(driver);
    }

    @Description("Bakiye alanında bulunan kullanıcının bilgilerini kontrol eder.")
    public UserInfoMethods pageControl(String expectedURl) {
        controlCurrentPageURL(expectedURl);
        return new UserInfoMethods(driver);
    }

}