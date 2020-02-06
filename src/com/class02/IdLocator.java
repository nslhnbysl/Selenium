package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("VanEarl");
		
		driver.findElement(By.name("txtPassword")).sendKeys("VanEarl@&12");
		
		driver.findElement(By.className("button")).click();
		Thread.sleep(2000); //we add this because selenium is very fast when we click button at that moment will try to find welcome van but it will not upload 
		                    //because of this reason we sleep the execution 2 second for full uploading 
		//driver.findElement(By.linkText("Welcome Van")).click();
		driver.findElement(By.partialLinkText("Welcome")).click();//this partiallinktext very important because if we write another username and password it will work
		                                                          //but if we try to run after another credentials welcome Van  it will not work because name was changed
		                                                          //we use partiallinktext and write welcome all users have welcome part and it will work for all 
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		//driver.close();
		
		
		
	}

}
