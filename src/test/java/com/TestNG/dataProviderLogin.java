package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test(dataProvider = "data")
public class dataProviderLogin {
	
	String[][] data = {
			{"pushuv143@gmail.com","uyyihhghgjh"},
			{"pushuv@gmail.com","akramyuvaa"},
			{"pushuv@gmail.com","uyyihhghgjh"},
			{"pushuv143@gmail.com","akramyuvaa"}
			};
	private String[][] loginDataProvdr() {
		return data;

	}
	
	public static WebDriver driver;
@Test
	private void loginDataProvdr(String uname, String pword ) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(uname);
		WebElement pswrd = driver.findElement(By.id("pass"));
		pswrd.sendKeys(pword);
		WebElement login = driver.findElement(By.id("u_0_5_1a"));
		login.click();

	}

}
