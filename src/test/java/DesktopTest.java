import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.desktopPages.CalculatorPage;
import utilities.CommonOps;
import workflows.DesktopFlow;

import java.util.concurrent.TimeUnit;

public class DesktopTest extends CommonOps {
  @Test
  @Description("pressing on number key pad 8+2 and than multiply the result by 2")
  public void usingDesktopCalc() {
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    DesktopFlow.plus();
    softAssert.assertEquals(CalculatorPage.getResult().getText(), "Display is 10");
    DesktopFlow.multiply();
    softAssert.assertEquals(CalculatorPage.getResult().getText(), "Display is 20");
    softAssert.assertAll();
  }
}