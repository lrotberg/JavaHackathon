package utilities;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Screen;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.asserts.SoftAssert;
import pages.desktopPages.CalculatorPage;
import pages.electronPages.ToDoPage;
import pages.mobilePages.LivingTabTemperaturePage;
import pages.webPages.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class BasePage {

  protected static WebDriver driver;
  protected static Actions action;
  protected static String url = "http://localhost:3000";
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
  protected static JSONObject params;
  protected static String calcApp;
  protected static WebDriver desktopDriver;
  protected static SoftAssert softAssert;

  //DB
  //protected static String dbUrl="https://www.phpmyadmin.co/index.php"; //connect url
  protected static String dbUrl = "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6455269";//connect url
  protected static String user = "sql6455269", pass = "zflL2lQxl8"; //DB Username&password
  protected static String query;
  protected static String myName, myEmail, myUserName, myPassword;
  protected static Connection con;
  protected static Statement stmt;
  protected static ResultSet rs;

  protected static LoginPage loginPage;
  protected static HomePage homePage;
  protected static LeftMenuPage leftMenuPage;
  protected static ServerAdminPage serverAdminPage;
  protected static AddNewUserDetailsPage addNewUserDetailsPage;
  protected static SkipPage skipPage;
  protected static UserInformationPage userInformationPage;

  protected static LivingTabTemperaturePage livingTabTemperaturePage;

  protected static ToDoPage toDoPage;

  protected static CalculatorPage calculatorPage;

  protected static ManageJDBC jdbc;
}
