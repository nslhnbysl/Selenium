package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
import com.utils.Constants;

public class ExplicitWaitDemo extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * navigate to the page click on others select dynamic data loading click get
		 * new user verify/validate that first name element is displayed
		 */

		setUp("chrome", Constants.SYNTAX_PRACTICE_URL);
		driver.findElement(By.linkText("Others")).click();
		driver.findElement(By.linkText("Dynamic Data Loading")).click();
		driver.findElement(By.id("save")).click();

		// webdriver wait or explicit wait-->wait for specific element to appear on the
		// it will wait until excepted condition is met or the specified time

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[starts-with(text(), 'First Name')]")));

		boolean displayed = driver.findElement(By.xpath("//p[starts-with(text(), 'First Name')]")).isDisplayed();
		if (displayed) {
			System.out.println("Pass");
		} else {
			System.out.println("Failed");
		}
		//driver.quit();
	}

}
