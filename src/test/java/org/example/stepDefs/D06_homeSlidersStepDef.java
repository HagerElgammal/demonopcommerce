package org.example.stepDefs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_homeSliders;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.example.stepDefs.Hooks.driver;

public class D06_homeSlidersStepDef {

    P06_homeSliders homeSlider = new P06_homeSliders();

    @When("user clicks on first slider")
    public void firstSliderClick()  {
        homeSlider.slider1Button().click();
        homeSlider.slider().click();


        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @When("user clicks on second slider")
    public void secondSliderClick() {
        homeSlider.slider2Button().click();
        homeSlider.slider().click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("user directed successfully to the product page of the clicked first slider")
    public void productPage1() {

        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://demo.nopcommerce.com/iphone-6";
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains(expectedResult));


    }

    @Then("user directed successfully to the product page of the clicked second slider")
    public void productPage2() {

        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://demo.nopcommerce.com/nokia-lumia-1020";
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
