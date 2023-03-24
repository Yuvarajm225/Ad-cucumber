package com.TestNG;

import org.testng.annotations.Test;

public class priorityTest {
	@Test(priority = 2)
	public void name() {
		System.out.println("Yuvaraj");
	}
	@Test(priority = 1) 
	public void city() {
		System.out.println("Chennai");
	}
	@Test(priority = 4)
	public void company() {
		System.out.println("TCS");

	}
	@Test (priority = 3)
	public void qualification() {
		System.out.println("Automation");
	}

}
