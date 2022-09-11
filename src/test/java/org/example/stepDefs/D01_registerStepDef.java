package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;

import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_Register register = new P01_Register();

    @Given("user go to register page")
    public void registerPage()
    {
        register.registerLink().click();
    }

    @When ("user select gender type")
    public void selectGender()
    {
        register.selectGenderPOM().click();

    }
    @And("user enter firstname {string} and lastname {string}")
    public void validData(String arg0,String arg1)
    {
        register.P01_RegisterSteps(arg0,arg1);
    }

    @And("user enter date of birth")
    public void birthDate()
    {
        Select day = new Select(register.dateOfBirthDayPOM());
        day.selectByIndex(14);
        Select month = new Select(register.dateOfBirthMonthPOM());;
        month.selectByValue("5");
        Select year = new Select(register.dateOfBirthYearPOM());
        year.selectByVisibleText("1987");

    }

    @And("user enter email {string} field")
    public void userEmail(String email)
    {
        register.emailPOM().sendKeys(email);
    }

    @And("user fills password fields {string}")
    public void userPassword(String password)
    {
        register.passwordPOM().sendKeys(password);
        register.confirmPasswordPOM().sendKeys(password);
    }

    @Then("user clicks on register button")
    public void registerButton()
    {
        register.registerButtonPOM().click();
    }

    @And ("success message is displayed")
    public void successRegister()
    {
        SoftAssert soft = new SoftAssert();

        String actualColor = register.successMessagePom().getCssValue("color");
        String expectedColor = "rgba(76, 177, 124, 1)";
        System.out.println(" The color of this message is green "+ actualColor);

        String expectedResult = "Your registration completed";
        String actualResult =register.successMessagePom().getText();
        System.out.println("THe Message is:" + actualResult);
        soft.assertTrue(actualResult.contains(expectedResult));
        soft.assertEquals(actualColor.contains(expectedColor),true);

        soft.assertAll();

    }



}
