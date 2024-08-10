package com.seleniumPractice;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitWaitTimeOuts {
	static WebDriver driver;
	static String url="https://www.hyrtutorials.com/p/waits-demo.html";
	@Test(priority = 1,enabled = true)
	public void geturl()throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cop=new ChromeOptions();
		cop.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		driver=new ChromeDriver(cop);
		driver.manage().window().maximize();	
		driver.get(url);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); 
		driver.findElement(By.id("btn1")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("txt1")));
		driver.findElement(By.id("txt1")).sendKeys("God is Good");
		driver.findElement(By.id("btn2")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("txt2")));
		driver.findElement(By.id("txt2")).sendKeys("All the Time");
		Thread.sleep(4000);
		driver.quit();
	}
}
