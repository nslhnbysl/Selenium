package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class TestCase extends CommonMethods {

	public static void main(String[] args) {
		//open chrome browser
		//go to https://www.saucedemo.com/
		//enter valid username and valid password and click login
		//verify products text is available next to the robot icon

		CommonMethods.setUp("chrome", "https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
		WebElement login=driver.findElement(By.cssSelector("input.btn_action"));
		login.click();
		WebElement pText=driver.findElement(By.cssSelector("div.product_label"));
		if(pText.isDisplayed()) {
			System.out.println("Product text is displayed");
		}else {
			System.out.println("Product text is NOT displayed");
		}
		List<WebElement>list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		int total=0;
		for(int i=0;i<list.size();i++) {
			String linkT=list.get(i).getText();
			if(!linkT.isEmpty()) {
				System.out.println(linkT);
				total++;
			}
			
		}
		
		System.out.println(total);
		
		driver.close();
	}

}
