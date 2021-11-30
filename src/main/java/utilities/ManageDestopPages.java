package utilities;

import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import pages.desktopPages.CalculatorPage;
import pages.webPages.*;

public class ManageDestopPages extends BasePage{
    private static CalculatorPage calcPage;




    @Step("Build Pages")
    public static void buildPages() {
        calcPage = PageFactory.initElements(desktopDriver, CalculatorPage.class);


    }
}
