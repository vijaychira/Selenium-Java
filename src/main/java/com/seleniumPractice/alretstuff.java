package com.seleniumPractice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alretstuff {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentwindowHandle=driver.getWindowHandle();
		System.out.println("parent window handle"+ parentwindowHandle);
		driver.findElement(By.id("newWindowBtn")).click();
//		Set<String> allwindows= driver.getWindowHandles();
//		for(String window: allwindows) {
//			System.out.println(window);
//		}
		Thread.sleep(3000);
		driver.quit();
	}
}
