package com.class08HW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class HW2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
//		TC 2: Table headers and rows verification
//
//		Open chrome browser
//		Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
//		Login to the application
//		Verify customer “Susan McLaren” is present in the table
//		Click on customer details
//		Update customers last name and credit card info
//		Verify updated customers name and credit card number is displayed in table
//		Close browser

		setUp("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
		// System.out.println("_______________Printing table row by // row____________________");
		
		String expectedName = "Susan McLaren";
		String updatedName = "Neslihan Baysal";
		for (int i = 1; i < tableRows.size(); i++) {
			String text = tableRows.get(i - 1).getText();
			if (text.contains(expectedName)) {
				driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + i + "]/td[13]")).click();
				// change the lastname and credit card info
				driver.findElement(By.xpath("//input[@value='Susan McLaren']")).clear();
				driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(updatedName);
				driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
				driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).clear();
				driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("111222333444");
				driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).clear();
				driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("05/05");
				driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
				break;
			}
			// System.out.println(text);
		}

		 tableRows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));//we updated table 
		 for(WebElement tableRow:tableRows) {
			 if(tableRow.getText().contains(updatedName)) {
				 System.out.println("Susan  dead ,Neslihan  born ");
				 break;
			 }
		 }
		Thread.sleep(3000);
		driver.quit();

	}

}
