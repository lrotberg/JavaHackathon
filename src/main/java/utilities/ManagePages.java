package utilities;

import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

public class ManagePages extends BasePage{

  private static LoginPage loginPage;

  @Step("Build Pages")
  public void buildPages() {
    loginPage= PageFactory.initElements(driver, LoginPage.class);
  }
}
