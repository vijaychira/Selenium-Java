package com.seleniumPractice;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By.Remotable;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://illustrationagent.com/style/3d-howling-wolf-creature-illustration/");
	   	Thread.sleep(3000);
	   	String base64=driver.getScreenshotAs(OutputType.BASE64);
	   	byte[] brr=Base64.getDecoder().decode(base64);
	   	File dupe=new File("./img5.png");
	   	FileOutputStream fos=new FileOutputStream(dupe);
	   	fos.write(brr);
	   	System.out.println("Wolf image is generated");  
	   	driver.close();
	   	Thread.sleep(3000);
	   
	   	WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver2=new ChromeDriver();	
	   	driver2.manage().window().maximize();
		driver2.get("https://t1.gstatic.com/licensed-image?q=tbn:ANd9GcRJpevBOQMgZ-Gaeb54y2Tin-o5vsoOtYW2nYtCpzkYqtj6ENWsHD4d1Bv-AUymOggA");
	   	Thread.sleep(3000);
	   	String base63=driver2.getScreenshotAs(OutputType.BASE64);
	   	byte[] brrr=Base64.getDecoder().decode(base63);
	   	File dupe1=new File("./img4.jpg");
	   	FileOutputStream fuck=new FileOutputStream(dupe1);
	   	fuck.write(brrr);
	   	System.out.println("Lion image is generated");  
	   	driver2.quit();
	   	fos.close();
	   	fuck.close();
	}
}
