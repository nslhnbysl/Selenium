package com.class06;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class TestCaseFrame extends CommonMethods {
public static void main(String[] args) throws InterruptedException {
	
//	TC 1: Syntax Frame verification
//	1.Open chrome browser
//	2.Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//	3.Click on “Others” link
//	4.Click on “Iframe” link
//	5.Click on the “Home” link inside the one frame
//	6.Verify “Syntax logo” is displayed in another frame
//	7.Quit browser
	
	setUp("chrome","http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
	driver.findElement(By.linkText("Others")).click();
	driver.findElement(By.linkText("Iframe")).click();
	driver.manage().window().maximize();
	
	driver.switchTo().frame("FrameOne");  //switch to oneframe
	driver.findElement(By.linkText("Home")).click();
	Thread.sleep(2000);
	driver.switchTo().defaultContent();  //switch to again webpage
	
	driver.switchTo().frame("FrameTwo"); //swith frame2
	
	boolean isDisplayed=driver.findElement(By.xpath("//img[@alt='Syntax Technologies']")).isDisplayed();
	if(isDisplayed) {
		System.out.println("Syntax logo is Displayed");
	}else {
		System.out.println("Syntax logo is NOT displayed");
	}
	
	driver.quit();
	
	
}
}
