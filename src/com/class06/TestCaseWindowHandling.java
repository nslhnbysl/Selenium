package com.class06;

import java.util.Set;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class TestCaseWindowHandling extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
//		TC 1: Windows Handling
//		1.Open chrome browser
//		2.Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//		3.Click on “Javascript Alerts” link
//		4.Click on “Window Popup Modal” link
//		5.Click on the “ Follow On Instagram” button
//		6.Verify title of the page is “Syntax Technologies (@syntaxtechs) 
//		• Instagram photos and videos” 
//		7.Click on the “Like us On Facebook ” button
//		8.Verify title of the page is “Go to Facebook Home” 
//		9.Quit the browser
//		NOTE: Selenium execution could be too fast, please use 
//		Thread.sleep

		setUp("chrome","http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Alerts & Modals']")).click();
		driver.findElement(By.linkText("Window Popup Modal")).click();
		//I stored main window
		String mainWindow=driver.getWindowHandle();
		//I opened multiple windows 
		driver.findElement(By.xpath("//a[text()='  Follow On Instagram ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Like us On Facebook")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();
		Thread.sleep(1000);
		
		Set<String>windows=driver.getWindowHandles();
		Thread.sleep(1000);
		System.out.println("We have "+windows.size()+"browsers");
		Thread.sleep(1000);
		for(String list:windows) {
			if(!list.equals("mainWindow")) {
				driver.switchTo().window(list);
				Thread.sleep(1000);
				driver.getTitle();
				Thread.sleep(1000);
				
				driver.quit();
				Thread.sleep(1000);
				driver.switchTo().window(mainWindow);
				Thread.sleep(1000);
			}
		}

	}

}
