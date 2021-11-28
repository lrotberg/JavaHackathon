package utilities;

import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.LeftMenuPage;
import pages.LoginPage;

public class ManagePages extends BasePage{

  private static LoginPage loginPage;
  private static HomePage homePage;
  private static LeftMenuPage leftMenuPage;

  @Step("Build Pages")
  public void buildPages() {
    loginPage = PageFactory.initElements(driver, LoginPage.class);
    homePage = PageFactory.initElements(driver, HomePage.class);
    leftMenuPage = PageFactory.initElements(driver, LeftMenuPage.class);
  }
}
