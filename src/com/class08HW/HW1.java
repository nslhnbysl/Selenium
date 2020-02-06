package com.class08HW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class HW1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
//
//		TC 1: Delete Employee
//
//		Open chrome browser
//		Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//		Login into the application
//		Add Employee
//		Verify Employee has been added
//		Go to Employee List
//		Delete added Employee
//		Quit the browser

		setUp("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Neslihan");
		driver.findElement(By.id("lastName")).sendKeys("Baysal");
		driver.findElement(By.id("btnSave")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='Personal Details']")));
		String enterValue = "Neslihan";
		// store an employee id
		//String id = driver.findElement(By.id("employeeId")).getAttribute("value");
		String displayValue = driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']"))
				.getAttribute("value");

		if (enterValue.equals(displayValue)) {
			System.out.println("Employee added successfully");
		} else {
			System.out.println("Employee Not added ");
		}

		// navigate to the employee list

		driver.findElement(By.linkText("Employee List")).click();

		// define the flag variable

		boolean found = false;

		while (!found) {

			// Get all rows from  the employee list

			List<WebElement> rows_f = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

			for (int i = 1; i <= rows_f.size(); i++) {

				// get text from each row

				String rowsText = rows_f.get(i - 1).getText();

				// verify if row contains employee id

				if (rowsText.contains(displayValue)) {

					// change the flag variable

					found = true;

					// deleting an employee

					driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1]")).click();

					Thread.sleep(5000);

					driver.findElement(By.id("btnDelete")).click();

					Thread.sleep(5000);

					driver.findElement(By.id("dialogDeleteBtn")).click();
					System.out.println("Employee deleted successfully");

					break;

				}

			}

			// if emp id was not found in the first page --> click next

			driver.findElement(By.xpath("//a[text()='Next']")).click();

		}

		driver.quit();

	}

}
