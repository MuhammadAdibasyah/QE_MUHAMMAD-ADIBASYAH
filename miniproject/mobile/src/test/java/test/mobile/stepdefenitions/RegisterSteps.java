package test.mobile.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.mobile.pages.RegisterPage;

import java.util.Random;

public class RegisterSteps {
    @Steps
    RegisterPage registerPage;

    @When("android user click to register")
    public void userClickToRegister(){
        registerPage.clickToRegister();
    }

    @And("user input name")
    public void userInputName() {
        registerPage.inputName("ucup");
    }

    @And("user input email")
    public void userInputEmail() {
        Random rand = new Random();
        int number = rand.nextInt(10000);
        registerPage.inputEmail("user"+String.valueOf(number)+"@gmail.com");
    }

    @And("user input password")
    public void userInputPassword() {
        registerPage.inputPassword("Password!2");
    }

    @And("user click login button")
    public void userClickLoginButton() {
        registerPage.clickRegisterButton();
    }

    @Then("user back to homepage")
    public void userBackToHomepage() {
    }
}
