package test.profile;

import jdk.jfr.Description;
import methods.profile.UserInfoMethods;
import org.testng.annotations.Test;
import test.BaseTest;
import utils.properties.UserDataProperties.user.UserInfoPageProperties;

public class UserInfoTest extends BaseTest {
    UserInfoMethods userInfoPage=new UserInfoMethods(driver);
    UserInfoPageProperties getValueProp=new UserInfoPageProperties();

    @Description("Profil sayfasında default gelen text alanları kontrol edilir.")
    @Test
    public void controlDefaultText(){
        goToProfilePage();
        userInfoPage
                .controlDefaultTextMyInfo(
                        getValueProp.textDefaultMyInfo,
                        getValueProp.textDefaultMyPersonalInfo,
                        getValueProp.textDefaultName,
                        getValueProp.textDefaultSurname,
                        getValueProp.textDefaultEdit)
                .controlDefaultTextContactInfo(
                        getValueProp.textDefaultMyContact,
                        getValueProp.textDefaultMail,
                        getValueProp.textDefaultPhone,
                        getValueProp.textDefaultInformMe)
                .controlDefaultTextDealerInfo(
                        getValueProp.textDefaultDealerInfo,
                        getValueProp.textDefaultDealerNumber,
                        getValueProp.textDefaultDealerName,
                        getValueProp.textDefaultDealerAddress)
                .controlDefaultTextMyMoneyInfo(
                        getValueProp.textDefaultMoney,
                        getValueProp.textDefaultMoneyLimit,
                        getValueProp.textDefaultMoneyNote)
                .controlDefaultTextSettings(
                        getValueProp.textDefaultSettings,
                        getValueProp.textDefaultChangePassword);
    }

    @Description("Profil sayfasında kullanıcı bilgilerinin doğruluğu kontrol edilir.")
    @Test
    public void controlPersonInfoText() {
        goToProfilePage();
        userInfoPage
                .controlTextMyInfo(
                        getValueProp.personName,
                        getValueProp.personSurname)
                .controlTextContactInfo(
                        getValueProp.personEmail,
                        getValueProp.personPhoneNumber)
                .controlTextDealerInfo(
                        getValueProp.personDelaerNumber,
                        getValueProp.personDelaerName,
                        getValueProp.personDealerAddress)
                .controlTextMyMoneyInfo(
                        getValueProp.person,
                        getValueProp.personMoney,
                        getValueProp.personLimit);
    }
}
