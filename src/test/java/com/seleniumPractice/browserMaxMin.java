package com.seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserMaxMin {
	@Test
	public void browserMaxMini() {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions cop=new ChromeOptions();
//		cop.addArguments("start-maximized");
//		WebDriver driver=new ChromeDriver(cop);
//		driver.get("https://www.google.com/");
//		
		WebDriverManager.edgedriver().setup();
		EdgeOptions cop=new EdgeOptions();
		cop.addArguments("start-maximized");
		WebDriver driver=new EdgeDriver(cop);
		driver.get("https://www.google.com/");
	}
}
