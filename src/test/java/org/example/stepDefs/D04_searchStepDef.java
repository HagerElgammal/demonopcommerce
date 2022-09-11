package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_search;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class D04_searchStepDef {

    P04_search search = new P04_search();

    @When("user clicks on search field")
    public void searchField() {
        search.searchPOM().click();

    }
    @And("user search with {string}")
    public void search (String arg0)  {
        search.searchPOM().sendKeys(arg0);
        search.searchBtnPOM().click();  }
    @Then("user search find {string} relative results")
    public void searchResults(String arg1)  {

        for (int x = 0; x < search.searchTitle().size(); x++) {
            String value = search.searchTitle().get(x).getText();

            System.out.println(value);
            Assert.assertTrue(value.toLowerCase().contains(arg1));


        }
    }
    @Then("user search finds {string} relative results")
    public void searchSku(String arg2) {
        SoftAssert soft = new SoftAssert();

        for (int x = 0; x < search.searchTitle().size(); x++) {
            String sku = search.searchTitle().get(x).getText();
            String y = String.valueOf(search.searchTitle().size());
            String expectedSize = "1";
            System.out.println(y);
            soft.assertEquals(y.contains(expectedSize),true);

            search.productClickPOM().click();
            String actualSku =search.productSkuPOM().getText();
            String expectedSku = arg2 ;
            System.out.println(actualSku);
            soft.assertEquals(actualSku.contains(expectedSku),true);
            soft.assertAll();


        }
    }



}



