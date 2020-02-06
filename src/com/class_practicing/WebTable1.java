package com.class_practicing;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class WebTable1 extends CommonMethods{

	public static void main(String[] args) {
		//TC 1: Table headers and rows verification

//      Open chrome browser
//      Go to “http://166.62.36.207/syntaxpractice/”
//		Click on “Table” link
//		Click on “ITable Data Search” link
//		Verify first table 
//		Print name of all column headers 
//		Print data of all rows
//		Quit Browser
		
		setUp("chrome",Constants.SYNTAX_PRACTICE_URL);
		
		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
		//print data of all rows 
		System.out.println("Printing all rows");
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		System.out.println("The table rows size is "+rows.size());
		Iterator<WebElement>rowsIt=rows.iterator();
		while(rowsIt.hasNext()) {
			WebElement next=rowsIt.next();
			System.out.println(next.getText());
		}
		//print rows cell by cell
		System.out.println("Printing data rows cell by cell");
		List<WebElement>rowsCell=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td"));
		for(WebElement rowsCells:rowsCell) {
			System.out.println(rowsCells.getText());
		}
		System.out.println();
		//print name of all columns header 
		System.out.println("Printing whole header");
		
		WebElement header=driver.findElement(By.xpath("//table[@id='task-table']/thead/tr"));
		
		System.out.println(header.getText()); //we print whole line of header 
		
		//print header cell by cell
		System.out.println("Printing header cell by cell");
		List<WebElement>cols=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
	
		for(WebElement col:cols) {
			String headerT=col.getText();
			System.out.println(headerT);
		}
		
	driver.quit();
	
	}

}
