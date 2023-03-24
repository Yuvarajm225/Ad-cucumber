package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parellelTest {
	public WebDriver driver;	
    @Test
   
 	public void ChromeTest() { 
   	WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
 	}
    @Test
    public void edgeBrowser() {
    WebDriverManager.edgedriver().setup();
    driver = new EdgeDriver();
    driver.get("https://www.facebook.com/");
    }

}
