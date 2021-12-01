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
public class MobileTest extends CommonOps {

  @Test(description = "Switch to Living Temperature Tab", priority = 1)
  @Description("This test should switch to the ")
  public void goToLivingTab() {
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    MobileFlow.switchToLivingTemperatureTab();
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    MobileVerifications.verifyEquals(livingTabTemperaturePage.getFirstTitle().getText(), "Majors");
  }

  @Test(priority = 2)
  @Description("click temperature tab")
  public void checkTitleInTempTab() {
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    MobileFlow.temperatureTab();
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    MobileVerifications.verifyEquals(livingTabTemperaturePage.getTitleFavorites().getText(), "FAVORITES");
  }

  @Test(priority = 3)
  @Description("click numbers input field for israeli currency in currency tab")
  public void clickInputField() {
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    MobileFlow.openNumPad();
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    MobileVerifications.verifyEquals(livingTabTemperaturePage.getTempInput().getText(), "0");
  }

  @Test(priority = 4)
  @Description("enter numbers in key pad")
  public void EnterNumbers() {
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    MobileFlow.enterNumbersToNumPad();
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    MobileVerifications.verifyEquals(livingTabTemperaturePage.getfTemp().getText(), "95");
  }

}
