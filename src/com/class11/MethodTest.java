package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class MethodTest extends CommonMethods{

	public static void main(String[] args) {

		setUp("chrome","https://expedia.com");
		
		scrollDown(1000);
		
		scrollUp(500);
		
		WebElement el=driver.findElement(By.xpath("//div[@id='partner-add-hotel-container']/a"));
		scrollIntoElement(el);
		driver.quit();
		
		
	}

}
