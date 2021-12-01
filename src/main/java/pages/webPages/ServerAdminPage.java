package pages.webPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ServerAdminPage {

    @FindBy(xpath = "//a[@href='admin/users/create']")
    protected static WebElement newUserBtn;

    @FindBy(xpath = "//h1[@class='page-header__title']")
    protected static WebElement pageTitleAdminServer;

    @FindBy(xpath = "//table/tbody/tr/td[3]")
    protected static List<WebElement> emailsInTable;

    public static WebElement getNewUserBtn() {
        return newUserBtn;
    }

    public static WebElement getPageTitleAdminServer() {
        return pageTitleAdminServer;
    }

    public static List<WebElement> getEmailsInTable() {
        return emailsInTable;
    }


}
