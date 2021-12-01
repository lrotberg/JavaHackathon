package extentions;

import io.qameta.allure.Step;
import utilities.CommonOps;
import workflows.WebFlows;

public class DBActions extends CommonOps {

    @Step("create new user from DB")
    public static void createNewUserDB(String Name, String Email, String userName, String pass) {
       WebFlows.createNewUser(Name, Email, userName, pass);
    }

    @Step("Check User Created")
    public static boolean checkUserCreated(String email) {
        return UIActions.checkUserBeenCreated(email);
    }

    @Step("Delete User")
    public static void deleteUserDB(){
        WebFlows.deleteUser();
    }

}

