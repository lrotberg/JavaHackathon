package utilities;

import io.appium.java_client.TouchAction;
import io.qameta.allure.Step;
import pages.mobilePages.LivingTabTemperaturePage;


public class MobileManagePages extends BasePage {
  /**** varaibles declartion ***/

  private static LivingTabTemperaturePage temp;

  /**** construct mobile pages (page factory) ***/

  @Step("Build Appium Pages")
  public static void buildPagesAppium() {
    temp = new LivingTabTemperaturePage(mobileDriver);
    touch = new TouchAction(mobileDriver);
  }
}
