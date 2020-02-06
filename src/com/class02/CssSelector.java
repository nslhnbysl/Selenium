package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		
		//if we dont use double slash// we understand it is cssselector
		driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("fmkfmlf");
		
		//input#txtUsername  -->only if you have id attribute
		//input.button  -->present class only used for class (if we have space in class value it will not work we must fix it through remove space)
		
		//input[name^='txt'] startswith css selector ^ represent-->startswith
		
		//input[name$='name'] endsWith css selector  $ represent-->endsWith
		
		//input[id*='nL']     * keyword represent contains 
		
		
		
	}

}
