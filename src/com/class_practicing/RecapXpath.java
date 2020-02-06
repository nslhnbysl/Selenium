package com.class_practicing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class RecapXpath extends CommonMethods{

	public static void main(String[] args) {

		CommonMethods.setUp("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");	
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("VanEarl");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("VanEarl@&12");
		driver.findElement(By.xpath("//input[@class='button']")).submit();
		driver.manage().window().maximize(); //manage the screen settings with those methods
		
		WebElement syntax=driver.findElement(By.xpath("//img[@width='283']"));
		System.out.println(syntax.isDisplayed());
		System.out.println(syntax.isEnabled());
		System.out.println(syntax.isSelected());
		
		
	}

}
