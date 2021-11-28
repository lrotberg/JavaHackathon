package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ServerAdminPage {
    public static WebElement getNewUserBtn() {
        return newUserBtn;
    }

    @FindBy(how = How.XPATH, using= "//a[@href='admin/users/create']")
    protected static WebElement newUserBtn;
}
