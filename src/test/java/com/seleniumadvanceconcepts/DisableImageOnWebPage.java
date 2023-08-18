package com.seleniumadvanceconcepts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisableImageOnWebPage {
	@Test
	public void disableImageOnWebpage() {
	 ChromeOptions options = new ChromeOptions();
     
     // Disable images on the webpage
		
		  options.addArguments("--disable-extensions");
		  options.addArguments("--disable-gpu"); 
		  options.addArguments("--no-sandbox");
		  options.addArguments("--disable-dev-shm-usage");
		  options.addArguments("--disable-setuid-sandbox");
		  options.addArguments("--disable-popup-blocking");
		  options.addArguments("--disable-infobars");
		  options.addArguments("--disable-notifications");
		  options.addArguments("--disable-default-apps");
		  options.addArguments("--mute-audio");
		  options.addArguments("--blink-settings=imagesEnabled=false");
		 

     // Fix chromedriver org.openqa.selenium.remote.http.WebSocket$Listener onError
     // Invalid Status code=403 text=Forbidden
     options.addArguments("--remote-allow-origins=*");
     
     WebDriverManager.chromedriver().setup();
     WebDriver driver =new ChromeDriver(options);
     driver.manage().window().maximize();
     driver.get("https://www.amazon.in/");
}
}