package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    //element
    private By buttonLoginOnBookstore(){
        return By.xpath("//button[@id='login']");
    }
    private By loginButton(){
        return By.id("login");
    }

    private By formLogin(){
        return By.id("userForm");
    }

    private By usernameField(){
        return By.xpath("//input[@id='userName']");
    }

    private By passwordField(){
        return By.xpath("//input[@id='password']");
    }

    private By classLogin(){
        return By.id("submit");
    }

    private By errorMessage(){
        return By.xpath("(//div[@class='mt-4 row'])");
    }

    private By getMessage(){
        return By.id("userForm");
    }

    private By ads(){
        return By.className("cbb pea");
    }

    //function
    @Step
    public void clickLoginButtonOnBookstore(){
        $(buttonLoginOnBookstore()).click();
    }

    @Step
    public void closeAds(){
        $(ads()).click();
    }

    @Step
    public boolean validationOnLoginPage(){
        return $(formLogin()).isDisplayed();
    }

    @Step
    public void inputUsername(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

    @Step
    public boolean validationAfterLogin(){
        return $(classLogin()).isDisplayed();
    }

    @Step
    public void inputInvalidPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public boolean appearErrorMessage(){
        return $(errorMessage()).isDisplayed();
    }

    @Step
    public boolean getErrorMessage(){
        return $(getMessage()).isDisplayed();
    }
}
