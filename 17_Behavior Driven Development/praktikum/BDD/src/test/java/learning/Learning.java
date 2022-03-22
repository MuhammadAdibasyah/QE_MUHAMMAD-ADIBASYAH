package learning;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class Learning {
    @Step("I click learning button")
    public void clickLearningButton(){
        System.out.println("I click learning button");

    }
    @Step("I can see many existing learn")
    public void seeExistingLearn(){
        System.out.println("see many existing learn");

    }
}
