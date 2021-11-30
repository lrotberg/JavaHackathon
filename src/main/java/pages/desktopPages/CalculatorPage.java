package pages.desktopPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage {

    @FindBy(name = "Eight")
    protected static WebElement digit8;

    @FindBy(name = "Two")
    protected static WebElement digit2;

    @FindBy(name = "Plus")
    protected static WebElement plusSign;

    @FindBy(name = "Multiply by")
    protected static WebElement multiplicationSign;

    @FindBy(name = "Equals")
    protected static WebElement EqualSign;

    @FindBy(xpath = "//*[@AutomationId='CalculatorResults']")
    protected static WebElement result;

    public static WebElement getDigit8() {
        return digit8;
    }

    public static WebElement getDigit2() {
        return digit2;
    }

    public static WebElement getPlusSign() {
        return plusSign;
    }

    public static WebElement getMultiplicationSign() {
        return multiplicationSign;
    }

    public static WebElement getEqualSign() {
        return EqualSign;
    }

    public static WebElement getResult() {
        return result;
    }
}
