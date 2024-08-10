package com.seleniumPractice;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class projectMe {
	public static WebDriver driver=new ChromeDriver();
	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		chatpter2();
	}		
	public static void highlight(WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}
	public static void chatpter2() {
		driver.get("https://www.w3schools.com/");
		highlight(driver.findElement(By.xpath("/html/body/div/div/div/a[2]")));	 
	}
	}
