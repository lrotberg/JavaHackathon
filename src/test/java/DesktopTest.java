import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.DesktopFlow;

import java.util.concurrent.TimeUnit;

public class DesktopTest extends CommonOps {

  @Test(description = "Test Calculator App")
  @Description("This test should make a few operations and then verify the result")
  public void usingDesktopCalc() {
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    DesktopFlow.plus();
    softAssert.assertEquals(calculatorPage.getResult().getText(), "Display is 10");
    DesktopFlow.multiply();
    softAssert.assertEquals(calculatorPage.getResult().getText(), "Display is 20");
    softAssert.assertAll();
  }

}