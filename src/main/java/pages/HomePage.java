package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage{

    @FindBy(className = "css-1m290ug")
    protected WebElement topRect;

    @FindBy(className = "css-1aanzv4")
    protected WebElement welcomeTitle;

    @FindBy(linkText = "Documentation")
    protected WebElement documentation;

    @FindBy(linkText = "Tutorials")
    protected WebElement tutorials;

    @FindBy(linkText = "Community")
    protected WebElement community;

    @FindBy(linkText = "Public Slack")
    protected WebElement publicSlack;

    @FindBy(className = "css-1m4liiw")
    protected WebElement rectMiddle;

    @FindBy(className = "css-kff62q-button")
    protected WebElement vectorBtn;

    @FindBy(className = "css-17abkeq")
    protected WebElement titleMiddleRec;

    @FindBy(className ="css-k8f47l")
    protected WebElement createUsersAndTeams;

    @FindBy(xpath = "(//div[@class='panel-header grid-drag-handle']//header[@class='panel-title-container'])[3]")
    protected WebElement dashboards;

    @FindBy(xpath = "//div[@class='panel-menu-container dropdown open']/ul/li/a")
    protected List<WebElement> dashboardMenu;

    @FindBy(xpath = "(//div[@class='panel-menu-container dropdown open']/ul/li/a)[1]")
    protected WebElement dashboardView;

    @FindBy(xpath = "((//div[@class='scrollbar-view']//*[name()='article'])[4]//a)[2]")
    protected WebElement latestFromTheBlogNov22;

    public WebElement getTopRect() {
        return topRect;
    }

    public WebElement getWelcomeTitle() {
        return welcomeTitle;
    }

    public WebElement getDocumentation() {
        return documentation;
    }

    public WebElement getTutorials() {
        return tutorials;
    }

    public WebElement getCommunity() {
        return community;
    }

    public WebElement getPublicSlack() {
        return publicSlack;
    }

    public WebElement getRectMiddle() {
        return rectMiddle;
    }

    public WebElement getVectorBtn() {
        return vectorBtn;
    }

    public WebElement getTitleMiddleRec() {
        return titleMiddleRec;
    }

    public WebElement getCreateUsersAndTeams() {
        return createUsersAndTeams;
    }

    public WebElement getDashboards() {
        return dashboards;
    }

    public List<WebElement> getDashboardMenu() {
        return dashboardMenu;
    }

    public WebElement getDashboardView() {
        return dashboardView;
    }

    public WebElement getLatestFromTheBlogNov22() {
        return latestFromTheBlogNov22;
    }
}
