package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDown extends CommonMethods{

	public static void main(String[] args) {

	
		CommonMethods.setUp("chrome", "https://www.toolsqa.com/automation-practice-form/");
		//find the dropdown for continents and store it it is just 1 element
		WebElement continentDD=driver.findElement(By.id("continents"));
		
		//we created select objects and we add parameters to continentDD 
		Select obj=new Select(continentDD);
		//and then we can click through methods for 3 options 
		obj.selectByIndex(2);
		obj.selectByValue("AUS");
		obj.selectByVisibleText("Antarctica");
		//obj.deselectAll();
		
		//how we see all options ? 
		//with getOptions(); it will return a list type of WebElement
		
		List<WebElement>listContinent=obj.getOptions();
		
		//print how many element inside the list 
		
		System.out.println(listContinent.size());
		
	
		//print all elements inside Continent dropdowns list
		
		
		for(WebElement DDloop:listContinent) {
			System.out.println(DDloop.getText());
			System.out.println(DDloop.getAttribute("value"));
		}
			driver.quit();
		
	}

}
