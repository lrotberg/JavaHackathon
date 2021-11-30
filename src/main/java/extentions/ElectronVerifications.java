package extentions;

import io.qameta.allure.Step;
import org.testng.Assert;
import pages.electronPages.ToDoPage;
import utilities.CommonOps;

import java.awt.*;

public class ElectronVerifications extends CommonOps {

  @Step("Verify Header Color")
  public static void verifyHeaderColor(String expectedColor) {
    Assert.assertEquals(convertToHex(), expectedColor);
  }

  @Step("Convert Style to Hex Color")
  private static String convertToHex() {
    String[] rgbColor = ToDoPage.getHeader().getAttribute("style").replaceAll("[a-zA-Z:(); ]", "").split(",");
    Color color = new Color(Integer.parseInt(rgbColor[0]), Integer.parseInt(rgbColor[1]), Integer.parseInt(rgbColor[2]));
    return Integer.toHexString(color.getRGB()).substring(2).toUpperCase();
  }

  @Step("Soft Verify ToDo Addition")
  public static void verifyToDoAddition(String expectedToDo) {
    boolean isPresent = false;
    String toDoText = ToDoPage.getListTasksText().get(0).getText();
    if (toDoText.equalsIgnoreCase(expectedToDo)) isPresent = true;
    Assert.assertTrue(isPresent);
  }
}
