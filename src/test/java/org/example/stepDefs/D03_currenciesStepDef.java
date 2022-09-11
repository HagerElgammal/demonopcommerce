package org.example.stepDefs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_currencies;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class D03_currenciesStepDef {

    P03_currencies currencies = new P03_currencies();

    @When("user select Euro from list on the top of home page")
    public void dynamicSelectEuro() {

        WebElement currency_List = currencies.currencyPOM();
        Select select = new Select(currency_List);
        select.selectByVisibleText("Euro");

    }

    @Then("featured 4 products will be displayed in Euro currency")
    public void productDisplayEuroPrices (){


       for(int x = 0; x<currencies.prices().size(); x++) {
           String value = currencies.prices().get(x).getText();


           String actualResult =currencies.prices().get(x).getText();
           String expectedResult = "€";
           System.out.println(actualResult);
           Assert.assertTrue(actualResult.contains(expectedResult));

       }

    }


}
