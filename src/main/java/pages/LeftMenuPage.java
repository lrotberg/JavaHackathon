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
}
