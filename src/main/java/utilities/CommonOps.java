package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class CommonOps extends BasePage {

  @Step("Open Web Session")
  public void openWebSession() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(url);
    ManagePages.buildPages();
    action= new Actions(driver);
  }

  @Step("init API")
  public void initAPI(){
    RestAssured.baseURI=url;
    request=RestAssured.given().auth().preemptive().basic("admin","admin");
    request.header("Content-Type","application/json");
  }

  @Step("Close Web Session")
  public void closeWebSession() {
    driver.quit();
  }

  @BeforeClass
  public void startup() {
    //openWebSession();
    initAPI();
  }

  @AfterClass
  public void teardown() {
    //closeWebSession();
  }

  @Step("Save Screenshot")
  @Attachment(value = "Page Screenshot", type = "image/png")
  public byte[] saveScreenshot() {
    return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
  }
}
