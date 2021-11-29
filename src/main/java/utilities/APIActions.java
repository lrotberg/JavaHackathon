package utilities;

import io.qameta.allure.Step;
import org.json.simple.JSONObject;

public class APIActions extends CommonOps {

    @Step("Get single user by Id")
    public static void getUser(String str){
        response=request.get("/api/users/lookup?loginOrEmail="+str);

        System.out.println("GET response: ");
        response.prettyPrint();

        System.out.println("GET Status Code: "+response.getStatusCode());
    }


    @Step("User Update")
    public static void putUser(String key, String updatedValue, int id){
        JSONObject params=new JSONObject();
        params.put(key,updatedValue);

        request.body(params.toJSONString());
        response= request.put("/api/users/"+id);

        System.out.println("PUT response: ");
        response.prettyPrint();
        System.out.println("PUT Status Code: "+response.getStatusCode());
    }

    @Step("Unstar a dashboard")
    public static void deleteDashboard(int dashboardId){
        response=request.delete("/api/user/stars/dashboard/"+dashboardId);

        System.out.println("DELETE response: ");
        response.prettyPrint(); // The print will be empty

        System.out.println("DELETE Status Code: "+response.getStatusCode());
    }
}
