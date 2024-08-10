package com.seleniumPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handles {

	public static void main(String[] args)throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("name")).sendKeys("Hello John");
	Thread.sleep(3000);
	driver.switchTo().frame("frm1");
	WebElement frame1=driver.findElement(By.id("course"));
	Select option= new Select(frame1);
	Collection<WebElement> all=option.getOptions();
	for(WebElement w:all) {
		System.out.println(w.getText());
	}
	option.selectByIndex(3);
	Thread.sleep(3000);
	driver.switchTo().defaultContent().switchTo().frame("frm2");
	driver.findElement(By.id("femalerb")).click();
	Thread.sleep(3000);
	driver.switchTo().defaultContent().switchTo().frame("frm1");
	option.selectByIndex(1);
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	driver.findElement(By.id("name")).clear();
	Thread.sleep(3000);
	driver.findElement(By.id("name")).sendKeys("Hello Mike");
	Thread.sleep(3000);
	driver.quit();
	}
}
