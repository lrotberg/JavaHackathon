package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class CommonOps extends BasePage {

  @Step("Open Web Session")
  public void openWebSession() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://localhost:3000/");
    ManagePages.buildPages();
    action= new Actions(driver);
    //WebDriverWait wait = new WebDriverWait(driver, 7);
    //wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//input[@name='user']"))));
  }

  @Step("Close Web Session")
  public void closeWebSession() {
    driver.quit();
  }
@Step ("open mobile app")
public void openApp() throws MalformedURLException {
  dc = new DesiredCapabilities();
  dc.setCapability("reportDirectory", reportDirectory);
  dc.setCapability("reportFormat", reportFormat);
  dc.setCapability("testName", testName);
  dc.setCapability(MobileCapabilityType.UDID, "R58R34SLXBD");
  dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "kr.sira.unit");
  dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".Intro");
  mobileDriver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
  MobileManagePages.buildPagesAppium();


}
  @BeforeClass
  public void startup() throws MalformedURLException {


    openApp();
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
