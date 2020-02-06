package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase extends WebElementsCommandsDemo1{

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nesli\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get(URL);
	driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("VanEarl");
	driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("VanEarl@&12");
	driver.findElement(By.cssSelector("input[name='Submit']")).click();
	WebElement syntax=driver.findElement(By.cssSelector("img[height='56']"));
	System.out.println(syntax.isDisplayed());
	
	
	
	}

}
