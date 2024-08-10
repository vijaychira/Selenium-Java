package com.seleniumPractice;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getURLgetPageeSourse {
	@Test(priority = 1,enabled=false)
	public void getURL() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		ChromeOptions cop=new ChromeOptions();
		cop.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		driver=new ChromeDriver(cop);
		driver.manage().window().maximize();
		String url="https://www.seleniumhq.org";
		System.out.println("startURL: "+url);
		driver.get(url);
		System.out.println("EndURL: "+driver.getCurrentUrl());
		driver.quit();
	}
	@Test(priority = 2,enabled=true)
	public void getPagesourse() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cop=new ChromeOptions();
		cop.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		WebDriver driver=new ChromeDriver();
		driver=new ChromeDriver(cop);
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org");
		String pageSourse=driver.getPageSource();
		System.out.println(pageSourse);
		driver.quit();
	}
}
