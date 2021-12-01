package workflows;

import io.qameta.allure.Step;
import extentions.APIActions;
import utilities.CommonOps;

public class APIFlows extends CommonOps {

  @Step("Get Method")
  public static void getFlows() { APIActions.getUser("OdeyaLiorMichal"); }

  @Step("Create Method")
  public static void createFlows() { APIActions.createUser(params); }

  @Step("POST method")
  public static void postFlows() { APIActions.postUser(); }

  @Step("PUT team4 Method")
  public static void putFlows(int id) { APIActions.updateUser(params, "email", "olm@gmail.com", id); }

  @Step("DELETE team4 Method")
  public static void deleteFlows(int id) { APIActions.deleteUser(id); }
}
