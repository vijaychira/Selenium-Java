package com.seleniumPractice;

import java.awt.Window;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathsofHindusthan {
	static WebDriver driver;
	static String url="https://www.hyrtutorials.com/p/add-padding-to-containers.html";
	
	@Test(priority = 1,enabled=false)
	public void xpaths()throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
	options.addArguments("start-maximized");
	driver =new ChromeDriver(options);
	driver.get(url);
	JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(0,200)");
	driver.findElement(By.xpath("//input[@maxlength!=11]")).sendKeys("God isGood");
	driver.findElement(By.xpath("//input[@maxlength>10and@maxlength<20]")).sendKeys("All the Time");
	List<WebElement> element1= driver.findElements(By.xpath("//input[@maxlength<=10]"));
	List<WebElement> element2= driver.findElements(By.xpath("//input[@maxlength>=10and@name='name']"));
	System.out.println(element1.size()+" "+element2.size());	
	j.executeScript("window.scrollTo(200,1000)");
	driver.findElement(By.xpath("(//table[@id='contactList']//tbody//tr//td)[1]")).click();
	Thread.sleep(3000);
	driver.quit();
	}
	
	@Test(priority = 2,enabled=true)
	public void xpaths2()throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
	options.addArguments("start-maximized");
	driver =new ChromeDriver(options);
	driver.get(url);
	JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(0,1000)");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}
}
