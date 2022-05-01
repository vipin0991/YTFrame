package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.testing.Base.BaseClass;
import org.testng.annotations.Test;

public class TC3 extends BaseClass {
	
  @Test
  public void subscription() throws InterruptedException{
	  driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("testingdata98720");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[text()='Next']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("Test209@)(");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='Next']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//yt-formatted-string[text() = 'Subscriptions']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//img[@alt = 'Avatar image']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']")).click();
	  
  }

}
