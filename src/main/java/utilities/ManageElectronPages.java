package utilities;

import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import pages.electronPages.ToDoPage;

public class ManageElectronPages extends BasePage {

  @Step("Build Electron Pages")
  public static void buildPages() {
    toDoPage = PageFactory.initElements(driver, ToDoPage.class);
  }

}
