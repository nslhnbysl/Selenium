package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class TestCase2 extends CommonMethods {

	public static void main(String[] args) {

		//open chrome browser
		//go to https://www.saucedemo.com/
		//enter invalid username and invalid password and click login
		//verify error message contains;"Username and password do not match any user in this service
		
		CommonMethods.setUp("chrome", "https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("standard");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret");
		driver.findElement(By.cssSelector("input.btn_action")).click();
		WebElement error=driver.findElement(By.xpath("//h3[@data-test='error']"));
		boolean display=error.isDisplayed();
		String actualT=error.getText();
		String expectedT="Username and password do not match any user in this service";
		
		if(display && expectedT.equalsIgnoreCase(actualT)) {
			System.out.println("Error is displayed and text is "+actualT);
		}else {
			System.out.println("Error is not displayed");
		}
		
		
	}

}
