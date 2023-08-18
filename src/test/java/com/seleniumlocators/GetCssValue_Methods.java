package com.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

import utilities.WebDriverUtility;

public class GetCssValue_Methods extends BaseClass {
	@Test
	public void getCssvalues() throws InterruptedException {
		String url = "https://www.makemytrip.com/";
		driver.get(url);
		WebDriverUtility wd = new WebDriverUtility();

		WebElement imgelement = driver.findElement(
				By.cssSelector("img[src='//imgak.mmtcdn.com/pwa_v3/pwa_hotel_assets/header/logo@2x.png']"));
		

		WebElement element = driver.findElement(By.xpath("//input[@id='fromCity']"));
		Point point = element.getLocation();
		String imgheight = element.getCssValue("height");
		String imgwidth = element.getCssValue("width");
		System.out.println("Image size is: " + imgheight + " x " + imgwidth);
		String strLine = System.getProperty("line.separator");
		System.out.println("X cordinate# " + point.x + strLine + "Y cordinate# " + point.y);

		wd.highLightElementByJavascripts(driver, element);
		String fontSize = element.getCssValue("font-size");
		String color = element.getCssValue("color");
		String backgroundColor = element.getCssValue("background-color");
		String borderWidth = element.getCssValue("border-width");
		String width = element.getCssValue("width");
		String height = element.getCssValue("height");
		String fontStyle = element.getCssValue("font-style");
		String fontWeight = element.getCssValue("font-weight");
		String textDecoration = element.getCssValue("text-decoration");
		System.out.println("width of the element is: " + width);
		System.out.println("height of the element is: " + height);

		System.out.println("Font size of the element is: " + fontSize);
		System.out.println("color of the element is: " + color);
		System.out.println("Background color of the element is: " + backgroundColor);

		System.out.println("Border width of the element is: " + borderWidth);

		System.out.println("Font style of the element is: " + fontStyle);
		System.out.println("Font weight of the element is: " + fontWeight);
		System.out.println("Text decoration of the element is: " + textDecoration);
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Search']"));
		String ss = element2.getCssValue("text-align");
		System.out.println("Place of the element is: " + ss);

	}
}