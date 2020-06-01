package utils.properties.UserDataProperties.user;

import utils.properties.ReaderData.user.UserPasswordReader;

public class UserPasswordPageProperties extends UserPasswordReader {

    //Error
    public String textErrorCurrentPassword  = getTextErrorCurrentPassword();
    public String textErrorMismatchPassword=getTextErrorMismatchPassword();
    public String textErrorEmptyInput  = gettextErrorEmptyInput();
    public String textErrorInvalidPassword=gettextErrorInvalidPassword();
    public String textErrorOldNewPassword=getTextErrorOldNewPassword();

    //Default
    public String textDefaultChangePasswordTitle = getTextDefaultChangePasswordTitle();
    public String textDefaultPasswordInfo = getTextDefaultPasswordInfo();
    public String textDefaultCurrentPassword = getTextDefaultCurrentPassword();
    public String textDefaultNewPassword = getTextDefaultNewPassword();
    public String textDefaultConfirmNewPassword = getTextDefaultConfirmNewPassword();

    //Edit Password
    public String wrongPasswordJustNumber = getWrongPasswordJustNumber();
    public String wrongNewPasswordJustNumber = getWrongNewPasswordJustNumber();
    public String wrongPasswordJustLetter = getWrongPasswordJustLetter();
    public String wrongNewPasswordJustLetter = getWrongNewPasswordJustLetter();
    public String wrongNewPassword = getWrongNewPassword();
    public String password=getPassword();
    public String newPassword=getNewPassword();
    public String wrongPassword=getWrongPassword();
    public String wrongConfirmPassword=getWrongConfirmPassword();

//Kullanıcı
    public String phoneNumber=getPhoneNumber();
}
