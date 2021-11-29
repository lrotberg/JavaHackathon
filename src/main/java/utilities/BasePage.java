package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BasePage {

  protected static WebDriver driver;
  protected static Actions action;
  protected static ChromeOptions chromeOptions;
  protected static DesiredCapabilities capabilities;
}
