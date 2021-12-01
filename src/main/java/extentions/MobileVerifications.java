package extentions;

import io.qameta.allure.Step;
import org.testng.Assert;
import utilities.CommonOps;

public class MobileVerifications extends CommonOps {

  @Step("Verify Texts are Equal")
  public static void verifyEquals(String actual, String expected) {
    Assert.assertEquals(actual, expected);
  }

}
