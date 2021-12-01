package pages.mobilePages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LivingTabTemperaturePage
{
    protected static AppiumDriver mobileDriver;
    public LivingTabTemperaturePage(AppiumDriver mobileDriver) {
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
    protected static WebElement keyNumber3;

    @AndroidFindBy(xpath  = "//*[@id='tab1_num5']")          //press the keypad num 5
    protected static WebElement keyNumber5;

    @AndroidFindBy(xpath  = "//*[@id='tab1_numok']")        //press the keypad ok button
    protected static WebElement btnOK;

    @AndroidFindBy(xpath  = "//*[@text='FAVORITES']")           //title of top right side  (for assert)
    protected static WebElement titleFavorites;

    public static WebElement getLivingBtn() {
        return LivingBtn;
    }

    public static WebElement getTempInput() {
        return tempInput;
    }

    public static WebElement getfTemp() {
        return fTemp;
    }

    public static WebElement getKeyNumber3() { return keyNumber3; }

    public static WebElement getKeyNumber5() {
        return keyNumber5;
    }

    public static WebElement getBtnOK() {
        return btnOK;
    }

    public static WebElement getTempBtn() {
        return tempBtn;
    }

    public static WebElement getTitleFavorites() {
        return titleFavorites;
    }
}