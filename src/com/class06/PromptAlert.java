package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
driver.manage().window().maximize();
//to find with text() through xpath we can add * instead of tagName 

driver.findElement(By.xpath("//*[text()='Prompt Pop up']")).click();

Alert alert=driver.switchTo().alert();


String alertText=alert.getText();
System.out.println(alertText);
		
	}

}
