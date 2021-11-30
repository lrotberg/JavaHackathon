package utilities;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Screen;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonOps extends BasePage {

  @Step("Open Web Session")
  public void openWebSession() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(url);
    ManagePages.buildPages();
    action = new Actions(driver);
    screen = new Screen();
  }

  @Step("open Mobile Session")
  public void openMobileSession() throws MalformedURLException {
    capabilities = new DesiredCapabilities();
    capabilities.setCapability("reportDirectory", reportDirectory);
    capabilities.setCapability("reportFormat", reportFormat);
    capabilities.setCapability("testName", testName);
    capabilities.setCapability(MobileCapabilityType.UDID, "R58R34SLXBD");
    capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "kr.sira.unit");
    capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".Intro");
    mobileDriver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
    MobileManagePages.buildPagesAppium();
  }

  @Step("Open API Session")
  public void openAPISession() {
    RestAssured.baseURI = url;
    request = RestAssured.given().auth().preemptive().basic("admin", "admin");
    request.header("Content-Type", "application/json");
  }

  @Step("Open Electron Session")
  public void openElectronSession() {
    System.setProperty("webdriver.chrome.driver", "C:/Elevation/TestAutomation/electrondriver.exe");
    chromeOptions = new ChromeOptions();
    chromeOptions.setBinary("C:/Users/exoli/AppData/Local/Programs/todolist/Todolist.exe");
    capabilities = new DesiredCapabilities();
    capabilities.setCapability("chromeOptions", chromeOptions);
    capabilities.setBrowserName("chrome");
    chromeOptions.merge(capabilities);
    driver = new ChromeDriver(chromeOptions);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    ManageElectronPages.buildPages();
  }

  @Step("Open Desktop Session")
  public void openDesktopSession() throws MalformedURLException {
    calcApp = "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App";
    capabilities = new DesiredCapabilities();
    capabilities.setCapability("app",calcApp);
    desktopDriver= new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
    soft= new SoftAssert();
    desktopDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    ManageDestopPages.buildPages();
  }

  @Step("Close Web Session")
  public void closeWebSession() {
    driver.quit();
  }

  @Step("open Mobile Session")
  public void closeMobileSession() {
    mobileDriver.quit();
  }
  @Step("open desktop Session")
  public void closeDesktopSession() {
    desktopDriver.quit();
  }
  @BeforeClass
  public void startup() throws MalformedURLException {

//    if (getData("PlatformType")=="web" { initWeb() {


    openDesktopSession();
//   openWebSession();
//    openAPISession();
//    openMobileSession();
 //   openElectronSession();
  }

  @AfterClass
  public void teardown() {
    closeDesktopSession();
  //   closeWebSession();
//    closeMobileSession();
  }

  @Step("Save Screenshot")
  @Attachment(value = "Page Screenshot", type = "image/png")
  public byte[] saveScreenshot() {
    return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
  }

  @Step("Read From XML")
  @Description("Read XML from file path")
  public String getData (String nodeName) {
    DocumentBuilder dBuilder;
    Document doc = null;
    File fXmlFile = new File("config.xml");
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    try {
      dBuilder = dbFactory.newDocumentBuilder();
      doc = dBuilder.parse(fXmlFile);
    }
    catch(Exception e) {
      System.out.println("Exception in reading XML file: " + e);
    }
    doc.getDocumentElement().normalize();
    return doc.getElementsByTagName(nodeName).item(0).getTextContent();
  }
}
