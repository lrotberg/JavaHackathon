package workflows;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import pages.webPages.*;
import utilities.CommonOps;
import utilities.UIActions;

import java.util.concurrent.TimeUnit;

public class WebFlows extends CommonOps {

    @Step("login")
    public static void login(){
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        UIActions.updateText(LoginPage.getUser(),"admin");
        UIActions.updateText(LoginPage.getPass(),"admin");
        UIActions.click(LoginPage.getloginBtn());
    }

    @Step("skip button in login page")
    public static void skip(){
        UIActions.click(SkipPage.getSkipBtn());
    }

    @Step("scroll article Nov22")
    public static void scrollArticle(){
        UIActions.scroll(HomePage.getLatestFromTheBlogNov22());
    }

    @Step("click to server admin")
    public static void clickToServerAdmin(){
        UIActions.click(LeftMenuPage.getLinkServerAdmin());
    }

    @Step("click create New user button")
    public static void  clickCreateNewUserBtn(){
        UIActions.click(ServerAdminPage.getNewUserBtn());
    }

    @Step("create new user- getting data from csv file")
    public static void createNewUser(String Name, String Email, String userName, String pass){
        UIActions.updateText(AddNewUserDetailsPage.getNameOfNewUserTxt(),Name);
        UIActions.updateText(AddNewUserDetailsPage.getEmailOfNewUserTxt(),Email);
        UIActions.updateText(AddNewUserDetailsPage.getUserNameOfNewUserTxt(),userName);
        UIActions.updateText(AddNewUserDetailsPage.getPasswordOfNameNewUserTxt(),pass);
        UIActions.click(AddNewUserDetailsPage.getCreateUserBtn());

    }

    @Step("click right vector")
    public static void clickRightVector(){
        UIActions.moveToElement(HomePage.getVectorBtn());
        //UIActions.click(HomePage.getVectorBtn());
    }

    @Step("click create users and teams")
    public static void clickCreateUsersAndTeams(){
        UIActions.click(HomePage.getCreateUsersAndTeams());
    }

    @Step("click to grafana fundamental page with sikuli")
    public static void clickToGrafanaFundamentalsPageWithSikuli() throws FindFailed {
        UIActions.clickWithSikuli("homepage.png");
    }

    @Step
    public static void navigateToGrafanaWeb(){
        UIActions.navigateToOriginalTab();
    }

    @Step
    public static Boolean checkUserCreated()
    {
        return UIActions.checkUserBeenCreated();
    }


}
