package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskAmazon {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\nesli\\\\eclipse-workspace\\\\Sample\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		String getT=driver.getTitle();
		System.out.println(getT);
		driver.close();
	}

}
