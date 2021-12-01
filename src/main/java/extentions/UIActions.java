package extentions;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import pages.webPages.ServerAdminPage;
import utilities.CommonOps;

public class UIActions extends CommonOps {

  @Step("Click Element")
  public static void click(WebElement element) {
    element.click();
  }

  @Step("Send Keys")
  public static void updateText(WebElement element, String str) {
    element.sendKeys(str);
  }

  @Step("Clear Text")
  public static void clearText(WebElement element) {
    element.clear();
  }

  @Step("Scroll to Element")
  public static void scroll(WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", element);
  }

  @Step("Move to Element")
  public static void moveToElement(WebElement element) {
    action.moveToElement(element).click().build().perform();
  }

  @Step("Submit Input")
  public static void submitInput(WebElement element) {
    element.submit();
  }

  @Step("Click With Sikuli")
  public static void clickWithSikuli(String picture) throws FindFailed {
    screen.click("C://Ness - Automation Developer/JavaHackathon/Sikuli/" + picture, 80);
    screen.click("C://Ness - Automation Developer/JavaHackathon/Sikuli/" + picture, 80);
  }

  @Step("Navigate to Original Window")
  public static void navigateToOriginalTab() {
    String originalWindowID = driver.getWindowHandle();
    for (String newTab : driver.getWindowHandles()) {
      driver.switchTo().window(newTab);
    }
    driver.close();
    driver.switchTo().window(originalWindowID);
  }

  @Step("Check User Created")
  public static Boolean checkUserBeenCreated() {
    for (WebElement row : ServerAdminPage.getLoginColTeam4()) {
      if (row.getText().equals("team4")) {
        System.out.println(row.getText());
        return true;
      }
    }
    return false;
  }
}
