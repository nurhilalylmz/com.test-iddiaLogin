package utils.properties.UserDataProperties.user;

import utils.properties.ReaderData.user.UserInfoReader;

public class UserInfoPageProperties extends UserInfoReader {

    //Default Text
    //Bilgilerim
    public String textDefaultMyInfo = getTextDefaultMyInfo();
    public String textDefaultMyPersonalInfo = getTextDefaultMyPersonalInfo();
    public String textDefaultName = gettextDefaultName();
    public String textDefaultSurname = gettextDefaultSurname();
    public String textDefaultEdit = gettextDefaultEdit();
    //İletişim Bilgilerim
    public String textDefaultMyContact = gettextDefaultMyContact();
    public String textDefaultMail = gettextDefaultMail();
    public String textDefaultPhone = gettextDefaultPhone();
    public String textDefaultInformMe = gettextDefaultInformMe();
    //Bayi Bilgileri
    public String textDefaultDealerInfo = gettextDefaultDealerInfo();
    public String textDefaultDealerNumber = gettextDefaultDealerNumber();
    public String textDefaultDealerName = gettextDefaultDealerName();
    public String textDefaultDealerAddress = gettextDefaultDealerAddress();
    //Bakiye Bilgileri
    public String textDefaultMoney = gettextDefaultMoney();
    public String textDefaultMoneyLimit = gettextDefaultMoneyLimit();
    public String textDefaultMoneyNote = gettextDefaultMoneyNote();
    //Ayarlar
    public String textDefaultSettings = gettextDefaultSettings();
    public String textDefaultChangePassword = gettextDefaultChangePassword();
    //.......................................................................//

    //Kullanıcı Bilgileri
    public String personName=getTextPersonName();
    public String personSurname=getTextPersonSurname();
    public String personEmail=getTextPersonMail();
    public String personPhoneNumber=getPhoneNumber();
    public String personDelaerNumber=getTextPersonDealerNumber();
    public String personDelaerName=getTextPersonDealerName();
    public String personDealerAddress=getTextPersonDealerAddress();
    public String person=getTextPerson();
    public String personMoney=getTextPersonMoney();
    public String personLimit=getTextPersonLimit();
}
