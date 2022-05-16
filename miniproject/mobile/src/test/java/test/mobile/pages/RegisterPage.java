package test.mobile.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.mobile.pageobject.BasePageObject;

public class RegisterPage extends BasePageObject {
    private By toRegister(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }
    private By nameField(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    private By emailFieldRegist(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }
    private By passFieldRegist(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    }
    private By registerButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }

    @Step
    public void clickToRegister(){
        onClick(toRegister());
    }
    @Step
    public void inputName(String name){
        onClick(nameField());
        onType(nameField(),name);
    }
    @Step
    public void inputEmail(String email){
        onClick(emailFieldRegist());
        onType(emailFieldRegist(),email);
    }
    @Step
    public void inputPassword(String password){
        onClick(passFieldRegist());
        onType(passFieldRegist(),password);
    }
    @Step
    public void clickRegisterButton(){
        onClick(registerButton());
    }
}
