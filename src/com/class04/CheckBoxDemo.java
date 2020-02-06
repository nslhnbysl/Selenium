package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class CheckBoxDemo extends CommonMethods{

	public static void main(String[] args) {

		CommonMethods.setUp("chrome",HRMS_URL);
		driver.manage().window().maximize(); //it allows to open big screen 
		
		WebElement loginBtn=driver.findElement(By.cssSelector("input#btnLogin"));
		
		System.out.println(loginBtn.isEnabled()); //it will return true because this button is enable,is it clickable is it possible to perform it 
		                                          //displayed shows just is there have any for unique things but enable for is it usable clickable ?
		
		
	}

}
