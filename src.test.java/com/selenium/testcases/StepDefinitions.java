package com.selenium.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class StepDefinitions {
static WebDriver driver; 	
		
	 	@Given("^I want to launch the \"([^\"]*)\" browser$")				
	    public void launch_Browser(String browsertype) throws Throwable							
	    {		
	       	try{
	 		if (browsertype.equals("Chrome")){
	 			System.setProperty("webdriver.chrome.driver", "D:\\Java-SW\\BrowserDrivers\\chromedriver.exe");
	 			
	 			driver = new ChromeDriver();

	 			}else
	 				
		 			if (browsertype.equals("Mozilla")){
		 				//System.setProperty("webdriver.gecko.driver", "D:\\Browserdriver\\New folder\\geckodriver.exe");
		 					
		 				driver = new FirefoxDriver();
		 				
		 					}else
		 		 				
		 			 			if (browsertype.equals("IE")){
		 			 				System.setProperty("webdriver.ie.driver", "D:\\Java-SW\\BrowserDrivers\\IEDriverServer.exe");
		 			 					
		 			 				driver = new InternetExplorerDriver();
		 			 				
		 			 					}
		 			
	 			driver.manage().window().maximize();
	 			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 			
	       	}catch(Exception e) {
	       		e.printStackTrace();
	       	}
	 		
	    }	 
	 	
	 	
	 	@When ("^Open AuctionOnline App$")				
	    public void open_AuctionOnline_App(){	
	 		try{
	 		driver.get("http://localhost:8080/Online-Application/");
	 	
	 		}catch(Exception e) {
	       		e.printStackTrace();
	       	}
	    }
	    
	
	    @And ("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")				
	    public void upen_UserCredentials(String username, String password){	
	    try{
	 	driver.findElement(By.xpath("")).sendKeys(username);
	 	
	 	driver.findElement(By.xpath("")).sendKeys(password);
	    	}catch(Exception e) {
       		e.printStackTrace();
       	}
	 }
	    
	    @When ("^click on Submit Button$")				
	    public void click_SubmitButton(){	
	    try{
	    	driver.findElement(By.xpath("")).click();
	    }catch(Exception e) {
       		e.printStackTrace();
	    }
	}
}
