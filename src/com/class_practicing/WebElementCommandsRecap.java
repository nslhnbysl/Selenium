package com.class_practicing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class WebElementCommandsRecap extends CommonMethods{

	public static void main(String[] args) {

		CommonMethods.setUp("chrome", "https://maidsprime.com/");
		driver.manage().window().maximize();
		WebElement image=driver.findElement(By.cssSelector("img[alt='Home Cleaning & Maid Service – MaidsPrime']"));
		System.out.println(image.isDisplayed());
		System.out.println(image.isEnabled());
		System.out.println(image.isSelected());
		System.out.println(image.getAttribute("alt")); //we gave a attribute name it printed attribute value 
		
		
		driver.findElement(By.linkText("Contact")).click();
		driver.findElement(By.xpath("//input[contains(@class,'form-control input-lg')]")).sendKeys("Neslihan");
		
	}

}
