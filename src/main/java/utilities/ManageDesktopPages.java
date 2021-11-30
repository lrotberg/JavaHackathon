package utilities;

import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import pages.desktopPages.CalculatorPage;

public class ManageDesktopPages extends BasePage {

  private static CalculatorPage calcPage;

  @Step("Build Desktop Pages")
  public static void buildPages() {
    calcPage = PageFactory.initElements(desktopDriver, CalculatorPage.class);
  }
}
