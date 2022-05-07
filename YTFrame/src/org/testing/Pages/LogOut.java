package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOut {
	ChromeDriver driver;
	Properties pr;
	
	//This constructor is for assigning value
	public LogOut(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}
	
	public void signout() throws InterruptedException {
		  Thread.sleep(2000);
		  driver.findElement(By.xpath(pr.getProperty("Avatar"))).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath(pr.getProperty("SignOut"))).click();
	}
}
