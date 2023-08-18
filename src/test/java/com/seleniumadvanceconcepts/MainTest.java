package com.seleniumadvanceconcepts;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
     * @throws Throwable 
     */
  @Test
    public void setUp() throws InterruptedException, Throwable
    {
       WebDriverManager.chromedriver().setup();
       ChromeOptions op=new ChromeOptions();
      //op.addArguments("headless");
       op.addArguments("--remote-allow-origins=*");
       driver=new ChromeDriver(op);
      

       driver.get("https://www.airtel.in/");
       driver.manage().window().maximize();
 List<WebElement> wl=driver.findElements(By.tagName("a"));
 System.out.println(wl.size());
 String url="";
 Iterator<WebElement>all=wl.iterator();
 while(all.hasNext()) {
	 url=all.next().getTagName();
	 System.out.println(url);
 }
 
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.navigate().to("https://www.softwaretestinghelp.com/new-features-in-selenium-4/");
//        driver.switchTo().newWindow(WindowType.WINDOW);
//        driver.navigate().to("https://www.javatpoint.com/java-programs#java-number-programs");
//        PrintsPage printer = (PrintsPage)driver;
//        PrintOptions p=new PrintOptions();
//        p.setPageRanges("1-2");
//        Pdf pf=printer.print(p);
//        String s=pf.getContent();
//        
//        System.out.println(s);
//        Thread.sleep(10000);
      
//WebElement element=driver.findElement(By.className("tools-qa-header__logo"));
//      TakesScreenshot sc= ((TakesScreenshot)driver);
//               File scrFile = sc.getScreenshotAs(OutputType.FILE);
//               FileUtils.copyFile(scrFile, new File("./image.png"));
//               driver.quit();
           }
       
         
      /* 
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
       */
    }

