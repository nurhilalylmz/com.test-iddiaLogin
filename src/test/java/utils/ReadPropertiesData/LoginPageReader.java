package utils.ReadPropertiesData;

import utils.ReadProperties;

public class LoginPageReader extends ReadProperties {
    public static String getPhoneNumber() {
        return prop.getProperty("phoneNumber");
    }
    public static String getPassword() {
        return prop.getProperty("password");
    }
    public static String getMainPage() {
        return prop.getProperty("mainPage");
    }

    public static String getWrongPassword() {
        return prop.getProperty("wrongPassword");
    }
    public static String getWrongMinPhoneNumber() {
        return prop.getProperty("wrongMinPhoneNumber");
    }
    public static String getwrongMaxPhoneNumber() {
        return prop.getProperty("wrongMaxPhoneNumber");
    }

    public static String getwrongWithoutZeroPhoneNumber() {
        return prop.getProperty("wrongWithoutZeroPhoneNumber");
    }
    public static String getwrongMinPassword() {
        return prop.getProperty("wrongMinPassword");
    }
    public static String getwrongMaxPassword() {
        return prop.getProperty("wrongMaxPassword");
    }

    public static String gettextErrorWrongInformation() {
        return prop.getProperty("textErrorWrongInformation");
    }
    public static String gettextErrorEmptyInput() {
        return prop.getProperty("textErrorEmptyInput");
    }
    public static String gettextErrorInvalidPhone() {
        return prop.getProperty("textErrorInvalidPhone");
    }
    public static String gettextErrorInvalidPassword() {
        return prop.getProperty("textErrorInvalidPassword");
    }
}
