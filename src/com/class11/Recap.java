package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;

public class Recap extends CommonMethods{

	public static void main(String[] args) {

//navigate to google and search for specific item
		
		
	setUp("chrome","https://google.com");
	
	driver.findElement(By.name("q")).sendKeys("iphone 11 pro",Keys.ESCAPE);
	
	Actions act=new Actions(driver);
	//identify an element 
	
	WebElement button=driver.findElement(By.name("btnK"));
	//1 way --move to the desire element and perform click
	//act.moveToElement(button).click().perform();
	//2 way --click and specify the element on which to click 
	act.click().perform();
	
	driver.quit();
		
	}

}
