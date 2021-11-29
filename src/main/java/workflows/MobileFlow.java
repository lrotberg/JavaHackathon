package workflows;
import io.qameta.allure.Step;

import pages.Mobile.LivingTabCurrency;
import pages.Mobile.LivingTabTemperature;
import utilities.CommonOps;
import utilities.MobileActions;

public class MobileFlow extends CommonOps {

    @Step("go to living tab")
    public static void livingTab(){
        MobileActions.click(LivingTabTemperature.getLivingBtn());
    }

    @Step("go to temperature tab in living tab")
    public static void temperatureTab(){
      //  MobileActions.moveToElement(LivingTabTemperature.getTempBtn());
        MobileActions.click(LivingTabTemperature.getTempBtn());
    }

    @Step("click on temp input which opens number pad")
    public static void openNumPad(){
        MobileActions.click(LivingTabTemperature.getTempInput());
    }

    @Step("press numbers in number pad")
    public static void enterNumbersToNumPad (){
        MobileActions.click(LivingTabTemperature.getNum3InKeyBoard());
        MobileActions.click(LivingTabTemperature.getNum5InKeyBoard());
        MobileActions.click(LivingTabTemperature.getPressOKBtn());
    }


    @Step("go to currency tab in living tab")
    public static void currencyTab(){
        MobileActions.click(LivingTabCurrency.getCurrencyBtn());
    }

    @Step("click on currency input which opens number pad")
    public static void openNumPadCurrency(){
        MobileActions.click(LivingTabCurrency.getMoneyInput());
    }

    @Step("press numbers in number pad for currency")
    public static void enterNumbersToNumPadCurrency (){
        MobileActions.click(LivingTabCurrency.getNum3InKeyBoard());
        MobileActions.click(LivingTabCurrency.getNum5InKeyBoard());
        MobileActions.click(LivingTabCurrency.getPressOKBtn());
    }
}
