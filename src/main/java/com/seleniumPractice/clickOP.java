package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clickOP {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/#");
		Thread.sleep(3000);
		Actions actions=new Actions(driver);
		actions
		.moveToElement(driver.findElement(By.xpath("//a[.='YouTube Courses']")))
		.moveToElement(driver.findElement(By.xpath("//a[.='English']")))
		.moveToElement(driver.findElement(By.xpath("//a[.='CSS Selectors']")))
		.click()
		.perform();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Contact']")).click();
        driver.findElement(By.className("contact-form-name")).sendKeys("God is Good, All the Time");
		Thread.sleep(3000);
		actions.doubleClick(driver.findElement(By.className("contact-form-name"))).click().perform();
		Thread.sleep(3000);
		driver.quit();
	}	
}
