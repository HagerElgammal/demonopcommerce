package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P03_currencies {


   public WebElement currencyPOM() {
    By currency = By.id("customerCurrency");
       return driver.findElement(currency);}

    public List<WebElement> prices() {
        return driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));

    }

}
