package utils.properties.ReaderData.user;

import utils.properties.ReaderData.BaseReader;

public class UserEditReader extends BaseReader {

    //Edit Test Textleri
    public static String getTruePersonName() {
        return prop.getProperty("truePersonName");
    }
    public static String getTruePersonSurname() {
        return prop.getProperty("truePersonSurname");
    }
    public static String getTruePersonMail() {
        return prop.getProperty("truePersonMail");
    }
    public static String getWrongPhoneNumber() {
        return prop.getProperty("wrongPhoneNumber");
    }
    public static String getWrongPersonMail() {
        return prop.getProperty("wrongPersonMail");
    }
    public static String getInvalidPersonMail() {
        return prop.getProperty("invalidPersonMail");
    }
    public static String getInvalidPersonName() {
        return prop.getProperty("invalidPersonName");
    }
    public static String getInvalidPersonSurname() {
        return prop.getProperty("invalidPersonSurname");
    }
    public static String getMaxPersonName() {
        return prop.getProperty("maxPersonName");
    }
    public static String getMaxPersonSurname() {
        return prop.getProperty("maxPersonSurname");
    }
    public static String getMinPersonName() {
        return prop.getProperty("minPersonName");
    }
    public static String getMinPersonSurname() {
        return prop.getProperty("minPersonSurname");
    }

    //EditTest
    public static String getTextErrorInvalidName() {
        return prop.getProperty("textErrorInvalidName");
    }
    public static String getTextErrorInvalidSurname() {
        return prop.getProperty("textErrorInvalidSurname");
    }
    public static String getTextErrorMaxCharacter() {
        return prop.getProperty("textErrorMaxCharacter");
    }
    public static String getTextErrorInvalidEmail() {
        return prop.getProperty("textErrorInvalidEmail");
    }

}
