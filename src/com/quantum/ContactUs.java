package com.quantum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactUs {
	WebDriver driver = null;
	@BeforeMethod
	 @Test (priority= 1)
	  //TEST CASE NO 1
	  		public void setUp() {
	  			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAURABH\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
	  			  driver=new ChromeDriver(); 
	  			  driver.get("https://quantumitinnovation.com/");
	  			  driver.manage().window().maximize();
	  			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	  			
	  }
	@AfterMethod
	public void teardown() {
		  driver.close();
	}
	@Test (alwaysRun= true)
	  
	  public void ContactUss() throws InterruptedException  {
		
		WebElement contactuspage = driver.findElement(By.xpath("//span[normalize-space()='Contact']"));
		contactuspage.click();
		Thread.sleep(3000);
		
	    JavascriptExecutor js = (JavascriptExecutor) driver;


        js.executeScript("window.scrollBy(0,500)");
	
		WebElement Firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		Firstname.sendKeys("saurabh");
		Thread.sleep(3000);
		WebElement Lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		Lastname.sendKeys("kumbhar");
		Thread.sleep(3000);
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("saurabhkumbhar187@gmail.com");
		Thread.sleep(3000);
		WebElement Mobile = driver.findElement(By.xpath("//input[@id='phone_no']"));
		Mobile.sendKeys("7769889013");
		Thread.sleep(3000);
		WebElement Company = driver.findElement(By.xpath("//input[@id='companyName']"));
		Company.sendKeys("Quantum");
		Thread.sleep(3000);
		WebElement Enquiry = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[2]/div/div[2]/form/div[4]/div/div/select/option[2]"));
		Enquiry.click();
		Enquiry.isSelected();
		Thread.sleep(3000);
		WebElement Descriptionmessage = driver.findElement(By.xpath("//textarea[@id='message']"));
		Descriptionmessage.sendKeys("Hello, This is automated test script run for testing the contact us form from QA team...Kindly igonre this request...Thanks");
		Thread.sleep(3000);
		
		  JavascriptExecutor jss = (JavascriptExecutor) driver;


	        jss.executeScript("window.scrollBy(0,300)");
		WebElement Submit = driver.findElement(By.xpath("//button[@type='submit']"));
		Submit.click();
		Thread.sleep(2000);
		WebElement SuccessfulMessage = driver.findElement(By.xpath("//*[@id=\"toast-container\"]"));
		SuccessfulMessage.isDisplayed();
		Thread.sleep(3000);

	}      
}
