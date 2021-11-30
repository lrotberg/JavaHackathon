package workflows;

import io.qameta.allure.Step;
import utilities.APIActions;
import utilities.CommonOps;

public class APIFlows extends CommonOps {

    @Step("Get team4 Method")
    public static void getFlows(){
        APIActions.getUser("team4");
    }

    @Step("Create Method")
    public static void createFlows(){
        APIActions.createUser(params);
    }

    @Step("POST method")
    public static void postFlows(){
        APIActions.postUser();
    }

    @Step("PUT team4 Method")
    public static void putFlows(){
        APIActions.updateUser(params,"email","team4edit@gmail.com",17);
    }

    @Step("DELETE team4 Method")
    public static void deleteFlows(){
        APIActions.deleteUser(17);
    }
}
