package org.example.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.stepDefs.Hooks.driver;

public class P01_Register {


    public WebElement registerLink()
    {
        return driver.findElement(By.className("ico-register"));
    }

   public WebElement selectGenderPOM()
   {
       By gender = By.id("gender-female");
       return driver.findElement(gender);

   }

    public void P01_RegisterSteps(String firstname, String lastname)
    {
        //Enter firstname using POM

        firstNamePOM().sendKeys(firstname);

        //Enter lastname using POM
        lastNamePOM().sendKeys(lastname);
    }


    public WebElement firstNamePOM()
    {
        By firstname = By.id("FirstName");
        return driver.findElement(firstname);
    }

    public WebElement lastNamePOM()
    {
        By lastname = By.id("LastName");
        return driver.findElement(lastname);
    }

    public WebElement dateOfBirthDayPOM()
    {
        By dateOfBirthDay = By.name("DateOfBirthDay");
        return driver.findElement(dateOfBirthDay);
    }
        public WebElement dateOfBirthMonthPOM()
    {
        By dateOfBirthMonth = By.name("DateOfBirthMonth");
        return driver.findElement(dateOfBirthMonth);
    }
    public WebElement dateOfBirthYearPOM()
    {
        By dateOfBirthYear = By.name("DateOfBirthYear");
        return driver.findElement(dateOfBirthYear);
    }
    public WebElement emailPOM()
    {
        By email = By.id("Email");
        return driver.findElement(email);
    }

    public WebElement passwordPOM()
    {
        By password = By.id("Password");
        return driver.findElement(password);
    }

    public WebElement confirmPasswordPOM()
    {
        By confirmPassword = By.id("ConfirmPassword");
        return driver.findElement(confirmPassword);
    }

    public WebElement registerButtonPOM()
    {
        By registerButton = By.id("register-button");
        return driver.findElement(registerButton);
    }

    public WebElement successMessagePom()
    {
        By successMessage = By.className("result");
        return driver.findElement(successMessage);
    }




}
