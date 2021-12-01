package workflows;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.sikuli.script.FindFailed;
import utilities.CommonOps;
import extentions.UIActions;

import java.util.concurrent.TimeUnit;

public class WebFlows extends CommonOps {

  @Step("Login")
  public static void login() {
    Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    UIActions.updateText(loginPage.getUser(), "admin");
    UIActions.updateText(loginPage.getPass(), "admin");
    UIActions.click(loginPage.getloginBtn());
  }

  @Step("Skip New User Creation")
  public static void skip() {
    UIActions.click(skipPage.getSkipBtn());
  }

  @Step("Scroll to Article Nov22")
  public static void scrollArticle() {
    UIActions.scroll(homePage.getLatestFromTheBlogNov22());
  }

  @Step("Move to Server Admin")
  public static void clickToServerAdmin() {
    UIActions.click(leftMenuPage.getLinkServerAdmin());
  }

  @Step("Click New User")
  public static void clickNewUserBtn() {
    UIActions.click(ServerAdminPage.getNewUserBtn());
  @Step("Click Create New User")
  public static void clickCreateNewUserBtn() {
    UIActions.click(serverAdminPage.getNewUserBtn());
  }

  @Step("Create New User - Getting Data From CSV File")
  public static void createNewUser(String Name, String Email, String userName, String pass) {
    clickNewUserBtn();
    UIActions.updateText(addNewUserDetailsPage.getNameOfNewUserTxt(), Name);
    UIActions.updateText(addNewUserDetailsPage.getEmailOfNewUserTxt(), Email);
    UIActions.updateText(addNewUserDetailsPage.getUserNameOfNewUserTxt(), userName);
    UIActions.updateText(addNewUserDetailsPage.getPasswordOfNameNewUserTxt(), pass);
    UIActions.click(addNewUserDetailsPage.getCreateUserBtn());
  }

  @Step("Scroll to the Right")
  public static void clickRightVector() {
    UIActions.moveToElement(homePage.getVectorBtn());
  }

  @Step("Move to cCeate Users and Teams")
  public static void clickCreateUsersAndTeams() {
    UIActions.click(homePage.getCreateUsersAndTeams());
  }

  @Step("Sikuli Click Grafana Home Page") //TODO: Ask Rowan how to fail tests when using try/catch
  public static void clickToGrafanaFundamentalsPageWithSikuli() throws FindFailed {
    UIActions.clickWithSikuli("homepage.png");
  }

  @Step("Navigate to Original Grafana Web Page")
  public static void navigateToGrafanaWeb() {
    UIActions.navigateToOriginalTab();
  }

  @Step("Check User Created")
  public static boolean checkUserCreated(String email) {
    return UIActions.checkUserBeenCreated(email);
  }

  @Step("Delete User")
  public static void deleteUser() {
    UIActions.delete();
  }

}
