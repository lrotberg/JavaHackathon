import com.google.common.util.concurrent.Uninterruptibles;
import extentions.MobileVerifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import utilities.HackathonListeners;
import workflows.MobileFlow;

import java.util.concurrent.TimeUnit;

@Listeners(HackathonListeners.class)
public class MobileTests extends CommonOps {

  @Test(description = "initiate the app to starting position: Living-> Temperature", priority = 1)
  @Description("click temperature tab")
  public void checkTitleInTempTab() {
    MobileFlow.switchToLivingTemperatureTab();
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    MobileFlow.temperatureTab();
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    MobileVerifications.verifyEquals(livingTabTemperaturePage.getTitleFavorites().getText(), "FAVORITES");
  }

  @Test(priority = 2, dependsOnMethods = "checkTitleInTempTab")
  @Description("enter numbers in key pad")
  public void EnterNumbers() {
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    MobileFlow.openNumPad();
    MobileFlow.enterNumbersToNumPad();
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    MobileVerifications.verifyEquals(livingTabTemperaturePage.getfTemp().getText(), "95");
  }
}