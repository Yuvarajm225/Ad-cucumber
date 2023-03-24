package com.AdactintestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class adactinLogin {
	
	public static WebDriver driver;
	@BeforeSuite
	private void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("balajinammazhwar");
		WebElement pswrd = driver.findElement(By.id("password"));
		pswrd.sendKeys("priyabala89");
		WebElement login = driver.findElement(By.id("login"));
		login.click();

	}

}
