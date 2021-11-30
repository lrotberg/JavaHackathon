package utilities;

import com.google.common.util.concurrent.Uninterruptibles;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
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
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.MalformedURLException;

import java.net.URL;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class CommonOps extends BasePage {

  @BeforeClass
  public void startup() throws MalformedURLException, SQLException, ClassNotFoundException, InterruptedException {
    openDBSession();
//    if(getData("PlatformName").equalsIgnoreCase("electron")) {
//      openElectronSession();
//    }
//    openWebSession();
//    openAPISession();
//    openMobileSession();
  }

  @AfterClass
  public void teardown() throws SQLException {
    closeDBSession();
//    if(getData("PlatformName").equalsIgnoreCase("electron")) {
//      closeWebSession();
//    }
//    closeMobileSession();
  }

  @Step("Open Web Session")
  public void openWebSession() {
    if(getData("BrowserName").equalsIgnoreCase("chrome")) {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
    }
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

  @Step("Open DB session")
  public void openDBSession() throws ClassNotFoundException, SQLException, InterruptedException {
    Class.forName("com.mysql.cj.jdbc.Driver");  //Load mysql jdbc driver
    con= DriverManager.getConnection(dbUrl,user,pass); //Create DB connection
    Uninterruptibles.sleepUninterruptibly(20, TimeUnit.SECONDS);
    stmt=con.createStatement(); //Create Statement Object
    ManageDB.buildPages();
    Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS);
    query="select * from UsersGrafana";
    rs= stmt.executeQuery(query); //Execute the SQL Query.Store results in ResultSe
  }

  @Step("Close Web Session")
  public void closeWebSession() {
    driver.quit();
  }

  @Step("close Mobile Session")
  public void closeMobileSession() {
    mobileDriver.quit();
  }

  @Step("close DB Session")
  public void closeDBSession() throws SQLException {
    con.close();
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
    File fXmlFile = new File("./ConfigFiles/config.xml");
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
