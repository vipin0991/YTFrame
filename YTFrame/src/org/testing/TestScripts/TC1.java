package org.testing.TestScripts;

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
  public void method2(){
	  
  }

  @AfterMethod
  public void method3() {
	  
  }
}
