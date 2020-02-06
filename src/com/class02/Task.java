package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		// Mercury Tours Registration: 
		//Open chrome browser
	    //Go to “http://newtours.demoaut.com/”
		//Click on Register Link
		//Fill out all required info
		//Click Submit
		//User successfully registered
		//(Create 2 scripts using different locators)
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Walter");
		driver.findElement(By.name("lastName")).sendKeys("White");
		driver.findElement(By.name("phone")).sendKeys("coolvanlife");
		driver.findElement(By.id("userName")).sendKeys("whitewalter908765@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("portlight dr.");
		driver.findElement(By.name("city")).sendKeys("Orlando");
		driver.findElement(By.name("state")).sendKeys("Florida");
		driver.findElement(By.name("postalCode")).sendKeys("93839");
		driver.findElement(By.name("country")).sendKeys("UNITED STATES");
		
		
	}

}
