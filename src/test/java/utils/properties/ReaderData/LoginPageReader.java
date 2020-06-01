package utils.properties.ReaderData;

public class LoginPageReader extends BaseReader {
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

}
