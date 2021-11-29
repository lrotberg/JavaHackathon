package utilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BasePage {

  protected static WebDriver driver;
  protected static Actions action;

/***** mobile variables ***/
  protected static String reportDirectory = "reports";
  protected static String reportFormat = "xml";
  protected static String testName = "Untitled";
  protected static AndroidDriver<AndroidElement> mobileDriver;

  protected static DesiredCapabilities dc;

  protected static TouchAction touch;

}
