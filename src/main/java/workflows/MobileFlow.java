package workflows;
import io.qameta.allure.Step;

import pages.mobilePages.LivingTabTemperature;
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

}
