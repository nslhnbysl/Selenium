package com.class08HW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class HW4 extends CommonMethods {

	public static void main(String[] args) {
//		TC 1: Table headers and rows verification
//		1.Open chrome browser
//		2.Go to “https://www.aa.com/homePage.do”
//		3.Enter From and To																																								
//		4.Select departure as May 14 of 2020
//		5.Select arrival as November 8 of 2020
//		6.Verify “Choose flights” text is displayed
//		7.Close browser

		setUp("chrome", "https://www.aa.com/homePage.do");
//destinition from
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']")).clear();
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']")).sendKeys("Dulles");
//destination to 
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).sendKeys("JFK");
//choose number of passengers
		WebElement DDnumber = driver.findElement(By.xpath("//select[@name='adultOrSeniorPassengerCount']"));
		Select selectNumber = new Select(DDnumber);
		selectNumber.selectByValue("3");
//select departure day 
		driver.findElement(By.xpath("//input[@id='aa-leavingOn']")).click();

		String departurDate = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[1]")).getText();

		WebElement monthRight = driver.findElement(
				By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']"));
		String rightText = monthRight.getText();
      

		while (!departurDate.equalsIgnoreCase("May")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			departurDate = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[1]")).getText();
		}
		
//in order to click  number of day need to loop webtable cells 
		String expectedDay="24";
		List<WebElement>cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		System.out.println(cells.size());//how many cells do we  have 
		
	for(WebElement cell:cells) {
		if(cell.getText().equals("24")){
			cell.click();
			break;		
		}
	}
	
//
	
	
	
	
	
		
	}

	}


