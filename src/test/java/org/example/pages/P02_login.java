package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class P02_login {


    public WebElement loginLink()
    {
        WebElement log = driver.findElement(By.className("ico-login"));
        return log;

    }

    public WebElement emailPOM()
    {
        By email = By.id("Email");
        WebElement emailEle = driver.findElement(email);
        return emailEle ;
    }

    public WebElement passwordPOM()
    {
        By password = By.id("Password");
        WebElement passwordEle = driver.findElement(password);
        return passwordEle ;
    }
    public void LoginSteps(String email, String password)

    {
        //Enter Email using POM
        emailPOM().sendKeys(email);

        //Enter password using POM
        passwordPOM().sendKeys(password);
    }

    public WebElement loginButtonPOM()
    {
        By loginButton = By.cssSelector("div > button[type=\"submit\"]");
        WebElement loginButtonEle = driver.findElement(loginButton);
       return loginButtonEle;
    }

}
