package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	ChromeDriver driver;
	Properties pr;
	
	//This constructor is for assigning value
	public Login(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
		
	}
	
	public void signin(String uname, String pass) throws InterruptedException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(pr.getProperty("SignIn"))).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(pr.getProperty("Email"))).sendKeys(uname);
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(pr.getProperty("Next"))).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(pr.getProperty("Password"))).sendKeys(pass);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath(pr.getProperty("Next"))).click();
	}
}
