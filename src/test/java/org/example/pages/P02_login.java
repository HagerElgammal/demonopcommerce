package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static org.example.stepDefs.Hooks.driver;

public class P02_login {


    public WebElement loginLink()
    {
        return driver.findElement(By.className("ico-login"));

    }

    public WebElement emailPOM()
    {
        By email = By.id("Email");
        return driver.findElement(email);
    }

    public WebElement passwordPOM()
    {
        By password = By.id("Password");
        WebElement passwordEle = driver.findElement(password);
        return passwordEle ;
    }
    public void LoginSteps(String email, String password)

    {

        emailPOM().sendKeys(email);


        passwordPOM().sendKeys(password);
    }

    public WebElement loginButtonPOM()
    {
        By loginButton = By.cssSelector("div > button[type=\"submit\"]");
        WebElement loginButtonEle = driver.findElement(loginButton);
       return loginButtonEle;
    }

    public WebElement failMessagePOM()
    {
        By failMessage = By.className("message-error");
        WebElement failMessageEle = driver.findElement(failMessage);
        return failMessageEle;
    }

    public WebElement myAccountPOM()
    {
        By myAccount = By.className("ico-account");
        WebElement myAccountEle = driver.findElement(myAccount);
        return myAccountEle;
    }



}
