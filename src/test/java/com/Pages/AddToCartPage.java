package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {
	WebDriver driver;
	
	By AddToCart=By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button");
	By viewCart=By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
	
	public AddToCartPage(WebDriver driver) {
		this.driver=driver;
	}	
		public void AddItem() {
			driver.findElement(AddToCart).click();
			
		}
		public void view() {
			driver.findElement(viewCart).click();
		}
	}

