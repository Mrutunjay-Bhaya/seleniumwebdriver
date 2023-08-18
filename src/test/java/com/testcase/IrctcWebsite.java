package com.testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

public class IrctcWebsite extends BaseClass{
	@Test
	public void getAllTrainName() {
		driver.get("https://www.irctc.co.in/nget/train-search");
		//driver.switchTo().alert().accept();
	
		//String ss="SECUNDERABAD JN";
		driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).click();
		List<WebElement> el=driver.findElements(By.xpath("//ul[@role='listbox']//li")); 
		el.get(1).click();
		driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).click();
		List<WebElement> ell=driver.findElements(By.xpath("//ul[@role='listbox']//li")); 
		ell.get(2).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		List<WebElement>train=driver.findElements(By.xpath("//div[@class='col-sm-5 col-xs-11 train-heading']"));
	System.out.println(train.size());
	for(WebElement name:train) {
		String trainname=name.getText();
		System.out.println(trainname);
		//driver.findElement(By.xpath("//td[@class='link ng-star-inserted']")).click();
		driver.findElement(By.xpath("//div[@class='white-back col-xs-12 ng-star-inserted']")).click();
		List<WebElement>aval=driver.findElements(By.xpath("//td[@class='link ng-star-inserted']"));
	
		System.out.println(aval.size());
		for(WebElement seats:aval) {
			String allseats=seats.getText();
			System.out.println(allseats);
			
		}
	}
	
	
	}
	

}
