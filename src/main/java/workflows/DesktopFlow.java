package workflows;

import io.qameta.allure.Step;
import pages.desktopPages.CalculatorPage;
import utilities.CommonOps;
import extentions.DesktopActions;

public class DesktopFlow extends CommonOps {

  @Step("Make Sum Operation")
  public static void plus() {
    DesktopActions.click(CalculatorPage.getDigit2());
    DesktopActions.click(CalculatorPage.getPlusSign());
    DesktopActions.click(CalculatorPage.getDigit8());
    DesktopActions.click(CalculatorPage.getEqualSign());
  }

  @Step("Make Multiplication Operation")
  public static void multiply() {
    DesktopActions.click(CalculatorPage.getResult());
    DesktopActions.click(CalculatorPage.getMultiplicationSign());
    DesktopActions.click(CalculatorPage.getDigit2());
    DesktopActions.click(CalculatorPage.getEqualSign());
  }
}
