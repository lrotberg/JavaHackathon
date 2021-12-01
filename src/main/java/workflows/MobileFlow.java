package workflows;

import io.qameta.allure.Step;

import utilities.CommonOps;
import extentions.MobileActions;

public class MobileFlow extends CommonOps {

  @Step("Switch to Living Temperature Tab")
  public static void switchToLivingTemperatureTab() {
    MobileActions.click(livingTabTemperaturePage.getLivingBtn());
  }

  @Step("go to temperature tab in living tab")
  public static void temperatureTab() {
    MobileActions.click(livingTabTemperaturePage.getTempBtn());
  }

  @Step("click on temp input which opens number pad")
  public static void openNumPad() {
    MobileActions.click(livingTabTemperaturePage.getTempInput());
  }

  @Step("press numbers in number pad")
  public static void enterNumbersToNumPad() {
    MobileActions.click(livingTabTemperaturePage.getKeyNumber3());
    MobileActions.click(livingTabTemperaturePage.getKeyNumber5());
    MobileActions.click(livingTabTemperaturePage.getBtnOK());
  }

}
