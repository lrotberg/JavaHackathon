package workflows;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import pages.electronPages.ToDoPage;
import utilities.CommonOps;
import utilities.UIActions;

import java.util.concurrent.TimeUnit;

public class ElectronFlow extends CommonOps {

  @Step("Change Header Color")
  public static void changeHeaderColor(String hexColor) {
    UIActions.click(ToDoPage.getBtnChangeColor());
    UIActions.clearText(ToDoPage.getInputHexColor());
    UIActions.updateText(ToDoPage.getInputHexColor(), hexColor);
    UIActions.click(ToDoPage.getBtnSaveColor());
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
  }
}
