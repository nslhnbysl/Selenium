                   package com.class03;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo2 extends TestCase{

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("VanEarl");
		driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("VanEarl@&12");
		driver.findElement(By.cssSelector("input[name='Submit']")).click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement link:links) {
			if(!link.getText().isEmpty()) {
			System.out.println(link.getText());	
			//System.out.println(link.getSize());
			}
					
		}
	}

}
