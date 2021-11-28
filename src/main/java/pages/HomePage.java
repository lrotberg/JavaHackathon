package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends CommonOps{

    @FindBy(className = "css-1m290ug")
    private WebElement topRect;

    @FindBy(className = "css-1aanzv4")
    private WebElement welcomeTitle;

    @FindBy(linkText = "Documentation")
    private WebElement documentation;

    @FindBy(linkText = "Tutorials")
    private WebElement tutorials;

    @FindBy(linkText = "Community")
    private WebElement community;

    @FindBy(linkText = "Public Slack")
    private WebElement publicSlack;

    @FindBy(className = "css-1m4liiw")
    private WebElement rectMiddle;

    @FindBy(className = "css-kff62q-button")
    private WebElement vectorBtn;

    @FindBy(className = "css-17abkeq")
    private WebElement titleMiddleRec;

    @FindBy(className ="css-k8f47l")
    private WebElement createUsersAndTeams;

    @FindBy(xpath = "(//div[@class='panel-header grid-drag-handle']//header[@class='panel-title-container'])[3]")
    private WebElement dashboards;

    @FindBy(xpath = "//div[@class='panel-menu-container dropdown open']/ul/li/a")
    private List<WebElement> dashboardMenu;

    @FindBy(xpath = "(//div[@class='panel-menu-container dropdown open']/ul/li/a)[1]")
    private WebElement dashboardView;

    @FindBy(xpath = "((//div[@class='scrollbar-view']//*[name()='article'])[4]//a)[2]")
    private WebElement latestFromTheBlogNov22;

    @Step("Right vector click from middle rectangle")
    private static void rightVectorClick(WebElement element){
        element.click();
    }

    @Step("Create users and teams click")
    private static void createUsersAndTeamsClick(WebElement element){
        element.click();
    }

    @Step("Scroll to article")
    public void scrollToArticle(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }

}
