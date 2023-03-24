package com.AdactintestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class adactinPersonalinfo {
	public static WebDriver driver;
	@BeforeClass
	private void personalInfo() {
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		radiobutton.click();
		WebElement cntnu = driver.findElement(By.id("continue"));
		cntnu.click();
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("Yuva");
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("Raj");
		WebElement adres = driver.findElement(By.id("address"));
		adres.sendKeys("India");
		WebElement ccNum = driver.findElement(By.id("cc_num"));
		ccNum.sendKeys("1234567876543210");
		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(ccType);
		s6.selectByIndex(1);
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(expmonth);
		s7.selectByIndex(3);
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(expyear);
		s8.selectByIndex(3);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("123");
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
	}

}
