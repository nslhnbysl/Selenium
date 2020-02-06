package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class TestCaseWebTable2 extends CommonMethods{

	public static void main(String[] args) {

//		TC 1: Table headers and rows verification
//
//		Open chrome browser
//		Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
//		Login to the application
//		Verify customer “Susan McLaren” is present in the table
//		Click on customer details
		
		
		setUp("chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//ROWS
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		System.out.println("The size of rows are="+rows.size());
		//COLUMNS
		List<WebElement>cols=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/th"));
		System.out.println("The size of columns are="+cols.size());
		
		String expectedVal="Susan McLaren";
		
		for(int i=1;i<=rows.size();i++) {
		String text= rows.get(i-1).getText();
		if(text.contains(expectedVal)) {
			driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]/th[13]")).click();
		break;
		}
		}
		
	}

}
