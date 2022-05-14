package test.mobile.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.mobile.pageobject.BasePageObject;


public class LoginPage extends BasePageObject {
    private By homePage(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Products\"]");
    }
    private By loginPage(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Login\"]");
    }

    private By iconLogin(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By emailField(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By passwordField(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By loginButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    private By errorMessage(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Email atau password tidak valid.\"]");
    }

    @Step
    public boolean onHomePage(){
        return waitUntilVisible(homePage()).isDisplayed();
    }

    @Step
    public void clickIconLogin(){
        onClick(iconLogin());
    }

    @Step
    public boolean onLoginPage(){
        return waitUntilVisible(loginPage()).isDisplayed();
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
