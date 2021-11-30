package pages.desktopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CalculatorPage {

    @FindBy(how = How.NAME, using= "Eight")
    protected static WebElement digit8;

    @FindBy(how = How.NAME, using= "Two")
    protected static WebElement digit2;

    @FindBy(how = How.NAME, using= "Plus")
    protected static WebElement plusSign;

    @FindBy(how = How.NAME, using= "Multiply by")
    protected static WebElement multiplicationSign;

    @FindBy(how = How.NAME, using= "Equals")
    protected static WebElement EqualSign;

    @FindBy(how = How.XPATH, using= "//*[@AutomationId='CalculatorResults']")
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
