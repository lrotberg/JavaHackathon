package workflows;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.sikuli.script.FindFailed;
import pages.webPages.*;
import utilities.CommonOps;
import extentions.UIActions;

import java.util.concurrent.TimeUnit;

public class WebFlows extends CommonOps {

  @Step("Login")
  public static void login() {
    Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    UIActions.updateText(LoginPage.getUser(), "admin");
    UIActions.updateText(LoginPage.getPass(), "admin");
    UIActions.click(LoginPage.getloginBtn());
  }

  @Step("Skip New User Creation")
  public static void skip() {
    UIActions.click(SkipPage.getSkipBtn());
  }

  @Step("Scroll to Article Nov22")
  public static void scrollArticle() {
    UIActions.scroll(HomePage.getLatestFromTheBlogNov22());
  }

  @Step("Move to Server Admin")
  public static void clickToServerAdmin() {
    UIActions.click(LeftMenuPage.getLinkServerAdmin());
  }

  @Step("Click Create New User")
  public static void clickCreateNewUserBtn() {
    UIActions.click(ServerAdminPage.getNewUserBtn());
  }

  @Step("Create New User - Getting Data From CSV File")
  public static void createNewUser(String Name, String Email, String userName, String pass) {
    System.out.println(userName);
    UIActions.updateText(AddNewUserDetailsPage.getNameOfNewUserTxt(), Name);
    UIActions.updateText(AddNewUserDetailsPage.getEmailOfNewUserTxt(), Email);
    UIActions.updateText(AddNewUserDetailsPage.getUserNameOfNewUserTxt(), userName);
    UIActions.updateText(AddNewUserDetailsPage.getPasswordOfNameNewUserTxt(), pass);
    UIActions.click(AddNewUserDetailsPage.getCreateUserBtn());
  }

  @Step("Scroll to the Right")
  public static void clickRightVector() {
    UIActions.moveToElement(HomePage.getVectorBtn());
  }

  @Step("Move to cCeate Users and Teams")
  public static void clickCreateUsersAndTeams() {
    UIActions.click(HomePage.getCreateUsersAndTeams());
  }

  @Step("Sikuli Click Grafana Home Page")
  public static void clickToGrafanaFundamentalsPageWithSikuli() throws FindFailed {
    UIActions.clickWithSikuli("homepage.png");
  }

  @Step("Navigate to Original Grafana Web Page")
  public static void navigateToGrafanaWeb() {
    UIActions.navigateToOriginalTab();
  }

  @Step("Check User Created")
  public static Boolean checkUserCreated() {
    return UIActions.checkUserBeenCreated();
  }

}
