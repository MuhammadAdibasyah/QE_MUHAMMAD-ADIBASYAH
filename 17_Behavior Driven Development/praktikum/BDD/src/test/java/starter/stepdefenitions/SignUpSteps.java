package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import singUp.SignUp;

public class SignUpSteps {
    @Steps
   SignUp SignUp;

    @Given("I am on the sign up page")
    public void onTheSignUpPage(){
        SignUp.onTheSignUpPage();

    }
    @When("I enter my email and password")
    public void enterUsernameAndPassword(){
        SignUp.enterUsernameAndPassword();

    }
    @And("I click agree and join button")
    public void clickAgreeButton(){
        SignUp.clickAgreeButton();

    }
    @Then("I am on create profile")
    public void onCreateProfile(){
        SignUp.onCreateProfile();

    }
    @When("I click continue with google button")
    public void continueWithGoogle(){
        SignUp.continueWithGoogle();

    }
    @And("I choose my google account")
    public void chooseGoogleAccount(){
        SignUp.chooseGoogleAccount();

    }
    @When("I enter phone number or email valid")
    public void enterPhnoeNumberOrEmailValid(){
        SignUp.enterPhnoeNumberOrEmailValid();

    }
    @And("I enter a password that doesn't match the criteria")
    public void enterPasswordDoesNotMatchTheCriteria(){
        SignUp.enterPasswordDoesNotMatchTheCriteria();

    }
    @Then("I am fail to trying sign up")
    public void failToSignUp(){
        SignUp.failToSignUp();

    }
    @When("I enter phone number invalid and valid password")
    public void enterNumberInvalidAndValidPassword(){
        SignUp.enterNumberInvalidAndValidPassword();

    }
    @When("I enter invalid email and valid password")
    public void enterInvalidEmailAndValidPassword(){
        SignUp.enterNumberInvalidAndValidPassword();

    }
}
