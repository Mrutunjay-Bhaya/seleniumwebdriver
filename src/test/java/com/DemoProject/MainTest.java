package com.DemoProject;

import org.openqa.selenium.By;
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
     * @throws InterruptedException 
     */
  //@Test
    public void setUp() throws InterruptedException
    {
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();

       driver.get("https://www.toolsqa.com/");
 
 
       
       System.out.println("run sucsesful");
       driver.findElement(By.xpath("//span[text()='Tutorials']")).click();
       driver.findElement(By.xpath("//span[text()='QA Practices']")).click();
       long starttime=System.currentTimeMillis();
       driver.findElement(By.xpath("(//a[text()='Software Testing'])[3]")).click();
       long endtime =System.currentTimeMillis();
       long totaltime=endtime - starttime;
       System.out.println("Total page lode time "+totaltime+ " miliseconds");
//       driver.findElement(By.xpath("//h5[text()='Elements']")).click();
//       driver.findElement(By.xpath("//h5[text()='Elements']")).click();
//       
       Thread.sleep(5000);
       driver.quit();
    }
}
