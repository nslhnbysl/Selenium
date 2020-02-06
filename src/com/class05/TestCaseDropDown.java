package com.class05;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class TestCaseDropDown extends CommonMethods {

	public static void main(String[] args) {
/*open chrome browser 
 * go to "https://www.facebook.com"
 * Verify;
 * -month dd has 12 month options 
 * -day dd has 31 day options
 * -year dd has 115 year options 
 * Select your date of birth
 * seleckt female option(checkboxes) 
 * Quit browser
 */
		
		CommonMethods.setUp("chrome", "https:www.facebook.com");
		
		WebElement monthDD=driver.findElement(By.id("month"));
		
		Select obj=new Select(monthDD);
		
		List<WebElement>listMonth=obj.getOptions();
		System.out.println(listMonth.size());
		int sizeMonth=listMonth.size();
		for(WebElement list:listMonth ) {
			if(list.isEnabled()==true) {
				System.out.println("The text of element= "+list.getText()+" is enabled");
				
			}else {
				System.out.println("The text of element= "+list.getText()+" is NOT enabled");
			
			}
		}
		obj.selectByValue("5");
		
		WebElement dayDD=driver.findElement(By.id("day"));
		Select objD=new Select(dayDD);
		objD.selectByVisibleText("24");
		
		WebElement yearDD=driver.findElement(By.id("year"));
		Select objy=new Select(yearDD);
		objy.selectByValue("1990");
		
		//radiobutton 
		
		driver.findElement(By.cssSelector("input[value='1']")).click();
		
		driver.quit();
		
	}

}
