package pages;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilities.CommonOps;

public class LoginPage  {
    @FindBy(how = How.XPATH, using= "//input[@name='user']")
    protected static WebElement userNameTxt;
    @FindBy(how = How.XPATH, using= "//input[@id='current-password']")
    protected static WebElement passwordTxt;
    @FindBy(how = How.XPATH, using= "//button[@class='css-1xivtx2-button']")
    protected static WebElement loginBtn;
    @FindBy(how = How.XPATH, using= "//button/span[@class='css-1mhnkuh']")
    protected static WebElement skipBtn;
    @Step ("get user web element")
    public static WebElement getUser()
    {
        return userNameTxt;
    }
    @Step ("get password web element")
    public static  WebElement getPass()
    {
        return passwordTxt;
    }
    @Step ("get login button web element")
    public static  WebElement getloginBtn()
    {
        return loginBtn;
    }
    @Step("skip button")
    public static WebElement getSkipBtn() {
        return skipBtn;
    }
}