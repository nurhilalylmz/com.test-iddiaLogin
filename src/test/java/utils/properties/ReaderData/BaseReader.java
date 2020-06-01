package utils.properties.ReaderData;


import utils.properties.ReadProperties;

public class BaseReader extends ReadProperties
{
    //Ortak kullanılan Text'ler
    public static String getPhoneNumber() {
        return prop.getProperty("phoneNumber");
    }
    public static String getPassword() {
        return prop.getProperty("password");
    }
    public static String getMainPage() {
        return prop.getProperty("mainPage");
    }
    public static String getProfilPage(){ return prop.getProperty("profilPage");}
    public static String gettextErrorEmptyInput() {
        return prop.getProperty("textErrorEmptyInput");
    }
    public static String gettextErrorInvalidPhone() {
        return prop.getProperty("textErrorInvalidPhone");
    }
    public static String gettextErrorInvalidPassword() {
        return prop.getProperty("textErrorInvalidPassword");
    }
    public static String getWrongPassword() {
        return prop.getProperty("wrongPassword");
    }

}
