package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	
	ChromeDriver driver;
	Properties pr;
	
	//This constructor is for assigning value
	public HomePage(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
		
	}
	
	public void clickTrending() throws InterruptedException {
		  Thread.sleep(6000);
		  driver.findElement(By.xpath(pr.getProperty("Explore"))).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath(pr.getProperty("Trending"))).click();
		  /**/
	}
	
	public void clickHistory() throws InterruptedException {
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(pr.getProperty("History"))).click();
	}
	
	public void clickSubscription() throws InterruptedException {
		  Thread.sleep(4000);
		  driver.findElement(By.xpath(pr.getProperty("Subscriptions"))).click();
	}

	public void videoPlayLike() throws InterruptedException {
		 Thread.sleep(5000);
		  driver.findElement(By.xpath(pr.getProperty("Playvideo"))).click();
		  Thread.sleep(4000);
		  driver.findElement(By.xpath(pr.getProperty("Likevideo"))).click();
	}
	
	public void videoPlaySubscribe() throws InterruptedException {
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(pr.getProperty("Playvideo"))).click();
		  Thread.sleep(4000);
		  driver.findElement(By.xpath(pr.getProperty("Subscribe"))).click();
	}
	
	public void comment() throws InterruptedException {
		Thread.sleep(5000);
		  driver.findElement(By.xpath(pr.getProperty("Playvideo"))).click();
		  Thread.sleep(10000);
		  Actions action = new Actions(driver);
		  action.sendKeys(Keys.PAGE_DOWN).build().perform();
		  Thread.sleep(4000);
		  driver.findElement(By.xpath(pr.getProperty("Placeholder"))).click();
		  Thread.sleep(4000);
		 driver.findElement(By.xpath(pr.getProperty("Commentfield"))).sendKeys("Awesome");
		  Thread.sleep(4000);
		  driver.findElement(By.xpath(pr.getProperty("Commentbutton"))).click();
	}
	
	public void watchLater() throws InterruptedException {
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(pr.getProperty("Watchlater"))).click();
	}
	
	public void clicklibrary() throws InterruptedException {
		  Thread.sleep(6000);
		  driver.findElement(By.xpath(pr.getProperty("Library"))).click();
		
	}

}
