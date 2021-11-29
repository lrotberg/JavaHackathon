package workflows;

import io.qameta.allure.Step;
import utilities.APIActions;

public class APIFlows {

    @Step("Get Method")
    public static void get(){
        APIActions.getUser("team4");
    }

    @Step("PUT Method")
    public static void put(){
        APIActions.putUser("email","team4edit@gmail.com",8);
    }

    @Step("DELETE Method")
    public static void delete(){
        APIActions.deleteDashboard(8);
    }
}
