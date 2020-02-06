package com.class_practicing;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Calender extends CommonMethods{

	public static void main(String[] args) {
//navigate to https://www.expedia.com/
//and make a reservation 
		
	setUp("chrome","https://www.expedia.com/");
	driver.findElement(By.xpath("//input[@class='clear-btn-input gcw-storeable text gcw-origin gcw-required gcw-distinct-locations']")).sendKeys("Dulles");
	driver.findElement(By.xpath("//input[@placeholder='Hotel name, city or airport']")).sendKeys("Miami");
	
	driver.findElement(By.xpath("//input[@id='package-departing-hp-package']")).click();
	
		
	}

}
