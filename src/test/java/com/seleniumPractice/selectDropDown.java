package com.seleniumPractice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectDropDown {
	static WebDriver driver;
	static String url="https://www.hyrtutorials.com/";
	@Test(priority = 1,enabled = true)
	public void geturl()throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cop=new ChromeOptions();
		cop.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		driver=new ChromeDriver(cop);
		driver.manage().window().maximize();
		driver.get(url);
		Actions actions=new Actions(driver);
		WebElement options=driver.findElement(By.xpath("//a[.='Selenium Practice']"));
		actions.moveToElement(options).perform();
		Thread.sleep(3000);
		actions.moveToElement(driver.findElement(By.xpath("//a[.='Dropdowns']"))).click().perform();
		driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement course= driver.findElement(By.id("course"));
		Select courseName=new Select(course);
		List<WebElement>courseOptions=courseName.getOptions();
		for(WebElement CourseOption:courseOptions) {
			System.out.println(CourseOption.getText());
		}
		courseName.selectByVisibleText("Python");
		System.out.println("------------------------");
		WebElement ide=driver.findElement(By.id("ide"));  //IDE dropDownoptions from the browser
		Select ideName=new Select(ide);
		List<WebElement>ideOptions=ideName.getOptions();
		for(WebElement ideOption:ideOptions) {
			System.out.println(ideOption.getText());
		}	
		System.out.println("---------------------");
		System.out.println("Only selected opitons");
		ideName.selectByIndex(0);
		ideName.selectByIndex(1);
		List<WebElement>ideselectedOptions=ideName.getAllSelectedOptions();
		for(WebElement ideOption:ideselectedOptions) {
			System.out.println(ideOption.getText());
		}	
		driver.quit();
	}
}
