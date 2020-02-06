package com.class_practicing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class WebTableDynamic extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		//NAVIGATE TO THE Weborders
		//LOGIN INTO WEBORDERS
		//CLICK CHECKBOX NEXT TO Samuel Clemens
		
		setUp("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
		System.out.println("Table rows size is "+rows.size());
		
		String expectedName="Samuel Clemens";
		
		
		for(int i=1;i<=rows.size();i++) {
			if(rows.get(i-1).getText().contains(expectedName)) {
				System.out.println("Found the name successfully");
				driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + i +"]/td[1]")).click();
				
			}
		}
		//driver.quit();
		Thread.sleep(3000);
	}

}
