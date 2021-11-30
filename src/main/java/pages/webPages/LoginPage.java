package pages.webPages;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage  {

    @FindBy(how = How.XPATH, using= "//div[@class='css-1w5c5dq-input-inputWrapper']//input[@name='user']")
    protected static WebElement userNameTxt;

    @FindBy(how = How.XPATH, using= "//div[@class='css-1w5c5dq-input-inputWrapper']//input[@id='current-password']")
    protected static WebElement passwordTxt;

    @FindBy(how = How.XPATH, using= "//button[@class='css-1xivtx2-button']")
    protected static WebElement loginBtn;



    @Step ("get user web element")
    public static WebElement getUser() {
        return userNameTxt;
    }

    @Step ("get password web element")
    public static  WebElement getPass() { return passwordTxt; }

    @Step ("get login button web element")
    public static  WebElement getloginBtn() { return loginBtn; }


}