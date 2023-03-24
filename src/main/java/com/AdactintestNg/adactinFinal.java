package com.AdactintestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class adactinFinal {
	public static WebDriver driver;
	@AfterSuite
	private void logOut() {
		WebElement logout = driver.findElement(By.xpath("//a[@href='Logout.php']"));
		logout.click();

}

}
