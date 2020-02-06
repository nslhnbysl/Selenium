package com.class_practicing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiaBoxTestCase {

	public static void main(String[] args) {
		 
//		1.Open chrome browser
//	    2.Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//		3.Click on “Input Forms” links
//		4.Click on “Checkbox Demo” links
//		5.Click on checkbox inside a single demo section
//		6.Verify checkbox has been clicked successfully
//		7.Click on all checkboxes 1 by 1 in Multiple Checkbox Demo section.
//		8.Quit browser

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		driver.findElement(By.className("dropdown-toggle")).click();

		driver.findElement(By.linkText("Checkbox Demo")).click();
		WebElement singleDemo=driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
		singleDemo.click();
		singleDemo.isSelected();
		
		List<WebElement>listOfRB=driver.findElements(By.xpath("//input[@type='checkbox']"));

System.out.println(listOfRB.size());

for(int i=0;i<listOfRB.size();i++) {
	//String element=listOfRB.get(i).getAttribute("type");
	//System.out.println(element);
	listOfRB.get(i).click();
	
}
		


		


	
	}

}
