package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static org.example.stepDefs.Hooks.driver;

public class P04_search {

    public  List<WebElement> searchTitle() {
        List <WebElement> searchTitle = driver.findElements(By.className("product-title"));
        return searchTitle;
    }

    public WebElement searchPOM() {
        By search = By.cssSelector("[id =\"small-searchterms\"]");
        return driver.findElement(search);
    }

    public WebElement searchBtnPOM() {
        By searchBtn = By.cssSelector("[type=\"submit\"]");
        WebElement searchBtnEle = driver.findElement(searchBtn);
        return searchBtnEle;
    }

    public WebElement productClickPOM(){
        By productClick = By.className("picture");
        WebElement productClickEle = driver.findElement(productClick);

        return productClickEle;}

    public WebElement productSkuPOM(){
        By productSku = By.className("sku");
        WebElement productSkuEle = driver.findElement(productSku);
        return productSkuEle;
    }
}




