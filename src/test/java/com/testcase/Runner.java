package com.testcase;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class Runner {
	static TestNG testng;
	public static void main(String[] args) {
		testng=new TestNG();
		//testng.setTestClasses(new Class[] {EmbibeLogin.class,IrctcWebsite.class});
		List<String>suits=new ArrayList<>();
		suits.add("C:\\Users\\MRUTUNJAY BHAYA\\eclipse-workspace\\com.seleniumwebdriver\\testng.xml");
		suits.add("C:\\Users\\MRUTUNJAY BHAYA\\eclipse-workspace\\com.seleniumwebdriver\\irctc.xml");
		testng.setTestSuites(suits);
		testng.run();

	}

}
