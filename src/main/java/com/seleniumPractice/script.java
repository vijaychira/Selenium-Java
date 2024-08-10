package com.seleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class script {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor execute=(JavascriptExecutor)driver;
		WebElement element= (WebElement)execute.executeScript("return document.querySelector(\"#email\")");
		Actions actions= new  Actions(driver);
		actions.moveToElement(element).click().sendKeys("Wolf is in the town").perform();
		Thread.sleep(3000);
		driver.quit();
	}
}
