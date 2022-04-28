package test.mobile.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.mobile.pageobject.BasePageObject;


public class LoginPage extends BasePageObject {
    private By emailField(){
        return MobileBy.id("textInputEditTextEmail");
    }

    private By passwordField(){
        return MobileBy.id("textInputEditTextPassword");
    }

    private By loginButton(){
        return MobileBy.id("appCompatButtonLogin");
    }

    private By errorMessage(){
        return MobileBy.id("snackbar_text");
    }

    @Step
    public boolean onLoginPage(){
        return waitUntilVisible(loginButton()).isDisplayed();
    }

    @Step
    public void inputValidEmail(String email){
        onType(emailField(),email);
    }

    @Step
    public void inputValidPassword(String password){
        onType(passwordField(),password);
    }

    @Step
    public void clickLoginButton(){
        onClick(loginButton());
    }

    @Step
    public void inputInValidEmail(String email){
        onType(emailField(),email);
    }

    @Step
    public void inputInValidPassword(String password){
        onType(passwordField(),password);
    }


    @Step
    public String getErrorMessage(){
        return waitUntilVisible(errorMessage()).getText();
    }
}
