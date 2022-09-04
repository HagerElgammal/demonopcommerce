package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P03_homePage {

    public WebElement CurrencyPOM()
    {
        By Currency = By.id("customerCurrency");
        WebElement CurrencyEle = driver.findElement(Currency);
        return CurrencyEle;
    }


}
