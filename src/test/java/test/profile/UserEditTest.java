package test.profile;

import methods.profile.UserEditMethods;
import org.testng.annotations.Test;
import test.BaseTest;
import utils.properties.UserDataProperties.user.UserEditPageProperties;

public class UserEditTest extends BaseTest {
    UserEditMethods userEditPage = new UserEditMethods(driver);
    UserEditPageProperties getValueProps= new UserEditPageProperties();

    @Test(description = "Bütün alanlara değerler girilir ve kaydedilir.")
    public void allInputChangeValue() {
        userEditPage = new UserEditMethods(driver);
        goToProfilePage();
        userEditPage
                .clickEditButton()
                .nameInputChangeValue(getValueProps.truPersonName)
                .surnameInputChangeValue(getValueProps.truePersonSurname)
                .emailInputChangeValue(getValueProps.truePersonMail)
                .clickCheckFormSubscribe()
                .clickSaveButton()
                .controlPageTextError("")
                .logout();
    }

    @Test(description = "Alanlara değer girilmez ve kaydet butonuna tıklanır.")
    public void emptyInputChangeValue() {
        goToProfilePage();
        userEditPage
                .clickEditButton()
                .nameInputChangeValue("")
                .surnameInputChangeValue("")
                .phoneInputChangeValue("")
                .clickSaveButton()
                .controlPageTextError(getValueProps.textErrorEmptyInput);
    }

    @Test(description = "Ad-Soyad alanına tek harf girilir ve kaydet butonuna tıklanır.")
    public void twoLetterRuleInputChangeValue() {
        goToProfilePage();
        userEditPage
                .clickEditButton()
                .nameInputChangeValue(getValueProps.minPersonName)
                .surnameInputChangeValue(getValueProps.minPersonSurname)
                .clickSaveButton()
                .controlPageTextError(getValueProps.textErrorInvalidName)
                .controlPageTextError(getValueProps.textErrorInvalidSurname);
    }

    @Test(description = "Ad-Soyad alanına 30'dan fazla harf girilir ve kaydet butonuna tıklanır.")
    public void thirtyLetterRuleInputChangeValue() {
        goToProfilePage();
        userEditPage
                .clickEditButton()
                .nameInputChangeValue(getValueProps.maxPersonName)
                .surnameInputChangeValue(getValueProps.maxPersonSurname)
                .clickSaveButton()
                .controlPageTextError(getValueProps.textErrorMaxCharacter);
    }

    @Test(description = "Ad-Soyad alanına özel karakter girilir ve kaydet butonuna tıklanır.")
    public void specialCharacterInputChangeValue() {
        goToProfilePage();
        userEditPage
                .clickEditButton()
                .nameInputChangeValue(getValueProps.invalidPersonName)
                .surnameInputChangeValue(getValueProps.invalidPersonSurname)
                .clickSaveButton()
                .controlPageTextError(getValueProps.textErrorInvalidName)
                .controlPageTextError(getValueProps.textErrorInvalidSurname);
    }

    @Test(description = "Email alanına geçersiz değer girilir ve kaydet butonuna tıklanır.")
    public void invalidRuleMailInputChangeValue() {
        goToProfilePage();
        userEditPage
                .clickEditButton()
                .emailInputChangeValue(getValueProps.wrongPersonMail)
                .clickSaveButton()
                .controlEmailError(getValueProps.textErrorInvalidEmail);
    }

    @Test(description = "Email alanına türkçe harf girilir ve kaydet butonuna tıklanır.")
    public void specCharacterRuleMailInputChangeValue() {
        goToProfilePage();
        userEditPage
                .clickEditButton()
                .emailInputChangeValue(getValueProps.invalidPersonMail)
                .clickSaveButton()
                .controlEmailValue(getValueProps.invalidPersonMail);
    }

    @Test(description = "Numara alanına hatalı numara girilir ve kaydet butonuna tıklanır.")
    public void invalidPhoneNumberInputChangeValue() {
        goToProfilePage();
        userEditPage
                .clickEditButton()
                .phoneInputChangeValue(getValueProps.wrongPhoneNumber)
                .clickSaveButton()
                .controlPageTextError(getValueProps.textErrorInvalidPhone);
    }
}
