package test;

import jdk.jfr.Description;
import methods.LoginMethods;
import methods.profile.UserInfoMethods;
import org.testng.annotations.Test;
import pages.BasePage;
import utils.UserDataProperties.LoginPageProperties;

public class BaseTest extends BasePage {
    LoginMethods loginPage;
    UserInfoMethods userInfoPage;
    LoginPageProperties getValueProp =new LoginPageProperties();

    @Test(description = "Başarılı login işlemi gerçekleşmesi beklenir.")
    public void successLogin(String phone, String password) {
        loginPage = new LoginMethods(driver);
        loginPage
                .login(phone, password)
                .closePopup()
                .checkUserMainPage(getValueProp.mainPage);
    }

    @Description("Kullanıcı login olur ve profil sayfasına gidilir.")
    @Test
    public void goToProfilePage() {
        userInfoPage = new UserInfoMethods(driver);
        successLogin(getValueProp.phoneNumber, getValueProp.password);
        userInfoPage
                .goToProfilePage()
                .pageControl("https://test.iddaa.com/profilim/");
    }

}

