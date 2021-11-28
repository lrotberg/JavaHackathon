package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftMenuPage {

  @FindBy(xpath = "//img[@alt='Grafana']/..")
  protected WebElement linkHome;

  @FindBy(css = "button[aria-label='Search dashboards']")
  protected WebElement btnSearch;

  @FindBy(css = "a[aria-label='Create']")
  protected WebElement linkCreateDashboard;

  @FindBy(css = "a[aria-label='Explore']")
  protected WebElement linkExplore;

  @FindBy(css = "a[aria-label='Alerting']")
  protected WebElement linkAlerting;

  @FindBy(css = "a[aria-label='Configuration']")
  protected WebElement linkConfig;

  @FindBy(css = "a[aria-label='Server Admin']")
  protected WebElement linkServerAdmin;

  @FindBy(css = "a[aria-label='admin']")
  protected WebElement linkProfile;

  public WebElement getLinkHome() { return linkHome; }

  public WebElement getBtnSearch() { return btnSearch; }

  public WebElement getLinkCreateDashboard() { return linkCreateDashboard; }

  public WebElement getLinkExplore() { return linkExplore; }

  public WebElement getLinkAlerting() { return linkAlerting; }

  public WebElement getLinkConfig() { return linkConfig; }

  public WebElement getLinkServerAdmin() { return linkServerAdmin; }

  public WebElement getLinkProfile() { return linkProfile; }
}
