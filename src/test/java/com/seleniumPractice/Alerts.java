package com.seleniumPractice;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	static WebDriver driver;
	static String url="https://www.hyrtutorials.com/p/alertsdemo.html";
	@Test(priority = 1,enabled = true)
	public void alerts()throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cop=new ChromeOptions();
		cop.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		driver=new ChromeDriver(cop);
		driver.manage().window().maximize();
		driver.get(url);	
		Thread.sleep(3000);
		//alertBox
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		String msg=driver.findElement(By.id("output")).getText();
		System.out.println(msg);
		
		//confirmBox
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		msg=driver.findElement(By.id("output")).getText();
		System.out.println(msg);
		
		//promtBox
		driver.findElement(By.id("promptBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Wolf is in the town");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		msg=driver.findElement(By.id("output")).getText();
		System.out.println(msg);	
		driver.quit();
	}
}
