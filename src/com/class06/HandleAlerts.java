package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="http://www.rediff.com/";
	driver.get(url);
	//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.MILLISECONDS);
	//click sign in 
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	//click go button
	driver.findElement(By.xpath("//input[@title='Sign in']")).click();
	//after the click alert window is opened and we switch the screen to alert
	Alert alert=driver.switchTo().alert();
	//we get the text of alert
	String alertText=alert.getText();
	System.out.println("The alert text is ="+alertText);
	Thread.sleep(2000);
	//we accept alert and then it close
	alert.accept();
	driver.close();
	
	}

}
