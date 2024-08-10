package com.seleniumPractice;

import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;
import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandles {
	static WebDriver driver;
	static String url="https://www.hyrtutorials.com/p/window-handles-practice.html";
	@Test(priority = 1,enabled = true)
	public void alerts()throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cop=new ChromeOptions();
		cop.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		driver=new ChromeDriver(cop);
		driver.manage().window().maximize();
		driver.get(url);	
		Thread.sleep(3000);
		String parentWindowTitle=driver.getWindowHandle();
		System.out.println(parentWindowTitle);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String>allwindowHandles=driver.getWindowHandles();
		for (String handle: allwindowHandles) {
			if(!handle.equals(parentWindowTitle)) {
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("Wolf is here");
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowTitle);
		Thread.sleep(3000);
		driver.quit();
	}	
}
