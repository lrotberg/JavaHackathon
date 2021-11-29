package pages.Mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LivingTabCurrency
{
    protected static AppiumDriver mobileDriver;
    public LivingTabCurrency(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, Duration.ofSeconds(3)),this);
    }

    @AndroidFindBy(xpath  = "//[@text='LIVING']")           //move to temp calculator on menu
    protected static WebElement LivingBtn;

    @AndroidFindBy(id = "image_living0")                        //currency button in living tab
    protected static WebElement CurrencyBtn;

    @AndroidFindBy(id = "tab1_input")                        //press the money input
    protected static WebElement moneyInput;

    @AndroidFindBy(xpath  = "(//*[@id='tab1_list']/*/*/*/*[@id='unit_value'])[2]")               //get the USA dollar result
    protected static WebElement UsaCurrency;

    @AndroidFindBy(xpath  = "//*[@id='tab1_num3']")         //press the keypad num 3
    protected static WebElement num3InKeyBoard;

    @AndroidFindBy(xpath  = "//*[@id='tab1_num5']")          //press the keypad num 5
    protected static WebElement num5InKeyBoard;

    @AndroidFindBy(xpath  = "//*[@id='tab1_numok']")        //press the keypad ok button
    protected static WebElement pressOKBtn;

    @AndroidFindBy(xpath  = "//[@text='FAVORITES']")           //title of top left side  (for assert)
    protected static WebElement majorsTitle;

    public static WebElement getLivingBtn() {
        return LivingBtn;
    }

    public static WebElement getCurrencyBtn() {
        return CurrencyBtn;
    }

    public static WebElement getMoneyInput() {
        return moneyInput;
    }

    public static WebElement getUsaCurrency() {
        return UsaCurrency;
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

    public static WebElement getMajorsTitle() {
        return majorsTitle;
    }
}
