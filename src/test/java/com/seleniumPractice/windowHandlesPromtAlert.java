package com.seleniumPractice;

import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandlesPromtAlert {
	static WebDriver driver;
	static String url="https://www.hyrtutorials.com/p/window-handles-practice.html";
	@Test(priority = 1,enabled = true)
	public void windowSwitchPlusAlert()throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cop=new ChromeOptions();
		cop.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		driver=new ChromeDriver(cop);
		driver.manage().window().maximize();
		driver.get(url);	
		Thread.sleep(3000);
		String parentWindowTitle=driver.getWindowHandle();
		System.out.println(parentWindowTitle);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,400)");
		driver.findElement(By.id("newTabBtn")).click();
		Set<String>allwindowHandles=driver.getWindowHandles();
		for (String handle: allwindowHandles) {
			if(!handle.equals(parentWindowTitle)) {
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				js.executeScript("window.scrollTo(0,200)");
				driver.findElement(By.id("promptBox")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().sendKeys("1) Wolf is in PromptAlertBox");
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
				String clickMsgViewer=driver.findElement(By.id("output")).getText();
				System.out.println(clickMsgViewer);
			}
		}
		driver.switchTo().window(parentWindowTitle);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("2) Wolf is in Main Parent Window");
		System.out.println(driver.findElement(By.id("name")).getAttribute("value"));
		Thread.sleep(3000);
		driver.quit();
	}	
}
