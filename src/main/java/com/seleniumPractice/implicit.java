package com.seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class implicit {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		EdgeOptions options =new EdgeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://kids.nationalgeographic.com/animals/mammals/facts/gray-wolf");
		options.addArguments("start-maximized");
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println();
		System.out.println(driver.getPageSource());
		driver.quit();
		
		
	}

}
