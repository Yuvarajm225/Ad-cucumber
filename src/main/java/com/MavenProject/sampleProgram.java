package com.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampleProgram {
	public static WebDriver driver;
	public static void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.digitalwaffle.co/users/login");
		WebElement uname = driver.findElement(By.id("email"));
		uname.sendKeys("pushuv143@gmail.com");
		WebElement pswrd = driver.findElement(By.id("password"));
		pswrd.sendKeys("Yuvaa@2225");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		}
	public static void main(String[] args) {
		LaunchBrowser();
		
	}

}
