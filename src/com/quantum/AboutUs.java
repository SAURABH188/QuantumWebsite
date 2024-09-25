package com.quantum;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutUs {
	private WebDriver driver;
	private By title = By.tagName("h1");
	public String getTitleText() {
        return driver.findElement(title).getText();
	}
	@BeforeMethod
	  		public void setUp() {
	  			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAURABH\\Desktop\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	  			  driver=new ChromeDriver(); 
	  			  driver.get("https://quantumitinnovation.com/");
	  			  driver.manage().window().maximize();
	  			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  			 driver.findElement(By.xpath("//span[normalize-space()='About Us']")).click();
	  	
	  }
	@AfterMethod
	public void teardown() {
		  driver.close();
	}
	
	 @Test (alwaysRun =true)
	 public void HomepageVisibility() throws InterruptedException  {
		 driver.findElement(By.xpath("//span[normalize-space()='About Us']")).click();
		 AboutUs aboutUsPage = new AboutUs();

		 Assert.assertEquals("About Us", aboutUsPage.getTitleText());

	    }

	    
	    }


