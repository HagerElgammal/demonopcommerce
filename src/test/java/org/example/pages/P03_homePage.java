package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Locale;

import static org.example.stepDefs.Hooks.driver;

public class P03_homePage {

    // currencies POM pattern
    public WebElement CurrencyPOM() {
        By Currency = By.id("customerCurrency");
        WebElement CurrencyEle = driver.findElement(Currency);
        return CurrencyEle;
    }

    // currencies and search POM pattern
    public int productFound() {
        int size = driver.findElements(By.className("product-title")).size();
        System.out.println("No. Of Product in search result  : " + size);
        return size;
    }

    // currencies POM pattern
    public String productValue(String text) {
        int i;
        int size = driver.findElements(By.cssSelector("div[class=\"prices\"]")).size();
        text = null;
        for (i = 0; i < size; i++) {
            text = driver.findElements(By.cssSelector("div[class=\"prices\"]")).get(i).getText();
            System.out.println(text);
        }
        return text;
    }

    //search POM pattern

    public WebElement searchPOM() {
        By search = By.id("small-searchterms");
        WebElement searchEle = driver.findElement(search);
        return searchEle;
    }

    //search POM pattern
    public WebElement searchBtnPOM() {
        By searchBtn = By.cssSelector("[type=\"submit\"]");
        WebElement searchBtnEle = driver.findElement(searchBtn);
        return searchBtnEle;
    }

    //search POM pattern
    public String productName( ) {
        int i;
        int size = driver.findElements(By.className("product-title")).size();
        String text = null;
        for (i = 0; i < size; i++) {
            text = driver.findElements(By.className("product-title")).get(i).getText();
            System.out.println(text);

        }
        return text;
    }
}




