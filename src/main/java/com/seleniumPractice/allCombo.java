package com.seleniumPractice;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class allCombo {
	static WebDriver driver;
	static String url="";
	
	public void getUrl() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cop=new ChromeOptions();
		cop.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		driver=new ChromeDriver(cop);
		driver.manage().window().maximize();
		driver.get(url);
	}	
}
