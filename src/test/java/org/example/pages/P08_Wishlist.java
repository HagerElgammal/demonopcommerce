package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P08_Wishlist {

    public WebElement wishButton()
    {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
    }

    public WebElement messageWish()
    {
        return driver.findElement(By.className("content"));
    }
    public WebElement messageBackground()
    {
        return driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div"));
    }

    public WebElement wishTabButton()
    {
        return driver.findElement(By.className("wishlist-label"));
    }
    public WebElement wishCount()
    {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[6]/input"));
    }

}

