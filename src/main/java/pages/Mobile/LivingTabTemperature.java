package pages.Mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LivingTabTemperature
{
    protected static AppiumDriver mobileDriver;
    public LivingTabTemperature(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(3)),this);
    }

    @AndroidFindBy(xpath  = "(//*[@id='tabs']/*/*[@id='title'])[2]" )          //move to temp calculator on menu
    protected static WebElement LivingBtn;

    @AndroidFindBy(id  = "image_living1")           //temp button in living tab
    protected static WebElement tempBtn;

    @AndroidFindBy(id = "tab1_input")                        //press the celsius input
    protected static WebElement tempInput;

    @AndroidFindBy(xpath  = "(//*[@id='tab1_list']/*/*/*[@id='unit_value'])[2]")               //get the fahrenheit result
    protected static WebElement fTemp;

    @AndroidFindBy(xpath  = "//*[@id='tab1_num3']")         //press the keypad num 3
    protected static WebElement num3InKeyBoard;

    @AndroidFindBy(xpath  = "//*[@id='tab1_num5']")          //press the keypad num 5
    protected static WebElement num5InKeyBoard;

    @AndroidFindBy(xpath  = "//*[@id='tab1_numok']")        //press the keypad ok button
    protected static WebElement pressOKBtn;

    @AndroidFindBy(xpath  = "//*[@text='FAVORITES']")           //title of top right side  (for assert)
    protected static WebElement favoritesTitle;

    @AndroidFindBy(xpath  = "//*[@id='text1']")           //first title in living tab= Majors (top left side)
    protected static WebElement firstTitle;

    public static WebElement getLivingBtn() {
        return LivingBtn;
    }

    public static WebElement getTempInput() {
        return tempInput;
    }

    public static WebElement getfTemp() {
        return fTemp;
    }

    public static WebElement getNum3InKeyBoard() {
        return num3InKeyBoard;
    }

    public static WebElement getNum5InKeyBoard() {
        return num5InKeyBoard;
    }

    public static WebElement getPressOKBtn() {
        return pressOKBtn;
    }

    public static WebElement getTempBtn() {
        return tempBtn;
    }

    public static WebElement getFavoritesTitle() {
        return favoritesTitle;
    }

    public static WebElement getFirstTitle() {
        return firstTitle;
    }
}
