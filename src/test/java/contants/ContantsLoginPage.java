package contants;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContantsLoginPage extends BaseContants{

    @FindBy(how = How.ID,using = "10000")
    public WebElement phoneNumber;
    @FindBy(how = How.ID,using = "20000")
    public WebElement password;
    @FindBy(how = How.CSS,using = "button")
    public WebElement buttonLogin;
    @FindBy(how = How.ID,using = "rememberInput")
    public WebElement checkBoxRememberMe;
    @FindBy(how = How.LINK_TEXT,using = "Şifremi Unuttum")
    public WebElement buttonForgetPassword;
    @FindBy(how = How.LINK_TEXT,using = "KAYIT OL")
    public WebElement buttonRegister;
    @FindBy(how = How.CSS,using = ".form-error")
    public WebElement loginError;

    @FindBy(how = How.CSS,using = ".col-copy")
    public WebElement copyrightText;

}
