package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
	public static String name1="Tester";
	public static String pass="hello";

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		WebElement name=driver.findElement(By.cssSelector("input[id='email']"));
		name.sendKeys("Neslihan");
		Thread.sleep(1000);
		name.clear();
		name.sendKeys(name1);
		WebElement password=driver.findElement(By.cssSelector("input[data-testid='royal_pass']"));
		password.sendKeys(pass);
		
		//when we have just text inside tag we use xpath with text() 
		//for example-->  //h1[text()='hello']
		
		boolean isDisplayed=driver.findElement(By.cssSelector("i[class*='fb_logo']")).isDisplayed();
		
		if(isDisplayed) {
			System.out.println("Facebook logo is displayed");
		}else {
			System.out.println("Facebook lofo is NOT displayed");
		}
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
