package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Frame;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calender {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		Thread.sleep(3000);
		//FIRST-CALENDER
//		int day=27;
//		driver.findElement(By.id("first_date_picker")).click();
//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[.="+day+"]")).click();	
		
		//SECOND_CALENDER
//		driver.findElement(By.id("second_date_picker")).click();
//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class, 'ui-datepicker-other-month '))]//a[.="+day+"]")).click();

		//THIRD-CALENDER
		int month=0;
		int year=2026;
		int day=3;	
		
		driver.findElement(By.id("third_date_picker")).click();
		Thread.sleep(3000);	
//		scientist method
//		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//select[@data-event='change']//option[.='Jun']")).click();
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//select[@data-event='change']//option[contains(@value,"+month+")]")).click();
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//select[@data-event='change']//option[.="+year+"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[.="+day+"]")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}