package com.seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wolf {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement coursedropdown=driver.findElement(By.id("course"));
		Select couresedropdownoptions =new Select(coursedropdown);
		List<WebElement> consoleOptions=couresedropdownoptions.getOptions();
		for(WebElement w:consoleOptions) {
			System.out.println(w.getText());}
		couresedropdownoptions.selectByIndex(2);
		Thread.sleep(3000);
		couresedropdownoptions.selectByValue("java");
		Thread.sleep(3000);
		couresedropdownoptions.selectByVisibleText("Python");
		Thread.sleep(3000);
		driver.navigate().to("https://www.hyrtutorials.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);
		WebElement multidropdown=driver.findElement(By.id("ide"));
		Select multidownoptions =new Select(multidropdown);
		List<WebElement> consolemultiOptions=multidownoptions.getOptions();
		for(WebElement w:consolemultiOptions) {
			System.out.println(w.getText());}
		multidownoptions.selectByIndex(2);
		Thread.sleep(3000);
		multidownoptions.selectByValue("ec");
		Thread.sleep(3000);
		multidownoptions.selectByVisibleText("IntelliJ IDEA");
		Thread.sleep(3000);
		
		List<WebElement> consolemultiselectedOptions=multidownoptions.getAllSelectedOptions();
		for(WebElement w:consolemultiselectedOptions) {
			System.out.println(w.getText());}
		multidownoptions.deselectByVisibleText("IntelliJ IDEA");
		Thread.sleep(3000);
		multidownoptions.deselectAll();
		Thread.sleep(3000);
		driver.quit();
		
		}
	}
