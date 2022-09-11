package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P08_Wishlist;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;
import static org.example.stepDefs.Hooks.driver;

public class D08_WishListDef {
    P08_Wishlist wishlist = new P08_Wishlist();

    @When("user clicks on wishlist button on a product")
    public void wishButton(){
        wishlist.wishButton().click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @Then("success message will display")
    public void successMessage() {
        SoftAssert soft = new SoftAssert();

        String actualResult = wishlist.messageWish().getText();
        String expectedResult = "The product has been added to your wishlist";
        System.out.println("THe Message is:" + actualResult);

        soft.assertTrue(actualResult.contains(expectedResult));
        String actualBColor = wishlist.messageBackground().getCssValue("background-color");
        String expectedBColor = "rgba(75, 176, 122, 1)";
        System.out.println(" The color of this message is green "+ actualBColor);
        soft.assertEquals(actualBColor.contains(expectedBColor),true);
        soft.assertAll();
    }

    @Then("user clicks on wishlist Tab on the top of the page")
    public void clWishlistTab() {
        wishlist.wishTabButton().click();
    }

    @And("user find the product in the wishlist")
    public void findProInWlist() {

        String proCount = wishlist.wishCount().getAttribute("value");
        System.out.println("No: " +proCount);
        int x = 0 ;
        int y = Integer.parseInt(proCount);

        Assert.assertTrue(x<y,"Qty is bigger than Zero");

    }

}
