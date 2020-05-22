package contants.profilePage;

import contants.BaseContants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContantsUserInfoPage extends BaseContants {

    //Default gelen text alanları
    //Bilgilerim
    @FindBy(how = How.CSS, using = ".dFTevO.sc-fjdhpX")
    public WebElement textMyInfo;
    @FindBy(how = How.CSS, using = ".hddsMR.sc-cSHVUG")
    public WebElement textButtonEdit;
    //Kişisel Bilgilerim
    @FindBy(how = How.CSS, using = "div:nth-of-type(2) > .keLVqX.sc-jzJRlG")
    public WebElement textPersonInfo;
    @FindBy(how = How.CSS, using = "div:nth-of-type(3) > div:nth-of-type(1) > .gpnEEN.sc-kgoBCf")
    public WebElement textDefaultPersonName;
    @FindBy(how = How.CSS, using = "div:nth-of-type(3) > div:nth-of-type(2) > .gpnEEN.sc-kgoBCf")
    public WebElement textDefaultPersonLastName;
    @FindBy(how = How.CSS, using = "div:nth-of-type(4) > .keLVqX.sc-jzJRlG")
    //İletişim Bilgilerim
    public WebElement textMyContactInfo;
    @FindBy(how = How.CSS, using = "div:nth-of-type(5) > div:nth-of-type(1) > .gpnEEN.sc-kgoBCf")
    public WebElement textDefaultContactPersonEmail;
    @FindBy(how = How.CSS, using = "div:nth-of-type(5) > div:nth-of-type(2) > .gpnEEN.sc-kgoBCf")
    public WebElement textDefaultPersonPhoneNumber;
    @FindBy(how = How.CSS, using = "div:nth-of-type(5) > div:nth-of-type(3) > .faDsvx.sc-kGXeez")
    public WebElement textInformedByMailPhone;
    @FindBy(how = How.CSS, using = "div:nth-of-type(6) > .keLVqX.sc-jzJRlG")
    public WebElement textMyDealerInfo;
    //Bayi Bilgilerim
    @FindBy(how = How.CSS, using = "div:nth-of-type(7) > div:nth-of-type(1) > .gpnEEN.sc-kgoBCf")
    public WebElement textDefaultDealerNumber;
    @FindBy(how = How.CSS, using = "div:nth-of-type(7) > div:nth-of-type(2) > .gpnEEN.sc-kgoBCf")
    public WebElement textDefaultDealerName;
    @FindBy(how = How.CSS, using = "div:nth-of-type(3) > .gpnEEN.sc-kgoBCf")
    public WebElement textDefaultDealerAddress;
    //Bakiye Bilgileri
    @FindBy(how = How.CSS, using = "div.sc-gzVnrw")
    public WebElement textDefaultMoneyInfo;
    @FindBy(how = How.CSS, using = ".eNWQEq.sc-dnqmqq > span:nth-of-type(1)")
    public WebElement textDefaultDailyLimit;
    @FindBy(how = How.CSS, using = ".kEzXmV.sc-gZMcBi")
    public WebElement textDailyLimitNote;
    //Ayarlar
    @FindBy(how = How.CSS, using = ".sc-jDwBTQ")
    public WebElement textSettings;

    ////Kullanıcı bilgileri
    @FindBy(how = How.CSS, using = "div:nth-of-type(3) > div:nth-of-type(1) > .faDsvx.sc-kGXeez")
    public WebElement textPersonName;
    @FindBy(how = How.CSS, using = "div:nth-of-type(3) > div:nth-of-type(2) > .faDsvx.sc-kGXeez")
    public WebElement textPersonLastName;
    @FindBy(how = How.CSS, using = "div:nth-of-type(5) > div:nth-of-type(1) > .faDsvx.sc-kGXeez")
    public WebElement textPersonEmail;
    @FindBy(how = How.CSS, using = "div:nth-of-type(5) > div:nth-of-type(2) > .faDsvx.sc-kGXeez")
    public WebElement textPersonPhoneNumber;
    @FindBy(how = How.CSS, using = "div:nth-of-type(7) > div:nth-of-type(1) > .faDsvx.sc-kGXeez")
    public WebElement textDealerNumber;
    @FindBy(how = How.CSS, using = ".cLyDaM:nth-of-type(7) .cGsDbF:nth-of-type(2) .sc-kGXeez")
    public WebElement textDealarName;
    @FindBy(how = How.CSS, using = "div:nth-of-type(7) > div:nth-of-type(3) > .faDsvx.sc-kGXeez")
    public WebElement textDealerAddress;
    @FindBy(how = How.CSS, using = ".hEzGLd.sc-bZQynM")
    public WebElement textUserName;
    @FindBy(how = How.CSS, using = ".lpdvNd.sc-htoDjs")
    public WebElement textMoneyInfo;
    @FindBy(how = How.CSS, using = ".sc-dnqmqq .bYmceL:nth-of-type(2)")
    public WebElement textDailyLimit;

}