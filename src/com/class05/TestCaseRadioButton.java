package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class TestCaseRadioButton extends CommonMethods {

	public static void main(String[] args) {

		CommonMethods.setUp("chrome", "https://www.toolsqa.com/automation-practice-form/");

		/*
		 * FillOut; firstName/lastName check that sex radio buttons are enabled and
		 * select "Female" Check all years of experience radio buttons are clickable
		 * Select both check boxes for profession check all automation tools checkboxes
		 * are clickable and keep selenium webdriver option as selected
		 */

		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Neslihan");
		driver.findElement(By.cssSelector("input#lastname")).sendKeys("Baysal");
		List<WebElement> sexList = driver.findElements(By.cssSelector("input[name='sex']"));
		String expected = "Female";

		for (WebElement list : sexList) {
			if (list.isEnabled()) {
				if (list.getAttribute("value").equalsIgnoreCase(expected)) {
					list.click();

				}
			}
		}
		String expectedVal="4";
		List<WebElement>experienceList=driver.findElements(By.cssSelector("input[name='exp']"));
		for(WebElement eList:experienceList ) {
			if(eList.isEnabled()) {
				if(eList.getAttribute("value").equals(expectedVal)) {
					eList.click();
				}
			}
		}
		
		driver.findElement(By.cssSelector("input#datepicker")).sendKeys("12/31/2019");
		driver.findElement(By.cssSelector("input#profession-1")).click();

		//driver.quit();

	}
}
