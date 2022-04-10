package starter.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @And("i click login button in bookstore page")
    public void clickLoginButtonInBookstore(){
        loginPage.clickLoginButtonOnBookstore();
    }

    @Given("i am on the login page")
    public void onLoginPage(){
        loginPage.validationOnLoginPage();
    }

    @When("i input valid username")
    public void inputValidUsername(){
        loginPage.inputUsername("dedebb");
    }

    @And("i input valid password")
    public void inputValidPassword(){
        loginPage.inputPassword("Password!2");
    }

    @And("i click login button")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Then("i success login")
    public void successLogin(){
        loginPage.validationAfterLogin();
    }
}
