package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class TestCaseHW extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
//		TC 2: Verify element is clickable
//		Open chrome browser
//		Go to “https://the-internet.herokuapp.com/”
//		Click on “Click on the “Dynamic Controls” link
//		Select checkbox and click Remove
//		Click on Add button and verify “It’s back!” text is displayed
//		Close the browser 

		
		
	setUp("chrome","https://the-internet.herokuapp.com/");
	
	driver.findElement(By.linkText("Dynamic Controls")).click();
	driver.findElement(By.xpath("//input[@label='blah']")).click();

	driver.findElement(By.xpath("//button[text()='Remove']")).click();
	
	WebDriverWait wait=new WebDriverWait(driver,30);
	
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
	
	driver.findElement(By.xpath("//button[text()='Add']")).click();
	
    WebDriverWait wait1=new WebDriverWait(driver,30);
	
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
		String expectedText="It's back!";
		boolean displayGone=driver.findElement(By.xpath("//p[@id='message']")).isDisplayed();
		String actualText=driver.findElement(By.xpath("//p[@id='message']")).getText();
		
		if(actualText.equals(expectedText)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}	
		
		Thread.sleep(3000);
		driver.quit();
	
	}

}
