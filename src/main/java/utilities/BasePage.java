package utilities;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Screen;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.asserts.SoftAssert;

public class BasePage {

  protected static WebDriver driver;
  protected static Actions action;
  protected static String url="http://localhost:3000";
  protected static RequestSpecification request;
  protected static Response response;
  protected static Screen screen;
  protected static String reportDirectory = "reports";
  protected static String reportFormat = "xml";
  protected static String testName = "Untitled";
  protected static AndroidDriver<AndroidElement> mobileDriver;
  protected static TouchAction touch;
  protected static DesiredCapabilities capabilities;
  protected static ChromeOptions chromeOptions;
  protected static SoftAssert softAssert;
}
