package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.BaseClass;
import org.testng.annotations.Test;

public class TC6 extends BaseClass{
	  
  @Test
  public void playandlike() throws InterruptedException{
	  driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("testingdata98720");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[text()='Next']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("Test987(*&");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='Next']")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//yt-formatted-string[@id='video-title']")).click();
	  Thread.sleep(10000);
	  Actions action = new Actions(driver);
	  action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//yt-formatted-string[@id='simplebox-placeholder']")).click();
	  Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[@id='contenteditable-root']")).sendKeys("Awesome");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//tp-yt-paper-button[@aria-label = 'Comment']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//img[@alt = 'Avatar image']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']")).click();
	  
  }
  

}
