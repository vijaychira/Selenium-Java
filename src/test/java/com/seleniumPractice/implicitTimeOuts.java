package com.seleniumPractice;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitTimeOuts {
	static WebDriver driver;
	static String url="https://www.hyrtutorials.com/p/waits-demo.html";
	@Test(priority = 1,enabled = true)
	public void implcits()throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cop=new ChromeOptions();
		cop.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		driver=new ChromeDriver(cop);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	@Test(priority = 2,enabled=true)
	public void implicit() throws Exception{
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("txt1")).sendKeys("God is Good");
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("txt2")).sendKeys("All the Time");
		Thread.sleep(3000);
		driver.quit();
	}
}
