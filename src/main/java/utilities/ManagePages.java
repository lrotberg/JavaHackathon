package utilities;

import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import pages.webPages.*;


public class ManagePages extends BasePage {

  private static LoginPage loginPage;
  private static HomePage homePage;
  private static LeftMenuPage leftMenuPage;
  private static ServerAdminPage serverAdminPage;
  private static AddNewUserDetailsPage addNewUserDetailsPage;
  private static SkipPage skipPage;
  private static UserInformationPage userInformation;

  @Step("Build Web Pages")
  public static void buildPages() {
    loginPage = PageFactory.initElements(driver, LoginPage.class);
    homePage = PageFactory.initElements(driver, HomePage.class);
    leftMenuPage = PageFactory.initElements(driver, LeftMenuPage.class);
    serverAdminPage = PageFactory.initElements(driver, ServerAdminPage.class);
    addNewUserDetailsPage = PageFactory.initElements(driver, AddNewUserDetailsPage.class);
    skipPage = PageFactory.initElements(driver, SkipPage.class);
    userInformation=PageFactory.initElements(driver, UserInformationPage.class);
  }

}
