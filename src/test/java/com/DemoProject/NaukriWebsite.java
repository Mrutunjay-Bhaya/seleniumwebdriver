package com.DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriWebsite {
	@Test
	public void lunchWebsite() throws Throwable {
String id="bhayamrutunjay@gmail.com";
String pass="Mrutunjay@123";
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	driver.switchTo().parentFrame();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[text()='Email ID / Username']//following-sibling::input[@type='text']")).sendKeys(id);
	driver.findElement(By.xpath("//label[text()='Password']//following-sibling::input[@type='password']")).sendKeys(pass);
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='user-name roboto-bold-text']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//em[@class='icon edit']")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("saveBasicDetailsBtn")).click();
	
	Thread.sleep(8000);
	driver.close();
		
		
	}}


