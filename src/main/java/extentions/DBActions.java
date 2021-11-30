package extentions;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.webPages.AddNewUserDetailsPage;
import utilities.CommonOps;
import workflows.WebFlows;

public class DBActions extends CommonOps {

    @Step("create new user from DB")
    public static void createNewUserDB(String Name, String Email, String userName, String pass) throws InterruptedException {
       WebFlows.createNewUser(Name, Email, userName, pass);
    }

    @Step("Check User Created")
    public static Boolean checkUserCreated() {
        return UIActions.checkUserBeenCreated();
    }


}

