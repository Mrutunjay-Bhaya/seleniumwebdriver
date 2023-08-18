package com.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumLocators {

	WebDriver driver;

	public void locatorTypes() {

		// In selenium total 8 types of locator have
		driver.findElement(By.className(""));
		driver.findElement(By.id(""));
		driver.findElement(By.linkText(""));
		driver.findElement(By.name(""));
		driver.findElement(By.partialLinkText(""));
		driver.findElement(By.tagName("a"));
		driver.findElement(By.xpath(""));
		driver.findElement(By.cssSelector(""));
	}

	public void xpath() {
		String s = "// tag[@attribute1 = ‘value’ and @attribute2 = ‘value’]";
		String s1 = "// tag[@attribute1 = ‘value’ or @attribute2 = ‘value’]";
		String s2 = " // tag[@attribute1 = ‘value’, contains(text(),’-xxxxx-’)]";
		String s3 = " // tagP[@attribute = ‘value’] // innerTagOfP[@attribute1 = ‘value’ and @attribute2 = ‘value’]";
		String s4 = "// tag [text( ),'xxxx']";
		String s5 = "// tag [contains(text( ),'xxxx')]";
		String s6 = "// tag [starts-with(@id, 'msg') ]";
		String Xpath1 = "//*[@id='username']";
		String Xpath2 = "//input[@id='username']";
		String Xpath3 = "//form[@name='loginForm']/input[1]";
		String Xpath4 = "//*[@name='loginForm']/input[1]";
		// We can use Inner Text for relative xpath –
		String s7 = "// tag [text( ),'xxxx']";
		String s8 = "// tag [contains(text( ),'xxxx')]";
		String s9 = "// tag [starts-with(@id, 'msg') ]";

		// following

		String s10 = " //*[@type='text']// following :: input[1]";
		String s11 = "//*[@type='text']// following :: input[2]";

		// Ancestor:
		String s12 = " //*[text() ='Enterprise Testing']// ancestor :: div[1]";
		// child
		String child = " //*[@id='java_technologies']/child::li[1]";
		// Preceding:
		String s13 = " //*[@type ='submit']//preceding::input [1]";

		// following-sibling
		String s14 = "//*[@type = 'submit']// following-sibling::input";
		// Parent
		String s15 = "//*[@id ='rt-feature']//parent::div[1]";
		// Self

		String s16 = "//*[@type = 'password'//self::input";
		// Descendant
		String s17 = "//*[@id = 'rt-fearture']//descendant::a [1]";

	}

	public void cssSelector() {

		// Tag [ attribute = “value” ]
		/*
		 * If fixed part is at starting - use (^) - e.g. input [id^=’XXXXXX’] If fixed
		 * part is at mid - use (*) - e.g. input [id*=’XXXXXX’] If fixed part is at end
		 * - use ($) - e.g. input [id$=’XXXXXX’]
		 */
		// Tag and ID
		String tag_id = "input#Email";

		// Tag and Class
		String tag_class = "input.inputtext";
            //Tag and Attribute
		String tag_attribute = "input[name=Email]";
		// Tag, Class and Attribute
		String tag_class_attribute = "=input.inputtext[name=email]";

		/*
		 * SUB-STRING MATCHES: CSS in Selenium has an interesting feature of allowing partial string matches using ^, $, and *.
		 *  
		 * Suppose <input="Employee_ID_001">
		 * Starts with (^): To select the element, we would use ^ which means ‘starts with’ 
		 * 
		 * Syntax: css=<HTML tag><[attribute^=prefix of the string]>
		 *  
		 * Ends with ($): To select the element, we would use $ which means ‘ends with’.
		 * 
		 *  Syntax:css = <HTML tag> <[attribute$=suffix of the string]> 
		 *  Contains (*):  To select the element, we would use * which means ‘sub-string’
		 * 
		 * Syntax: css=<HTML tag><[attribute*=sub string]>
		 * 
		 *  Also we can use ‘contains()’:
		 */
		String starts_with = "input[id^='Em']";
		
		String ends_with = "input[id$='001']";
		
		String subString = "input[id*='id']";
		
		String contains = "input:contains('id')";
		//Locating Child Elements(Direct Child):
		//Syntax: parentLocator>childLocator
		String directChild=" div#buttonDiv>button";
		//Locating nth Child:
		String nthChild="ul#automation li:nth-of-type(2)";
		//Locating Last Child
		String LastChild="ul#automation li:last-child";
	}
}
