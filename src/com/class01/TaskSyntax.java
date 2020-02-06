package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskSyntax {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\nesli\\\\eclipse-workspace\\\\Sample\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.syntaxtechs.com/");
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().refresh();
		
		String cUrl=driver.getCurrentUrl();
		if(cUrl.contains("Syntax")) {
			System.out.println("Valid url");
		}else {
			System.out.println("Unvalid url");
		}
		driver.close();
		
	}

}
