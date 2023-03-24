package com.TestNG;

import org.testng.annotations.Test;

public class invocationCount {
	@Test
	private void BrowsLaunch() {
		System.out.println("URL");
		
	}
	@Test(priority = 0)
	private void setProperty() {
		System.out.println("Set Property");

	}
	@Test(priority = 2)
	private void getUrl() {
		System.out.println("get Url");
	
	}
	@Test (priority = 1,invocationCount = 3)
	private void reFresh() {
		System.out.println("Refresh");

	}

}
