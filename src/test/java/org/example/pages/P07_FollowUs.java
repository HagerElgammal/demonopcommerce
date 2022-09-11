package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

import static org.example.stepDefs.Hooks.driver;

public class P07_FollowUs {

public WebElement facebookButton()
{
    By fbButton = By.className("facebook");
    return  driver.findElement(fbButton);

}
    public WebElement twitterButton()
    {
        By twButton = By.className("twitter");
        return  driver.findElement(twButton);
    }
    public WebElement rssButton()
    {
        By rssButton = By.className("rss");
        return  driver.findElement(rssButton);
    }
    public WebElement youtubeButton()
    {
        By youtubeButton = By.className("youtube");
        return  driver.findElement(youtubeButton);
    }

    public ArrayList<String>  tabsOpen() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        return tabs;
    }
}
