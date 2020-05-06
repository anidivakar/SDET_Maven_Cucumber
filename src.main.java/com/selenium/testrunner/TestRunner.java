package com.selenium.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)			
@CucumberOptions(features="classpath:feature/Auction.feature",
				glue={"classpath:com.selenium.testcases"})						
public class TestRunner {

	
}
