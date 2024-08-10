package com.seleniumPractice;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class getproperties {
	//get tagname,HTML attribute value,text,CSS value using SELEnium WebDriver;
	static WebDriver driver;
	static String url="https://github.com/login";
	@Test(priority = 1,enabled = true)
	public void alerts()throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cop=new ChromeOptions();
		cop.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		driver=new ChromeDriver(cop);
		driver.manage().window().maximize();
		driver.get(url);	
	System.out.println(driver.findElement(By.name("commit")).getTagName());
	String type= driver.findElement(By.name("commit")).getAttribute("type");
	WebElement web= driver.findElement(By.id("login_field"));
	web.sendKeys("Wolf");
	System.out.println(web.getAttribute("value"));
	System.out.println(driver.findElement(By.name("commit")).getCssValue("display"));
	driver.quit();		
	}
}
