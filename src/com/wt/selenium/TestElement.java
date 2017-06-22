package com.wt.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by wt on 2016/10/8.
 */
public class TestElement {

    WebDriver driver ;
    @Before
    public void init(){
        System.setProperty("webdriver.firefox.marionette","D:\\00MyResource\\08java\\geckodriver.exe");
        driver = new FirefoxDriver();
    }
    @After
    public void close(){
        driver.close();
    }
    @Test
    public void testId() {

        driver.get("https://www.baidu.com/");
        WebElement findElement = driver.findElement(By.id("su"));
        Assert.assertEquals("糯米",findElement.getAttribute("value"));
        //WebElement searchBox = driver.findElement(By.id("kw"));
       // searchBox.sendKeys("test Baidu By id");
      //  WebElement searchButton = driver.findElement(By.id("su"));
        //searchButton.submit();
    }
    @Test
    public void testJquery(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        driver.get("https://jquery.org/");
        List<WebElement> elements =
                (List<WebElement>)jse.executeScript("return jQuery.find('.menu-item')");
        Assert.assertEquals(11,elements.size());
        Assert.assertEquals("Join",elements.get(2).getText());
    }


}
