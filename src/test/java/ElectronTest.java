import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.electron.ToDoPage;
import utilities.CommonOps;
import utilities.HackathonListeners;
import workflows.ElectronFlow;

import java.awt.*;
import java.util.concurrent.TimeUnit;

@Listeners(HackathonListeners.class)
public class ElectronTest extends CommonOps {

  @Test(description = "Change Header Color")
  @Description("This test should should change the color of the app's header and then verify the change")
  public void test01_changeColor() {
    Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    ElectronFlow.changeHeaderColor("DD22DD");
    verifyHeaderColor("DD22DD");
  }

  @Step("Verify Header Color")
  public void verifyHeaderColor(String expectedColor) {
    String actualColor = convertToHex();
    Assert.assertEquals(actualColor, expectedColor);
  }

  @Step("Convert Style to Hex Color")
  public String convertToHex() {
    String[] rgbColor = ToDoPage.getHeader().getAttribute("style").replaceAll("[a-zA-Z:(); ]","").split(",");
    Color color = new Color(Integer.parseInt(rgbColor[0]), Integer.parseInt(rgbColor[1]), Integer.parseInt(rgbColor[2]));
    return Integer.toHexString(color.getRGB()).substring(2).toUpperCase();
  }
}
