package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage{

    @FindBy(className = "css-1m290ug")
    protected static WebElement topRect;

    @FindBy(className = "css-1aanzv4")
    protected static WebElement welcomeTitle;

    @FindBy(linkText = "Documentation")
    protected static WebElement documentation;

    @FindBy(linkText = "Tutorials")
    protected static WebElement tutorials;

    @FindBy(linkText = "Community")
    protected static WebElement community;

    @FindBy(linkText = "Public Slack")
    protected static WebElement publicSlack;

    @FindBy(className = "css-1m4liiw")
    protected static WebElement rectMiddle;

    @FindBy(className = "css-kff62q-button")
    protected static WebElement vectorBtn;

    @FindBy(className = "css-17abkeq")
    protected static WebElement titleMiddleRec;

    @FindBy(className ="css-k8f47l")
    protected static WebElement createUsersAndTeams;

    @FindBy(xpath = "(//div[@class='panel-header grid-drag-handle']//header[@class='panel-title-container'])[3]")
    protected static WebElement dashboards;

    @FindBy(xpath = "//div[@class='panel-menu-container dropdown open']/ul/li/a")
    protected static List<WebElement> dashboardMenu;

    @FindBy(xpath = "(//div[@class='panel-menu-container dropdown open']/ul/li/a)[1]")
    protected static WebElement dashboardView;

    @FindBy(xpath = "((//div[@class='scrollbar-view']//*[name()='article'])[4]//a)[2]")
    protected static WebElement latestFromTheBlogNov22;

    public static WebElement getTopRect() {
        return topRect;
    }

    public static WebElement getTitleMiddleRec() {
        return titleMiddleRec;
    }

    public static WebElement getCreateUsersAndTeams() {
        return createUsersAndTeams;
    }

    public static WebElement getDashboards() {
        return dashboards;
    }

    public static List<WebElement> getDashboardMenu() {
        return dashboardMenu;
    }

    public static WebElement getDashboardView() {
        return dashboardView;
    }

    public static WebElement getLatestFromTheBlogNov22() {
        return latestFromTheBlogNov22;
    }

    public static WebElement getWelcomeTitle() {
        return welcomeTitle;
    }

    public static WebElement getDocumentation() {
        return documentation;
    }

    public static WebElement getTutorials() {
        return tutorials;
    }

    public static WebElement getCommunity() {
        return community;
    }

    public static WebElement getPublicSlack() {
        return publicSlack;
    }

    public static WebElement getRectMiddle() {
        return rectMiddle;
    }

    public static WebElement getVectorBtn() {
        return vectorBtn;
    }

}
