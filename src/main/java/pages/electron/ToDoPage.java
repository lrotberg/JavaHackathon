package pages.electron;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ToDoPage {

  @FindBy(tagName = "header")
  protected static WebElement header;

  @FindBy(css = "input[placeholder='Create a task']")
  protected static WebElement inputAddTask;

  @FindBy(css = "header > div > div > svg:nth-child(1)")
  protected static WebElement btnChangeColor;

  @FindBy(css = "input[class='vc-input__input']")
  protected static WebElement inputHexColor;

  @FindBy(css = "button[class='wrapper_1SRLB']")
  protected static WebElement btnSaveColor;

  @FindBy(css = "div.wrapper_DtvJU > div:nth-child(2)")
  protected static WebElement divTaskListContainer;

  @FindBy(css = "div.wrapper_DtvJU > div:nth-child(2) > h2")
  protected static WebElement h2NoTasks;

  @FindBy(css = "div[class='draggableList_DX-a1']")
  protected static List<WebElement> listTasks;

  public static WebElement getHeader() { return header; }

  public static WebElement getInputAddTask() { return inputAddTask; }

  public static WebElement getBtnChangeColor() { return btnChangeColor; }

  public static WebElement getInputHexColor() { return inputHexColor; }

  public static WebElement getBtnSaveColor() { return btnSaveColor; }

  public static WebElement getDivTaskListContainer() { return divTaskListContainer; }

  public static WebElement getH2NoTasks() { return h2NoTasks; }

  public static List<WebElement> getListTasks() { return listTasks; }
}
