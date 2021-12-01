package pages.webPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserInformationPage {

    @FindBy(xpath = "//div[@class='css-kdj7v3']/button[@class='css-1r3qgdo-button']")
    protected static WebElement deleteUserBtn;

    @FindBy(xpath = "//div[@class='css-1pvl9up-layoutChildrenWrapper']/button[@class='css-1r3qgdo-button']/span[@class='css-1mhnkuh']")
    protected static WebElement deleteUserBtnPopUp;

    public static WebElement getDeleteUserBtn() {
        return deleteUserBtn;
    }

    public static WebElement getDeleteUserBtnPopUp() {
        return deleteUserBtnPopUp;
    }
}
