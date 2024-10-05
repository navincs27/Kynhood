package com.Kynhood_Demo.stepdefinition;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class Hooks extends BaseClass{
	 
	@Before
	public void before() {
		System.out.println("code started");
	}

	@After
	public void after(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			final byte[] scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(scr, "image/png",scenario.getName() );
		
		
		}
		
	}
}
