package starter.stepdefenitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jobs.Jobs;
import net.thucydides.core.annotations.Steps;

public class JobsSteps {
    @Steps
    Jobs Jobs;

    @When("I click jobs button")
    public void clickJobsButton(){
        Jobs.clickJobsButton();

    }
    @Then("I can see many jobs existing")
    public void seeManyJobs(){
        Jobs.seeManyJobs();

    }
}
