import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import utilities.HackathonListeners;
import workflows.APIFlows;

public class APITests extends CommonOps {


  @Test(priority = 1)
  public void post()  {
    APIFlows.createFlows();
    APIFlows.postFlows();
    Assert.assertEquals(response.getStatusCode(), 200);
  }

  @Test(priority = 3, dependsOnMethods = {"post"})
  public void put()  {
    APIFlows.getFlows();
    APIFlows.putFlows(response.jsonPath().get("id"));
    Assert.assertEquals(response.getStatusCode(), 200);
  }

  @Test(priority = 4, dependsOnMethods = {"post"})
  public void delete() {
    APIFlows.getFlows();
    APIFlows.deleteFlows(response.jsonPath().get("id"));
    Assert.assertEquals(response.getStatusCode(), 200);
  }
}
