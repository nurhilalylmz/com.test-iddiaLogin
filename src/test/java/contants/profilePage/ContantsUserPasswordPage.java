package contants.profilePage;
import contants.BaseContants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContantsUserPasswordPage extends BaseContants
{
    //Default gelen text alanları
    @FindBy(how = How.CSS,using = ".dFTevO.sc-fjdhpX")
    public WebElement textDefaultChangePassword;
    @FindBy(how = How.CSS,using = ".keLVqX.sc-jzJRlG")
    public WebElement textDefaultChangeMyPassword;
    @FindBy(how = How.CSS,using = "div:nth-of-type(1) > .gpnEEN.sc-kgoBCf")
    public WebElement textDefaultCurrentPassword;
    @FindBy(how = How.CSS,using = "div:nth-of-type(2) > .gpnEEN.sc-kgoBCf")
    public WebElement textDefaultNewPassword;
    @FindBy(how = How.CSS,using = "div:nth-of-type(3) > .gpnEEN.sc-kgoBCf")
    public WebElement textDefaultConfirmNewPassword;

    // Input alanları
    @FindBy(how = How.NAME,using = "currentPassword")
    public WebElement inputCurrentPassword;
    @FindBy(how = How.NAME,using = "newPassword")
    public WebElement inputNewPassword;
    @FindBy(how = How.NAME,using = "confirmNewPassword")
    public WebElement inputConfirmNewPassword;


}
