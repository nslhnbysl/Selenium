package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
/*
 * navigate to "https://the-internet.herokuapp.com/upload"
 * upload the file
 * verify file is uploaded
 */
public class FileUpload extends CommonMethods{

	public static void main(String[] args) {

		setUp("chrome", "https://the-internet.herokuapp.com/upload");
		
		//to upload file we can use sendkeys method and provide full path to the file
		//full path-->right click on file and open properties copy location of file and then add name of file and add file type
		//for window users \\ or /
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\nesli\\Pictures\\fullsizeoutput_34e3.jpeg");
		//clicking on upload button
		driver.findElement(By.id("file-submit")).click();
		
		WebElement uploaded =driver.findElement(By.xpath("//div[@id='uploaded-files']/preceding-sibling::h3"));
		if(uploaded.isDisplayed()) {
			System.out.println("File successfully uploaded");
		}else {
			System.out.println("File is NOT uploaded");
		}
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File screen=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screen, new File("screenshots/HRMS/UploadPic.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		driver.quit();
		
	}

}
