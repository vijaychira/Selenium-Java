package com.seleniumPractice;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Base64;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotBase64 {
	static WebDriver driver;
	static String url="https://www.subzero-wolf.com/";
	@Test(priority = 1,enabled = true)
	public void alerts()throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cop=new ChromeOptions();
		cop.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		driver=new ChromeDriver(cop);
		driver.manage().window().maximize();
		driver.get(url);
		TakesScreenshot ts=(TakesScreenshot)driver;
	    String base64= ts.getScreenshotAs(OutputType.BASE64);
		byte[] boom=Base64.getDecoder().decode(base64);
		File destFile=new File(".//screenshots//wolf.jpg");
		FileOutputStream fos=new FileOutputStream(destFile);
		fos.write(boom);
		fos.flush();
		Thread.sleep(3000);
		fos.close();
		driver.close();
	}
}
