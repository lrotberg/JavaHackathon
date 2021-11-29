import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Mobile.LivingTabCurrency;
import pages.Mobile.LivingTabTemperature;
import utilities.CommonOps;
import workflows.MobileFlow;

import java.util.concurrent.TimeUnit;
@Listeners(HackathonListeners.class)

public class AppiumTest extends CommonOps {
    @Test(priority = 1)
    @Description("living tab")
    public void goToLivingTab() throws InterruptedException {
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        MobileFlow.livingTab();
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        Assert.assertEquals(LivingTabTemperature.getFirstTitle().getText(),"Majors");
    }
    @Test(priority = 2)
    @Description("click temperature tab")
    public void checkTitleInTempTab() throws InterruptedException {
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        MobileFlow.temperatureTab();
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        Assert.assertEquals(LivingTabTemperature.getFavoritesTitle().getText(),"FAVORITES");
    }

    @Test(priority = 3)
    @Description("click numbers input field for israeli currency in currency tab")
    public void clickInputField() throws InterruptedException {
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        MobileFlow.openNumPad();
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        Assert.assertEquals(LivingTabTemperature.getTempInput().getText(),"0");
    }

    @Test(priority = 4)
    @Description("enter numbers in key pad")
    public void EnterNumbers() throws InterruptedException {
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        MobileFlow.enterNumbersToNumPad();
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        Assert.assertEquals(LivingTabTemperature.getfTemp().getText(),"95");
    }
}
