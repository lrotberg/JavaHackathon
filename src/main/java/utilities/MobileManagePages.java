package utilities;
import io.appium.java_client.TouchAction;
import io.qameta.allure.Step;
import pages.Mobile.LivingTabCurrency;
import pages.Mobile.LivingTabTemperature;


public class MobileManagePages extends BasePage
{
    /**** varaibles declartion ***/

    private static LivingTabTemperature temp;
    private static LivingTabCurrency currency;

    /**** construct mobile pages (page factory) ***/

    @Step("Build Pages for Appium")
    public static void buildPagesAppium() {
        temp=new LivingTabTemperature(mobileDriver);
        currency= new LivingTabCurrency(mobileDriver);
        touch= new TouchAction(mobileDriver);
    }
}
