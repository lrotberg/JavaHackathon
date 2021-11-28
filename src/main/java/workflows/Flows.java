package workflows;

import io.qameta.allure.Step;
import pages.HomePage;
import pages.LoginPage;
import utilities.CommonOps;
import utilities.UIActions;

public class Flows extends CommonOps {

    @Step("login")
    public void login(){
        UIActions.updateText(LoginPage.getUser(),"admin");
        UIActions.updateText(LoginPage.getPass(),"admin");
        UIActions.click(LoginPage.getloginBtn());
    }

    @Step("skip button in login page")
    public void skip(){
        UIActions.click(LoginPage.getSkipBtn());
    }

    @Step("scroll article Nov22")
    public void scrollArticle(){
        UIActions.click(HomePage.getLatestFromTheBlogNov22());
    }

//    @Step
//    public void clickDashboard(){
//
//    }

    @Step("click right vector")
    public void clickRightVector(){
        UIActions.click(HomePage.getVectorBtn());
    }

    @Step("click create users and teams")
    public void clickCreateUsersAndTeams(){
        UIActions.click(HomePage.getCreateUsersAndTeams());
    }

}
