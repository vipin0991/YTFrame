package org.testing.Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public ChromeDriver driver;
	
	  @BeforeMethod
	  public void launch(){
		  System.setProperty("webdriver.chrome.driver", "../YTFrame/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.youtube.com/");
		  driver.manage().window().maximize();
	  }
	  
	  
	  @AfterMethod
	  public void close() throws InterruptedException {
		  Thread.sleep(5000);
		  driver.close();
	  }

}
