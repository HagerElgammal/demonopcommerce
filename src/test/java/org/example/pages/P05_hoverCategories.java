package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P05_hoverCategories {




    public List<WebElement> mainCategoryP() {

        List<WebElement> main = driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
        return main;
    }

    public WebElement pageTitle(){
        By title = By.cssSelector("div[class=\"page-title\"]");
        return driver.findElement(title);
    }
    public WebElement categoryName(){
        By name = By.cssSelector("[itemprop=\"itemListElement\"]");
        WebElement categoryNameEle = driver.findElement(name);
        return categoryNameEle;
    }


}
