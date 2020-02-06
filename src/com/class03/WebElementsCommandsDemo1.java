package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommandsDemo1 {

	public static final String URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(URL);
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']")); 
		//we stored element of userName its gonna be easy and more clear
		
		userName.sendKeys("Neslihan"); //we added userName through sendKeys 
		Thread.sleep(2000);
		userName.clear();             //we cleared previous value and we can add another name 
		userName.sendKeys("VanEarl");
		
		driver.findElement(By.xpath("")).sendKeys("ad123");
				//span[@id=‘spanMessage’]
				driver.findElement(By.xpath("//input[@type=‘submit’]")).click();
				//storing the error message element
				WebElement errorMessage=driver.findElement(By.xpath("span[@id=‘spanMessage’]"));
				//will return either true or false
				System.out.println(errorMessage.isDisplayed());
				String errorMsg=errorMessage.getText();
				if(errorMessage.isDisplayed()) { //checking if the error message is display
					String message=errorMessage.getText();//get visibale text from error message
					if(message.equals("Invalid credentials")) {//compare the text with expected  
						System.out.println("Correct error Mesaage is Display");
					}else {
						System.out.println("Incorect error Message is Display");
					}
		
	}
	}
}
