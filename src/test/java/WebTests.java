import com.google.common.util.concurrent.Uninterruptibles;
import extentions.DBActions;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonOps;
import utilities.ManageDDT;
import utilities.ManageJDBC;
import workflows.WebFlows;

import java.util.concurrent.TimeUnit;

public class WebTests extends CommonOps {

  @Test(priority = 1)
  @Description("insert data to login page")
  public void enterDataToLoginPage()  {
    WebFlows.login();
    Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    WebFlows.skip();
    Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    Assert.assertEquals(homePage.getWelcomeTitle().getText(), "Welcome to Grafana");
  }

  @Test(priority = 2, dependsOnMethods = "enterDataToLoginPage")
  @Description("click Grafana fundamentals page button with sikuli")
  public void clickGrafanaFundamentalsPage() throws FindFailed {
    Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS);
    WebFlows.clickToGrafanaFundamentalsPageWithSikuli();
    Uninterruptibles.sleepUninterruptibly(8, TimeUnit.SECONDS);
    WebFlows.navigateToGrafanaWeb();
  }

  @Test(priority = 3, dependsOnMethods = "enterDataToLoginPage")
  @Description("click vector home page")
  public void clickVectorHomePage() {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("css-1m4liiw"))));
    WebFlows.clickRightVector();
    Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    Assert.assertEquals(homePage.getTitleMiddleRec().getText(), "Advanced");
  }

  @Test(priority = 4)
  @Description("scroll to article Nov 22 in home page")
  public void scrollToArticleHomePage() {
    WebFlows.scrollArticle();
    Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    Assert.assertEquals(homePage.getGrayTitleNov22().getText(), "Nov 22");
  }

  @Test(priority = 5)
  @Description("click to server admin page in nav bar")
  public void clickToServerAdminNavBar() {
    WebFlows.clickToServerAdmin();
    Uninterruptibles.sleepUninterruptibly(6, TimeUnit.SECONDS);
    Assert.assertEquals(serverAdminPage.getPageTitleAdminServer().getText(), "Server Admin");
  }

  @Test(priority = 6, dependsOnMethods = {"enterDataToLoginPage", "clickToServerAdminNavBar"}, dataProvider = "data-provider", dataProviderClass = ManageDDT.class)
  @Description("create new user")
  public void createNewUserServerAdmin(String name, String email, String userName, String password) {
    WebFlows.createNewUser(name, email, userName, password);
    Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    Assert.assertTrue(WebFlows.checkUserCreated("team4@gmail.com"));
    DBActions.deleteUserDB();
  }

  @Test(priority = 7,dependsOnMethods = {"enterDataToLoginPage", "clickToServerAdminNavBar"})
  @Description("Test JDBC")
  public void testJDBC(){
    ManageJDBC.readFromDB();
    softAssert.assertTrue(DBActions.checkUserCreated("Adam_a@gmail.com"));
    softAssert.assertTrue(DBActions.checkUserCreated("Danny_k@gmail.com"));
    softAssert.assertTrue(DBActions.checkUserCreated("Yoram_t@gmail.com"));
    DBActions.deleteUserDB();
    softAssert.assertAll();
  }
}