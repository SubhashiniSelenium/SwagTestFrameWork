package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
By username = By.id("user-name");
By password = By.id("password");
By Loginbtn = By.className("btn_action");
public LoginPage(WebDriver driver) {
	this.driver=driver;
}
public void LoginSaucedemo() {
	driver.findElement(username).sendKeys("standard_user");
	driver.findElement(password).sendKeys("secret_sauce");
	driver.findElement(Loginbtn).click();
}
}
