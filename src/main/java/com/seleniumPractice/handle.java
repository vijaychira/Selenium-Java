package com.seleniumPractice;
import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handle {

	public static void main(String[] args)throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.decadeonrestoration.org/types-ecosystem-restoration/forests");
		driver.manage().window().maximize();
		TakesScreenshot tss=(TakesScreenshot)driver;
		File shot=tss.getScreenshotAs(OutputType.FILE);
		File originalshot=new File("./wolf.png");
		
		FileUtils.copyFile(shot, originalshot);
		Thread.sleep(3000);
		driver.quit();
	}
}