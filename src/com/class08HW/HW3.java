package com.class08HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class HW3 extends CommonMethods {

	public static void main(String[] args) {
//		TC 3: Leave List Search Validation
//
//		Open chrome browser
//		Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//		Login into the application
//		Select Leave List
//		Select from December 1, 2019 until January 31, 2020
//		Check only Pending approval
//		Click on Search
//		Validate “No Records Found” is displayed
//		Quit the browser
		
	
		setUp("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).click();
		driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveList']")).click();
		
		
		
		
}

}
