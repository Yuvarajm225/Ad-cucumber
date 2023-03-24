package com.Adactin.StepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.AdactinRunner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	public static WebDriver driver = Test_Runner.driver;

	
	@Given("^user Launches The Web Application$")
	public void user_Launches_The_Web_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
		
	}

	@When("^user Enter Valid Username In Usename Field$")
	public void user_Enter_Valid_Username_In_Usename_Field() throws Throwable {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("balajinammazhwar");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		WebElement pswrd = driver.findElement(By.id("password"));
		pswrd.sendKeys("priyabala89");
	}

	@Then("^user Clicks Login Button The Page Should Be Navigate To Search Page$")
	public void user_Clicks_Login_Button_The_Page_Should_Be_Navigate_To_Search_Page() throws Throwable {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
	}

	@When("^user Select Location From The Location Dropdown$")
	public void user_Select_Location_From_The_Location_Dropdown() throws Throwable {
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(3);
	}

	@When("^select Hotel From Hotels Dropdown$")
	public void select_Hotel_From_Hotels_Dropdown() throws Throwable {
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByIndex(2);
	}

	@When("^select Roomtype From Room Type Dropdown$")
	public void select_Roomtype_From_Room_Type_Dropdown() throws Throwable {
		WebElement roomType = driver.findElement(By.id("room_type" ));
		Select s2 = new Select(roomType);
		s2.selectByIndex(2);
		
	}

	@When("^select Number Of Rooms From Number Of Rooms Dropdown$")
	public void select_Number_Of_Rooms_From_Number_Of_Rooms_Dropdown() throws Throwable {
		WebElement noofRoom = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(noofRoom);
		s3.selectByValue("1");
		
	}

	@When("^select Check In Date$")
	public void select_Check_In_Date() throws Throwable {
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.sendKeys("01/03/2023");
	}

	@When("^select Check Out Date$")
	public void select_Check_Out_Date() throws Throwable {
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys("02/03/2023");
	}

	@When("^mention Number Of Adult From Adults Per Room Dropdown$")
	public void mention_Number_Of_Adult_From_Adults_Per_Room_Dropdown() throws Throwable {
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adultroom);
		s4.selectByIndex(1);
		
	}

	@When("^mention Number Of Children From Children Per Room Dropdown$")
	public void mention_Number_Of_Children_From_Children_Per_Room_Dropdown() throws Throwable {
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5 = new Select(child);
		s5.selectByIndex(1);
	}

	@When("^clicks Search Button$")
	public void clicks_Search_Button() throws Throwable {
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
	}

	@Then("^it Should Be Navigate To Select Hotel Page$")
	public void it_Should_Be_Navigate_To_Select_Hotel_Page() throws Throwable {
	}

	@When("^select Hotel By Using Radio Button$")
	public void select_Hotel_By_Using_Radio_Button() throws Throwable {
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		radiobutton.click();
	}

	@When("^clicks Continue$")
	public void clicks_Continue() throws Throwable {
		WebElement cntnu = driver.findElement(By.id("continue"));
		cntnu.click();
	}

	@Then("^it Should Be Navigate To Hotel Booking Page$")
	public void it_Should_Be_Navigate_To_Hotel_Booking_Page() throws Throwable {
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("Yuva");
	}
	@When("^user Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("Raj");
	}

	@When("^user Enter The Billing Address In Address Field$")
	public void user_Enter_The_Billing_Address_In_Address_Field() throws Throwable {
		WebElement adres = driver.findElement(By.id("address"));
		adres.sendKeys("India");
	}

	@When("^user Enter The Credit Card Number In Corresponding Field$")
	public void user_Enter_The_Credit_Card_Number_In_Corresponding_Field() throws Throwable {
		WebElement ccNum = driver.findElement(By.id("cc_num"));
		ccNum.sendKeys("1234567876543210");
		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(ccType);
		s6.selectByIndex(1);
	}

	@When("^user Select The Credit Card Type From Respective Dropdown$")
	public void user_Select_The_Credit_Card_Type_From_Respective_Dropdown() throws Throwable {
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(expmonth);
		s7.selectByIndex(3);
	}

	@When("^user Select Expiry Date From Respective Dropdown$")
	public void user_Select_Expiry_Date_From_Respective_Dropdown() throws Throwable {
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(expyear);
		s8.selectByIndex(3);
	}

	@When("^user Enter CVV Number$")
	public void user_Enter_CVV_Number() throws Throwable {
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("123");
	}

	@When("^clicks Book Now Button$")
	public void clicks_Book_Now_Button() throws Throwable {
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		
	}

//	@Then("^it Showed The Booking Confirmation Page$")
//	public void it_Showed_The_Booking_Confirmation_Page() throws Throwable {
//	}
//
//	@When("^user Verifies The Booking Confirmation Page$")
//	public void user_Verifies_The_Booking_Confirmation_Page() throws Throwable {
//		
//	}

	@When("^user Click The Logout Button$")
	public void user_Click_The_Logout_Button() throws Throwable {
		WebElement logout = driver.findElement(By.xpath("//a[@href='Logout.php']"));
		logout.click();
	}

}
