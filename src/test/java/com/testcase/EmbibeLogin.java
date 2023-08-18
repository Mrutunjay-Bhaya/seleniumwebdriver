package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

import utilities.WebDriverUtility;

public class EmbibeLogin extends BaseClass {	
@Test
public void loginEmbibe() throws InterruptedException {
	WebDriverUtility wd=new WebDriverUtility();
	driver.get("https://www.embibe.com/");
	//driver.findElement(By.cssSelector("#wzrk-confirm")).click(); 
	driver.findElement(By.xpath("//span[text()='Log in']")).click();
	driver.findElement(By.xpath("//span[text()='Sign In using password']")).click();
	driver.findElement(By.cssSelector("input[name=email]")).sendKeys("7536956529");
	driver.findElement(By.cssSelector("input[name=password]")).sendKeys("mrutunjay");
	driver.findElement(By.xpath("//span[text()='Sign In']")).click();
	
	driver.findElement(By.xpath("//span[text()='Learn']")).click();
	WebElement element= driver.findElement(By.xpath("(//div[@class='sc-ehmTmK cvBjLT subject-tag' and text()='Physics'])[11]"));
	Thread.sleep(5000);
	wd.scrollDownByJavascript(driver, 2000);
	Thread.sleep(5000);
	//element.click();
	//Thread.sleep(5000);
//	driver.findElement(By.xpath("//span[text()='Log in']")).click();
}
}
