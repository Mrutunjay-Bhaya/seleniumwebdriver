package com.DemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * A simple unit test
 */
public class MainTest 
{
	WebDriver driver;
    /**
     * Rigorous Test :-)
     */
   @Test
    public void setUp()
    {
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.get("https://makemytrip.com");
       System.out.println("run sucsesful");
    }
}
