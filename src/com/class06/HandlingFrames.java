package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class HandlingFrames extends CommonMethods {

	public static void main(String[] args) {
		CommonMethods.setUp("chrome", " http://166.62.36.207/syntaxpractice/index.html");

//click dropdown and then choose iframe	
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Others")).click();
		driver.findElement(By.linkText("Iframe")).click();

		String mainWText = driver.findElement(By.xpath("//h2[text()='IFrame practice']")).getText();

//main window text
		System.out.println("This text is from main window: " + mainWText);

		WebElement frame=driver.findElement(By.cssSelector("a.enroll-btn"));
		
		driver.switchTo().frame(frame);
		driver.findElement(By.linkText("Enroll Today")).click();
		
		
	}
}
