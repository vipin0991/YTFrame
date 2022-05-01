package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
	
	ChromeDriver driver;
	
  @BeforeMethod
  public void method1(){
	  System.setProperty("webdriver.chrome.driver", "../YTFrame/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.youtube.com/");
	  driver.manage().window().maximize();
  }
  
  @Test
  public void method2() throws InterruptedException{
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
	  driver.findElement(By.xpath("//yt-formatted-string[text()='Explore']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//yt-formatted-string[text()='Trending']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//img[@alt = 'Avatar image']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']")).click();
	  
  }

  @AfterMethod
  public void method3() throws InterruptedException {
	  Thread.sleep(10000);
	  driver.close();
  }
}
