package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;
/*navigate to the hrms
 * enter uid and pwd
 * click on login btn using JSExecutor
 */

public class JSExecutorDemo extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome",Constants.HRMS_URL);
		
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;  //1st cast the driver object to JavascriptExecutor
		
		WebElement loginBtn=driver.findElement(By.id("btnLogin"));               //identify button element
		js.executeScript("arguments[0].style.backgroundColor='Red'", loginBtn); //make a red button before click
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();", loginBtn);                    //simply click
		Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,250)");                             //scrolling down 
       
		
		
		
		driver.quit();
		
	}

}
