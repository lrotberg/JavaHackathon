package utilities;

import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import pages.desktopPages.CalculatorPage;

public class ManageDesktopPages extends BasePage {

  @Step("Build Desktop Pages")
  public static void buildPages() {
    calculatorPage = PageFactory.initElements(desktopDriver, CalculatorPage.class);
  }

}
