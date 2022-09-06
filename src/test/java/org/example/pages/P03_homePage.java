package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P03_homePage {
// currencies POM pattern
    public WebElement CurrencyPOM() {
        By Currency = By.id("customerCurrency");
        WebElement CurrencyEle = driver.findElement(Currency);
        return CurrencyEle;
    }

    // currencies POM pattern
    public int productInEuro() {
        int size = driver.findElements(By.cssSelector("div[class=\"prices\"]")).size();
        System.out.println("No. Of Product with Euro currency are : " + size);
        return size;
    }
    // currencies POM pattern
     public String productValue() {
         int i;
         int size = driver.findElements(By.cssSelector("div[class=\"prices\"]")).size();
         String text = null;
         for (i = 0; i < size; i++) {
             text = driver.findElements(By.cssSelector("div[class=\"prices\"]")).get(i).getText();

             System.out.println(text);

         }
         return text;
     }
}