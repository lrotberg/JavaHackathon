package utilities;

import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

public class ManagePages extends BasePage{

  LoginPage login;
  @Step("Build Pages")
  public void buildPages() {
    login= PageFactory.initElements(driver, LoginPage.class);

  }
}
