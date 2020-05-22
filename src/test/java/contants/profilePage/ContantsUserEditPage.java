package contants.profilePage;

import contants.BaseContants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContantsUserEditPage extends BaseContants
{
    //Kişisel Bilgilerimi Güncelle
    @FindBy(how = How.NAME,using = "name")
    public WebElement inputPersonName;
    @FindBy(how = How.NAME,using = "surname")
    public WebElement inputSurname;
    @FindBy(how = How.NAME,using = "email")
    public WebElement inputEmail;
    @FindBy(how = How.NAME,using = "phoneNumber")
    public WebElement inputPhoneNumber;
    @FindBy(how = How.ID,using = "formSubscribe")
    public WebElement clickCheckFormSubscribe;
    @FindBy(how = How.CSS,using = ".hddsMR.sc-cSHVUG")
    public WebElement buttonEditWithInfo;
    @FindBy(how = How.CSS,using = "h1 > svg[role='img']")
    public WebElement buttonEditWithUserInfo;
}
