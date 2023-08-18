package com.testcase;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

public class AddToCart extends BaseClass {
	@Test
	public void addToCart() {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] allproducts = { "Cucumber", "Brocolli","Pista","Orange","Mango","Onion","Banana" };
		List<WebElement> addBtn = driver.findElements(By.cssSelector("div[class=product-action]"));
		int j = 0;

		for (int i = 0; i < addBtn.size(); i++) {

			String productName = driver.findElements(By.cssSelector("h4[class=product-name]")).get(i).getText();
			// System.out.println(productName);
			String[] name = productName.split("-");
			String finalname = name[0].trim();

			List<String> productList = Arrays.asList(allproducts);

			if (productList.contains(finalname)) {
				System.out.println(finalname);
				addBtn.get(i).click();
				j++;
				if (j == allproducts.length) {
					break;
				}
			}
		}

	}
}
