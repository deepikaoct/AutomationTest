package com.E2E.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import resourcesqa.PageObjects;


public class HomePageMethod extends BaseClass {
	
	private static final boolean True = true;
	private static final boolean False = false;

	@Test
	public void basePageNavigation() throws IOException, InterruptedException {
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\deepi\\my-E2E\\src\\test\\java\\data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String username = prop.getProperty("user_name");
		String password= prop.getProperty("pass_word");
		String url = prop.getProperty("url");
		driver=initializeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get(url);
	    PageObjects page = new PageObjects(driver);
	    //page.coursesTab();

	    //String  expectedTitle ="QAClick Academy | All Courses";
	   // Assert.assertEquals(actualTitle, expectedTitle);
	    
		page.popup();
		page.login();
		page.email(username);
		page.passWord(password);
		page.submit();
		Thread.sleep(2000);
	    page.linkChecks();
		/*int Text_Box = driver.findElements(By.xpath("//input[@id='search-courses']")).size();
		if (Text_Box>0) {
			Assert.assertTrue(False);	
			
		}
		
		else {
			Assert.assertTrue(True);
		}*/
		
		// js.executeScript("window.scrollBy(0,1000)");
		//page.createAccountMethod();
		
		
		
		
		
		
		
		
	}







}


