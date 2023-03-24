package com.AdactintestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class adactinHotelsearch {
	public static WebDriver driver;
	@BeforeTest
	private void hotelSearch() throws Throwable {
		try {
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(3);
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByIndex(2);
		WebElement roomType = driver.findElement(By.id("room_type" ));
		Select s2 = new Select(roomType);
		s2.selectByIndex(2);
		WebElement noofRoom = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(noofRoom);
		s3.selectByValue("1");
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.sendKeys("01/03/2023");
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys("02/03/2023");
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adultroom);
		s4.selectByIndex(1);
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5 = new Select(child);
		s5.selectByIndex(1);
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		}
		catch (Exception exe){
			throw new Exception("Excetion Occured in Hotel Search due to "+ exe.getMessage()+exe.getStackTrace());
			
		}
		
	}

}
