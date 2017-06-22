package com.wt.selenium;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by wt on 2016/10/10.
 */
public class testInjectJQuery {
    static WebDriver driver;
    static JavascriptExecutor jse;
    @BeforeClass
    public static void setup(){
//        System.setProperty("webdriver.chrome.driver","D:\\00MyResource\\08java\\chromedriver.exe");
//        driver = new ChromeDriver();
        System.setProperty("webdriver.firefox.marionette","D:\\00MyResource\\08java\\geckodriver.exe");
        driver = new FirefoxDriver();
        jse = (JavascriptExecutor)driver;
    }
    @AfterClass
    public static void tearDown(){
        driver.close();
        driver.quit();
    }
    @Test
    public void testBaidu(){
        driver.get("https://www.baidu.com/");
        injectjQueryNeeded();
        List<WebElement> elements = (List<WebElement>)jse.executeScript("return jQuery.find('a.mnav')");
        Assert.assertEquals(6,elements.size());
        Assert.assertEquals("糯米",elements.get(0).getAttribute("textContent"));
    }
    public void injectjQueryNeeded(){
        if(!jQueryLoaded()){
            injectJquery();
        }
    }
    public Boolean jQueryLoaded(){
        Boolean loaded = true;
        try{
            loaded = (Boolean)jse.executeScript("return jQuery()!=null");
        }catch (WebDriverException e){
            loaded = false;
        }
        return loaded;
    }
    public void injectJquery(){
        jse.executeScript(
                "var headID = document.getElementsByTagName(\"head\")[0];"+
                "var newScript = document.createElement('script');" +
                "newScript.type = 'text/javascript';" +
                "newScript.src = 'https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js';" +
                "headID.appendChild(newScript);"
        );
    }

}
