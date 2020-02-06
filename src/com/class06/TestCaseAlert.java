package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseAlert {

	public static void main(String[] args) {
//		TC 1: JavaScript alert text verification
//		1.Open chrome browser
//		2.Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//		3.Click on “Alerts & Modals” links
//		4.Click on “Javascript Alerts” links
//		5.Click on button in “Java Script Alert Box” section
//		6.Verify alert box with text “I am an alert box!” is present
//		7.Click on button in “Java Script Confirm Box” section
//		8.Verify alert box with text “Press a button!” is present
//		9.Click on button in “Java Script Alert Box” section
//		10.Enter text in the alert box
//		11.Quit browser

System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
driver.manage().window().maximize();
driver.findElement(By.linkText("Alerts & Modals")).click();
driver.findElement(By.linkText("Javascript Alerts")).click();
WebElement alertBox=driver.findElement(By.xpath("//button[text()='Click me!'and @class='btn btn-default']"));
alertBox.click();
Alert selectAlert=driver.switchTo().alert();
String textAlert=selectAlert.getText(); 

if(textAlert.equalsIgnoreCase("I am an alert box!")) {
	selectAlert.accept();
}else {
	selectAlert.dismiss();
}

WebElement confirmAlert=driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
confirmAlert.click();


		









		






//		TC 1: Form Submission
//		1.
//		Open chrome browser
//		2.
//		Go to “http://166.62.36.207/syntaxpractice/”
//		3.
//		Click on “Input Forms” link
//		4.
//		Click on “Input Form Submit” link
//		5.
//		Using different locator submit the form and click on “Send” 
//		button
//		6.
//		Quit the browser
//		Test Case




	
	}

}
