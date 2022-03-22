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
    @Step("I enter invalid username and valid password")
    public void enterInvalidUsernameAndValidPassword(){
        System.out.println("enter invalid usernam and valid password");

    }
    @Step("I am fail to login")
    public void failToLogin(){
        System.out.println("fail to login");

    }
    @Step("I get a notifications")
    public void getNotifications(){
        System.out.println("get notifications");

    }
    @Step("I enter valid username and invalid password")
    public void enterValidUsernameAndInvalidPassword(){
        System.out.println("enter valid username and invalid password");
    }
    @Step("I enter invalid username and password")
    public void enterInvalidUsernameAndPassword(){
        System.out.println("enter invalid username and password");
    }
}
