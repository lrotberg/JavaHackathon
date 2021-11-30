import extentions.DBActions;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.webPages.AddNewUserDetailsPage;
import pages.webPages.HomePage;
import pages.webPages.ServerAdminPage;
import utilities.CommonOps;
import utilities.JDBC;
import utilities.ManageDDT;
import workflows.WebFlows;

import java.sql.SQLException;

public class SeleniumTest extends CommonOps {

  @Test(priority = 1)
  @Description("insert data to login page")
  public void enterDataToLoginPage() throws InterruptedException {
    WebFlows.login();
    Thread.sleep(3000);
    WebFlows.skip();
    Thread.sleep(3000);
    Assert.assertEquals(HomePage.getWelcomeTitle().getText(), "Welcome to Grafana");
  }

  @Test(priority = 2, dependsOnMethods = "enterDataToLoginPage")
  @Description("click Grafana fundamentals page button with sikuli")
  public void clickGrafanaFundamentalsPage() throws FindFailed, InterruptedException {
    Thread.sleep(10000);
    WebFlows.clickToGrafanaFundamentalsPageWithSikuli();
    Thread.sleep(8000);
    WebFlows.navigateToGrafanaWeb();
  }

  @Test(priority = 3, dependsOnMethods = "enterDataToLoginPage")
  @Description("click vector home page")
  public void clickVectorHomePage() throws InterruptedException {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("css-1m4liiw"))));
    WebFlows.clickRightVector();
    Thread.sleep(3000);
    Assert.assertEquals(HomePage.getTitleMiddleRec().getText(), "Advanced");
  }

  @Test(priority = 4)
  @Description("scroll to article Nov 22 in home page")
  public void scrollToArticleHomePage() throws InterruptedException {
    WebFlows.scrollArticle();
    Thread.sleep(3000);
    Assert.assertEquals(HomePage.getGrayTitleNov22().getText(), "Nov 22");
  }

  @Test(priority = 5)
  @Description("click to server admin page in nav bar")
  public void clickToServerAdminNavBar() throws InterruptedException {
    WebFlows.clickToServerAdmin();
    Thread.sleep(6000);
    Assert.assertEquals(ServerAdminPage.getPageTitleAdminServer().getText(), "Server Admin");
  }

  @Test(priority = 6)
  @Description("create new user")
  public void clickCreateNewUserBtnAdminServer() throws InterruptedException {
    WebFlows.clickCreateNewUserBtn();
    Thread.sleep(3000);
    Assert.assertEquals(AddNewUserDetailsPage.getPageTitleAddNewUser().getText(), "Add new user");
  }

  @Test(priority = 7, dependsOnMethods = {"enterDataToLoginPage", "clickToServerAdminNavBar", "clickCreateNewUserBtnAdminServer"}, dataProvider = "data-provider", dataProviderClass = ManageDDT.class)
  @Description("create new user")
  public void createNewUserServerAdmin(String one, String two, String three, String four) throws InterruptedException {
    WebFlows.createNewUser(one, two, three, four);
    Thread.sleep(3000);
    Assert.assertTrue(WebFlows.checkUserCreated());
  }

  @Test(priority = 8,dependsOnMethods = {"enterDataToLoginPage", "clickToServerAdminNavBar", "clickCreateNewUserBtnAdminServer"})
  @Description("Test JDBC")
  public void testJDBC() throws SQLException, InterruptedException {
    JDBC.readFromDB();
    Thread.sleep(15000);
    Assert.assertTrue(DBActions.checkUserCreated());
  }
}