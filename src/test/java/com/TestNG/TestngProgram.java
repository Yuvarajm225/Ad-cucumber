package com.TestNG;

import org.testng.annotations.Test;

public class TestngProgram {
	
	public class dependency_Based {
	@Test
	public void yuva() {
		System.out.println("yuvaa");
	}
	@Test(dependsOnMethods = "yuva")
	public void Sow() {
		System.out.println("Sowmi");
	}
	@Test(dependsOnMethods = "Sow")
	public void Sim() {
		System.out.println("Simbu");
	}
	@Test(dependsOnMethods = "Sim")
	public void Smit() {
		System.out.println("Ssmitha");
	}
	@Test(dependsOnMethods = "Smit")
	public void faris() {
		System.out.println("faris Fatima");
	}
	}

}
