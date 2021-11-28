package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftMenuPage {

  @FindBy(xpath = "//img[@alt='Grafana']/..")
  protected static WebElement linkHome;

  @FindBy(css = "button[aria-label='Search dashboards']")
  protected static WebElement btnSearch;

  @FindBy(css = "a[aria-label='Create']")
  protected static WebElement linkCreateDashboard;

  @FindBy(css = "a[aria-label='Explore']")
  protected static WebElement linkExplore;

  @FindBy(css = "a[aria-label='Alerting']")
  protected static WebElement linkAlerting;

  @FindBy(css = "a[aria-label='Configuration']")
  protected static WebElement linkConfig;

  @FindBy(css = "a[aria-label='Server Admin']")
  protected static WebElement linkServerAdmin;

  @FindBy(css = "a[aria-label='admin']")
  protected static WebElement linkProfile;

  public static WebElement getLinkHome() { return linkHome; }

  public static WebElement getBtnSearch() { return btnSearch; }

  public static WebElement getLinkCreateDashboard() { return linkCreateDashboard; }

  public static WebElement getLinkExplore() { return linkExplore; }

  public static WebElement getLinkAlerting() { return linkAlerting; }

  public static WebElement getLinkConfig() { return linkConfig; }

  public static WebElement getLinkServerAdmin() { return linkServerAdmin; }

  public static WebElement getLinkProfile() { return linkProfile; }
}
