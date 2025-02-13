package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class RecapRadioAndCheck extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", "http://166.62.36.207/syntaxpractice/basic-checkbox-demo.html");

		// handle 1 radio or checkbox

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		// handle grpup of radio or checkbox

		List<WebElement> allChBoxes = driver.findElements(By.xpath("//input[@name='tool']"));

		for (WebElement el : allChBoxes) {

			String text = el.getAttribute("value");

			if (text.equals("Selenium IDE")) {

				el.click();

				break;

			}

		}

		Thread.sleep(3000);

		driver.quit();

	}

}
