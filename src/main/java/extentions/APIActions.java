package extentions;

import io.qameta.allure.Step;
import org.json.simple.JSONObject;
import utilities.CommonOps;

public class APIActions extends CommonOps {

  @Step("Get single user by Id")
  public static void getUser(String userName) {
    response = request.get("/api/users/lookup?loginOrEmail=" + userName);

    System.out.println("GET response: ");
    response.prettyPrint();

    System.out.println("GET Status Code: " + response.getStatusCode());
  }

  @Step("Create new user - Global Users")
  public static void createUser(JSONObject params) {
    params.put("name", "OdeyaLiorMichal");
    params.put("email", "olm@gmail.com");
    params.put("login", "OdeyaLiorMichal");
    params.put("password", "olm456");
    request.body(params.toJSONString());
  }

  @Step("POST create user")
  public static void postUser() {
    response = request.post("/api/admin/users");

    System.out.println("POST response: ");
    response.prettyPrint();
    System.out.println("POST Status Code: " + response.getStatusCode());
  }


  @Step("User Update")
  public static void updateUser(JSONObject params, String key, String updatedValue, int id) {
    params.put(key, updatedValue);

    request.body(params.toJSONString());
    response = request.put("/api/users/" + id);

    System.out.println("PUT response: ");
    response.prettyPrint();
    System.out.println("PUT Status Code: " + response.getStatusCode());
  }

  @Step("Delete global User")
  public static void deleteUser(int id) {
    response = request.delete("/api/admin/users/" + id);

    System.out.println("DELETE response: ");
    response.prettyPrint(); // The print will be empty

    System.out.println("DELETE Status Code: " + response.getStatusCode());
  }
}
