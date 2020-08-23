package com.test.proj;

import org.junit.Test;

public class TestScenario {
	GenericFunction refGeneric = new GenericFunction();
	DriverClass refDriver = new DriverClass();
	ObjectRepositories refObject = new ObjectRepositories();
	@Test
	public void method1() {
		refDriver.setupScenario("chrome");
		refGeneric.get_url("https://www.geeksforgeeks.org/java/");
		//refGeneric.clickOnButtonHaving(refObject.Loginelement);
		refGeneric.clickOnButtonHavingXpath(refObject.Login);
		}
}
