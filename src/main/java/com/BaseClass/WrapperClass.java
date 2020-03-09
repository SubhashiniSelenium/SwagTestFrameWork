package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrapperClass {
protected WebDriver driver;
public void LaunchApp(String URL) {
	System.setProperty("webdriver.chrome.driver", "D:/OLD/Selenium/eclipse/TestswagSubha/src/test/resources/Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(URL);
}
public void quit() {
	driver.close();
}
}
