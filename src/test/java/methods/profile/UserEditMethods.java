package methods.profile;

import contants.profilePage.ContantsUserEditPage;
import jdk.jfr.Description;
import methods.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UserEditMethods extends BaseMethods {

    ContantsUserEditPage userEditPage;

    public UserEditMethods(WebDriver webDriver) {
        super(webDriver);
        userEditPage = PageFactory.initElements(webDriver, ContantsUserEditPage.class);
    }


    @Description("Düzenle sayfasına gidilmesini sağlar.")
    public UserEditMethods clickEditButton() {
        waitElementToClickable(userEditPage.buttonEditWithInfo);
        clickElement(userEditPage.buttonEditWithInfo);
        return new UserEditMethods(driver);
    }

    @Description("Kullanıcının isim alanının güncellenmesini sağlar.")
    public UserEditMethods nameInputChangeValue(String inputName) {
        writeText(userEditPage.inputPersonName, inputName);
        return new UserEditMethods(driver);
    }

    @Description("Kullanıcının soyisim alanının güncellenmesini sağlar.")
    public UserEditMethods surnameInputChangeValue(String inputSurname) {
        writeText(userEditPage.inputSurname, inputSurname);
        return new UserEditMethods(driver);
    }

    @Description("Kullanıcının email alanının güncellenmesini sağlar.")
    public UserEditMethods emailInputChangeValue(String inputEmail) {
        writeText(userEditPage.inputEmail, inputEmail);
        return new UserEditMethods(driver);
    }

    @Description("Kullanıcının subscribe alanının güncellenmesini sağlar.")
    public UserEditMethods clickCheckFormSubscribe() {
        waitElementToClickable(userEditPage.clickCheckFormSubscribe);
        clickElement(userEditPage.clickCheckFormSubscribe);
        return new UserEditMethods(driver);
    }

    @Description("Kullanıcının telefon alanının güncellenmesini sağlar.")
    public UserEditMethods phoneInputChangeValue(String inputPhone) {
        writeText(userEditPage.inputPhoneNumber, inputPhone);
        return new UserEditMethods(driver);
    }

    @Description("Kaydet butonuna tıklanır.")
    public UserEditMethods clickSaveButton() {
        try {
            waitElementToClickable(userEditPage.buttonSave);
            clickElement(userEditPage.buttonSave);
            waitSeconds(1);
        } catch (Exception e) {
            Assert.fail("Elemente tıklanırken hata alındı.");
        }
        return new UserEditMethods(driver);
    }

    @Description("Verilen bilgilerin doğruluğuna göre kontrol eder.")
    public UserEditMethods controlPageTextError(String expectedTextError) {
        try {
            waitSeconds(2);
            if(expectedTextError.contains("Ad")){
                controlTextError(expectedTextError, userEditPage.textErrorFirstInputAndName);
            }
            else if(expectedTextError.contains("Soyad")){
                controlTextError(expectedTextError, userEditPage.textErrorLastName);
            }
            else if(expectedTextError.contains("Bu alanın doldurulması zorunludur")){
                controlTextError(expectedTextError, userEditPage.textErrorFirstInputAndName);
                controlTextError(expectedTextError, userEditPage.textErrorLastName);
                controlTextError(expectedTextError,userEditPage.textErrorPhone);
            }
            else if(expectedTextError.contains("Maksimum 30 karakter olmalıdır")){
                controlTextError(expectedTextError, userEditPage.textErrorFirstInputAndName);
                controlTextError(expectedTextError, userEditPage.textErrorLastName);
            }
            else if(expectedTextError.contains("Lütfen geçerli bir telefon numarası giriniz.")){
                controlTextError(expectedTextError,userEditPage.textErrorPhone);
            }
            else{
                Assert.fail("Beklenen değeri lütfen kontrol ediniz. Verilen : "+expectedTextError);
            }
        }catch (Exception e){
            Assert.fail("Hata: "+e.getMessage()+" Gelen değerler: " +
                    "İsim: "+userEditPage.textErrorFirstInputAndName.getText()+" " +
                    "Soyad: "+userEditPage.textErrorLastName.getText()+" "+
                    "Telefon: "+userEditPage.textErrorPhone.getText());
        }

        return new UserEditMethods(driver);
    }

    @Description("İlgili email bilgisinin doğruluğu kontrol edilir.")
    public UserEditMethods controlEmailValue(String textEmail) {
        try {
            controlEmail(textEmail);
        } catch (Exception e) {
            Assert.fail("Belirtilen mail kontrol edilirken hata alındı.Kontrol ediniz. Mail : " + textEmail);
        }
        return new UserEditMethods(driver);
    }

    @Description("İlgili email bilgisinin doğruluğu kontrol edilir.")
    public UserEditMethods controlEmailError(String expectingTextError) {
        try {
            controlEmailError(expectingTextError,userEditPage.textError);
        } catch (Exception e) {
            Assert.fail("Email hata mesajı kontrol edilirken hata alındı.Kontrol ediniz.Hata: "+e.getLocalizedMessage());
        }
        return new UserEditMethods(driver);
    }

    @Description("Kullanıcı logout olur.")
    public UserEditMethods logout() {
        waitForPageLoad(userEditPage.copyrightText);
        clickElement(userEditPage.buttonLogout);
        waitSeconds(1);
        return new UserEditMethods(driver);
    }

    @Description("Bilgilerim alanında bulunan kullanıcının bilgilerini kontrol eder.")
    public UserEditMethods controlTextMyInfo(String textName, String textLastName,String textMail) {
        controlPageTextEqual(userEditPage.textPersonName.getText(), textName);
        controlPageTextEqual(userEditPage.textPersonLastName.getText(), textLastName);
        controlPageTextEqual(userEditPage.textPersonEmail.getText(), textMail);
        return new UserEditMethods(driver);
    }
}
