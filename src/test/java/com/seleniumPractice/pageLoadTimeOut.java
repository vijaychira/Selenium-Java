package com.seleniumPractice;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageLoadTimeOut {
	static WebDriver driver;
	static String url1="https://www.subzero-wolf.com/";
	static String url2="https://www.royalmansour.com/en/";
	static String url3="https://www.google.com/";
	@Test(priority = 1,enabled = true)
	public void pageLoadTimeOut1()throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cop=new ChromeOptions();
		cop.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		driver=new ChromeDriver(cop);
		driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Instant start=Instant.now();
		driver.get(url1);	
		System.out.println(driver.getTitle());
		Instant end=Instant.now();
		Duration duration=Duration.between(start, end);
		System.out.println(duration.getSeconds());
		driver.quit();
	}
	@Test(priority = 2,enabled=true)
	public void closeWindow() {
		driver.quit();
	}
}
