package com.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.WrapperClass;
import com.Pages.LoginPage;

public class LoginTestCase extends WrapperClass {
@BeforeClass	
public void StartApp() {
	LaunchApp("https://www.saucedemo.com/");
}
@Test
public void Loginsau() {
	LoginPage page = new LoginPage(driver);
	page.LoginSaucedemo();
	
}
@AfterClass
public void close() {
	quit();
}
}
