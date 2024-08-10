package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calen {

	public static void main(String[] args) throws Exception{
		 WebDriverManager.firefoxdriver().setup();
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		 
		 //FIRST CALENDER
//		 int day=3;
//		 driver.findElement(By.id("first_date_picker")).click();
//		 driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[.="+day+"]")).click();
		 
		//SECOND CALENDER
//		 driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
//		 Thread.sleep(5000);
//		 driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]//a[.=6]")).click();
		 
		 int day=0;
		 Thread.sleep(3000); 
		 driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
		 driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[@data-event='click']//a[.=7]")).click();	 
	}

}
