package com.quantum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Homepage {
	WebDriver driver = null;
	@BeforeSuite
	 @Test (priority= 1)
	  //TEST CASE NO 1
	  		public void setUp() {
	  			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAURABH\\Desktop\\chromedriver-win64\\chromedriver.exe");
	  			  driver=new ChromeDriver(); 
	  			  driver.get("https://quantumit.vercel.app/");
	  			  driver.manage().window().maximize();
	  			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	  			
	  }
	@AfterSuite
	public void teardown() {
		  driver.close();
	}
	 @Test (priority= 2)
	  
	  public void HomepageVisibility() throws InterruptedException  {
		
			WebElement hometab=driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a/span"));
			hometab.isDisplayed();
			
			
			Thread.sleep(3000);
}
}
