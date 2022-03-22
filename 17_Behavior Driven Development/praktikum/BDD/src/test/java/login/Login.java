package login;

import net.thucydides.core.annotations.Step;

public class Login {
    @Step("I am on the login page")
    public void onTheLoginPage(){
        System.out.println("I am on the login page");

    }
    @Step("I enter my valid username and password")
    public void enterUsernameAndPassword(){
        System.out.println("I enter my valid username and password");

    }
    @Step("I click login button")
    public void clickLoginButton(){
        System.out.println("I click login button");

    }
    @Step("I am on the home page")
    public void onTheHomrPage(){
        System.out.println("I am on the home page");

    }
}
