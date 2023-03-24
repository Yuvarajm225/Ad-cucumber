package com.TestRunbc;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.AdactinPom.BaseClass;

public class AdactinTest extends BaseClass{
	public static void main(String[] args) throws AWTException, IOException {
		driver=browserLaunch("chrome");
		driver.get("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.id("username"));
		inputValue(username, "balajinammazhwar");
		WebElement password = driver.findElement(By.id("password"));
		inputValue(password, "priyabala89");
		WebElement login = driver.findElement(By.id("login"));
		clickonElement(login);
		WebElement location = driver.findElement(By.id("location"));
		AdactinTest.selectbyIndex(location, 1);
		WebElement hotels = driver.findElement(By.id("hotels"));
		AdactinTest.selectbyValue(hotels, "Hotel Sunshine");
		WebElement roomType = driver.findElement(By.id("room_type"));
		AdactinTest.selectbyVisibletext(roomType, "Super Deluxe");
		WebElement roomNos = driver.findElement(By.id("room_nos"));
		AdactinTest.selectbyIndex(roomNos, 1);
		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		checkIn.clear();
		checkIn.sendKeys("03/03/2023");
		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		checkOut.clear();
		checkOut.sendKeys("04/03/2023");
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		AdactinTest.selectbyIndex(adultRoom, 1);
		WebElement childRoom = driver.findElement(By.id("child_room"));
		AdactinTest.selectbyIndex(childRoom, 0);
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		WebElement selectHotel = driver.findElement(By.id("radiobutton_0"));
		selectHotel.click();
		WebElement contnu = driver.findElement(By.id("continue"));
		contnu.click();
		WebElement fname = driver.findElement(By.id("first_name"));
		inputValue(fname, "Yuva");
		WebElement lname = driver.findElement(By.id("last_name"));
		inputValue(lname, "Raj");
		WebElement adres = driver.findElement(By.id("address"));
		inputValue(adres, "Salem");
		WebElement creditCard= driver.findElement(By.id("cc_num"));
		inputValue(creditCard, "1234567876543210");
		WebElement ccType = driver.findElement(By.id("cc_type"));
		AdactinTest.selectbyIndex(ccType, 2);
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		AdactinTest.selectbyIndex(expmonth, 4);
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		AdactinTest.selectbyIndex(expyear, 5);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		inputValue(cvv, "123");
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		WebElement logout = driver.findElement(By.xpath("//a[@href='Logout.php']"));
		logout.click();
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.linkText("Electronics"));
		contextclick(ele);
		downkey();
		enterkey();
		WebElement mob = driver.findElement(By.linkText("Mobiles"));
		contextclick(mob);
		downkey();
		enterkey();
		gettitle();
		getTex(mob);
		navigateto("https://www.flipkart.com/");
		backPage(mob);
		forPage(ele);
		navigateto("https://www.amazon.in/");
		windowhandles();
		screenShot("C:\\Users\\91824\\eclipse-workspace\\MavenProject\\ScreenshotImg");
		
	}

	
	
	
		
}
