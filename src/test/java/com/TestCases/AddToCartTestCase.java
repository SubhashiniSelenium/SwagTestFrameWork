package com.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.WrapperClass;
import com.Pages.AddToCartPage;
import com.Pages.LoginPage;

public class AddToCartTestCase extends WrapperClass{
	@BeforeClass
	public void StartApp() {
			LaunchApp("https://www.saucedemo.com/");
		}	

	@Test
	public void Add()  {
	AddToCartPage pa=new AddToCartPage(driver);
	pa.AddItem();
	pa.view();
	}
	
	@AfterClass
	public void close() {
		quit();
	}
			
		
	}
	


