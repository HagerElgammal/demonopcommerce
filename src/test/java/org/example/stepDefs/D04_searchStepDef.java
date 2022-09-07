package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;


public class D04_searchStepDef {

    P03_homePage homePage = new P03_homePage();
    @Given("user search for {string}")
   public void searchProduct(String product) {homePage.searchPOM().sendKeys(product);}

    @When("user clicks on search button")
    public void searchBtn(){homePage.searchBtnPOM().click();}

    @Then("user go to search page")
    public void searchPage(){
        SoftAssert soft = new SoftAssert();
        String expectedResult = "https://demo.nopcommerce.com/search?q=laptop";
        String  actualResult = driver.getCurrentUrl();
        soft.assertTrue(actualResult.contains(expectedResult),"First Assertion");
        soft.assertAll();
    }

    @And("user search shows the result")
    public void countResult(){
        SoftAssert soft = new SoftAssert();
        String actualResult = String.valueOf(homePage. productFound());
        String expectedResult = "2";
        soft.assertTrue(actualResult.contains(expectedResult));
        soft.assertAll();

    }

    @And("user found correct name of search in search result")
    public void confirmName(){

        SoftAssert soft = new SoftAssert();
        String actualResult = String.valueOf(homePage.productName());
        soft.assertTrue(actualResult.toLowerCase().contains("laptop"));
        soft.assertAll();
    }

    @And("user find the product")
    public void showProduct(){}

    @And("user clicks on product name")
    public void clickProduct(){}

    @And ("user match the search sku successfully")
    public void matchSku(){}

}

