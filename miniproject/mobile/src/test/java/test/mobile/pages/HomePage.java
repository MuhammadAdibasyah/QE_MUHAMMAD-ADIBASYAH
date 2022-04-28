package test.mobile.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.mobile.pageobject.BasePageObject;

public class HomePage extends BasePageObject {
    private By homePage(){
        return MobileBy.id("recyclerViewUsers");
    }

//    private By homepageDisplay(){
//        return By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.TextView[2]");
//    }

    @Step
    public boolean onHomepage(){
        return waitUntilVisible(homePage()).isDisplayed();
    }
}
