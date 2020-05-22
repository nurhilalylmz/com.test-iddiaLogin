package test.profile;

import jdk.jfr.Description;
import methods.profile.UserInfoMethods;
import org.testng.annotations.Test;
import pages.BasePage;
import test.BaseTest;
import test.LoginMethodsTest;

public class UserInfoTest extends BaseTest {
    UserInfoMethods userInfoPage;

    String phone="05349199918";

    @Description("Profil sayfasında default gelen text alanları kontrol edilir.")
    @Test
    public void controlDefaultText() {
        goToProfilePage();
        userInfoPage
                .controlDefaultTextMyInfo(
                        "BİLGİLERİM",
                        "Kişisel Bilgilerim",
                        "Adınız",
                        "Soyadınız",
                        "Düzenle")
                .controlDefaultTextContactInfo(
                        "İletişim Bilgilerim",
                        "E-posta",
                        "Cep Telefonu",
                        "E-posta ve SMS ile güncel kampanyalardan haberdar olmak istiyorum.")
                .controlDefaultTextDealerInfo(
                        "Kayıtlı Bayi Bilgileri",
                        "Bayi Numarası",
                        "Bayi Adı",
                        "Bayi Adresi")
                .controlDefaultTextMyMoneyInfo(
                        "Bakiye",
                        "Kalan günlük yükleme limit",
                        "* Tek seferde maksimum 1000 TL bakiye yükleyebilirsiniz.")
                .controlDefaultTextSettings(
                        "AYARLAR",
                        "Şifre Değiştir");
    }

    @Description("Profil sayfasında kullanıcı bilgilerinin doğruluğu kontrol edilir.")
    @Test
    public void controlPersonInfoText() {
        goToProfilePage();
        userInfoPage
                .controlTextMyInfo(
                        "Hilal",
                        "Yılmaz")
                .controlTextContactInfo(
                        "testhilaltest@gmail.com",
                        phone)
                .controlTextDealerInfo(
                        "110319",
                        "MEHMET MANGIR",
                        "HAN MAH. NURİ EROĞLU SOK. NO:3/A 10050 SUSURLUK / BALIKESİR")
                .controlTextMyMoneyInfo(
                        "Hilal Yılmaz",
                        "14991 TL",
                        "15000 TL");
    }
}
