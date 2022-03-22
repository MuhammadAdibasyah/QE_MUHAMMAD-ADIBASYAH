package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import singUp.SignUp;

public class SingUpSteps {
    @Steps
    SignUp SignUp;

    @Given("I am on the sign up page")
    public void onTheSingUpPage(){
        SignUp.onTheSingUpPage();

    }
    @When("I enter my email and password")
    public void enterUsernameAndPassword(){
        SignUp.enterUsernameAndPassword();

    }
    @And("I click agree & join button")
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
}
