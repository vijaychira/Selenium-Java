package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mindfuck {

	
		private static WebDriver driver;
		public static void main(String[] args){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			chapter2();
			
			
		}
		public static void highlight(WebElement element) {
			JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
			jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
		}
		public static void chapter2() {
			driver.get("https://www.w3schools.com/");
			highlight(driver.findElement(By.xpath("/html/body/div/div/nav/a[2]")));
		}
}
