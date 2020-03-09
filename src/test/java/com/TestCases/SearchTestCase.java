package com.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.WrapperClass;
import com.Pages.AddToCartPage;
import com.Pages.LoginPage;
import com.Pages.SearchPage;

public class SearchTestCase extends WrapperClass{
	@BeforeClass
	public void startUp (){
			LaunchApp("https://www.saucedemo.com/");
	}
	@Test(priority=1)
	public void Loginsau() throws InterruptedException {
		LoginPage page = new LoginPage(driver);
		page.LoginSaucedemo();
		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void Add() throws InterruptedException  {
	AddToCartPage pa=new AddToCartPage(driver);
	pa.AddItem();
	//pa.view();
	Thread.sleep(5000);	
	}
	@Test(priority=3)
	public void SearchAn() throws InterruptedException {
		SearchPage ga = new SearchPage(driver);
		ga.Search();
		Thread.sleep(5000);
		
	}
	@AfterClass
	public void close() {	
	quit();
	}
}
