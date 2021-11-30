package workflows;

import io.qameta.allure.Step;
import pages.desktopPages.CalculatorPage;
import utilities.CommonOps;
import utilities.DesktopActions;

public class DesktopFlow extends CommonOps {

    @Step("calculate 2+8")
    public static void plus() {
        DesktopActions.click(CalculatorPage.getDigit2());
        DesktopActions.click(CalculatorPage.getPlusSign());
        DesktopActions.click(CalculatorPage.getDigit8());
        DesktopActions.click(CalculatorPage.getEqualSign());
    }

        @Step("calculate the result (2+8) multiply by 2")
        public static void multiply(){
            DesktopActions.click(CalculatorPage.getResult());
            DesktopActions.click(CalculatorPage.getMultiplicationSign());
            DesktopActions.click(CalculatorPage.getDigit2());
            DesktopActions.click(CalculatorPage.getEqualSign());
    }
}
