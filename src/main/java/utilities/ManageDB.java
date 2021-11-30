package utilities;

import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import pages.electronPages.ToDoPage;

public class ManageDB extends CommonOps{
    private static JDBC jdbc;

    @Step("Build Electron Pages")
    public static void buildPages() {
        jdbc = PageFactory.initElements(driver, JDBC.class);
    }
}
