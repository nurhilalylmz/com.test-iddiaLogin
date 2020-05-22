package utils.UserDataProperties;

import utils.ReadPropertiesData.LoginPageReader;

public class LoginPageProperties extends LoginPageReader {
    public String phoneNumber = getPhoneNumber();
    public String password = getPassword();
    public String mainPage = getMainPage();
    public String wrongPassword = getWrongPassword();
    public String wrongMaxPassword = getwrongMaxPassword();
    public String wrongMinPassword = getwrongMinPassword();
    public String wrongMaxPhoneNumber = getwrongMaxPhoneNumber();
    public String wrongMinPhoneNumber = getWrongMinPhoneNumber();
    public String wrongWithoutZeroPhoneNumber = getwrongWithoutZeroPhoneNumber();
    public String textErrorWrongInformation = gettextErrorWrongInformation();
    public String textErrorEmptyInput = gettextErrorEmptyInput();
    public String textErrorInvalidPhone = gettextErrorInvalidPhone();
    public String textErrorInvalidPassword = gettextErrorInvalidPassword();

}
