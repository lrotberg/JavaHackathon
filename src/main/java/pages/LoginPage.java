package pages;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage  {

    @FindBy(how = How.XPATH, using= "//input[@name='user']")
    protected WebElement userNameTxt;

    @FindBy(how = How.XPATH, using= "//input[@id='current-password']")
    protected WebElement passwordTxt;

    @FindBy(how = How.XPATH, using= "//button[@class='css-1xivtx2-button']")
    protected WebElement loginBtn;

    public WebElement getSkipBtn() {
        return skipBtn;
    }

    @FindBy(how = How.XPATH, using= "//button/span[@class='css-1mhnkuh']")
    protected WebElement skipBtn;

   /* public void EnterData() //String user, String pass
    {
        userNameTxt.sendKeys("admin");
        passwordTxt.sendKeys("admin");
        loginBtn.click();
    }
    @Step("entering data to element ")
    public static void updateText(WebElement elem)
    {
        elem.sendKeys("admin");
    }

    @Step("click login button ")
    public static void clickLoginBtn(WebElement elem)
    {
        elem.click();
    }*/
    @Step ("get user web element")
    private  WebElement getUser()
    {
        return userNameTxt;
    }
    @Step ("get password web element")
    private  WebElement getPass()
    {
        return passwordTxt;
    }
    @Step ("get login button web element")
    private  WebElement getloginBtn()
    {
        return loginBtn;
    }
}