package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class D03_currenciesStepDef {

    P03_homePage homePage = new P03_homePage();



    @Given("user select Euro from list on the top of home page")
    public void dynamicSelectEuro() {
        WebElement list = homePage.CurrencyPOM();
        Select customerCurrency = new Select(list);
        customerCurrency.selectByVisibleText("Euro");

    }

    @Then("featured 4 products  will be in Euro currency")
    public void product(){
        String actualResult = String.valueOf(homePage.productInEuro());
        String expectedResult = "4";
        Assert.assertEquals(actualResult.contains(expectedResult),true);
        Assert.assertTrue(actualResult.contains(expectedResult));

    }
    @And("user print the value of 4 product")
    public void printProduct(){
        homePage.productValue();


    }

}
