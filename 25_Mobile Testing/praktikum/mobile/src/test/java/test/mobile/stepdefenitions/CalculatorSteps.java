package test.mobile.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.mobile.pages.CalculatorPage;

public class CalculatorSteps {
    @Steps
    CalculatorPage calculatorPage;

    protected static Integer firstNumber;
    protected static Integer secondNumber;
    protected static Integer result;

    //scenario 1
    @Given("user on calculator page")
    public void onCalculatorPage(){
        Assert.assertTrue(calculatorPage.onCalculatorPage());
    }

    @When("user choose first number {int}")
    public void userChooseFirstNumber(int number) {
        calculatorPage.tapNumber(number);
        firstNumber=number;
    }

    @And("user tap sign {string}")
    public void userTapSign(String sign) {
        calculatorPage.tapSign(sign);
    }

    @And("user choose second number {int}")
    public void userChooseSecondNumber(int number) {
        calculatorPage.tapNumber(number);
        secondNumber=number;
    }

    @Then("user see the result sum")
    public void userSeeTheResultSum() {
        result=firstNumber+secondNumber;
        System.out.println(result);
    }

    @Then("user see the result multiplied")
    public void userSeeTheResultMultiplied() {
        result=firstNumber*secondNumber;
        System.out.println(result);
    }

    @Then("user see the result divided")
    public void userSeeTheResultDivided() {
        result=(firstNumber)/(secondNumber);
        System.out.println(result);

    }

    @Then("user see the result minus")
    public void userSeeTheResultMinus() {
        result=firstNumber-secondNumber;
        System.out.println(result);
    }
}
