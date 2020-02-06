package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utils.CommonMethods;

public class AlertFunctions extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","http://www.rediff.com/");
		
		//click sign in 
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		//click go button
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		//alert displayed
		acceptAlert();
		
		String text=getTextAlert();
		System.out.println(text);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
