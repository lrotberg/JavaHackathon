package utilities;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

public class DesktopActions extends CommonOps {


    @Step("click num pad")
    public static void click(WebElement element) {

        element.click();
    }
}
