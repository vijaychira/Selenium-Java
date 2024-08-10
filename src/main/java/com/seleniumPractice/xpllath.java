package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class xpllath {
	private static WebDriver driver;
	public static void main(String[] args)throws Exception{
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
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		highlight(driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[position()!=2]")));
	System.out.println(driver.findElements(By.xpath("(//table[@id='contactList']/tbody/tr)[position()>2]")).size());
	}
}
