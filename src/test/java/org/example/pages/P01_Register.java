package org.example.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.stepDefs.Hooks.driver;

public class P01_Register {


    public WebElement registerLink()
    {
        WebElement reg = driver.findElement(By.className("ico-register"));
        return reg;
    }

   public WebElement selectGenderPOM()
   {
       By gender = By.id("gender-female");
       WebElement genderEle = driver.findElement(gender);
       return genderEle;

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
        WebElement firstnameEle = driver.findElement(firstname);
        return firstnameEle;
    }

    public WebElement lastNamePOM()
    {
        By lastname = By.id("LastName");
        WebElement lastnameEle = driver.findElement(lastname);
        return lastnameEle;
    }

    public WebElement dateOfBirthDayPOM()
    {
        By dateOfBirthDay = By.name("DateOfBirthDay");
        WebElement dateOfBirthDayEle = driver.findElement(dateOfBirthDay);
        return dateOfBirthDayEle;
    }
        public WebElement dateOfBirthMonthPOM()
    {
        By dateOfBirthMonth = By.name("DateOfBirthMonth");
        WebElement dateOfBirthMonthEle = driver.findElement(dateOfBirthMonth);
        return dateOfBirthMonthEle;
    }
    public WebElement dateOfBirthYearPOM()
    {
        By dateOfBirthYear = By.name("DateOfBirthYear");
        WebElement dateOfBirthYearEle = driver.findElement(dateOfBirthYear);
        return dateOfBirthYearEle;
    }
    public WebElement emailPOM()
    {
        By email = By.id("Email");
        WebElement emailEle = driver.findElement(email);
        return emailEle;
    }

    public WebElement passwordPOM()
    {
        By password = By.id("Password");
        WebElement passwordEle = driver.findElement(password);
        return passwordEle;
    }

    public WebElement confirmPasswordPOM()
    {
        By confirmPassword = By.id("ConfirmPassword");
        WebElement confirmPasswordEle = driver.findElement(confirmPassword);
        return confirmPasswordEle;
    }

    public WebElement registerButtonPOM()
    {
        By registerButton = By.id("register-button");
        WebElement registerButtonEle = driver.findElement(registerButton);
        return registerButtonEle;
    }

    public WebElement successMessagePom()
    {
        By successMessage = By.className("result");
        WebElement successMessageEle = driver.findElement(successMessage);
        return successMessageEle;
    }




}
