package utils.properties.ReaderData.user;

import utils.properties.ReaderData.BaseReader;

public class UserPasswordReader extends BaseReader
{
    //Edit Password
    public static String getWrongPasswordJustNumber() {
        return prop.getProperty("wrongPasswordJustNumber");
    }
    public static String getWrongNewPasswordJustNumber() {
        return prop.getProperty("wrongNewPasswordJustNumber");
    }
    public static String getWrongPasswordJustLetter() {
        return prop.getProperty("wrongPasswordJustLetter");
    }
    public static String getWrongNewPasswordJustLetter() {
        return prop.getProperty("wrongNewPasswordJustLetter");
    }
    public static String getWrongNewPassword() {
        return prop.getProperty("wrongNewPassword");
    }
    public static String getNewPassword(){return prop.getProperty("newPassword");}
    public static String getWrongConfirmPassword(){return prop.getProperty("wrongConfirmNewPassword");}

    //Default Text
    public static String getTextDefaultChangePasswordTitle() {
        return prop.getProperty("textDefaultChangePasswordTitle");
    }
    public static String getTextDefaultPasswordInfo() {
        return prop.getProperty("textDefaultPasswordInfo");
    }
    public static String getTextDefaultCurrentPassword() {
        return prop.getProperty("textDefaultCurrentPassword");
    }
    public static String getTextDefaultNewPassword() {
        return prop.getProperty("textDefaultNewPassword");
    }
    public static String getTextDefaultConfirmNewPassword() {
        return prop.getProperty("textDefaultConfirmNewPassword");
    }


    //Error
    public static String getTextErrorCurrentPassword() {
        return prop.getProperty("textErrorCurrentPassword");
    }
    public static String getTextErrorMismatchPassword() {
        return prop.getProperty("textErrorMismatchPassword");
    }
    public static String getTextErrorOldNewPassword() {
        return prop.getProperty("textErrorOldNewPassword");
    }

}
