package com.class07;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;

import com.utils.CommonMethods;
import com.utils.Constants;

public class FluentWaitDemo extends CommonMethods{

	public static void main(String[] args) {
		setUp("chrome", Constants.SYNTAX_PRACTICE_URL);
		driver.findElement(By.linkText("Others")).click();
		driver.findElement(By.linkText("Dynamic Data Loading")).click();
		driver.findElement(By.id("save")).click();
		
//		FluentWait wait = new FluentWait(driver);
//		wait.withTimeout(45, TimeUnit.SECONDS);
//		wait.pollingevery(5, TimeUnit.SECONDS);
//		wait.ignoring(NoSuchElementException.class);






	
	}

}
