package com.class_practicing;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class ExplicitWait extends CommonMethods{

	public static void main(String[] args) {
//		TC 1: Verify element is present
//		Open chrome browser
//		Go to “https://the-internet.herokuapp.com/”
//		Click on “Click on the “Dynamic Loading” link
//		Click on “Example 1...” and click on “Start”
//		Verify element with text “Hello World!” is displayed
	
		setUp("chrome","https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//button")).click();
		
		String expectedText="Hello World!";
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[text()='Hello World!']")));
		
		boolean isDisplayed=driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed();
		String actualText=driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText();
		
		
		if(actualText.equals(expectedText)){
			System.out.println("TestCase is PASS");
		}else {
			System.out.println("TestCase is FAIL");
		}
		
		driver.quit();
		

		
		
		
		
		
		
	}

}
