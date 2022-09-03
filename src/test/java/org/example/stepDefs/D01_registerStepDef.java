package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;

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
    @And("user enter firstname \"automation\" and lastname \"tester\"")
    public void validData()
    {
        register.P01_RegisterSteps("automation","tester");
    }

    @And("user enter date of birth")
    public void birthDate()
    {
        register.dateOfBirthDayPOM().sendKeys("14");
        register.dateOfBirthMonthPOM().sendKeys("May");
        register.dateOfBirthYearPOM().sendKeys("1987");
    }

    @And("user enter email \"test@example.com\" field")
    public void userEmail()
    {
        register.emailPOM().sendKeys("test@example.com");
    }

    @And("user fills password fields \"P@ssw0rd\" \"P@ssw0rd\"")
    public void userPassword()
    {
        register.passwordPOM().sendKeys("P@ssw0rd");
        register.confirmPasswordPOM().sendKeys("P@ssw0rd");
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

        //First Assertion
        System.out.println("First Assertion");
        soft.assertTrue(actualResult.contains(expectedResult),"First Assertion");

        //Second Assertion
        System.out.println("Second Assertion");
        soft.assertEquals(actualColor.contains(expectedColor),true,"Second Assertion");
        // Assert All
        soft.assertAll();

    }



}
