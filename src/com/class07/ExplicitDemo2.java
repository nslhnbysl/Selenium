package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.utils.CommonMethods;

public class ExplicitDemo2 extends CommonMethods {

	public static void main(String[] args) {
/*navigate to google
 * search for "wegmans"
 * click on the "Wegmans Grocery Delivery | Powered By Instacart"
 * once we redirected to the site click "Log In"
 */
		setUp("chrome","https://google.com");
		driver.findElement(By.name("q")).sendKeys("Wegmans",Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='Wegmans Food Markets - Fresh Groceries & Delicious Meals']")).click();
		driver.findElement(By.id("sign-in")).click();
	
		
	}
}
