package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.AdactinPom.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pomTask  {
	public static WebDriver driver;
	@FindBy(name="username")
	private String login;
	@FindBy(name="username")
	private String username;
	@FindBy(name="username")
	private String password;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}

}
