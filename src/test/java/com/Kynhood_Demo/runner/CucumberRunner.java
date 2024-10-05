package com.Kynhood_Demo.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		features = ".\\src\\main\\resources\\com\\Kynhood_Demo\\features\\Features\\kyn.feature", 
        features="Features",
		glue = "com.Kynhood_Demo.stepdefinition", 
                 monochrome= true,
                 dryRun = false,
                
                 tags= "@Smoke or @Sanity",
                 plugin = {"pretty",
		   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class CucumberRunner extends BaseClass{
	@BeforeClass
	public static void user_enter_browser(){
		browserLaunch("chrome");
		
		
		
	}
	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}
}
