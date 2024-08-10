package com.seleniumPractice;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calenders {static WebDriver driver;
static String url="https://www.redbus.in/";
@Test(priority = 1,enabled = true)
public void geturl()throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeOptions cop=new ChromeOptions();
	cop.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
//	cop.addArguments("disable-notifications");
	
	driver=new ChromeDriver(cop);
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.MINUTES);
	driver.get(url);
	Thread.sleep(3000);
 }
@Test(priority = 2,enabled = true)
public void firstDatePicker()throws Exception{
	driver.findElement(By.id("onwardCal")).click();
	driver.findElement(By.className("sc-kAzzGY llxTcS")).click();
	Thread.sleep(3000);
  }
}
