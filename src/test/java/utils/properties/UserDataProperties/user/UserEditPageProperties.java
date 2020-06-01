package utils.properties.UserDataProperties.user;

import utils.properties.ReaderData.user.UserEditReader;

public class UserEditPageProperties extends UserEditReader {

    public  String truPersonName= getTruePersonName();
    public  String truePersonSurname= getTruePersonSurname();
    public  String truePersonMail= getTruePersonMail();
    public  String wrongPhoneNumber=getWrongPhoneNumber();
    public  String wrongPersonMail= getWrongPersonMail();
    public  String invalidPersonMail=getInvalidPersonMail();
    public  String invalidPersonName=getInvalidPersonName();
    public  String invalidPersonSurname=getInvalidPersonSurname();
    public  String maxPersonName=getMaxPersonName();
    public  String maxPersonSurname=getMaxPersonSurname();
    public  String minPersonName=getMinPersonName();
    public  String minPersonSurname=getMinPersonSurname();
    public  String phone=getPhoneNumber();
    public  String password=getPassword();
    public  String mainPage=getMainPage();

    //EditTest
    public  String textErrorInvalidName=getTextErrorInvalidName();
    public  String textErrorInvalidSurname=getTextErrorInvalidSurname();
    public  String textErrorMaxCharacter= getTextErrorMaxCharacter();
    public  String textErrorInvalidEmail=getTextErrorInvalidEmail();
    public  String textErrorEmptyInput=gettextErrorEmptyInput();
    public  String textErrorInvalidPhone=gettextErrorInvalidPhone();
}
