package pages.webPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewUserDetailsPage {

    @FindBy(xpath = "//div[@class='page-container page-body']/h1")
    protected static WebElement pageTitleAddNewUser;

    @FindBy(xpath = "//div[@class='css-1w5c5dq-input-inputWrapper']/input[@name='name']")
    protected static WebElement nameOfNewUserTxt;

    @FindBy(xpath = "//div[@class='css-1w5c5dq-input-inputWrapper']/input[@name='email']")
    protected static WebElement emailOfNewUserTxt;

    @FindBy(xpath = "//div[@class='css-1w5c5dq-input-inputWrapper']/input[@name='login']")
    protected static WebElement userNameOfNewUserTxt;

    @FindBy(xpath = "//div[@class='css-1w5c5dq-input-inputWrapper']/input[@name='password']")
    protected static WebElement passwordOfNameNewUserTxt;

    @FindBy(className = "css-aja5tg-button")
    protected static WebElement createUserBtn;

    public static WebElement getNameOfNewUserTxt() {
        return nameOfNewUserTxt;
    }

    public static WebElement getEmailOfNewUserTxt() {
        return emailOfNewUserTxt;
    }

    public static WebElement getUserNameOfNewUserTxt() {
        return userNameOfNewUserTxt;
    }

    public static WebElement getPasswordOfNameNewUserTxt() {
        return passwordOfNameNewUserTxt;
    }

    public static WebElement getCreateUserBtn() {
        return createUserBtn;
    }

    public static WebElement getPageTitleAddNewUser() {
        return pageTitleAddNewUser;
    }
}
