package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class TestCase extends CommonMethods{

	public static void main(String[] args) {
//		TC 1: Verify element is present
//		Open chrome browser
//		Go to “https://the-internet.herokuapp.com/”
//		Click on “Click on the “Dynamic Loading” link
//		Click on “Example 1...” and click on “Start”
//		Verify element with text “Hello World!” is displayed
//		Close the browser
		
		setUp("chrome","https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.xpath("//a[contains(text(),'on page')]")).click();
		
		
		driver.findElement(By.xpath("//button")).click();
		System.out.println("Button was clicked");
		String expectedText="Hello World!";
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[text()='Hello World!']")));
		boolean displayedText=driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed();
		String getText=driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText();
		System.out.println(getText);
		if(displayedText) {
			if(getText.equals(expectedText)) {
				System.out.println("PASS");
			}else {
				System.out.println("FAIL");
			}
		}
		
		driver.quit();
		
	}

}
