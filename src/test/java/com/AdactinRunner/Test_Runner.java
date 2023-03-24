package com.AdactinRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)//helps to run in Junit
@CucumberOptions(features = "src//test//java//com//AdactinFeature", //add the file path 
glue="com.Adactin.StepDefinition", //step definition location
monochrome = true, //to remove special characters
dryRun = false, //to check the scenarios and step definition both are match
strict = true, // true shows the exception , false - does not shows the exceptions
plugin = {"html:Reports/Html_Report",
		"pretty",
		"json:Reports/Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"
})

public class Test_Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterClass
	public static void tearDown() {
		//driver.close();

	}

}
