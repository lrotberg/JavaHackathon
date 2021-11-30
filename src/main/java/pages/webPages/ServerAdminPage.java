package pages.webPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ServerAdminPage {

    @FindBy(how = How.XPATH, using= "//a[@href='admin/users/create']")
    protected static WebElement newUserBtn;

    @FindBy(xpath = "//h1[@class='page-header__title']")
    protected static WebElement pageTitleAdminServer;

    @FindBy(xpath = "//table/tbody/tr/td[2]")
    protected static List<WebElement> loginColTeam4;

    public static WebElement getNewUserBtn() {
        return newUserBtn;
    }

    public static WebElement getPageTitleAdminServer() {
        return pageTitleAdminServer;
    }

    public static List<WebElement> getLoginColTeam4() {
        return loginColTeam4;
    }
}
