package utilities;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class UIActions extends CommonOps {

    @Step("Click Element")
    public static void click(WebElement element){
        element.click();
    }

//    @Step("Double Click")
//    public static void doubleClick(WebElement element) {
//        action.doubleClick().build().perform();
//    }

    @Step("Send Keys")
    public static void updateText(WebElement element, String str) {
        element.sendKeys(str);
    }

    @Step("Clear Text")
    public static void clearText(WebElement element) {
        element.clear();
    }

    @Step("Scroll to Element")
    public static void scroll(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }

    @Step("Move to Element")
    public static void moveToElement(WebElement element){
        action.moveToElement(element).click().build().perform();
    }

    @Step("Submit Input")
    public static void submitInput(WebElement element) {
        element.submit();
    }
}
