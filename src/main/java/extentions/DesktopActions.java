package extentions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import utilities.CommonOps;

public class DesktopActions extends CommonOps {

  @Step("Desktop Click")
  public static void click(WebElement element) {
    element.click();
  }

}
