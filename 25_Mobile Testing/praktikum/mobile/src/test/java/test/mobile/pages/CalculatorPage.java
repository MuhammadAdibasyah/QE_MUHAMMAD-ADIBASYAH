package test.mobile.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.mobile.pageobject.BasePageObject;

public class CalculatorPage extends BasePageObject {
    private By one(){
        return MobileBy.AccessibilityId("1");
    }
    private By two(){
        return MobileBy.AccessibilityId("2");
    }
    private By three(){
        return MobileBy.AccessibilityId("3");
    }
    private By four(){
        return MobileBy.AccessibilityId("4");
    }
    private By five(){
        return MobileBy.AccessibilityId("5");
    }
    private By six(){
        return MobileBy.AccessibilityId("6");
    }
    private By seven(){
        return MobileBy.AccessibilityId("7");
    }
    private By eight(){
        return MobileBy.AccessibilityId("8");
    }
    private By nine(){
        return MobileBy.AccessibilityId("9");
    }
    private By zero(){
        return MobileBy.AccessibilityId("0");
    }
    private By doubleZero(){
        return MobileBy.AccessibilityId("00");
    }
    private By tripleZero(){
        return MobileBy.AccessibilityId("000");
    }
    private By plusSign(){
        return MobileBy.xpath("//android.view.View[@content-desc=\" + \"]");
    }
    private By minSign(){
        return MobileBy.xpath("//android.view.View[@content-desc=\" - \"]");
    }
    private By multipliedSign(){
        return MobileBy.xpath("//android.view.View[@content-desc=\" x \"]");
    }
    private By dividedSign(){
        return MobileBy.AccessibilityId("÷");
    }
    private By equalsSign(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"=\"]");
    }
    private By title(){
        return MobileBy.AccessibilityId("Calculator");
    }
    private By result(String number){
        return MobileBy.xpath(String.format("",number));
    }

    //function

    @Step
    public boolean onCalculatorPage(){
        return waitUntilVisible(title()).isDisplayed();
    }

    @Step
    public void tapNumber(Integer number){
        switch (number){
            case 1:
                onClick(one());
                break;
            case 2:
                onClick(two());
                break;
            case 3:
                onClick(three());
                break;
            case 4:
                onClick(four());
                break;
            case 5:
                onClick(five());
                break;
            case 6:
                onClick(six());
                break;
            case 7:
                onClick(seven());
                break;
            case 8:
                onClick(eight());
                break;
            case 9:
                onClick(nine());
                break;
            case 0:
                onClick(zero());
                break;
        }
    }

    @Step
    public void tapSign(String sign){
        System.out.println(sign);
        switch (sign){
            case "plus":
                onClick(plusSign());
                break;
            case "minus":
                onClick(minSign());
                break;
            case "multiplied":
                onClick(multipliedSign());
                break;
            case "divided":
                onClick(dividedSign());
                break;
            case "equals":
                onClick(equalsSign());
                break;
        }
    }
}
