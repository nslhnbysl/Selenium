package com.class_practicing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class ExplicitWait2 extends CommonMethods {

	public static void main(String[] args) {
//		TC 3: Verify element is enabled
//		Open chrome browser
//		Go to “https://the-internet.herokuapp.com/”
//		Click on “Click on the “Dynamic Controls” link
//		Click on enable button
//		Enter “Hello” and verify text is entered successfully
//		Close the browser
		
		
		setUp("chrome","https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		driver.findElement(By.xpath("//button[text()='Disable']")).click();
		WebDriverWait wait1=new WebDriverWait(driver,30);
		//wait1.until(ExpectedConditions.visibilityOfElementLocated(by.))
	}


}
