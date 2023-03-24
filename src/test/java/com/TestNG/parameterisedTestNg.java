package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.AdactinPom.BaseClass;

public class parameterisedTestNg extends BaseClass{
	public static WebDriver driver = BaseClass.browserLaunch("chrome");
//	static PageObjectManager pom = new PageObjectManager (driver);
	@Parameters({"username","password"})
	@Test
	public void credentials(@Optional("Yuvaraj") String user , String Password) {
		System.out.println("Username is : "+ user);
		System.out.println("Password is : "+ Password);
		driver.get("https://www.facebook.com/");
		
		

	}

}
