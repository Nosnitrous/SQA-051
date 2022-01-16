package com.luxoft.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends CommonPage{
    public WebDriver wd;

    public MainPage(WebDriver wd) {
        this.wd = wd;
    }

    public WebElement getElement(String name) {
        WebElement obj;
        obj=null;
        try {
            switch (name.toLowerCase()) {
                case "username":
                    obj = wd.findElement(By.id("username"));
                    break;
                case "password":
                    obj = wd.findElement(By.name("password"));
                    break;
                case "login":
                    obj = wd.findElement(By.xpath("//button"));
                    break;
                case "logout":
                    obj = wd.findElement(By.cssSelector(".icon-signout"));
                    break;
           }
            return obj;
        }catch (NoSuchElementException e){
            Assertions.fail("Element "+name+" not found on this page");
            return null;
        }
    }


//    @FindBy(id = "username")
//    WebElement username;
//
//    @FindBy(name = "password")
//    WebElement password;
}
