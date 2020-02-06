package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class DynamicTableDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
//NAVIGATE TO THE Weborders
//LOGIN INTO WEBORDERS
//CLICK CHECKBOX NEXT TO Bob feather

		setUp("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		String expectedValue="Bob Feather";
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

		for (int i = 1; i < rows.size(); i++) {

			String rowText = rows.get(i - 1).getText();

			// System.out.println(rowText);

			if (rowText.contains(expectedValue)) {

				driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + i + "]/td[1]"))
						.click();

			}
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
