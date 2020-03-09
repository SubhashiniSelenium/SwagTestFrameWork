package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
WebDriver driver;
By Search=By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div[3]/select/option[2]");
//By ViewCart=By.xpath("/html/body/div/div[2]/div[1]/div[2]/a/svg/path");
public SearchPage(WebDriver driver)
{
	this.driver=driver;
}
	public void Search()
	{
		driver.findElement(Search).click();
	  // driver.findElement(ViewCart).click();
}
}
