package com.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class TestCaseWebTable extends CommonMethods{

	public static void main(String[] args) {
		//TC 1: Table headers and rows verification

//      Open chrome browser
//      Go to “http://166.62.36.207/syntaxpractice/”
//		Click on “Table” link
//		Click on “ITable Data Search” link
//		Verify second table consist of 4 rows and 5 columns
//		Print name of all column headers 
//		Print data of all rows
//		Quit Browser

		setUp("chrome",Constants.SYNTAX_PRACTICE_URL);
		
		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
		//all column header
		List<WebElement>cols=driver.findElements(By.xpath("//table[@class='table']/thead[2]/tr/th"));
		System.out.println("Size of  colums are="+cols.size());
		
		Iterator<WebElement>it=cols.iterator();
		while(it.hasNext()) {
			String text=it.next().getText();
			System.out.println(text);
		}
		
		//data of all rows
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		
		System.out.println("Size of body colums are="+rows.size());
		for(WebElement row:rows) {
			System.out.println(row.getText());
		}
		
		System.out.println("Printing data cell by cell");
		/*//table[@class='table']/tbody/tr/td
		 * 1-//table[@class='table']               -->table element
		 * 2-//table[@class='table']/tbody         -->from table going inside tbody
		 * 3-//table[@class='table']/tbody/tr      -->from tbody going into rows(not specific)
		 * 4-//table[@class='table']/tbody/tr/td   -->going into table data-->cell
		 */
		
		List<WebElement>cells=driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td"));
		for(WebElement cell:cells) {
			String text=cell.getText();
			System.out.println(text);
		}
		
		
		System.out.println("Printing data cell by cell using for loop===========");
		for(int i=1;i<=rows.size();i++) {
			for(int y=1;y<=cols.size();y++) {
			String cell=driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+i+"]/td["+y+"]")).getText();
			System.out.println(cell);
			
			}
		}
		driver.quit();
	}

}
