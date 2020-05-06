package com.selenium.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generickeywords {

	WebDriver driver;
	Properties prop;
	public void GenericKeywords() throws IOException{
		
		String path=System.getProperty("user.dir")+"//src//main//resources//Auction.properties";
		FileInputStream fs=new FileInputStream(path);
		
		prop= new Properties();
		prop.load(fs);
	}
	
	
	
	public void navigate(String url){
		driver.get(prop.getProperty(url));
	}
	
	public void Click(String locator){
		getObject(locator);
	}
	
	public void input(String locator,String data){
		getObject(locator).sendKeys(data);
	}
	
	public WebElement getObject(String locator){
		WebElement e=null;
		
		try{
		
		if(locator.endsWith("_xpath")){	
			e=driver.findElement(By.xpath(prop.getProperty(locator)));
			
		}else if(locator.endsWith("_id")){
			e=driver.findElement(By.id(prop.getProperty(locator)));
			
		}else if(locator.endsWith("_name")){
			e=driver.findElement(By.name(prop.getProperty(locator)));
			
		}else if(locator.endsWith("_linkText")){
			e=driver.findElement(By.linkText(prop.getProperty(locator)));
			
		}else if(locator.endsWith("_tagName")){
			e=driver.findElement(By.tagName(prop.getProperty(locator)));
			
		}
		}catch(Exception x){
			//report error
			x.printStackTrace();
		}
		return e;
	}
	
}
