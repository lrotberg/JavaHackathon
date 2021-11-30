package pages.webPages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SkipPage {

    @FindBy(xpath = "//input[@class='css-1064hy6-input-input'][@id='new-password']")
    protected static WebElement newPasswordTxt;

    @FindBy(xpath = "//input[@class='css-1064hy6-input-input'][@id='confirm-new-password']")
    protected static WebElement confirmNewPasswordTxt;

    @FindBy(xpath = "//button[@class='css-1xivtx2-button']")
    protected static WebElement submitBtn;

    @FindBy(xpath = "//button[@aria-label='Skip change password button']")
    protected static WebElement skipBtn;

    public static WebElement getNewPasswordTxt() {
        return newPasswordTxt;
    }

    public static WebElement getConfirmNewPasswordTxt() {
        return confirmNewPasswordTxt;
    }

    public static WebElement getSubmitBtn() {
        return submitBtn;
    }

    @Step("skip button")
    public static WebElement getSkipBtn() { return skipBtn; }
}
