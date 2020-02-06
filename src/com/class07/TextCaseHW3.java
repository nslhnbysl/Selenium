package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class TextCaseHW3 extends CommonMethods {

	public static void main(String[] args) {
//		TC 1: Add Employee
//
//		Open chrome browser
//		Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//		Login into the application
//		Add Employee
//		Log out 
//		Quit the browser

		setUp("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.findElement(By.id("txtUsername")).sendKeys("Syntax");
		driver.findElement(By.id("txtPassword")).sendKeys("Syntax123!");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Walter");
		driver.findElement(By.id("lastName")).sendKeys("White");

		driver.findElement(By.cssSelector("input[value='Save']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='Personal Details']")));

		boolean displayed = driver.findElement(By.xpath("//h1[text()='Personal Details']")).isDisplayed();

		if (displayed) {
			System.out.println("The employee added successfully");
		} else {
			System.out.println("The employee adding was failed");
		}

		driver.findElement(By.linkText("Logout")).click();
		driver.quit();

	}

}
