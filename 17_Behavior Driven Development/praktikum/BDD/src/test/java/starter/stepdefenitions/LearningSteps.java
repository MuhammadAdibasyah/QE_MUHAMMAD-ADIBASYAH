package starter.stepdefenitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import learning.Learning;
import net.thucydides.core.annotations.Steps;

public class LearningSteps {
    @Steps
    Learning Learnig;

    @When("I click learning button")
    public void clickLearningButton(){
        Learnig.clickLearningButton();

    }
    @Then("I can see many existing learn")
    public void seeExistingLearn(){
        Learnig.seeExistingLearn();

    }
}
