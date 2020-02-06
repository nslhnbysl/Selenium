package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nesli\\eclipse-workspace\\Sample\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		final String expectedTitle="Google";
	    String actualTitle=driver.getTitle();
	    
	    if(expectedTitle.equals(actualTitle)) {
	    	System.out.println("I am on the right page");
	    }else {
	    	System.err.println("The actual and expected title did not match");
	    }
		System.out.println("****************");
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		String expectedUrl="https://www.google.com";
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("Both Url matched");
		}else {
			System.err.println("Actual and expected not matched");
		}
		
	}

}
