package utilities;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.testng.Assert;
import pages.HomePage;

public class UIActions extends CommonOps {

    @Step("click")
    public static void click(WebElement element){
        element.click();
    }

    @Step("send keys")
    public static void updateText(WebElement element, String str){
        element.sendKeys(str);
    }

    @Step("Scroll")
    public static void scroll(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }

    @Step
    public static void moveToElement(WebElement element){
        action.moveToElement(element).click().build().perform();
    }

    @Step("click with sikuli")
    public static void clickWithSikuli(String picture) throws FindFailed {
        screen.click("C://Ness - Automation Developer/JavaHackathon/src/main/java/sikuli/"+picture,80);
        screen.click("C://Ness - Automation Developer/JavaHackathon/src/main/java/sikuli/"+picture,80);
    }

    @Step("navigate to original tab")
    public static void navigateToOriginalTab(){
        String originalWindowID=driver.getWindowHandle();
        for(String newTab: driver.getWindowHandles()){
            driver.switchTo().window(newTab);
        }
        driver.close();
        driver.switchTo().window(originalWindowID);
    }
}
