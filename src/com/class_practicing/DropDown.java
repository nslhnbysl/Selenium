package com.class_practicing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class DropDown extends CommonMethods{

	public static void main(String[] args) {

		setUp("chrome","http://166.62.36.207/syntaxpractice/basic-select-dropdown-demo.html");
		
	WebElement DD=driver.findElement(By.xpath("//select[@id='select-demo']"));
	
	Select obj=new Select(DD);
	obj.selectByValue("Tuesday");
	
	List<WebElement>DDoptions=obj.getOptions();
	
	for(WebElement DDoption:DDoptions) {
		String text=DDoption.getText();
		System.out.println(text);	
	}
	
	
//	WebDriverWait wait=new WebDriverWait(driver, 10);
//	wait.until(ExpectedConditions)
	driver.quit();
	
	}

}
