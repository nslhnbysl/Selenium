package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class RadioButton extends CommonMethods{

	public static void main(String[] args) {
//for choose radio button we use id same thing like before 
		CommonMethods.setUp("chrome", "https://www.toolsqa.com/automation-practice-form/");
		WebElement RadioBMale=driver.findElement(By.id("sex-1"));
		
		System.out.println(RadioBMale.isDisplayed());//true
		System.out.println(RadioBMale.isEnabled());  //true
		System.out.println(RadioBMale.isSelected()); //false
		//1st way clicking on the element
		RadioBMale.click();
		System.out.println(RadioBMale.isSelected()); //true
		//2nd way-preffered  way
		String valueToSelect="Automation Tester";
		List<WebElement>professionList=driver.findElements(By.name("profession"));
		System.out.println(professionList.size());
		
		for(WebElement profession:professionList) {
			String value=profession.getAttribute("value");
			if(value.equals(valueToSelect)) {
				profession.click();
			}
		}
		
		driver.quit();
	}

}
