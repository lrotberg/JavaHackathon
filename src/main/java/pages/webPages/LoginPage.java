package pages.webPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  {

    @FindBy(xpath = "//div[@class='css-1w5c5dq-input-inputWrapper']//input[@name='user']")
    protected static WebElement userNameTxt;

    @FindBy(xpath = "//div[@class='css-1w5c5dq-input-inputWrapper']//input[@id='current-password']")
    protected static WebElement passwordTxt;

    @FindBy(xpath = "//button[@class='css-1xivtx2-button']")
    protected static WebElement loginBtn;

    public static WebElement getUser() {
        return userNameTxt;
    }

    public static  WebElement getPass() { return passwordTxt; }

    public static  WebElement getloginBtn() { return loginBtn; }


}