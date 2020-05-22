package contants;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BaseContants {
    //Common elements
    @FindBy(how = How.LINK_TEXT,using = "GİRİŞ YAP")
    public WebElement buttonMainLogin;
    @FindBy(how = How.CSS,using = ".col-copy")
    public WebElement copyrightText;
    @FindBy (how = How.LINK_TEXT,using = "Profilim")
    public WebElement buttonProfilim;
    @FindBy(how = How.CSS,using = ".userbox-avatar-box")
    public WebElement wrapperProfile;
    @FindBy(how = How.CLASS_NAME,using = "form-error")
    public WebElement textError;
    @FindBy(how = How.CSS,using = ".eZZTHf")
    public WebElement buttonSave;
    @FindBy(how = How.CSS,using = ".eGhXCq.sc-hMqMXs")
    public WebElement buttonIgnore;
    @FindBy(how = How.CLASS_NAME,using = "policy-popup__close")
    public WebElement buttonClosePopup;

    //Error
    @FindBy(how = How.XPATH,using = "/html//div[@id='root']/div/div[2]/div[@class='row']/div[@class='col-8']/div/form//div[@class='col-9 col-xl-8']/div[1]/div[2]/div/div[@class='form-error']")
    public WebElement textFirstİnputError;
    @FindBy(how = How.CSS,using = ".iohaHW.sc-kpOJdX")
    public WebElement textAfterSaveButtonError;
    @FindBy(how = How.CSS,using = "div:nth-of-type(1) > .faDsvx.sc-kGXeez > .izXxLX.sc-kEYyzF > .form-error")
    public WebElement textErrorName;
    @FindBy(how = How.CSS,using = "div:nth-of-type(2) > div:nth-of-type(2) > .faDsvx.sc-kGXeez > .izXxLX.sc-kEYyzF > .form-error")
    public WebElement textErrorSurname;
    @FindBy(how = How.CSS,using = "div:nth-of-type(4) > div:nth-of-type(2) > .faDsvx.sc-kGXeez > .izXxLX.sc-kEYyzF > .form-error")
    public WebElement textErrorPhone;
}
