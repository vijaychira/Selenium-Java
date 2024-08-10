package com.seleniumPractice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {
	static WebDriver driver;
	static String url="https://www.hyrtutorials.com/p/frames-practice.html";
	@Test(priority = 1,enabled=true)
	public void geturl() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cop=new ChromeOptions();
		cop.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		driver=new ChromeDriver(cop);
		driver.manage().window().maximize();
		driver.get(url);
	}
	@Test(priority = 2,enabled=true)
	public void farme1()throws Exception {
		driver.switchTo().frame("frm1");
		WebElement course=driver.findElement(By.id("course"));
		Select coursedropdown=new Select(course);
		List<WebElement>courseName=coursedropdown.getOptions();
		System.out.println("All course names are below");
		for (WebElement webElement : courseName) {
			System.out.println(webElement.getText());
		}
		coursedropdown.selectByIndex(3);
		Thread.sleep(3000);
	}
	@Test(priority = 3,enabled=true)
	public void parentframe()throws Exception{
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).sendKeys("God is good, All the time");
		Thread.sleep(3000);
		driver.quit();
	}
}
