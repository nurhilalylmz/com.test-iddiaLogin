package test.profile;

import methods.profile.UserEditMethods;
import org.testng.annotations.Test;
import test.BaseTest;

public class UserEditTest extends BaseTest {
    UserEditMethods userEditPage;

    @Test(description = "Bütün alanlara değerler girilir ve kaydedilir.")
    public void allInputChangeValue() {
        userEditPage = new UserEditMethods(driver);
        goToProfilePage();
        userEditPage
                .clickEditButton()
                .nameInputChangeValue("Nur Hilal")
                .surnameInputChangeValue("Öztürk")
                .emailInputChangeValue("testhilaltestmbsm@gmail.com")
                .clickCheckFormSubscribe()
                .clickSaveButton()
                .controlPageTextError("");
    }

    @Test(description = "Alanlara değer girilmez ve kaydet butonuna tıklanır.")
    public void emptyInputChangeValue() {
        userEditPage = new UserEditMethods(driver);
        goToProfilePage();
        userEditPage
                .clickEditButton()
                .nameInputChangeValue("")
                .surnameInputChangeValue("")
                .phoneInputChangeValue("")
                .clickSaveButton()
                .controlPageTextError("Bu alanın doldurulması zorunludur.");
    }

    @Test(description = "Ad-Soyad alanına tek harf girilir ve kaydet butonuna tıklanır.")
    public void twoLetterRuleInputChangeValue() {
        userEditPage = new UserEditMethods(driver);
        goToProfilePage();
        userEditPage
                .clickEditButton()
                .nameInputChangeValue("N")
                .surnameInputChangeValue("K")
                .clickSaveButton()
                .controlPageTextError("Ad alanı minimum 2, maksimum 30 karakter içermelidir. Özel karakter içermemelidir.")
                .controlPageTextError("Soyad alanı minimum 2, maksimum 30 karakter içermelidir. Özel karakter içermemelidir.");
    }

    @Test(description = "Ad-Soyad alanına 30'dan fazla harf girilir ve kaydet butonuna tıklanır.")
    public void thirtyLetterRuleInputChangeValue() {
        userEditPage = new UserEditMethods(driver);
        goToProfilePage();
        userEditPage
                .clickEditButton()
                .nameInputChangeValue("NurHilalnurhilalnurhilalnurhila")
                .surnameInputChangeValue("Karakarakarakarakarakarakarakark")
                .clickSaveButton()
                .controlPageTextError("Maksimum 30 karakter olmalıdır");
    }

    @Test(description = "Ad-Soyad alanına özel karakter girilir ve kaydet butonuna tıklanır.")
    public void specialCharacterInputChangeValue() {
        userEditPage = new UserEditMethods(driver);
        goToProfilePage();
        userEditPage
                .clickEditButton()
                .nameInputChangeValue("hilal@")
                .surnameInputChangeValue("kara@")
                .clickSaveButton()
                .controlPageTextError("Ad alanı minimum 2, maksimum 30 karakter içermelidir. Özel karakter içermemelidir.")
                .controlPageTextError("Soyad alanı minimum 2, maksimum 30 karakter içermelidir. Özel karakter içermemelidir.");
    }

    @Test(description = "Email alanına geçersiz değer girilir ve kaydet butonuna tıklanır.")
    public void invalidRuleMailInputChangeValue() {
        userEditPage = new UserEditMethods(driver);
        goToProfilePage();
        userEditPage
                .clickEditButton()
                .emailInputChangeValue("testhilaltest@gmail.c")
                .clickSaveButton()
                .controlEmailError("Geçerli bir mail adresi giriniz");
    }

    @Test(description = "Email alanına türkçe harf girilir ve kaydet butonuna tıklanır.")
    public void specCharacterRuleMailInputChangeValue() {
        userEditPage = new UserEditMethods(driver);
        goToProfilePage();
        userEditPage
                .clickEditButton()
                .emailInputChangeValue("testhılal@gmail.com")
                .clickSaveButton()
                .controlEmailValue("testhılal@gmail.com");
    }

    @Test(description = "Numara alanına hatalı numara girilir ve kaydet butonuna tıklanır.")
    public void invalidPhoneNumberInputChangeValue() {
        userEditPage = new UserEditMethods(driver);
        goToProfilePage();
        userEditPage
                .clickEditButton()
                .phoneInputChangeValue("5399199999")
                .clickSaveButton()
                .controlPageTextError("Lütfen geçerli bir telefon numarası giriniz. Telefon numarası başına 0 olacak şekilde 11 haneli olmalıdır.");
    }
}
