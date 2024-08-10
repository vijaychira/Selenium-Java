package com.seleniumPractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jenkins {

	public static void main(String[] args)throws Exception {
		//		 driver.findElement(By.id("third_date_picker"));
		
		Calendar calendar=Calendar.getInstance();
		try {
	
		String Date="32/Mar/2024";
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MMM/yyyy");
		dateFormat.setLenient(false);
		Date formatDate = dateFormat.parse(Date);
		calendar.setTime(formatDate);
		int targetMonth=calendar.get(calendar.MONTH);
		int targetYear=calendar.get(calendar.YEAR);
		int targetDay=calendar.get(calendar.Day)
		}  
        catch (Exception e) {
			throw new Exception("Hello, sir please enter the valid date");	
		}
	}
}
