package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class TestCaseHW2 extends CommonMethods {

	public static void main(String[] args) {
//		TC 3: Verify element is enabled
//		Open chrome browser
//		Go to �https://the-internet.herokuapp.com/�
//		Click on �Click on the �Dynamic Controls� link
//		Click on enable button
//		Enter �Hello� and verify text is entered successfully
//		Close the browser

		setUp("chrome", "https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();

		// Click on enable button

		driver.findElement(By.xpath("//*[@id='input-example']/button")).click();

		// add wait webdriver

		WebDriverWait wait = new WebDriverWait(driver, 30);

		// initialize

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("button[onclick='swapInput()']")));

		// enter "Hello" in the box

		String textToEnter = "Hello";

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(textToEnter);

		// get the value of the text entered.

		String enteredText = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value"); //ASK 

		if (enteredText.equals(textToEnter)) {

			System.out.println("Pass");

		} else {

			System.out.println("Fail");

		}

		driver.close();

	}

}
