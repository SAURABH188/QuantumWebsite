package com.quantum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Homepage {
	WebDriver driver = null;
	@BeforeMethod
	 @Test (priority= 1)
	  //TEST CASE NO 1
	  		public void setUp() {
	  			  System.setProperty("webdriver.chrome.driver","C:\\Users\\SAURABH\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
	  			  driver=new ChromeDriver(); 
	  			  driver.get("https://quantumitinnovation.com/");
	  			  driver.manage().window().maximize();
	  			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	  			
	  }
	@AfterMethod
	public void teardown() {
		  driver.close();
	}
	 @Test (priority= 2)
	  // Test Case 2: Verify presence of Home tab
	  public void HomepageVisibility() throws InterruptedException  {
		
		        WebElement homeLink = driver.findElement(By.cssSelector("#navbarSupportedContent > ul > li.menu-item.menu-item-type-post_type.menu-item-object-page.menu-item-1553.nav-item.active > a"));
		        Assert.assertTrue(homeLink.isDisplayed());
			
			Thread.sleep(3000);
}
	 @Test (priority= 3)
	  //Test Case 1: Verify presence of Quantum Logo
	  public void VerifyLogo() throws InterruptedException  {
		
			
			// Click Logo
			WebElement Logo= driver.findElement(By.xpath("/html/body/nav/div/div[1]/a/img"));
			Logo.click();

if(Logo.isDisplayed()) {
System.out.println("Test Case Passed: Logo is Visible");
}else {
System.out.println("Test Case Failed: Logo is not Visible");

}
}
	 @Test (priority= 4)
	  //Test Case 3: Verify presence of About Us tab
	  public void VerifyAboutUs() throws InterruptedException  {
		
			
			// Click About Us Tab
			WebElement AboutUs= driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a/span"));
			AboutUs.click();
			Thread.sleep(3000);
if(AboutUs.isDisplayed()) {
System.out.println("Test Case Passed: AboutUs is Visible");
}else {
System.out.println("Test Case Failed: AboutUs is not Visible");
Thread.sleep(3000);
}
}
	 @Test (priority= 5)
	  //Test Case 4: Verify presence of Services tab
	  public void VerifyService() throws InterruptedException  {
		
			
			// Click Service Tab
			WebElement Service= driver.findElement(By.xpath("//*[@id=\"menu-item-dropdown-1949\"]/span"));
			Service.click();
			Thread.sleep(3000);
if(Service.isDisplayed()) {
System.out.println("Test Case Passed: Service is Visible");
}else {
System.out.println("Test Case Failed: Service is not Visible");
Thread.sleep(3000);
}
}
	 @Test (priority= 6)
	  //Test Case 5: Verify presence of Portfolio tab
	  public void VerifyPortfolio() throws InterruptedException  {
		
			
			// Click Portfolio Tab
			WebElement Portfolio= driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a/span"));
			Portfolio.click();
			Thread.sleep(3000);
if(Portfolio.isDisplayed()) {
System.out.println("Test Case Passed: Portfolio is Visible");
}else {
System.out.println("Test Case Failed: Portfolio is not Visible");
Thread.sleep(3000);
}
}
	 @Test (priority= 7)
	  //Test Case 6: Verify presence of Contact tab
	  public void VerifyContact() throws InterruptedException  {
		
			
			// Click Contact Tab
			WebElement Contact= driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a/span"));
			Thread.sleep(3000);
			Contact.click();
			Thread.sleep(3000);
if(Contact.isDisplayed()) {
System.out.println("Test Case Passed: Contact is Visible");
}else {
System.out.println("Test Case Failed: Contact is not Visible");
Thread.sleep(3000);
}
}
	 @Test (priority= 8)
	  //Test Case 7: Verify functionality of Dark Mode Tab
	  public void DarkMode() throws InterruptedException  {
		
			
			// Click DarkMode Tab
			WebElement DarkMode= driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/div/div[3]/div/label/img"));
			Thread.sleep(3000);
			DarkMode.click();
			Thread.sleep(3000);
if(DarkMode.isDisplayed()) {
System.out.println("Test Case Passed: DarkMode is Visible");
}else {
System.out.println("Test Case Failed: DarkMode is not Visible");
Thread.sleep(3000);
}
}
	 @Test (priority= 9)
	  //Test Case 8: Verify Dark Mode is applied when Dark Mode Tab clicked
	  public void DarkModee() throws InterruptedException  {
		
			
			// Click DarkMode Tab
			WebElement DarkMode= driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/div/div[3]/div/label/img"));
			Thread.sleep(3000);
			DarkMode.click();
			Thread.sleep(3000);
if(DarkMode.isDisplayed()) {
System.out.println("Test Case Passed: DarkMode is Visible");
}else {
System.out.println("Test Case Failed: DarkMode is not Visible");
Thread.sleep(3000);
}
}
	 @Test (priority= 10)
	  // Test Case11: Verify Home tab redirects to homepage
	  public void HomeTab() throws InterruptedException  {
		
			WebElement hometab=driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a/span"));
			hometab.isDisplayed();
			
			
			Thread.sleep(3000);
}
	 
	 @Test (priority= 11)
	  //Test Case 12: Verify About Us tab redirects to About Us page
	  public void AboutUs() throws InterruptedException  {
		
			
			// Click About Us Tab
			WebElement AboutUs= driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a/span"));
			AboutUs.click();
			Thread.sleep(3000);
if(AboutUs.isDisplayed()) {
System.out.println("Test Case Passed: AboutUs is Visible");
}else {
System.out.println("Test Case Failed: AboutUs is not Visible");
Thread.sleep(3000);
}
}
	 @Test (priority= 12)
	  //Test Case 13: Verify Services tab redirects to Services page
	  public void ServiceTab() throws InterruptedException  {
		
			
			// Click Service Tab
			WebElement Service= driver.findElement(By.xpath("//*[@id=\"menu-item-dropdown-1949\"]/span"));
			Service.click();
			Thread.sleep(3000);
if(Service.isDisplayed()) {
System.out.println("Test Case Passed: Service is Visible");
}else {
System.out.println("Test Case Failed: Service is not Visible");
Thread.sleep(3000);
}
}
	 @Test (priority= 13)
	  //Test Case 14: Verify Portfolio tab redirects to Portfolio page
	  public void Portfoliotab() throws InterruptedException  {
		
			
			// Click Portfolio Tab
			WebElement Portfolio= driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a/span"));
			Portfolio.click();
			Thread.sleep(3000);
if(Portfolio.isDisplayed()) {
System.out.println("Test Case Passed: Portfolio is Visible");
}else {
System.out.println("Test Case Failed: Portfolio is not Visible");
Thread.sleep(3000);
}
}
	 @Test (priority= 14)
	  //Test Case 15: Verify Contact tab redirects to Contact page
	  public void Contact() throws InterruptedException  {
		
			
			// Click Contact Tab
			WebElement Contact= driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a/span"));
			Thread.sleep(3000);
			Contact.click();
			Thread.sleep(3000);
if(Contact.isDisplayed()) {
System.out.println("Test Case Passed: Contact is Visible");
}else {
System.out.println("Test Case Failed: Contact is not Visible");
Thread.sleep(3000);
}
}

	 @Test (priority= 15)
	  //Test Case 16: Verify Banner Image visibility on Homepage
	  public void Banner() throws InterruptedException  {
		
			
			// Verify Banner Image
			WebElement Banner = driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[1]"));
			Thread.sleep(3000);
			Banner.click();
			Thread.sleep(3000);
if(Banner.isDisplayed()) {
System.out.println("Test Case Passed: Banner is Visible");
}else {
System.out.println("Test Case Failed: Banner is not Visible");
Thread.sleep(3000);
}
}
	 