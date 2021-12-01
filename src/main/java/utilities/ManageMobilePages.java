package utilities;

import io.appium.java_client.TouchAction;
import io.qameta.allure.Step;
import pages.mobilePages.LivingTabTemperaturePage;


public class ManageMobilePages extends BasePage {

  @Step("Build Appium Pages")
  public static void buildPagesAppium() {
    livingTabTemperaturePage = new LivingTabTemperaturePage(mobileDriver);
    touch = new TouchAction(mobileDriver);
  }

}
