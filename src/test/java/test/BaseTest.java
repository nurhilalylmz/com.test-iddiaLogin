package test;

import jdk.jfr.Description;
import methods.LoginMethods;
import methods.profile.UserInfoMethods;
import org.testng.annotations.Test;
import pages.BasePage;

public class BaseTest extends BasePage {
    LoginMethods loginPage;
    UserInfoMethods userInfoPage;
    String phone="05349199918";
    @Test(description = "Başarılı login işlemi gerçekleşmesi beklenir.")
    public void successLogin() {
        loginPage = new LoginMethods(driver);
        loginPage
                .login(phone, "qwerty1")
                .closePopup()
                .checkUserMainPage("https://test.iddaa.com/");
    }
    @Description("Kullanıcı login olur ve profil sayfasına gidilir.")
    @Test
    public void goToProfilePage() {
        userInfoPage = new UserInfoMethods(driver);
        successLogin();
        userInfoPage
                .goToProfilePage()
                .pageControl("https://test.iddaa.com/profilim/");
    }
}
