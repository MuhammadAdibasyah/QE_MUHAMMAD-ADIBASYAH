package jobs;

import net.thucydides.core.annotations.Step;

public class Jobs {
    @Step("I click jobs button")
    public void clickJobsButton(){
        System.out.println("click jobs button");

    }
    @Step("I can see many jobs existing")
    public void seeManyJobs(){
        System.out.println("I can see many jobs existing");

    }
}
