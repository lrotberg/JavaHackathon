package workflows;

import io.qameta.allure.Step;

import pages.mobilePages.LivingTabTemperaturePage;
import utilities.CommonOps;
import extentions.MobileActions;

public class MobileFlow extends CommonOps {

  @Step("go to living tab")
  public static void livingTab() {
    MobileActions.click(LivingTabTemperaturePage.getLivingBtn());
  }

  @Step("go to temperature tab in living tab")
  public static void temperatureTab() {
    MobileActions.click(LivingTabTemperaturePage.getTempBtn());
  }

  @Step("click on temp input which opens number pad")
  public static void openNumPad() {
    MobileActions.click(LivingTabTemperaturePage.getTempInput());
  }

  @Step("press numbers in number pad")
  public static void enterNumbersToNumPad() {
    MobileActions.click(LivingTabTemperaturePage.getNum3InKeyBoard());
    MobileActions.click(LivingTabTemperaturePage.getNum5InKeyBoard());
    MobileActions.click(LivingTabTemperaturePage.getPressOKBtn());
  }

}
