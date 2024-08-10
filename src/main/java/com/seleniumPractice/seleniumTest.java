package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumTest {
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}
	

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://m.facebook.com/");
		highlight(driver, driver.findElement(By.id("m_login_email")));
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.name("pass")));
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.className("_43mh")));
		highlight(driver, driver.findElement(By.linkText("_9on1")));
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.partialLinkText("Create new ")));
		Thread.sleep(2000);	
	}

}
