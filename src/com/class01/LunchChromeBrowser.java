package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
        //system is a class.setproperty() is a static method with 2 parameters
		                     //key                      //value
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nesli\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
//reference interface nameofobj keyword   constructor
		WebDriver      driver=   new      ChromeDriver();
		
		//http-->hypertext transfer protocol source 
		driver.get("https://www.google.com");
		Thread.sleep(2000); //after 2 seconds open google it will open syntax page
		
		//browser navigation commands.
		driver.navigate().to("http://www.amazon.com"); //it will open(navigate)after google
		driver.navigate().back(); //when we use back the page will back google             it will navigate back
		driver.navigate().forward(); //another way to go previous page we use .forward();  it will navigate one step forward
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		
		
		driver.close();//it will close all pages then accessed
		
		
	}

}
