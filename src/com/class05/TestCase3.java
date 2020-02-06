package com.class05;



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class TestCase3 extends CommonMethods{

	public static void main(String[] args) {

		//Open chrome browser
		//go to the https://www.amazon.com/
		//using iterator for get all links 
		//get number of links that has text
		
		CommonMethods.setUp("chrome", "https://www.amazon.com/");
		List<WebElement>lists=driver.findElements(By.tagName("a"));
		
		System.out.println(lists.size());
		int total=0;
		
		Iterator<WebElement> it=lists.iterator();
		
		while(it.hasNext()) {
			String next=it.next().getText();
		
			if(!next.isEmpty()) {
				System.out.println(next);
				total++;
			}
		}
		System.out.println(total);
		driver.close();
		
	}

}
