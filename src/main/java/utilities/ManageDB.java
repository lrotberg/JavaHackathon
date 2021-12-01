package utilities;

import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

public class ManageDB extends CommonOps{

    @Step("Build Electron Pages")
    public static void buildPages() {
        jdbc = PageFactory.initElements(driver, ManageJDBC.class);
    }

}
