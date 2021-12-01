package extentions;

import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import pages.mobilePages.LivingTabTemperaturePage;
import utilities.CommonOps;

public class MobileActions extends CommonOps {

  @Step("Mobile Click")
  public static void click(WebElement element) {
    element.click();
  }

  @Step("Move to Element")
  public static void moveToElement(WebElement element) {
    touch.tap(new TapOptions().withElement(ElementOption.element(LivingTabTemperaturePage.getTempBtn()))).perform();
  }
}
