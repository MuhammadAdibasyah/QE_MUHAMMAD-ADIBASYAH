package singUp;

import net.thucydides.core.annotations.Step;

public class SignUp {
    @Step("I am on the signUp page")
    public void onTheSignUpPage(){
        System.out.println("on the sign up page");

    }
    @Step("I enter my email and password")
    public void enterUsernameAndPassword(){
        System.out.println("enter email and password");

    }
    @Step("I click agree and join button")
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
    @Step("I enter phone number or email valid")
    public void enterPhnoeNumberOrEmailValid(){
        System.out.println("enter phone number or email valid");

    }
    @Step("I enter a password that doesn't match the criteria")
    public void enterPasswordDoesNotMatchTheCriteria(){
        System.out.println("enter a password that doesn't match the criteria");

    }
    @Step("I am fail to trying sign up")
    public void failToSignUp(){
        System.out.println("fail to trying sign up");

    }
    @Step("I enter phone number invalid and valid password")
    public void enterNumberInvalidAndValidPassword(){
        System.out.println("enter phone number invalid and valid password");

    }
    @Step("I enter invalid email and valid password")
    public void enterInvalidEmailAndValidPassword(){
        System.out.println("I enter invalid email and valid password");
    }
}
