package workflows;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import pages.electronPages.ToDoPage;
import utilities.CommonOps;
import extentions.UIActions;

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

  @Step("Add a Todo")
  public static void addToDo(String toDoText) {
    UIActions.click(ToDoPage.getInputAddTask());
    UIActions.clearText(ToDoPage.getInputAddTask());
    UIActions.updateText(ToDoPage.getInputAddTask(), toDoText + Keys.RETURN.toString());
  }

}

