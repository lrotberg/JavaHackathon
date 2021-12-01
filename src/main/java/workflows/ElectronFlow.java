package workflows;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import utilities.CommonOps;
import extentions.UIActions;

import java.util.concurrent.TimeUnit;

public class ElectronFlow extends CommonOps {

  @Step("Change Header Color")
  public static void changeHeaderColor(String hexColor) {
    UIActions.click(toDoPage.getBtnChangeColor());
    UIActions.clearText(toDoPage.getInputHexColor());
    UIActions.updateText(toDoPage.getInputHexColor(), hexColor);
    UIActions.click(toDoPage.getBtnSaveColor());
    Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
  }

  @Step("Add a Todo")
  public static void addToDo(String toDoText) {
    UIActions.click(toDoPage.getInputAddTask());
    UIActions.clearText(toDoPage.getInputAddTask());
    UIActions.updateText(toDoPage.getInputAddTask(), toDoText + Keys.RETURN.toString());
  }

}

