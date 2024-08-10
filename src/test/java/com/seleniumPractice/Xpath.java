package com.seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Xpath {
	@Test
	public void xpath()throws Exception {
		ChromeOptions cop=new ChromeOptions();
		cop.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(cop);
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.id("first_date_picker")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table//tbody/tr/td[contains(.,3)]")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
