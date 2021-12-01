package utilities;

import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import pages.webPages.*;


public class ManageWebPages extends BasePage {

  @Step("Build Web Pages")
  public static void buildPages() {
    loginPage = PageFactory.initElements(driver, LoginPage.class);
    homePage = PageFactory.initElements(driver, HomePage.class);
    leftMenuPage = PageFactory.initElements(driver, LeftMenuPage.class);
    serverAdminPage = PageFactory.initElements(driver, ServerAdminPage.class);
    addNewUserDetailsPage = PageFactory.initElements(driver, AddNewUserDetailsPage.class);
    skipPage = PageFactory.initElements(driver, SkipPage.class);
    userInformationPage = PageFactory.initElements(driver, UserInformationPage.class);
  }

}
