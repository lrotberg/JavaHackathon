import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddNewUserDetailsPage;
import pages.HomePage;
import pages.ServerAdminPage;
import utilities.CommonOps;
import workflows.WebFlows;

public class SeleniumTest extends CommonOps {

    @Test(priority = 1)
    @Description("insert data to login page")
    public void enterDataToLoginPage() throws InterruptedException {
        WebFlows.login();
        Thread.sleep(3000);
        WebFlows.skip();
        Thread.sleep(3000);
        Assert.assertEquals(HomePage.getWelcomeTitle().getText(),"Welcome to Grafana");
    }

    @Test(priority = 2,dependsOnMethods = "enterDataToLoginPage")
    @Description("click vector home page")
    public void clickVectorHomePage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.className("css-1m4liiw"))));
        WebFlows.clickRightVector();
        Thread.sleep(3000);
        Assert.assertEquals(HomePage.getTitleMiddleRec().getText(),"Advanced");
    }

    @Test(priority = 3)
    @Description("scroll to article Nov 22 in home page")
    public void scrollToArticleHomePage() throws InterruptedException {
        WebFlows.scrollArticle();
        Thread.sleep(3000);
        Assert.assertEquals(HomePage.getGrayTitleNov22().getText(),"Nov 22");
    }

    @Test(priority = 4)
    @Description("click to server admin page in nav bar")
    public void clickToServerAdminNavBar() throws InterruptedException {
        WebFlows.clickToServerAdmin();
        Thread.sleep(6000);
        Assert.assertEquals(ServerAdminPage.getPageTitleAdminServer().getText(),"Server Admin");
    }

    @Test(priority = 5)
    @Description("create new user")
    public void clickCreateNewUserBtnAdminServer() throws InterruptedException {
        WebFlows.clickCreateNewUserBtn();
        Thread.sleep(3000);
        Assert.assertEquals(AddNewUserDetailsPage.getPageTitleAddNewUser().getText(),"Add new user");
    }

    @Test(priority = 6,dependsOnMethods = {"enterDataToLoginPage","clickToServerAdminNavBar","clickCreateNewUserBtnAdminServer"})
    @Description("create new user")
    public void createNewUserServerAdmin() throws InterruptedException {
        WebFlows.createNewUser();
        Thread.sleep(3000);
        Assert.assertEquals(ServerAdminPage.getLoginColTeam4().get(1).getText(),"team4");
    }

}
