package com.seleniumPractice;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EX {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Duration duration=Duration.ofSeconds(10); 
		WebDriverWait wait=new WebDriverWait(driver,duration);
		System.out.println(wait.toString());
	}
}
