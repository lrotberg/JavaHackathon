package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilities.CommonOps;

public class LoginPage extends CommonOps {

    @FindBy(how = How.XPATH, using= "//input[@name='user']")
    protected WebElement userNameTxt;

    @FindBy(how = How.XPATH, using= "//input[@id='current-password']")
    protected WebElement passwordTxt;

    @FindBy(how = How.XPATH, using= "//button[@class='css-1xivtx2-button']")
    protected WebElement loginBtn;

    public void EnterData() //String user, String pass
    {
        userNameTxt.sendKeys("admin");
        passwordTxt.sendKeys("admin");
        loginBtn.click();
    }
}