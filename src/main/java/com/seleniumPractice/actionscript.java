package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionscript {

	public static void main(String[] args)throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().window().maximize();
//		JavascriptExecutor jsExecute=(JavascriptExecutor)driver;
//		Thread.sleep(3000);
//		WebElement username=(WebElement) jsExecute.executeScript("document.getElementById(\"ty_footer\").scrollIntoView()");
//		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("YADA GIRI REDDY")).click();
		
	//	
		Thread.sleep(3000);
//		WebElement password=(WebElement) jsExecute.executeScript("document.getElementsByName(\"pass\")[0].style.border='4px green solid';");
//		WebElement usernam=(WebElement) jsExecute.executeScript("return document.getElementsByClassName('inputtext _55r1 _6luy')[0]");
//		WebElement passwor=(WebElement) jsExecute.executeScript("return document.getElementsByName(\"pass\")[0]");
//		Actions actions =new Actions(driver);	
//		Thread.sleep(3000);
//		actions.moveToElement(usernam).click().sendKeys("wolfyearsbook@gmail.com")
//		.moveToElement(passwor).click().sendKeys("Wolfyears1996").perform();
//		WebElement clickk=(WebElement)jsExecute.executeScript("return document.getElementsByName(\"login\")[0].click()"); 
		
	
	}		
}
