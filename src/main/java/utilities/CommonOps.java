package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class CommonOps extends BasePage {

  @Step("Open Web Session")
  public void openWebSession() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://localhost:3000/");
    ManagePages.buildPages();
    action = new Actions(driver);
    //WebDriverWait wait = new WebDriverWait(driver, 7);
    //wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//input[@name='user']"))));
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
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    ManageElectronPages.buildPages();
  }

  @Step("Close Web Session")
  public void closeWebSession() {
    driver.quit();
  }

  @BeforeClass
  public void startup() {
//    openWebSession();
    openElectronSession();
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
