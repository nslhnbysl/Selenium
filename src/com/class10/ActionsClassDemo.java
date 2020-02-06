package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;
import com.utils.Constants;

public class ActionsClassDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
/*navigate to hrms app enter username and password
 * click on login using mouse
 */
	
	setUp("chrome",Constants.HRMS_URL);
	
	driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		
	driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");	
	
	//to perform mouse or keyboard operation we need to have an object on the actions class
	Actions act=new Actions(driver);
	//identify an element on which to perform mouse click
	WebElement loginBtn=driver.findElement(By.cssSelector("input#btnLogin"));
	
	//do right click
	act.moveToElement(loginBtn).contextClick().perform();
	//to perform a click
	act.moveToElement(loginBtn).click().perform();
	//to perform double click
	//act.moveToElement(loginBtn).doubleClick().perform();
	//hover over the element(elementin ustune mouse ile gelmek)
	WebElement pimLink=driver.findElement(By.linkText("PIM"));
	act.moveToElement(pimLink).perform();
	//click on the add employee link
	WebElement addEmp=driver.findElement(By.linkText("Add Employee"));
	act.click(addEmp).perform();
	
	
	Thread.sleep(5000);
	//driver.quit();
		
	}

}
