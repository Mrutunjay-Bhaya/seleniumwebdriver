package com.seleniumadvanceconcepts;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinks extends BaseClass {
	@Test
	public  void set() throws Throwable {

		driver.get("https://www.irctc.co.in/nget/train-search");

		// Storing the links in a list and traversing through the links
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// This line will print the number of links and the count of links.
		System.out.println("No of links are " + links.size());

		// checking the links fetched.
		for (WebElement wl:links) {
			
			String url = wl.getAttribute("href");
			if(url == null || url.isEmpty()){
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
				}
			
			
			verifyLinks(url);
			
		}
Thread.sleep(20000);
		driver.quit();
	}

	public static void verifyLinks(String linkUrl) {
		try {
			URL url = new URL(linkUrl);

			// Now we will be creating url connection and getting the response code
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			
			if (httpURLConnect.getResponseCode() >= 400) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseCode() + "is a broken link");
			}

			// Fetching and Printing the response code obtained
			else {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseCode());
			}
			i++;
		} catch (Exception e) {
		}
	}
}
