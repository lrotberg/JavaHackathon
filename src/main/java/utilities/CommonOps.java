package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CommonOps extends BasePage {

  @Step("Open Web Session")
  public void openWebSession() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://localhost:3000/");
    ManagePages.buildPages();
    action= new Actions(driver);
    screen=new Screen();
  }

  @Step("Close Web Session")
  public void closeWebSession() {
    driver.quit();
  }

  @BeforeClass
  public void startup() {
    openWebSession();
  }

  @AfterClass
  public void teardown() {
    closeWebSession();
  }

  @Step("Save Screenshot")
  @Attachment(value = "Page Screenshot", type = "image/png")
  public byte[] saveScreenshot() {
    return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
  }
}
