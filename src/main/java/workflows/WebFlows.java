package workflows;

import io.qameta.allure.Step;
import pages.*;
import utilities.CommonOps;
import utilities.UIActions;

public class WebFlows extends CommonOps {

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

    @Step("click to server admin")
    public void clickToServerAdmin(){
        UIActions.click(LeftMenuPage.getLinkServerAdmin());
    }

    @Step("create new user")
    public void createNewUser(){
        UIActions.click(ServerAdminPage.getNewUserBtn());
        UIActions.updateText(AddNewUserDetailsPage.getNameOfNewUserTxt(),"team4");
        UIActions.updateText(AddNewUserDetailsPage.getEmailOfNewUserTxt(),"team4@gmail.com");
        UIActions.updateText(AddNewUserDetailsPage.getUserNameOfNewUserTxt(),"team4");
        UIActions.updateText(AddNewUserDetailsPage.getPasswordOfNameNewUserTxt(),"team4");
        UIActions.click(AddNewUserDetailsPage.getCreateUserBtn());

    }

    @Step("click right vector")
    public void clickRightVector(){
        UIActions.click(HomePage.getVectorBtn());
    }

    @Step("click create users and teams")
    public void clickCreateUsersAndTeams(){
        UIActions.click(HomePage.getCreateUsersAndTeams());
    }

}
