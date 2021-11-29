package utilities;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Screen;

public class BasePage {

  protected static WebDriver driver;
  protected static Actions action;
  protected static String url="http://localhost:3000";
  protected static RequestSpecification request;
  protected static Response response;
  protected static Screen screen;
}
