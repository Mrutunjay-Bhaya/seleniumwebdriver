package com.testcase;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

import io.reactivex.rxjava3.functions.Action;

public class SeleniumTest extends BaseClass {

	@Test
	public void login() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parent = driver.getWindowHandle();
		String title = "LinkedIn";
		driver.findElement(
				By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']//*[name()='svg']"))
				.click();
		// Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']//*[name()='svg']")).click();
		// Thread.sleep(5000);
		// driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']//*[name()='svg']//*[name()='g'
		// and contains(@fill,'currentCol')]//*[name()='path' and
		// contains(@class,'st0')]")).click();
		// Thread.sleep(5000);
		// driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']//*[name()='svg']")).click();
		Set<String> windows = driver.getWindowHandles();

		for (String s : windows) {

			String titles = driver.switchTo().window(s).getTitle();
			if (titles.contains(title)) {
				System.out.println("current url " + driver.getTitle());
			}
		}
	}

	@Test
	public void dropDownHandel() {
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		long start=System.currentTimeMillis();
		List<WebElement> el = driver.findElements(By.xpath("//select//option"));
		System.out.println(el.size());
		int count = 0;
	 for(int i=el.size()-1;i>=0;i--) {
		WebElement a = el.get(i);
		String s = a.getText();
		count++;
		System.out.println(count + " " + s);
	 }
	 long end=System.currentTimeMillis();
		System.out.println(end-start);
	}
	@Test
	public void dropDownHandelusingSelect() {
		driver.get("https://mdbootstrap.com/docs/standard/components/dropdowns/");
		long start=System.currentTimeMillis();
		WebElement el=driver.findElement(By.xpath("//ul[@class='dropdown-menu show']"));
		Select s=new Select(el);
	s.selectByVisibleText("india");
		List<WebElement>list=s.getOptions();
		System.out.println(s.isMultiple());
		int count=0;
		for(int i=list.size()-1;i>=0;i--) {
			WebElement w=list.get(i);
			String text=w.getText();
			count++;
			System.out.println(count + " " + text);
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
	}
	@Test
	public void findBrokentLinks() throws InterruptedException, Throwable {
		driver.get("https://www.irctc.co.in/nget/train-search");
		List<WebElement>el=driver.findElements(By.tagName("a"));
		for(WebElement e:el) {
		String url=	e.getAttribute("href");
		//Thread.sleep(3000);
//		if(url==null||url.isEmpty()) {
//			System.out.println("url dont have");
//			continue;
		try {
		URL url2=new URL(url);
		HttpURLConnection hc=(HttpURLConnection) url2.openConnection();
		//hc.setConnectTimeout(5000);
		hc.connect();
		if(hc.getResponseCode()<400) {
			System.out.println(url2+" "+hc.getResponseCode());
		}
		else {
			System.out.println("not found");
		}
		
		}catch(Exception ee) {
			ee.printStackTrace();}}}
		}

// }
