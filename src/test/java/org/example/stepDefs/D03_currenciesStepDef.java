package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.example.stepDefs.Hooks.driver;

public class D03_currenciesStepDef {

    P03_homePage homePage = new P03_homePage();



    @Given("user select Euro from list on the top of home page")
    public void dynamicSelectEuro() throws InterruptedException {
        WebElement list = homePage.CurrencyPOM();
        Select customerCurrency = new Select(list);
        customerCurrency.selectByVisibleText("Euro");
    }

    @Then("featured  product 1 will be in Euro currency")
    public void product1(){}

    @And("featured  product 2 will be in Euro currency")
    public void product2(){}

    @And("featured  product 3 will be in Euro currency")
    public void product3(){}

    @And("featured  product 4 will be in Euro currency")
    public void product4(){}

}
