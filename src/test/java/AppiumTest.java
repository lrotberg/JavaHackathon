import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.mobilePages.LivingTabTemperaturePage;
import utilities.CommonOps;
import utilities.HackathonListeners;
import workflows.MobileFlow;

import java.util.concurrent.TimeUnit;

@Listeners(HackathonListeners.class)
public class AppiumTest extends CommonOps {

  @Test(priority = 1)
  @Description("living tab")
  public void goToLivingTab() {
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    MobileFlow.livingTab();
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    Assert.assertEquals(LivingTabTemperaturePage.getFirstTitle().getText(), "Majors");
  }

  @Test(priority = 2)
  @Description("click temperature tab")
  public void checkTitleInTempTab() {
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    MobileFlow.temperatureTab();
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    Assert.assertEquals(LivingTabTemperaturePage.getFavoritesTitle().getText(), "FAVORITES");
  }

  @Test(priority = 3)
  @Description("click numbers input field for israeli currency in currency tab")
  public void clickInputField() {
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    MobileFlow.openNumPad();
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    Assert.assertEquals(LivingTabTemperaturePage.getTempInput().getText(), "0");
  }

  @Test(priority = 4)
  @Description("enter numbers in key pad")
  public void EnterNumbers() {
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    MobileFlow.enterNumbersToNumPad();
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    Assert.assertEquals(LivingTabTemperaturePage.getfTemp().getText(), "95");
  }

}
