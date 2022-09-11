package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_FollowUs;
import org.testng.Assert;
import static org.example.stepDefs.Hooks.driver;

public class D07_FollowUsDef {
    P07_FollowUs followUs = new P07_FollowUs();

    @When("user opens facebook link")
    public void facebookLink() throws InterruptedException {
        followUs.facebookButton().click();
        driver.switchTo().window(followUs.tabsOpen().get(1));
        Thread.sleep(2000);
    }


    @When("user opens twitter link")
    public void twitterLink() throws InterruptedException {
        followUs.twitterButton().click();
        driver.switchTo().window(followUs.tabsOpen().get(1));
        Thread.sleep(2000);
    }

    @When("user opens rss link")
    public void rssLink() throws InterruptedException {
        followUs.rssButton().click();
        driver.switchTo().window(followUs.tabsOpen().get(1));
        Thread.sleep(2000);
    }

    @When("user opens youtube link")
    public void youtubeLink() throws InterruptedException {
        followUs.youtubeButton().click();
        driver.switchTo().window(followUs.tabsOpen().get(1));
        Thread.sleep(2000);
    }


    @Then("{string} is opened in new tab")
    public void pageInNewTab(String arg0) {

        String actualResult = driver.getCurrentUrl();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains(arg0));
        driver.close();
        driver.switchTo().window(followUs.tabsOpen().get(0));

    }
}
