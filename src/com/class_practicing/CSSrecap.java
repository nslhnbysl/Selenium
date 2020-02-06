package com.class_practicing;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class CSSrecap extends CommonMethods {

	public static void main(String[] args) {

		CommonMethods.setUp("chrome", "https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("baysalneslihan@gmail.com");
		driver.findElement(By.cssSelector("input[data-testid*='pass']")).sendKeys("kmalal");
		driver.findElement(By.cssSelector("input[aria-label$='Log In'")).submit();

	}

}
