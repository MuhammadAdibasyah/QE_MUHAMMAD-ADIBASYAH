package singUp;

import net.thucydides.core.annotations.Step;

public class SignUp {
    @Step("I am on the login page")
    public void onTheSingUpPage(){
        System.out.println("on the login page");

    }
    @Step("I enter my email and password")
    public void enterUsernameAndPassword(){
        System.out.println("enter email and password");

    }
    @Step("I click agree & join button")
    public void clickAgreeButton(){
        System.out.println("click agree & join button");

    }
    @Step("I am on create profile")
    public void onCreateProfile(){
        System.out.println("on create profile");

    }
    @Step("I click continue with google button")
    public void continueWithGoogle(){
        System.out.println("continue with google");

    }
    @Step("I choose my google account")
    public void chooseGoogleAccount(){
        System.out.println("Choose google account");
    }
}
