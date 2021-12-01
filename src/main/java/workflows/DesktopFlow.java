package workflows;

import io.qameta.allure.Step;
import utilities.CommonOps;
import extentions.DesktopActions;

public class DesktopFlow extends CommonOps {

  @Step("Make Sum Operation")
  public static void plus() {
    DesktopActions.click(calculatorPage.getDigit2());
    DesktopActions.click(calculatorPage.getPlusSign());
    DesktopActions.click(calculatorPage.getDigit8());
    DesktopActions.click(calculatorPage.getEqualSign());
  }

  @Step("Make Multiplication Operation")
  public static void multiply() {
    DesktopActions.click(calculatorPage.getResult());
    DesktopActions.click(calculatorPage.getMultiplicationSign());
    DesktopActions.click(calculatorPage.getDigit2());
    DesktopActions.click(calculatorPage.getEqualSign());
  }
}
